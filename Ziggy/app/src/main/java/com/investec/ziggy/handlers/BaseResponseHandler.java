package com.investec.ziggy.handlers;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.google.gson.Gson;
import com.investec.ziggy.BalanceActivity;
import com.investec.ziggy.common.BaseRest;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.nio.charset.StandardCharsets;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class BaseResponseHandler<T> extends AsyncHttpResponseHandler {

    public BaseResponseHandler(Context context, Class<T> tClass) {
        this.setActivity(context);
        this.setClassType(tClass);
    }

    private Context activity;
    private Class<T> classType;
    private T instance;

    @Override
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
        String responseText = new String(responseBody, StandardCharsets.UTF_8);

        Gson gson = new Gson();
        this.setInstance(gson.fromJson(responseText, getClassType()));
    }


    @Override
    public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
        Toast.makeText(this.getActivity(), "Failed", Toast.LENGTH_LONG);
    }

    protected Context getActivity() {
        return activity;
    }

    protected void setActivity(Context activity) {
        this.activity = activity;
    }

    protected Class<T> getClassType() {
        return classType;
    }

    protected void setClassType(Class<T> classType) {
        this.classType = classType;
    }

    protected T getInstance() {
        return instance;
    }

    protected void setInstance(T instance) {
        this.instance = instance;
    }
}
