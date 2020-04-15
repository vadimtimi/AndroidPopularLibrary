package com.refresh.pos.androidpopularlibrary.moxy;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MoxyViewInerface extends MvpView{

    @StateStrategyType(value = AddToEndStrategy.class)
    void setButtonText(String newText);
}
