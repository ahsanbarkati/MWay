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


        Bundle bundle =getIntent().getExtras();
        String mode=bundle.getString("n");
        if(mode.equalsIgnoreCase("attack")) {
            flag=1;
            turn=-1;
            Toast.makeText(this, "attack", Toast.LENGTH_SHORT).show();
        }
        else {turn=1;
             flag=0;}
        initialise1();
        draw();

    }

    public boolean onTouchEvent(MotionEvent event) {
        float X=0,Y=0,h;
int i,j;
        if(k==0){
            listen();k++;}

            if(event.getActionMasked()==MotionEvent.ACTION_DOWN) {
                X = event.getX();
                Y = event.getY();

                boolean ammended;
               if(flag==1){
                   if(turn==-1)
                   {   ammended=ammend(X,Y);
                       // if(ammended)trysend(X,Y);
                   }
                   if(turn==1&&stx!=null){
                        i=Integer.parseInt(stx);
                        j=Integer.parseInt(sty);
                       state[i][j]=1-turn;
                   }
               }
                if(flag==0){
                    if(turn==1){
                      ammended=ammend(X,Y);
                        //if(ammended)trysend(X,Y);
                    }
                    if(turn==-11&&stx!=null){
                        i=Integer.parseInt(stx);
                        j=Integer.parseInt(sty);
                        state[i][j]=1-turn;
                    }
                }
                //else if(turn==-1&&stx!=null) ammend(Float.parseFloat(stx),Float.parseFloat(sty));
                //if(ammended)send(X,Y); //this will send it to db

                //while(stx==null)

                //listen();


                Toast.makeText(this, stx + " " + sty, Toast.LENGTH_SHORT).show();


                //Toast.makeText(this, stx + " " + sty, Toast.LENGTH_SHORT).show();
                //if(stx!=null)


                draw();
            }


        return true;
    }
}

