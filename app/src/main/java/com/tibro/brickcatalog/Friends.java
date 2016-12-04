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

public class Friends extends AppCompatActivity implements View.OnClickListener  {

    private Tracker mTracker;

    PDFTools pdfe = new PDFTools();

    String[] two = {"1/2", "2/2"};
    String[] three = {"1/3", "2/3", "3/3"};

    String strFri41093;
    String strFri41094;
    String strFri41095;
    String strFri41097;
    String strFri41099;
    String strFri41100;
    String strFri41101;
    String strFri41103;
    String strFri41104;
    String strFri41105;
    String strFri41106;
    String strFri41108;
    String strFri41109;
    String strFri41110;
    String strFri41111;
    String strFri41112;
    String strFri41113;
    String strFri41114;
    String strFri41115;
    String strFri41116;
    String strFri41117;
    String strFri41118;
    String strFri41119;
    String strFri41120;
    String strFri41121;
    String strFri41122;
    String strFri41135;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
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
        mTracker.setScreenName("Friends");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        // [END screen_view_hit]


        final ImageView imageFri41093 = (ImageView) findViewById(R.id.imageFri41093);
        imageFri41093.setOnClickListener(this);
        final ImageView imageFri41094 = (ImageView) findViewById(R.id.imageFri41094);
        imageFri41094.setOnClickListener(this);
        final ImageView imageFri41095 = (ImageView) findViewById(R.id.imageFri41095);
        imageFri41095.setOnClickListener(this);
        final ImageView imageFri41097 = (ImageView) findViewById(R.id.imageFri41097);
        imageFri41097.setOnClickListener(this);
        final ImageView imageFri41099 = (ImageView) findViewById(R.id.imageFri41099);
        imageFri41099.setOnClickListener(this);
        final ImageView imageFri41100 = (ImageView) findViewById(R.id.imageFri41100);
        imageFri41100.setOnClickListener(this);
        final ImageView imageFri41101 = (ImageView) findViewById(R.id.imageFri41101);
        imageFri41101.setOnClickListener(this);
        final ImageView imageFri41103 = (ImageView) findViewById(R.id.imageFri41103);
        imageFri41103.setOnClickListener(this);
        final ImageView imageFri41104 = (ImageView) findViewById(R.id.imageFri41104);
        imageFri41104.setOnClickListener(this);
        final ImageView imageFri41105 = (ImageView) findViewById(R.id.imageFri41105);
        imageFri41105.setOnClickListener(this);
        final ImageView imageFri41106 = (ImageView) findViewById(R.id.imageFri41106);
        imageFri41106.setOnClickListener(this);
        final ImageView imageFri41108 = (ImageView) findViewById(R.id.imageFri41108);
        imageFri41108.setOnClickListener(this);
        final ImageView imageFri41109 = (ImageView) findViewById(R.id.imageFri41109);
        imageFri41109.setOnClickListener(this);
        final ImageView imageFri41110 = (ImageView) findViewById(R.id.imageFri41110);
        imageFri41110.setOnClickListener(this);
        final ImageView imageFri41111 = (ImageView) findViewById(R.id.imageFri41111);
        imageFri41111.setOnClickListener(this);
        final ImageView imageFri41112 = (ImageView) findViewById(R.id.imageFri41112);
        imageFri41112.setOnClickListener(this);
        final ImageView imageFri41113 = (ImageView) findViewById(R.id.imageFri41113);
        imageFri41113.setOnClickListener(this);
        final ImageView imageFri41114 = (ImageView) findViewById(R.id.imageFri41114);
        imageFri41114.setOnClickListener(this);
        final ImageView imageFri41115 = (ImageView) findViewById(R.id.imageFri41115);
        imageFri41115.setOnClickListener(this);
        final ImageView imageFri41116 = (ImageView) findViewById(R.id.imageFri41116);
        imageFri41116.setOnClickListener(this);
        final ImageView imageFri41117 = (ImageView) findViewById(R.id.imageFri41117);
        imageFri41117.setOnClickListener(this);
        final ImageView imageFri41118 = (ImageView) findViewById(R.id.imageFri41118);
        imageFri41118.setOnClickListener(this);
        final ImageView imageFri41119 = (ImageView) findViewById(R.id.imageFri41119);
        imageFri41119.setOnClickListener(this);
        final ImageView imageFri41120 = (ImageView) findViewById(R.id.imageFri41120);
        imageFri41120.setOnClickListener(this);
        final ImageView imageFri41121 = (ImageView) findViewById(R.id.imageFri41121);
        imageFri41121.setOnClickListener(this);
        final ImageView imageFri41122 = (ImageView) findViewById(R.id.imageFri41122);
        imageFri41122.setOnClickListener(this);
        final ImageView imageFri41135 = (ImageView) findViewById(R.id.imageFri41135);
        imageFri41135.setOnClickListener(this);



        final CircularProgressButton bFri41093 = (CircularProgressButton) findViewById(R.id.butFri41093);
        final CircularProgressButton dFri41093 = (CircularProgressButton) findViewById(R.id.dFri41093);
        strFri41093 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112983.pdf";
        setButtonStyle(bFri41093, dFri41093, strFri41093);

        final CircularProgressButton bFri41094 = (CircularProgressButton)this.findViewById(R.id.butFri41094);
        final CircularProgressButton dFri41094 = (CircularProgressButton)this.findViewById(R.id.dFri41094);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sFri41094 = (Spinner) findViewById(R.id.spinnerFri41094);
        sFri41094.setAdapter(adapter2);
        sFri41094.setSelection(0);
        sFri41094.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41094.getSelectedItemPosition()) {
                    case (0):
                        strFri41094 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117887.pdf";
                        setButtonStyle(bFri41094, dFri41094, strFri41094);
                        break;
                    case (1):
                        strFri41094 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117896.pdf";
                        setButtonStyle(bFri41094, dFri41094, strFri41094);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });


        final CircularProgressButton bFri41095 = (CircularProgressButton)this.findViewById(R.id.butFri41095);
        final CircularProgressButton dFri41095 = (CircularProgressButton)this.findViewById(R.id.dFri41095);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, three);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sFri41095 = (Spinner) findViewById(R.id.spinnerFri41095);
        sFri41095.setAdapter(adapter3);
        sFri41095.setSelection(0);
        sFri41095.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41095.getSelectedItemPosition()) {
                    case (0):
                        strFri41095 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117914.pdf";
                        setButtonStyle(bFri41095, dFri41095, strFri41095);
                        break;
                    case (1):
                        strFri41095 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117921.pdf";
                        setButtonStyle(bFri41095, dFri41095, strFri41095);
                        break;
                    case (2):
                        strFri41095 = "http://cache.lego.com/bigdownloads/buildinginstructions/6119154.pdf";
                        setButtonStyle(bFri41095, dFri41095, strFri41095);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bFri41097 = (CircularProgressButton) findViewById(R.id.butFri41097);
        final CircularProgressButton dFri41097 = (CircularProgressButton) findViewById(R.id.dFri41097);
        strFri41097 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114527.pdf";
        setButtonStyle(bFri41097, dFri41097, strFri41097);

        final CircularProgressButton bFri41099 = (CircularProgressButton) findViewById(R.id.butFri41099);
        final CircularProgressButton dFri41099 = (CircularProgressButton) findViewById(R.id.dFri41099);
        strFri41099 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127732.pdf";
        setButtonStyle(bFri41099, dFri41099, strFri41099);

        final CircularProgressButton bFri41100 = (CircularProgressButton) findViewById(R.id.butFri41100);
        final CircularProgressButton dFri41100 = (CircularProgressButton) findViewById(R.id.dFri41100);
        strFri41100 = "http://cache.lego.com/bigdownloads/buildinginstructions/6133012.pdf";
        setButtonStyle(bFri41100, dFri41100, strFri41100);

        final CircularProgressButton bFri41101 = (CircularProgressButton)this.findViewById(R.id.butFri41101);
        final CircularProgressButton dFri41101 = (CircularProgressButton)this.findViewById(R.id.dFri41101);

        final Spinner sFri41101 = (Spinner) findViewById(R.id.spinnerFri41101);
        sFri41101.setAdapter(adapter2);
        sFri41101.setSelection(0);
        sFri41101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41101.getSelectedItemPosition()) {
                    case (0):
                        strFri41101 = "http://cache.lego.com/bigdownloads/buildinginstructions/6131097.pdf";
                        setButtonStyle(bFri41101, dFri41101, strFri41101);
                        break;
                    case (1):
                        strFri41101 = "http://cache.lego.com/bigdownloads/buildinginstructions/6131127.pdf";
                        setButtonStyle(bFri41101, dFri41101, strFri41101);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bFri41103 = (CircularProgressButton) findViewById(R.id.butFri41103);
        final CircularProgressButton dFri41103 = (CircularProgressButton) findViewById(R.id.dFri41103);
        strFri41103 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127627.pdf";
        setButtonStyle(bFri41103, dFri41103, strFri41103);

        final CircularProgressButton bFri41104 = (CircularProgressButton) findViewById(R.id.butFri41104);
        final CircularProgressButton dFri41104 = (CircularProgressButton) findViewById(R.id.dFri41104);
        strFri41104 = "http://cache.lego.com/bigdownloads/buildinginstructions/6141726.pdf";
        setButtonStyle(bFri41104, dFri41104, strFri41104);

        final CircularProgressButton bFri41105 = (CircularProgressButton)this.findViewById(R.id.butFri41105);
        final CircularProgressButton dFri41105 = (CircularProgressButton)this.findViewById(R.id.dFri41105);

        final Spinner sFri41105 = (Spinner) findViewById(R.id.spinnerFri41105);
        sFri41105.setAdapter(adapter2);
        sFri41105.setSelection(0);
        sFri41105.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41105.getSelectedItemPosition()) {
                    case (0):
                        strFri41105 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129215.pdf";
                        setButtonStyle(bFri41105, dFri41105, strFri41105);
                        break;
                    case (1):
                        strFri41105 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129218.pdf";
                        setButtonStyle(bFri41105, dFri41105, strFri41105);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bFri41106 = (CircularProgressButton)this.findViewById(R.id.butFri41106);
        final CircularProgressButton dFri41106 = (CircularProgressButton)this.findViewById(R.id.dFri41106);

        final Spinner sFri41106 = (Spinner) findViewById(R.id.spinnerFri41106);
        sFri41106.setAdapter(adapter2);
        sFri41106.setSelection(0);
        sFri41106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41106.getSelectedItemPosition()) {
                    case (0):
                        strFri41106 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127737.pdf";
                        setButtonStyle(bFri41106, dFri41106, strFri41106);
                        break;
                    case (1):
                        strFri41106 = "http://cache.lego.com/bigdownloads/buildinginstructions/6156946.pdf";
                        setButtonStyle(bFri41106, dFri41106, strFri41106);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bFri41108 = (CircularProgressButton)this.findViewById(R.id.butFri41108);
        final CircularProgressButton dFri41108 = (CircularProgressButton)this.findViewById(R.id.dFri41108);

        final Spinner sFri41108 = (Spinner) findViewById(R.id.spinnerFri41108);
        sFri41108.setAdapter(adapter2);
        sFri41108.setSelection(0);
        sFri41108.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41108.getSelectedItemPosition()) {
                    case (0):
                        strFri41108 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127641.pdf";
                        setButtonStyle(bFri41108, dFri41108, strFri41108);
                        break;
                    case (1):
                        strFri41108 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127646.pdf";
                        setButtonStyle(bFri41108, dFri41108, strFri41108);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bFri41109 = (CircularProgressButton) findViewById(R.id.butFri41109);
        final CircularProgressButton dFri41109 = (CircularProgressButton) findViewById(R.id.dFri41109);
        strFri41109 = "http://cache.lego.com/bigdownloads/buildinginstructions/6131682.pdf";
        setButtonStyle(bFri41109, dFri41109, strFri41109);

        final CircularProgressButton bFri41110 = (CircularProgressButton) findViewById(R.id.butFri41110);
        final CircularProgressButton dFri41110 = (CircularProgressButton) findViewById(R.id.dFri41110);
        strFri41110 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147705.pdf";
        setButtonStyle(bFri41110, dFri41110, strFri41110);

        final CircularProgressButton bFri41111 = (CircularProgressButton) findViewById(R.id.butFri41111);
        final CircularProgressButton dFri41111 = (CircularProgressButton) findViewById(R.id.dFri41111);
        strFri41111 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147707.pdf";
        setButtonStyle(bFri41111, dFri41111, strFri41111);

        final CircularProgressButton bFri41112 = (CircularProgressButton) findViewById(R.id.butFri41112);
        final CircularProgressButton dFri41112 = (CircularProgressButton) findViewById(R.id.dFri41112);
        strFri41112 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147710.pdf";
        setButtonStyle(bFri41112, dFri41112, strFri41112);

        final CircularProgressButton bFri41113 = (CircularProgressButton) findViewById(R.id.butFri41113);
        final CircularProgressButton dFri41113 = (CircularProgressButton) findViewById(R.id.dFri41113);
        strFri41113 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147713.pdf";
        setButtonStyle(bFri41113, dFri41113, strFri41113);

        final CircularProgressButton bFri41114 = (CircularProgressButton) findViewById(R.id.butFri41114);
        final CircularProgressButton dFri41114 = (CircularProgressButton) findViewById(R.id.dFri41114);
        strFri41114 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147721.pdf";
        setButtonStyle(bFri41114, dFri41114, strFri41114);

        final CircularProgressButton bFri41115 = (CircularProgressButton) findViewById(R.id.butFri41115);
        final CircularProgressButton dFri41115 = (CircularProgressButton) findViewById(R.id.dFri41115);
        strFri41115 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147724.pdf";
        setButtonStyle(bFri41115, dFri41115, strFri41115);

        final CircularProgressButton bFri41116 = (CircularProgressButton) findViewById(R.id.butFri41116);
        final CircularProgressButton dFri41116 = (CircularProgressButton) findViewById(R.id.dFri41116);
        strFri41116 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154074.pdf";
        setButtonStyle(bFri41116, dFri41116, strFri41116);

        final CircularProgressButton bFri41117 = (CircularProgressButton) findViewById(R.id.butFri41117);
        final CircularProgressButton dFri41117 = (CircularProgressButton) findViewById(R.id.dFri41117);
        strFri41117 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147729.pdf";
        setButtonStyle(bFri41117, dFri41117, strFri41117);

        final CircularProgressButton bFri41118 = (CircularProgressButton) findViewById(R.id.butFri41118);
        final CircularProgressButton dFri41118 = (CircularProgressButton) findViewById(R.id.dFri41118);
        final Spinner sFri41118 = (Spinner) findViewById(R.id.spinnerFri41118);
        sFri41118.setAdapter(adapter2);
        sFri41118.setSelection(0);
        sFri41118.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41118.getSelectedItemPosition()) {
                    case (0):
                        strFri41118 = "http://cache.lego.com/bigdownloads/buildinginstructions/6160190.pdf";
                        setButtonStyle(bFri41118, dFri41118, strFri41118);
                        break;
                    case (1):
                        strFri41118 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147735.pdf";
                        setButtonStyle(bFri41118, dFri41118, strFri41118);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bFri41119 = (CircularProgressButton) findViewById(R.id.butFri41119);
        final CircularProgressButton dFri41119 = (CircularProgressButton) findViewById(R.id.dFri41119);
        final Spinner sFri41119 = (Spinner) findViewById(R.id.spinnerFri41119);
        sFri41119.setAdapter(adapter2);
        sFri41119.setSelection(0);
        sFri41119.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41119.getSelectedItemPosition()) {
                    case (0):
                        strFri41119 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154081.pdf";
                        setButtonStyle(bFri41119, dFri41119, strFri41119);
                        break;
                    case (1):
                        strFri41119 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154085.pdf";
                        setButtonStyle(bFri41119, dFri41119, strFri41119);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bFri41120 = (CircularProgressButton) findViewById(R.id.butFri41120);
        final CircularProgressButton dFri41120 = (CircularProgressButton) findViewById(R.id.dFri41120);
        strFri41120 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147753.pdf";
        setButtonStyle(bFri41120, dFri41120, strFri41120);

        final CircularProgressButton bFri41121 = (CircularProgressButton) findViewById(R.id.butFri41121);
        final CircularProgressButton dFri41121 = (CircularProgressButton) findViewById(R.id.dFri41121);
        strFri41121 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154091.pdf";
        setButtonStyle(bFri41121, dFri41121, strFri41121);

        final CircularProgressButton bFri41122 = (CircularProgressButton) findViewById(R.id.butFri41122);
        final CircularProgressButton dFri41122 = (CircularProgressButton) findViewById(R.id.dFri41122);
        strFri41122 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154101.pdf";
        setButtonStyle(bFri41122, dFri41122, strFri41122);

        final CircularProgressButton bFri41135 = (CircularProgressButton) findViewById(R.id.butFri41135);
        final CircularProgressButton dFri41135 = (CircularProgressButton) findViewById(R.id.dFri41135);
        final Spinner sFri41135 = (Spinner) findViewById(R.id.spinnerFri41135);
        sFri41135.setAdapter(adapter3);
        sFri41135.setSelection(0);
        sFri41135.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sFri41135.getSelectedItemPosition()) {
                    case (0):
                        strFri41135 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147774.pdf";
                        setButtonStyle(bFri41135, dFri41135, strFri41135);
                        break;
                    case (1):
                        strFri41135 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154117.pdf";
                        setButtonStyle(bFri41135, dFri41135, strFri41135);
                        break;
                    case (2):
                        strFri41135 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154120.pdf";
                        setButtonStyle(bFri41135, dFri41135, strFri41135);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });



        bFri41093.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41093, bFri41093, dFri41093);
            }
        });
        dFri41093.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41093, bFri41093, dFri41093);
            }
        });

        bFri41094.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41094, bFri41094, dFri41094);
            }
        });
        dFri41094.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41094, bFri41094, dFri41094);
            }
        });

        bFri41095.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41095, bFri41095, dFri41095);
            }
        });
        dFri41095.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41095, bFri41095, dFri41095);
            }
        });

        bFri41097.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41097, bFri41097, dFri41097);
            }
        });
        dFri41097.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41097, bFri41097, dFri41097);
            }
        });

        bFri41099.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41099, bFri41099, dFri41099);
            }
        });
        dFri41099.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41099, bFri41099, dFri41099);
            }
        });

        bFri41100.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41100, bFri41100, dFri41100);
            }
        });
        dFri41100.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41100, bFri41100, dFri41100);
            }
        });

        bFri41101.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41101, bFri41101, dFri41101);
            }
        });
        dFri41101.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41101, bFri41101, dFri41101);
            }
        });

        bFri41103.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41103, bFri41103, dFri41103);
            }
        });
        dFri41103.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41103, bFri41103, dFri41103);
            }
        });

        bFri41104.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41104, bFri41104, dFri41104);
            }
        });
        dFri41104.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41104, bFri41104, dFri41104);
            }
        });

        bFri41105.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41105, bFri41105, dFri41105);
            }
        });
        dFri41105.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41105, bFri41105, dFri41105);
            }
        });

        bFri41106.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41106, bFri41106, dFri41106);
            }
        });
        dFri41106.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41106, bFri41106, dFri41106);
            }
        });

        bFri41108.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41108, bFri41108, dFri41108);
            }
        });
        dFri41108.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41108, bFri41108, dFri41108);
            }
        });

        bFri41109.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41109, bFri41109, dFri41109);
            }
        });
        dFri41109.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41109, bFri41109, dFri41109);
            }
        });

        bFri41110.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41110, bFri41110, dFri41110);
            }
        });
        dFri41110.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41110, bFri41110, dFri41110);
            }
        });

        bFri41111.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41111, bFri41111, dFri41111);
            }
        });
        dFri41111.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41111, bFri41111, dFri41111);
            }
        });

        bFri41112.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41112, bFri41112, dFri41112);
            }
        });
        dFri41112.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41112, bFri41112, dFri41112);
            }
        });

        bFri41113.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41113, bFri41113, dFri41113);
            }
        });
        dFri41113.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41113, bFri41113, dFri41113);
            }
        });

        bFri41114.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41114, bFri41114, dFri41114);
            }
        });
        dFri41114.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41114, bFri41114, dFri41114);
            }
        });

        bFri41115.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41115, bFri41115, dFri41115);
            }
        });
        dFri41115.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41115, bFri41115, dFri41115);
            }
        });

        bFri41116.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41116, bFri41116, dFri41116);
            }
        });
        dFri41116.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41116, bFri41116, dFri41116);
            }
        });

        bFri41117.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41117, bFri41117, dFri41117);
            }
        });
        dFri41117.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41117, bFri41117, dFri41117);
            }
        });

        bFri41117.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41117, bFri41117, dFri41117);
            }
        });
        dFri41117.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41117, bFri41117, dFri41117);
            }
        });

        bFri41118.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41118, bFri41118, dFri41118);
            }
        });
        dFri41118.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41118, bFri41118, dFri41118);
            }
        });

        bFri41119.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41119, bFri41119, dFri41119);
            }
        });
        dFri41119.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41119, bFri41119, dFri41119);
            }
        });

        bFri41120.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41120, bFri41120, dFri41120);
            }
        });
        dFri41120.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41120, bFri41120, dFri41120);
            }
        });

        bFri41121.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41121, bFri41121, dFri41121);
            }
        });
        dFri41121.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41121, bFri41121, dFri41121);
            }
        });

        bFri41122.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41122, bFri41122, dFri41122);
            }
        });
        dFri41122.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41122, bFri41122, dFri41122);
            }
        });

        bFri41135.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Friends.this, strFri41135, bFri41135, dFri41135);
            }
        });
        dFri41135.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Friends.this, strFri41135, bFri41135, dFri41135);
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
        if (!pdfe.isPDFSupported(Friends.this)) {
            buttonOpen.setProgress(100);
            buttonOpen.setText(R.string.open);
            buttonDelete.setVisibility(View.GONE);
        } else if (pdfe.downloadInspection(Friends.this, jonal)){
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
            case R.id.imageFri41093:
                Intent fullScreenIntent = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent.putExtra("imageFullScr", R.drawable.fri41093full);
                startActivity(fullScreenIntent);
                break;
            case R.id.imageFri41094:
                Intent fullScreenIntent1 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent1.putExtra("imageFullScr", R.drawable.fri41094full);
                startActivity(fullScreenIntent1);
                break;
            case R.id.imageFri41095:
                Intent fullScreenIntent2 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent2.putExtra("imageFullScr", R.drawable.fri41095full);
                startActivity(fullScreenIntent2);
                break;
            case R.id.imageFri41097:
                Intent fullScreenIntent3 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent3.putExtra("imageFullScr", R.drawable.fri41097full);
                startActivity(fullScreenIntent3);
                break;
            case R.id.imageFri41099:
                Intent fullScreenIntent4 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent4.putExtra("imageFullScr", R.drawable.fri41099full);
                startActivity(fullScreenIntent4);
                break;
            case R.id.imageFri41100:
                Intent fullScreenIntent5 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent5.putExtra("imageFullScr", R.drawable.fri41100full);
                startActivity(fullScreenIntent5);
                break;
            case R.id.imageFri41101:
                Intent fullScreenIntent6 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent6.putExtra("imageFullScr", R.drawable.fri41101full);
                startActivity(fullScreenIntent6);
                break;
            case R.id.imageFri41103:
                Intent fullScreenIntent7 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent7.putExtra("imageFullScr", R.drawable.fri41103full);
                startActivity(fullScreenIntent7);
                break;
            case R.id.imageFri41104:
                Intent fullScreenIntent8 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent8.putExtra("imageFullScr", R.drawable.fri41104full);
                startActivity(fullScreenIntent8);
                break;
            case R.id.imageFri41105:
                Intent fullScreenIntent9 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent9.putExtra("imageFullScr", R.drawable.fri41105full);
                startActivity(fullScreenIntent9);
                break;
            case R.id.imageFri41106:
                Intent fullScreenIntent10 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent10.putExtra("imageFullScr", R.drawable.fri41106full);
                startActivity(fullScreenIntent10);
                break;
            case R.id.imageFri41108:
                Intent fullScreenIntent11 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent11.putExtra("imageFullScr", R.drawable.fri41108full);
                startActivity(fullScreenIntent11);
                break;
            case R.id.imageFri41109:
                Intent fullScreenIntent12 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent12.putExtra("imageFullScr", R.drawable.fri41109full);
                startActivity(fullScreenIntent12);
                break;
            case R.id.imageFri41110:
                Intent fullScreenIntent13 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent13.putExtra("imageFullScr", R.drawable.fri41110full);
                startActivity(fullScreenIntent13);
                break;
            case R.id.imageFri41111:
                Intent fullScreenIntent14 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent14.putExtra("imageFullScr", R.drawable.fri41111full);
                startActivity(fullScreenIntent14);
                break;
            case R.id.imageFri41112:
                Intent fullScreenIntent15 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent15.putExtra("imageFullScr", R.drawable.fri41112full);
                startActivity(fullScreenIntent15);
                break;
            case R.id.imageFri41113:
                Intent fullScreenIntent16 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent16.putExtra("imageFullScr", R.drawable.fri41113full);
                startActivity(fullScreenIntent16);
                break;
            case R.id.imageFri41114:
                Intent fullScreenIntent17 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent17.putExtra("imageFullScr", R.drawable.fri41114full);
                startActivity(fullScreenIntent17);
                break;
            case R.id.imageFri41115:
                Intent fullScreenIntent18 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent18.putExtra("imageFullScr", R.drawable.fri41115full);
                startActivity(fullScreenIntent18);
                break;
            case R.id.imageFri41116:
                Intent fullScreenIntent19 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent19.putExtra("imageFullScr", R.drawable.fri41116full);
                startActivity(fullScreenIntent19);
                break;
            case R.id.imageFri41117:
                Intent fullScreenIntent20 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent20.putExtra("imageFullScr", R.drawable.fri41117full);
                startActivity(fullScreenIntent20);
                break;
            case R.id.imageFri41118:
                Intent fullScreenIntent21 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent21.putExtra("imageFullScr", R.drawable.fri41118full);
                startActivity(fullScreenIntent21);
                break;
            case R.id.imageFri41119:
                Intent fullScreenIntent22 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent22.putExtra("imageFullScr", R.drawable.fri41119full);
                startActivity(fullScreenIntent22);
                break;
            case R.id.imageFri41120:
                Intent fullScreenIntent23 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent23.putExtra("imageFullScr", R.drawable.fri41120full);
                startActivity(fullScreenIntent23);
                break;
            case R.id.imageFri41121:
                Intent fullScreenIntent24 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent24.putExtra("imageFullScr", R.drawable.fri41121full);
                startActivity(fullScreenIntent24);
                break;
            case R.id.imageFri41122:
                Intent fullScreenIntent25 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent25.putExtra("imageFullScr", R.drawable.fri41122full);
                startActivity(fullScreenIntent25);
                break;
            case R.id.imageFri41135:
                Intent fullScreenIntent26 = new Intent(Friends.this, FullscreenActivity.class);
                fullScreenIntent26.putExtra("imageFullScr", R.drawable.fri41135full);
                startActivity(fullScreenIntent26);
                break;


        }

    }
    }
