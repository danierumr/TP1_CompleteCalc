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

        Button btnDot = (Button) findViewById(R.id.buttondot);
        Button btnDel = (Button) findViewById(R.id.buttonbackspace);
        Button btnClear = (Button) findViewById(R.id.buttonclear);
        Button btnEqual = (Button) findViewById(R.id.buttonequal);

        // On click listeners
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn0.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn1.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn2.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn3.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn4.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn5.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn6.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn7.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn8.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btn9.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });




        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(oneOperator) {
                    return;
                }
                oneOperator = true;

                String text = btnPlus.getText().toString();

                if(errorShowing) {
                    textOp.setText(text);
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

                resultShowing = false;


            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(oneOperator) {
                    return;
                }
                oneOperator = true;

                String text = btnMinus.getText().toString();

                if(errorShowing) {
                    textOp.setText(text);
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

                resultShowing = false;

            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(oneOperator) {
                    return;
                }
                oneOperator = true;

                String text = btnMult.getText().toString();

                if(errorShowing) {
                    textOp.setText(text);
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

                resultShowing = false;

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(oneOperator) {
                    return;
                }
                oneOperator = true;

                String text = btnDiv.getText().toString();

                if(errorShowing) {
                    textOp.setText(text);
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

                resultShowing = false;

            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = btnDot.getText().toString();

                if(resultShowing || errorShowing) {
                    textOp.setText(text);
                    resultShowing = false;
                    errorShowing = false;
                } else {
                    textOp.setText(textOp.getText().toString() + text);
                }

            }
        });



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
                    textOp.setText("ERROR!");
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