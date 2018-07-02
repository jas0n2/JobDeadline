package com.example.jason.jobdeadline;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class Service extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
