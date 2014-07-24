package tv.present.present;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.Display;


/**
 * Created by kbw28 on 7/24/14.
 */
public final class AndroidUtilityFunctions {

    public int[] getScreenDimens(Context context) {

        // Get a window manager to get the default display size
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        int width = size.x;
        int height = size.y;

        // Set the final product
        int[] retVal = new int[2];
        retVal[0] = width;
        retVal[1] = height;

        return retVal;

    }

    public int getScreenWidth(Context context) {
        return this.getScreenDimens(context)[0];
    }

    public int getScreenHeight(Context context) {
        return this.getScreenDimens(context)[1];
    }

}
