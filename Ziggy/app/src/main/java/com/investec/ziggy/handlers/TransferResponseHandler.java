package com.investec.ziggy.handlers;

/**
 * Created by Theodore.Koopman on 2016/12/03.
 */

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.google.gson.Gson;
import com.investec.ziggy.BalanceActivity;
import com.investec.ziggy.apimodels.TransferModel;
import com.investec.ziggy.common.PortfolioManager;
import com.investec.ziggy.models.portfoliomodels.Portfolio;

import java.nio.charset.StandardCharsets;

import cz.msebera.android.httpclient.Header;


public class TransferResponseHandler extends BaseResponseHandler<TransferModel> {
    public TransferResponseHandler(Context context) {
        super(context, TransferModel.class);
    }

    @Override
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
        setResponseText(new String(responseBody, StandardCharsets.UTF_8));

        Toast.makeText(this.getActivity(), "Transfer Successful", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
        Toast.makeText(this.getActivity(), "Oops something went wrong...", Toast.LENGTH_LONG).show();
    }
}
