package com.example.primerapiyoutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.List;

public class MainActivity extends YouTubeBaseActivity   implements YouTubePlayer.OnInitializedListener,YouTubePlayer, YouTubePlayer.PlaylistEventListener {
YouTubePlayerView youTubePlayerView;
String claveYoutube="AIzaSyBcws43GM3ffU7hvoGmamCs5_TXR8Zd5sk";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(claveYoutube,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
    if (!b){
        youTubePlayer.cueVideo("azxDhcKYku4");
    }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
    if (youTubeInitializationResult.isUserRecoverableError()){
        youTubeInitializationResult.getErrorDialog(this,1).show();
    }else{
        String error="error al inicializar youtube"+youTubeInitializationResult.toString();
        Toast.makeText(getApplication(),error,Toast.LENGTH_LONG).show();
    }
    }
    protected void  onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode==1){
            getYoutubePlayerProvider().initialize(claveYoutube,this);
        }
    }
    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return youTubePlayerView;
    }

    @Override
    public void release() {

    }

    @Override
    public void cueVideo(String s) {

    }

    @Override
    public void cueVideo(String s, int i) {

    }

    @Override
    public void loadVideo(String s) {

    }

    @Override
    public void loadVideo(String s, int i) {

    }

    @Override
    public void cuePlaylist(String s) {

    }

    @Override
    public void cuePlaylist(String s, int i, int i1) {

    }

    @Override
    public void loadPlaylist(String s) {

    }

    @Override
    public void loadPlaylist(String s, int i, int i1) {

    }

    @Override
    public void cueVideos(List<String> list) {

    }

    @Override
    public void cueVideos(List<String> list, int i, int i1) {

    }

    @Override
    public void loadVideos(List<String> list) {

    }

    @Override
    public void loadVideos(List<String> list, int i, int i1) {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public void next() {

    }

    @Override
    public void previous() {

    }

    @Override
    public int getCurrentTimeMillis() {
        return 0;
    }

    @Override
    public int getDurationMillis() {
        return 0;
    }

    @Override
    public void seekToMillis(int i) {

    }

    @Override
    public void seekRelativeMillis(int i) {

    }

    @Override
    public void setFullscreen(boolean b) {

    }

    @Override
    public void setOnFullscreenListener(OnFullscreenListener onFullscreenListener) {

    }

    @Override
    public void setFullscreenControlFlags(int i) {

    }

    @Override
    public int getFullscreenControlFlags() {
        return 0;
    }

    @Override
    public void addFullscreenControlFlag(int i) {

    }

    @Override
    public void setPlayerStyle(PlayerStyle playerStyle) {

    }

    @Override
    public void setShowFullscreenButton(boolean b) {

    }

    @Override
    public void setManageAudioFocus(boolean b) {

    }

    @Override
    public void setPlaylistEventListener(PlaylistEventListener playlistEventListener) {

    }

    @Override
    public void setPlayerStateChangeListener(PlayerStateChangeListener playerStateChangeListener) {

    }

    @Override
    public void setPlaybackEventListener(PlaybackEventListener playbackEventListener) {

    }

    @Override
    public void onPrevious() {

    }

    @Override
    public void onNext() {

    }

    @Override
    public void onPlaylistEnded() {

    }
}
