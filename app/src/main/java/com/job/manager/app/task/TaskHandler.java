package com.job.manager.app.task;

import com.job.manager.app.interfaces.IJobDataListener;

public final class TaskHandler {
    private static TaskHandler mTaskHandler;
    private IJobDataListener mListener;

    private TaskHandler(IJobDataListener listener) {
        mListener = listener;
    }

    public static TaskHandler getInstance(IJobDataListener listener) {
        if (mTaskHandler == null) {
            mTaskHandler = new TaskHandler(listener);
        }
        return mTaskHandler;
    }

    public void executeTask() {
        FetchJobDataTask fetchJobDataTask = new FetchJobDataTask(mListener);
        fetchJobDataTask.execute();
    }
}
