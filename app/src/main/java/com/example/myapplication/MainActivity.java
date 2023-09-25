package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
    public EditText firstname;
    public EditText lastname;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Binding
        textView = findViewById(R.id.textView);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        btn = findViewById(R.id.btn);

        // adding a click listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputFirstName = String.valueOf(firstname.getText());
                String inputLastName = String.valueOf(lastname.getText());
                Toast.makeText(MainActivity.this, "Hello " + inputLastName + " " + inputLastName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}