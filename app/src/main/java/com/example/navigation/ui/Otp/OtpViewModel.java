package com.example.navigation.ui.Otp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OtpViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OtpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is otp fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}