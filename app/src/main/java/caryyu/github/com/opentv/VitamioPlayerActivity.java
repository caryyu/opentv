package caryyu.github.com.opentv;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import io.vov.vitamio.LibsChecker;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

/**
 * Created by cary on 8/27/17.
 */

public class VitamioPlayerActivity extends Activity {
    private VideoView videoView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!LibsChecker.checkVitamioLibs(this)) {
            return;
        }

        setContentView(R.layout.activity_vitamio);

        button = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.edittext1);
        videoView = (VideoView) findViewById(R.id.videoView);
//        videoView.setBufferSize(1024 * 1024);
        videoView.setHardwareDecoder(true);
        videoView.setVideoQuality(MediaPlayer.VIDEOQUALITY_HIGH);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideSoftKeyboard();

                String videoPath = editText.getText().toString();
                if(!TextUtils.isEmpty(videoPath)){
                    MediaController mediaController = new MediaController(getActivity());

                    videoView.setVideoPath(videoPath);
                    videoView.setMediaController(mediaController);
                    videoView.requestFocus();

                    videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            System.out.println("MediaPlayer is " + mediaPlayer);
                            mediaPlayer.setPlaybackSpeed(1.0f);
                        }
                    });
                }
            }
        });

        editText.requestFocus();
    }

    private Activity getActivity(){
        return this;
    }

    private void hideSoftKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }
}