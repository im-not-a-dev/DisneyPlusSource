package com.bamtech.sdk4.media.storage;

import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.Playhead;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.media.storage.DefaultPlayheadRecorder$recordPlayheadAndBookmark$playheadMaybe$2 */
/* compiled from: PlayheadRecorder.kt */
final class C2103x2a49a5d5<T> implements Consumer<String> {
    final /* synthetic */ String $contentId;
    final /* synthetic */ long $occurredOn;
    final /* synthetic */ long $playhead;
    final /* synthetic */ ServiceTransaction $serviceTransaction;
    final /* synthetic */ DefaultPlayheadRecorder this$0;

    C2103x2a49a5d5(DefaultPlayheadRecorder defaultPlayheadRecorder, ServiceTransaction serviceTransaction, String str, long j, long j2) {
        this.this$0 = defaultPlayheadRecorder;
        this.$serviceTransaction = serviceTransaction;
        this.$contentId = str;
        this.$playhead = j;
        this.$occurredOn = j2;
    }

    public final void accept(String str) {
        LocalPlayheadStore localPlayheadStore = this.this$0.getLocalPlayheadStore();
        ServiceTransaction serviceTransaction = this.$serviceTransaction;
        String str2 = this.$contentId;
        long j = this.$playhead;
        long j2 = this.$occurredOn;
        C12880j.m40222a((Object) str, "it");
        Playhead playhead = new Playhead(str2, j, j2, str);
        localPlayheadStore.importPlayhead(serviceTransaction, playhead);
    }
}
