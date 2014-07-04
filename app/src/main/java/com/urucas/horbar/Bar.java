package com.urucas.horbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Urucas on 7/4/14.
 */

public class Bar extends LinearLayout {

    private final TextView b1;
    private final TextView b2;

    public Bar(Context context, AttributeSet attrs) {
        super(context, attrs);

        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.horbar, this, true);

        b1 = (TextView) findViewById(R.id.horbar_b1);
        b2 = (TextView) findViewById(R.id.horbar_b2);

        b1.setBackgroundColor(Color.parseColor("#8bc34a"));
        b2.setBackgroundColor(Color.parseColor("#ED2939"));
    }

}
