package com.example.navigation.ui.MySubscriptions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MySubscriptionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MySubscriptionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mysubscription fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}