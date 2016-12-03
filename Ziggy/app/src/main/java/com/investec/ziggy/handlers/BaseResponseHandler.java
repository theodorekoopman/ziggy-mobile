package com.investec.ziggy.handlers;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.investec.ziggy.BalanceActivity;
import com.investec.ziggy.common.BaseRest;
import com.investec.ziggy.common.StringDeserializer;
import com.investec.ziggy.models.portfoliomodels.Portfolio;
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
    private String responseText;

    @Override
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
        setResponseText(new String(responseBody, StandardCharsets.UTF_8));

        Gson gson = new Gson();
        T temp = gson.fromJson(responseText, getClassType());

        this.setInstance(temp);
    }


    @Override
    public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
        Toast.makeText(this.getActivity(), "Something went wrong, please try again", Toast.LENGTH_LONG);
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

    public String getResponseText() {
        return responseText;
    }

    protected void setResponseText(String responseText) {
        this.responseText = responseText;
    }
}
