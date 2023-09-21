package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.quizzapp.databinding.ActivityMainBinding;
import com.example.quizzapp.model.Question;
import com.example.quizzapp.model.QuestionsList;
import com.example.quizzapp.viewmodel.QuizViewModel;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    QuizViewModel quizViewModel;
    List<Question> questionsList;

    static int result=0;
    static int totalQuestions =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //Resetting the scores:
        result=0;
        totalQuestions=0;

        //getting the response
        quizViewModel= new ViewModelProvider(this).get(QuizViewModel.class);

        //Displaying first Question
        quizViewModel.getQuestionsListLiveData().observe(this, new Observer<QuestionsList>() {
            @Override
            public void onChanged(QuestionsList questions) {
                Log.i("Tagy","The first question :"+questions.get(0));

                binding.txtQuestion.setText(questions.get(0).getQuestion());
                binding.radio1.setText(questions.get(0).getOption1());
                binding.radio2.setText(questions.get(0).getOption2());
                binding.radio3.setText(questions.get(0).getOption3());
                binding.radio4.setText(questions.get(0).getOption4());
            }
        });
    }
}