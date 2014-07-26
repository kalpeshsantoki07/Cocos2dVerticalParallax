package com.customclasses;

import android.util.Log;

public class LogM
{
    public static void e(String msg)
    {
	Log.e("log_tag", msg);
    }

    public static void d(String msg)
    {
	Log.d("log_tag", msg);
    }

    public static void i(String msg)
    {
	Log.i("log_tag", msg);
    }

    public static void v(String msg)
    {
	Log.v("log_tag", msg);
    }

    public static void w(String msg)
    {
	Log.w("log_tag", msg);
    }
}
