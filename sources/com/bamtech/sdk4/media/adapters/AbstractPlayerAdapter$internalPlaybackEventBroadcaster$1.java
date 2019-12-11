package com.bamtech.sdk4.media.adapters;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo31007d2 = {"com/bamtech/sdk4/media/adapters/AbstractPlayerAdapter$internalPlaybackEventBroadcaster$1", "Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "onError", "", "errorMessage", "", "onException", "throwable", "", "onPause", "onPlay", "onPlayedToCompletion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AbstractPlayerAdapter.kt */
public final class AbstractPlayerAdapter$internalPlaybackEventBroadcaster$1 implements PlaybackEventListener {
    final /* synthetic */ AbstractPlayerAdapter this$0;

    AbstractPlayerAdapter$internalPlaybackEventBroadcaster$1(AbstractPlayerAdapter abstractPlayerAdapter) {
        this.this$0 = abstractPlayerAdapter;
    }

    public void onException(Throwable th) {
        for (PlaybackEventListener onException : this.this$0.listeners) {
            onException.onException(th);
        }
    }

    public void onPause() {
        for (PlaybackEventListener onPause : this.this$0.listeners) {
            onPause.onPause();
        }
    }

    public void onPlay() {
        for (PlaybackEventListener onPlay : this.this$0.listeners) {
            onPlay.onPlay();
        }
    }

    public void onPlayedToCompletion() {
        for (PlaybackEventListener onPlayedToCompletion : this.this$0.listeners) {
            onPlayedToCompletion.onPlayedToCompletion();
        }
    }
}
