package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Popular Movies button is clicked.
     */
    public void launchPopularMovies(View view) {
        CharSequence text = getString(R.string.popular_movies_message);
        displayToast(text);
    }

    /**
     * This method is called when the Stock Hawk button is clicked.
     */
    public void launchStockHawk(View view) {
        CharSequence text = getString(R.string.stock_hawk_message);
        displayToast(text);
    }

    /**
     * This method is called when the Build it bigger button is clicked.
     */
    public void launchBuildItBigger(View view) {
        CharSequence text = getString(R.string.build_it_bigger_message);
        displayToast(text);
    }

    /**
     * This method is called when the Make your app material button is clicked.
     */
    public void launchMakeYourAppMaterial(View view) {
        CharSequence text = getString(R.string.make_your_app_material_message);
        displayToast(text);
    }

    /**
     * This method is called when the Go Ubiquitous button is clicked.
     */
    public void launchGoUbiquitous(View view) {
        CharSequence text = getString(R.string.go_ubiquitous_message);
        displayToast(text);
    }

    /**
     * This method is called when the Capstone button is clicked.
     */
    public void launchCapstone(View view) {
       CharSequence text = getString(R.string.capstone_message);
       displayToast(text);
    }

    /**
     * This method will display the toast when a button is clicked.
     * @param text : The text to display in the toast
     */
    public void displayToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
