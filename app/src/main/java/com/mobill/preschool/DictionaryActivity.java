package com.mobill.preschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobill.preschool.api.Root;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DictionaryActivity extends AppCompatActivity {

    Root post;
    private String msg;
    private Button search;
    private EditText word;
    private TextView definition;
    private ImageView backButton;
    OwlbotApi owlbotApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        search = (Button) findViewById(R.id.btnSearch);
        word = (EditText) findViewById(R.id.editTxtWord);
        definition = (TextView) findViewById(R.id.txtDef);
        backButton = findViewById(R.id.backButton4);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(DictionaryActivity.this, HomeActivity.class);
                startActivity(x);
            }
        });

    }

    public void onClick(View view){

        msg = "";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://owlbot.info/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        owlbotApi = retrofit.create(OwlbotApi.class);
        Call<Root> call = owlbotApi.getRoot(word.getText().toString());

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                post = response.body();
                for(int i=0;i<post.getDefinitions().size();i++){
                    msg += " -  " + post.getDefinitions().get(i).getDefinition() + "\n";
                }
                definition.setText(msg);
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });

    }
}