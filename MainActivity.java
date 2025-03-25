package com.example.slip9q1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText num1EditText, num2EditText;
    Button validateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        validateButton = findViewById(R.id.validateButton);
        validateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1String = num1EditText.getText().toString();
                String num2String = num2EditText.getText().toString();
                if (num1String.isEmpty() || num2String.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }
                int num1 = Integer.parseInt(num1String);
                int num2 = Integer.parseInt(num2String);
                if (num1 > 10 && num2 > 10) {
                    Toast.makeText(MainActivity.this, "Both numbers are greater than 10. Please enter new numbers.", Toast.LENGTH_LONG).show();
                    num1EditText.setText("");
                    num2EditText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Number 1: " + num1 + "\nNumber 2: " + num2, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
