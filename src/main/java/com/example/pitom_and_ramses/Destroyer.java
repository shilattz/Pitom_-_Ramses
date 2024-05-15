package com.example.pitom_and_ramses;

public class Destroyer extends Thread {
    private Monitor m;
    public Destroyer(Monitor m){
        this.m=m;
    }
    public void run(){
        while (true){
            this.m.destrate();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
