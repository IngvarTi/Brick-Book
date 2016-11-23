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

public class Creator extends AppCompatActivity implements View.OnClickListener {

    String[] two = {"1/2", "2/2"};
    String[] three = {"1/3", "2/3", "3/3"};

    String strCre31027 = new String();
    String strCre31028 = new String();
    String strCre31029 = new String();
    String strCre31031 = new String();
    String strCre31032 = new String();
    String strCre31033 = new String();
    String strCre31034 = new String();
    String strCre31035 = new String();
    String strCre31036 = new String();
    String strCre31037 = new String();
    String strCre31038 = new String();
    String strCre31039 = new String();
    String strCre31040 = new String();
    String strCre31041 = new String();
    String strCre31042 = new String();
    String strCre31043 = new String();
    String strCre31044 = new String();
    String strCre31045 = new String();
    String strCre31046 = new String();
    String strCre31047 = new String();
    String strCre31048 = new String();
    String strCre31050 = new String();

    PDFTools pdfe = new PDFTools();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator);
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

        Appodeal.setBannerViewId(R.id.appodealBannerViewCreator);
        String appKey = "fa7b74c8278d1e0f3ec32d243a7e151466b88968bfc3fe2f";
        Appodeal.initialize(this, appKey, Appodeal.BANNER);
//        Appodeal.setTesting(true);



        Appodeal.show(this, Appodeal.BANNER_VIEW);


        final ImageView imageCre31027 = (ImageView) findViewById(R.id.imageCre31027);
        imageCre31027.setOnClickListener(this);
        final ImageView imageCre31028 = (ImageView) findViewById(R.id.imageCre31028);
        imageCre31028.setOnClickListener(this);
        final ImageView imageCre31029 = (ImageView) findViewById(R.id.imageCre31029);
        imageCre31029.setOnClickListener(this);
        final ImageView imageCre31031 = (ImageView) findViewById(R.id.imageCre31031);
        imageCre31031.setOnClickListener(this);
        final ImageView imageCre31032 = (ImageView) findViewById(R.id.imageCre31032);
        imageCre31032.setOnClickListener(this);
        final ImageView imageCre31033 = (ImageView) findViewById(R.id.imageCre31033);
        imageCre31033.setOnClickListener(this);
        final ImageView imageCre31034 = (ImageView) findViewById(R.id.imageCre31034);
        imageCre31034.setOnClickListener(this);
        final ImageView imageCre31035 = (ImageView) findViewById(R.id.imageCre31035);
        imageCre31035.setOnClickListener(this);
        final ImageView imageCre31036 = (ImageView) findViewById(R.id.imageCre31036);
        imageCre31036.setOnClickListener(this);
        final ImageView imageCre31037 = (ImageView) findViewById(R.id.imageCre31037);
        imageCre31037.setOnClickListener(this);
        final ImageView imageCre31038 = (ImageView) findViewById(R.id.imageCre31038);
        imageCre31038.setOnClickListener(this);
        final ImageView imageCre31039 = (ImageView) findViewById(R.id.imageCre31039);
        imageCre31039.setOnClickListener(this);
        final ImageView imageCre31040 = (ImageView) findViewById(R.id.imageCre31040);
        imageCre31040.setOnClickListener(this);
        final ImageView imageCre31041 = (ImageView) findViewById(R.id.imageCre31041);
        imageCre31041.setOnClickListener(this);
        final ImageView imageCre31042 = (ImageView) findViewById(R.id.imageCre31042);
        imageCre31042.setOnClickListener(this);
        final ImageView imageCre31043 = (ImageView) findViewById(R.id.imageCre31043);
        imageCre31043.setOnClickListener(this);
        final ImageView imageCre31044 = (ImageView) findViewById(R.id.imageCre31044);
        imageCre31044.setOnClickListener(this);
        final ImageView imageCre31045 = (ImageView) findViewById(R.id.imageCre31045);
        imageCre31045.setOnClickListener(this);
        final ImageView imageCre31046 = (ImageView) findViewById(R.id.imageCre31046);
        imageCre31046.setOnClickListener(this);
        final ImageView imageCre31047 = (ImageView) findViewById(R.id.imageCre31047);
        imageCre31047.setOnClickListener(this);
        final ImageView imageCre31048 = (ImageView) findViewById(R.id.imageCre31048);
        imageCre31048.setOnClickListener(this);
        final ImageView imageCre31050 = (ImageView) findViewById(R.id.imageCre31050);
        imageCre31050.setOnClickListener(this);

        final CircularProgressButton bCre31027 = (CircularProgressButton) findViewById(R.id.butCre31027);
        final CircularProgressButton dCre31027 = (CircularProgressButton) findViewById(R.id.dCre31027);
        strCre31027 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112287.pdf";
        setButtonStyle(bCre31027, dCre31027, strCre31027);

        final CircularProgressButton bCre31028 = (CircularProgressButton) findViewById(R.id.butCre31028);
        final CircularProgressButton dCre31028 = (CircularProgressButton) findViewById(R.id.dCre31028);
        strCre31028 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112315.pdf";
        setButtonStyle(bCre31028, dCre31028, strCre31028);

        final CircularProgressButton bCre31029 = (CircularProgressButton)this.findViewById(R.id.butCre31029);
        final CircularProgressButton dCre31029 = (CircularProgressButton)this.findViewById(R.id.dCre31029);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, three);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sCre31029 = (Spinner) findViewById(R.id.spinnerCre31029);
        sCre31029.setAdapter(adapter3);
        sCre31029.setSelection(0);
        sCre31029.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31029.getSelectedItemPosition()) {
                    case (0):
                        strCre31029 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112297.pdf";
                        setButtonStyle(bCre31029, dCre31029, strCre31029);
                        break;
                    case (1):
                        strCre31029 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112302.pdf";
                        setButtonStyle(bCre31029, dCre31029, strCre31029);
                        break;
                    case (2):
                        strCre31029 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112303.pdf";
                        setButtonStyle(bCre31029, dCre31029, strCre31029);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31031 = (CircularProgressButton)this.findViewById(R.id.butCre31031);
        final CircularProgressButton dCre31031 = (CircularProgressButton)this.findViewById(R.id.dCre31031);
        final Spinner sCre31031 = (Spinner) findViewById(R.id.spinnerCre31031);
        sCre31031.setAdapter(adapter3);
        sCre31031.setSelection(0);
        sCre31031.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31031.getSelectedItemPosition()) {
                    case (0):
                        strCre31031 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129369.pdf";
                        setButtonStyle(bCre31031, dCre31031, strCre31031);
                        break;
                    case (1):
                        strCre31031 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112365.pdf";
                        setButtonStyle(bCre31031, dCre31031, strCre31031);
                        break;
                    case (2):
                        strCre31031 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112368.pdf";
                        setButtonStyle(bCre31031, dCre31031, strCre31031);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31032 = (CircularProgressButton)this.findViewById(R.id.butCre31032);
        final CircularProgressButton dCre31032 = (CircularProgressButton)this.findViewById(R.id.dCre31032);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner sCre31032 = (Spinner) findViewById(R.id.spinnerCre31032);
        sCre31032.setAdapter(adapter2);
        sCre31032.setSelection(0);
        sCre31032.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31032.getSelectedItemPosition()) {
                    case (0):
                        strCre31032 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112376.pdf";
                        setButtonStyle(bCre31032, dCre31032, strCre31032);
                        break;
                    case (1):
                        strCre31032 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112386.pdf";
                        setButtonStyle(bCre31032, dCre31032, strCre31032);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31033 = (CircularProgressButton)this.findViewById(R.id.butCre31033);
        final CircularProgressButton dCre31033 = (CircularProgressButton)this.findViewById(R.id.dCre31033);
        final Spinner sCre31033 = (Spinner) findViewById(R.id.spinnerCre31033);
        sCre31033.setAdapter(adapter3);
        sCre31033.setSelection(0);
        sCre31033.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31033.getSelectedItemPosition()) {
                    case (0):
                        strCre31033 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112389.pdf";
                        setButtonStyle(bCre31033, dCre31033, strCre31033);
                        break;
                    case (1):
                        strCre31033 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112392.pdf";
                        setButtonStyle(bCre31033, dCre31033, strCre31033);
                        break;
                    case (2):
                        strCre31033 = "http://cache.lego.com/bigdownloads/buildinginstructions/6138989.pdf";
                        setButtonStyle(bCre31033, dCre31033, strCre31033);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31034 = (CircularProgressButton)this.findViewById(R.id.butCre31034);
        final CircularProgressButton dCre31034 = (CircularProgressButton)this.findViewById(R.id.dCre31034);
        final Spinner sCre31034 = (Spinner) findViewById(R.id.spinnerCre31034);
        sCre31034.setAdapter(adapter3);
        sCre31034.setSelection(0);
        sCre31034.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31034.getSelectedItemPosition()) {
                    case (0):
                        strCre31034 = "http://cache.lego.com/bigdownloads/buildinginstructions/6120315.pdf";
                        setButtonStyle(bCre31034, dCre31034, strCre31034);
                        break;
                    case (1):
                        strCre31034 = "http://cache.lego.com/bigdownloads/buildinginstructions/6115568.pdf";
                        setButtonStyle(bCre31034, dCre31034, strCre31034);
                        break;
                    case (2):
                        strCre31034 = "http://cache.lego.com/bigdownloads/buildinginstructions/6115575.pdf";
                        setButtonStyle(bCre31034, dCre31034, strCre31034);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31035 = (CircularProgressButton)this.findViewById(R.id.butCre31035);
        final CircularProgressButton dCre31035 = (CircularProgressButton)this.findViewById(R.id.dCre31035);
        final Spinner sCre31035 = (Spinner) findViewById(R.id.spinnerCre31035);
        sCre31035.setAdapter(adapter3);
        sCre31035.setSelection(0);
        sCre31035.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31035.getSelectedItemPosition()) {
                    case (0):
                        strCre31035 = "http://cache.lego.com/bigdownloads/buildinginstructions/6120322.pdf";
                        setButtonStyle(bCre31035, dCre31035, strCre31035);
                        break;
                    case (1):
                        strCre31035 = "http://cache.lego.com/bigdownloads/buildinginstructions/6120324.pdf";
                        setButtonStyle(bCre31035, dCre31035, strCre31035);
                        break;
                    case (2):
                        strCre31035 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114533.pdf";
                        setButtonStyle(bCre31035, dCre31035, strCre31035);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31036 = (CircularProgressButton)this.findViewById(R.id.butCre31036);
        final CircularProgressButton dCre31036 = (CircularProgressButton)this.findViewById(R.id.dCre31036);
        final Spinner sCre31036 = (Spinner) findViewById(R.id.spinnerCre31036);
        sCre31036.setAdapter(adapter3);
        sCre31036.setSelection(0);
        sCre31036.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31036.getSelectedItemPosition()) {
                    case (0):
                        strCre31036 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114190.pdf";
                        setButtonStyle(bCre31036, dCre31036, strCre31036);
                        break;
                    case (1):
                        strCre31036 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129370.pdf";
                        setButtonStyle(bCre31036, dCre31036, strCre31036);
                        break;
                    case (2):
                        strCre31036 = "http://cache.lego.com/bigdownloads/buildinginstructions/6120330.pdf";
                        setButtonStyle(bCre31036, dCre31036, strCre31036);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31037 = (CircularProgressButton)this.findViewById(R.id.butCre31037);
        final CircularProgressButton dCre31037 = (CircularProgressButton)this.findViewById(R.id.dCre31037);
        final Spinner sCre31037 = (Spinner) findViewById(R.id.spinnerCre31037);
        sCre31037.setAdapter(adapter3);
        sCre31037.setSelection(0);
        sCre31037.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31037.getSelectedItemPosition()) {
                    case (0):
                        strCre31037 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129801.pdf";
                        setButtonStyle(bCre31037, dCre31037, strCre31037);
                        break;
                    case (1):
                        strCre31037 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129803.pdf";
                        setButtonStyle(bCre31037, dCre31037, strCre31037);
                        break;
                    case (2):
                        strCre31037 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129805.pdf";
                        setButtonStyle(bCre31037, dCre31037, strCre31037);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31038 = (CircularProgressButton)this.findViewById(R.id.butCre31038);
        final CircularProgressButton dCre31038 = (CircularProgressButton)this.findViewById(R.id.dCre31038);
        final Spinner sCre31038 = (Spinner) findViewById(R.id.spinnerCre31038);
        sCre31038.setAdapter(adapter3);
        sCre31038.setSelection(0);
        sCre31038.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31038.getSelectedItemPosition()) {
                    case (0):
                        strCre31038 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127608.pdf";
                        setButtonStyle(bCre31038, dCre31038, strCre31038);
                        break;
                    case (1):
                        strCre31038 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127612.pdf";
                        setButtonStyle(bCre31038, dCre31038, strCre31038);
                        break;
                    case (2):
                        strCre31038 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127614.pdf";
                        setButtonStyle(bCre31038, dCre31038, strCre31038);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31039 = (CircularProgressButton)this.findViewById(R.id.butCre31039);
        final CircularProgressButton dCre31039 = (CircularProgressButton)this.findViewById(R.id.dCre31039);
        strCre31039 = "http://cache.lego.com/bigdownloads/buildinginstructions/6127618.pdf";
        setButtonStyle(bCre31039, dCre31039, strCre31039);

        final CircularProgressButton bCre31040 = (CircularProgressButton)this.findViewById(R.id.butCre31040);
        final CircularProgressButton dCre31040 = (CircularProgressButton)this.findViewById(R.id.dCre31040);
        strCre31040 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145903.pdf";
        setButtonStyle(bCre31040, dCre31040, strCre31040);

        final CircularProgressButton bCre31041 = (CircularProgressButton)this.findViewById(R.id.butCre31041);
        final CircularProgressButton dCre31041 = (CircularProgressButton)this.findViewById(R.id.dCre31041);
        strCre31041 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145941.pdf";
        setButtonStyle(bCre31041, dCre31041, strCre31041);

        final CircularProgressButton bCre31042 = (CircularProgressButton)this.findViewById(R.id.butCre31042);
        final CircularProgressButton dCre31042 = (CircularProgressButton)this.findViewById(R.id.dCre31042);
        final Spinner sCre31042 = (Spinner) findViewById(R.id.spinnerCre31042);
        sCre31042.setAdapter(adapter3);
        sCre31042.setSelection(0);
        sCre31042.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31042.getSelectedItemPosition()) {
                    case (0):
                        strCre31042 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145950.pdf";
                        setButtonStyle(bCre31042, dCre31042, strCre31042);
                        break;
                    case (1):
                        strCre31042 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145952.pdf";
                        setButtonStyle(bCre31042, dCre31042, strCre31042);
                        break;
                    case (2):
                        strCre31042 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145954.pdf";
                        setButtonStyle(bCre31042, dCre31042, strCre31042);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31043 = (CircularProgressButton)this.findViewById(R.id.butCre31043);
        final CircularProgressButton dCre31043 = (CircularProgressButton)this.findViewById(R.id.dCre31043);
        final Spinner sCre31043 = (Spinner) findViewById(R.id.spinnerCre31043);
        sCre31043.setAdapter(adapter3);
        sCre31043.setSelection(0);
        sCre31043.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31043.getSelectedItemPosition()) {
                    case (0):
                        strCre31043 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145962.pdf";
                        setButtonStyle(bCre31043, dCre31043, strCre31043);
                        break;
                    case (1):
                        strCre31043 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145964.pdf";
                        setButtonStyle(bCre31043, dCre31043, strCre31043);
                        break;
                    case (2):
                        strCre31043 = "http://cache.lego.com/bigdownloads/buildinginstructions/6145966.pdf";
                        setButtonStyle(bCre31043, dCre31043, strCre31043);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31044 = (CircularProgressButton)this.findViewById(R.id.butCre31044);
        final CircularProgressButton dCre31044 = (CircularProgressButton)this.findViewById(R.id.dCre31044);
        final Spinner sCre31044 = (Spinner) findViewById(R.id.spinnerCre31044);
        sCre31044.setAdapter(adapter3);
        sCre31044.setSelection(0);
        sCre31044.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31044.getSelectedItemPosition()) {
                    case (0):
                        strCre31044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146013.pdf";
                        setButtonStyle(bCre31044, dCre31044, strCre31044);
                        break;
                    case (1):
                        strCre31044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146016.pdf";
                        setButtonStyle(bCre31044, dCre31044, strCre31044);
                        break;
                    case (2):
                        strCre31044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146019.pdf";
                        setButtonStyle(bCre31044, dCre31044, strCre31044);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31045 = (CircularProgressButton)this.findViewById(R.id.butCre31045);
        final CircularProgressButton dCre31045 = (CircularProgressButton)this.findViewById(R.id.dCre31045);
        final Spinner sCre31045 = (Spinner) findViewById(R.id.spinnerCre31045);
        sCre31045.setAdapter(adapter3);
        sCre31045.setSelection(0);
        sCre31045.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31045.getSelectedItemPosition()) {
                    case (0):
                        strCre31045 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146022.pdf";
                        setButtonStyle(bCre31045, dCre31045, strCre31045);
                        break;
                    case (1):
                        strCre31045 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146024.pdf";
                        setButtonStyle(bCre31045, dCre31045, strCre31045);
                        break;
                    case (2):
                        strCre31045 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146026.pdf";
                        setButtonStyle(bCre31045, dCre31045, strCre31045);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31046 = (CircularProgressButton)this.findViewById(R.id.butCre31046);
        final CircularProgressButton dCre31046 = (CircularProgressButton)this.findViewById(R.id.dCre31046);
        final Spinner sCre31046 = (Spinner) findViewById(R.id.spinnerCre31046);
        sCre31046.setAdapter(adapter3);
        sCre31046.setSelection(0);
        sCre31046.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31046.getSelectedItemPosition()) {
                    case (0):
                        strCre31046 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146033.pdf";
                        setButtonStyle(bCre31046, dCre31046, strCre31046);
                        break;
                    case (1):
                        strCre31046 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146046.pdf";
                        setButtonStyle(bCre31046, dCre31046, strCre31046);
                        break;
                    case (2):
                        strCre31046 = "http://cache.lego.com/bigdownloads/buildinginstructions/6146050.pdf";
                        setButtonStyle(bCre31046, dCre31046, strCre31046);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31047 = (CircularProgressButton)this.findViewById(R.id.butCre31047);
        final CircularProgressButton dCre31047 = (CircularProgressButton)this.findViewById(R.id.dCre31047);
        final Spinner sCre31047 = (Spinner) findViewById(R.id.spinnerCre31047);
        sCre31047.setAdapter(adapter3);
        sCre31047.setSelection(0);
        sCre31047.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31047.getSelectedItemPosition()) {
                    case (0):
                        strCre31047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6151721.pdf";
                        setButtonStyle(bCre31047, dCre31047, strCre31047);
                        break;
                    case (1):
                        strCre31047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6151716.pdf";
                        setButtonStyle(bCre31047, dCre31047, strCre31047);
                        break;
                    case (2):
                        strCre31047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6151714.pdf";
                        setButtonStyle(bCre31047, dCre31047, strCre31047);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31048 = (CircularProgressButton)this.findViewById(R.id.butCre31048);
        final CircularProgressButton dCre31048 = (CircularProgressButton)this.findViewById(R.id.dCre31048);
        final Spinner sCre31048 = (Spinner) findViewById(R.id.spinnerCre31048);
        sCre31048.setAdapter(adapter3);
        sCre31048.setSelection(0);
        sCre31048.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31048.getSelectedItemPosition()) {
                    case (0):
                        strCre31048 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150544.pdf";
                        setButtonStyle(bCre31048, dCre31048, strCre31048);
                        break;
                    case (1):
                        strCre31048 = "http://cache.lego.com/bigdownloads/buildinginstructions/6154162.pdf";
                        setButtonStyle(bCre31048, dCre31048, strCre31048);
                        break;
                    case (2):
                        strCre31048 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150550.pdf";
                        setButtonStyle(bCre31048, dCre31048, strCre31048);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final CircularProgressButton bCre31050 = (CircularProgressButton)this.findViewById(R.id.butCre31050);
        final CircularProgressButton dCre31050 = (CircularProgressButton)this.findViewById(R.id.dCre31050);
        final Spinner sCre31050 = (Spinner) findViewById(R.id.spinnerCre31050);
        sCre31050.setAdapter(adapter3);
        sCre31050.setSelection(0);
        sCre31050.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (sCre31050.getSelectedItemPosition()) {
                    case (0):
                        strCre31050 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150555.pdf";
                        setButtonStyle(bCre31050, dCre31050, strCre31050);
                        break;
                    case (1):
                        strCre31050 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150557.pdf";
                        setButtonStyle(bCre31050, dCre31050, strCre31050);
                        break;
                    case (2):
                        strCre31050 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150560.pdf";
                        setButtonStyle(bCre31050, dCre31050, strCre31050);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });





        bCre31027.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31027, bCre31027, dCre31027);
            }
        });
        dCre31027.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31027, bCre31027, dCre31027);
            }
        });

        bCre31028.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31028, bCre31028, dCre31028);
            }
        });
        dCre31028.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31028, bCre31028, dCre31028);
            }
        });

        bCre31029.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31029, bCre31029, dCre31029);
            }
        });
        dCre31029.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31029, bCre31029, dCre31029);
            }
        });

        bCre31031.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31031, bCre31031, dCre31031);
            }
        });
        dCre31031.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31031, bCre31031, dCre31031);
            }
        });

        bCre31032.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31032, bCre31032, dCre31032);
            }
        });
        dCre31032.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31032, bCre31032, dCre31032);
            }
        });

        bCre31033.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31033, bCre31033, dCre31033);
            }
        });
        dCre31033.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31033, bCre31033, dCre31033);
            }
        });

        bCre31034.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31034, bCre31034, dCre31034);
            }
        });
        dCre31034.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31034, bCre31034, dCre31034);
            }
        });

        bCre31035.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31035, bCre31035, dCre31035);
            }
        });
        dCre31035.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31035, bCre31035, dCre31035);
            }
        });

        bCre31036.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31036, bCre31036, dCre31036);
            }
        });
        dCre31036.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31036, bCre31036, dCre31036);
            }
        });

        bCre31037.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31037, bCre31037, dCre31037);
            }
        });
        dCre31037.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31037, bCre31037, dCre31037);
            }
        });

        bCre31038.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31038, bCre31038, dCre31038);
            }
        });
        dCre31038.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31038, bCre31038, dCre31038);
            }
        });

        bCre31039.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31039, bCre31039, dCre31039);
            }
        });
        dCre31039.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31039, bCre31039, dCre31039);
            }
        });

        bCre31040.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31040, bCre31040, dCre31040);
            }
        });
        dCre31040.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31040, bCre31040, dCre31040);
            }
        });

        bCre31041.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31041, bCre31041, dCre31041);
            }
        });
        dCre31041.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31041, bCre31041, dCre31041);
            }
        });

        bCre31042.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31042, bCre31042, dCre31042);
            }
        });
        dCre31042.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31042, bCre31042, dCre31042);
            }
        });

        bCre31043.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31043, bCre31043, dCre31043);
            }
        });
        dCre31043.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31043, bCre31043, dCre31043);
            }
        });

        bCre31044.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31044, bCre31044, dCre31044);
            }
        });
        dCre31044.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31044, bCre31044, dCre31044);
            }
        });

        bCre31045.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31045, bCre31045, dCre31045);
            }
        });
        dCre31045.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31045, bCre31045, dCre31045);
            }
        });

        bCre31046.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31046, bCre31046, dCre31046);
            }
        });
        dCre31046.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31046, bCre31046, dCre31046);
            }
        });

        bCre31047.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31047, bCre31047, dCre31047);
            }
        });
        dCre31047.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31047, bCre31047, dCre31047);
            }
        });

        bCre31048.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31048, bCre31048, dCre31048);
            }
        });
        dCre31048.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31048, bCre31048, dCre31048);
            }
        });

        bCre31050.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Creator.this, strCre31050, bCre31050, dCre31050);
            }
        });
        dCre31050.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Creator.this, strCre31050, bCre31050, dCre31050);
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
        if (!pdfe.isPDFSupported(Creator.this)) {
            buttonOpen.setProgress(100);
            buttonOpen.setText(R.string.open);
            buttonDelete.setVisibility(View.GONE);
        } else if (pdfe.downloadInspection(Creator.this, jonal)){
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
            case R.id.imageCre31027:
                Intent fullScreenIntent = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent.putExtra("imageFullScr", R.drawable.cre31027full);
                startActivity(fullScreenIntent);
                break;
            case R.id.imageCre31028:
                Intent fullScreenIntent1 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent1.putExtra("imageFullScr", R.drawable.cre31028full);
                startActivity(fullScreenIntent1);
                break;
            case R.id.imageCre31029:
                Intent fullScreenIntent2 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent2.putExtra("imageFullScr", R.drawable.cre31029full);
                startActivity(fullScreenIntent2);
                break;
            case R.id.imageCre31031:
                Intent fullScreenIntent3 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent3.putExtra("imageFullScr", R.drawable.cre31031full);
                startActivity(fullScreenIntent3);
                break;
            case R.id.imageCre31032:
                Intent fullScreenIntent4 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent4.putExtra("imageFullScr", R.drawable.cre31032full);
                startActivity(fullScreenIntent4);
                break;
            case R.id.imageCre31033:
                Intent fullScreenIntent5 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent5.putExtra("imageFullScr", R.drawable.cre31033full);
                startActivity(fullScreenIntent5);
                break;
            case R.id.imageCre31034:
                Intent fullScreenIntent6 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent6.putExtra("imageFullScr", R.drawable.cre31034full);
                startActivity(fullScreenIntent6);
                break;
            case R.id.imageCre31035:
                Intent fullScreenIntent7 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent7.putExtra("imageFullScr", R.drawable.cre31035full);
                startActivity(fullScreenIntent7);
                break;
            case R.id.imageCre31036:
                Intent fullScreenIntent8 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent8.putExtra("imageFullScr", R.drawable.cre31036full);
                startActivity(fullScreenIntent8);
                break;
            case R.id.imageCre31037:
                Intent fullScreenIntent9 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent9.putExtra("imageFullScr", R.drawable.cre31037full);
                startActivity(fullScreenIntent9);
                break;
            case R.id.imageCre31038:
                Intent fullScreenIntent10 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent10.putExtra("imageFullScr", R.drawable.cre31038full);
                startActivity(fullScreenIntent10);
                break;
            case R.id.imageCre31039:
                Intent fullScreenIntent11 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent11.putExtra("imageFullScr", R.drawable.cre31039full);
                startActivity(fullScreenIntent11);
                break;
            case R.id.imageCre31040:
                Intent fullScreenIntent12 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent12.putExtra("imageFullScr", R.drawable.cre31040full);
                startActivity(fullScreenIntent12);
                break;
            case R.id.imageCre31041:
                Intent fullScreenIntent13 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent13.putExtra("imageFullScr", R.drawable.cre31041full);
                startActivity(fullScreenIntent13);
                break;
            case R.id.imageCre31042:
                Intent fullScreenIntent14 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent14.putExtra("imageFullScr", R.drawable.cre31042full);
                startActivity(fullScreenIntent14);
                break;
            case R.id.imageCre31043:
                Intent fullScreenIntent15 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent15.putExtra("imageFullScr", R.drawable.cre31043full);
                startActivity(fullScreenIntent15);
                break;
            case R.id.imageCre31044:
                Intent fullScreenIntent16 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent16.putExtra("imageFullScr", R.drawable.cre31044full);
                startActivity(fullScreenIntent16);
                break;
            case R.id.imageCre31045:
                Intent fullScreenIntent17 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent17.putExtra("imageFullScr", R.drawable.cre31045full);
                startActivity(fullScreenIntent17);
                break;
            case R.id.imageCre31046:
                Intent fullScreenIntent18 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent18.putExtra("imageFullScr", R.drawable.cre31046full);
                startActivity(fullScreenIntent18);
                break;
            case R.id.imageCre31047:
                Intent fullScreenIntent19 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent19.putExtra("imageFullScr", R.drawable.cre31047full);
                startActivity(fullScreenIntent19);
                break;
            case R.id.imageCre31048:
                Intent fullScreenIntent20 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent20.putExtra("imageFullScr", R.drawable.cre31048full);
                startActivity(fullScreenIntent20);
                break;
            case R.id.imageCre31050:
                Intent fullScreenIntent21 = new Intent(Creator.this, FullscreenActivity.class);
                fullScreenIntent21.putExtra("imageFullScr", R.drawable.cre31050full);
                startActivity(fullScreenIntent21);
                break;

        }
        }
    }
