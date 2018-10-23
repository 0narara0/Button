package com.cmy.www.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickwidget(View view){
        int id = view.getId();
        String text = null;
        switch (id) {
            case R.id.button1: text =((Button)view).getText().toString();
                break;
            case R.id.button2: text =((Button)view).getText().toString();
                break;
            case R.id.toggleButton2: text =((ToggleButton)view).getText().toString();
                break;
            case  R.id.imageButton: text = ((ImageButton)view).getContext().toString();
                                            //imagebutton은 getText()가 없다.
                break;

                default: text ="Nothing!";
        }
        Toast.makeText(view.getContext(),text + "버튼을 클릭!!" , Toast.LENGTH_SHORT).show();
    }
}
