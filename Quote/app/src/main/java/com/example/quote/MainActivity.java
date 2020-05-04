package com.example.quote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();
    private String randomQuote ;
    private TextView quote_txt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayQuote(null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Developed by : Abanoub Asaad",Toast.LENGTH_SHORT).show();
    }

    public void displayQuote(View view){

        quote_txt = findViewById(R.id.textView);
        int randomQuote_id = random.nextInt( (15+1)-1 ) + 1 ;
        randomQuote = "" ;

        switch (randomQuote_id){
            case 1 :
                randomQuote = getString(R.string.quote1);
                break;
            case 2 :
                randomQuote = getString(R.string.quote2);
                break;
            case 3 :
                randomQuote = getString(R.string.quote3);
                break;
            case 4 :
                randomQuote = getString(R.string.quote4);
                break;
            case 5 :
                randomQuote = getString(R.string.quote5);
                break;
            case 6 :
                randomQuote = getString(R.string.quote6);
                break;
            case 7 :
                randomQuote = getString(R.string.quote7);
                break;
            case 8 :
                randomQuote = getString(R.string.quote8);
                break;
            case 9 :
                randomQuote = getString(R.string.quote9);
                break;
            case 10 :
                randomQuote = getString(R.string.quote10);
                break;
            case 11 :
                randomQuote = getString(R.string.quote11);
                break;
            case 12 :
                randomQuote = getString(R.string.quote12);
                break;
            case 13 :
                randomQuote = getString(R.string.quote13);
                break;
            case 14 :
                randomQuote = getString(R.string.quote14);
                break;
            case 15 :
                randomQuote = getString(R.string.quote15);
                break;

        }
        quote_txt.setText(randomQuote);
    }

    public void shareQuote(View view){
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, randomQuote);
        startActivity(Intent.createChooser(shareIntent, "Select an app"));
    }

}
