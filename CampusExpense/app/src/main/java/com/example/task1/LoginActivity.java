package com.example.task1;

//import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText mUsername;
    private EditText mPassword;
    private Button LoginButton;
    private ProgressBar loadingLogin;
    boolean isProgressVisible = false;
//    private ProgressDialog mDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        Login();
    }
    private void Login(){
        mUsername =findViewById(R.id.Username);
        mPassword =findViewById(R.id.Password);
        LoginButton = findViewById(R.id.btn_login);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsername.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                if (TextUtils.isEmpty(username)){
                    mUsername.setError("Username cannot is Emty");
                    return;
                } else if (TextUtils.isEmpty(password)) {
                    mPassword.setError("Password cannot is Emty");
                    return;
                }
//                if (isProgressVisible){
//                    LoginButton.setText("Processing");
//                    loadingLogin.setVisibility(View.GONE);
//                }
                if (username.equals("it0603") && password.equals("123456789")){
//                    isProgressVisible = true;
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                }else {
//                    isProgressVisible = false;
//                    loadingLogin.setVisibility(View.VISIBLE);
                    mPassword.setError("Password invalid");
                    mUsername.setError("Username invalid");
                }
            }
        });
    }
}
