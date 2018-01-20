package com.example.oaamarasheed.quizapp;



import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;


import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;

import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    CheckBox q1Ch1, q1Ch2, q1Ch3, q2Ch1, q2Ch2, q2Ch3, q3Ch1, q3Ch2, q3Ch3, q4Ch1, q4Ch2,q4Ch3,q5Ch1,q5Ch2,q5Ch3;
public EditText enterYourName;

public TextView niceJop;



    //      this will let the user select only one answer per quastion
    View.OnClickListener checkboxClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {

            //           Quuastopn 1 answers only one answer should bhe checked codes

            boolean q1Ch1Checked = q1Ch1.isChecked();
            boolean q1Ch2Checked = q1Ch2.isChecked();
            boolean q1Ch3Checked = q1Ch3.isChecked();
            if (q1Ch1Checked == true) {

                q1Ch2.setChecked(false);
                q1Ch3.setChecked(false);

            }
            if (q1Ch2Checked == true) {
                q1Ch1.setChecked(false);

                q1Ch3.setChecked(false);
            }
            if (q1Ch3Checked == true) {
                q1Ch2.setChecked(false);
                q1Ch1.setChecked(false);

            }
            //           Quuastopn 2 answers only one answer should bhe checked codes

            boolean q2Ch1Checked = q2Ch1.isChecked();
            boolean q2Ch2Checked = q2Ch2.isChecked();
            boolean q2Ch3Checked = q2Ch3.isChecked();
            if (q2Ch1Checked == true) {

                q2Ch2.setChecked(false);
                q2Ch3.setChecked(false);

            }
            if (q2Ch2Checked == true) {
                q2Ch1.setChecked(false);

                q2Ch3.setChecked(false);
            }
            if (q2Ch3Checked == true) {
                q2Ch2.setChecked(false);
                q2Ch1.setChecked(false);

            }
//            Quuastopn 3 answers only one answer should bhe checked codes

            boolean q3Ch1Checked = q3Ch1.isChecked();
            boolean q3Ch2Checked = q3Ch2.isChecked();
            boolean q3Ch3Checked = q3Ch3.isChecked();
            if (q3Ch1Checked == true) {

                q3Ch2.setChecked(false);
                q3Ch3.setChecked(false);

            }
            if (q3Ch2Checked == true) {
                q3Ch1.setChecked(false);

                q3Ch3.setChecked(false);
            }
            if (q3Ch3Checked == true) {
                q3Ch2.setChecked(false);
                q3Ch1.setChecked(false);

            }
//            Quuastopn 4 answers only one answer should bhe checked codes

            boolean q4Ch1Checked = q4Ch1.isChecked();
            boolean q4Ch2Checked = q4Ch2.isChecked();
            boolean q4Ch3Checked = q4Ch3.isChecked();
            if (q4Ch1Checked == true) {

                q4Ch2.setChecked(false);
                q4Ch3.setChecked(false);

            }
            if (q4Ch2Checked == true) {
                q4Ch1.setChecked(false);

                q4Ch3.setChecked(false);
            }
            if (q4Ch3Checked == true) {
                q4Ch2.setChecked(false);
                q4Ch1.setChecked(false);

            }
//            Quuastopn 5answers only one answer should bhe checked codes

            boolean q5Ch1Checked = q5Ch1.isChecked();
            boolean q5Ch2Checked = q5Ch2.isChecked();
            boolean q5Ch3Checked = q5Ch3.isChecked();
            if (q5Ch1Checked == true) {

                q5Ch2.setChecked(false);
                q5Ch3.setChecked(false);

            }
            if (q5Ch2Checked == true) {
                q5Ch1.setChecked(false);

                q5Ch3.setChecked(false);
            }
            if (q5Ch3Checked == true) {
                q5Ch2.setChecked(false);
                q5Ch1.setChecked(false);

            }
        }
    };
//   public void rightAnswer (View v){
//       startActivity(new Intent(MainActivity.this, PopUpRightanswers.class));
//   }

//hiding the kyboaord after klick somewhere eals method
    public void hideKeyboard(View v) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(enterYourName.getWindowToken(), 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterYourName = (EditText) findViewById(R.id.enter_your_name_editText);
//       calling the hide keyboard method
        enterYourName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });



//all answers checkboxes

        q1Ch1 = (CheckBox) findViewById(R.id.q_1_a1_check_box);

        q1Ch2 = (CheckBox) findViewById(R.id.q_1_a2_check_box);

        q1Ch3 = (CheckBox) findViewById(R.id.q_1_a3_check_box);

        q2Ch1 = (CheckBox) findViewById(R.id.q_2_a1_check_box);
        q2Ch2 = (CheckBox) findViewById(R.id.q_2_a2_check_box);
        q2Ch3 = (CheckBox) findViewById(R.id.q_2_a3_check_box);

        q3Ch1 = (CheckBox) findViewById(R.id.q_3_a1_check_box);
        q3Ch2 = (CheckBox) findViewById(R.id.q_3_a2_check_box);
        q3Ch3 = (CheckBox) findViewById(R.id.q_3_a3_check_box);

        q4Ch1 = (CheckBox) findViewById(R.id.q_4_a1_check_box);
        q4Ch2 = (CheckBox) findViewById(R.id.q_4_a2_check_box);
        q4Ch3 = (CheckBox) findViewById(R.id.q_4_a3_check_box);

        q5Ch1 = (CheckBox) findViewById(R.id.q_5_a1_check_box);
        q5Ch2 = (CheckBox) findViewById(R.id.q_5_a2_check_box);
        q5Ch3 = (CheckBox) findViewById(R.id.q_5_a3_check_box);



        q1Ch1.setOnClickListener(checkboxClickListener);
        q1Ch2.setOnClickListener(checkboxClickListener);
        q1Ch3.setOnClickListener(checkboxClickListener);
        q2Ch1.setOnClickListener(checkboxClickListener);
        q2Ch2.setOnClickListener(checkboxClickListener);
        q2Ch3.setOnClickListener(checkboxClickListener);
        q3Ch1.setOnClickListener(checkboxClickListener);
        q3Ch2.setOnClickListener(checkboxClickListener);
        q3Ch3.setOnClickListener(checkboxClickListener);
        q4Ch1.setOnClickListener(checkboxClickListener);
        q4Ch2.setOnClickListener(checkboxClickListener);
        q4Ch3.setOnClickListener(checkboxClickListener);
        q5Ch1.setOnClickListener(checkboxClickListener);
        q5Ch2.setOnClickListener(checkboxClickListener);
        q5Ch3.setOnClickListener(checkboxClickListener);


//        q1Ch1.setChecked(true);//


    }

//this Method will chechk if all quastion been answered, and if tall corect or wrong
    public void submitAnswers (View view) {
//         enterYourName = (EditText) findViewById(R.id.enter_your_name_editText);
        String userName = enterYourName.getText().toString();

        boolean q1Ch1Checked = q1Ch1.isChecked();
        boolean q1Ch2Checked = q1Ch2.isChecked();
        boolean q1Ch3Checked = q1Ch3.isChecked();
        boolean q2Ch1Checked = q2Ch1.isChecked();
        boolean q2Ch2Checked = q2Ch2.isChecked();
        boolean q2Ch3Checked = q2Ch3.isChecked();
        boolean q3Ch1Checked = q3Ch1.isChecked();
        boolean q3Ch2Checked = q3Ch2.isChecked();
        boolean q3Ch3Checked = q3Ch3.isChecked();
        boolean q4Ch1Checked = q4Ch1.isChecked();
        boolean q4Ch2Checked = q4Ch2.isChecked();
        boolean q4Ch3Checked = q4Ch3.isChecked();
        boolean q5Ch1Checked = q5Ch1.isChecked();
        boolean q5Ch2Checked = q5Ch2.isChecked();
        boolean q5Ch3Checked = q5Ch3.isChecked();




        String msg = null;
        if (userName.matches("")){
            msg=getString(R.string.no_name)  ;
        }
        else{

//       quastion 1 answers should be checkeed if statment
        if ((q1Ch1Checked == false) && (q1Ch2Checked == false) && (q1Ch3Checked == false)) {
            msg =  getString(R.string.please_answer_quastion) + "1";
//            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();

        }
        else {
            //       quastion 2 answers should be checkeed if statment
            if ((q2Ch1Checked == false) && (q2Ch2Checked == false) && (q2Ch3Checked == false)) {
                msg = getString(R.string.please_answer_quastion) + "2";
//                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();

            } else {
                //       quastion 3 answers should be checkeed if statment
                if ((q3Ch1Checked == false) && (q3Ch2Checked == false) && (q3Ch3Checked == false)) {
                    msg = getString(R.string.please_answer_quastion) + "3";
//                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                } else {
                    //       quastion 4 answers should be checkeed if statment
                    if ((q4Ch1Checked == false) && (q4Ch2Checked == false) && (q4Ch3Checked == false)) {
                        msg = getString(R.string.please_answer_quastion) + "4";
//                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                    } else {
                        //       quastion 5 answers should be checkeed if statment
                        if ((q5Ch1Checked == false) && (q5Ch2Checked == false) && (q5Ch3Checked == false)) {
                            msg = getString(R.string.please_answer_quastion) + "5";
//                            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                        }
                        //      Right or wrong answers statmnets
                        else {
                            if ((q1Ch2Checked) && (q2Ch3Checked) && (q3Ch2Checked) && (q4Ch1Checked) && (q5Ch3Checked)) {
//                                msg = getString(R.string.right_answers);



                                Intent rightIntent = new Intent (view.getContext(),PopUpRightanswers.class );
                                rightIntent.putExtra( "sentName",userName);
                                        startActivity(rightIntent);




                            } else {

                                Intent rightIntent = new Intent (view.getContext(),PopUpWrongAnswers.class );
                                rightIntent.putExtra( "sentName",userName);
                                startActivity(rightIntent);
                            }
                        }
                    }
                }

            }
        }



        }

        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();


    }
//
//

//
// /
//
//
//

//            boolean checked = ((CheckBox) view).isChecked();
//            if (checked) {
//                String text = null;
//                switch (view.getId()) {
//                    case R.id.q_1_a1_check_box:
//                        text = "A1";
//
//                        break;
//                    case R.id.q_1_a2_check_box:
//                        text = "a2";
//                        break;
//                    case R.id.q_1_a3_check_box:
//                        text = "a3";
//                        break;
//                }
//                Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
//            }}


}