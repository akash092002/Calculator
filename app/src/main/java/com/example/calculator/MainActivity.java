package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView operationTextView;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operationTextView  = findViewById(R.id.operationTextView);
        resultTextView = findViewById(R.id.resultTextView);

        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);
        Button fourButton = findViewById(R.id.fourButton);
        Button fiveButton = findViewById(R.id.fiveButton);
        Button sixButton = findViewById(R.id.sixButton);
        Button sevenButton = findViewById(R.id.sevenButton);
        Button eightButton = findViewById(R.id.eightButton);
        Button nineButton = findViewById(R.id.nineButton);
        Button zeroZeroButton = findViewById(R.id.zeroZeroButton);
        Button zeroButton = findViewById(R.id.zeroButton);
        Button dotButton = findViewById(R.id.dotButton);

        Button clearButton = findViewById(R.id.clearButton);
        Button percentButton = findViewById(R.id.percentButton);
        Button divisionButton = findViewById(R.id.divisionButton);
        Button multiplicationButton = findViewById(R.id.multiplicationButton);
        Button subtractionButton = findViewById(R.id.subtractionButton);
        Button additionButton = findViewById(R.id.additionButton);
        Button equalsButton = findViewById(R.id.equalsButton);

        ImageView deleteImageView = findViewById(R.id.deleteImageView);



        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + oneButton.getText().toString());
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + twoButton.getText().toString());
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + threeButton.getText().toString());
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + fourButton.getText().toString());
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + fiveButton.getText().toString());
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText(operationTextView.getText().toString() + sixButton.getText().toString());

            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + sevenButton.getText().toString());
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + eightButton.getText().toString());
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearZeroOnOperationTextView();
                operationTextView.setText( operationTextView.getText().toString() + nineButton.getText().toString());
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationTextView.setText( operationTextView.getText().toString() + zeroButton.getText().toString());
            }
        });

        zeroZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationTextView.setText( operationTextView.getText().toString() + zeroZeroButton.getText().toString());
            }
        });

        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationTextView.setText( operationTextView.getText().toString() + dotButton.getText().toString());
            }
        });

        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationTextView.setText( operationTextView.getText().toString() + percentButton.getText().toString());
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operationTextView.getText().toString().endsWith("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "/");
                }
                else if(operationTextView.getText().toString().contains("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "/");
                }
                else if(operationTextView.getText().toString().contains("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "/");
                }
                else if(operationTextView.getText().toString().contains("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }

                else if( operationTextView.getText().toString().endsWith("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "/");
                }
                else if(operationTextView.getText().toString().contains("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else{
                    operationTextView.setText( operationTextView.getText().toString() + divisionButton.getText().toString());
                }
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operationTextView.getText().toString().endsWith("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "x");
                }
                else if(operationTextView.getText().toString().contains("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "x");
                }
                else if(operationTextView.getText().toString().contains("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "x");
                }
                else if(operationTextView.getText().toString().contains("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }

                else if( operationTextView.getText().toString().endsWith("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "x");
                }
                else if(operationTextView.getText().toString().contains("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else{
                    operationTextView.setText( operationTextView.getText().toString() + multiplicationButton.getText().toString());
                }
            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operationTextView.getText().toString().endsWith("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "-");
                }
                else if(operationTextView.getText().toString().contains("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "-");
                }
                else if(operationTextView.getText().toString().contains("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "-");
                }
                else if(operationTextView.getText().toString().contains("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }

                else if( operationTextView.getText().toString().endsWith("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "-");
                }
                else if(operationTextView.getText().toString().contains("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else{
                    operationTextView.setText( operationTextView.getText().toString() + subtractionButton.getText().toString());
                }
            }
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operationTextView.getText().toString().endsWith("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "+");
                }
                else if(operationTextView.getText().toString().contains("-"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "+");
                }
                else if(operationTextView.getText().toString().contains("+"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else if( operationTextView.getText().toString().endsWith("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "+");
                }
                else if(operationTextView.getText().toString().contains("/"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }

                else if( operationTextView.getText().toString().endsWith("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString().substring(0,operationTextView.getText().toString().length()-1) + "+");
                }
                else if(operationTextView.getText().toString().contains("x"))
                {
                    operationTextView.setText(operationTextView.getText().toString() + "");
                }
                else{
                    operationTextView.setText( operationTextView.getText().toString() + additionButton.getText().toString());
                }

            }
        });


        deleteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String delete =  operationTextView.getText().toString();
                int length = delete.length();

                try{
                    String cut = delete.substring(0,length-1);
                    operationTextView.setText(cut);
                }catch (StringIndexOutOfBoundsException e1)
                {
                    e1.printStackTrace();
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationTextView.setText("0");
                resultTextView.setText("");
            }
        });

        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operation = operationTextView.getText().toString();
                if(operation.contains("/")){
                    String []s = operation.split("\\/");
                    resultTextView.setText("=" + String.valueOf(Double.parseDouble(s[0])*100 / Double.parseDouble(s[1])));
                }
                else {
                    resultTextView.setText(String.valueOf(Double.parseDouble(operation)* 0.01));
                }
            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operation = operationTextView.getText().toString();

                if(operation.contains("+"))
                {
                    String[] s =operation.split("\\+");
                    resultTextView.setText( "=" + String.valueOf(Double.parseDouble(s[0]) + Double.parseDouble(s[1])).replace(".0"," "));
                }

                else if(operation.contains("-"))
                {
                    String[] s =operation.split("\\-");
                    resultTextView.setText( "=" + String.valueOf(Double.parseDouble(s[0]) - Double.parseDouble(s[1])).replace(".0"," "));
                }

                else if(operation.contains("x"))
                {
                    String[] s =operation.split("x");
                    resultTextView.setText( "=" + String.valueOf(Double.parseDouble(s[0]) * Double.parseDouble(s[1])).replace(".0"," "));

                }

                else if(operation.contains("/"))
                {
                    String[] s =operation.split("\\/");
                    resultTextView.setText("=" + String.valueOf(Double.parseDouble(s[0]) / Double.parseDouble(s[1])).replace(".0"," "));

                }
                else {

                    resultTextView.setText(operationTextView.getText().toString());

                }

            }


        });





    }

    void clearZeroOnOperationTextView()
    {
        String s = operationTextView.getText().toString();
        if(s.equals("0")) {
            operationTextView.setText("");
        }
    }

    void clearBeforeOperator()
    {
        String s = operationTextView.getText().toString();
        if(s.contains("+"))
        {

        }
    }
}