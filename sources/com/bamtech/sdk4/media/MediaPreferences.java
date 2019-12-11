package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaPreferences;", "", "preferredMediaQuality", "Lcom/bamtech/sdk4/media/MediaQuality;", "preferredAudioQuality", "Lcom/bamtech/sdk4/media/AudioQuality;", "(Lcom/bamtech/sdk4/media/MediaQuality;Lcom/bamtech/sdk4/media/AudioQuality;)V", "getPreferredAudioQuality", "()Lcom/bamtech/sdk4/media/AudioQuality;", "getPreferredMediaQuality", "()Lcom/bamtech/sdk4/media/MediaQuality;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaPreferences.kt */
public final class MediaPreferences {
    private final AudioQuality preferredAudioQuality;
    private final MediaQuality preferredMediaQuality;

    public MediaPreferences(MediaQuality mediaQuality, AudioQuality audioQuality) {
        this.preferredMediaQuality = mediaQuality;
        this.preferredAudioQuality = audioQuality;
    }

    public static /* synthetic */ MediaPreferences copy$default(MediaPreferences mediaPreferences, MediaQuality mediaQuality, AudioQuality audioQuality, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaQuality = mediaPreferences.preferredMediaQuality;
        }
        if ((i & 2) != 0) {
            audioQuality = mediaPreferences.preferredAudioQuality;
        }
        return mediaPreferences.copy(mediaQuality, audioQuality);
    }

    public final MediaQuality component1() {
        return this.preferredMediaQuality;
    }

    public final AudioQuality component2() {
        return this.preferredAudioQuality;
    }

    public final MediaPreferences copy(MediaQuality mediaQuality, AudioQuality audioQuality) {
        return new MediaPreferences(mediaQuality, audioQuality);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.preferredAudioQuality, (java.lang.Object) r3.preferredAudioQuality) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.MediaPreferences
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.media.MediaPreferences r3 = (com.bamtech.sdk4.media.MediaPreferences) r3
            com.bamtech.sdk4.media.MediaQuality r0 = r2.preferredMediaQuality
            com.bamtech.sdk4.media.MediaQuality r1 = r3.preferredMediaQuality
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.media.AudioQuality r0 = r2.preferredAudioQuality
            com.bamtech.sdk4.media.AudioQuality r3 = r3.preferredAudioQuality
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.MediaPreferences.equals(java.lang.Object):boolean");
    }

    public final AudioQuality getPreferredAudioQuality() {
        return this.preferredAudioQuality;
    }

    public final MediaQuality getPreferredMediaQuality() {
        return this.preferredMediaQuality;
    }

    public int hashCode() {
        MediaQuality mediaQuality = this.preferredMediaQuality;
        int i = 0;
        int hashCode = (mediaQuality != null ? mediaQuality.hashCode() : 0) * 31;
        AudioQuality audioQuality = this.preferredAudioQuality;
        if (audioQuality != null) {
            i = audioQuality.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPreferences(preferredMediaQuality=");
        sb.append(this.preferredMediaQuality);
        sb.append(", preferredAudioQuality=");
        sb.append(this.preferredAudioQuality);
        sb.append(")");
        return sb.toString();
    }
}
