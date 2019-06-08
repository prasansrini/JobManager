package com.job.manager.app.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.job.manager.app.R;
import com.job.manager.app.databinding.RecyclerViewJobItemBinding;
import com.job.manager.app.pojo.Variations;
import com.job.manager.app.viewmodel.JobItemViewModel;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.JobViewHolder> {
    private Variations[] mVariations;

    public JobAdapter(Variations[] variations) {
        mVariations = variations;
    }

    @NonNull
    @Override
    public JobViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        RecyclerViewJobItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.recycler_view_job_item, viewGroup,
                false);
        return new JobViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final JobViewHolder jobViewHolder, int position) {
        final JobItemViewModel jobItemViewModel = new JobItemViewModel();
        jobItemViewModel.mContent.setValue(mVariations[position].getName());
        jobItemViewModel.mImageUrl.setValue(mVariations[position].getLogo());

        jobViewHolder.bind(jobItemViewModel);
    }

    @Override
    public int getItemCount() {
        return mVariations.length;
    }

    class JobViewHolder extends RecyclerView.ViewHolder {
        RecyclerViewJobItemBinding mBinding;

        JobViewHolder(RecyclerViewJobItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        private void bind(JobItemViewModel viewModel) {
            mBinding.setViewModel(viewModel);
            mBinding.executePendingBindings();
        }
    }
}
