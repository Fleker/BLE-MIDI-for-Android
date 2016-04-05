package jp.kshoji.blemidi.sample.util;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * Created by guest1 on 4/4/2016.
 */
public class MidiEventHandler extends Handler {
    private static final String TAG = "MidiEvent";
    private String name;
    @Override
    public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
        Log.d(TAG+"/"+name, msg.obj.toString());
        return super.sendMessageAtTime(msg, uptimeMillis);
    }

    public MidiEventHandler(String name, Callback callback) {
        super(callback);
        this.name = name;
    }
}
