package io.github.ndthien98.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG_NAME = "LOGIN_ACTIVITY";
    EditText username;
    EditText password;
    Button login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.usernameET);
        password = findViewById(R.id.passwordET);
        login = findViewById(R.id.loginBtn);
        register = findViewById(R.id.registerBtn);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.loginBtn) {
            Log.d(TAG_NAME, "Login button click");
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.registerBtn) {
            Log.d(TAG_NAME, "Register button click");
        }
    }
}
