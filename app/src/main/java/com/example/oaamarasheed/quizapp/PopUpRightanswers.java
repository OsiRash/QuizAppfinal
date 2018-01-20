package com.example.oaamarasheed.quizapp;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by oaamarasheed on 15/01/18.
 */

public class PopUpRightanswers extends Activity {

 TextView niceJop;




    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupright);
//this changes the widht and hight of the pupmassege
        DisplayMetrics imageSize = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(imageSize);
        int width = imageSize.widthPixels;
        int hight = imageSize.heightPixels;
        getWindow().setLayout((int)(width*0.6), (int) (hight*0.6));
////this shows the User name in the end massege
niceJop = (TextView) findViewById(R.id.nice_job);
        niceJop.setText(getString(R.string.right_answers1)+"\t" + getIntent().getStringExtra("sentName") + getString(R.string.right_answers2));








    }

}
