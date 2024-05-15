package com.example.pitom_and_ramses;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Random;

public class Monitor {
    private ArrayList<Brick> bricks = new ArrayList<>();
    private ArrayList<Brick>newBricks=new ArrayList<>();
    private int c= Color.RED;

    public ArrayList<Brick> getBricks() {
        return newBricks;
    }
    private Random rnd = new Random();
    private int i=0;
    public synchronized void create() {

        while (newBricks.size() >= 32) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

       bricks.add( new Brick(0.f, 1450.f, 200.f, 1300.f, c));
       bricks.add( new Brick(230,1450,440, 1300, c));
       bricks.add( new Brick(470, 1450, 680, 1300, c));
       bricks.add(new Brick(710, 1450, 920, 1300, c));

        bricks.add(new Brick(0, 1120, 200, 1270,c ));
        bricks.add(new Brick(230, 1120, 440, 1270,c ));
        bricks.add(new Brick(470, 1120, 680, 1270,c ));
        bricks.add( new Brick(710, 1120, 920, 1270,c ));

        bricks.add( new Brick(0, 940, 200, 1090, c));
        bricks.add(new Brick(230, 940, 440, 1090, c));
        bricks.add(new Brick(470, 940, 680, 1090, c));
        bricks.add(new Brick(710, 940, 920, 1090, c));

        bricks.add(new Brick(0, 760, 200, 910, c));
        bricks.add(new Brick(230, 760, 440, 910, c));
        bricks.add(new Brick(470, 760, 680, 910, c));
        bricks.add( new Brick(710, 760, 920, 910, c));

        bricks.add(new Brick(0, 580, 200, 730, c));
        bricks.add(new Brick(230, 580, 440, 730, c));
        bricks.add(new Brick(470, 580, 680, 730, c));
        bricks.add( new Brick(710, 580, 920, 730, c));

        bricks.add(new Brick(0, 400, 200, 550, c));
        bricks.add(new Brick(230, 400, 440, 550, c));
        bricks.add(new Brick(470, 400, 680, 550, c));
        bricks.add( new Brick(710, 400, 920, 550, c));

        bricks.add(new Brick(0, 220, 200, 370, c));
        bricks.add(new Brick(230, 220, 440, 370, c));
        bricks.add(new Brick(470, 220, 680, 370, c));
        bricks.add( new Brick(710, 220, 920, 370, c));

        bricks.add(new Brick(0, 40, 200, 190, c));
        bricks.add(new Brick(230, 40, 440, 190, c));
        bricks.add(new Brick(470, 40, 680, 190, c));
        bricks.add( new Brick(710, 40, 920, 190, c));

        if (i<=32) {
            newBricks.add(bricks.get(i));
            i++;
        }
        else i=0;
        notifyAll();
    }
    public synchronized void destrate() {
        while (newBricks.size() == 0) {
                System.out.println("emptyyyyyyyyyyy");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            int index= rnd.nextInt(newBricks.size());
            System.out.println("index  "+index);

        newBricks.remove(index);
            notify();
        }
}