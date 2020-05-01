package com.example.hoangtri58131427simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView5,textView6,textView7;
    EditText editText,editText2,editText3;
    RadioButton radioButton,radioButton2;
    CheckBox checkBox4,checkBox2,checkBox5,checkBox3,checkBox;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);

        editText = findViewById(R.id.editText);
        editText2  = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

        checkBox = findViewById(R.id.checkBox);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox5 = findViewById(R.id.checkBox5);

        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);

        button = findViewById(R.id.bottom);
    }


    public  void onDisplay(View v){
        String name = editText.getText().toString();
        String date = editText2.getText().toString();
        String radioid1 = radioButton.getText().toString();
        String radioid2 = radioButton2.getText().toString();

//        String interests = checkBox.getText().toString();
//        String interests2 = checkBox2.getText().toString();
//        String interests3 = checkBox3.getText().toString();
//        String interests4 = checkBox4.getText().toString();
//        String interests5 = checkBox5.getText().toString();
        String interests = "sở thích: ";
        if(radioButton.isChecked()){
            if (checkBox.isChecked())
            {
                interests += checkBox.getText().toString() + ",";
            }
            if (checkBox4.isChecked()){
                interests += checkBox4.getText().toString() + ",";
            }
            if (checkBox2.isChecked())
            {
                interests += checkBox2.getText().toString() + ",";
            }
            if (checkBox3.isChecked())
            {
                interests += checkBox3.getText().toString() + ",";
            }

            if (checkBox5.isChecked())
            {
                interests += checkBox5.getText().toString() + ",";
            }

            interests += editText3.getText().toString();
            Toast.makeText(getApplicationContext(), "họ và tên: "+name+'\n'+"ngày sinh: "+date+'\n'+"Giới tính: "+radioid1+'\n'+interests, Toast.LENGTH_SHORT).show();



        }else if(radioButton2.isChecked()){
            if (checkBox.isChecked())
            {
                interests += checkBox.getText().toString() + ",";
            }
            if (checkBox4.isChecked()){
                interests += checkBox4.getText().toString() + ",";
            }
            if (checkBox2.isChecked())
            {
                interests += checkBox2.getText().toString() + ",";
            }
            if (checkBox3.isChecked())
            {
                interests += checkBox3.getText().toString() + ",";
            }

            if (checkBox5.isChecked())
            {
                interests += checkBox5.getText().toString() + ",";
            }

            interests += editText3.getText().toString();
            Toast.makeText(getApplicationContext(), "họ và tên: "+name+'\n'+"ngày sinh: "+date+'\n'+"Giới tính: "+radioid2+'\n'+interests, Toast.LENGTH_SHORT).show();

        }
    }
}
