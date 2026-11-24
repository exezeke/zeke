package com.example.zikseven67;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class zikseven67 extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextInputLayout usernameInputLayout;
    private TextInputLayout passwordInputLayout;
    private Button loginButton;
    private TextView forgotPasswordText;
    private TextView signUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zikseven67);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize UI Elements
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        usernameInputLayout = findViewById(R.id.usernameInputLayout);
        passwordInputLayout = findViewById(R.id.passwordInputLayout);
        loginButton = findViewById(R.id.loginButton);
        forgotPasswordText = findViewById(R.id.forgotPasswordText);
        signUpText = findViewById(R.id.signUpText);

        // Handle Login Click
        loginButton.setOnClickListener(v -> performLogin());

        // Handle Forgot Password Click
        forgotPasswordText.setOnClickListener(v -> 
            Toast.makeText(this, "Forgot password clicked", Toast.LENGTH_SHORT).show()
        );

        // Handle Sign Up Click
        signUpText.setOnClickListener(v -> 
            Toast.makeText(this, "Sign up clicked", Toast.LENGTH_SHORT).show()
        );
    }

    private void performLogin() {
        String username = usernameEditText.getText() != null ? usernameEditText.getText().toString().trim() : "";
        String password = passwordEditText.getText() != null ? passwordEditText.getText().toString().trim() : "";

        // Reset errors
        usernameInputLayout.setError(null);
        passwordInputLayout.setError(null);

        if (TextUtils.isEmpty(username)) {
            usernameInputLayout.setError("Username or Email is required");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordInputLayout.setError("Password is required");
            return;
        }

        Toast.makeText(this, "Welcome, " + username + "!", Toast.LENGTH_SHORT).show();
    }
}
