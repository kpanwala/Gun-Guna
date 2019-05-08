package com.example.android.gun_guna;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Bollywood extends AppCompatActivity {
    MediaPlayer mMediaPlayer;

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type);


        ArrayList<Type> al = new ArrayList<Type>();
        al.add(new Type("Jab Harry Met Sejal", R.raw.jabharry));
        al.add(new Type("Ullu Ka Pattha", R.raw.ullu));
        al.add(new Type("Jashn E Bahara", R.raw.jashn));
        al.add(new Type("Gulabi Aankhen(Sanam)", R.raw.gulabiaankhen));
        al.add(new Type("Dil Kya Kare", R.raw.dilkyakares));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TypeAdapter adapter = new TypeAdapter(this, al, R.color.peacock);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        assert listView != null;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if (position == 0) {
                    releaseMediaPlayer();
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jabharry);

                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }
                if (position == 1) {
                    releaseMediaPlayer();
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.ullu);

                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }
                if (position == 2) {
                    releaseMediaPlayer();
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jashn);

                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }
                if (position == 3) {
                    releaseMediaPlayer();
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.gulabiaankhen);

                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }
                if (position == 4) {
                    releaseMediaPlayer();
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.dilkyakares);

                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }


            }
        });
    }
}
