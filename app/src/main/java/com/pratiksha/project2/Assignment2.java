package com.pratiksha.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Assignment2 extends AppCompatActivity {
//   login obj vayo j diye ni vayo
       Button merologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);

        merologin=findViewById(R.id.login);
        merologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ahile kaha xau.this,arko jane activity.class.java
                //intent ko kam arko page lagne route gare jasto vayo
//                Intent intent1=new Intent(Assignment2.this,Login.class);
//                startActivity(intent1);
                Toast.makeText(Assignment2.this, "Hello", Toast.LENGTH_SHORT).show(); //button ma click garda kei text show garna lai toast garne
            }
        });



    }
}