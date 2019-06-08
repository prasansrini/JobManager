package com.job.manager.app.view.activities;

import static com.job.manager.app.ApplicationConstants.TAG;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.job.manager.app.R;
import com.job.manager.app.databinding.ActivityMainBinding;
import com.job.manager.app.interfaces.IJobDataListener;
import com.job.manager.app.pojo.JobData;
import com.job.manager.app.pojo.VariantGroups;
import com.job.manager.app.view.adapter.JobAdapter;
import com.job.manager.app.viewmodel.JobViewModel;

public class MainActivity extends AppCompatActivity implements IJobDataListener {
    private ActivityMainBinding mActivityMainBinding;
    private JobViewModel mJobViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mJobViewModel = ViewModelProviders.of(this).get(JobViewModel.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mActivityMainBinding.setLifecycleOwner(this);
        mJobViewModel.setUpModule(this);
    }

    @Override
    public void onJobDataEvent(JobData jobData) {
        if (jobData != null) {
            Log.v(TAG, jobData.toString());
            VariantGroups[] variantGroups = jobData.getVariants().getVariantGroups();
            loadData(variantGroups);
        } else {
            Log.v(TAG, "JobData null");
        }
    }

    private void loadData(VariantGroups[] variantGroups) {
        if (variantGroups != null) {
            mJobViewModel.mVariation1.setValue(variantGroups[0].getName());
            mJobViewModel.mVariation2.setValue(variantGroups[1].getName());
            mJobViewModel.mVariation3.setValue(variantGroups[2].getName());

            mActivityMainBinding.setAdapter1(new JobAdapter(variantGroups[0].getVariations()));
            mActivityMainBinding.setAdapter2(new JobAdapter(variantGroups[1].getVariations()));
            mActivityMainBinding.setAdapter3(new JobAdapter(variantGroups[2].getVariations()));
        }
    }

    @Override
    public void onError(Throwable t) {
        Log.e(TAG, "Error: " + t.getLocalizedMessage());
    }
}
