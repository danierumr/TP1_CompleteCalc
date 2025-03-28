package inf311.daniel.completecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Text
        EditText textOp = (EditText) findViewById(R.id.text_op);

        // Button numbers
        Button btn0 = (Button) findViewById(R.id.button0);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);
        // Button operators
        Button btnPlus = (Button) findViewById(R.id.buttonplus);
        Button btnMinus = (Button) findViewById(R.id.buttonminus);
        Button btnMult = (Button) findViewById(R.id.buttonmult);
        Button btnDiv = (Button) findViewById(R.id.buttondiv);

        Button btnDel = (Button) findViewById(R.id.buttonbackspace);
        Button btnClear = (Button) findViewById(R.id.buttonclear);
        Button btnEqual = (Button) findViewById(R.id.buttonequal);

        // On click listeners
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn0.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn1.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn2.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn3.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn4.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn5.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn6.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn7.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn8.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btn9.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });




        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btnPlus.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btnMinus.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btnMult.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = btnDiv.getText().toString();
                textOp.setText(textOp.getText().toString() + text);
            }
        });



        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textOp.setText("");
            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = textOp.getText().toString();
                if (!current.isEmpty()) {
                    textOp.setText(current.substring(0, current.length() - 1));
                }
            }
        });


    }
}