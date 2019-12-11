package com.bamtech.sdk4.internal.media.offline;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.drm.C8708j;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\n"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/offline/OfflineLicenseManager$withDrmSession$eventListener$1", "Lcom/google/android/exoplayer2/drm/DefaultDrmSessionEventListener;", "onDrmKeysLoaded", "", "onDrmKeysRemoved", "onDrmKeysRestored", "onDrmSessionManagerError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineLicenseManager.kt */
public final class OfflineLicenseManager$withDrmSession$eventListener$1 implements DefaultDrmSessionEventListener {
    final /* synthetic */ ConditionVariable $conditionVariable;

    OfflineLicenseManager$withDrmSession$eventListener$1(ConditionVariable conditionVariable) {
        this.$conditionVariable = conditionVariable;
    }

    /* renamed from: b */
    public /* synthetic */ void mo9515b() {
        C8708j.m25255b(this);
    }

    /* renamed from: c */
    public /* synthetic */ void mo9516c() {
        C8708j.m25254a(this);
    }

    public void onDrmKeysLoaded() {
        this.$conditionVariable.open();
    }

    public void onDrmKeysRestored() {
        this.$conditionVariable.open();
    }

    public void onDrmSessionManagerError(Exception exc) {
        this.$conditionVariable.open();
    }
}
