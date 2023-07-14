package com.example.firebasedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login,signup;
    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=t1.getText().toString();
                String pass=t2.getText().toString();

                if(name.equals("shivrajyadav320@gmail.com") && pass.equals("Shivraj@123")){
                    Intent i= new Intent(MainActivity.this,login.class);
                    startActivity(i);
                } else if (name.equals("sagarafar01@gmail.com") && pass.equals("Sagar@123")) {
                    Intent i= new Intent(MainActivity.this,login.class);
                    startActivity(i);
                }
                else if (name.equals("pruthvi302@gmail.com") && pass.equals("Pruthvi@123")) {
                    Intent i= new Intent(MainActivity.this,login.class);
                    startActivity(i);
                }
                else if (name.equals("vishal302@gmail.com") && pass.equals("Vishal@123")) {
                    Intent i= new Intent(MainActivity.this,login.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Error : Coonection String(&sd/_hf[0]m.jk) unable to connect", Toast.LENGTH_LONG).show();
                }


            }
        });



    }
}