package example.expense.user.app.expense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import example.expense.user.app.R;
import example.expense.user.app.common.CommNetwork;
import example.expense.user.app.common.ErrorUtils;
import example.expense.user.app.common.listener.onNetworkResponseListener;

/**
 * Created by dilky on 2016-07-20.
 * 상세보기 화면
 */
public class ViewExpense extends AppCompatActivity {
    TextView txtstate;
    TextView txtplace;
    TextView txtaccount;
    TextView txtmemo;
    TextView txtdate;
    TextView txtaccou;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {

            setContentView(R.layout.content_view_expense);

            addToolBar();

            //일련번호를 받아와서 각각 텍스트에 뿌려주기.

            txtstate = (TextView)findViewById(R.id.tv_Status);
            txtplace = (TextView)findViewById(R.id.tv_PaymentStoreName);
            txtaccount = (TextView)findViewById(R.id.tv_PaymentAmount);
            txtmemo = (TextView)findViewById(R.id.tv_PaymentDate);
            txtdate = (TextView)findViewById(R.id.tv_Summary);
            txtaccou = (TextView)findViewById(R.id.tv_AccountTitle);





            /*String place;
            String account;
            String memo;
            String etdate;
            String accou;

            place = intent.getExtras().getString("PaymentStoreName");
            account = intent.getExtras().getString("PaymentAmount");
            memo = intent.getExtras().getString("Summary");
            etdate = intent.getExtras().getString("EtPaymentDate");
            accou = intent.getExtras().getString("State");

            txtstate.setText(intent.getExtras().getString("State"));
            txtplace.setText(intent.getExtras().getString("PaymentStoreName"));
            txtaccount.setText(intent.getExtras().getString("PaymentAmount"));
            txtmemo.setText(intent.getExtras().getString("Summary"));
            txtdate.setText(intent.getExtras().getString("EtPaymentDate"));
            txtaccou.setText(intent.getExtras().getString("Account"));*/


        } catch (Exception e) {
            ErrorUtils.AlertException(this, getString(R.string.error_msg_default_with_activity), e);
        }
    }

    private void addToolBar() throws Exception {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbar.setTitle(R.string.text_detail_view);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view_expense, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 메뉴의 항목을 선택(클릭)했을 때 호출되는 콜백메서드
        int id = item.getItemId();
        switch(id) {
            case android.R.id.home:
                finish();
                break;
            case R.id.menu_modify:
                Toast.makeText(getApplicationContext(), "수정 메뉴 클릭",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_delete:
                Toast.makeText(getApplicationContext(), "삭제 메뉴 클릭",
                        Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
