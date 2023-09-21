package com.example.quizzapp.retrofit;

import com.example.quizzapp.model.QuestionsList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface QuestionsAPI {
    @GET("questionsapi.php")
    Call<QuestionsList> getQuestions();
}
