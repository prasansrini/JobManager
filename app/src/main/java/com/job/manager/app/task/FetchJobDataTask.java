package com.job.manager.app.task;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.job.manager.app.interfaces.IJobDataListener;
import com.job.manager.app.network.APIClientHelper;
import com.job.manager.app.network.JobAPIInterface;
import com.job.manager.app.pojo.JobData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchJobDataTask extends AsyncTask<Void, Void, JobData> {
    private IJobDataListener mListener;

    FetchJobDataTask(IJobDataListener listener) {
        mListener = listener;
    }

    @Override
    protected JobData doInBackground(Void... voids) {
        fetchJobData();
        return null;
    }

    private void fetchJobData() {
        JobAPIInterface apiInterface = APIClientHelper.getInstance().create(JobAPIInterface.class);
        apiInterface.fetchJobData().enqueue(new APIResponseCallback());
    }

    private class APIResponseCallback implements Callback<JobData> {
        @Override
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            mListener.onJobDataEvent((JobData) response.body());
        }

        @Override
        public void onFailure(@NonNull Call call, @NonNull Throwable t) {
            mListener.onError(t);
        }
    }
}
