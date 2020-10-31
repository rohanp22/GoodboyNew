package com.example.goodboy.ui.home;

import android.os.Handler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mText.setValue("Text changed");
            }
        }, 10000);
    }

    public LiveData<String> getText() {
        return mText;
    }
}