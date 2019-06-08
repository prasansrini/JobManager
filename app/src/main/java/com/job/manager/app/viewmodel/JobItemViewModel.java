package com.job.manager.app.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.job.manager.app.util.CircleTransform;
import com.squareup.picasso.Picasso;

public class JobItemViewModel extends ViewModel {
    public MutableLiveData<String> mContent = new MutableLiveData<>();
    public MutableLiveData<String> mImageUrl = new MutableLiveData<>();

    @BindingAdapter("imageurl")
    public static void setImageUrl(ImageView imageView, String imageUrl) {
        if (imageUrl != null) {
            Picasso.get().load(imageUrl).transform(CircleTransform.getInstance()).into(imageView);
        }
    }
}
