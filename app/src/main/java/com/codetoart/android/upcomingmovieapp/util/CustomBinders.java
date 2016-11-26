package com.codetoart.android.upcomingmovieapp.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.codetoart.android.upcomingmovieapp.R;
import com.codetoart.android.upcomingmovieapp.data.local.PreferencesHelper;

import javax.inject.Inject;

/**
 * Created by mobisys2 on 11/26/2016.
 */

public class CustomBinders {
    @Inject
    PreferencesHelper mPreferencesHelper;

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String imageUrl) {
        String imageUrl2 = "http://image.tmdb.org/t/p/w500/"+imageUrl;
        CImageLoader.displayImage(imageView.getContext(), imageUrl2, imageView, R.drawable.place_holder);
    }
}
