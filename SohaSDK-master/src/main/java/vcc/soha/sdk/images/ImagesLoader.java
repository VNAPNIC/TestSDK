package vcc.soha.sdk.images;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;


/**
 * Created by Admin on 10/27/2015.
 */
public class ImagesLoader {

    int mwidth = 0;
    int mheight = 0;
    private Context context;

    public ImagesLoader(Context context) {
        this.context = context;
    }

    public ImagesLoader SimpleTarget(int width, int height) {
        this.mwidth = width;
        this.mheight = height;
        return this;
    }

    /**
     * @param view     ImagesView
     * @param drawable Drawable error & placeholder
     * @param URL      String Url
     */
    public ImagesLoader ConverGIF(@NonNull final ImageView view, @Nullable Drawable drawable, @NonNull String URL) {
        SimpleTarget<GifDrawable> into = Glide.with(context)
                .load(URL)
                .asGif()
                .skipMemoryCache(true)
                .centerCrop()
                .placeholder(drawable)
                .crossFade()
                .error(drawable)
                .into(new SimpleTarget<GifDrawable>(mwidth, mheight) {
                    @Override
                    public void onResourceReady(GifDrawable resource, GlideAnimation<? super GifDrawable> glideAnimation) {
                        resource.start();
                        view.setImageDrawable(resource);
                    }
                });
        return this;
    }


}
