package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

interface HandleMainActivityOnClickListeners
{
    View.OnClickListener onSayHelloClick();
}

public class MainActivity extends AppCompatActivity implements HandleMainActivityOnClickListeners  {

    private TextView tvTitle;
    private EditText etName;
    private Button btnSayHello;

    private void initialize() {
        tvTitle = findViewById(R.id.tvTitle);
        etName = findViewById(R.id.etName);
        btnSayHello = findViewById(R.id.btnSayHello);
        btnSayHello.setOnClickListener(onSayHelloClick());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public View.OnClickListener onSayHelloClick() {
        String persionName = etName.getText().toString();
        Toast.makeText(this, "Hello"+persionName, Toast.LENGTH_SHORT).show();
        return null;
    }
}