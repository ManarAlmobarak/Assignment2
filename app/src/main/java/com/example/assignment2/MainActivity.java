package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ShowName (View view) {
        Intent intent = new Intent();
        EditText editText = (EditText) findViewById(R.id.editText);
        intent=getIntent();
        TextView textView=findViewById(R.id.textView);
        String Name = editText.getText().toString();

        textView.setText("hello, "+Name);}
}
