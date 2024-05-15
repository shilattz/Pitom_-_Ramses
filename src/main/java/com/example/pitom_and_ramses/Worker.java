package com.example.pitom_and_ramses;

public class Worker extends Thread{
   private Monitor m;
   public Worker(Monitor m){
       this.m=m;
   }
    public void run(){
       while (true){
           this.m.create();
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
