package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button botButton;
    private Button topButton;
    private TextView storyTextView;
    private int mStoryIndex = 1;


    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        botButton = (Button) findViewById(R.id.buttonBottom);
        topButton = (Button) findViewById(R.id.buttonTop);
        storyTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:



        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    storyTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    botButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    storyTextView.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    botButton.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        botButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    storyTextView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    botButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if(mStoryIndex == 2){
                    storyTextView.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    botButton.setVisibility(View.GONE);
                }else {
                    storyTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    botButton.setVisibility(View.GONE);
                }
            }
        });
    }
}
