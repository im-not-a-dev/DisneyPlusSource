package com.bamtech.player.exo.p045m;

import android.app.Activity;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.C8802o0;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtech.player.exo.m.b */
/* compiled from: MediaSessionManager.kt */
public final class C1734b {

    /* renamed from: a */
    public MediaSessionCompat f6018a;

    /* renamed from: b */
    public C1733a f6019b;

    /* renamed from: c */
    private final Activity f6020c;

    /* renamed from: d */
    private final C8802o0 f6021d;

    public C1734b(Activity activity, C8802o0 o0Var) {
        this.f6020c = activity;
        this.f6021d = o0Var;
    }

    /* renamed from: a */
    public final MediaSessionCompat mo7748a() {
        return new MediaSessionCompat(this.f6020c, C1734b.class.getSimpleName());
    }

    /* renamed from: b */
    public final C1733a mo7749b() {
        MediaSessionCompat mediaSessionCompat = this.f6018a;
        if (mediaSessionCompat != null) {
            C1733a aVar = new C1733a(mediaSessionCompat, this.f6021d, null, 4, null);
            return aVar;
        }
        C12880j.m40227c("mediaSession");
        throw null;
    }

    /* renamed from: c */
    public final void mo7750c() {
        this.f6018a = mo7748a();
        MediaSessionCompat mediaSessionCompat = this.f6018a;
        String str = "mediaSession";
        if (mediaSessionCompat != null) {
            mediaSessionCompat.mo119a(true);
            Activity activity = this.f6020c;
            MediaSessionCompat mediaSessionCompat2 = this.f6018a;
            if (mediaSessionCompat2 != null) {
                MediaControllerCompat.m59a(activity, mediaSessionCompat2.mo113a());
                this.f6019b = mo7749b();
                return;
            }
            C12880j.m40227c(str);
            throw null;
        }
        C12880j.m40227c(str);
        throw null;
    }

    /* renamed from: d */
    public final void mo7751d() {
        mo7750c();
        C1733a aVar = this.f6019b;
        if (aVar != null) {
            aVar.mo7745a();
        } else {
            C12880j.m40227c("mediaSessionConnection");
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo7752e() {
        MediaSessionCompat mediaSessionCompat = this.f6018a;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.mo122c();
            C1733a aVar = this.f6019b;
            if (aVar != null) {
                aVar.mo7747b();
            } else {
                C12880j.m40227c("mediaSessionConnection");
                throw null;
            }
        } else {
            C12880j.m40227c("mediaSession");
            throw null;
        }
    }
}
