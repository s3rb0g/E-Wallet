package com.example.e_chest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Submit;
    private EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        Submit = findViewById(R.id.sub);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enteredUsername = Username.getText().toString();
                String enteredPassword = Password.getText().toString();

                if(enteredUsername.equals("admin") && enteredPassword.equals("admin")){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Incorrect username/password", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
