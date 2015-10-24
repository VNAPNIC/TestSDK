package vcc.soha.sdk.module.anim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by Admin on 10/23/2015.
 */
public class SAnimationUtils {

    /**
     * ScaleX
     *
     * @param view
     */
    public static void animatorScaleX(View view) {
        ObjectAnimator animatorScaleX = ObjectAnimator.ofFloat(view, "scaleX" ,0.5F, 0.8F, 1.0F);
        animatorScaleX.setDuration(1000);
        animatorScaleX.start();
    }

    /**
     * ScaleY
     *
     * @param view
     */
    public static void animatorScaleY(View view) {
        ObjectAnimator animatorScaleY = ObjectAnimator.ofFloat(view, "scaleY", 0.5F, 0.8F, 1.0F);
        animatorScaleY.setDuration(1000);
        animatorScaleY.start();
    }

    /**
     * TranslateY
     *
     * @param view
     */
    public static void animatorTranslateY(View view){
        ObjectAnimator animatorTranslateY = ObjectAnimator.ofFloat(view, "translationY", -75, 0);
        animatorTranslateY.setDuration(1000);
        animatorTranslateY.start();
    }

    /**
     * TranslateX
     *
     * @param view
     */
    public static void animatorTranslateX(View view){
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(view, "translationX", -50, 50, -30, 30, -20, 20, -5, 5, 0);
        animatorTranslateX.setDuration(1000);
        animatorTranslateX.start();
    }

    /**
     * Alpha
     *
     * @param view
     */
    public static void animatorAlpha(View view){
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f);
        anim.setDuration(1000);
        anim.start();
    }

    /**
     * XY
     *
     * @param view
     */
    public static void animatorXY(View view){
        ObjectAnimator animX = ObjectAnimator.ofFloat(view, "x", 50f);
        ObjectAnimator animY = ObjectAnimator.ofFloat(view, "y", 100f);
        AnimatorSet animSetXY = new AnimatorSet();
        animSetXY.playTogether(animX, animY);
        animSetXY.start();
    }

}
