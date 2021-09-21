package com.google.ar.core.examples.java.helloar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {


    Button login;
    EditText username,password;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login=(Button)findViewById(R.id.buttonlogin);
        username=(EditText)findViewById(R.id.editTextusername);
        password=(EditText)findViewById(R.id.editTextpassword);

        login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                String user_name = username.getText().toString();
                String pass_word = password.getText().toString();

                if(TextUtils.isEmpty(user_name)){
                    username.setError("Invalid User Name");
                }
                else if(TextUtils.isEmpty(pass_word)){
                    password.setError("Enter Password");
                }
                else{
                    if(user_name.equals("admin")&pass_word.equals("admin123")){
                        Intent intent = new Intent(LoginActivity.this,MenuActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Login successfully", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Login failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
