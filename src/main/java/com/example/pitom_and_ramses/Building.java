package com.example.pitom_and_ramses;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class Building extends View {

    private int c = Color.RED;
    private ArrayList<Brick> bricks = new ArrayList<>();
    private Monitor mon = new Monitor();

    public Building(Context context, AttributeSet attrs, int work, int des) {
        super(context);

        for (int i = 0; i < work; i++) {
            Worker worker = new Worker(mon);
            worker.start();
        }
        for (int i = 0; i < des; i++) {
            Destroyer destroyer = new Destroyer(mon);
            destroyer.start();
        }

        Thread thread = new Thread() {
            public void run() {
                try {
                    while (true) {
                        bricks = mon.getBricks();
                        postInvalidate();
                        Thread.sleep(500);
                    }
                } catch (Exception e) {

                }
            }
        };
        thread.start();
    }

    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        Paint p = new Paint();
        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.RED);
        Paint p1 = new Paint();
        p1.setStyle(Paint.Style.STROKE);
        p1.setColor(Color.WHITE);
        p1.setStrokeWidth(8);

        try {
            for (Brick b : bricks) {
                canvas.drawRect(b.getX1(), b.getY1(), b.getX2(), b.getY2(), p);
                canvas.drawRect(b.getX1(), b.getY1(), b.getX2(), b.getY2(), p1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

