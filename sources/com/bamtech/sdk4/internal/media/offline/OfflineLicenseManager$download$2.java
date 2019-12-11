package com.bamtech.sdk4.internal.media.offline;

import com.google.android.exoplayer2.drm.C8713o;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSession.C8694a;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "session", "Lcom/google/android/exoplayer2/drm/DrmSession;", "Lcom/google/android/exoplayer2/drm/FrameworkMediaCrypto;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: OfflineLicenseManager.kt */
final class OfflineLicenseManager$download$2 extends C12881k implements Function1<DrmSession<C8713o>, byte[]> {
    public static final OfflineLicenseManager$download$2 INSTANCE = new OfflineLicenseManager$download$2();

    OfflineLicenseManager$download$2() {
        super(1);
    }

    public final byte[] invoke(DrmSession<C8713o> drmSession) {
        if (drmSession.getError() != null) {
            C8694a error = drmSession.getError();
            if (error == null) {
                throw new C13142s("null cannot be cast to non-null type com.google.android.exoplayer2.drm.DrmSession.DrmSessionException");
            }
            throw error;
        }
        byte[] c = drmSession.mo22772c();
        if (c != null) {
            return c;
        }
        C12880j.m40220a();
        throw null;
    }
}
