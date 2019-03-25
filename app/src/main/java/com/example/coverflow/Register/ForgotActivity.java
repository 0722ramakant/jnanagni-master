package com.example.coverflow.Register;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SmsManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.coverflow.R;
import com.google.android.material.snackbar.Snackbar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotActivity extends AppCompatActivity {
    RelativeLayout rellay1;
    EditText et;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_forgot);

        rellay1 = findViewById(R.id.rellay1);
        et = findViewById(R.id.fem);

        handler.postDelayed(runnable, 1000);
    }

    public void forgot(View v) throws ExecutionException, InterruptedException {
        String rs = new Login().execute("").get();
        if (rs.equals("no entry found"))
            Snackbar.make(v, "User not found", Snackbar.LENGTH_SHORT).show();
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("+917317587827", null, "Please send password for " + et.getText() + " NAME " + rs, null, null);
    }

    class Login extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                String ConnectionURL = "jdbc:jtds:sqlserver://" + "13.233.225.36" + ":49170;DatabaseName="//",;instance=SQLEXPRESS;DatabaseName="
                        + "Jnanagni" + ";user=" + "root" + ";password=" + "root" + ";";
                Connection con = DriverManager.getConnection(ConnectionURL);

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select NAME from DETAILS WHERE EMAIL=\'" + et.getText().toString() + "\';");
                if (rs.next())
                    return rs.getNString(1);
                else return "no entry found";


            } catch (Exception e) {
                e.printStackTrace();
            }
            return "no entry found";
        }
    }
}
