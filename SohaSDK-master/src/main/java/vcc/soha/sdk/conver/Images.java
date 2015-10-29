package vcc.soha.sdk.conver;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

/**
 * Created by Admin on 10/27/2015.
 */
public class Images {
    public static Bitmap NameToBitmap(String imgName,Context context){

        int res = context.getResources().getIdentifier(imgName, "drawable", context.getPackageName());
        Log.d("res", res + "");
        //conver drawable to bitmap
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(),
                res);
        return bitmap;
    }
    public static Drawable ResourcesToDrawable(int imgResources,Context context){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return context.getResources().getDrawable(imgResources,context.getTheme());
        }else{
            return context.getResources().getDrawable(imgResources);
        }
    }



}
