package annotation.com.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import model.Values;

public class MainActivity extends AppCompatActivity {

    private Values values = new Values();
    private String firstAnswer = "Android Explicit intent specifies the component to be invoked from activity";
    private String secondAnswer = "Manifest file presents essential information about your app to the Android system";
    private EditText intentAnswer;
    private EditText manifestAnswer;
    private CheckBox correct_1, correct_2, wrong_answer;
    private boolean hasCoorect_answer_1, hasCoorect_answer_2, hasWrong_answer;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void check_answer(View v){


        //Checkboxes
        correct_1 = (CheckBox) findViewById(R.id.activity_a1);
        hasCoorect_answer_1 = correct_1.isChecked();
        correct_2 = (CheckBox) findViewById(R.id.activity_a2);
        hasCoorect_answer_2 = correct_2.isChecked();
        wrong_answer = (CheckBox) findViewById(R.id.activity_a3);
        hasWrong_answer = wrong_answer.isChecked();

        //Radio button
        radioGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);

        //EditText
        intentAnswer = (EditText) findViewById(R.id.intentAnswer);
        manifestAnswer = (EditText) findViewById(R.id.manifestAnswer);

        int total = 0;

        //Check the right answers for the checkboxes
        if(hasCoorect_answer_1 && hasCoorect_answer_2 && hasWrong_answer){
            values.setGrade(0);
            total += values.getGrade();
        }else if(hasCoorect_answer_1 && hasCoorect_answer_2){
            values.setGrade(25);
            total += values.getGrade();
        }



        //Check if the user typed an answer
        if(intentAnswer.getText().toString().length() != 0){
           if(isChecked(intentAnswer.getText().toString(), firstAnswer)){
                values.setGrade(25);
                total += values.getGrade();
           }
        }


        if(manifestAnswer.getText().toString().length() != 0){
            if(isChecked(manifestAnswer.getText().toString(), secondAnswer)){
                values.setGrade(25);
                total += values.getGrade();
            }
        }


        //Check radio buttons answers
        int getAnswer = radioGroup.getCheckedRadioButtonId();
        RadioButton answer = (RadioButton)findViewById(getAnswer);
        String check_answer = answer.getText().toString();

        if(check_answer.equals("is a collection of views")){
            values.setGrade(25);
            total += values.getGrade();
        }


        checkAnswer(total);

    }


    private void checkAnswer(int grade){
        Toast.makeText(this, "Your total grade is " +" "+  grade, Toast.LENGTH_SHORT).show();
    }


    //Check if the typed an answer that matches the right answer (firstAnswer)

    private boolean isChecked(String userAnswer, String answer){

        String[] rightAnswer = answer.split("\\s+");
        String[] userInput = userAnswer.split("\\s+");

        int found =0;
        boolean isRightAnser =false;

        for(int i=0;i<rightAnswer.length;i++){
            for(int n=0;n<userInput.length;n++){
                if(userInput[n].equals(rightAnswer[i])) {
                    found = i + 1;
                }
            }
        }

        if(found > 5){
            isRightAnser = true;
        }


        return isRightAnser;
    }



}
