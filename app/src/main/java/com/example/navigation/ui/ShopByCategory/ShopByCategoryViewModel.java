package com.example.navigation.ui.ShopByCategory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShopByCategoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShopByCategoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is shopbycategory fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}