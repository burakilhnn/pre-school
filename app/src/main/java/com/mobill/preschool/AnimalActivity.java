package com.mobill.preschool;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity {

    private Accelerometer accelerometer;
    private Gyroscope gyroscope;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        imageView = (ImageView) findViewById(R.id.imageView2);

        accelerometer = new Accelerometer(this);
        gyroscope = new Gyroscope(this);

        /*accelerometer.setListener(new Accelerometer.Listener() {
            @Override
            public void onTranslation(float tx, float ty, float tz) {
                if(tx>1.0f){
                    textView.setText("");

                } else if(tx < -1.0f){
                    textView.setText("");
                }

            }
        }); */

        gyroscope.setListener(new Gyroscope.Listener() {
            @Override
            public void onRotation(float rx, float ry, float rz) {
                if(rz > 1.0f){

                    imageView.setImageResource(R.drawable.cat);

                } else if(rz < -1.0f){
                    imageView.setImageResource(R.drawable.dog);

                }

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        accelerometer.register();
        gyroscope.register();
    }

    @Override
    protected void onPause() {
        super.onPause();

        accelerometer.unregister();
        gyroscope.unregister();
    }
}