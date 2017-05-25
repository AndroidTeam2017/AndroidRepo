package com.example.maryam.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ListView listView;

    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listView);
        register= (Button) findViewById(R.id.button);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == register){
            registeration();
        }

    }


    private void registeration() {

        startActivity(new Intent(this, Register.class));
    }
}


