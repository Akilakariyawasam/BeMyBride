package com.example.bemybride.Users;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.bemybride.R;

import java.util.ArrayList;

/**
 * Created by Akila on 3/16/2018.
 */

public class AccSettingsActivity extends AppCompatActivity {

    private static final String TAG = "AccSettingsActivity";
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acountsettings);
        mContext = AccSettingsActivity.this;

        Log.d(TAG, "onCreate: started.");

        setSettingList();

        ImageView backArrow = (ImageView) findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Navigating to profile activity");
                finish();
            }
        });

    }

    private void setSettingList(){

        ListView listView = (ListView) findViewById(R.id.lv_ac_settings);

        ArrayList<String> settingList = new ArrayList<>();

        settingList.add(getString(R.string.edit_profile));
        settingList.add(getString(R.string.sign_out));

        ArrayAdapter arrayAdapter = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, settingList);
        listView.setAdapter(arrayAdapter);
    }

}

