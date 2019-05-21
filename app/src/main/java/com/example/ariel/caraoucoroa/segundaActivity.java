package com.example.ariel.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class segundaActivity extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),segundaActivity.class);

                //Passar dados
                int numero = new Random().nextInt(2);
                intent.putExtra("numero", numero);


                startActivity(intent);
            }
        });

    }
}
