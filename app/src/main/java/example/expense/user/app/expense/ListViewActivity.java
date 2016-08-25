package example.expense.user.app.expense;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import example.expense.user.app.R;
import example.expense.user.app.common.AccountTitleSpinnerList;

/**
 * Created by user on 2016-08-25.
 */
public class ListViewActivity extends AppCompatActivity {

    ArrayList<ExpenseListModel> listData;
    ListView listView;
    ExpenseListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_listview);

        listView = (ListView)findViewById(R.id.content_listview);
        adapter = new ExpenseListAdapter(this);
        listData = new ArrayList<>();

    }


}
