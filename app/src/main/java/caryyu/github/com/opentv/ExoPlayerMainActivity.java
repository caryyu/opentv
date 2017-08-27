package caryyu.github.com.opentv;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

//import com.google.android.exoplayer2.ExoPlayer;
//import com.google.android.exoplayer2.ExoPlayerFactory;
//import com.google.android.exoplayer2.SimpleExoPlayer;
//import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
//import com.google.android.exoplayer2.extractor.ExtractorsFactory;
//import com.google.android.exoplayer2.source.ExtractorMediaSource;
//import com.google.android.exoplayer2.source.MediaSource;
//import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
//import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
//import com.google.android.exoplayer2.trackselection.TrackSelection;
//import com.google.android.exoplayer2.trackselection.TrackSelector;
//import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
//import com.google.android.exoplayer2.upstream.BandwidthMeter;
//import com.google.android.exoplayer2.upstream.DataSource;
//import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
//import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
//import com.google.android.exoplayer2.util.Util;

public class ExoPlayerMainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exoplayermain);
//
//        Handler mainHandler = new Handler();
//        BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
//        TrackSelection.Factory videoTrackSelectionFactory =
//                new AdaptiveTrackSelection.Factory(bandwidthMeter);
//        TrackSelector trackSelector =
//                new DefaultTrackSelector(videoTrackSelectionFactory);
//
//        SimpleExoPlayer player =
//                ExoPlayerFactory.newSimpleInstance(getApplicationContext(), trackSelector);
//
//        SimpleExoPlayerView simpleExoPlayerView = (SimpleExoPlayerView) findViewById(R.id.simpleExoPlayerView);
//
//        preparingPlayer(player,getApplicationContext());
//
//        simpleExoPlayerView.setPlayer(player);
    }

//    private void preparingPlayer(ExoPlayer player, Context context){
//        player.setPlayWhenReady(true);
//        Uri mp4VideoUri = Uri.parse("http://nakedhubappdev.oss-cn-shanghai.aliyuncs.com//1495769007852-253.mp4");
//
//        // Measures bandwidth during playback. Can be null if not required.
//        DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
//        // Produces DataSource instances through which media data is loaded.
//        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(context,
//                Util.getUserAgent(context, "yourApplicationName"), bandwidthMeter);
//        // Produces Extractor instances for parsing the media data.
//        ExtractorsFactory extractorsFactory = new DefaultExtractorsFactory();
//        // This is the MediaSource representing the media to be played.
//        MediaSource videoSource = new ExtractorMediaSource(mp4VideoUri,
//                dataSourceFactory, extractorsFactory, null, null);
//        // Prepare the player with the source.
//        player.prepare(videoSource);
//    }
}
