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
import android.widget.ImageView;

import com.appodeal.ads.Appodeal;
import com.dd.CircularProgressButton;

public class Architecture extends AppCompatActivity implements View.OnClickListener {

    String strArc21022 = new String();
    String strArc21023 = new String();
    String strArc21024 = new String();
    String strArc21026 = new String();
    String strArc21027 = new String();
    String strArc21028 = new String();
    String strArc21031 = new String();


    PDFTools pdfe = new PDFTools();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);
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


        Appodeal.setBannerViewId(R.id.appodealBannerView);
        String appKey = "fa7b74c8278d1e0f3ec32d243a7e151466b88968bfc3fe2f";
        Appodeal.initialize(this, appKey, Appodeal.BANNER);
//        Appodeal.setTesting(true);



        Appodeal.show(this, Appodeal.BANNER_VIEW);

        final ImageView imageArc21022 = (ImageView) findViewById(R.id.imageArc21022);
        imageArc21022.setOnClickListener(this);
        final ImageView imageArc21023 = (ImageView) findViewById(R.id.imageArc21023);
        imageArc21023.setOnClickListener(this);
        final ImageView imageArc21024 = (ImageView) findViewById(R.id.imageArc21024);
        imageArc21024.setOnClickListener(this);
        final ImageView imageArc21026 = (ImageView) findViewById(R.id.imageArc21026);
        imageArc21026.setOnClickListener(this);
        final ImageView imageArc21027 = (ImageView) findViewById(R.id.imageArc21027);
        imageArc21027.setOnClickListener(this);
        final ImageView imageArc21028 = (ImageView) findViewById(R.id.imageArc21028);
        imageArc21028.setOnClickListener(this);
        final ImageView imageArc21031 = (ImageView) findViewById(R.id.imageArc21031);
        imageArc21031.setOnClickListener(this);


        final CircularProgressButton bArc21022 = (CircularProgressButton) findViewById(R.id.butArc21022);
        final CircularProgressButton dArc21022 = (CircularProgressButton) findViewById(R.id.dArc21022);
        strArc21022 = "http://cache.lego.com/bigdownloads/buildinginstructions/6112564.pdf";
        setButtonStyle(bArc21022, dArc21022, strArc21022);

        final CircularProgressButton bArc21023 = (CircularProgressButton) findViewById(R.id.butArc21023);
        final CircularProgressButton dArc21023 = (CircularProgressButton) findViewById(R.id.dArc21023);
        strArc21023 = "http://cache.lego.com/bigdownloads/buildinginstructions/6138981.pdf";
        setButtonStyle(bArc21023, dArc21023, strArc21023);

        final CircularProgressButton bArc21024 = (CircularProgressButton) findViewById(R.id.butArc21024);
        final CircularProgressButton dArc21024 = (CircularProgressButton) findViewById(R.id.dArc21024);
        strArc21024 = "http://cache.lego.com/bigdownloads/buildinginstructions/6129472.pdf";
        setButtonStyle(bArc21024, dArc21024, strArc21024);

        final CircularProgressButton bArc21026 = (CircularProgressButton) findViewById(R.id.butArc21026);
        final CircularProgressButton dArc21026 = (CircularProgressButton) findViewById(R.id.dArc21026);
        strArc21026 = "http://cache.lego.com/bigdownloads/buildinginstructions/6160898.pdf";
        setButtonStyle(bArc21026, dArc21026, strArc21026);

        final CircularProgressButton bArc21027 = (CircularProgressButton) findViewById(R.id.butArc21027);
        final CircularProgressButton dArc21027 = (CircularProgressButton) findViewById(R.id.dArc21027);
        strArc21027 = "http://cache.lego.com/bigdownloads/buildinginstructions/6160900.pdf";
        setButtonStyle(bArc21027, dArc21027, strArc21027);

        final CircularProgressButton bArc21028 = (CircularProgressButton) findViewById(R.id.butArc21028);
        final CircularProgressButton dArc21028 = (CircularProgressButton) findViewById(R.id.dArc21028);
        strArc21028 = "http://cache.lego.com/bigdownloads/buildinginstructions/6172682.pdf";
        setButtonStyle(bArc21028, dArc21028, strArc21028);

        final CircularProgressButton bArc21031 = (CircularProgressButton) findViewById(R.id.butArc21031);
        final CircularProgressButton dArc21031 = (CircularProgressButton) findViewById(R.id.dArc21031);
        strArc21031 = "http://cache.lego.com/bigdownloads/buildinginstructions/6141908.pdf";
        setButtonStyle(bArc21031, dArc21031, strArc21031);


        bArc21022.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Architecture.this, strArc21022, bArc21022, dArc21022);
            }
        });
        dArc21022.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Architecture.this, strArc21022, bArc21022, dArc21022);
            }
        });

        bArc21023.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Architecture.this, strArc21023, bArc21023, dArc21023);
            }
        });
        dArc21023.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Architecture.this, strArc21023, bArc21023, dArc21023);
            }
        });

        bArc21024.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Architecture.this, strArc21024, bArc21024, dArc21024);
            }
        });
        dArc21024.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Architecture.this, strArc21024, bArc21024, dArc21024);
            }
        });

        bArc21026.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Architecture.this, strArc21026, bArc21026, dArc21026);
            }
        });
        dArc21026.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Architecture.this, strArc21026, bArc21026, dArc21026);
            }
        });

        bArc21027.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Architecture.this, strArc21027, bArc21027, dArc21027);
            }
        });
        dArc21027.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Architecture.this, strArc21027, bArc21027, dArc21027);
            }
        });

        bArc21028.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Architecture.this, strArc21028, bArc21028, dArc21028);
            }
        });
        dArc21028.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Architecture.this, strArc21028, bArc21028, dArc21028);
            }
        });

        bArc21031.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.showPDFUrl(Architecture.this, strArc21031, bArc21031, dArc21031);
            }
        });
        dArc21031.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                pdfe.deleteFile(Architecture.this, strArc21031, bArc21031, dArc21031);
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
        if (!pdfe.isPDFSupported(Architecture.this)) {
            buttonOpen.setProgress(100);
            buttonOpen.setText(R.string.open);
            buttonDelete.setVisibility(View.GONE);
        } else if (pdfe.downloadInspection(Architecture.this, jonal)){
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
            case R.id.imageArc21022:
                Intent fullScreenIntent = new Intent(Architecture.this, FullscreenActivity.class);
                fullScreenIntent.putExtra("imageFullScr", R.drawable.arc21022full);
                startActivity(fullScreenIntent);
                break;
            case R.id.imageArc21023:
                Intent fullScreenIntent1 = new Intent(Architecture.this, FullscreenActivity.class);
                fullScreenIntent1.putExtra("imageFullScr", R.drawable.arc21023full);
                startActivity(fullScreenIntent1);
                break;
            case R.id.imageArc21024:
                Intent fullScreenIntent2 = new Intent(Architecture.this, FullscreenActivity.class);
                fullScreenIntent2.putExtra("imageFullScr", R.drawable.arc21024full);
                startActivity(fullScreenIntent2);
                break;
            case R.id.imageArc21026:
                Intent fullScreenIntent3 = new Intent(Architecture.this, FullscreenActivity.class);
                fullScreenIntent3.putExtra("imageFullScr", R.drawable.arc21026full);
                startActivity(fullScreenIntent3);
                break;
            case R.id.imageArc21027:
                Intent fullScreenIntent4 = new Intent(Architecture.this, FullscreenActivity.class);
                fullScreenIntent4.putExtra("imageFullScr", R.drawable.arc21027full);
                startActivity(fullScreenIntent4);
                break;
            case R.id.imageArc21028:
                Intent fullScreenIntent5 = new Intent(Architecture.this, FullscreenActivity.class);
                fullScreenIntent5.putExtra("imageFullScr", R.drawable.arc21028full);
                startActivity(fullScreenIntent5);
                break;
            case R.id.imageArc21031:
                Intent fullScreenIntent6 = new Intent(Architecture.this, FullscreenActivity.class);
                fullScreenIntent6.putExtra("imageFullScr", R.drawable.arc21031full);
                startActivity(fullScreenIntent6);
                break;

        }
    }
}
