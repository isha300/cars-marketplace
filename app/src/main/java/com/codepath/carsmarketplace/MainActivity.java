package com.codepath.carsmarketplace;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    public static TextView data;
    public static Button advanced;
    public static String color;
    public static String bodyType;
    public static double price;
    public static ImageView dismiss;
    public static TextView gray;
    public static TextView blue;
    public static TextView black;
    public static TextView white;
    public static TextView brown;
    public static TextView red;
    public static TextView silver;
    public static TextView yellow;
    public static TextView green;
    public static ImageView loading;
    public static TextView pricebrowse;
    public static CheckBox twenty;
    public static CheckBox forty;
    public static CheckBox sixty;
    public static CheckBox eighty;
    public static CheckBox hundred;
    public static CheckBox hundredTwenty;
    public static CheckBox hundredForty;
    public static CheckBox hundredSixty;
    public static CheckBox hundredEighty;
    public static CheckBox twoHundred;
    public static TextView colorbrowse;
    public static String id;
    public static String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        data = (TextView) findViewById(R.id.fetched);
        color = "";
        bodyType = "";
        id = "";
        content = "";
        loading = (ImageView) findViewById(R.id.loading);
        advanced = (Button) findViewById(R.id.advanced);
        dismiss = (ImageView) findViewById(R.id.dismiss);
        gray = (TextView) findViewById(R.id.gray);
        blue = (TextView) findViewById(R.id.blue);
        black = (TextView) findViewById(R.id.black);
        white = (TextView) findViewById(R.id.white);
        red = (TextView) findViewById(R.id.red);
        silver = (TextView) findViewById(R.id.silver);
        yellow = (TextView) findViewById(R.id.yellow);
        green = (TextView) findViewById(R.id.green);
        brown = (TextView) findViewById(R.id.brown);
        colorbrowse = (TextView) findViewById(R.id.colorbrowse);
        pricebrowse = (TextView) findViewById(R.id.pricebrowse);
        twenty = (CheckBox) findViewById(R.id.twenty);
        forty = (CheckBox) findViewById(R.id.forty);
        sixty = (CheckBox) findViewById(R.id.sixty);
        eighty = (CheckBox) findViewById(R.id.eighty);
        hundred = (CheckBox) findViewById(R.id.hundred);
        hundredTwenty = (CheckBox) findViewById(R.id.hundredTwenty);
        hundredForty = (CheckBox) findViewById(R.id.hundredForty);
        hundredSixty = (CheckBox) findViewById(R.id.hundredSixty);
        hundredEighty = (CheckBox) findViewById(R.id.hundredEighty);
        twoHundred = (CheckBox) findViewById(R.id.twoHundred);

        final Button adv = findViewById(R.id.advanced);

        final Button graybtn = findViewById(R.id.graybtn);
        final Button bluebtn = findViewById(R.id.bluebtn);
        final Button blackbtn = findViewById(R.id.blackbtn);
        final Button whitebtn = findViewById(R.id.whitebtn);
        final Button brownbtn = findViewById(R.id.brownbtn);
        final Button redbtn = findViewById(R.id.redbtn);
        final Button silverbtn = findViewById(R.id.silverbtn);
        final Button yellowbtn = findViewById(R.id.yellowbtn);
        final Button greenbtn = findViewById(R.id.greenbtn);

        final Button wagonbtn = findViewById(R.id.wagonbtn);
        final Button coupebtn = findViewById(R.id.coupebtn);
        final Button hatchbackbtn = findViewById(R.id.hatchbackbtn);
        final Button convertiblebtn = findViewById(R.id.convertiblebtn);
        final Button minivanbtn = findViewById(R.id.minivanbtn);
        final Button pickupbtn = findViewById(R.id.pickuptruckbtn);
        final Button sedanbtn = findViewById(R.id.sedanbtn);
        final Button vanbtn = findViewById(R.id.vanbtn);
        final Button suvbtn = findViewById(R.id.suvbtn);

        final Button twenty = findViewById(R.id.twenty);
        final Button forty = findViewById(R.id.forty);
        final Button sixty = findViewById(R.id.sixty);
        final Button eighty = findViewById(R.id.eighty);
        final Button hundred = findViewById(R.id.hundred);
        final Button hundredTwenty = findViewById(R.id.hundredTwenty);
        final Button hundredForty = findViewById(R.id.hundredForty);
        final Button hundredEighty = findViewById(R.id.hundredEighty);
        final Button hundredSixty = findViewById(R.id.hundredSixty);
        final Button twoHundred = findViewById(R.id.twoHundred);

        final ImageView loading = findViewById(R.id.loading);

        graybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Gray";
                id = "graybtn";
                content = "button";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
            }
        });
        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Blue";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "bluebtn";
                content = "button";
            }
        });
        whitebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "White";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "whitebtn";
                content = "button";
            }
        });
        blackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Black";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "blackbtn";
                content = "button";
            }
        });
        brownbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Brown";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "brownbtn";
                content = "button";
            }
        });
        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Red";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "redbtn";
                content = "button";
            }
        });
        silverbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Silver";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "silverbtn";
                content = "button";
            }
        });
        yellowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Yellow";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "yellowbtn";
                content = "button";
            }
        });
        greenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = "Green";
                fetchData process = new fetchData();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "greenbtn";
                content = "button";
            }
        });
        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FilteredCars.class);
                MainActivity.this.startActivity(intent);
            }
        });
        wagonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Wagon";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "wagontbn";
                content = "button";
            }
        });
        coupebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Coupe";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "coupebtn";
                content = "button";
            }
        });
        hatchbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Hatchback";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "hatchbackbtn";
                content = "button";
            }
        });
        convertiblebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Convertible";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "convertiblebtn";
                content = "button";
            }
        });
        minivanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Minivan";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "minivanbtn";
                content = "button";
            }
        });
        pickupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Pickup Truck";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "pickupbtn";
                content = "button";
            }
        });
        sedanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Sedan";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "sedanbtn";
                content = "button";
            }
        });
        vanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Van";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "vanbtn";
                content = "button";
            }
        });
        minivanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "Minivan";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "minivanbtn";
                content = "button";
            }
        });
        suvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyType = "SUV / Crossover";
                BodyTypeFilter process = new BodyTypeFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "suvbtn";
                content = "button";
            }
        });
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 20000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "twenty";
                content = "checkbox";
            }
        });
        forty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 40000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "forty";
                content = "checkbox";
            }
        });
        sixty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 60000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "sixty";
                content = "checkbox";
            }
        });
        eighty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 80000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "eighty";
                content = "checkbox";
            }
        });
        hundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 100000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "hundred";
                content = "checkbox";
            }
        });
        hundredTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 120000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "hundredTwenty";
                content = "checkbox";
            }
        });
        hundredForty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 140000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "hundredForty";
                content = "checkbox";
            }
        });
        hundredSixty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 160000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "hundredSixty";
                content = "checkbox";
            }
        });
        hundredEighty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 180000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "hundredEighty";
                content = "checkbox";
            }
        });
        twoHundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 200000;
                PriceFilter process = new PriceFilter();
                process.execute();
                loading.setVisibility(View.VISIBLE);
                id = "twoHundred";
                content = "checkbox";
            }
        });

        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = getIntent();
                finish();
                startActivity(mIntent);
            }
        });

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, content);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
