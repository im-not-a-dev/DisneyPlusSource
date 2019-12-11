package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;

public interface ExoPlayer extends Player {
    void prepare(MediaSource mediaSource);
}
