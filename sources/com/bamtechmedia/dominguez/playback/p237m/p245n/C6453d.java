package com.bamtechmedia.dominguez.playback.p237m.p245n;

import android.media.MediaCodec.CryptoException;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.ServiceExceptionCase.UnexpectedError;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.playback.C6330i;
import com.google.android.exoplayer2.drm.C8716r;
import java.util.Map;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p686n.p687a.C14100a;

/* renamed from: com.bamtechmedia.dominguez.playback.m.n.d */
/* compiled from: PlaybackErrorMapper.kt */
public final class C6453d {

    /* renamed from: a */
    private final C7614e f14640a;

    /* renamed from: b */
    private final C3572r0 f14641b;

    public C6453d(C7614e eVar, C3572r0 r0Var) {
        this.f14640a = eVar;
        this.f14641b = r0Var;
    }

    /* renamed from: b */
    private final C6447a m20140b(Throwable th) {
        C14100a.m44528b(th, "drm exception during playback", new Object[0]);
        return new C6447a(C3573a.m12037b(this.f14641b, "ns_sdk-errors_drmerror", null, 2, null), null, C3573a.m12035a(this.f14641b, C6330i.btn_ok, (Map) null, 2, (Object) null), th);
    }

    /* renamed from: a */
    public final C6447a mo19107a(Throwable th) {
        if (th instanceof ServiceException) {
            return m20139a((ServiceException) th);
        }
        if (th instanceof C8716r) {
            return m20140b(th);
        }
        if (th instanceof CryptoException) {
            return m20140b(th);
        }
        if (th.getCause() instanceof CryptoException) {
            return m20140b(th);
        }
        return new C6447a(C3573a.m12035a(this.f14641b, C6330i.video_error_title, (Map) null, 2, (Object) null), C3573a.m12037b(this.f14641b, "ns_sdk-errors_unexpectederror", null, 2, null), C3573a.m12035a(this.f14641b, C6330i.btn_ok, (Map) null, 2, (Object) null), th);
    }

    /* renamed from: a */
    private final C6447a m20139a(ServiceException serviceException) {
        C14100a.m44528b(serviceException, "service exception during playback", new Object[0]);
        String a = C3573a.m12035a(this.f14641b, C6330i.video_error_title, (Map) null, 2, (Object) null);
        C7619i b = this.f14640a.mo20538b(serviceException);
        if (C12880j.m40224a((Object) b.mo20545c(), (Object) UnexpectedError.INSTANCE)) {
            b = null;
        }
        String d = b != null ? b.mo20546d() : null;
        String a2 = C3573a.m12035a(this.f14641b, C6330i.btn_ok, (Map) null, 2, (Object) null);
        if (d == null) {
            d = C3573a.m12035a(this.f14641b, C6330i.error_genericplaybackfailure, (Map) null, 2, (Object) null);
        }
        return new C6447a(a, d, a2, serviceException);
    }
}
