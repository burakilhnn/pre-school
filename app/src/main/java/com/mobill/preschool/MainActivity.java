package com.mobill.preschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.mobill.preschool.api.Root;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Root post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://owlbot.info/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        OwlbotApi owlbotApi = retrofit.create(OwlbotApi.class);
        Call<Root> call = owlbotApi.getRoot("fish");

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                post = response.body();
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });
    }
    public void onClick(View view){
        System.out.println("**************");
        System.out.println(post.getWord());
        System.out.println(post.getPronunciation());
        System.out.println(post.getDefinitions().get(0).getDefinition());
        System.out.println("**************");
    }
}