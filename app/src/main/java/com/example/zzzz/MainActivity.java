package com.example.zzzz;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello");
        textView.setTextSize(30);
        textView.setPadding(10,10,10,10);
        textView.setBackgroundColor(0x1116666);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.MATCH_PARENT);
        layoutParams.leftToLeft = ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.topToTop = ViewGroup.LayoutParams.MATCH_PARENT;
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        ConstraintLayout constraintLayout1 = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams layoutParams1 = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams1.setMargins(50, 50, 50, 50);
        layoutParams1.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams1.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams1);
        constraintLayout1.addView(textView);
        setContentView(constraintLayout);
    }
}