package com.example.boss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_4 extends AppCompatActivity {
    Button button;
    TextView nametext,idtext,cgtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        button = findViewById(R.id.btn22);
        nametext = findViewById(R.id.textView42);
        idtext = findViewById(R.id.textView52);
        cgtext = findViewById(R.id.textView62);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_main();
            }
        });

        Bundle bl = getIntent().getExtras();
        String namee = bl.getString("id");
        String namee1 = bl.getString("cg");
        // String studentId = bl.getString()
        cgtext.setText(namee1);
        nametext.setText("saqline");
        idtext.setText(namee);

    }
    public void back_main()
    {
        Intent intent1 = new Intent(this,MainActivity.class);



        startActivity(intent1);
    }
}
