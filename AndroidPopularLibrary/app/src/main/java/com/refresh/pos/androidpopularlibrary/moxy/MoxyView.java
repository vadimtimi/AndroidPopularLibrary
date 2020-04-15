package com.refresh.pos.androidpopularlibrary.moxy;

// Создать строковый “соединитель” с применением паттерна MVP с помощью moxy.

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import moxy.MvpAppCompatActivity;
import moxy.MvpView;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

import com.refresh.pos.androidpopularlibrary.R;
import com.refresh.pos.androidpopularlibrary.moxy.MoxyPresenter;

public class MoxyView extends MvpAppCompatActivity implements MoxyViewInerface {

    private Button btnConcat;
    private EditText editText;
    private TextView textView;

    @InjectPresenter
    MoxyPresenter presenter;

//    @ProvidePresenter
//    public MoxyPresenter providePresenter() {
//        return new MoxyPresenter();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxy);

        btnConcat = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.textEdit);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void buttonClick(View view) {
        presenter.onButtonClick(editText.getText().toString());
    }

    @Override
    public void setButtonText(String newText) {
        textView.setText("Получается: " + newText);
    }
}
