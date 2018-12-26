package com.morepranit.animationsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvAnimations;
    private ArrayList<String> animations;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animations = new ArrayList<>();
        animations.add("fadein");
        animations.add("fadeout");
        animations.add("zoomin");
        animations.add("zoomout");
        animations.add("blink");
        animations.add("rotate");
        animations.add("move");
        animations.add("slideup");
        animations.add("slidedown");
        animations.add("bounce");
        animations.add("sequential");
        animations.add("together");

        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, animations);

        lvAnimations = findViewById(R.id.lv_animations);
        lvAnimations.setAdapter(adapter);
        lvAnimations.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String animationName = animations.get(i);
                Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
                intent.putExtra("animation_name", animationName);
                startActivity(intent);
            }
        });

    }
}
