package com.example.jason.jobdeadline;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingleton{
    private static Context context;
    private static MySingleton mySingleton;
    private static RequestQueue requestQueue;

    public MySingleton(Context context) {
        this.context = context;
        requestQueue = getRequestQueue();
    }

    public static RequestQueue getRequestQueue() {
        if(requestQueue == null){
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }

        return requestQueue;
    }

    public static synchronized MySingleton getMySingleton(Context context){
        if(mySingleton == null){
            mySingleton = new MySingleton(context);
        }
        return  mySingleton;
    }
}