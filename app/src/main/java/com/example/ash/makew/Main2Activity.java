package com.example.ash.makew;


import android.os.Bundle;

import android.graphics.Point;



import android.view.Display;
import android.view.MotionEvent;
import android.view.View;

import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class Main2Activity extends functions  {
int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        cx=width/7;
        cy=height/7;
        listenchk=1;
       //listen();


        initialise1();
        draw();

    }

    public boolean onTouchEvent(MotionEvent event) {
        float X = event.getX();
        float Y = event.getY();
        boolean  tell=ammend(X,Y);
        ag=again(X,Y);
        draw();
        return true;
    }
}

