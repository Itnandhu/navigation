package com.example.navigation.ui.NeedHelp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NeedHelpViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NeedHelpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is needhelp fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}