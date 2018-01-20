package com.example.oaamarasheed.quizapp;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by oaamarasheed on 15/01/18.
 */

public class PopUpWrongAnswers extends Activity {
    TextView badJop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwrong);

        DisplayMetrics imageSize = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(imageSize);
        int width = imageSize.widthPixels;
        int hight = imageSize.heightPixels;
        getWindow().setLayout((int)(width*0.6), (int) (hight*0.6));

        badJop = (TextView) findViewById(R.id.bad_jop);
        badJop.setText(getString(R.string.wrong_answers1)+"\t \t"+getIntent().getStringExtra("sentName")+"\t \t"+getString(R.string.wrong_answers2));

    }
}
