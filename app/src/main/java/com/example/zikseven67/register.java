package com.example.zikseven67;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    private EditText etFullName;
    private EditText etUsername;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private Button btnRegister;
    private TextView tvLoginRedirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        initViews();
        setupClickListeners();
    }

    private void initViews() {
        etFullName = findViewById(R.id.registerFullName);
        etUsername = findViewById(R.id.registerUsername);
        etPassword = findViewById(R.id.registerPassword);
        etConfirmPassword = findViewById(R.id.registerConfirmPassword);
        btnRegister = findViewById(R.id.registerButton);
        tvLoginRedirect = findViewById(R.id.loginLinkText);
    }

    private void setupClickListeners() {
        if (btnRegister != null) {
            btnRegister.setOnClickListener(v -> validateAndRegister());
        }

        if (tvLoginRedirect != null) {
            tvLoginRedirect.setOnClickListener(v -> {
                Intent intent = new Intent(register.this, zikseven67.class);
                startActivity(intent);
                finish();
            });
        }
    }

    private void validateAndRegister() {
        String fullName = etFullName != null ? etFullName.getText().toString().trim() : "";
        String username = etUsername != null ? etUsername.getText().toString().trim() : "";
        String password = etPassword != null ? etPassword.getText().toString().trim() : "";
        String confirmPassword = etConfirmPassword != null ? etConfirmPassword.getText().toString().trim() : "";

        if (TextUtils.isEmpty(fullName)) {
            if (etFullName != null) {
                etFullName.setError("Full name is required");
                etFullName.requestFocus();
            }
            return;
        }

        if (TextUtils.isEmpty(username)) {
            if (etUsername != null) {
                etUsername.setError("Username or email is required");
                etUsername.requestFocus();
            }
            return;
        }

        if (TextUtils.isEmpty(password)) {
            if (etPassword != null) {
                etPassword.setError("Password is required");
                etPassword.requestFocus();
            }
            return;
        }

        if (password.length() < 6) {
            if (etPassword != null) {
                etPassword.setError("Password must be at least 6 characters");
                etPassword.requestFocus();
            }
            return;
        }

        if (!password.equals(confirmPassword)) {
            if (etConfirmPassword != null) {
                etConfirmPassword.setError("Passwords do not match");
                etConfirmPassword.requestFocus();
            }
            return;
        }

        Toast.makeText(this, "Registration Successful for " + fullName, Toast.LENGTH_LONG).show();

        // Redirect to Login/Main screen after successful registration
        Intent intent = new Intent(register.this, dashboard.class);
        startActivity(intent);
        finish();
    }
}
