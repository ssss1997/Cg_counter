package com.example.boss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cg_activity extends AppCompatActivity {
       EditText tvx1,tvx2,tvx3,tvx4,tvx5;
       double ca,math,dept,num,algo,sum=0,ans;
       String sp,nma,mnn;
       Button button;
    String numberAsString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_activity);
        button = findViewById(R.id.but1);
        tvx1=findViewById(R.id.editText);
        tvx2=findViewById(R.id.editText2);
        tvx3=findViewById(R.id.editText3);
        tvx4=findViewById(R.id.editText4);
        tvx5=findViewById(R.id.editText5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp=tvx1.getText().toString();
                ca=Double.parseDouble(sp);
                sum+=ca;
       sp=tvx2.getText().toString();
        ca=Double.parseDouble(sp);
        sum+=ca;
        sp=tvx3.getText().toString();
        ca=Double.parseDouble(sp);
        sum+=ca;
        sp=tvx4.getText().toString();
        ca=Double.parseDouble(sp);
        sum+=ca;
        sp=tvx5.getText().toString();
        ca=Double.parseDouble(sp);
        sum+=ca;
        ans=sum/5;
                Bundle bl = getIntent().getExtras();
                nma = bl.getString("payment");
                if(nma.equals("180104133"))
                openActivity2();
                else  if(nma.equals("180104128"))
                {
                    openActivity3();
                }
                else
                {
                    openActivity4();
                }

            }
        });



    }
    public void openActivity2()
    {
       // double number = -895.25;
         numberAsString = String.valueOf(ans);

        Intent intent1 = new Intent(this,Activity_2.class);
        intent1.putExtra("id",nma);
        intent1.putExtra("cg"," "+numberAsString);
        startActivity(intent1);
    }
    public void openActivity3()
    {
        // double number = -895.25;
        numberAsString = String.valueOf(ans);

        Intent intent1 = new Intent(this,Activity_3.class);
        intent1.putExtra("id",nma);
        intent1.putExtra("cg"," "+numberAsString);
        startActivity(intent1);
    }
    public void openActivity4()
    {
        // double number = -895.25;
        numberAsString = String.valueOf(ans);

        Intent intent1 = new Intent(this,Activity_4.class);
        intent1.putExtra("id",nma);
        intent1.putExtra("cg"," "+numberAsString);
        startActivity(intent1);
    }
}
