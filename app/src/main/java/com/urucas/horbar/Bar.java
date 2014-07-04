package com.urucas.horbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Urucas on 7/4/14.
 */

public class Bar extends LinearLayout {

    private TextView b1TextView;
    private TextView b2TextView;

    private float total = 1;
    private float b1val = 0.6f, b2val = 0.4f;
    private String b1text = "60", b2text = "40";

    public Bar(Context context, AttributeSet attrs) {
        super(context, attrs);

        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.horbar, this, true);

        b1TextView = (TextView) findViewById(R.id.horbar_b1);
        b2TextView = (TextView) findViewById(R.id.horbar_b2);

        b1TextView.setBackgroundColor(Color.parseColor("#8bc34a"));
        b2TextView.setBackgroundColor(Color.parseColor("#ED2939"));

    }

    public void setTotal(int total){
        this.total = total;
    }

    public void updateBar(float b1, float b2) {

        b1val = b1; b2val = b2;

        float percent1 = b1val == 0 ? 0 : b1val/total;
        float percent2 = b2val == 0 ? 0 : b2val/total;

        percent1 = 1 - ((float)((int)(percent1*100)))/100;
        percent2 = 1 - ((float)((int)(percent2*100)))/100;

        b1TextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, percent1));

        b2TextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, percent2));

        b1TextView.setText(String.valueOf(b1));
        b2TextView.setText(String.valueOf(b2));
    }

    public void updateBar(float b1, float b2, String s1, String s2) {

        b1val = b1; b2val = b2;

        float percent1 = total*b1val/100;
        float percent2 = total*b2val/100;

        percent1 = 1 - ((float)((int)(percent1*100)))/100;
        percent2 = 1 - ((float)((int)(percent2*100)))/100;

        b1TextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, percent1));

        b2TextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, percent2));

        b1TextView.setText(s1);
        b2TextView.setText(s2);
    }
}
