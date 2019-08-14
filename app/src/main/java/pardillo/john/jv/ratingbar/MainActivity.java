package pardillo.john.jv.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RatingBar rbCast, rbStory, rbAverage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.rbCast = this.findViewById(R.id.ratingBar);
        this.rbStory = this.findViewById(R.id.ratingBar2);
        this.rbAverage = this.findViewById(R.id.ratingBar3);

        this.rbCast.setProgress(2);
        this.rbStory.setProgress(2);

        this.findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Float castRate = this.rbCast.getRating();
        Float storyRate = this.rbStory.getRating();

        this.rbAverage.setRating((castRate + storyRate) / 2);
    }
}
