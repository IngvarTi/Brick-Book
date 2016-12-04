package com.tibro.brickcatalog;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.appodeal.ads.Appodeal;
import com.dd.CircularProgressButton;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class City extends AppCompatActivity implements View.OnClickListener {

    private Tracker mTracker;

    String[] two = {"1/2", "2/2"};
    String[] three = {"1/3", "2/3", "3/3"};
    String[] four = {"1/4", "2/4", "3/4", "4/4"};
    String[] five = {"1/5", "2/5", "3/5", "4/5", "5/5"};
    String[] six = {"1/6", "2/6", "3/6", "4/6", "5/6", "6/6"};
    String[] ten = {"1/10", "2/10", "3/10", "4/10", "5/10", "6/10", "7/10", "8/10", "9/10", "10/10"};

    PDFTools pdfe = new PDFTools();

    String strCity60044 = new String();
    String strCity60047 = new String();
    String strCity60050 = new String();
    String strCity60051 = new String();
    String strCity60052 = new String();
    String strCity60067 = new String();
    String strCity60069 = new String();
    String strCity60072 = new String();
    String strCity60073 = new String();
    String strCity60074 = new String();
    String strCity60076 = new String();
    String strCity60077 = new String();
    String strCity60078 = new String();
    String strCity60079 = new String();
    String strCity60080 = new String();
    String strCity60081 = new String();
    String strCity60084 = new String();
    String strCity60085 = new String();
    String strCity60090 = new String();
    String strCity60091 = new String();
    String strCity60092 = new String();
    String strCity60093 = new String();
    String strCity60095 = new String();
    String strCity60097 = new String();
    String strCity60105 = new String();
    String strCity60106 = new String();
    String strCity60107 = new String();
    String strCity60108 = new String();
    String strCity60109 = new String();
    String strCity60110 = new String();
    String strCity60111 = new String();
    String strCity60113 = new String();
    String strCity60114 = new String();
    String strCity60115 = new String();
    String strCity60116 = new String();
    String strCity60117 = new String();
    String strCity60118 = new String();
    String strCity60119 = new String();
    String strCity60126 = new String();
    String strCity60127 = new String();
    String strCity60128 = new String();
    String strCity60129 = new String();
    String strCity60130 = new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        String appKey = "fa7b74c8278d1e0f3ec32d243a7e151466b88968bfc3fe2f";
        Appodeal.initialize(this, appKey, Appodeal.BANNER);
//        Appodeal.setTesting(true);

        Appodeal.show(this, Appodeal.BANNER_BOTTOM);

        // [START shared_tracker]
        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
        // [END shared_tracker]

        // [START screen_view_hit]
//        Log.i(TAG, "Setting screen name: ");
        mTracker.setScreenName("City");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        // [END screen_view_hit]

        final ImageView imageCity60044 = (ImageView) findViewById(R.id.imageCity60044);
        imageCity60044.setOnClickListener(this);
        final ImageView imageCity60047 = (ImageView) findViewById(R.id.imageCity60047);
        imageCity60047.setOnClickListener(this);
        final ImageView imageCity60050 = (ImageView) findViewById(R.id.imageCity60050);
        imageCity60050.setOnClickListener(this);
        final ImageView imageCity60051 = (ImageView) findViewById(R.id.imageCity60051);
        imageCity60051.setOnClickListener(this);
        final ImageView imageCity60052 = (ImageView) findViewById(R.id.imageCity60052);
        imageCity60052.setOnClickListener(this);
        final ImageView imageCity60067 = (ImageView) findViewById(R.id.imageCity60067);
        imageCity60067.setOnClickListener(this);
        final ImageView imageCity60069 = (ImageView) findViewById(R.id.imageCity60069);
        imageCity60069.setOnClickListener(this);
        final ImageView imageCity60072 = (ImageView) findViewById(R.id.imageCity60072);
        imageCity60072.setOnClickListener(this);
        final ImageView imageCity60073 = (ImageView) findViewById(R.id.imageCity60073);
        imageCity60073.setOnClickListener(this);
        final ImageView imageCity60074 = (ImageView) findViewById(R.id.imageCity60074);
        imageCity60074.setOnClickListener(this);
        final ImageView imageCity60076 = (ImageView) findViewById(R.id.imageCity60076);
        imageCity60076.setOnClickListener(this);
        final ImageView imageCity60077 = (ImageView) findViewById(R.id.imageCity60077);
        imageCity60077.setOnClickListener(this);
        final ImageView imageCity60078 = (ImageView) findViewById(R.id.imageCity60078);
        imageCity60078.setOnClickListener(this);
        final ImageView imageCity60079 = (ImageView) findViewById(R.id.imageCity60079);
        imageCity60079.setOnClickListener(this);
        final ImageView imageCity60080 = (ImageView) findViewById(R.id.imageCity60080);
        imageCity60080.setOnClickListener(this);
        final ImageView imageCity60081 = (ImageView) findViewById(R.id.imageCity60081);
        imageCity60081.setOnClickListener(this);
        final ImageView imageCity60084 = (ImageView) findViewById(R.id.imageCity60084);
        imageCity60084.setOnClickListener(this);
        final ImageView imageCity60085 = (ImageView) findViewById(R.id.imageCity60085);
        imageCity60085.setOnClickListener(this);
        final ImageView imageCity60090 = (ImageView) findViewById(R.id.imageCity60090);
        imageCity60090.setOnClickListener(this);
        final ImageView imageCity60091 = (ImageView) findViewById(R.id.imageCity60091);
        imageCity60091.setOnClickListener(this);
        final ImageView imageCity60092 = (ImageView) findViewById(R.id.imageCity60092);
        imageCity60092.setOnClickListener(this);
        final ImageView imageCity60093 = (ImageView) findViewById(R.id.imageCity60093);
        imageCity60093.setOnClickListener(this);
        final ImageView imageCity60095 = (ImageView) findViewById(R.id.imageCity60095);
        imageCity60095.setOnClickListener(this);
        final ImageView imageCity60097 = (ImageView) findViewById(R.id.imageCity60097);
        imageCity60097.setOnClickListener(this);
        final ImageView imageCity60105 = (ImageView) findViewById(R.id.imageCity60105);
        imageCity60105.setOnClickListener(this);
        final ImageView imageCity60106 = (ImageView) findViewById(R.id.imageCity60106);
        imageCity60106.setOnClickListener(this);
        final ImageView imageCity60107 = (ImageView) findViewById(R.id.imageCity60107);
        imageCity60107.setOnClickListener(this);
        final ImageView imageCity60108 = (ImageView) findViewById(R.id.imageCity60108);
        imageCity60108.setOnClickListener(this);
        final ImageView imageCity60109 = (ImageView) findViewById(R.id.imageCity60109);
        imageCity60109.setOnClickListener(this);
        final ImageView imageCity60110 = (ImageView) findViewById(R.id.imageCity60110);
        imageCity60110.setOnClickListener(this);
        final ImageView imageCity60111 = (ImageView) findViewById(R.id.imageCity60111);
        imageCity60111.setOnClickListener(this);
        final ImageView imageCity60113 = (ImageView) findViewById(R.id.imageCity60113);
        imageCity60113.setOnClickListener(this);
        final ImageView imageCity60114 = (ImageView) findViewById(R.id.imageCity60114);
        imageCity60114.setOnClickListener(this);
        final ImageView imageCity60115 = (ImageView) findViewById(R.id.imageCity60115);
        imageCity60115.setOnClickListener(this);
        final ImageView imageCity60116 = (ImageView) findViewById(R.id.imageCity60116);
        imageCity60116.setOnClickListener(this);
        final ImageView imageCity60117 = (ImageView) findViewById(R.id.imageCity60117);
        imageCity60117.setOnClickListener(this);
        final ImageView imageCity60118 = (ImageView) findViewById(R.id.imageCity60118);
        imageCity60118.setOnClickListener(this);
        final ImageView imageCity60119 = (ImageView) findViewById(R.id.imageCity60119);
        imageCity60119.setOnClickListener(this);
        final ImageView imageCity60126 = (ImageView) findViewById(R.id.imageCity60126);
        imageCity60126.setOnClickListener(this);
        final ImageView imageCity60127 = (ImageView) findViewById(R.id.imageCity60127);
        imageCity60127.setOnClickListener(this);
        final ImageView imageCity60128 = (ImageView) findViewById(R.id.imageCity60128);
        imageCity60128.setOnClickListener(this);
        final ImageView imageCity60129 = (ImageView) findViewById(R.id.imageCity60129);
        imageCity60129.setOnClickListener(this);
        final ImageView imageCity60130 = (ImageView) findViewById(R.id.imageCity60130);
        imageCity60130.setOnClickListener(this);

        final CircularProgressButton bCity60044 = (CircularProgressButton)this.findViewById(R.id.butCity60044);
        final CircularProgressButton dCity60044 = (CircularProgressButton)this.findViewById(R.id.dCity60044);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, three);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner sCity60044 = (Spinner) findViewById(R.id.spinnerCity60044);
        sCity60044.setAdapter(adapter3);
        sCity60044.setSelection(0);
        sCity60044.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60044.getSelectedItemPosition()) {
                    case (0):
                        strCity60044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6079391.pdf";
                        setButtonStyle(bCity60044, dCity60044, strCity60044);
                        break;
                    case (1):
                        strCity60044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157964.pdf";
                        setButtonStyle(bCity60044, dCity60044, strCity60044);
                        break;
                    case (2):
                        strCity60044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157968.pdf";
                        setButtonStyle(bCity60044, dCity60044, strCity60044);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60047 = (CircularProgressButton)this.findViewById(R.id.butCity60047);
        final CircularProgressButton dCity60047 = (CircularProgressButton)this.findViewById(R.id.dCity60047);

        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, six);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner sCity60047 = (Spinner) findViewById(R.id.spinnerCity60047);
        sCity60047.setAdapter(adapter6);
        sCity60047.setSelection(0);
        sCity60047.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60047.getSelectedItemPosition()) {
                    case (0):
                        strCity60047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157974.pdf";
                        setButtonStyle(bCity60047, dCity60047, strCity60047);
                        break;
                    case (1):
                        strCity60047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6074999.pdf";
                        setButtonStyle(bCity60047, dCity60047, strCity60047);
                        break;
                    case (2):
                        strCity60047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157975.pdf";
                        setButtonStyle(bCity60047, dCity60047, strCity60047);
                        break;
                    case (3):
                        strCity60047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6075018.pdf";
                        setButtonStyle(bCity60047, dCity60047, strCity60047);
                        break;
                    case (4):
                        strCity60047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6075021.pdf";
                        setButtonStyle(bCity60047, dCity60047, strCity60047);
                        break;
                    case (5):
                        strCity60047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6075024.pdf";
                        setButtonStyle(bCity60047, dCity60047, strCity60047);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60050 = (CircularProgressButton)this.findViewById(R.id.butCity60050);
        final CircularProgressButton dCity60050 = (CircularProgressButton)this.findViewById(R.id.dCity60050);
//        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, three);
//        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60050 = (Spinner) findViewById(R.id.spinnerCity60050);
        sCity60050.setAdapter(adapter3);
        sCity60050.setSelection(0);
        sCity60050.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60050.getSelectedItemPosition()) {
                    case (0):
                        strCity60050 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158122.pdf";
                        setButtonStyle(bCity60050, dCity60050, strCity60050);
                        break;
                    case (1):
                        strCity60050 = "http://cache.lego.com/bigdownloads/buildinginstructions/6124161.pdf";
                        setButtonStyle(bCity60050, dCity60050, strCity60050);
                        break;
                    case (2):
                        strCity60050 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158126.pdf";
                        setButtonStyle(bCity60050, dCity60050, strCity60050);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60051 = (CircularProgressButton)this.findViewById(R.id.butCity60051);
        final CircularProgressButton dCity60051 = (CircularProgressButton)this.findViewById(R.id.dCity60051);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, four);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner sCity60051 = (Spinner) findViewById(R.id.spinnerCity60051);
        sCity60051.setAdapter(adapter4);
        sCity60051.setSelection(0);
        sCity60051.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60051.getSelectedItemPosition()) {
                    case (0):
                        strCity60051 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158130.pdf";
                        setButtonStyle(bCity60051, dCity60051, strCity60051);
                        break;
                    case (1):
                        strCity60051 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158133.pdf";
                        setButtonStyle(bCity60051, dCity60051, strCity60051);
                        break;
                    case (2):
                        strCity60051 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158129.pdf";
                        setButtonStyle(bCity60051, dCity60051, strCity60051);
                        break;
                    case (3):
                        strCity60051 = "http://cache.lego.com/bigdownloads/buildinginstructions/6171038.pdf";
                        setButtonStyle(bCity60051, dCity60051, strCity60051);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60052 = (CircularProgressButton)this.findViewById(R.id.butCity60052);
        final CircularProgressButton dCity60052 = (CircularProgressButton)this.findViewById(R.id.dCity60052);
//        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, four);
//        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60052 = (Spinner) findViewById(R.id.spinnerCity60052);
        sCity60052.setAdapter(adapter6);
        sCity60052.setSelection(0);
        sCity60052.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60052.getSelectedItemPosition()) {
                    case (0):
                        strCity60052 = "http://cache.lego.com/bigdownloads/buildinginstructions/6124197.pdf";
                        setButtonStyle(bCity60052, dCity60052, strCity60052);
                        break;
                    case (1):
                        strCity60052 = "http://cache.lego.com/bigdownloads/buildinginstructions/6124199.pdf";
                        setButtonStyle(bCity60052, dCity60052, strCity60052);
                        break;
                    case (2):
                        strCity60052 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158138.pdf";
                        setButtonStyle(bCity60052, dCity60052, strCity60052);
                        break;
                    case (3):
                        strCity60052 = "http://cache.lego.com/bigdownloads/buildinginstructions/6124203.pdf";
                        setButtonStyle(bCity60052, dCity60052, strCity60052);
                        break;
                    case (4):
                        strCity60052 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158139.pdf";
                        setButtonStyle(bCity60052, dCity60052, strCity60052);
                        break;
                    case (5):
                        strCity60052 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158140.pdf";
                        setButtonStyle(bCity60052, dCity60052, strCity60052);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60067 = (CircularProgressButton)this.findViewById(R.id.butCity60067);
        final CircularProgressButton dCity60067 = (CircularProgressButton)this.findViewById(R.id.dCity60067);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60067 = (Spinner) findViewById(R.id.spinnerCity60067);
        sCity60067.setAdapter(adapter2);
        sCity60067.setSelection(0);
        sCity60067.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60067.getSelectedItemPosition()) {
                    case (0):
                        strCity60067 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112693.pdf";
                        setButtonStyle(bCity60067, dCity60067, strCity60067);
                        break;
                    case (1):
                        strCity60067 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117256.pdf";
                        setButtonStyle(bCity60067, dCity60067, strCity60067);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60069 = (CircularProgressButton)this.findViewById(R.id.butCity60069);
        final CircularProgressButton dCity60069 = (CircularProgressButton)this.findViewById(R.id.dCity60069);
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
//        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60069 = (Spinner) findViewById(R.id.spinnerCity60069);
        sCity60069.setAdapter(adapter6);
        sCity60069.setSelection(0);
        sCity60069.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60069.getSelectedItemPosition()) {
                    case (0):
                        strCity60069 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117242.pdf";
                        setButtonStyle(bCity60069, dCity60069, strCity60069);
                        break;
                    case (1):
                        strCity60069 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114281.pdf";
                        setButtonStyle(bCity60069, dCity60069, strCity60069);
                        break;
                    case (2):
                        strCity60069 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117249.pdf";
                        setButtonStyle(bCity60069, dCity60069, strCity60069);
                        break;
                    case (3):
                        strCity60069 = "http://cache.lego.com/bigdownloads/buildinginstructions/6122487.pdf";
                        setButtonStyle(bCity60069, dCity60069, strCity60069);
                        break;
                    case (4):
                        strCity60069 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117257.pdf";
                        setButtonStyle(bCity60069, dCity60069, strCity60069);
                        break;
                    case (5):
                        strCity60069 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117258.pdf";
                        setButtonStyle(bCity60069, dCity60069, strCity60069);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60072 = (CircularProgressButton) findViewById(R.id.butCity60072);
        final CircularProgressButton dCity60072 = (CircularProgressButton) findViewById(R.id.dCity60072);
        strCity60072 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157977.pdf";
        setButtonStyle(bCity60072, dCity60072, strCity60072);

        final CircularProgressButton bCity60073 = (CircularProgressButton) findViewById(R.id.butCity60073);
        final CircularProgressButton dCity60073 = (CircularProgressButton) findViewById(R.id.dCity60073);
        strCity60073 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157979.pdf";
        setButtonStyle(bCity60073, dCity60073, strCity60073);

        final CircularProgressButton bCity60074 = (CircularProgressButton)this.findViewById(R.id.butCity60074);
        final CircularProgressButton dCity60074 = (CircularProgressButton)this.findViewById(R.id.dCity60074);
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
//        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60074 = (Spinner) findViewById(R.id.spinnerCity60074);
        sCity60074.setAdapter(adapter2);
        sCity60074.setSelection(0);
        sCity60074.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60074.getSelectedItemPosition()) {
                    case (0):
                        strCity60074 = "http://cache.lego.com/bigdownloads/buildinginstructions/6125652.pdf";
                        setButtonStyle(bCity60074, dCity60074, strCity60074);
                        break;
                    case (1):
                        strCity60074 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157981.pdf";
                        setButtonStyle(bCity60074, dCity60074, strCity60074);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60076 = (CircularProgressButton)this.findViewById(R.id.butCity60076);
        final CircularProgressButton dCity60076 = (CircularProgressButton)this.findViewById(R.id.dCity60076);
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
//        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60076 = (Spinner) findViewById(R.id.spinnerCity60076);
        sCity60076.setAdapter(adapter4);
        sCity60076.setSelection(0);
        sCity60076.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60076.getSelectedItemPosition()) {
                    case (0):
                        strCity60076 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114514.pdf";
                        setButtonStyle(bCity60076, dCity60076, strCity60076);
                        break;
                    case (1):
                        strCity60076 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114517.pdf";
                        setButtonStyle(bCity60076, dCity60076, strCity60076);
                        break;
                    case (2):
                        strCity60076 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157983.pdf";
                        setButtonStyle(bCity60076, dCity60076, strCity60076);
                        break;
                    case (3):
                        strCity60076 = "http://cache.lego.com/bigdownloads/buildinginstructions/6164353.pdf";
                        setButtonStyle(bCity60076, dCity60076, strCity60076);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60077 = (CircularProgressButton) findViewById(R.id.butCity60077);
        final CircularProgressButton dCity60077 = (CircularProgressButton) findViewById(R.id.dCity60077);
        strCity60077 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157996.pdf";
        setButtonStyle(bCity60077, dCity60077, strCity60077);

        final CircularProgressButton bCity60078 = (CircularProgressButton) findViewById(R.id.butCity60078);
        final CircularProgressButton dCity60078 = (CircularProgressButton) findViewById(R.id.dCity60078);
        strCity60078 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157999.pdf";
        setButtonStyle(bCity60078, dCity60078, strCity60078);

        final CircularProgressButton bCity60079 = (CircularProgressButton)this.findViewById(R.id.butCity60079);
        final CircularProgressButton dCity60079 = (CircularProgressButton)this.findViewById(R.id.dCity60079);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
//        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60079 = (Spinner) findViewById(R.id.spinnerCity60079);
        sCity60079.setAdapter(adapter3);
        sCity60079.setSelection(0);
        sCity60079.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60079.getSelectedItemPosition()) {
                    case (0):
                        strCity60079 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158004.pdf";
                        setButtonStyle(bCity60079, dCity60079, strCity60079);
                        break;
                    case (1):
                        strCity60079 = "http://cache.lego.com/bigdownloads/buildinginstructions/6125001.pdf";
                        setButtonStyle(bCity60079, dCity60079, strCity60079);
                        break;
                    case (2):
                        strCity60079 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158005.pdf";
                        setButtonStyle(bCity60079, dCity60079, strCity60079);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60080 = (CircularProgressButton)this.findViewById(R.id.butCity60080);
        final CircularProgressButton dCity60080 = (CircularProgressButton)this.findViewById(R.id.dCity60080);

        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner sCity60080 = (Spinner) findViewById(R.id.spinnerCity60080);
        sCity60080.setAdapter(adapter5);
        sCity60080.setSelection(0);
        sCity60080.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60080.getSelectedItemPosition()) {
                    case (0):
                        strCity60080 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158063.pdf";
                        setButtonStyle(bCity60080, dCity60080, strCity60080);
                        break;
                    case (1):
                        strCity60080 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128943.pdf";
                        setButtonStyle(bCity60080, dCity60080, strCity60080);
                        break;
                    case (2):
                        strCity60080 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158064.pdf";
                        setButtonStyle(bCity60080, dCity60080, strCity60080);
                        break;
                    case (3):
                        strCity60080 = "http://cache.lego.com/bigdownloads/buildinginstructions/6125958.pdf";
                        setButtonStyle(bCity60080, dCity60080, strCity60080);
                        break;
                    case (4):
                        strCity60080 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158065.pdf";
                        setButtonStyle(bCity60080, dCity60080, strCity60080);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60081 = (CircularProgressButton)this.findViewById(R.id.butCity60081);
        final CircularProgressButton dCity60081 = (CircularProgressButton)this.findViewById(R.id.dCity60081);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60081 = (Spinner) findViewById(R.id.spinnerCity60081);
        sCity60081.setAdapter(adapter2);
        sCity60081.setSelection(0);
        sCity60081.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60081.getSelectedItemPosition()) {
                    case (0):
                        strCity60081 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114497.pdf";
                        setButtonStyle(bCity60081, dCity60081, strCity60081);
                        break;
                    case (1):
                        strCity60081 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114500.pdf";
                        setButtonStyle(bCity60081, dCity60081, strCity60081);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60084 = (CircularProgressButton)this.findViewById(R.id.butCity60084);
        final CircularProgressButton dCity60084 = (CircularProgressButton)this.findViewById(R.id.dCity60084);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60084 = (Spinner) findViewById(R.id.spinnerCity60084);
        sCity60084.setAdapter(adapter2);
        sCity60084.setSelection(0);
        sCity60084.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60084.getSelectedItemPosition()) {
                    case (0):
                        strCity60084 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157988.pdf";
                        setButtonStyle(bCity60084, dCity60084, strCity60084);
                        break;
                    case (1):
                        strCity60084 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157990.pdf";
                        setButtonStyle(bCity60084, dCity60084, strCity60084);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60085 = (CircularProgressButton)this.findViewById(R.id.butCity60085);
        final CircularProgressButton dCity60085 = (CircularProgressButton)this.findViewById(R.id.dCity60085);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60085 = (Spinner) findViewById(R.id.spinnerCity60085);
        sCity60085.setAdapter(adapter3);
        sCity60085.setSelection(0);
        sCity60085.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60085.getSelectedItemPosition()) {
                    case (0):
                        strCity60085 = "http://cache.lego.com/bigdownloads/buildinginstructions/6109374.pdf";
                        setButtonStyle(bCity60085, dCity60085, strCity60085);
                        break;
                    case (1):
                        strCity60085 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157992.pdf";
                        setButtonStyle(bCity60085, dCity60085, strCity60085);
                        break;
                    case (2):
                        strCity60085 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157994.pdf";
                        setButtonStyle(bCity60085, dCity60085, strCity60085);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60090 = (CircularProgressButton) findViewById(R.id.butCity60090);
        final CircularProgressButton dCity60090 = (CircularProgressButton) findViewById(R.id.dCity60090);
        strCity60090 = "http://cache.lego.com/bigdownloads/buildinginstructions/6124901.pdf";
        setButtonStyle(bCity60090, dCity60090, strCity60090);

        final CircularProgressButton bCity60091 = (CircularProgressButton) findViewById(R.id.butCity60091);
        final CircularProgressButton dCity60091 = (CircularProgressButton) findViewById(R.id.dCity60091);
        strCity60091 = "http://cache.lego.com/bigdownloads/buildinginstructions/6124978.pdf";
        setButtonStyle(bCity60091, dCity60091, strCity60091);

        final CircularProgressButton bCity60092 = (CircularProgressButton)this.findViewById(R.id.butCity60092);
        final CircularProgressButton dCity60092 = (CircularProgressButton)this.findViewById(R.id.dCity60092);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60092 = (Spinner) findViewById(R.id.spinnerCity60092);
        sCity60092.setAdapter(adapter2);
        sCity60092.setSelection(0);
        sCity60092.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60092.getSelectedItemPosition()) {
                    case (0):
                        strCity60092 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128866.pdf";
                        setButtonStyle(bCity60092, dCity60092, strCity60092);
                        break;
                    case (1):
                        strCity60092 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158080.pdf";
                        setButtonStyle(bCity60092, dCity60092, strCity60092);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60093 = (CircularProgressButton)this.findViewById(R.id.butCity60093);
        final CircularProgressButton dCity60093 = (CircularProgressButton)this.findViewById(R.id.dCity60093);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60093 = (Spinner) findViewById(R.id.spinnerCity60093);
        sCity60093.setAdapter(adapter3);
        sCity60093.setSelection(0);
        sCity60093.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60093.getSelectedItemPosition()) {
                    case (0):
                        strCity60093 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158073.pdf";
                        setButtonStyle(bCity60093, dCity60093, strCity60093);
                        break;
                    case (1):
                        strCity60093 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158074.pdf";
                        setButtonStyle(bCity60093, dCity60093, strCity60093);
                        break;
                    case (2):
                        strCity60093 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158078.pdf";
                        setButtonStyle(bCity60093, dCity60093, strCity60093);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60095 = (CircularProgressButton)this.findViewById(R.id.butCity60095);
        final CircularProgressButton dCity60095 = (CircularProgressButton)this.findViewById(R.id.dCity60095);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60095 = (Spinner) findViewById(R.id.spinnerCity60095);
        sCity60095.setAdapter(adapter4);
        sCity60095.setSelection(0);
        sCity60095.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60095.getSelectedItemPosition()) {
                    case (0):
                        strCity60095 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128834.pdf";
                        setButtonStyle(bCity60095, dCity60095, strCity60095);
                        break;
                    case (1):
                        strCity60095 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158085.pdf";
                        setButtonStyle(bCity60095, dCity60095, strCity60095);
                        break;
                    case (2):
                        strCity60095 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158087.pdf";
                        setButtonStyle(bCity60095, dCity60095, strCity60095);
                        break;
                    case (3):
                        strCity60095 = "http://cache.lego.com/bigdownloads/buildinginstructions/6173205.pdf";
                        setButtonStyle(bCity60095, dCity60095, strCity60095);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60097 = (CircularProgressButton)this.findViewById(R.id.butCity60097);
        final CircularProgressButton dCity60097 = (CircularProgressButton)this.findViewById(R.id.dCity60097);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ten);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner sCity60097 = (Spinner) findViewById(R.id.spinnerCity60097);
        sCity60097.setAdapter(adapter10);
        sCity60097.setSelection(0);
        sCity60097.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60097.getSelectedItemPosition()) {
                    case (0):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128826.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (1):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158114.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (2):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158115.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (3):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128833.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (4):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158116.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (5):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128841.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (6):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6152017.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (7):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158117.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (8):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129941.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                    case (9):
                        strCity60097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158118.pdf";
                        setButtonStyle(bCity60097, dCity60097, strCity60097);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60105 = (CircularProgressButton) findViewById(R.id.butCity60105);
        final CircularProgressButton dCity60105 = (CircularProgressButton) findViewById(R.id.dCity60105);
        strCity60105 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145884.pdf";
        setButtonStyle(bCity60105, dCity60105, strCity60105);

        final CircularProgressButton bCity60106 = (CircularProgressButton) findViewById(R.id.butCity60106);
        final CircularProgressButton dCity60106 = (CircularProgressButton) findViewById(R.id.dCity60106);
        strCity60106 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146017.pdf";
        setButtonStyle(bCity60106, dCity60106, strCity60106);

        final CircularProgressButton bCity60107 = (CircularProgressButton) findViewById(R.id.butCity60107);
        final CircularProgressButton dCity60107 = (CircularProgressButton) findViewById(R.id.dCity60107);
        strCity60107 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147527.pdf";
        setButtonStyle(bCity60107, dCity60107, strCity60107);

        final CircularProgressButton bCity60108 = (CircularProgressButton)this.findViewById(R.id.butCity60108);
        final CircularProgressButton dCity60108 = (CircularProgressButton)this.findViewById(R.id.dCity60108);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60108 = (Spinner) findViewById(R.id.spinnerCity60108);
        sCity60108.setAdapter(adapter2);
        sCity60108.setSelection(0);
        sCity60108.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60108.getSelectedItemPosition()) {
                    case (0):
                        strCity60108 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150546.pdf";
                        setButtonStyle(bCity60108, dCity60108, strCity60108);
                        break;
                    case (1):
                        strCity60108 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150552.pdf";
                        setButtonStyle(bCity60108, dCity60108, strCity60108);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60109 = (CircularProgressButton)this.findViewById(R.id.butCity60109);
        final CircularProgressButton dCity60109 = (CircularProgressButton)this.findViewById(R.id.dCity60109);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60109 = (Spinner) findViewById(R.id.spinnerCity60109);
        sCity60109.setAdapter(adapter3);
        sCity60109.setSelection(0);
        sCity60109.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60109.getSelectedItemPosition()) {
                    case (0):
                        strCity60109 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153893.pdf";
                        setButtonStyle(bCity60109, dCity60109, strCity60109);
                        break;
                    case (1):
                        strCity60109 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150385.pdf";
                        setButtonStyle(bCity60109, dCity60109, strCity60109);
                        break;
                    case (2):
                        strCity60109 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150388.pdf";
                        setButtonStyle(bCity60109, dCity60109, strCity60109);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
		
		final CircularProgressButton bCity60110 = (CircularProgressButton)this.findViewById(R.id.butCity60110);
        final CircularProgressButton dCity60110 = (CircularProgressButton)this.findViewById(R.id.dCity60110);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60110 = (Spinner) findViewById(R.id.spinnerCity60110);
        sCity60110.setAdapter(adapter5);
        sCity60110.setSelection(0);
        sCity60110.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60110.getSelectedItemPosition()) {
                    case (0):
                        strCity60110 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153895.pdf";
                        setButtonStyle(bCity60110, dCity60110, strCity60110);
                        break;
                    case (1):
                        strCity60110 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153897.pdf";
                        setButtonStyle(bCity60110, dCity60110, strCity60110);
                        break;
                    case (2):
                        strCity60110 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153899.pdf";
                        setButtonStyle(bCity60110, dCity60110, strCity60110);
                        break;
                    case (3):
                        strCity60110 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153901.pdf";
                        setButtonStyle(bCity60110, dCity60110, strCity60110);
                        break;
                    case (4):
                        strCity60110 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150425.pdf";
                        setButtonStyle(bCity60110, dCity60110, strCity60110);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60111 = (CircularProgressButton)this.findViewById(R.id.butCity60111);
        final CircularProgressButton dCity60111 = (CircularProgressButton)this.findViewById(R.id.dCity60111);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60111 = (Spinner) findViewById(R.id.spinnerCity60111);
        sCity60111.setAdapter(adapter2);
        sCity60111.setSelection(0);
        sCity60111.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60111.getSelectedItemPosition()) {
                    case (0):
                        strCity60111 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153903.pdf";
                        setButtonStyle(bCity60111, dCity60111, strCity60111);
                        break;
                    case (1):
                        strCity60111 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150578.pdf";
                        setButtonStyle(bCity60111, dCity60111, strCity60111);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60113 = (CircularProgressButton) findViewById(R.id.butCity60113);
        final CircularProgressButton dCity60113 = (CircularProgressButton) findViewById(R.id.dCity60113);
        strCity60113 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145888.pdf";
        setButtonStyle(bCity60113, dCity60113, strCity60113);

        final CircularProgressButton bCity60114 = (CircularProgressButton) findViewById(R.id.butCity60114);
        final CircularProgressButton dCity60114 = (CircularProgressButton) findViewById(R.id.dCity60114);
        strCity60114 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145902.pdf";
        setButtonStyle(bCity60114, dCity60114, strCity60114);

        final CircularProgressButton bCity60115 = (CircularProgressButton) findViewById(R.id.butCity60115);
        final CircularProgressButton dCity60115 = (CircularProgressButton) findViewById(R.id.dCity60115);
        strCity60115 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145910.pdf";
        setButtonStyle(bCity60115, dCity60115, strCity60115);

        final CircularProgressButton bCity60116 = (CircularProgressButton) findViewById(R.id.butCity60116);
        final CircularProgressButton dCity60116 = (CircularProgressButton) findViewById(R.id.dCity60116);
        strCity60116 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145998.pdf";
        setButtonStyle(bCity60116, dCity60116, strCity60116);

        final CircularProgressButton bCity60117 = (CircularProgressButton)this.findViewById(R.id.butCity60117);
        final CircularProgressButton dCity60117 = (CircularProgressButton)this.findViewById(R.id.dCity60117);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60117 = (Spinner) findViewById(R.id.spinnerCity60117);
        sCity60117.setAdapter(adapter2);
        sCity60117.setSelection(0);
        sCity60117.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60117.getSelectedItemPosition()) {
                    case (0):
                        strCity60117 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150616.pdf";
                        setButtonStyle(bCity60117, dCity60117, strCity60117);
                        break;
                    case (1):
                        strCity60117 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150619.pdf";
                        setButtonStyle(bCity60117, dCity60117, strCity60117);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60118 = (CircularProgressButton)this.findViewById(R.id.butCity60118);
        final CircularProgressButton dCity60118 = (CircularProgressButton)this.findViewById(R.id.dCity60118);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60118 = (Spinner) findViewById(R.id.spinnerCity60118);
        sCity60118.setAdapter(adapter2);
        sCity60118.setSelection(0);
        sCity60118.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60118.getSelectedItemPosition()) {
                    case (0):
                        strCity60118 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146000.pdf";
                        setButtonStyle(bCity60118, dCity60118, strCity60118);
                        break;
                    case (1):
                        strCity60118 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150706.pdf";
                        setButtonStyle(bCity60118, dCity60118, strCity60118);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60119 = (CircularProgressButton)this.findViewById(R.id.butCity60119);
        final CircularProgressButton dCity60119 = (CircularProgressButton)this.findViewById(R.id.dCity60119);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60119 = (Spinner) findViewById(R.id.spinnerCity60119);
        sCity60119.setAdapter(adapter3);
        sCity60119.setSelection(0);
        sCity60119.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60119.getSelectedItemPosition()) {
                    case (0):
                        strCity60119 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150624.pdf";
                        setButtonStyle(bCity60119, dCity60119, strCity60119);
                        break;
                    case (1):
                        strCity60119 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150628.pdf";
                        setButtonStyle(bCity60119, dCity60119, strCity60119);
                        break;
                    case (2):
                        strCity60119 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150631.pdf";
                        setButtonStyle(bCity60119, dCity60119, strCity60119);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60126 = (CircularProgressButton) findViewById(R.id.butCity60126);
        final CircularProgressButton dCity60126 = (CircularProgressButton) findViewById(R.id.dCity60126);
        strCity60126 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146001.pdf";
        setButtonStyle(bCity60126, dCity60126, strCity60126);

        final CircularProgressButton bCity60127 = (CircularProgressButton) findViewById(R.id.butCity60127);
        final CircularProgressButton dCity60127 = (CircularProgressButton) findViewById(R.id.dCity60127);
        strCity60127 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146003.pdf";
        setButtonStyle(bCity60127, dCity60127, strCity60127);

        final CircularProgressButton bCity60128 = (CircularProgressButton)this.findViewById(R.id.butCity60128);
        final CircularProgressButton dCity60128 = (CircularProgressButton)this.findViewById(R.id.dCity60128);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60128 = (Spinner) findViewById(R.id.spinnerCity60128);
        sCity60128.setAdapter(adapter2);
        sCity60128.setSelection(0);
        sCity60128.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60128.getSelectedItemPosition()) {
                    case (0):
                        strCity60128 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146006.pdf";
                        setButtonStyle(bCity60128, dCity60128, strCity60128);
                        break;
                    case (1):
                        strCity60128 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150573.pdf";
                        setButtonStyle(bCity60128, dCity60128, strCity60128);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60129 = (CircularProgressButton)this.findViewById(R.id.butCity60129);
        final CircularProgressButton dCity60129 = (CircularProgressButton)this.findViewById(R.id.dCity60129);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60129 = (Spinner) findViewById(R.id.spinnerCity60129);
        sCity60129.setAdapter(adapter2);
        sCity60129.setSelection(0);
        sCity60129.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60129.getSelectedItemPosition()) {
                    case (0):
                        strCity60129 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150620.pdf";
                        setButtonStyle(bCity60129, dCity60129, strCity60129);
                        break;
                    case (1):
                        strCity60129 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150623.pdf";
                        setButtonStyle(bCity60129, dCity60129, strCity60129);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCity60130 = (CircularProgressButton)this.findViewById(R.id.butCity60130);
        final CircularProgressButton dCity60130 = (CircularProgressButton)this.findViewById(R.id.dCity60130);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, five);
//        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCity60130 = (Spinner) findViewById(R.id.spinnerCity60130);
        sCity60130.setAdapter(adapter6);
        sCity60130.setSelection(0);
        sCity60130.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCity60130.getSelectedItemPosition()) {
                    case (0):
                        strCity60130 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153907.pdf";
                        setButtonStyle(bCity60130, dCity60130, strCity60130);
                        break;
                    case (1):
                        strCity60130 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150454.pdf";
                        setButtonStyle(bCity60130, dCity60130, strCity60130);
                        break;
                    case (2):
                        strCity60130 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154799.pdf";
                        setButtonStyle(bCity60130, dCity60130, strCity60130);
                        break;
                    case (3):
                        strCity60130 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150462.pdf";
                        setButtonStyle(bCity60130, dCity60130, strCity60130);
                        break;
                    case (4):
                        strCity60130 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154805.pdf";
                        setButtonStyle(bCity60130, dCity60130, strCity60130);
                        break;
                    case (5):
                        strCity60130 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150471.pdf";
                        setButtonStyle(bCity60130, dCity60130, strCity60130);
                        break;
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });





        bCity60044.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60044, bCity60044, dCity60044);
            }
        });
        dCity60044.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60044, bCity60044, dCity60044);
            }
        });

        bCity60047.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60047, bCity60047, dCity60047);
            }
        });
        dCity60047.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60047, bCity60047, dCity60047);
            }
        });

        bCity60050.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60050, bCity60050, dCity60050);
            }
        });
        dCity60050.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60050, bCity60050, dCity60050);
            }
        });

        bCity60051.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60051, bCity60051, dCity60051);
            }
        });
        dCity60051.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60051, bCity60051, dCity60051);
            }
        });

        bCity60052.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60052, bCity60052, dCity60052);
            }
        });
        dCity60052.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60052, bCity60052, dCity60052);
            }
        });

        bCity60067.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60067, bCity60067, dCity60067);
            }
        });
        dCity60067.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60067, bCity60067, dCity60067);
            }
        });

        bCity60069.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60069, bCity60069, dCity60069);
            }
        });
        dCity60069.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60069, bCity60069, dCity60069);
            }
        });

        bCity60072.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60072, bCity60072, dCity60072);
            }
        });
        dCity60072.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60072, bCity60072, dCity60072);
            }
        });

        bCity60073.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60073, bCity60073, dCity60073);
            }
        });
        dCity60073.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60073, bCity60073, dCity60073);
            }
        });

        bCity60074.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60074, bCity60074, dCity60074);
            }
        });
        dCity60074.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60074, bCity60074, dCity60074);
            }
        });

        bCity60076.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60076, bCity60076, dCity60076);
            }
        });
        dCity60076.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60076, bCity60076, dCity60076);
            }
        });

        bCity60077.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60077, bCity60077, dCity60077);
            }
        });
        dCity60077.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60077, bCity60077, dCity60077);
            }
        });

        bCity60078.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60078, bCity60078, dCity60078);
            }
        });
        dCity60078.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60078, bCity60078, dCity60078);
            }
        });

        bCity60079.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60079, bCity60079, dCity60079);
            }
        });
        dCity60079.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60079, bCity60079, dCity60079);
            }
        });

        bCity60080.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60080, bCity60080, dCity60080);
            }
        });
        dCity60080.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60080, bCity60080, dCity60080);
            }
        });

        bCity60081.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60081, bCity60081, dCity60081);
            }
        });
        dCity60081.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60081, bCity60081, dCity60081);
            }
        });

        bCity60084.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60084, bCity60084, dCity60084);
            }
        });
        dCity60084.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60084, bCity60084, dCity60084);
            }
        });

        bCity60085.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60085, bCity60085, dCity60085);
            }
        });
        dCity60085.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60085, bCity60085, dCity60085);
            }
        });

        bCity60090.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60090, bCity60090, dCity60090);
            }
        });
        dCity60090.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60090, bCity60090, dCity60090);
            }
        });

        bCity60091.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60091, bCity60091, dCity60091);
            }
        });
        dCity60091.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60091, bCity60091, dCity60091);
            }
        });

        bCity60092.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60092, bCity60092, dCity60092);
            }
        });
        dCity60092.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60092, bCity60092, dCity60092);
            }
        });

        bCity60093.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60093, bCity60093, dCity60093);
            }
        });
        dCity60093.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60093, bCity60093, dCity60093);
            }
        });

        bCity60095.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60095, bCity60095, dCity60095);
            }
        });
        dCity60095.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60095, bCity60095, dCity60095);
            }
        });

        bCity60097.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60097, bCity60097, dCity60097);
            }
        });
        dCity60097.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60097, bCity60097, dCity60097);
            }
        });

        bCity60105.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60105, bCity60105, dCity60105);
            }
        });
        dCity60105.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60105, bCity60105, dCity60105);
            }
        });

        bCity60106.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60106, bCity60106, dCity60106);
            }
        });
        dCity60106.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60106, bCity60106, dCity60106);
            }
        });

        bCity60107.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60107, bCity60107, dCity60107);
            }
        });
        dCity60107.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60107, bCity60107, dCity60107);
            }
        });

        bCity60108.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60108, bCity60108, dCity60108);
            }
        });
        dCity60108.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60108, bCity60108, dCity60108);
            }
        });

        bCity60109.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60109, bCity60109, dCity60109);
            }
        });
        dCity60109.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60109, bCity60109, dCity60109);
            }
        });

        bCity60110.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60110, bCity60110, dCity60110);
            }
        });
        dCity60110.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60110, bCity60110, dCity60110);
            }
        });

        bCity60111.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60111, bCity60111, dCity60111);
            }
        });
        dCity60111.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60111, bCity60111, dCity60111);
            }
        });

        bCity60113.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60113, bCity60113, dCity60113);
            }
        });
        dCity60113.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60113, bCity60113, dCity60113);
            }
        });

        bCity60114.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60114, bCity60114, dCity60114);
            }
        });
        dCity60114.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60114, bCity60114, dCity60114);
            }
        });

        bCity60115.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60115, bCity60115, dCity60115);
            }
        });
        dCity60115.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60115, bCity60115, dCity60115);
            }
        });

        bCity60116.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60116, bCity60116, dCity60116);
            }
        });
        dCity60116.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60116, bCity60116, dCity60116);
            }
        });

        bCity60117.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60117, bCity60117, dCity60117);
            }
        });
        dCity60117.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60117, bCity60117, dCity60117);
            }
        });

        bCity60118.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60118, bCity60118, dCity60118);
            }
        });
        dCity60118.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60118, bCity60118, dCity60118);
            }
        });

        bCity60119.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60119, bCity60119, dCity60119);
            }
        });
        dCity60119.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60119, bCity60119, dCity60119);
            }
        });

        bCity60126.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60126, bCity60126, dCity60126);
            }
        });
        dCity60126.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60126, bCity60126, dCity60126);
            }
        });

        bCity60127.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60127, bCity60127, dCity60127);
            }
        });
        dCity60127.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60127, bCity60127, dCity60127);
            }
        });

        bCity60128.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60128, bCity60128, dCity60128);
            }
        });
        dCity60128.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60128, bCity60128, dCity60128);
            }
        });

        bCity60129.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60129, bCity60129, dCity60129);
            }
        });
        dCity60129.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60129, bCity60129, dCity60129);
            }
        });

        bCity60130.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(City.this, strCity60130, bCity60130, dCity60130);
            }
        });
        dCity60130.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(City.this, strCity60130, bCity60130, dCity60130);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        Appodeal.onResume(this, Appodeal.BANNER);
    }


    public void setButtonStyle( final CircularProgressButton buttonOpen,
                                final CircularProgressButton buttonDelete, final String jonal ) {
        if (!pdfe.isPDFSupported(City.this)) {
            buttonOpen.setProgress(100);
            buttonOpen.setText(R.string.open);
            buttonDelete.setVisibility(View.GONE);
        } else if (pdfe.downloadInspection(City.this, jonal)){
            buttonOpen.setProgress(100);
            buttonOpen.setText(R.string.open);
            buttonDelete.setVisibility(View.VISIBLE);
        } else {
            buttonOpen.setText(R.string.download);
            buttonDelete.setVisibility(View.GONE);
            buttonOpen.setProgress(0);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//                int id = item.getItemId();
//
//                //noinspection SimplifiableIfStatement
//                if (id == R.id.action_settings) {
//                return true;
//                }
        switch (item.getItemId()) {
            case R.id.rate_us:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.rateuri)));
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageCity60044:
                Intent fullScreenIntent = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent.putExtra("imageFullScr", R.drawable.city60044full);
                startActivity(fullScreenIntent);
                break;
            case R.id.imageCity60047:
                Intent fullScreenIntent1 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent1.putExtra("imageFullScr", R.drawable.city60047full);
                startActivity(fullScreenIntent1);
                break;
            case R.id.imageCity60050:
                Intent fullScreenIntent2 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent2.putExtra("imageFullScr", R.drawable.city60050full);
                startActivity(fullScreenIntent2);
                break;
            case R.id.imageCity60051:
                Intent fullScreenIntent3 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent3.putExtra("imageFullScr", R.drawable.city60051full);
                startActivity(fullScreenIntent3);
                break;
            case R.id.imageCity60052:
                Intent fullScreenIntent4 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent4.putExtra("imageFullScr", R.drawable.city60052full);
                startActivity(fullScreenIntent4);
                break;
            case R.id.imageCity60067:
                Intent fullScreenIntent5 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent5.putExtra("imageFullScr", R.drawable.city60067full);
                startActivity(fullScreenIntent5);
                break;
            case R.id.imageCity60069:
                Intent fullScreenIntent6 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent6.putExtra("imageFullScr", R.drawable.city60069full);
                startActivity(fullScreenIntent6);
                break;
            case R.id.imageCity60072:
                Intent fullScreenIntent7 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent7.putExtra("imageFullScr", R.drawable.city60072full);
                startActivity(fullScreenIntent7);
                break;
            case R.id.imageCity60073:
                Intent fullScreenIntent8 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent8.putExtra("imageFullScr", R.drawable.city60073full);
                startActivity(fullScreenIntent8);
                break;
            case R.id.imageCity60074:
                Intent fullScreenIntent9 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent9.putExtra("imageFullScr", R.drawable.city60074full);
                startActivity(fullScreenIntent9);
                break;
            case R.id.imageCity60076:
                Intent fullScreenIntent10 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent10.putExtra("imageFullScr", R.drawable.city60076full);
                startActivity(fullScreenIntent10);
                break;
            case R.id.imageCity60077:
                Intent fullScreenIntent11 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent11.putExtra("imageFullScr", R.drawable.city60077full);
                startActivity(fullScreenIntent11);
                break;
            case R.id.imageCity60078:
                Intent fullScreenIntent12 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent12.putExtra("imageFullScr", R.drawable.city60078full);
                startActivity(fullScreenIntent12);
                break;
            case R.id.imageCity60079:
                Intent fullScreenIntent13 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent13.putExtra("imageFullScr", R.drawable.city60079full);
                startActivity(fullScreenIntent13);
                break;
            case R.id.imageCity60080:
                Intent fullScreenIntent14 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent14.putExtra("imageFullScr", R.drawable.city60080full);
                startActivity(fullScreenIntent14);
                break;
            case R.id.imageCity60081:
                Intent fullScreenIntent15 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent15.putExtra("imageFullScr", R.drawable.city60081full);
                startActivity(fullScreenIntent15);
                break;
            case R.id.imageCity60084:
                Intent fullScreenIntent16 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent16.putExtra("imageFullScr", R.drawable.city60084full);
                startActivity(fullScreenIntent16);
                break;
            case R.id.imageCity60085:
                Intent fullScreenIntent17 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent17.putExtra("imageFullScr", R.drawable.city60085full);
                startActivity(fullScreenIntent17);
                break;
            case R.id.imageCity60090:
                Intent fullScreenIntent18 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent18.putExtra("imageFullScr", R.drawable.city60090full);
                startActivity(fullScreenIntent18);
                break;
            case R.id.imageCity60091:
                Intent fullScreenIntent19 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent19.putExtra("imageFullScr", R.drawable.city60091full);
                startActivity(fullScreenIntent19);
                break;
            case R.id.imageCity60092:
                Intent fullScreenIntent20 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent20.putExtra("imageFullScr", R.drawable.city60092full);
                startActivity(fullScreenIntent20);
                break;
            case R.id.imageCity60093:
                Intent fullScreenIntent21 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent21.putExtra("imageFullScr", R.drawable.city60093full);
                startActivity(fullScreenIntent21);
                break;
            case R.id.imageCity60095:
                Intent fullScreenIntent22 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent22.putExtra("imageFullScr", R.drawable.city60095full);
                startActivity(fullScreenIntent22);
                break;
            case R.id.imageCity60097:
                Intent fullScreenIntent23 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent23.putExtra("imageFullScr", R.drawable.city60097full);
                startActivity(fullScreenIntent23);
                break;
            case R.id.imageCity60105:
                Intent fullScreenIntent24 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent24.putExtra("imageFullScr", R.drawable.city60105full);
                startActivity(fullScreenIntent24);
                break;
            case R.id.imageCity60106:
                Intent fullScreenIntent25 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent25.putExtra("imageFullScr", R.drawable.city60106full);
                startActivity(fullScreenIntent25);
                break;
            case R.id.imageCity60107:
                Intent fullScreenIntent26 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent26.putExtra("imageFullScr", R.drawable.city60107full);
                startActivity(fullScreenIntent26);
                break;
            case R.id.imageCity60108:
                Intent fullScreenIntent27 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent27.putExtra("imageFullScr", R.drawable.city60108full);
                startActivity(fullScreenIntent27);
                break;
            case R.id.imageCity60109:
                Intent fullScreenIntent28 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent28.putExtra("imageFullScr", R.drawable.city60109full);
                startActivity(fullScreenIntent28);
                break;
            case R.id.imageCity60110:
                Intent fullScreenIntent29 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent29.putExtra("imageFullScr", R.drawable.city60110full);
                startActivity(fullScreenIntent29);
                break;
            case R.id.imageCity60111:
                Intent fullScreenIntent30 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent30.putExtra("imageFullScr", R.drawable.city60111full);
                startActivity(fullScreenIntent30);
                break;
            case R.id.imageCity60113:
                Intent fullScreenIntent31 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent31.putExtra("imageFullScr", R.drawable.city60113full);
                startActivity(fullScreenIntent31);
                break;
            case R.id.imageCity60114:
                Intent fullScreenIntent32 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent32.putExtra("imageFullScr", R.drawable.city60114full);
                startActivity(fullScreenIntent32);
                break;
            case R.id.imageCity60115:
                Intent fullScreenIntent33 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent33.putExtra("imageFullScr", R.drawable.city60115full);
                startActivity(fullScreenIntent33);
                break;
            case R.id.imageCity60116:
                Intent fullScreenIntent34 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent34.putExtra("imageFullScr", R.drawable.city60116full);
                startActivity(fullScreenIntent34);
                break;
            case R.id.imageCity60117:
                Intent fullScreenIntent35 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent35.putExtra("imageFullScr", R.drawable.city60117full);
                startActivity(fullScreenIntent35);
                break;
            case R.id.imageCity60118:
                Intent fullScreenIntent36 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent36.putExtra("imageFullScr", R.drawable.city60118full);
                startActivity(fullScreenIntent36);
                break;
            case R.id.imageCity60119:
                Intent fullScreenIntent37 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent37.putExtra("imageFullScr", R.drawable.city60119full);
                startActivity(fullScreenIntent37);
                break;
            case R.id.imageCity60126:
                Intent fullScreenIntent38 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent38.putExtra("imageFullScr", R.drawable.city60126full);
                startActivity(fullScreenIntent38);
                break;
            case R.id.imageCity60127:
                Intent fullScreenIntent39 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent39.putExtra("imageFullScr", R.drawable.city60127full);
                startActivity(fullScreenIntent39);
                break;
            case R.id.imageCity60128:
                Intent fullScreenIntent40 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent40.putExtra("imageFullScr", R.drawable.city60128full);
                startActivity(fullScreenIntent40);
                break;
            case R.id.imageCity60129:
                Intent fullScreenIntent41 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent41.putExtra("imageFullScr", R.drawable.city60129full);
                startActivity(fullScreenIntent41);
                break;
            case R.id.imageCity60130:
                Intent fullScreenIntent42 = new Intent(City.this, FullscreenActivity.class);
                fullScreenIntent42.putExtra("imageFullScr", R.drawable.city60130full);
                startActivity(fullScreenIntent42);
                break;
        }
    }
}
