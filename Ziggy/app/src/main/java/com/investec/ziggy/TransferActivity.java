package com.investec.ziggy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.investec.ziggy.adapters.ChoreAdapter;
import com.investec.ziggy.listeners.ChildSelectionListener;
import com.investec.ziggy.listeners.ChoreClickListener;
import com.investec.ziggy.models.ChoreViewModel;

import java.util.ArrayList;
import java.util.List;

public class TransferActivity extends AppCompatActivity {
    private List<ChoreViewModel> choresList;
    private ChoreAdapter choresAdapter;
    private ListView choresListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        this.setChoresList(new ArrayList<ChoreViewModel>());
        this.getChoresList().add(new ChoreViewModel("homework", "R10", "homework"));
        this.getChoresList().add(new ChoreViewModel("carwash", "R50", "carwash"));
        this.getChoresList().add(new ChoreViewModel("sweep", "R20", "sweep"));

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
