package com.refresh.pos.androidpopularlibrary;

/*Создать строковый “соединитель” с применением паттерна MVP без moxy.
Под строковым “соединителем” имеется ввиду экран с EditText, Button, TextView.
При введении текста в EditText и нажатии на Button текст отображается внизу на TextView.
При введении другого текста и нажатии от добавляется к существующему.
Например, ввели текст “счастье” и нажали на кнопку. Он появился в TextView.
Далее ввели слово “солнце” и нажали на кнопку.
Теперь в TextView должен быть текст “счастьесолнце”. И т.д. */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.refresh.pos.androidpopularlibrary.moxy.MoxyView;

public class MainView extends AppCompatActivity implements MainViewInterface {

    private Presenter presenter;
    private Button btnConcat;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
        btnConcat = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.textEdit);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void buttonClick(View view){
        presenter.onButtonClick(editText.getText().toString());
    }

    public void buttonGoMoxy(View view){
        Intent intent = new Intent(MainView.this, MoxyView.class);
        startActivity(intent);
    }

    public void setButtonText(String newText){
        textView.setText("Получается: " + newText);
    }
}
