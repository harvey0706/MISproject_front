package com.google.ar.core.examples.java.helloar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.cardview.widget.CardView;

public class MenuActivity extends Activity {

    Button logout;
    public CardView cardModel, cardPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        cardModel = (CardView) findViewById(R.id.modelingButton);
        cardPosition = (CardView) findViewById(R.id.positioningButton);
        logout = (Button)findViewById(R.id.buttonLogout);

        cardModel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,ModelingActivity.class);
                startActivity(intent);
            }
        });

        cardPosition.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,PositioningActivity.class);
                startActivity(intent);
            }
        });


        logout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
    }
}
