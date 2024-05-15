package com.example.pitom_and_ramses;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
   private int work,des;

    public int getWork() {
        return work;
    }

    public int getDes() {
        return des;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MyClass m = (MyClass) getIntent().getSerializableExtra("mykey");
        System.out.println(m);
        work=m.getS(0);
        des=m.getS(1);
        Building building= new Building(this, null ,work,des);
        ViewGroup main=findViewById(R.id.main2);
        main.addView(building);
    }

}
