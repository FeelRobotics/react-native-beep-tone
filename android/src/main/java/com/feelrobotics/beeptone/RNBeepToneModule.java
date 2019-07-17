package com.feelrobotics.beeptone;

import android.media.AudioManager;
import android.media.ToneGenerator;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNBeepToneModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private ToneGenerator beep = null;
    private static final String TAG = "RNBeepToneModule";


    public RNBeepToneModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNBeepTone";
    }

    @ReactMethod
    public void start(float volume) {
        stop();
        final int vol = (int)Math.round(volume/100.0*ToneGenerator.MAX_VOLUME);
        beep = new ToneGenerator(AudioManager.STREAM_MUSIC, vol);
        beep.startTone(ToneGenerator.TONE_DTMF_A);
    }

    @ReactMethod
    public void stop() {
        if (beep != null) {
            beep.stopTone();
            beep = null;
        }
    }
}
