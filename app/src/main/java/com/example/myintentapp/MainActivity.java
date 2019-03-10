package com.example.myintentapp;

import android.app.Person;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveWithData;
    Button btnMoveWithObject;
    Button btnDialNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveWithData = findViewById(R.id.btn_move_activity_data);
        btnMoveWithData.setOnClickListener(this);

        btnMoveWithObject = findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);

        btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveData = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveData.putExtra(MoveWithDataActivity.EXTRA_NAME,"DicodingAcademy Boy");
                moveData.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(moveData);
                break;
//            case R.id.btn_move_activity_object:
//                Person person = new Person();
//                person.setName("Fahmi");
//                person.setAge("19");
//                person.setEmail("bloginfo693@gmail.com");
//                person.setCity("Jakarta");
//                Intent moveWithObject = new Intent(MainActivity.this, MoveWithObject.class);
//                MoveWithObject.putExtra(MoveWithObject.EXTRA_PERSON, person);
//                startActivity(moveWithObject);
//                break;
            case R.id.btn_dial_number:
                String phoneNumber = "081296306749";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
