package com.example.coverflow.Register;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.coverflow.R;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    RelativeLayout rellay1;
    EditText name, phone, clg, brn;
    String s[];
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

        setContentView(R.layout.activity_details);
        rellay1 = findViewById(R.id.rellay3);
        handler.postDelayed(runnable, 1000);
        name = findViewById(R.id.etname);
        phone = findViewById(R.id.etphone);
        clg = findViewById(R.id.etcol);
        brn = findViewById(R.id.etbran);
        s = getIntent().getStringArrayExtra("Details");


    }

    public void mons(View v) {
        new Login().execute("");
        Toast.makeText(DetailsActivity.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
        finish();
    }

    class Login extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                String ConnectionURL = "jdbc:jtds:sqlserver://" + "13.233.225.36" + ":49170;DatabaseName="//",;instance=SQLEXPRESS;DatabaseName="
                        + "Jnanagni" + ";user=" + "root" + ";password=" + "root" + ";";
                Connection con = DriverManager.getConnection(ConnectionURL);
                if (con == null) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(DetailsActivity.this, "Internet connectivity issue", Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    Statement st = con.createStatement();
                    st.executeUpdate("insert into Jnanagni.dbo.DETAILS (NAME,EMAIL,[PHONE NUMBER],COLLEGE,BRANCH,PASSWORD) VALUES (\'" + name.getText().toString() + "\',\'" + s[0] + "\'," + Integer.parseInt(phone.getText().toString()) + ",\'" + clg.getText().toString() + "\',\'" + brn.getText().toString() + "\',\'" + s[1] + "\');");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "no";
        }

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(DetailsActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
