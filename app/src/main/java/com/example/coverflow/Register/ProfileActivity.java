package com.example.coverflow.Register;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coverflow.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    Button bt;
    boolean b = false;
    private int REQUEST_CAMERA = 0, SELECT_FILE = 1, id;
    private ImageButton btnSelect;
    private CircleImageView ivImage;
    private LinearLayout rl, pl;
    private String userChoosenTask;
    private SharedPreferences sp;
    private SharedPreferences.Editor sde;
    private EditText er, ec;
    private TextView tr, tc, n, ids, em, mob;

    public static boolean isConnectionAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
            return netInfo != null && netInfo.isConnected()
                    && netInfo.isConnectedOrConnecting()
                    && netInfo.isAvailable();
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide();
        setContentView(R.layout.activity_profile);
        btnSelect = findViewById(R.id.btnSelectPhoto);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });

        sp = getSharedPreferences("app", MODE_PRIVATE);
        sde = sp.edit();
        String img = sp.getString("image", "none");
        ivImage = findViewById(R.id.circleimage);
        if (!img.equals("none")) {
            byte[] b = Base64.decode(img, Base64.DEFAULT);
            Bitmap x = BitmapFactory.decodeByteArray(b, 0, b.length);
            ivImage.setImageBitmap(x);
        }
        id = sp.getInt("id", -1);
        rl = findViewById(R.id.reglay);
        String pay = "";
        try {
            pay = new Login().execute(new String[]{"select", "SELECT PAYMENT FROM DETAILS WHERE CTID=" + id + ";"}).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (pay == null)
            pl = findViewById(R.id.paylay);
        else pl = findViewById(R.id.payclay);
        final CheckBox cb = findViewById(R.id.chkbox);
        er = findViewById(R.id.etrn);
        ec = findViewById(R.id.etcan);
        tr = findViewById(R.id.trn);
        tc = findViewById(R.id.tcan);
        bt = findViewById(R.id.btn);
        n = findViewById(R.id.pfname);
        ids = findViewById(R.id.pfid);
        em = findViewById(R.id.pfemail);
        mob = findViewById(R.id.pfmob);
        try {
            pay = new Login().execute(new String[]{"select", "SELECT NAME,EMAIL,[PHONE NUMBER] FROM DETAILS WHERE CTID=" + id + ";"}).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String cx[] = pay.split("=");
        n.setText(cx[0]);
        ids.setText("JA19" + id);
        em.setText(cx[1]);
        mob.setText(cx[2]);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("upi://pay").buildUpon()
                        .appendQueryParameter("pa", "8081225757@paytm")
                        .appendQueryParameter("pn", "Japneet Singh")
                        .appendQueryParameter("tn", "JNANAGNI PAYMENT")
                        .appendQueryParameter("am", "500")
                        .appendQueryParameter("cu", "INR")
                        .build();


                Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
                upiPayIntent.setData(uri);

                // will always show a dialog to user to choose an app
                Intent chooser = Intent.createChooser(upiPayIntent, "Pay with");

                // check if intent resolves
                if (null != chooser.resolveActivity(getPackageManager())) {
                    startActivityForResult(chooser, 22);
                } else {
                    Toast.makeText(getApplicationContext(), "No UPI app found, please install one to continue", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb.isChecked()) {
                    er.setVisibility(View.VISIBLE);
                    ec.setVisibility(View.VISIBLE);
                    tr.setVisibility(View.VISIBLE);
                    tc.setVisibility(View.VISIBLE);
                    bt.setText("Update Payment Details");
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            new Login().execute("", "UPDATE Jnanagni.dbo.DETAILS SET PAYMENT =\'PAID TO " + ec.getText().toString() + " , RECIEPT NO." + er.getText().toString() + "\' WHERE CTID=" + id + ";");
                        }
                    });
                } else {
                    er.setVisibility(View.INVISIBLE);
                    ec.setVisibility(View.INVISIBLE);
                    tr.setVisibility(View.INVISIBLE);
                    tc.setVisibility(View.INVISIBLE);
                    bt.setText("Pay Now");
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri uri = Uri.parse("upi://pay").buildUpon()
                                    .appendQueryParameter("pa", "8081225757@paytm")
                                    .appendQueryParameter("pn", "Japneet Singh")
                                    .appendQueryParameter("tn", "JNANAGNI PAYMENT")
                                    .appendQueryParameter("am", "500")
                                    .appendQueryParameter("cu", "INR")
                                    .build();


                            Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
                            upiPayIntent.setData(uri);

                            // will always show a dialog to user to choose an app
                            Intent chooser = Intent.createChooser(upiPayIntent, "Pay with");

                            // check if intent resolves
                            if (null != chooser.resolveActivity(getPackageManager())) {
                                startActivityForResult(chooser, 22);
                            } else {
                                Toast.makeText(getApplicationContext(), "No UPI app found, please install one to continue", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });

    }

    public void clkreg(View v) {
        rl.setVisibility(View.VISIBLE);
        pl.setVisibility(View.INVISIBLE);
    }

    public void clkpay(View v) {
        pl.setVisibility(View.VISIBLE);
        rl.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case Utility.MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (userChoosenTask.equals("Take Photo"))
                        cameraIntent();
                    else if (userChoosenTask.equals("Choose from Gallery"))
                        galleryIntent();
                } else {
                    //code for deny
                }
                break;
        }
    }

    private void selectImage() {
        final CharSequence[] items = {"Take Photo", "Choose from Gallery",
                "Cancel"};

        AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
        builder.setTitle("Add Photo!");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                boolean result = Utility.checkPermission(ProfileActivity.this);

                if (items[item].equals("Take Photo")) {
                    userChoosenTask = "Take Photo";
                    if (result)
                        cameraIntent();

                } else if (items[item].equals("Choose from Gallery")) {
                    userChoosenTask = "Choose from Gallery";
                    if (result)
                        galleryIntent();

                } else if (items[item].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    private void galleryIntent() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//
        startActivityForResult(Intent.createChooser(intent, "Select File"), SELECT_FILE);
    }

    private void cameraIntent() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE)
                onSelectFromGalleryResult(data);
            else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
            else if (requestCode == 22) {
                if (data != null) {
                    String trxt = data.getStringExtra("response");
                    Log.d("UPI", "onActivityResult: " + trxt);
                    ArrayList<String> dataList = new ArrayList<>();
                    dataList.add(trxt);
                    upiPaymentDataOperation(dataList);
                } else {
                    Log.d("UPI", "onActivityResult: " + "Return data is null");
                    ArrayList<String> dataList = new ArrayList<>();
                    dataList.add("nothing");
                    upiPaymentDataOperation(dataList);
                }

            }
        }
    }

    private void upiPaymentDataOperation(ArrayList<String> data) {
        if (isConnectionAvailable(ProfileActivity.this)) {
            String str = data.get(0);
            Log.d("UPIPAY", "upiPaymentDataOperation: " + str);
            String paymentCancel = "";
            if (str == null) str = "discard";
            String status = "";
            String approvalRefNo = "";
            String response[] = str.split("&");
            for (int i = 0; i < response.length; i++) {
                String equalStr[] = response[i].split("=");
                if (equalStr.length >= 2) {
                    if (equalStr[0].toLowerCase().equals("Status".toLowerCase())) {
                        status = equalStr[1].toLowerCase();
                    } else if (equalStr[0].toLowerCase().equals("ApprovalRefNo".toLowerCase()) || equalStr[0].toLowerCase().equals("txnRef".toLowerCase())) {
                        approvalRefNo = equalStr[1];
                    }
                } else {
                    paymentCancel = "Payment cancelled by user.";
                }
            }

            if (status.equals("success")) {
                //Code to handle successful transaction here.
                Toast.makeText(ProfileActivity.this, "Transaction successful.", Toast.LENGTH_SHORT).show();
                new Login().execute("", "UPDATE Jnanagni.dbo.DETAILS SET PAYMENT =\'PAID BY UPI ID TXREF = " + approvalRefNo + "\' WHERE CTID=" + id + ";");
            } else if ("Payment cancelled by user.".equals(paymentCancel)) {
                Toast.makeText(ProfileActivity.this, "Payment cancelled by user.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ProfileActivity.this, "Transaction failed.Please try again", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(ProfileActivity.this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void onCaptureImageResult(Intent data) {
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        assert thumbnail != null;
        thumbnail.compress(Bitmap.CompressFormat.JPEG, 90, bytes);

        sde.putString("image", Base64.encodeToString(bytes.toByteArray(), Base64.DEFAULT));
        sde.apply();
        ivImage.setImageBitmap(thumbnail);
    }

    @SuppressWarnings("deprecation")
    private void onSelectFromGalleryResult(Intent data) {

        Bitmap bm = null;
        if (data != null) {
            try {
                bm = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), data.getData());
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                bm.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
                sde.putString("image", Base64.encodeToString(bytes.toByteArray(), Base64.DEFAULT));
                sde.apply();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ivImage.setImageBitmap(bm);
    }

    class Login extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String[] strings) {
            try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                String query = strings[1];
                String ConnectionURL = "jdbc:jtds:sqlserver://" + "13.233.225.36" + ":49170;DatabaseName="//",;instance=SQLEXPRESS;DatabaseName="
                        + "Jnanagni" + ";user=" + "root" + ";password=" + "root" + ";";
                Connection con = DriverManager.getConnection(ConnectionURL);
                Statement st = con.createStatement();
                if (strings[0].equals("select")) {
                    ResultSet rs = st.executeQuery(query);//=st.executeQuery("select CTID from DETAILS WHERE EMAIL=\'"+em.getText().toString()+"\' AND PASSWORD = \'"+pass.getText().toString()+"\';");
                    ResultSetMetaData rms = rs.getMetaData();
                    if (rs.next()) {
                        StringBuilder msg = new StringBuilder();
                        if (rms.getColumnCount() == 1)
                            return rs.getString(1);
                        else for (int i = 1; i <= rms.getColumnCount(); i++) {
                            if (i == 3)
                                msg.append(rs.getInt(i));
                            else
                                msg.append(rs.getString(i)).append("=");
                        }
                        return msg.toString();
                    }
                } else {
                    st.executeUpdate(query);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
            return "no";
        }

        @Override
        protected void onPostExecute(String s) {
            b = true;
        }
    }

}
