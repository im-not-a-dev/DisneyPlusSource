package com.bamtech.player.exo.p042j;

import com.bamtech.player.exo.p045m.C1734b;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5302b;
import p163g.p174d.p178b.p185g0.C5271z3;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/player/exo/delegates/ExoMediaSessionDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "mediaSessionManager", "Lcom/bamtech/player/exo/media/MediaSessionManager;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/bamtech/player/exo/media/MediaSessionManager;Lcom/bamtech/player/PlayerEvents;)V", "onDispose", "", "onLifecycleStart", "onLifecycleStop", "bamplayer-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.player.exo.j.a */
/* compiled from: ExoMediaSessionDelegate.kt */
public final class C1717a implements C5271z3 {

    /* renamed from: c */
    private C1734b f5996c;

    /* renamed from: com.bamtech.player.exo.j.a$a */
    /* compiled from: ExoMediaSessionDelegate.kt */
    static final class C1718a<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ C1717a f5997c;

        C1718a(C1717a aVar) {
            this.f5997c = aVar;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f5997c.mo7699b();
        }
    }

    /* renamed from: com.bamtech.player.exo.j.a$b */
    /* compiled from: ExoMediaSessionDelegate.kt */
    static final /* synthetic */ class C1719b extends C12879i implements Function0<C13145v> {
        C1719b(C1717a aVar) {
            super(0, aVar);
        }

        public final String getName() {
            return "onDispose";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C1717a.class);
        }

        public final String getSignature() {
            return "onDispose()V";
        }

        public final void invoke() {
            ((C1717a) this.receiver).mo7698a();
        }
    }

    /* renamed from: com.bamtech.player.exo.j.a$c */
    /* compiled from: ExoMediaSessionDelegate.kt */
    static final class C1720c<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ C1717a f5998c;

        C1720c(C1717a aVar) {
            this.f5998c = aVar;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f5998c.mo7700c();
        }
    }

    public C1717a(C1734b bVar, C5300m mVar) {
        this.f5996c = bVar;
        mVar.mo16955L().mo30192f((Consumer<? super T>) new C1718a<Object>(this));
        mVar.mo16957M().mo30180c((C11945a) new C1721b(new C1719b(this))).mo30192f((Consumer<? super T>) new C1720c<Object>(this));
    }

    /* renamed from: a */
    public final void mo7698a() {
        this.f5996c.mo7752e();
    }

    /* renamed from: b */
    public final void mo7699b() {
        this.f5996c.mo7751d();
    }

    /* renamed from: c */
    public final void mo7700c() {
        mo7698a();
    }
}
