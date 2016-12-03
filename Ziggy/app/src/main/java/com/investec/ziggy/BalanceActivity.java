package com.investec.ziggy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.investec.ziggy.adapters.ChildBalanceAdapter;
import com.investec.ziggy.common.PortfolioManager;
import com.investec.ziggy.listeners.ChildSelectionListener;
import com.investec.ziggy.models.ChildBalanceViewModel;
import com.investec.ziggy.models.portfoliomodels.ChildAccount;
import com.investec.ziggy.models.portfoliomodels.Portfolio;

import java.util.ArrayList;
import java.util.List;

public class BalanceActivity extends AppCompatActivity {

    private List<ChildBalanceViewModel> childrenList;
    private ChildBalanceAdapter childrenAdapter;
    private ListView childrenListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        Portfolio portfolio = PortfolioManager.getInstance().getPortfolio();

        TextView title = (TextView)this.findViewById(R.id.balancesTitle);
        title.setText("Hello " + portfolio.getParentAccount().getName());

        TextView accountNumber = (TextView)this.findViewById(R.id.accountnumber);
        accountNumber.setText(portfolio.getParentAccount().getAccountNumber().toString());

        TextView parentBalance = (TextView)this.findViewById(R.id.parentBalance);
        parentBalance.setText( "R" + new Integer(portfolio.getParentAccount().getBalance()).toString());

        this.setChildrenList(new ArrayList<ChildBalanceViewModel>());
        for(ChildAccount childAccount:portfolio.getChildAccounts()) {
            String name = childAccount.getName();
            String balance = "R" + new Integer(childAccount.getBalance()).toString();
            String photoId = childAccount.getUserName();

            this.getChildrenList().add(new ChildBalanceViewModel(name, balance, photoId));
        }

        this.setChildrenAdapter(new ChildBalanceAdapter(this, getChildrenList()));
        this.setChildrenListView((ListView)findViewById(R.id.children));
        this.getChildrenListView().setAdapter(this.getChildrenAdapter());
        this.getChildrenListView().setOnItemClickListener(new ChildSelectionListener(this));
    }

    private List<ChildBalanceViewModel> getChildrenList() {
        return childrenList;
    }

    private void setChildrenList(List<ChildBalanceViewModel> childrenList) {
        this.childrenList = childrenList;
    }

    private ChildBalanceAdapter getChildrenAdapter() {
        return childrenAdapter;
    }

    private void setChildrenAdapter(ChildBalanceAdapter childrenAdapter) {
        this.childrenAdapter = childrenAdapter;
    }

    private ListView getChildrenListView() {
        return childrenListView;
    }

    private void setChildrenListView(ListView childrenListView) {
        this.childrenListView = childrenListView;
    }
}
