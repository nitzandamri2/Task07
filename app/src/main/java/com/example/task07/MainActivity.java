package com.example.task07;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClick = findViewById(R.id.buttonClick);
        ImageView imageView = findViewById(R.id.imageView);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = (int) (Math.random() * 3) + 1;
                buttonClick.setText("" + num);
                if (num == 1) {
                    imageView.setImageResource(R.drawable.img);
                }
                else if (num == 2) {
                    imageView.setImageResource(R.drawable.img_1);
                }
                else if (num == 3) {
                    imageView.setImageResource(R.drawable.img_2);
                }
            }
        });
    }
}