package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int i = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.view);

        Button add, sub;
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);


        /*Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);*/


        /*View.OnClickListener addClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed add", Toast.LENGTH_SHORT)
                        .show();
                i++;
                editText.setText(String.valueOf(i));
            }
        };
*/
        add.setOnClickListener(this);

       /* View.OnClickListener subClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed sub", Toast.LENGTH_SHORT).show();
                i--;
                editText.setText(String.valueOf(i));
            }
        };*/

        sub.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add:
                i++;
                textView.setText(String.valueOf(i));
                break;
            case R.id.sub:
                i--;
                textView.setText(String.valueOf(i));
                break;

        }

    }
}
