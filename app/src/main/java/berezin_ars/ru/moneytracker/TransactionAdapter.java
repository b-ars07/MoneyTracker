package berezin_ars.ru.moneytracker;


import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TransactionAdapter extends ArrayAdapter<Transactions> {


    public TransactionAdapter(Context context, List<Transactions> transactionses) {
        super(context, 0, transactionses);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transactions transactions = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent);
        }

        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView sum = (TextView) convertView.findViewById(R.id.sum);

        return super.getView(position, convertView, parent);
    }
}
