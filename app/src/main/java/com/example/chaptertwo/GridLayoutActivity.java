package com.example.chaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GridLayoutActivity extends AppCompatActivity {


     private boolean add,subt,mul,divid;
     private double fNum,sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        final TextView txtInput = findViewById(R.id.txtInput);
        final Button clear = findViewById(R.id.clear);
        final Button mod = findViewById(R.id.mod);
        final Button div = findViewById(R.id.div);
        final Button multi = findViewById(R.id.multi);
        final Button sub = findViewById(R.id.sub);
        final Button plus = findViewById(R.id.plus);
        final Button equals = findViewById(R.id.equals);
        final Button one = findViewById(R.id.one);
        final Button two = findViewById(R.id.two);
        final Button three = findViewById(R.id.three);
        final Button four = findViewById(R.id.four);
        final Button five = findViewById(R.id.five);
        final Button six = findViewById(R.id.six);
        final Button seven = findViewById(R.id.seven);
        final Button eight = findViewById(R.id.eight);
        final Button nine = findViewById(R.id.nine);
        final Button zero = findViewById(R.id.zero);
        final Button dot = findViewById(R.id.dot);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum=Double.parseDouble(txtInput.getText()+"");
                add=true;
                txtInput.setText(null);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum=Double.parseDouble(txtInput.getText()+"");
                subt=true;
                txtInput.setText(null);

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum=Double.parseDouble(txtInput.getText()+"");
                mul=true;
                txtInput.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum=Double.parseDouble(txtInput.getText()+"");
                divid=true;
                txtInput.setText(null);

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum=Double.parseDouble(txtInput.getText()+"");
                if(add==true)
                {
                    txtInput.setText(fNum+sNum+"");
                    add=false;
                }
                if(subt==true)
                {
                    txtInput.setText(fNum-sNum+"");
                    subt=false;
                }
                if(mul==true)
                {
                    txtInput.setText(fNum*sNum+"");
                    mul=false;
                }
                if(divid==true)
                {
                    txtInput.setText(fNum/sNum+"");
                    divid=false;
                }

            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements = txtInput.getText().toString();
                int length = displayedElements.length();

                if(length > 0){
                    displayedElements = displayedElements.substring(0,length-1);
                    txtInput.setText(displayedElements);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText("");
            }
        });
    }

    }

