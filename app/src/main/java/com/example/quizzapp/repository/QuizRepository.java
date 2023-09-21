package com.example.quizzapp.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.quizzapp.model.QuestionsList;
import com.example.quizzapp.retrofit.QuestionsAPI;
import com.example.quizzapp.retrofit.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuizRepository {

    private QuestionsAPI questionsAPI;
    public QuizRepository(){
        questionsAPI =  new RetrofitInstance()
                .getRetrofitInstance()
                .create(QuestionsAPI.class);

    }
    public LiveData<QuestionsList> getQuestionsFromAPI(){
        MutableLiveData<QuestionsList> data = new MutableLiveData<>();


        Call<QuestionsList> response = questionsAPI.getQuestions();
        response.enqueue(new Callback<QuestionsList>() {
            @Override
            public void onResponse(Call<QuestionsList> call, Response<QuestionsList> response) {
                //saving data to list
                QuestionsList list=response.body();
                data.postValue(list);
//                data.postValue(list);
//
                Log.i("TAGY",""+data.getValue());
            }

            @Override
            public void onFailure(Call<QuestionsList> call, Throwable t) {

            }
        });
//        if(response!=null){
//
//        }
        return data;
    }
}
