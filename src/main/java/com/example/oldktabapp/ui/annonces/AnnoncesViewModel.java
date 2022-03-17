package com.example.oldktabapp.ui.annonces;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnnoncesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AnnoncesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}