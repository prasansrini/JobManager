package com.job.manager.app.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.job.manager.app.interfaces.IJobDataListener;
import com.job.manager.app.task.TaskHandler;

public class JobViewModel extends ViewModel {
    public MutableLiveData<String> mVariation1 = new MutableLiveData<>();
    public MutableLiveData<String> mVariation2 = new MutableLiveData<>();
    public MutableLiveData<String> mVariation3 = new MutableLiveData<>();

    public void setUpModule(IJobDataListener listener) {
        TaskHandler.getInstance(listener).executeTask();
    }

}
