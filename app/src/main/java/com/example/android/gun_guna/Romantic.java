package com.example.android.gun_guna;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;


//private double startTime = 0;
//private double finalTime = 0;

//private Handler myHandler = new Handler();;
//private int forwardTime = 5000;
//private int backwardTime = 5000;
//private SeekBar seekbar;
//private TextView tx1,tx2,tx3;

//public static int oneTimeOnly = 0;


public class Romantic extends AppCompatActivity
{
    MediaPlayer mMediaPlayer;
    AudioManager mAudioManager;



    @Override
    public void onStop() {
        super.onStop();

        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
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

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type);



        final ArrayList<Type> al = new ArrayList<Type>();
        al.add(new Type("Dil Kya Kare", R.raw.dilkyakares));
        al.add(new Type("Teri khair mangdi", R.raw.terikhairmangdi));
        al.add(new Type("Dhun Lagi(Love Ni Bhavai)", R.raw.dhunlaagi));

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TypeAdapter adapter = new TypeAdapter(this, al, R.color.lightpink);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        assert listView != null;
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                //specify the button that has to handle visibility
                final RelativeLayout properties = (RelativeLayout) findViewById(R.id.text_container);

//And the layout we want to change is visibility
                final RelativeLayout propLayout = (RelativeLayout) findViewById(R.id.child);
                final ImageView play = (ImageView) findViewById(R.id.play);
                final ImageView pause = (ImageView) findViewById(R.id.pause);
                final ImageView remove = (ImageView) findViewById(R.id.remove);
                final MediaPlayer[] mp = new MediaPlayer[3];

                if (properties != null)
                {
                    if (propLayout != null) {
                        if (propLayout.getVisibility() != View.VISIBLE) {
                            propLayout.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            propLayout.setVisibility(View.GONE);
                        }
                    }
                }




                if (position == 0)
                {



                    if (play != null && play.getVisibility() == View.VISIBLE) {

                        play.setOnClickListener(
                                new View.OnClickListener() {
                                    public void onClick(View v) {
                                        releaseMediaPlayer();
                                        mp[0] = MediaPlayer.create(getApplicationContext(), R.raw.dilkyakares);

                                        mp[0].start();
                                        Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();


                                                if (play.getVisibility() == View.VISIBLE) {
                                                    play.setVisibility(View.GONE);

                                                    if (pause != null) {
                                                        pause.setVisibility(View.VISIBLE);
                                                    }

                                                } else {
                                                    if (pause != null) {
                                                        pause.setVisibility(View.GONE);
                                                    }
                                                    play.setVisibility(View.VISIBLE);
                                                }
                                            }


                                        }
                        );
                    }

                    if (remove != null) {
                        remove.setOnClickListener(
                                new View.OnClickListener() {
                                    public void onClick(View v) {
                                        releaseMediaPlayer();
                                        if (propLayout != null) {
                                            if (propLayout.getVisibility() == View.VISIBLE) {
                                                propLayout.setVisibility(View.GONE);
                                            }
                                        }

                                    }
                                }
                        );
                    }

                    assert pause != null;
                    if (pause.getVisibility() == View.VISIBLE) {

                        pause.setOnClickListener(
                                new View.OnClickListener() {
                                    public void onClick(View v) {


                                        mp[0].pause();
                                        Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();

                                        if (pause.getVisibility() == View.VISIBLE) {
                                            pause.setVisibility(View.GONE);

                                            if (play != null) {
                                                play.setVisibility(View.VISIBLE);
                                            }

                                        } else {
                                            if (play != null) {
                                                pause.setVisibility(View.VISIBLE);
                                                play.setVisibility(View.GONE);
                                            }

                                        }
                                    }
                                }
                        );
                    }
                }



                if (position == 1) {


                    if (play != null && play.getVisibility() == View.VISIBLE) {

                        play.setOnClickListener(
                                new View.OnClickListener()
                                {
                                    public void onClick(View v) {
                                        releaseMediaPlayer();
                                        mp[1] = MediaPlayer.create(getApplicationContext(), R.raw.terikhairmangdi);

                                        mp[1].start();
                                        Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();




                                                if (play.getVisibility() == View.VISIBLE) {
                                                    play.setVisibility(View.GONE);

                                                    if (pause != null) {
                                                        pause.setVisibility(View.VISIBLE);
                                                    }

                                                } else {
                                                    if (pause != null) {
                                                        pause.setVisibility(View.GONE);
                                                    }
                                                    play.setVisibility(View.VISIBLE);
                                                }
                                            }


                                    }


                        );
                    }

                    if (remove != null) {
                        remove.setOnClickListener(
                                new View.OnClickListener() {
                                    public void onClick(View v) {
                                        releaseMediaPlayer();
                                        if (propLayout != null) {
                                            if (propLayout.getVisibility() == View.VISIBLE) {
                                                propLayout.setVisibility(View.GONE);
                                            }
                                        }

                                    }
                                }
                        );
                    }

                    assert pause != null;
                    if ( pause.getVisibility() == View.VISIBLE) {

                        pause.setOnClickListener(
                                new View.OnClickListener()
                                {
                                    public void onClick(View v)
                                    {


                                        mp[1].pause();
                                        Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();

                                          if (pause.getVisibility() == View.VISIBLE)
                                                {
                                                    pause.setVisibility(View.GONE);

                                                    if (play != null)
                                                    {
                                                        play.setVisibility(View.VISIBLE);
                                                    }

                                                }
                                                else
                                                {
                                                    if (play != null)
                                                    {
                                                        pause.setVisibility(View.VISIBLE);
                                                        play.setVisibility(View.GONE);
                                                    }

                                                }
                                            }



                                }

                        );
                    }


                }




                if (position == 2)
                {


                    if (play != null && play.getVisibility() == View.VISIBLE) {

                        play.setOnClickListener(
                                new View.OnClickListener() {
                                    public void onClick(View v) {
                                        releaseMediaPlayer();
                                        mp[2] = MediaPlayer.create(getApplicationContext(), R.raw.dhunlaagi);

                                        mp[2].start();
                                        Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();




                                                                if (play.getVisibility() == View.VISIBLE) {
                                                                    play.setVisibility(View.INVISIBLE);

                                                                    if (pause != null) {
                                                                        pause.setVisibility(View.VISIBLE);
                                                                    }

                                                                } else {
                                                                    if (pause != null) {
                                                                        pause.setVisibility(View.INVISIBLE);
                                                                    }
                                                                    play.setVisibility(View.VISIBLE);
                                                                }
                                                            }
                                                        }
                                                );
                                    }
                    if (remove != null) {
                        remove.setOnClickListener(
                                new View.OnClickListener() {
                                    public void onClick(View v) {
                                        releaseMediaPlayer();
                                        if (propLayout != null) {
                                            if (propLayout.getVisibility() == View.VISIBLE) {
                                                propLayout.setVisibility(View.GONE);
                                            }
                                        }

                                    }
                                }
                        );
                    }

                    assert pause != null;
                    if ( pause.getVisibility() == View.VISIBLE)
                    {

                        pause.setOnClickListener(
                                new View.OnClickListener() {
                                    public void onClick(View v) {


                                        mp[2].pause();
                                        Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();





                                                                if (pause.getVisibility() == View.VISIBLE)
                                                                {
                                                                    pause.setVisibility(View.INVISIBLE);

                                                                    if (play != null)
                                                                    {
                                                                        play.setVisibility(View.VISIBLE);
                                                                    }

                                                                }
                                                                else
                                                                {
                                                                    if (play != null) {
                                                                        pause.setVisibility(View.VISIBLE);
                                                                        play.setVisibility(View.INVISIBLE);
                                                                    }

                                                                }
                                                            }
                                    }


                        );
                    }


                }


            }
        });

    }


}

