package com.bamtech.player.exo.p041i;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.ExoPlaybackException;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p180b0.C4918u2;
import p163g.p174d.p178b.p191i0.p192a.C5281a.C5283b;
import p163g.p174d.p178b.p193j0.C5290d;
import p163g.p174d.p178b.p193j0.C5293f;
import p163g.p174d.p178b.p196m0.C5305c;
import p163g.p426g.p427a.p428i.C10819a;
import p163g.p426g.p427a.p428i.C10821c.C10826e;
import p686n.p687a.Timber;

/* renamed from: com.bamtech.player.exo.i.d */
/* compiled from: ConvivaBindings */
public class C1713d extends C4918u2 {

    /* renamed from: a */
    private final C1716f f5971a;

    /* renamed from: b */
    private float f5972b;

    public C1713d(Context context, C5326w wVar, C1714e eVar) {
        this.f5971a = new C1716f(eVar, eVar.mo7683h());
        this.f5971a.mo7687a(context);
        this.f5971a.mo7691a((C10819a) new C1712c(wVar));
    }

    /* renamed from: d */
    private void m7938d(Uri uri) {
        this.f5971a.mo7693a(uri.toString());
    }

    /* renamed from: a */
    public void mo7661a(C5305c cVar) {
        super.mo7661a(cVar);
        this.f5971a.mo7690a(cVar.mo17084b());
    }

    /* renamed from: b */
    public void mo7663b() {
        try {
            this.f5971a.mo7692a(C10826e.STOPPED);
            this.f5971a.mo7696c();
        } catch (Exception e) {
            Timber.m44523a((Throwable) e);
        }
    }

    /* renamed from: c */
    public void mo7664c(Uri uri) {
        m7938d(uri);
    }

    /* renamed from: e */
    public void mo7666e(C5283b bVar) {
        C5290d dVar = bVar.f12650a;
        if (dVar instanceof C5293f) {
            C5293f fVar = (C5293f) dVar;
            if (((float) fVar.mo16886g()) != this.f5972b) {
                mo7667j(fVar.mo16886g());
                this.f5972b = (float) fVar.mo16886g();
            }
        }
    }

    /* renamed from: j */
    public void mo7667j(int i) {
        this.f5971a.mo7689a(i / 1000);
    }

    /* renamed from: k */
    public void mo7668k(boolean z) {
        if (z) {
            this.f5971a.mo7692a(C10826e.PLAYING);
        } else {
            this.f5971a.mo7692a(C10826e.PAUSED);
        }
    }

    /* renamed from: q */
    public void mo7669q() {
        super.mo7669q();
        this.f5971a.mo7695b();
    }

    /* renamed from: t */
    public void mo7670t() {
        super.mo7670t();
        this.f5971a.mo7688a();
    }

    /* renamed from: x */
    public void mo7671x() {
        try {
            this.f5971a.mo7696c();
        } catch (Exception e) {
            Timber.m44523a((Throwable) e);
        }
    }

    /* renamed from: c */
    public void mo7665c(boolean z) {
        this.f5971a.mo7692a(C10826e.BUFFERING);
    }

    /* renamed from: a */
    public void mo7662a(Throwable th) {
        String str = "Could not find error message";
        try {
            if (th instanceof ExoPlaybackException) {
                ExoPlaybackException exoPlaybackException = (ExoPlaybackException) th;
                int i = ((ExoPlaybackException) th).f18341c;
                if (i == 0) {
                    str = exoPlaybackException.mo22595b().getMessage();
                } else if (i == 1) {
                    str = exoPlaybackException.mo22594a().getMessage();
                } else if (i == 2) {
                    str = exoPlaybackException.mo22596c().getMessage();
                }
            } else {
                String str2 = "";
                if (th.getStackTrace().length > 0) {
                    StackTraceElement stackTraceElement = th.getStackTrace()[0];
                    StringBuilder sb = new StringBuilder();
                    sb.append(stackTraceElement.getClassName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    str2 = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(th.getMessage());
                sb2.append(" | ");
                sb2.append(str2);
                str = sb2.toString();
            }
            this.f5971a.mo7694a(str, true);
            this.f5971a.mo7696c();
        } catch (Exception e) {
            Timber.m44523a((Throwable) e);
        }
    }
}
