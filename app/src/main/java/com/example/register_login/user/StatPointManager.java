package com.example.register_login.user;

import android.widget.TextView;

public class StatPointManager {

    int _remainingStatPoint;
    TextView _TextViewForRemainingStatPoint;

    public StatPointManager(int remainingStatPoint, TextView TextViewForRemainingStatPoint) {
        this._remainingStatPoint = remainingStatPoint;
        this._TextViewForRemainingStatPoint = TextViewForRemainingStatPoint;
    }

    public int statPlus(int CurrentStatPoint, TextView TextViewForCurrentStatPoint){
        if(_remainingStatPoint>=1) {
            _remainingStatPoint -= 1;
            CurrentStatPoint += 1;
            TextViewForCurrentStatPoint.setText("" + CurrentStatPoint);
            _TextViewForRemainingStatPoint.setText("" + _remainingStatPoint);
            return CurrentStatPoint;
        }
        return CurrentStatPoint;
    }

    public int statMinus(int CurrentStatPoint, TextView TextViewForCurrentStatPoint){
        if(CurrentStatPoint>1){
            CurrentStatPoint -= 1;
            _remainingStatPoint += 1;
            TextViewForCurrentStatPoint.setText("" + CurrentStatPoint);
            _TextViewForRemainingStatPoint.setText("" + _remainingStatPoint);
            return CurrentStatPoint;
        }
        return CurrentStatPoint;
    }

}
