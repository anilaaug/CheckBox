package com.example.anila.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox b1;
    CheckBox b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.checkBox3);
        b2=findViewById(R.id.checkBox4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.isChecked())
                    Toast.makeText(MainActivity.this, "Yellow selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Yellow Unselected", Toast.LENGTH_SHORT).show();
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.isChecked())
                    Toast.makeText(MainActivity.this, "Red Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Red Unselected", Toast.LENGTH_SHORT).show();
            }
        });



    }

}
