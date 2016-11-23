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

public class StarWars extends AppCompatActivity implements View.OnClickListener  {

    String[] two = {"1/2", "2/2"};
    String[] three = {"1/3", "2/3", "3/3"};

    PDFTools pdfe = new PDFTools();

    String strStar75074 = new String();
    String strStar75075 = new String();
    String strStar75078 = new String();
    String strStar75079 = new String();
    String strStar75082 = new String();
    String strStar75088 = new String();
    String strStar75089 = new String();
    String strStar75091 = new String();
    String strStar75092 = new String();
    String strStar75093 = new String();
    String strStar75094 = new String();
    String strStar75099 = new String();
    String strStar75100 = new String();
    String strStar75101 = new String();
    String strStar75102 = new String();
    String strStar75103 = new String();
    String strStar75104 = new String();
    String strStar75105 = new String();
    String strStar75125 = new String();
    String strStar75126 = new String();
    String strStar75127 = new String();
    String strStar75128 = new String();
    String strStar75129 = new String();
    String strStar75130 = new String();
    String strStar75131 = new String();
    String strStar75132 = new String();
    String strStar75133 = new String();
    String strStar75134 = new String();
    String strStar75135 = new String();
    String strStar75136 = new String();
    String strStar75137 = new String();
    String strStar75138 = new String();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_wars);
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

        Appodeal.setBannerViewId(R.id.appodealBannerViewStarWars);
        String appKey = "fa7b74c8278d1e0f3ec32d243a7e151466b88968bfc3fe2f";
        Appodeal.initialize(this, appKey, Appodeal.BANNER);
//        Appodeal.setTesting(true);



        Appodeal.show(this, Appodeal.BANNER_VIEW);

        final ImageView imageStar75074 = (ImageView) findViewById(R.id.imageStar75074);
        imageStar75074.setOnClickListener(this);
        final ImageView imageStar75075 = (ImageView) findViewById(R.id.imageStar75075);
        imageStar75075.setOnClickListener(this);
        final ImageView imageStar75078 = (ImageView) findViewById(R.id.imageStar75078);
        imageStar75078.setOnClickListener(this);
        final ImageView imageStar75079 = (ImageView) findViewById(R.id.imageStar75079);
        imageStar75079.setOnClickListener(this);
        final ImageView imageStar75082 = (ImageView) findViewById(R.id.imageStar75082);
        imageStar75082.setOnClickListener(this);
        final ImageView imageStar75088 = (ImageView) findViewById(R.id.imageStar75088);
        imageStar75088.setOnClickListener(this);
        final ImageView imageStar75089 = (ImageView) findViewById(R.id.imageStar75089);
        imageStar75089.setOnClickListener(this);
        final ImageView imageStar75091 = (ImageView) findViewById(R.id.imageStar75091);
        imageStar75091.setOnClickListener(this);
        final ImageView imageStar75092 = (ImageView) findViewById(R.id.imageStar75092);
        imageStar75092.setOnClickListener(this);
        final ImageView imageStar75093 = (ImageView) findViewById(R.id.imageStar75093);
        imageStar75093.setOnClickListener(this);
        final ImageView imageStar75094 = (ImageView) findViewById(R.id.imageStar75094);
        imageStar75094.setOnClickListener(this);
        final ImageView imageStar75099 = (ImageView) findViewById(R.id.imageStar75099);
        imageStar75099.setOnClickListener(this);
        final ImageView imageStar75100 = (ImageView) findViewById(R.id.imageStar75100);
        imageStar75100.setOnClickListener(this);
        final ImageView imageStar75101 = (ImageView) findViewById(R.id.imageStar75101);
        imageStar75101.setOnClickListener(this);
        final ImageView imageStar75102 = (ImageView) findViewById(R.id.imageStar75102);
        imageStar75102.setOnClickListener(this);
        final ImageView imageStar75103 = (ImageView) findViewById(R.id.imageStar75103);
        imageStar75103.setOnClickListener(this);
        final ImageView imageStar75104 = (ImageView) findViewById(R.id.imageStar75104);
        imageStar75104.setOnClickListener(this);
        final ImageView imageStar75105 = (ImageView) findViewById(R.id.imageStar75105);
        imageStar75105.setOnClickListener(this);
        final ImageView imageStar75125 = (ImageView) findViewById(R.id.imageStar75125);
        imageStar75125.setOnClickListener(this);
        final ImageView imageStar75126 = (ImageView) findViewById(R.id.imageStar75126);
        imageStar75126.setOnClickListener(this);
        final ImageView imageStar75127 = (ImageView) findViewById(R.id.imageStar75127);
        imageStar75127.setOnClickListener(this);
        final ImageView imageStar75128 = (ImageView) findViewById(R.id.imageStar75128);
        imageStar75128.setOnClickListener(this);
        final ImageView imageStar75129 = (ImageView) findViewById(R.id.imageStar75129);
        imageStar75129.setOnClickListener(this);
        final ImageView imageStar75130 = (ImageView) findViewById(R.id.imageStar75130);
        imageStar75130.setOnClickListener(this);
        final ImageView imageStar75131 = (ImageView) findViewById(R.id.imageStar75131);
        imageStar75131.setOnClickListener(this);
        final ImageView imageStar75132 = (ImageView) findViewById(R.id.imageStar75132);
        imageStar75132.setOnClickListener(this);
        final ImageView imageStar75133 = (ImageView) findViewById(R.id.imageStar75133);
        imageStar75133.setOnClickListener(this);
        final ImageView imageStar75134 = (ImageView) findViewById(R.id.imageStar75134);
        imageStar75134.setOnClickListener(this);
        final ImageView imageStar75135 = (ImageView) findViewById(R.id.imageStar75135);
        imageStar75135.setOnClickListener(this);
        final ImageView imageStar75136 = (ImageView) findViewById(R.id.imageStar75136);
        imageStar75136.setOnClickListener(this);
        final ImageView imageStar75137 = (ImageView) findViewById(R.id.imageStar75137);
        imageStar75137.setOnClickListener(this);
        final ImageView imageStar75138 = (ImageView) findViewById(R.id.imageStar75138);
        imageStar75138.setOnClickListener(this);

        final CircularProgressButton bStar75074 = (CircularProgressButton) findViewById(R.id.butStar75074);
        final CircularProgressButton dStar75074 = (CircularProgressButton) findViewById(R.id.dStar75074);
        strStar75074 = "http://cache.lego.com/bigdownloads/buildinginstructions/6106669.pdf";
        setButtonStyle(bStar75074, dStar75074, strStar75074);

        final CircularProgressButton bStar75075 = (CircularProgressButton) findViewById(R.id.butStar75075);
        final CircularProgressButton dStar75075 = (CircularProgressButton) findViewById(R.id.dStar75075);
        strStar75075 = "http://cache.lego.com/bigdownloads/buildinginstructions/6106672.pdf";
        setButtonStyle(bStar75075, dStar75075, strStar75075);

        final CircularProgressButton bStar75078 = (CircularProgressButton) findViewById(R.id.butStar75078);
        final CircularProgressButton dStar75078 = (CircularProgressButton) findViewById(R.id.dStar75078);
        strStar75078 = "http://cache.lego.com/bigdownloads/buildinginstructions/6108896.pdf";
        setButtonStyle(bStar75078, dStar75078, strStar75078);

        final CircularProgressButton bStar75079 = (CircularProgressButton) findViewById(R.id.butStar75079);
        final CircularProgressButton dStar75079 = (CircularProgressButton) findViewById(R.id.dStar75079);
        strStar75079 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114090.pdf";
        setButtonStyle(bStar75079, dStar75079, strStar75079);

        final CircularProgressButton bStar75082 = (CircularProgressButton) findViewById(R.id.butStar75082);
        final CircularProgressButton dStar75082 = (CircularProgressButton) findViewById(R.id.dStar75082);
        strStar75082 = "http://cache.lego.com/bigdownloads/buildinginstructions/6108898.pdf";
        setButtonStyle(bStar75082, dStar75082, strStar75082);

        final CircularProgressButton bStar75088 = (CircularProgressButton) findViewById(R.id.butStar75088);
        final CircularProgressButton dStar75088 = (CircularProgressButton) findViewById(R.id.dStar75088);
        strStar75088 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114104.pdf";
        setButtonStyle(bStar75088, dStar75088, strStar75088);

        final CircularProgressButton bStar75089 = (CircularProgressButton) findViewById(R.id.butStar75089);
        final CircularProgressButton dStar75089 = (CircularProgressButton) findViewById(R.id.dStar75089);
        strStar75089 = "http://cache.lego.com/bigdownloads/buildinginstructions/6114212.pdf";
        setButtonStyle(bStar75089, dStar75089, strStar75089);

        final CircularProgressButton bStar75091 = (CircularProgressButton) findViewById(R.id.butStar75091);
        final CircularProgressButton dStar75091 = (CircularProgressButton) findViewById(R.id.dStar75091);
        strStar75091 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128639.pdf";
        setButtonStyle(bStar75091, dStar75091, strStar75091);

        final CircularProgressButton bStar75092 = (CircularProgressButton) findViewById(R.id.butStar75092);
        final CircularProgressButton dStar75092 = (CircularProgressButton) findViewById(R.id.dStar75092);
        strStar75092 = "http://cache.lego.com/bigdownloads/buildinginstructions/6128667.pdf";
        setButtonStyle(bStar75092, dStar75092, strStar75092);

        final CircularProgressButton bStar75093 = (CircularProgressButton) findViewById(R.id.butStar75093);
        final CircularProgressButton dStar75093 = (CircularProgressButton) findViewById(R.id.dStar75093);
        strStar75093 = "http://cache.lego.com/bigdownloads/buildinginstructions/6131100.pdf";
        setButtonStyle(bStar75093, dStar75093, strStar75093);

        final CircularProgressButton bStar75094 = (CircularProgressButton) findViewById(R.id.butStar75094);
        final CircularProgressButton dStar75094 = (CircularProgressButton) findViewById(R.id.dStar75094);
        strStar75094 = "http://cache.lego.com/bigdownloads/buildinginstructions/6152505.pdf";
        setButtonStyle(bStar75094, dStar75094, strStar75094);

        final CircularProgressButton bStar75099 = (CircularProgressButton) findViewById(R.id.butStar75099);
        final CircularProgressButton dStar75099 = (CircularProgressButton) findViewById(R.id.dStar75099);
        strStar75099 = "http://cache.lego.com/bigdownloads/buildinginstructions/6138831.pdf";
        setButtonStyle(bStar75099, dStar75099, strStar75099);

        final CircularProgressButton bStar75100 = (CircularProgressButton) findViewById(R.id.butStar75100);
        final CircularProgressButton dStar75100 = (CircularProgressButton) findViewById(R.id.dStar75100);
        strStar75100 = "http://cache.lego.com/bigdownloads/buildinginstructions/6136428.pdf";
        setButtonStyle(bStar75100, dStar75100, strStar75100);

        final CircularProgressButton bStar75101 = (CircularProgressButton) findViewById(R.id.butStar75101);
        final CircularProgressButton dStar75101 = (CircularProgressButton) findViewById(R.id.dStar75101);
        strStar75101 = "http://cache.lego.com/bigdownloads/buildinginstructions/6136392.pdf";
        setButtonStyle(bStar75101, dStar75101, strStar75101);

        final CircularProgressButton bStar75102 = (CircularProgressButton) findViewById(R.id.butStar75102);
        final CircularProgressButton dStar75102 = (CircularProgressButton) findViewById(R.id.dStar75102);
        strStar75102 = "http://cache.lego.com/bigdownloads/buildinginstructions/6142006.pdf";
        setButtonStyle(bStar75102, dStar75102, strStar75102);

        final CircularProgressButton bStar75103 = (CircularProgressButton) findViewById(R.id.butStar75103);
        final CircularProgressButton dStar75103 = (CircularProgressButton) findViewById(R.id.dStar75103);
        strStar75103 = "http://cache.lego.com/bigdownloads/buildinginstructions/6142948.pdf";
        setButtonStyle(bStar75103, dStar75103, strStar75103);

        final CircularProgressButton bStar75104 = (CircularProgressButton) findViewById(R.id.butStar75104);
        final CircularProgressButton dStar75104 = (CircularProgressButton) findViewById(R.id.dStar75104);
        strStar75104 = "http://cache.lego.com/bigdownloads/buildinginstructions/6160345.pdf";
        setButtonStyle(bStar75104, dStar75104, strStar75104);

        final CircularProgressButton bStar75105 = (CircularProgressButton) findViewById(R.id.butStar75105);
        final CircularProgressButton dStar75105 = (CircularProgressButton) findViewById(R.id.dStar75105);
        strStar75105 = "http://cache.lego.com/bigdownloads/buildinginstructions/6142012.pdf";
        setButtonStyle(bStar75105, dStar75105, strStar75105);

        final CircularProgressButton bStar75125 = (CircularProgressButton) findViewById(R.id.butStar75125);
        final CircularProgressButton dStar75125 = (CircularProgressButton) findViewById(R.id.dStar75125);
        strStar75125 = "http://cache.lego.com/bigdownloads/buildinginstructions/6142958.pdf";
        setButtonStyle(bStar75125, dStar75125, strStar75125);

        final CircularProgressButton bStar75126 = (CircularProgressButton) findViewById(R.id.butStar75126);
        final CircularProgressButton dStar75126 = (CircularProgressButton) findViewById(R.id.dStar75126);
        strStar75126 = "http://cache.lego.com/bigdownloads/buildinginstructions/6142961.pdf";
        setButtonStyle(bStar75126, dStar75126, strStar75126);

        final CircularProgressButton bStar75127 = (CircularProgressButton) findViewById(R.id.butStar75127);
        final CircularProgressButton dStar75127 = (CircularProgressButton) findViewById(R.id.dStar75127);
        strStar75127 = "http://cache.lego.com/bigdownloads/buildinginstructions/6142963.pdf";
        setButtonStyle(bStar75127, dStar75127, strStar75127);

        final CircularProgressButton bStar75128 = (CircularProgressButton) findViewById(R.id.butStar75128);
        final CircularProgressButton dStar75128 = (CircularProgressButton) findViewById(R.id.dStar75128);
        strStar75128 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143143.pdf";
        setButtonStyle(bStar75128, dStar75128, strStar75128);

        final CircularProgressButton bStar75129 = (CircularProgressButton) findViewById(R.id.butStar75129);
        final CircularProgressButton dStar75129 = (CircularProgressButton) findViewById(R.id.dStar75129);
        strStar75129 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143145.pdf";
        setButtonStyle(bStar75129, dStar75129, strStar75129);

        final CircularProgressButton bStar75130 = (CircularProgressButton) findViewById(R.id.butStar75130);
        final CircularProgressButton dStar75130 = (CircularProgressButton) findViewById(R.id.dStar75130);
        strStar75130 = "http://cache.lego.com/bigdownloads/buildinginstructions/6143147.pdf";
        setButtonStyle(bStar75130, dStar75130, strStar75130);

        final CircularProgressButton bStar75131 = (CircularProgressButton) findViewById(R.id.butStar75131);
        final CircularProgressButton dStar75131 = (CircularProgressButton) findViewById(R.id.dStar75131);
        strStar75131 = "http://cache.lego.com/bigdownloads/buildinginstructions/6147154.pdf";
        setButtonStyle(bStar75131, dStar75131, strStar75131);

        final CircularProgressButton bStar75132 = (CircularProgressButton) findViewById(R.id.butStar75132);
        final CircularProgressButton dStar75132 = (CircularProgressButton) findViewById(R.id.dStar75132);
        strStar75132 = "http://cache.lego.com/bigdownloads/buildinginstructions/6148754.pdf";
        setButtonStyle(bStar75132, dStar75132, strStar75132);

        final CircularProgressButton bStar75133 = (CircularProgressButton) findViewById(R.id.butStar75133);
        final CircularProgressButton dStar75133 = (CircularProgressButton) findViewById(R.id.dStar75133);
        strStar75133 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158034.pdf";
        setButtonStyle(bStar75133, dStar75133, strStar75133);

        final CircularProgressButton bStar75134 = (CircularProgressButton) findViewById(R.id.butStar75134);
        final CircularProgressButton dStar75134 = (CircularProgressButton) findViewById(R.id.dStar75134);
        strStar75134 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158037.pdf";
        setButtonStyle(bStar75134, dStar75134, strStar75134);

        final CircularProgressButton bStar75135 = (CircularProgressButton) findViewById(R.id.butStar75135);
        final CircularProgressButton dStar75135 = (CircularProgressButton) findViewById(R.id.dStar75135);
        strStar75135 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158039.pdf";
        setButtonStyle(bStar75135, dStar75135, strStar75135);

        final CircularProgressButton bStar75136 = (CircularProgressButton) findViewById(R.id.butStar75136);
        final CircularProgressButton dStar75136 = (CircularProgressButton) findViewById(R.id.dStar75136);
        strStar75136 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158043.pdf";
        setButtonStyle(bStar75136, dStar75136, strStar75136);

        final CircularProgressButton bStar75137 = (CircularProgressButton) findViewById(R.id.butStar75137);
        final CircularProgressButton dStar75137 = (CircularProgressButton) findViewById(R.id.dStar75137);
        strStar75137 = "http://cache.lego.com/bigdownloads/buildinginstructions/6158049.pdf";
        setButtonStyle(bStar75137, dStar75137, strStar75137);

        final CircularProgressButton bStar75138 = (CircularProgressButton) findViewById(R.id.butStar75138);
        final CircularProgressButton dStar75138 = (CircularProgressButton) findViewById(R.id.dStar75138);
        strStar75138 = "http://cache.lego.com/bigdownloads/buildinginstructions/6155702.pdf";
        setButtonStyle(bStar75138, dStar75138, strStar75138);


        bStar75074.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75074, bStar75074, dStar75074);
            }
        });
        dStar75074.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75074, bStar75074, dStar75074);
            }
        });

        bStar75075.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75075, bStar75075, dStar75075);
            }
        });
        dStar75075.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75075, bStar75075, dStar75075);
            }
        });

        bStar75078.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75078, bStar75078, dStar75078);
            }
        });
        dStar75078.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75078, bStar75078, dStar75078);
            }
        });

        bStar75079.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75079, bStar75079, dStar75079);
            }
        });
        dStar75079.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75079, bStar75079, dStar75079);
            }
        });

        bStar75082.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75082, bStar75082, dStar75082);
            }
        });
        dStar75082.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75082, bStar75082, dStar75082);
            }
        });

        bStar75088.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75088, bStar75088, dStar75088);
            }
        });
        dStar75088.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75088, bStar75088, dStar75088);
            }
        });

        bStar75089.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75089, bStar75089, dStar75089);
            }
        });
        dStar75089.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75089, bStar75089, dStar75089);
            }
        });

        bStar75091.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75091, bStar75091, dStar75091);
            }
        });
        dStar75091.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75091, bStar75091, dStar75091);
            }
        });

        bStar75092.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75092, bStar75092, dStar75092);
            }
        });
        dStar75092.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75092, bStar75092, dStar75092);
            }
        });

        bStar75093.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75093, bStar75093, dStar75093);
            }
        });
        dStar75093.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75093, bStar75093, dStar75093);
            }
        });

        bStar75094.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75094, bStar75094, dStar75094);
            }
        });
        dStar75094.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75094, bStar75094, dStar75094);
            }
        });

        bStar75099.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75099, bStar75099, dStar75099);
            }
        });
        dStar75099.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75099, bStar75099, dStar75099);
            }
        });

        bStar75100.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75100, bStar75100, dStar75100);
            }
        });
        dStar75100.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75100, bStar75100, dStar75100);
            }
        });

        bStar75101.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75101, bStar75101, dStar75101);
            }
        });
        dStar75101.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75101, bStar75101, dStar75101);
            }
        });

        bStar75102.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75102, bStar75102, dStar75102);
            }
        });
        dStar75102.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75102, bStar75102, dStar75102);
            }
        });

        bStar75103.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75103, bStar75103, dStar75103);
            }
        });
        dStar75103.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75103, bStar75103, dStar75103);
            }
        });

        bStar75104.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75104, bStar75104, dStar75104);
            }
        });
        dStar75104.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75104, bStar75104, dStar75104);
            }
        });

        bStar75105.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75105, bStar75105, dStar75105);
            }
        });
        dStar75105.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75105, bStar75105, dStar75105);
            }
        });

        bStar75125.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75125, bStar75125, dStar75125);
            }
        });
        dStar75125.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75125, bStar75125, dStar75125);
            }
        });

        bStar75126.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75126, bStar75126, dStar75126);
            }
        });
        dStar75126.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75126, bStar75126, dStar75126);
            }
        });

        bStar75127.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75127, bStar75127, dStar75127);
            }
        });
        dStar75127.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75127, bStar75127, dStar75127);
            }
        });

        bStar75128.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75128, bStar75128, dStar75128);
            }
        });
        dStar75128.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75128, bStar75128, dStar75128);
            }
        });

        bStar75129.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75129, bStar75129, dStar75129);
            }
        });
        dStar75129.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75129, bStar75129, dStar75129);
            }
        });

        bStar75130.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75130, bStar75130, dStar75130);
            }
        });
        dStar75130.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75130, bStar75130, dStar75130);
            }
        });

        bStar75131.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75131, bStar75131, dStar75131);
            }
        });
        dStar75131.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75131, bStar75131, dStar75131);
            }
        });

        bStar75132.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75132, bStar75132, dStar75132);
            }
        });
        dStar75132.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75132, bStar75132, dStar75132);
            }
        });

        bStar75133.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75133, bStar75133, dStar75133);
            }
        });
        dStar75133.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75133, bStar75133, dStar75133);
            }
        });

        bStar75134.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75134, bStar75134, dStar75134);
            }
        });
        dStar75134.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75134, bStar75134, dStar75134);
            }
        });

        bStar75135.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75135, bStar75135, dStar75135);
            }
        });
        dStar75135.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75135, bStar75135, dStar75135);
            }
        });

        bStar75136.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75136, bStar75136, dStar75136);
            }
        });
        dStar75136.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75136, bStar75136, dStar75136);
            }
        });

        bStar75137.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75137, bStar75137, dStar75137);
            }
        });
        dStar75137.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75137, bStar75137, dStar75137);
            }
        });

        bStar75138.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(StarWars.this, strStar75138, bStar75138, dStar75138);
            }
        });
        dStar75138.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(StarWars.this, strStar75138, bStar75138, dStar75138);
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
        if (!pdfe.isPDFSupported(StarWars.this)) {
            buttonOpen.setProgress(100);
            buttonOpen.setText(R.string.open);
            buttonDelete.setVisibility(View.GONE);
        } else if (pdfe.downloadInspection(StarWars.this, jonal)){
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
            case R.id.imageStar75074:
                Intent fullScreenIntent = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent.putExtra("imageFullScr", R.drawable.star75074full);
                startActivity(fullScreenIntent);
                break;
            case R.id.imageStar75075:
                Intent fullScreenIntent1 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent1.putExtra("imageFullScr", R.drawable.star75075full);
                startActivity(fullScreenIntent1);
                break;
            case R.id.imageStar75078:
                Intent fullScreenIntent2 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent2.putExtra("imageFullScr", R.drawable.star75078full);
                startActivity(fullScreenIntent2);
                break;
            case R.id.imageStar75079:
                Intent fullScreenIntent3 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent3.putExtra("imageFullScr", R.drawable.star75079full);
                startActivity(fullScreenIntent3);
                break;
            case R.id.imageStar75082:
                Intent fullScreenIntent4 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent4.putExtra("imageFullScr", R.drawable.star75082full);
                startActivity(fullScreenIntent4);
                break;
            case R.id.imageStar75088:
                Intent fullScreenIntent5 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent5.putExtra("imageFullScr", R.drawable.star75088full);
                startActivity(fullScreenIntent5);
                break;
            case R.id.imageStar75089:
                Intent fullScreenIntent6 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent6.putExtra("imageFullScr", R.drawable.star75089full);
                startActivity(fullScreenIntent6);
                break;
            case R.id.imageStar75091:
                Intent fullScreenIntent7 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent7.putExtra("imageFullScr", R.drawable.star75091full);
                startActivity(fullScreenIntent7);
                break;
            case R.id.imageStar75092:
                Intent fullScreenIntent8 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent8.putExtra("imageFullScr", R.drawable.star75092full);
                startActivity(fullScreenIntent8);
                break;
            case R.id.imageStar75093:
                Intent fullScreenIntent9 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent9.putExtra("imageFullScr", R.drawable.star75093full);
                startActivity(fullScreenIntent9);
                break;
            case R.id.imageStar75094:
                Intent fullScreenIntent10 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent10.putExtra("imageFullScr", R.drawable.star75094full);
                startActivity(fullScreenIntent10);
                break;
            case R.id.imageStar75099:
                Intent fullScreenIntent11 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent11.putExtra("imageFullScr", R.drawable.star75099full);
                startActivity(fullScreenIntent11);
                break;
            case R.id.imageStar75100:
                Intent fullScreenIntent12 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent12.putExtra("imageFullScr", R.drawable.star75100full);
                startActivity(fullScreenIntent12);
                break;
            case R.id.imageStar75101:
                Intent fullScreenIntent13 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent13.putExtra("imageFullScr", R.drawable.star75101full);
                startActivity(fullScreenIntent13);
                break;
            case R.id.imageStar75102:
                Intent fullScreenIntent14 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent14.putExtra("imageFullScr", R.drawable.star75102full);
                startActivity(fullScreenIntent14);
                break;
            case R.id.imageStar75103:
                Intent fullScreenIntent15 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent15.putExtra("imageFullScr", R.drawable.star75103full);
                startActivity(fullScreenIntent15);
                break;
            case R.id.imageStar75104:
                Intent fullScreenIntent16 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent16.putExtra("imageFullScr", R.drawable.star75104full);
                startActivity(fullScreenIntent16);
                break;
            case R.id.imageStar75105:
                Intent fullScreenIntent17 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent17.putExtra("imageFullScr", R.drawable.star75105full);
                startActivity(fullScreenIntent17);
                break;
            case R.id.imageStar75125:
                Intent fullScreenIntent18 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent18.putExtra("imageFullScr", R.drawable.star75125full);
                startActivity(fullScreenIntent18);
                break;
            case R.id.imageStar75126:
                Intent fullScreenIntent19 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent19.putExtra("imageFullScr", R.drawable.star75126full);
                startActivity(fullScreenIntent19);
                break;
            case R.id.imageStar75127:
                Intent fullScreenIntent20 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent20.putExtra("imageFullScr", R.drawable.star75127full);
                startActivity(fullScreenIntent20);
                break;
            case R.id.imageStar75128:
                Intent fullScreenIntent21 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent21.putExtra("imageFullScr", R.drawable.star75128full);
                startActivity(fullScreenIntent21);
                break;
            case R.id.imageStar75129:
                Intent fullScreenIntent22 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent22.putExtra("imageFullScr", R.drawable.star75129full);
                startActivity(fullScreenIntent22);
                break;
            case R.id.imageStar75130:
                Intent fullScreenIntent23 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent23.putExtra("imageFullScr", R.drawable.star75130full);
                startActivity(fullScreenIntent23);
                break;
            case R.id.imageStar75131:
                Intent fullScreenIntent24 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent24.putExtra("imageFullScr", R.drawable.star75131full);
                startActivity(fullScreenIntent24);
                break;
            case R.id.imageStar75132:
                Intent fullScreenIntent25 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent25.putExtra("imageFullScr", R.drawable.star75132full);
                startActivity(fullScreenIntent25);
                break;
            case R.id.imageStar75133:
                Intent fullScreenIntent26 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent26.putExtra("imageFullScr", R.drawable.star75133full);
                startActivity(fullScreenIntent26);
                break;
            case R.id.imageStar75134:
                Intent fullScreenIntent27 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent27.putExtra("imageFullScr", R.drawable.star75134full);
                startActivity(fullScreenIntent27);
                break;
            case R.id.imageStar75135:
                Intent fullScreenIntent28 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent28.putExtra("imageFullScr", R.drawable.star75135full);
                startActivity(fullScreenIntent28);
                break;
            case R.id.imageStar75136:
                Intent fullScreenIntent29 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent29.putExtra("imageFullScr", R.drawable.star75136full);
                startActivity(fullScreenIntent29);
                break;
            case R.id.imageStar75137:
                Intent fullScreenIntent30 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent30.putExtra("imageFullScr", R.drawable.star75137full);
                startActivity(fullScreenIntent30);
                break;
            case R.id.imageStar75138:
                Intent fullScreenIntent31 = new Intent(StarWars.this, FullscreenActivity.class);
                fullScreenIntent31.putExtra("imageFullScr", R.drawable.star75138full);
                startActivity(fullScreenIntent31);
                break;

        }


    }

}
