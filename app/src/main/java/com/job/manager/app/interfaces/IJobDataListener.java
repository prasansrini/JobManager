package com.job.manager.app.interfaces;

import com.job.manager.app.pojo.JobData;

public interface IJobDataListener {
    void onJobDataEvent(JobData jobData);

    void onError(Throwable t);
}
