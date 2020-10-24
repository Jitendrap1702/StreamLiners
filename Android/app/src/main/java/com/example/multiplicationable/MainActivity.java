package com.example.multiplicationtable;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.multiplicationtable.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           /**
         * we can write this line in place of below two lines
         * setContentView(R.layout.activity_main);
         */
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
    }

    /**
     * call when click on solve button
     * @param view
     */
    public void showTable(View view){
        EditText name = findViewById(R.id.editNumber);
        String input = name.getText().toString().trim();
        if(input.length() == 0){
            Toast.makeText(this, "Invalid input!", Toast.LENGTH_SHORT).show();
            return;
        }
        StringBuffer result = getTable(input);
        display(result);
    }

    /**
     * display the table
     * @param number
     */
    private void display(StringBuffer number) {
        TextView textview = (TextView) findViewById(R.id.textView);
        textview.setText(number);
    }

    /**
     * create the table
     * @param input
     * @return
     */
    private StringBuffer getTable(String input){
        int n = Integer.parseInt(input);
        StringBuffer builder = new StringBuffer();
        for(int i = 1 ; i <= 10 ; i++ ) {
            builder.append(n +" x " + i + " = " + n*i + "\n");
        }
        return builder;
    }
    /**
     * resetText method will call on click reset button
     * @param view
     */
    public void resetText(View view) {
        display();
    }
    /**
     * display when we press reset button
     */
    private void display() {
        TextView textview = (TextView) findViewById(R.id.textView);
        EditText editText =  (EditText) findViewById(R.id.editNumber) ;
        textview.setText("TEXT");
        editText.setText("");

    }
}
