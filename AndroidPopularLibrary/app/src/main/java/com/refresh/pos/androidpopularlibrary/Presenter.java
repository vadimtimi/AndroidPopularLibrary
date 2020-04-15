package com.refresh.pos.androidpopularlibrary;

public class Presenter {
    private Model model;
    private MainView mainView;

    public Presenter(MainView mainView){
        this.mainView = mainView;
        model = new Model();
    }

    private String addText(String text){
        return (model.getText() + text);
    }

    public void onButtonClick(String newText){
        model.setText(addText(newText));
        mainView.setButtonText(model.getText());
    }

}
