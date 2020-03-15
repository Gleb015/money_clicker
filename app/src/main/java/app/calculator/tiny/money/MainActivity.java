package app.calculator.tiny.money;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    static  public int coutMoney;
    static  public int money = 100;
    static  public Button next_day, improve;
    static  public TextView textMoney;
    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";

    ImageView anim_image;
    //Объявляем использование анимации AnimationDrawable
    AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_day = (Button) findViewById(R.id.next_day);
        improve = (Button) findViewById(R.id.improve);
        textMoney = (TextView) findViewById(R.id.money);

        Next_day();
        loadText();
    }
    void Next_day() {

        next_day.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                coutMoney += money;
                textMoney.setText(coutMoney + " $");

                saveText();
            }
        });


    improve.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View view){
            Intent intent = new Intent (MainActivity.this, Improve.class);
            startActivity(intent);

        }
    });
}





    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putInt("money", coutMoney);
        ed.commit();
      //  Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        coutMoney = sPref.getInt("money", 0);


     //   Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

}