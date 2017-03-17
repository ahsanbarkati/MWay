package com.example.ash.makew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                call1();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                call2();
            }
        });


    }

    public void call1()
    {   Intent i = new Intent(this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("n","attack");
        i.putExtras(bundle);
        startActivity(i);
    }


    public void call2()
    {  Intent i = new Intent(this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("n","defense");
        i.putExtras(bundle);
        startActivity(i);
    }

}
