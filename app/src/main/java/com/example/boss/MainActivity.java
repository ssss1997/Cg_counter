package com.example.boss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
   EditText edit;
   String shams,hasib,saqline,rithy,kristy,sp;
     int shm,hs,sq,ri,kri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        shams="180104128";
        hasib = "180104133";
        saqline = "180104129";
        rithy = "180104136";
        kristy="180104127";
        shm=hs=sq=ri=kri=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.bt3);
        edit = findViewById(R.id.edt1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp = edit.getText().toString();
                if(sp.equals("18"))
                {
                    cg_active();

                }
                else
                {
                    cg_active();
                }
                //else openActivity2();

            }
        });
    }

    public void cg_active()
    {

        // String ps="    ";
        // sp=ps+sp;

        Intent intent1 = new Intent(this,cg_activity.class);
        if(sp.equals(shams))
        intent1.putExtra("payment","180104128");
        else if(sp.equals("180104133"))
        {
            intent1.putExtra("payment","180104133");
        }
        else if(sp.equals("180104129"))
        {
            intent1.putExtra("payment","180104129");
        }

        startActivity(intent1);
    }
    public void openActivity2()
    {

        String ps="    ";
        sp=ps+sp;
        Intent intent1 = new Intent(this,Activity_2.class);
        intent1.putExtra("payment","3.45");
        startActivity(intent1);
    }
    public void openActivity3()
    {

        String ps="    ";
        sp=ps+sp;
        Intent intent1 = new Intent(this,Activity_2.class);
        intent1.putExtra("payment","3.56");
        startActivity(intent1);
    }

}