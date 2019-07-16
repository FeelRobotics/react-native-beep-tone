package io.github.alexkorep;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.ToneGenerator;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNBeepToneModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private ToneGenerator beep = null;

    public RNBeepToneModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNBeepTone";
    }

    @ReactMethod
    public void start(int frequency, float volume) {
        beep = new ToneGenerator(AudioManager.STREAM_MUSIC,
                Math.round(volume/100*ToneGenerator.MAX_VOLUME));
        beep.startTone(ToneGenerator.TONE_DTMF_0, 1000*60*60);
    }

    @ReactMethod
    public void stop() {
        if (beep != null) {
            beep.stopTone();
            beep = null;
        }
    }
}
