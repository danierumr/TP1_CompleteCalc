package inf311.daniel.completecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean resultShowing = false;
    private boolean errorShowing = false;
    private boolean oneOperator = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Text
        EditText textOp = (EditText) findViewById(R.id.text_op);

        // Button numbers
        int[] numberBtnIds = {
                R.id.button0, R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6, R.id.button7,
                R.id.button8, R.id.button9, R.id.buttondot
        };

        for (int id : numberBtnIds) {
            Button btn = findViewById(id);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text = btn.getText().toString();

                    if(resultShowing || errorShowing) {
                        textOp.setText(text);
                        resultShowing = false;
                        errorShowing = false;
                        oneOperator = false;
                    } else {
                        textOp.setText(textOp.getText().toString() + text);
                    }
                }
            });
        }

        // Button operators
        int[] opBtnIds = {
                R.id.buttonplus, R.id.buttonminus, R.id.buttonmult, R.id.buttondiv
        };

        for (int id : opBtnIds) {
            Button btn = findViewById(id);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(oneOperator) {return;}
                    oneOperator = true;

                    String text = btn.getText().toString();

                    if(errorShowing) {
                        textOp.setText(text);
                        errorShowing = false;
                    } else {
                        textOp.setText(textOp.getText().toString() + text);
                    }

                    resultShowing = false;
                }
            });
        }

        // Unique
        Button btnDel = (Button) findViewById(R.id.buttonbackspace);
        Button btnClear = (Button) findViewById(R.id.buttonclear);
        Button btnEqual = (Button) findViewById(R.id.buttonequal);

        // Unique On click listeners
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textOp.setText("");
                oneOperator = false;
            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(errorShowing){
                    errorShowing = false;
                    oneOperator = false;
                    textOp.setText("");
                }
                String current = textOp.getText().toString();
                if (!current.isEmpty()) {
                    String newExpr = current.substring(0, current.length()-1);

                    if (!(newExpr.contains("+") || newExpr.contains("-") ||
                            newExpr.contains("*") || newExpr.contains("/"))) {
                        oneOperator = false;
                    }

                    textOp.setText(newExpr);
                    resultShowing = false;
                } else {
                    errorShowing = false;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String operation = textOp.getText().toString();
                    if (operation.isEmpty()) {
                        textOp.setText("");
                        return;
                    }

                    double res = calculateExpr(operation);
                    textOp.setText(String.valueOf(res));
                } catch (Exception e) {
                    textOp.setText("ERROR");
                    errorShowing = true;
                    return;
                }
                resultShowing = true;
                oneOperator = false;
            }
        });
    }

    private double calculateExpr(String operation) throws Exception {
        if (operation.contains("+")) {
            String[] parts = operation.split("\\+");
            return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        } else if (operation.contains("-")) {
            String[] parts = operation.split("-");
            return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        } else if (operation.contains("X")) {
            String[] parts = operation.split("X");
            return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        } else if (operation.contains("/")) {
            String[] parts = operation.split("/");
            double divisor = Double.parseDouble(parts[1]);
            if (divisor == 0) throw new ArithmeticException("Division by zero");
            return Double.parseDouble(parts[0]) / divisor;
        }
        throw new Exception("Invalid Expression");
    }
}