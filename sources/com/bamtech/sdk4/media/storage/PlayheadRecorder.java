package com.bamtech.sdk4.media.storage;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Flowable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/storage/PlayheadRecorder;", "", "recordPlayheadAndBookmark", "Lio/reactivex/Flowable;", "", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "contentId", "playhead", "", "occurredOn", "playbackUrl", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlayheadRecorder.kt */
public interface PlayheadRecorder {
    Flowable<String> recordPlayheadAndBookmark(ServiceTransaction serviceTransaction, String str, long j, long j2, String str2);
}
