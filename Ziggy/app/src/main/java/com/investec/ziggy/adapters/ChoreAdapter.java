package com.investec.ziggy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.investec.ziggy.R;
import com.investec.ziggy.models.ChildBalanceViewModel;
import com.investec.ziggy.models.ChoreViewModel;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class ChoreAdapter extends ArrayAdapter<ChoreViewModel> {

    private Context activity;
    private List<ChoreViewModel> chores;

    public ChoreAdapter(Context context, List<ChoreViewModel> values) {
        super(context, -1, values);
        this.setActivity(context);
        this.setChores(values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)this.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.chore, parent, false);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.photo);
        TextView value = (TextView) rowView.findViewById(R.id.choreValue);

        ChoreViewModel chore = getChores().get(position);

        value.setText(chore.getValue());

        int id = this.getActivity().getResources().getIdentifier(chore.getPhoto(), "drawable", this.getActivity().getPackageName());
        imageView.setImageResource(id);

        return rowView;
    }

    public Context getActivity() {
        return activity;
    }

    public void setActivity(Context activity) {
        this.activity = activity;
    }

    public List<ChoreViewModel> getChores() {
        return chores;
    }

    public void setChores(List<ChoreViewModel> chores) {
        this.chores = chores;
    }
}
