package com.example.ngovolunteerapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    EditText etName, etContact, etCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        etName = findViewById(R.id.etName);
        etContact = findViewById(R.id.etContact);
        etCity = findViewById(R.id.etCity);
    }

    public void submitForm(android.view.View view) {
        String name = etName.getText().toString();
        String contact = etContact.getText().toString();
        String city = etCity.getText().toString();

        if (name.isEmpty() || contact.isEmpty() || city.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Thank you, " + name + "!", Toast.LENGTH_LONG).show();
        }
    }
}
