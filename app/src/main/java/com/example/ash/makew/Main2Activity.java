package com.example.ash.makew;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.MediaPlayer;

import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference xcor = database.getReference("x");
    DatabaseReference ycor = database.getReference("y");


    int state[][]=new int [80][80];
    int c=1;
    int width, height;
    float cx,cy;
    int turn=-1;
    int x=200,y=100;
    int p,q;
    boolean ag;

    public void initialise4()
    {int i,j;
        int[][] in=new int[8][8];
        for(i=0;i<80;i++)
            for(j=0;j<80;j++)
                state[i][j]=5;

        for(p=0;p<8;p++)
            for(q=0;q<8;q++)
                mat[p][q]=0;
        in[0][0]=randInt(1,6);

        //Arrays.sort()
        state[3][10]=1;
        state[3][13]=1;
        state[3][16]=1;
        state[60][73]=1;
        state[63][73]=1;
        state[66][73]=1;
        //-------------------------------- NOW randwomize
        //state[10][20]=1;
        state[10][13]=1;
        state[13][23]=1;
        state[13][16]=1;
        state[16][26]=1;
        // state[20][50]=1;
        state[20][31]=1;
        state[20][23]=1;
        state[23][31]=1;
        state[23][42]=1;
        state[23][34]=1;
        state[23][26]=1;
        state[26][34]=1;
        state[26][56]=1;
        state[31][42]=1;
        state[34][53]=1;
        state[34][45]=1;
        state[42][50]=1;
        state[42][53]=1;
        state[45][53]=1;
        state[45][56]=1;
        //state[50][60]=1;
        state[50][53]=1;
        state[53][63]=1;
        state[53][56]=1;
        state[60][63]=1;
        state[63][66]=1;
        state[56][66]=1;
        state[56][63]=1;
        state[50][63]=1;
        state[10][23]=1;
        state[16][23]=1;





    }



    public void initialise3()
    {int i,j;
        int[][] in=new int[8][8];
        for(i=0;i<80;i++)
            for(j=0;j<80;j++)
                state[i][j]=5;

        for(p=0;p<8;p++)
            for(q=0;q<8;q++)
                mat[p][q]=0;
        in[0][0]=randInt(1,6);

        //Arrays.sort()
        state[3][12]=1;
        state[3][14]=1;
        state[3][16]=1;
        state[62][73]=1;
        state[64][73]=1;
        state[66][73]=1;
        //-------------------------------- NOW randwomize
        state[11][20]=1;
        state[11][23]=1;
        state[11][14]=1;
        state[14][23]=1;
        state[14][25]=1;
        state[14][16]=1;
        state[16][25]=1;
        state[20][31]=1;
        state[20][23]=1;
        state[23][31]=1;
        state[23][34]=1;
        state[23][25]=1;
        state[25][34]=1;
        state[25][36]=1;
        state[31][42]=1;
        state[31][40]=1;
        state[34][42]=1;
        state[34][45]=1;
        state[36][45]=1;
        state[40][42]=1;
        state[40][50]=1;
        state[42][50]=1;
        state[42][53]=1;
        state[42][45]=1;
        state[45][55]=1;
        state[45][53]=1;
        state[50][62]=1;
        state[50][53]=1;
        state[53][62]=1;
        state[53][64]=1;
        state[53][55]=1;
        state[55][64]=1;
        state[55][66]=1;
        state[62][64]=1;
        state[64][66]=1;





    }


    public void initialise2()
    {int i,j;
        int[][] in=new int[8][8];
        for(i=0;i<80;i++)
            for(j=0;j<80;j++)
                state[i][j]=5;

        for(p=0;p<8;p++)
            for(q=0;q<8;q++)
                mat[p][q]=0;
        in[0][0]=randInt(1,6);

        //Arrays.sort()
        state[3][10]=1;
        state[3][14]=1;
        state[3][13]=1;
        state[62][73]=1;
        state[63][73]=1;
        state[66][73]=1;
        //-------------------------------- NOW randwomize
        state[10][21]=1;
        state[10][13]=1;
        state[13][22]=1;
        state[13][25]=1;
        state[14][25]=1;
        state[21][30]=1;
        state[22][30]=1;
        state[22][33]=1;
        state[22][25]=1;
        state[25][34]=1;
        state[25][36]=1;
        state[30][41]=1;
        state[30][33]=1;
        state[33][42]=1;
        state[34][42]=1;
        state[34][45]=1;
        state[34][36]=1;
        state[36][45]=1;
        state[41][50]=1;
        state[41][42]=1;
        state[42][50]=1;
        state[45][55]=1;
        state[42][53]=1;
        state[42][45]=1;
        state[45][55]=1;
        state[45][56]=1;
        state[50][63]=1;
        state[50][62]=1;
        state[50][53]=1;
        state[53][63]=1;
        state[53][55]=1;
        state[55][63]=1;
        state[55][66]=1;
        state[56][66]=1;
        state[62][63]=1;



    }



    public void initialise1()
    {int i,j;
        int[][] in=new int[8][8];
        for(i=0;i<80;i++)
            for(j=0;j<80;j++)
                state[i][j]=5;

        for(p=0;p<8;p++)
            for(q=0;q<8;q++)
                mat[p][q]=0;
        in[0][0]=randInt(1,6);

        //Arrays.sort()
        state[3][12]=1;
        state[3][14]=1;
        state[3][15]=1;
        state[62][73]=1;
        state[63][73]=1;
        state[66][73]=1;
        //-------------------------------- NOW randwomize
        state[12][21]=1;
        state[12][22]=1;
        state[14][22]=1;
        state[14][23]=1;
        state[15][23]=1;
        state[15][26]=1;
        state[21][30]=1;
        state[22][32]=1;
        state[23][32]=1;
        state[23][34]=1;
        state[26][34]=1;
        state[26][46]=1;
        state[30][51]=1;
        state[30][42]=1;
        state[32][42]=1;
        state[32][45]=1;
        state[34][45]=1;
        state[34][46]=1;
        state[42][51]=1;
        state[45][51]=1;
        state[45][63]=1;
        state[45][55]=1;
        state[46][55]=1;
        state[46][66]=1;
        state[51][62]=1;
        state[51][63]=1;
        state[55][63]=1;
        state[55][66]=1;




        //----------------- new edits
        state[21][22]=1;
        state[23][26]=1;
        state[30][32]=1;
        state[32][34]=1;
        state[42][45]=1;
        state[45][46]=1;
        state[62][63]=1;
        state[63][66]=1;


    }



    public boolean whitewon()
    {
        int m,n,flag=0;
        for(m=0;m<80;m++)
        {
            for(n=0;n<80;n++)
            {
                if(state[m][n]==1){
                    flag=1;break;}
            }
            if(flag==1)
                break;
        }
        if(flag==0)
            return true;
        else return false;
    }


    int[][] mat=new int[8][8];
    public boolean what(){

        mat[0][3]=1;
        for(p=0;p<80;p++)
            for(q=0;q<80;q++){
                if(state[p][q]==2&&mat[p/10][p%10]==1)
                    mat[q/10][q%10]=1;
                if(state[p][q]==2&&mat[q/10][q%10]==1)
                    mat[p/10][p%10]=1;
            }
        if(mat[7][3]==1)return true;
        else return false;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int k,l;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // dref= FirebaseDatabase.getInstance().getReference();
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        cx=width/7;
        cy=height/7;


       int randnum=randInt(1,4);
        if(randnum==1)
            initialise1();
        if(randnum==2)
            initialise2();
        if(randnum==3)
            initialise3();
       if(randnum==4)
           initialise4();



        draw();







    }
    @Override
    public void onWindowFocusChanged(boolean hasFocas){
        super.onWindowFocusChanged(hasFocas);
        View decorView=getWindow().getDecorView();
        if(hasFocas){
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    }
    public static int randInt(int min, int max) {

        Random rand=new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    public void draw(){
        int i,j;

        ImageView drawingImageView = (ImageView) this.findViewById(R.id.D);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);

        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bg),0,0,null);

        //Line bnn gyaaa
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(4);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(4);
        paint.setTextSize(100);
        if(what()){


            Thread timer = new Thread() {
                public void run(){
                    try {

                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            timer.start();

            Bitmap b=BitmapFactory.decodeResource(getResources(), R.drawable.blue);
            canvas.drawBitmap(b,100, 200, paint);
            if(ag){
            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);}
        }
        else if(whitewon())
        {
            Thread timer = new Thread() {
                public void run(){
                    try {

                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            timer.start();
            canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bg),0,0,null);
            Bitmap b1=BitmapFactory.decodeResource(getResources(), R.drawable.white);
            canvas.drawBitmap(b1,100, 200, paint);
            if(ag){
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);}
            //Intent intent = new Intent(this,Main4Activity.class);
            //startActivity(intent);
        }

        if(!what()&&!whitewon()) {
            for (i = 0; i < 80; i++)
                for (j = 0; j < 80; j++) {
                    if (state[j][i] == 1) {
                        paint.setColor(Color.BLACK);
                        paint.setStrokeWidth(7);
                        canvas.drawLine(j % 10 * cx, j / 10 * cy, i % 10 * cx, i / 10 * cy, paint);
                        //canvas.drawCircle((j%10 * cx)/2+(i%10 * cx)/2,(j/10 * cy)/2+(i/10 * cy)/2,20,paint);
                    } else if (state[j][i] == 0) {
                        paint.setColor(Color.WHITE);
                        paint.setStrokeWidth(7);
                        canvas.drawLine(j % 10 * cx, j / 10 * cy, i % 10 * cx, i / 10 * cy, paint);
                    } else if (state[j][i] == 2) {
                        paint.setColor(Color.BLUE);
                        paint.setStrokeWidth(7);
                        canvas.drawLine(j % 10 * cx, j / 10 * cy, i % 10 * cx, i / 10 * cy, paint);
                    }

                }

            Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.blue);

            paint.setStrokeWidth(5);
            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(4);
            paint.setTextSize(100);
            for (i = 0; i < 80; i++) {
                for (j = 0; j < 80; j++) {
                    if (state[j][i] == 1) {
                        //canvas.drawBitmap(b,i % 10 * cx-10, i / 10 * cy-10, paint);
                        //canvas.drawBitmap(b,j % 10 * cx-10, j / 10 * cy-10, paint);
                        canvas.drawCircle(i % 10 * cx, i / 10 * cy, 8, paint);
                        canvas.drawCircle(j % 10 * cx, j / 10 * cy, 8, paint);
                    }
                }
            }
        }

    }
    public class cor{
        float X,Y;
    }
    public boolean ammend(float X,float Y){
        int i,j;


        for(i=0;i<80;i++)
            for(j=0;j<80;j++)
                if(state[j][i]==1&&chk(j%10 * cx,j/10 * cy,i%10 * cx,i/10 * cy,X,Y)){
                    state[j][i]=1-turn;
                    turn = turn * -1;
                    if(state[j][i]==2){
                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.click);mp.start();}
                    else{
                        MediaPlayer mp2 = MediaPlayer.create(getApplicationContext(), R.raw.button);
                        mp2.start();}
                    return true;
                }

        return false;
    }
    public static boolean chk(float x1,float y1,float x2, float y2,float X, float Y){
        float x=(x1+x2)/2;
        float y=(y1+y2)/2;
        double rad=0.15 *(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
        if(((X-x)*(X-x)+(Y-y)*(Y-y)-rad*rad)<0) return true;
        else return false;
    }

    public String stx,sty;
    public boolean onTouchEvent(MotionEvent event) {
        float X=0,Y=0;


            X = event.getX();
            Y = event.getY();



            //send(X,Y); this will send it to db

           /* listen();
            X=Float.parseFloat(stx);   //call this to retrieve
            Y=Float.parseFloat(sty);
            */



        boolean  tell=ammend(X,Y);
        ag=again(X,Y);
        draw();
        return true;
    }
    public void send(float X,float Y){
        xcor.setValue(Float.toString(X));
        ycor.setValue(Float.toString(Y));
    }
    public void listen(){
        xcor.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                stx = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        ycor.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                sty = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }
    public boolean again(float X,float Y){
        if(Y>480&&Y<680&&X>180&&X<260)return true;
        else return false;
    }





}

//------------
