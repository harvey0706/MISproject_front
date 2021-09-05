package com.google.ar.core.examples.java.helloar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class EditModelActivity extends Activity {

    Button doneButton;
    EditText textName;
    EditText textLocation;
    EditText textTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editmodel);


        textName=(EditText)findViewById(R.id.editTextName);
        textLocation=(EditText)findViewById(R.id.editTextLocation);
        textTime=(EditText)findViewById(R.id.editTextTime);
        doneButton=(Button)findViewById(R.id.DoneButton);



        doneButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //......................................validation
                String first_name = textName.getText().toString();
                String last_name = textLocation.getText().toString();
                String phone_no = textTime.getText().toString();

                if (TextUtils.isEmpty(first_name)) {
                    textName.setError("please enter name");
                }
                else if (TextUtils.isEmpty(last_name)) {
                    textLocation.setError("please enter location");
                }
                else if (TextUtils.isEmpty(phone_no)) {
                    textTime.setError("please enter time");
                }
                else {
                    Intent intent =new Intent(EditModelActivity.this,MenuActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Model added successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
