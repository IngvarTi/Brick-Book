package com.tibro.brickcatalog;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.appodeal.ads.Appodeal;
import com.dd.CircularProgressButton;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class Technic extends AppCompatActivity implements View.OnClickListener {

    private Tracker mTracker;


    String[] two = {"1/2", "2/2"};
    String[] three = {"1/3", "2/3", "3/3"};
    String[] four = {"1/4", "2/4", "3/4", "4/4"};

    String strA8065 = new String();
    String strB8065 = new String();
    String strA42030 = new String();
    String strB42030 = new String();
    String strA42031 = new String();
    String strB42031 = new String();
    String strA42032 = new String();
    String strB42032 = new String();
    String str42033 = new String();
    String str42034 = new String();
    String str42033plus42034 = new String();
    String strA42035 = new String();
    String strB42035 = new String();
    String strA42036 = new String();
    String strB42036 = new String();
    String strA42037 = new String();
    String strB42037 = new String();
    String strA42038 = new String();
    String strB42038 = new String();
    String strA42039 = new String();
    String strB42039 = new String();
    String strA42040 = new String();
    String strB42040 = new String();
    String strA42042 = new String();
    String strB42042 = new String();
    String strA42043 = new String();
    String strB42043 = new String();
    String strA42044 = new String();
    String strB42044 = new String();
    String strA42045 = new String();
    String strB42045 = new String();
    String strA42046 = new String();
    String strA42047 = new String();
    String strA42046plus42047 = new String();
    String strA42048 = new String();
    String strB42048 = new String();
    String strA42049 = new String();
    String strB42049 = new String();
    String strA42050 = new String();
    String strB42050 = new String();
    String strA42052 = new String();
    String strB42052 = new String();

    PDFTools pdfe = new PDFTools();


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_technic);
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
//                Appodeal.setTesting(true);



                Appodeal.show(this, Appodeal.BANNER_BOTTOM);

                // [START shared_tracker]
                // Obtain the shared Tracker instance.
                AnalyticsApplication application = (AnalyticsApplication) getApplication();
                mTracker = application.getDefaultTracker();
                // [END shared_tracker]

                // [START screen_view_hit]
//        Log.i(TAG, "Setting screen name: ");
                mTracker.setScreenName("Technic");
                mTracker.send(new HitBuilders.ScreenViewBuilder().build());
                // [END screen_view_hit]

        final ImageView imageA8065 = (ImageView) findViewById(R.id.imageA8065);
                imageA8065.setOnClickListener(this);

        final ImageView imageB8065 = (ImageView) findViewById(R.id.imageB8065);
                imageB8065.setOnClickListener(this);
        final ImageView imageA42032 = (ImageView) findViewById(R.id.imageA42032);
                imageA42032.setOnClickListener(this);
        final ImageView imageB42032 = (ImageView) findViewById(R.id.imageB42032);
                imageB42032.setOnClickListener(this);
        final ImageView imageA42044 = (ImageView) findViewById(R.id.imageA42044);
                imageA42044.setOnClickListener(this);
        final ImageView imageB42044 = (ImageView) findViewById(R.id.imageB42044);
                imageB42044.setOnClickListener(this);
        final ImageView imageA42045 = (ImageView) findViewById(R.id.imageA42045);
                imageA42045.setOnClickListener(this);
        final ImageView imageB42045 = (ImageView) findViewById(R.id.imageB42045);
                imageB42045.setOnClickListener(this);
        final ImageView imageA42046 = (ImageView) findViewById(R.id.imageA42046);
                imageA42046.setOnClickListener(this);
        final ImageView imageA42047 = (ImageView) findViewById(R.id.imageA42047);
                imageA42047.setOnClickListener(this);
        final ImageView imageA42046plus42047 = (ImageView) findViewById(R.id.imageA42046plus42047);
                imageA42046plus42047.setOnClickListener(this);
        final ImageView imageA42048 = (ImageView) findViewById(R.id.imageA42048);
                imageA42048.setOnClickListener(this);
        final ImageView imageB42048 = (ImageView) findViewById(R.id.imageB42048);
                imageB42048.setOnClickListener(this);
        final ImageView imageA42049 = (ImageView) findViewById(R.id.imageA42049);
                imageA42049.setOnClickListener(this);
        final ImageView imageB42049 = (ImageView) findViewById(R.id.imageB42049);
                imageB42049.setOnClickListener(this);
        final ImageView imageA42050 = (ImageView) findViewById(R.id.imageA42050);
                imageA42050.setOnClickListener(this);
        final ImageView imageB42050 = (ImageView) findViewById(R.id.imageB42050);
                imageB42050.setOnClickListener(this);
        final ImageView imageA42052 = (ImageView) findViewById(R.id.imageA42052);
                imageA42052.setOnClickListener(this);
        final ImageView imageB42052 = (ImageView) findViewById(R.id.imageB42052);
                imageB42052.setOnClickListener(this);
        final ImageView imageA42030 = (ImageView) findViewById(R.id.imagetecA42030);
                imageA42030.setOnClickListener(this);
                final ImageView imageB42030 = (ImageView) findViewById(R.id.imagetecB42030);
                imageB42030.setOnClickListener(this);
                final ImageView imageA42031 = (ImageView) findViewById(R.id.imagetecA42031);
                imageA42031.setOnClickListener(this);
                final ImageView imageB42031 = (ImageView) findViewById(R.id.imagetecB42031);
                imageB42031.setOnClickListener(this);
                final ImageView image42033 = (ImageView) findViewById(R.id.image42033);
                image42033.setOnClickListener(this);
                final ImageView image42034 = (ImageView) findViewById(R.id.image42034);
                image42034.setOnClickListener(this);
                final ImageView image42033plus42034 = (ImageView) findViewById(R.id.image42033plus42034);
                image42033plus42034.setOnClickListener(this);
                final ImageView imageA42035 = (ImageView) findViewById(R.id.imagetecA42035);
                imageA42035.setOnClickListener(this);
                final ImageView imageB42035 = (ImageView) findViewById(R.id.imagetecB42035);
                imageB42035.setOnClickListener(this);
                final ImageView imageA42036 = (ImageView) findViewById(R.id.imagetecA42036);
                imageA42036.setOnClickListener(this);
                final ImageView imageB42036 = (ImageView) findViewById(R.id.imagetecB42036);
                imageB42036.setOnClickListener(this);
                final ImageView imageA42037 = (ImageView) findViewById(R.id.imagetecA42037);
                imageA42037.setOnClickListener(this);
                final ImageView imageB42037 = (ImageView) findViewById(R.id.imagetecB42037);
                imageB42037.setOnClickListener(this);
                final ImageView imageA42038 = (ImageView) findViewById(R.id.imagetecA42038);
                imageA42038.setOnClickListener(this);
                final ImageView imageB42038 = (ImageView) findViewById(R.id.imagetecB42038);
                imageB42038.setOnClickListener(this);
                final ImageView imageA42039 = (ImageView) findViewById(R.id.imagetecA42039);
                imageA42039.setOnClickListener(this);
                final ImageView imageB42039 = (ImageView) findViewById(R.id.imagetecB42039);
                imageB42039.setOnClickListener(this);
                final ImageView imageA42040 = (ImageView) findViewById(R.id.imagetecA42040);
                imageA42040.setOnClickListener(this);
                final ImageView imageB42040 = (ImageView) findViewById(R.id.imagetecB42040);
                imageB42040.setOnClickListener(this);
                final ImageView imageA42042 = (ImageView) findViewById(R.id.imagetecA42042);
                imageA42042.setOnClickListener(this);
                final ImageView imageB42042 = (ImageView) findViewById(R.id.imagetecB42042);
                imageB42042.setOnClickListener(this);
                final ImageView imageA42043 = (ImageView) findViewById(R.id.imagetecA42043);
                imageA42043.setOnClickListener(this);






                final CircularProgressButton bA8065 = (CircularProgressButton)this.findViewById(R.id.butA8065);

        final CircularProgressButton dA8065 = (CircularProgressButton)this.findViewById(R.id.dA8065);


                ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, two);
                adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner sA8065 = (Spinner) findViewById(R.id.spinnerA8065);
                sA8065.setAdapter(adapter2);
                sA8065.setSelection(0);
                // устанавливаем обработчик нажатия
                sA8065.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int position, long id) {
                        // показываем позиция нажатого элемента
                        switch (sA8065.getSelectedItemPosition()) {
                            case (0):
                                strA8065 = "http://cache.lego.com/bigdownloads/buildinginstructions/4622745.pdf";
                                setButtonStyle(bA8065, dA8065, strA8065);
                                break;
                            case (1):
                                strA8065 = "http://cache.lego.com/bigdownloads/buildinginstructions/4622747.pdf";
                                setButtonStyle(bA8065, dA8065, strA8065);
                                break;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });

        final CircularProgressButton bB8065 = (CircularProgressButton) findViewById(R.id.butB8065);
        final CircularProgressButton dB8065 = (CircularProgressButton) findViewById(R.id.dB8065);
                strB8065 = "http://cache.lego.com/bigdownloads/buildinginstructions/4622748.pdf";
                    setButtonStyle(bB8065, dB8065, strB8065);

        final CircularProgressButton bA42032 = (CircularProgressButton) findViewById(R.id.butA42032);
        final CircularProgressButton dA42032 = (CircularProgressButton) findViewById(R.id.dA42032);
                strA42032 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112177.pdf";
                    setButtonStyle(bA42032, dA42032,strA42032);

        final CircularProgressButton bB42032 = (CircularProgressButton) findViewById(R.id.butB42032);
        final CircularProgressButton dB42032 = (CircularProgressButton) findViewById(R.id.dB42032);
                strB42032 = "http://cache.lego.com/bigdownloads/buildinginstructions/6106800.pdf";
                    setButtonStyle(bB42032, dB42032, strB42032);

        final CircularProgressButton bA42044 = (CircularProgressButton) findViewById(R.id.butA42044);
        final CircularProgressButton dA42044 = (CircularProgressButton) findViewById(R.id.dA42044);
                strA42044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143800.pdf";
                    setButtonStyle(bA42044, dA42044,strA42044);

        final CircularProgressButton bB42044 = (CircularProgressButton) findViewById(R.id.butB42044);
        final CircularProgressButton dB42044 = (CircularProgressButton) findViewById(R.id.dB42044);
                strB42044 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150241.pdf";
                    setButtonStyle(bB42044, dB42044, strB42044);

        final CircularProgressButton bA42045 = (CircularProgressButton) findViewById(R.id.butA42045);
        final CircularProgressButton dA42045 = (CircularProgressButton) findViewById(R.id.dA42045);
                strA42045 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143804.pdf";
                    setButtonStyle(bA42045, dA42045, strA42045);

        final CircularProgressButton bB42045 = (CircularProgressButton) findViewById(R.id.butB42045);
        final CircularProgressButton dB42045 = (CircularProgressButton) findViewById(R.id.dB42045);
                strB42045 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150245.pdf";
                    setButtonStyle(bB42045, dB42045, strB42045);

        final CircularProgressButton bA42046 = (CircularProgressButton) findViewById(R.id.butA42046);
        final CircularProgressButton dA42046 = (CircularProgressButton) findViewById(R.id.dA42046);
                strA42046 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143809.pdf";
                    setButtonStyle(bA42046, dA42046, strA42046);

        final CircularProgressButton bA42047 = (CircularProgressButton) findViewById(R.id.butA42047);
        final CircularProgressButton dA42047 = (CircularProgressButton) findViewById(R.id.dA42047);
                strA42047 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143810.pdf";
                    setButtonStyle(bA42047, dA42047, strA42047);

        final CircularProgressButton bA42046plus42047 = (CircularProgressButton) findViewById(R.id.butA42046plus42047);
        final CircularProgressButton dA42046plus42047 = (CircularProgressButton) findViewById(R.id.dA42046plus42047);
                strA42046plus42047 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/customer%20service/technic/42046-47_digital.pdf";
                    setButtonStyle(bA42046plus42047, dA42046plus42047, strA42046plus42047);

        final CircularProgressButton bA42048 = (CircularProgressButton) findViewById(R.id.butA42048);
        final CircularProgressButton dA42048 = (CircularProgressButton) findViewById(R.id.dA42048);
                strA42048 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150251.pdf";
                    setButtonStyle(bA42048, dA42048, strA42048);

        final CircularProgressButton bB42048 = (CircularProgressButton) findViewById(R.id.butB42048);
        final CircularProgressButton dB42048 = (CircularProgressButton) findViewById(R.id.dB42048);
                strB42048 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150253.pdf";
                    setButtonStyle(bB42048, dB42048, strB42048);

        final CircularProgressButton bA42049 = (CircularProgressButton) findViewById(R.id.butA42049);
        final CircularProgressButton dA42049 = (CircularProgressButton) findViewById(R.id.dA42049);


        final Spinner sA42049 = (Spinner) findViewById(R.id.spinnerA42049);
                sA42049.setAdapter(adapter2);
                sA42049.setSelection(0);
                // устанавливаем обработчик нажатия
                sA42049.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int position, long id) {
                        // показываем позиция нажатого элемента
                        switch (sA42049.getSelectedItemPosition()) {
                            case (0):
                                strA42049 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150410.pdf";
                                setButtonStyle(bA42049, dA42049, strA42049);
                                break;
                            case (1):
                                strA42049 = "http://cache.lego.com/bigdownloads/buildinginstructions/6150453.pdf";
                                setButtonStyle(bA42049, dA42049, strA42049);
                                break;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });


        final CircularProgressButton bB42049 = (CircularProgressButton) findViewById(R.id.butB42049);
        final CircularProgressButton dB42049 = (CircularProgressButton) findViewById(R.id.dB42049);
                strB42049 = "http://cache.lego.com/bigdownloads/buildinginstructions/6174988.pdf";
                    setButtonStyle(bB42049, dB42049, strB42049);

        final CircularProgressButton bA42050 = (CircularProgressButton) findViewById(R.id.butA42050);
        final CircularProgressButton dA42050 = (CircularProgressButton) findViewById(R.id.dA42050);
                strA42050 = "http://cache.lego.com/bigdownloads/buildinginstructions/6153718.pdf";
                    setButtonStyle(bA42050, dA42050, strA42050);

        final CircularProgressButton bB42050 = (CircularProgressButton) findViewById(R.id.butB42050);
        final CircularProgressButton dB42050 = (CircularProgressButton) findViewById(R.id.dB42050);
                strB42050 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/customer%20service/technic/42050_b_digital.pdf";
                    setButtonStyle(bB42050, dB42050, strB42050);

        final CircularProgressButton bA42052 = (CircularProgressButton) findViewById(R.id.butA42052);
        final CircularProgressButton dA42052 = (CircularProgressButton) findViewById(R.id.dA42052);
                strA42052 = "http://cache.lego.com/bigdownloads/buildinginstructions/6169948.pdf";
                    setButtonStyle(bA42052, dA42052, strA42052);

        final CircularProgressButton bB42052 = (CircularProgressButton) findViewById(R.id.butB42052);
        final CircularProgressButton dB42052 = (CircularProgressButton) findViewById(R.id.dB42052);
                strB42052 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/customer%20service/technic/42052_b_digital.pdf";
                    setButtonStyle(bB42052, dB42052, strB42052);

                final CircularProgressButton bA42030 = (CircularProgressButton) findViewById(R.id.btecA42030);
                final CircularProgressButton dA42030 = (CircularProgressButton) findViewById(R.id.dtecA42030);
                strA42030 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143537.pdf";
                setButtonStyle(bA42030, dA42030, strA42030);


                final CircularProgressButton bB42030 = (CircularProgressButton) findViewById(R.id.btecB42030);
                final CircularProgressButton dB42030 = (CircularProgressButton) findViewById(R.id.dtecB42030);

                ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, three);
                adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                final Spinner sB42030 = (Spinner) findViewById(R.id.spinnertecB42030);
                sB42030.setAdapter(adapter3);
                sB42030.setSelection(0);
                // устанавливаем обработчик нажатия
                sB42030.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int position, long id) {
                        // показываем позиция нажатого элемента
                        switch (sB42030.getSelectedItemPosition()) {
                            case (0):
                                strB42030 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/technic/products/2hy/bi/42030-b-page1-84.pdf";
                                setButtonStyle(bB42030, dB42030, strB42030);
                                break;
                            case (1):
                                strB42030 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/technic/products/2hy/bi/42030-b-page85-166.pdf";
                                setButtonStyle(bB42030, dB42030, strB42030);
                                break;
                            case (2):
                                strB42030 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/technic/products/2hy/bi/42030bpage167251final.pdf";
                                setButtonStyle(bB42030, dB42030, strB42030);
                                break;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });

                final CircularProgressButton bA42031 = (CircularProgressButton) findViewById(R.id.btecA42031);
                final CircularProgressButton dA42031 = (CircularProgressButton) findViewById(R.id.dtecA42031);
                strA42031 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112208.pdf";
                setButtonStyle(bA42031, dA42031, strA42031);

                final CircularProgressButton bB42031 = (CircularProgressButton) findViewById(R.id.btecB42031);
                final CircularProgressButton dB42031 = (CircularProgressButton) findViewById(R.id.dtecB42031);
                strB42031 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112233.pdf";
                setButtonStyle(bB42031, dB42031, strB42031);

                final CircularProgressButton b42033 = (CircularProgressButton) findViewById(R.id.but42033);
                final CircularProgressButton d42033 = (CircularProgressButton) findViewById(R.id.d42033);
                str42033 = "http://cache.lego.com/bigdownloads/buildinginstructions/6106801.pdf";
                setButtonStyle(b42033, d42033, str42033);

                final CircularProgressButton b42034 = (CircularProgressButton) findViewById(R.id.but42034);
                final CircularProgressButton d42034 = (CircularProgressButton) findViewById(R.id.d42034);
                str42034 = "http://cache.lego.com/bigdownloads/buildinginstructions/6124828.pdf";
                setButtonStyle(b42034, d42034, str42034);

                final CircularProgressButton b42033plus42034 = (CircularProgressButton) findViewById(R.id.but42033plus42034);
                final CircularProgressButton d42033plus42034 = (CircularProgressButton) findViewById(R.id.d42033plus42034);
                str42033plus42034 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/customer%20service/technic/42033_42034_digital.pdf";
                setButtonStyle(b42033plus42034, d42033plus42034, str42033plus42034);

                final CircularProgressButton bA42035 = (CircularProgressButton) findViewById(R.id.btecA42035);
                final CircularProgressButton dA42035 = (CircularProgressButton) findViewById(R.id.dtecA42035);
                strA42035 = "http://cache.lego.com/bigdownloads/buildinginstructions/6125480.pdf";
                setButtonStyle(bA42035, dA42035, strA42035);

                final CircularProgressButton bB42035 = (CircularProgressButton) findViewById(R.id.btecB42035);
                final CircularProgressButton dB42035 = (CircularProgressButton) findViewById(R.id.dtecB42035);
                strB42035 = "http://cache.lego.com/bigdownloads/buildinginstructions/6113937.pdf";
                setButtonStyle(bB42035, dB42035, strB42035);

                final CircularProgressButton bA42036 = (CircularProgressButton) findViewById(R.id.btecA42036);
                final CircularProgressButton dA42036 = (CircularProgressButton) findViewById(R.id.dtecA42036);
                strA42036 = "http://cache.lego.com/bigdownloads/buildinginstructions/6133085.pdf";
                setButtonStyle(bA42036, dA42036, strA42036);

                final CircularProgressButton bB42036 = (CircularProgressButton) findViewById(R.id.btecB42036);
                final CircularProgressButton dB42036 = (CircularProgressButton) findViewById(R.id.dtecB42036);
                strB42036 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117746.pdf";
                setButtonStyle(bB42036, dB42036, strB42036);

                final CircularProgressButton bA42037 = (CircularProgressButton) findViewById(R.id.btecA42037);
                final CircularProgressButton dA42037 = (CircularProgressButton) findViewById(R.id.dtecA42037);
                strA42037 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112296.pdf";
                setButtonStyle(bA42037, dA42037, strA42037);

                final CircularProgressButton bB42037 = (CircularProgressButton) findViewById(R.id.btecB42037);
                final CircularProgressButton dB42037 = (CircularProgressButton) findViewById(R.id.dtecB42037);
                strB42037 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129796.pdf";
                setButtonStyle(bB42037, dB42037, strB42037);

                final CircularProgressButton bA42038 = (CircularProgressButton) findViewById(R.id.btecA42038);
                final CircularProgressButton dA42038 = (CircularProgressButton) findViewById(R.id.dtecA42038);
                final Spinner sB42038 = (Spinner) findViewById(R.id.spinnertecA42038);
                sB42038.setAdapter(adapter2);
                sB42038.setSelection(0);
                // устанавливаем обработчик нажатия
                sB42038.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int position, long id) {
                        // показываем позиция нажатого элемента
                        switch (sB42038.getSelectedItemPosition()) {
                            case (0):
                                strA42038 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112236.pdf";
                                setButtonStyle(bA42038, dA42038, strA42038);
                                break;
                            case (1):
                                strA42038 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112278.pdf";
                                setButtonStyle(bA42038, dA42038, strA42038);
                                break;

                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });

                final CircularProgressButton bB42038 = (CircularProgressButton) findViewById(R.id.btecB42038);
                final CircularProgressButton dB42038 = (CircularProgressButton) findViewById(R.id.dtecB42038);
                strB42038 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/customer%20service/technic/42038bdigitalcompressed.pdf";
                setButtonStyle(bB42038, dB42038, strB42038);

                final CircularProgressButton bA42039 = (CircularProgressButton) findViewById(R.id.btecA42039);
                final CircularProgressButton dA42039 = (CircularProgressButton) findViewById(R.id.dtecA42039);
                strA42039 = "http://cache.lego.com/bigdownloads/buildinginstructions/6117421.pdf";
                setButtonStyle(bA42039, dA42039, strA42039);

                final CircularProgressButton bB42039 = (CircularProgressButton) findViewById(R.id.btecB42039);
                final CircularProgressButton dB42039 = (CircularProgressButton) findViewById(R.id.dtecB42039);
                strB42039 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/customer%20service/technic/42039_b.pdf";
                setButtonStyle(bB42039, dB42039, strB42039);

                final CircularProgressButton bA42040 = (CircularProgressButton) findViewById(R.id.btecA42040);
                final CircularProgressButton dA42040 = (CircularProgressButton) findViewById(R.id.dtecA42040);
                strA42040 = "http://cache.lego.com/bigdownloads/buildinginstructions/6133207.pdf";
                setButtonStyle(bA42040, dA42040, strA42040);

                final CircularProgressButton bB42040 = (CircularProgressButton) findViewById(R.id.btecB42040);
                final CircularProgressButton dB42040 = (CircularProgressButton) findViewById(R.id.dtecB42040);
                strB42040 = "http://cache.lego.com/bigdownloads/buildinginstructions/6133209.pdf";
                setButtonStyle(bB42040, dB42040, strB42040);

                final CircularProgressButton bA42042 = (CircularProgressButton) findViewById(R.id.btecA42042);
                final CircularProgressButton dA42042 = (CircularProgressButton) findViewById(R.id.dtecA42042);
                strA42042 = "http://cache.lego.com/bigdownloads/buildinginstructions/6151636.pdf";
                setButtonStyle(bA42042, dA42042, strA42042);

                final CircularProgressButton bB42042 = (CircularProgressButton) findViewById(R.id.btecB42042);
                final CircularProgressButton dB42042 = (CircularProgressButton) findViewById(R.id.dtecB42042);
                strB42042 = "https://mi-od-live-s.legocdn.com/r/www/r/service/-/media/franchises/technic/products/bi/b%20models/42042_b_digital_230615.pdf";
                setButtonStyle(bB42042, dB42042, strB42042);

                final CircularProgressButton bA42043 = (CircularProgressButton) findViewById(R.id.btecA42043);
                final CircularProgressButton dA42043 = (CircularProgressButton) findViewById(R.id.dtecA42043);
                strA42043 = "http://cache.lego.com/bigdownloads/buildinginstructions/6157463.pdf";
                setButtonStyle(bA42043, dA42043, strA42043);


                bA8065.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA8065, bA8065, dA8065);
                    }
                });
                dA8065.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA8065, bA8065, dA8065);
                    }
                });

                bB8065.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB8065, bB8065, dB8065);
                }
                });
                dB8065.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB8065, bB8065, dB8065);
                    }
                });

                bA42032.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42032, bA42032, dA42032);
                }
                });
                dA42032.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42032, bA42032, dA42032);
                }
                });

                bB42032.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB42032, bB42032, dB42032);
                }
                });
                dB42032.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strB42032, bB42032, dB42032);
                }
                });

                bA42044.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42044, bA42044, dA42044);
                }
                });
                dA42044.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42044, bA42044, dA42044);
                }
                });

                bB42044.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB42044, bB42044, dB42044);
                }
                });
                dB42044.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strB42044, bB42044, dB42044);
                }
                });

                bA42045.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42045, bA42045, dA42045);
                }
                });
                dA42045.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42045, bA42045, dA42045);
                }
                });

                bB42045.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB42045, bB42045, dB42045);
                }
                });
                dB42045.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strB42045, bB42045, dB42045);
                }
                });

                bA42046.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42046, bA42046, dA42046);
                }
                });
                dA42046.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42046, bA42046, dA42046);
                }
                });

                bA42047.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42047, bA42047, dA42047);
                }
                });
                dA42047.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42047, bA42047, dA42047);
                }
                });

                bA42046plus42047.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42046plus42047, bA42046plus42047, dA42046plus42047);
                }
                });
                dA42046plus42047.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42046plus42047, bA42046plus42047, dA42046plus42047);
                }
                });

                bA42048.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42048, bA42048, dA42048);
                }
                });
                dA42048.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42048, bA42048, dA42048);
                }
                });

                bB42048.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB42048, bB42048, dB42048);
                }
                });
                dB42048.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strB42048, bB42048, dB42048);
                }
                });

                bA42049.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42049, bA42049, dA42049);
                }
                });
                dA42049.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42049, bA42049, dA42049);
                }
                });

                bB42049.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB42049, bB42049, dB42049);
                }
                });
                dB42049.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strB42049, bB42049, dB42049);
                }
                });

                bA42050.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42050, bA42050, dA42050);
                }
                });
                dA42050.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42050, bA42050, dA42050);
                }
                });

                bB42050.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB42050, bB42050, dB42050);
                }
                });
                dB42050.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strB42050, bB42050, dB42050);
                }
                });

                bA42052.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strA42052, bA42052, dA42052);
                }
                });
                dA42052.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strA42052, bA42052, dA42052);
                }
                });

                bB42052.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.showPDFUrl(Technic.this, strB42052, bB42052, dB42052);
                }
                });
                dB42052.setOnClickListener(new View.OnClickListener() {
        public void onClick(final View v) {
                pdfe.deleteFile(Technic.this, strB42052, bB42052, dB42052);
                }
                });

                bA42030.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42030, bA42030, dA42030);
                    }
                });
                dA42030.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42030, bA42030, dA42030);
                    }
                });

                bB42030.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42030, bB42030, dB42030);
                    }
                });
                dB42030.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42030, bB42030, dB42030);
                    }
                });

                bA42031.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42031, bA42031, dA42031);
                    }
                });
                dA42031.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42031, bA42031, dA42031);
                    }
                });

                bB42031.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42031, bB42031, dB42031);
                    }
                });
                dB42031.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42031, bB42031, dB42031);
                    }
                });

                b42033.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, str42033, b42033, d42033);
                    }
                });
                d42033.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, str42033, b42033, d42033);
                    }
                });

                b42034.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, str42034, b42034, d42034);
                    }
                });
                d42034.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, str42034, b42034, d42034);
                    }
                });

                b42033plus42034.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, str42033plus42034, b42033plus42034, d42033plus42034);
                    }
                });
                d42033plus42034.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, str42033plus42034, b42033plus42034, d42033plus42034);
                    }
                });

                bA42035.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42035, bA42035, dA42035);
                    }
                });
                dA42035.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42035, bA42035, dA42035);
                    }
                });

                bB42035.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42035, bB42035, dB42035);
                    }
                });
                dB42035.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42035, bB42035, dB42035);
                    }
                });

                bA42036.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42036, bA42036, dA42036);
                    }
                });
                dA42036.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42036, bA42036, dA42036);
                    }
                });

                bB42036.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42036, bB42036, dB42036);
                    }
                });
                dB42036.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42036, bB42036, dB42036);
                    }
                });

                bA42037.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42037, bA42037, dA42037);
                    }
                });
                dA42037.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42037, bA42037, dA42037);
                    }
                });

                bB42037.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42037, bB42037, dB42037);
                    }
                });
                dB42037.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42037, bB42037, dB42037);
                    }
                });

                bA42038.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42038, bA42038, dA42038);
                    }
                });
                dA42038.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42038, bA42038, dA42038);
                    }
                });

                bB42038.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42038, bB42038, dB42038);
                    }
                });
                dB42038.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42038, bB42038, dB42038);
                    }
                });

                bA42039.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42039, bA42039, dA42039);
                    }
                });
                dA42039.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42039, bA42039, dA42039);
                    }
                });

                bB42039.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42039, bB42039, dB42039);
                    }
                });
                dB42039.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42039, bB42039, dB42039);
                    }
                });

                bA42040.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42040, bA42040, dA42040);
                    }
                });
                dA42040.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42040, bA42040, dA42040);
                    }
                });

                bB42040.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42040, bB42040, dB42040);
                    }
                });
                dB42040.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42040, bB42040, dB42040);
                    }
                });

                bA42042.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42042, bA42042, dA42042);
                    }
                });
                dA42042.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42042, bA42042, dA42042);
                    }
                });

                bB42042.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strB42042, bB42042, dB42042);
                    }
                });
                dB42042.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strB42042, bB42042, dB42042);
                    }
                });

                bA42043.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.showPDFUrl(Technic.this, strA42043, bA42043, dA42043);
                    }
                });
                dA42043.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        pdfe.deleteFile(Technic.this, strA42043, bA42043, dA42043);
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
                        if (!pdfe.isPDFSupported(Technic.this)) {
                                buttonOpen.setProgress(100);
                                buttonOpen.setText(R.string.open);
                                buttonDelete.setVisibility(View.GONE);
                        } else if (pdfe.downloadInspection(Technic.this, jonal)){
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
                case R.id.imageA8065:
                        Intent fullScreenIntent = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent.putExtra("imageFullScr", R.drawable.a8065full);
                        startActivity(fullScreenIntent);
                        break;
                case R.id.imageB8065:
                        Intent fullScreenIntent1 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent1.putExtra("imageFullScr", R.drawable.b8065full);
                        startActivity(fullScreenIntent1);
                        break;
                case R.id.imageA42032:
                        Intent fullScreenIntent2 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent2.putExtra("imageFullScr", R.drawable.a42032full);
                        startActivity(fullScreenIntent2);
                        break;
                case R.id.imageB42032:
                        Intent fullScreenIntent3 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent3.putExtra("imageFullScr", R.drawable.b42032full);
                        startActivity(fullScreenIntent3);
                        break;
                case R.id.imageA42044:
                        Intent fullScreenIntent4 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent4.putExtra("imageFullScr", R.drawable.a42044full);
                        startActivity(fullScreenIntent4);
                        break;
                case R.id.imageB42044:
                        Intent fullScreenIntent5 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent5.putExtra("imageFullScr", R.drawable.b42044full);
                        startActivity(fullScreenIntent5);
                        break;
                case R.id.imageA42045:
                        Intent fullScreenIntent6 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent6.putExtra("imageFullScr", R.drawable.a42045full);
                        startActivity(fullScreenIntent6);
                        break;
                case R.id.imageB42045:
                        Intent fullScreenIntent7 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent7.putExtra("imageFullScr", R.drawable.b42045full);
                        startActivity(fullScreenIntent7);
                        break;
                case R.id.imageA42046:
                        Intent fullScreenIntent8 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent8.putExtra("imageFullScr", R.drawable.a42046full);
                        startActivity(fullScreenIntent8);
                        break;
                case R.id.imageA42047:
                        Intent fullScreenIntent9 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent9.putExtra("imageFullScr", R.drawable.a42047full);
                        startActivity(fullScreenIntent9);
                        break;
                case R.id.imageA42046plus42047:
                        Intent fullScreenIntent10 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent10.putExtra("imageFullScr", R.drawable.a42046plus42047full);
                        startActivity(fullScreenIntent10);
                        break;
                case R.id.imageA42048:
                        Intent fullScreenIntent11 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent11.putExtra("imageFullScr", R.drawable.a42048full);
                        startActivity(fullScreenIntent11);
                        break;
                case R.id.imageB42048:
                        Intent fullScreenIntent12 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent12.putExtra("imageFullScr", R.drawable.b42048full);
                        startActivity(fullScreenIntent12);
                        break;
                case R.id.imageA42049:
                        Intent fullScreenIntent13 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent13.putExtra("imageFullScr", R.drawable.a42049full);
                        startActivity(fullScreenIntent13);
                        break;
                case R.id.imageB42049:
                        Intent fullScreenIntent14 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent14.putExtra("imageFullScr", R.drawable.b42049full);
                        startActivity(fullScreenIntent14);
                        break;
                case R.id.imageA42050:
                        Intent fullScreenIntent15 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent15.putExtra("imageFullScr", R.drawable.a42050full);
                        startActivity(fullScreenIntent15);
                        break;
                case R.id.imageB42050:
                        Intent fullScreenIntent16 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent16.putExtra("imageFullScr", R.drawable.b42050full);
                        startActivity(fullScreenIntent16);
                        break;
                case R.id.imageA42052:
                        Intent fullScreenIntent17 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent17.putExtra("imageFullScr", R.drawable.a42052full);
                        startActivity(fullScreenIntent17);
                        break;
                case R.id.imageB42052:
                        Intent fullScreenIntent18 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent18.putExtra("imageFullScr", R.drawable.b42052full);
                        startActivity(fullScreenIntent18);
                        break;
                    case R.id.imagetecA42030:
                        Intent fullScreenIntent19 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent19.putExtra("imageFullScr", R.drawable.teca42030full);
                        startActivity(fullScreenIntent19);
                        break;
                    case R.id.imagetecB42030:
                        Intent fullScreenIntent20 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent20.putExtra("imageFullScr", R.drawable.tecb42030full);
                        startActivity(fullScreenIntent20);
                        break;
                    case R.id.imagetecA42031:
                        Intent fullScreenIntent21 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent21.putExtra("imageFullScr", R.drawable.teca42031full);
                        startActivity(fullScreenIntent21);
                        break;
                    case R.id.imagetecB42031:
                        Intent fullScreenIntent22 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent22.putExtra("imageFullScr", R.drawable.tecb42031full);
                        startActivity(fullScreenIntent22);
                        break;
                    case R.id.image42033:
                        Intent fullScreenIntent23 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent23.putExtra("imageFullScr", R.drawable.tec42033full);
                        startActivity(fullScreenIntent23);
                        break;
                    case R.id.image42034:
                        Intent fullScreenIntent24 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent24.putExtra("imageFullScr", R.drawable.tec42034full);
                        startActivity(fullScreenIntent24);
                        break;
                    case R.id.image42033plus42034:
                        Intent fullScreenIntent25 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent25.putExtra("imageFullScr", R.drawable.tec42033plus42034full);
                        startActivity(fullScreenIntent25);
                        break;
                    case R.id.imagetecA42035:
                        Intent fullScreenIntent26 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent26.putExtra("imageFullScr", R.drawable.teca42035full);
                        startActivity(fullScreenIntent26);
                        break;
                    case R.id.imagetecB42035:
                        Intent fullScreenIntent27 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent27.putExtra("imageFullScr", R.drawable.tecb42035full);
                        startActivity(fullScreenIntent27);
                        break;
                    case R.id.imagetecA42036:
                        Intent fullScreenIntent28 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent28.putExtra("imageFullScr", R.drawable.teca42036full);
                        startActivity(fullScreenIntent28);
                        break;
                    case R.id.imagetecB42036:
                        Intent fullScreenIntent29 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent29.putExtra("imageFullScr", R.drawable.tecb42036full);
                        startActivity(fullScreenIntent29);
                        break;
                    case R.id.imagetecA42037:
                        Intent fullScreenIntent30 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent30.putExtra("imageFullScr", R.drawable.teca42037full);
                        startActivity(fullScreenIntent30);
                        break;
                    case R.id.imagetecB42037:
                        Intent fullScreenIntent31 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent31.putExtra("imageFullScr", R.drawable.tecb42037full);
                        startActivity(fullScreenIntent31);
                        break;
                    case R.id.imagetecA42038:
                        Intent fullScreenIntent32 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent32.putExtra("imageFullScr", R.drawable.teca42038full);
                        startActivity(fullScreenIntent32);
                        break;
                    case R.id.imagetecB42038:
                        Intent fullScreenIntent33 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent33.putExtra("imageFullScr", R.drawable.tecb42038full);
                        startActivity(fullScreenIntent33);
                        break;
                    case R.id.imagetecA42039:
                        Intent fullScreenIntent34 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent34.putExtra("imageFullScr", R.drawable.teca42039full);
                        startActivity(fullScreenIntent34);
                        break;
                    case R.id.imagetecB42039:
                        Intent fullScreenIntent35 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent35.putExtra("imageFullScr", R.drawable.tecb42039full);
                        startActivity(fullScreenIntent35);
                        break;
                    case R.id.imagetecA42040:
                        Intent fullScreenIntent36 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent36.putExtra("imageFullScr", R.drawable.teca42040full);
                        startActivity(fullScreenIntent36);
                        break;
                    case R.id.imagetecB42040:
                        Intent fullScreenIntent37 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent37.putExtra("imageFullScr", R.drawable.tecb42040full);
                        startActivity(fullScreenIntent37);
                        break;
                    case R.id.imagetecA42042:
                        Intent fullScreenIntent38 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent38.putExtra("imageFullScr", R.drawable.teca42042full);
                        startActivity(fullScreenIntent38);
                        break;
                    case R.id.imagetecB42042:
                        Intent fullScreenIntent39 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent39.putExtra("imageFullScr", R.drawable.tecb42042full);
                        startActivity(fullScreenIntent39);
                        break;
                    case R.id.imagetecA42043:
                        Intent fullScreenIntent40 = new Intent (Technic.this, FullscreenActivity.class);
                        fullScreenIntent40.putExtra("imageFullScr", R.drawable.teca42043full);
                        startActivity(fullScreenIntent40);
                        break;

                  }
                }

}
