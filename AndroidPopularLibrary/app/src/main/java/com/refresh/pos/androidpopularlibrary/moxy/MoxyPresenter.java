package com.refresh.pos.androidpopularlibrary.moxy;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<MoxyViewInerface> {
    private MoxyModel model;

    public MoxyPresenter() {
        this.model = new MoxyModel();
    }

    private String addText(String text){
        return (model.getText() + text);
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public void onButtonClick(String newText) {
        model.setText(addText(newText));
        getViewState().setButtonText(model.getText());
    }
}
