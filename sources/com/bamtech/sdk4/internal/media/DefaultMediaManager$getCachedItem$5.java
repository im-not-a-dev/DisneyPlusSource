package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/media/MediaItem;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getCachedItem$5<T> implements Consumer<MediaItem> {
    final /* synthetic */ MediaDescriptor $mediaDescriptor;
    final /* synthetic */ PlaybackContext $playbackContext;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getCachedItem$5(DefaultMediaManager defaultMediaManager, PlaybackContext playbackContext, MediaDescriptor mediaDescriptor) {
        this.this$0 = defaultMediaManager;
        this.$playbackContext = playbackContext;
        this.$mediaDescriptor = mediaDescriptor;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(com.bamtech.sdk4.media.MediaItem r13) {
        /*
            r12 = this;
            com.bamtech.sdk4.media.PlaybackContext r0 = r12.$playbackContext
            if (r0 == 0) goto L_0x005b
            java.lang.String r2 = r0.getPlaybackSessionId()
            if (r2 == 0) goto L_0x005b
            r7 = 0
            r0 = 0
            if (r13 == 0) goto L_0x001d
            com.bamtech.sdk4.media.MediaAnalyticsKey r1 = com.bamtech.sdk4.media.MediaAnalyticsKey.CONVIVA
            java.util.Map r1 = r13.getTrackingData(r1)
            if (r1 == 0) goto L_0x001d
            java.lang.String r3 = "fguid"
            java.lang.Object r1 = r1.get(r3)
            goto L_0x001e
        L_0x001d:
            r1 = r0
        L_0x001e:
            boolean r3 = r1 instanceof java.lang.String
            if (r3 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            if (r13 == 0) goto L_0x0053
            com.bamtech.sdk4.internal.media.offline.OfflineMediaItem r13 = (com.bamtech.sdk4.internal.media.offline.OfflineMediaItem) r13
            java.util.List r8 = r13.getPlaylistVariants()
            com.bamtech.sdk4.internal.media.DefaultMediaManager r13 = r12.this$0
            com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener r13 = r13.defaultQosPlaybackEventListener
            com.bamtech.sdk4.media.MediaPayloadFetchedEventData r0 = new com.bamtech.sdk4.media.MediaPayloadFetchedEventData
            r3 = 1
            com.bamtech.sdk4.media.MediaDescriptor r1 = r12.$mediaDescriptor
            java.lang.String r4 = r1.getPlaybackUrl()
            com.bamtech.sdk4.media.MediaDescriptor r1 = r12.$mediaDescriptor
            java.lang.String r5 = r1.getBasePlaybackScenario()
            r1 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r10 = 0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.onEvent(r0)
            goto L_0x005b
        L_0x0053:
            kotlin.s r13 = new kotlin.s
            java.lang.String r0 = "null cannot be cast to non-null type com.bamtech.sdk4.internal.media.offline.OfflineMediaItem"
            r13.<init>(r0)
            throw r13
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.DefaultMediaManager$getCachedItem$5.accept(com.bamtech.sdk4.media.MediaItem):void");
    }
}
