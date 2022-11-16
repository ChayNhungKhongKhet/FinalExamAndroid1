package com.phamtantb24.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private SharedPreferences preferences;
    private EditText userNameTxt, passwordTxt;
    private CheckBox rememberCb;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mapping();

        preferences = getSharedPreferences("dataLogin", MODE_PRIVATE);
        userNameTxt.setText(preferences.getString("UserName",""));
        passwordTxt.setText(preferences.getString("Password",""));
        rememberCb.setChecked(preferences.getBoolean("Checked",false));

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = userNameTxt.getText().toString().trim();
                String password = passwordTxt.getText().toString().trim();
                if (user.isEmpty() || password.isEmpty())
                    Toast.makeText(getApplicationContext(), "Please fill all field !", Toast.LENGTH_SHORT).show();
                else if (user.equalsIgnoreCase("Pham Ngoc Tan") && password.equals("1")) {
                    Toast.makeText(getApplicationContext(), "Login success !", Toast.LENGTH_SHORT).show();
                    if(rememberCb.isChecked()) {
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putString("UserName",user);
                        editor.putString("Password",password);
                        editor.putBoolean("Checked",true);
                        editor.commit();
                    }
                    else {
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.remove("UserName");
                        editor.remove("Password");
                        editor.remove("Checked");
                        editor.commit();
                    }
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                }
                else
                    Toast.makeText(getApplicationContext(), "User name or password was wrong !", Toast.LENGTH_SHORT).show();
                }
            });

    }
    public void mapping() {
        userNameTxt = findViewById(R.id.editTextUserName);
        passwordTxt = findViewById(R.id.editTextPassword);
        rememberCb = findViewById(R.id.checkBoxRemember);
        loginBtn = findViewById(R.id.buttonLogin);
    }
}
