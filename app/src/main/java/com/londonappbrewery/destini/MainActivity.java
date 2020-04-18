package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mIndex == 1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mIndex = 2;
                }
                else if (mIndex == 3) {
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                    mIndex = 4;
                }
                else if (mIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mIndex = 3;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mIndex = 2;
                }
                else if(mIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }
                else if(mIndex == 3) {
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }


            }
        });

    }
}

