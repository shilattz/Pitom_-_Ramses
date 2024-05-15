//Name: Shilat Tzur
//ID: 213660210
package com.example.pitom_and_ramses;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText workerText;
    private EditText destroyersText;
    MyClass myArray = new MyClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       workerText = findViewById(R.id.editTextNumber);
       destroyersText = findViewById(R.id.editTextNumber2);

       if(workerText==null)
        btn = (Button) findViewById(R.id.start);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Integer.parseInt(workerText.getText().toString())<0 || Integer.parseInt(workerText.getText().toString())>10
                ||Integer.parseInt(destroyersText.getText().toString())<0 || Integer.parseInt(destroyersText.getText().toString())>10)
                    Toast.makeText(MainActivity.this, "Please enter a number between 1-10", Toast.LENGTH_SHORT).show();
                else {
                    myArray.add(Integer.parseInt(workerText.getText().toString()));
                    myArray.add(Integer.parseInt(destroyersText.getText().toString()));

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("mykey", myArray);
                    startActivity(intent);
                }
            }
        });

    }
    }
