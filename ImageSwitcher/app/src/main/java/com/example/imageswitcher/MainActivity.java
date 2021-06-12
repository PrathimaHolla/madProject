package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int animalImages[]=new int[]{R.drawable.animal1,
            R.drawable.animal2,
            R.drawable.animal3,
            R.drawable.animal4};
    int i=1;
    public void clickChange(View view){
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(animalImages[i]);
        i++;
        if(i>3) i=0;
        Log.i("info","value of i"+i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}