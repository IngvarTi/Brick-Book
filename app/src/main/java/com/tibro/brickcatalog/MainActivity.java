package com.tibro.brickcatalog;

import java.util.Locale;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private static final String TAG = "MainActivity";
    private Tracker mTracker;
    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        adView = new AdView(this);
        adView.setAdUnitId(getString(R.string.banner_ad_unit_id));
        adView.setAdSize(AdSize.SMART_BANNER);

        adView.setVisibility(View.GONE);

        LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);

        // Добавление в разметку экземпляра adView.
        layout.addView(adView);
        AdRequest adRequest = new  AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();


        adView.loadAd(adRequest);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                adView.setVisibility(View.VISIBLE);
            }
        });
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        String appKey = "fa7b74c8278d1e0f3ec32d243a7e151466b88968bfc3fe2f";
//        Appodeal.initialize(this, appKey, Appodeal.BANNER);
////        Appodeal.setTesting(true);
//
//        Appodeal.show(this, Appodeal.BANNER_BOTTOM);

        // [START shared_tracker]
        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
        // [END shared_tracker]

        // [START screen_view_hit]
//        Log.i(TAG, "Setting screen name: ");
        mTracker.setScreenName("BrickHomePage");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        // [END screen_view_hit]




        final Button butTechnic = (Button)findViewById(R.id.butTechnic);
        butTechnic.setOnClickListener(this);
        final Button butCity = (Button)findViewById(R.id.butCity);
        butCity.setOnClickListener(this);
        final Button butArchitecture = (Button)findViewById(R.id.butArchitecture);
        butArchitecture.setOnClickListener(this);
        final Button butCreator = (Button)findViewById(R.id.butCreator);
        butCreator.setOnClickListener(this);
        final Button butStarWars = (Button)findViewById(R.id.butStarWars);
        butStarWars.setOnClickListener(this);
        final Button butFriends = (Button)findViewById(R.id.butFriends);
        butFriends.setOnClickListener(this);

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



//    @Override
//    public void onResume() {
//        super.onResume();
//        Appodeal.onResume(this, Appodeal.BANNER);
//    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
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
            case R.id.butTechnic:
                Intent TechnicIntent = new Intent (MainActivity.this, Technic.class);
                startActivity(TechnicIntent);
                // [START custom_event]
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("Go Technic")
                        .build());
                // [END custom_event]
                break;
            case R.id.butCity:
                Intent CityIntent = new Intent (MainActivity.this, City.class);
                startActivity(CityIntent);
                // [START custom_event]
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("Go City")
                        .build());
                // [END custom_event]
                break;
            case R.id.butArchitecture:
                Intent ArchitectureIntent = new Intent (MainActivity.this, Architecture.class);
                startActivity(ArchitectureIntent);
                // [START custom_event]
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("Go Architecture")
                        .build());
                // [END custom_event]
                break;
            case R.id.butCreator:
                Intent CreatorIntent = new Intent (MainActivity.this, Creator.class);
                startActivity(CreatorIntent);
                // [START custom_event]
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("Go Creator")
                        .build());
                // [END custom_event]
                break;
            case R.id.butStarWars:
                Intent StarWarsIntent = new Intent (MainActivity.this, StarWars.class);
                startActivity(StarWarsIntent);
                // [START custom_event]
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("Go tarWars")
                        .build());
                // [END custom_event]
                break;
            case R.id.butFriends:
                Intent FriendsIntent = new Intent (MainActivity.this, Friends.class);
                startActivity(FriendsIntent);
                // [START custom_event]
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("Go Friends")
                        .build());
                // [END custom_event]
                break;
        }
    }
}
