package app.calculator.tiny.money;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Improve extends AppCompatActivity {

    TextView moneys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_improve);

       Button laptop1 = (Button) findViewById(R.id.laptop1);

        Button back = (Button) findViewById(R.id.back);

        moneys = (TextView) findViewById(R.id.moneys);

        LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
        LinearLayout layout2 = (LinearLayout) findViewById(R.id.layout2);
        LinearLayout layout3 = (LinearLayout) findViewById(R.id.layout3);
        LinearLayout layout4 = (LinearLayout) findViewById(R.id.layout4);


        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (Improve.this, MainActivity.class);
                startActivity(intent);

            }
        });


        laptop1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                if(MainActivity.coutMoney >=500){
                    MainActivity.money +=5;
                    MainActivity.next_day.setBackgroundResource(R.drawable.baksov5);
                    MainActivity.coutMoney -=500;
                    MainActivity.textMoney.setText(MainActivity.coutMoney + "$ ");

                }
            }


        });
        Button laptop2 = (Button) findViewById(R.id.laptop2);

        laptop2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                if(MainActivity.coutMoney >=1000){
                    MainActivity.money +=10;
                    MainActivity.next_day.setBackgroundResource(R.drawable.baksov10);
                    MainActivity.coutMoney -=1000;
                    MainActivity.textMoney.setText(MainActivity.coutMoney + "$ ");
                }
            }


        });
        Button laptop3 = (Button) findViewById(R.id.laptop3);

        laptop3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                if(MainActivity.coutMoney >=5000){
                    MainActivity.money +=50;
                    MainActivity.next_day.setBackgroundResource(R.drawable.baksov50);
                    MainActivity.coutMoney -=5000;
                    MainActivity.textMoney.setText(MainActivity.coutMoney + "$ ");
                }
            }


        });
        Button laptop4 = (Button) findViewById(R.id.laptop4);

        laptop4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                if(MainActivity.coutMoney >=10000){
                    MainActivity.money +=100;
                    MainActivity.next_day.setBackgroundResource(R.drawable.baksov100);
                    MainActivity.coutMoney -=10000;
                    MainActivity.textMoney.setText(MainActivity.coutMoney + "$ ");
                }
            }


        });


    }
    public void onStart() {
        super.onStart();
        moneys.setText(MainActivity.coutMoney + "$ ");
    }
}

