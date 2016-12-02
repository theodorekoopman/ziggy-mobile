package com.investec.ziggy.handlers;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.google.gson.Gson;
import com.investec.ziggy.BalanceActivity;
import com.investec.ziggy.models.portfoliomodels.Portfolio;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.ResponseHandlerInterface;

import java.nio.charset.StandardCharsets;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class LoginResponseHandler extends BaseResponseHandler<Portfolio> {
    public LoginResponseHandler(Context context) {
        super(context, Portfolio.class);
    }

    @Override
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
        super.onSuccess(statusCode, headers, responseBody);
        Toast.makeText(this.getActivity(), "Success", Toast.LENGTH_LONG);

        Intent intent = new Intent(this.getActivity(), BalanceActivity.class);
        this.getActivity().startActivity(intent);

    }


    @Override
    public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
        Toast.makeText(this.getActivity(), "Failed", Toast.LENGTH_LONG);
    }
}
