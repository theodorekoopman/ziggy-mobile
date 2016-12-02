package com.investec.ziggy.common;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.investec.ziggy.handlers.LoginResponseHandler;
import com.investec.ziggy.models.portfoliomodels.Portfolio;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class BaseRest<TRequest, TResponse> {

    public BaseRest(Context context) {
        this.setActivity(context);
    }

    private Context activity;

    public TResponse get(String url, AsyncHttpResponseHandler handler) throws IllegalAccessException, InstantiationException {
        TResponse result = null;
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.get(url, handler);
        } catch (Exception e) {
            Log.e("MainActivity", e.getMessage(), e);
        }
        return result;
    }

    public void post(String url, TRequest instance, AsyncHttpResponseHandler handler) throws JSONException, UnsupportedEncodingException {
        JSONObject jsonParams = new JSONObject();
        Gson gson = new Gson();
        String instanceJson = gson.toJson(instance);


        jsonParams.put("DynamicClass", instanceJson);
        StringEntity entity = new StringEntity(jsonParams.toString());
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.post(this.getActivity(), url, entity, "application/json", handler);
        } catch (Exception e) {
            Log.e("MainActivity", e.getMessage(), e);
        }
    }

    public Context getActivity() {
        return activity;
    }

    public void setActivity(Context activity) {
        this.activity = activity;
    }
}
