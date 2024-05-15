package com.example.pitom_and_ramses;

import java.io.Serializable;
import java.util.ArrayList;

public class MyClass implements Serializable {
    private ArrayList<Integer> myArray;

    public MyClass() {

        this.myArray = new ArrayList<>();
    }

    public void add(int s) {

        myArray.add(s);
    }

    public int getS(int index) {
        return myArray.get(index);
    }

    @Override
    public String toString() {
        return "com.example.myapplication.MainActivity.MyClass{" +
                "myArray=" + myArray +
                '}';
    }
}
