package com.example.edward.reddit_01;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * As of now, all this activity does is create and
 * render a fragment.
 *github test
 *
 */
public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }

    void addFragment(){
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragments_holder
                        , PostsFragment.newInstance("askreddit"))
                .commit();
    }
}