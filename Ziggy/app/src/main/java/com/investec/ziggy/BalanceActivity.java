package com.investec.ziggy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.investec.ziggy.models.ChildBalanceViewModel;

import java.util.ArrayList;
import java.util.List;

public class BalanceActivity extends AppCompatActivity {

    private List<ChildBalanceViewModel> childrenList;
    private ArrayAdapter<ChildBalanceViewModel> childrenAdapter;
    private ListView childrenListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        this.setChildrenList(new ArrayList<ChildBalanceViewModel>());
        this.getChildrenList().add(new ChildBalanceViewModel("Amelia", "R1000", "amelia"));
        this.getChildrenList().add(new ChildBalanceViewModel("Kayleb", "R1000", "kayleb"));
        this.getChildrenList().add(new ChildBalanceViewModel("Meekah", "R1000", "meekah"));

        this.setChildrenAdapter(new ArrayAdapter<>(this, R.layout.child_balance, getChildrenList()));
        this.setChildrenListView((ListView)findViewById(R.id.children));
    }

    private List<ChildBalanceViewModel> getChildrenList() {
        return childrenList;
    }

    private void setChildrenList(List<ChildBalanceViewModel> childrenList) {
        this.childrenList = childrenList;
    }

    private ArrayAdapter<ChildBalanceViewModel> getChildrenAdapter() {
        return childrenAdapter;
    }

    private void setChildrenAdapter(ArrayAdapter<ChildBalanceViewModel> childrenAdapter) {
        this.childrenAdapter = childrenAdapter;
    }

    private ListView getChildrenListView() {
        return childrenListView;
    }

    private void setChildrenListView(ListView childrenListView) {
        this.childrenListView = childrenListView;
    }
}
