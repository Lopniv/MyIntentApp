package com.example.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObject extends AppCompatActivity {

    public static final String EXTRA_PERSON = "extra_person";

    TextView tv_object_received;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tv_object_received = findViewById(R.id.tv_object_received);

        String person = getIntent().getStringExtra(EXTRA_PERSON);

        tv_object_received.setText(person);

    }
}
