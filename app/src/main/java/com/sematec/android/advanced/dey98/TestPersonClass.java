package com.sematec.android.advanced.dey98;

import android.util.Log;

public class TestPersonClass {

    static double P = 3.14;

    public void setPerson(TestPersonInterface tpi) {
        if (tpi.getName() != null)
            tpi.printName();
        else
            Log.d("TAG", "Name is not provided");
    }

    public static void aStaticFunction(){

    }
}
