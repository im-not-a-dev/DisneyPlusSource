package com.bamtech.sdk4.media.adapters;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "", "onError", "", "errorMessage", "", "onException", "throwable", "", "onPause", "onPlay", "onPlayedToCompletion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackMetrics.kt */
public interface PlaybackEventListener {
    void onException(Throwable th);

    void onPause();

    void onPlay();

    void onPlayedToCompletion();
}
