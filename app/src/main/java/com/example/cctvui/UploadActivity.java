package com.example.cctvui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class UploadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        // Back arrow click to go back to mapsui page
        findViewById(R.id.back_arrow).setOnClickListener(v -> onBackPressed());
    }
}
