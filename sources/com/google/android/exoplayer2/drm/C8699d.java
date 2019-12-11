package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import android.media.MediaDrm.OnEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm.C8695a;

/* renamed from: com.google.android.exoplayer2.drm.d */
/* compiled from: lambda */
public final /* synthetic */ class C8699d implements OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ FrameworkMediaDrm f18478a;

    /* renamed from: b */
    private final /* synthetic */ C8695a f18479b;

    public /* synthetic */ C8699d(FrameworkMediaDrm frameworkMediaDrm, C8695a aVar) {
        this.f18478a = frameworkMediaDrm;
        this.f18479b = aVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f18478a.mo22791a(this.f18479b, mediaDrm, bArr, i, i2, bArr2);
    }
}
