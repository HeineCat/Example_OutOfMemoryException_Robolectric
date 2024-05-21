package com.example.myapplication;

import android.graphics.drawable.Drawable;

import java.io.IOException;
import java.io.InputStream;

public class BugClass {

    MyInputStream mMyInputStream;

    public BugClass(final MyInputStream myInputStream) {
        mMyInputStream = myInputStream;
    }

    public Boolean doSomething() throws IOException {
        InputStream inputStream = mMyInputStream.getInputStream();
        Drawable.createFromStream(inputStream, null); // OutOfMemory
        return true;
    }

}
