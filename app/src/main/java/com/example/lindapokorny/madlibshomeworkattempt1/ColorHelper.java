package com.example.lindapokorny.madlibshomeworkattempt1;

import android.content.Context;
import android.support.v4.content.ContextCompat;

public class ColorHelper {

    public static String[] BACKGROUND_COLOR_ARRAY = {"red", "pink2", "colorPrimary", "colorPrimaryDark", "colorAccent",
            "colorWhite", "light_green2", "pink", "purple", "deep_purple",
            "indigo", "blue", "light_blue", "cyan", "teal", "green",
            "light_green", "lime", "yellow", "amber", "orange", "deep_orange",
            "brown", "grey", "blue_grey", "black"};

    public static int getColorId(Context context, String color) {
        int colorResourceName = context.getResources().getIdentifier(color,
                "color", context.getPackageName());
        return ContextCompat.getColor(context, colorResourceName);
    }

}
