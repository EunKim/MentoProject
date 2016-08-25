package example.expense.user.app.expense;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import example.expense.user.app.ExpenseList;
import example.expense.user.app.R;

/**
 * Created by user on 2016-08-25.
 */
public class ExpenseListAdapter extends BaseAdapter {
    Context context;
    List<ExpenseList> lists;

    public  ExpenseListAdapter (Context con){
        context = con;
    }
    public void setList (List list){
        lists = list;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null){
            view = View.inflate(context, R.layout.content_listview_item,null);
        }

        TextView tvStoreName = (TextView)view.findViewById(R.id.txtStoreName);
        TextView tvStatus = (TextView)view.findViewById(R.id.txtStatus);
        TextView tvMemo = (TextView)view.findViewById(R.id.txtMemo);
        TextView tvDate = (TextView)view.findViewById(R.id.txtDate);
        TextView tvPrice = (TextView)view.findViewById(R.id.txtPrice);

        //tvStoreName.setText(lists.get(position).storeName);

        return view;
    }
}
