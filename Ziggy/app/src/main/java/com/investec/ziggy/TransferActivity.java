package com.investec.ziggy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.investec.ziggy.adapters.ChoreAdapter;
import com.investec.ziggy.common.PortfolioManager;
import com.investec.ziggy.listeners.ChildSelectionListener;
import com.investec.ziggy.listeners.ChoreClickListener;
import com.investec.ziggy.models.ChoreViewModel;
import com.investec.ziggy.models.portfoliomodels.Chore;
import com.investec.ziggy.models.portfoliomodels.Portfolio;

import java.util.ArrayList;
import java.util.List;

import static com.investec.ziggy.R.layout.chore;

public class TransferActivity extends AppCompatActivity {
    private List<ChoreViewModel> choresList;
    private ChoreAdapter choresAdapter;
    private ListView choresListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        this.setChoresList(new ArrayList<ChoreViewModel>());
        Portfolio portfolio = PortfolioManager.getInstance().getPortfolio();

        for (Chore chore: portfolio.getChores()) {
            this.getChoresList().add(new ChoreViewModel(chore.getTask(), chore.getAmount().toString(), chore.getPicturePath()));
        }

        this.setChoresAdapter(new ChoreAdapter(this, getChoresList()));
        this.setChoresListView((ListView) findViewById(R.id.chores));
        this.getChoresListView().setAdapter(this.getChoresAdapter());
        this.getChoresListView().setOnItemClickListener(new ChoreClickListener(this));
    }

    private List<ChoreViewModel> getChoresList() {
        return choresList;
    }

    private void setChoresList(List<ChoreViewModel> choresList) {
        this.choresList = choresList;
    }

    private ArrayAdapter<ChoreViewModel> getChoresAdapter() {
        return choresAdapter;
    }

    private void setChoresAdapter(ChoreAdapter choresAdapter) {
        this.choresAdapter = choresAdapter;
    }

    private ListView getChoresListView() {
        return choresListView;
    }

    private void setChoresListView(ListView choresListView) {
        this.choresListView = choresListView;
    }
}
