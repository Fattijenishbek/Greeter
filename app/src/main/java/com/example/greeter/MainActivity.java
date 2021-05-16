package com.example.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        EditText nameField=(EditText)findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        display("Hello "+name+" !");
    }
    private void display(String name){
        TextView message = (TextView)findViewById(R.id.greet_field);
        message.setText(name);
    }
}