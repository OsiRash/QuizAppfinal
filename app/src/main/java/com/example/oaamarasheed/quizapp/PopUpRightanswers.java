package com.example.oaamarasheed.quizapp;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;

import android.view.View;
import android.widget.TextView;



/**
 * Created by oaamarasheed on 15/01/18.
 */

public class PopUpRightanswers extends Activity {

 TextView niceJop;

    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://profile")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/arkverse")); //catches and opens a url to the desired page
        }
    }



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
    public void onCLick(View view){
        Intent facebookIntent = getOpenFacebookIntent(this);
        startActivity(facebookIntent);

    }

}
