package com.investec.ziggy.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.investec.ziggy.R;
import com.investec.ziggy.models.ChildBalanceViewModel;

import java.util.List;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class ChildBalanceAdapter extends ArrayAdapter<ChildBalanceViewModel> {

    private Context activity;
    private List<ChildBalanceViewModel> children;

    public ChildBalanceAdapter(Context context, List<ChildBalanceViewModel> values) {
        super(context, -1, values);
        this.setActivity(context);
        this.setChildren(values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)this.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.child_balance, parent, false);

        TextView childName = (TextView) rowView.findViewById(R.id.childName);
        TextView childBalance = (TextView) rowView.findViewById(R.id.childBalance);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.photo);

        ChildBalanceViewModel child = getChildren().get(position);

        childName.setText(child.getName());
        childBalance.setText(child.getBalance());

        int id = this.getActivity().getResources().getIdentifier(child.getPhoto(), "drawable", this.getActivity().getPackageName());
        imageView.setImageResource(id);

        return rowView;
    }

    public Context getActivity() {
        return activity;
    }

    public void setActivity(Context context) {
        this.activity = context;
    }

    public List<ChildBalanceViewModel> getChildren() {
        return children;
    }

    public void setChildren(List<ChildBalanceViewModel> children) {
        this.children = children;
    }
}


