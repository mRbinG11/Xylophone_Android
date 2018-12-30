package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds
        mCSoundId=mSoundPool.load(getApplicationContext(),R.raw.note_c,1);
        mASoundId=mSoundPool.load(getApplicationContext(),R.raw.note_a,1);
        mBSoundId=mSoundPool.load(getApplicationContext(),R.raw.note_b,1);
        mGSoundId=mSoundPool.load(getApplicationContext(),R.raw.note_g,1);
        mFSoundId=mSoundPool.load(getApplicationContext(),R.raw.note_f,1);
        mESoundId=mSoundPool.load(getApplicationContext(),R.raw.note_e,1);
        mDSoundId=mSoundPool.load(getApplicationContext(),R.raw.note_d,1);


    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View V){

    }

    public void playD(View V){

    }

    public void playE(View V){

    }

    public void playF(View V){

    }

    public void playG(View V){

    }

    public void playA(View V){

    }

    public void playB(View V){

    }

    public
}
