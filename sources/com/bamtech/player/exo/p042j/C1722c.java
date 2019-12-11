package com.bamtech.player.exo.p042j;

import android.net.Uri;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p185g0.C5271z3;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/player/exo/delegates/PerformanceMonitoringDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "player", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "getEvents", "()Lcom/bamtech/player/PlayerEvents;", "getPlayer", "()Lcom/bamtech/player/VideoPlayer;", "previousDroppedDecodeBuffers", "", "getPreviousDroppedDecodeBuffers", "()I", "setPreviousDroppedDecodeBuffers", "(I)V", "onNewMedia", "", "uri", "Landroid/net/Uri;", "onTimeChanged", "time", "", "bamplayer-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.player.exo.j.c */
/* compiled from: PerformanceMonitoringDelegate.kt */
public final class C1722c implements C5271z3 {

    /* renamed from: U */
    private final C5326w f6000U;

    /* renamed from: V */
    private final C5300m f6001V;

    /* renamed from: c */
    private int f6002c;

    /* renamed from: com.bamtech.player.exo.j.c$a */
    /* compiled from: PerformanceMonitoringDelegate.kt */
    static final /* synthetic */ class C1723a extends C12879i implements Function1<Long, C13145v> {
        C1723a(C1722c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final void mo7709a(long j) {
            ((C1722c) this.receiver).mo7707a(j);
        }

        public final String getName() {
            return "onTimeChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C1722c.class);
        }

        public final String getSignature() {
            return "onTimeChanged(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7709a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtech.player.exo.j.c$b */
    /* compiled from: PerformanceMonitoringDelegate.kt */
    static final /* synthetic */ class C1724b extends C12879i implements Function1<Uri, C13145v> {
        C1724b(C1722c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final void mo7710a(Uri uri) {
            ((C1722c) this.receiver).mo7708a(uri);
        }

        public final String getName() {
            return "onNewMedia";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C1722c.class);
        }

        public final String getSignature() {
            return "onNewMedia(Landroid/net/Uri;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7710a((Uri) obj);
            return C13145v.f29587a;
        }
    }

    public C1722c(C5326w wVar, C5300m mVar) {
        this.f6000U = wVar;
        this.f6001V = mVar;
        this.f6001V.mo16938C0().mo30192f((Consumer<? super T>) new C1725d<Object>(new C1723a(this)));
        this.f6001V.mo16973U().mo30192f((Consumer<? super T>) new C1725d<Object>(new C1724b(this)));
    }

    /* renamed from: a */
    public final void mo7708a(Uri uri) {
        this.f6002c = 0;
    }

    /* renamed from: a */
    public final void mo7707a(long j) {
        int e = this.f6000U.mo7621e();
        if (e > this.f6002c) {
            this.f6002c = e;
            this.f6001V.mo16984a(e);
        }
    }
}
