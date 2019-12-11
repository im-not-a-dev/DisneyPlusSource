package com.bamtechmedia.dominguez.collections;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.google.android.exoplayer2.p391ui.PlayerView;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p686n.p687a.C14100a;
import p686n.p687a.C14100a.C14102b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001c\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/AssetTransitionHandler;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "Lcom/bamtechmedia/dominguez/collections/AssetFocusCallback;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "videoArtHandler", "Lcom/bamtechmedia/dominguez/collections/AssetVideoArtHandler;", "staticImageHandler", "Lcom/bamtechmedia/dominguez/collections/AssetStaticImageHandler;", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "(Lcom/bamtechmedia/dominguez/collections/AssetVideoArtHandler;Lcom/bamtechmedia/dominguez/collections/AssetStaticImageHandler;Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;)V", "videoArtDisposable", "Lio/reactivex/disposables/Disposable;", "viewProvider", "Lcom/bamtechmedia/dominguez/collections/AssetTransitionHandler$ViewProvider;", "attachVideoArt", "", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "attachViewProvider", "onAssetFocused", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "onAssetSelected", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "scheduleVideoArtPlayback", "Companion", "ViewProvider", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AssetTransitionHandler.kt */
public final class AssetTransitionHandler extends C5733a implements C3288c, C0710d {

    /* renamed from: U */
    private Disposable f8289U;

    /* renamed from: V */
    private final C3317e f8290V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final AssetStaticImageHandler f8291W;

    /* renamed from: X */
    private final C6627c1 f8292X;

    /* renamed from: c */
    private C3271b f8293c;

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetTransitionHandler$a */
    /* compiled from: AssetTransitionHandler.kt */
    public static final class C3270a {
        private C3270a() {
        }

        public /* synthetic */ C3270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetTransitionHandler$b */
    /* compiled from: AssetTransitionHandler.kt */
    public interface C3271b {
        /* renamed from: j */
        PlayerView mo12235j();
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetTransitionHandler$c */
    /* compiled from: AssetTransitionHandler.kt */
    static final class C3272c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ AssetTransitionHandler f8294c;

        C3272c(AssetTransitionHandler assetTransitionHandler, C3680n nVar) {
            this.f8294c = assetTransitionHandler;
            super(0);
        }

        public final void invoke() {
            C14100a.m44521a("AssetTransitionHandler").mo35673d("VideoArt playback started", new Object[0]);
            this.f8294c.f8291W.mo12300y();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetTransitionHandler$d */
    /* compiled from: AssetTransitionHandler.kt */
    static final class C3273d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ AssetTransitionHandler f8295c;

        C3273d(AssetTransitionHandler assetTransitionHandler, C3680n nVar) {
            this.f8295c = assetTransitionHandler;
            super(0);
        }

        public final void invoke() {
            C14100a.m44521a("AssetTransitionHandler").mo35673d("VideoArt playback ended", new Object[0]);
            this.f8295c.f8291W.mo12301z();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetTransitionHandler$e */
    /* compiled from: AssetTransitionHandler.kt */
    static final class C3274e extends C12881k implements Function1<C3626b, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C3626b f8296U;

        /* renamed from: c */
        final /* synthetic */ AssetTransitionHandler f8297c;

        C3274e(AssetTransitionHandler assetTransitionHandler, C3626b bVar) {
            this.f8297c = assetTransitionHandler;
            this.f8296U = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12318a(C3626b bVar) {
            this.f8297c.m11294e(this.f8296U);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12318a((C3626b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetTransitionHandler$f */
    /* compiled from: AssetTransitionHandler.kt */
    static final class C3275f implements C11945a {

        /* renamed from: a */
        final /* synthetic */ AssetTransitionHandler f8298a;

        /* renamed from: b */
        final /* synthetic */ C3680n f8299b;

        C3275f(AssetTransitionHandler assetTransitionHandler, C3680n nVar) {
            this.f8298a = assetTransitionHandler;
            this.f8299b = nVar;
        }

        public final void run() {
            this.f8298a.m11293a(this.f8299b);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetTransitionHandler$g */
    /* compiled from: AssetTransitionHandler.kt */
    static final /* synthetic */ class C3276g extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3276g f8300c = new C3276g();

        C3276g() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12319a(Throwable th) {
            C14100a.m44527b(th);
        }

        public final String getName() {
            return "w";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "w(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12319a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C3270a(null);
    }

    public AssetTransitionHandler(C3317e eVar, AssetStaticImageHandler assetStaticImageHandler, C6627c1 c1Var) {
        this.f8290V = eVar;
        this.f8291W = assetStaticImageHandler;
        this.f8292X = c1Var;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.collections.AssetTransitionHandler$g] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.bamtechmedia.dominguez.collections.d] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11294e(com.bamtechmedia.dominguez.core.content.assets.C3626b r5) {
        /*
            r4 = this;
            io.reactivex.disposables.Disposable r0 = r4.f8289U
            if (r0 == 0) goto L_0x0007
            r0.dispose()
        L_0x0007:
            com.bamtechmedia.dominguez.collections.e r0 = r4.f8290V
            r0.mo12322c()
            boolean r0 = r5 instanceof com.bamtechmedia.dominguez.core.content.C3793w
            r1 = 0
            if (r0 != 0) goto L_0x0012
            r5 = r1
        L_0x0012:
            com.bamtechmedia.dominguez.core.content.w r5 = (com.bamtechmedia.dominguez.core.content.C3793w) r5
            if (r5 == 0) goto L_0x001c
            java.lang.String r0 = "full_bleed"
            com.bamtechmedia.dominguez.core.content.collections.n r1 = com.bamtechmedia.dominguez.core.content.C3794x.m12817a(r5, r0)
        L_0x001c:
            r5 = 0
            java.lang.String r0 = "AssetTransitionHandler"
            if (r1 != 0) goto L_0x002d
            n.a.a$b r0 = p686n.p687a.C14100a.m44521a(r0)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = "No VideoArt playback: VideoArt is null"
            r0.mo35673d(r1, r5)
            return
        L_0x002d:
            com.bamtechmedia.dominguez.profiles.c1 r2 = r4.f8292X
            boolean r2 = r2.mo19286a()
            if (r2 != 0) goto L_0x0041
            n.a.a$b r0 = p686n.p687a.C14100a.m44521a(r0)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = "No VideoArt playback: disabled by 'backgroundVideo' setting"
            r0.mo35673d(r1, r5)
            return
        L_0x0041:
            r2 = 3000(0xbb8, double:1.482E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.r r0 = p520io.reactivex.p525e0.C11934b.m38498a()
            io.reactivex.Completable r5 = p520io.reactivex.Completable.m38158b(r2, r5, r0)
            io.reactivex.r r0 = p520io.reactivex.p527w.p529c.C11992a.m38600a()
            io.reactivex.Completable r5 = r5.mo30040a(r0)
            java.lang.String r0 = "Completable.timer(PLAYBA…dSchedulers.mainThread())"
            kotlin.jvm.internal.C12880j.m40222a(r5, r0)
            g.n.a.c0 r0 = r4.getViewModelScope()
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r5 = r5.mo30048a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r5, r0)
            g.n.a.v r5 = (p163g.p503n.p504a.C11839v) r5
            com.bamtechmedia.dominguez.collections.AssetTransitionHandler$f r0 = new com.bamtechmedia.dominguez.collections.AssetTransitionHandler$f
            r0.<init>(r4, r1)
            com.bamtechmedia.dominguez.collections.AssetTransitionHandler$g r1 = com.bamtechmedia.dominguez.collections.AssetTransitionHandler.C3276g.f8300c
            if (r1 == 0) goto L_0x007c
            com.bamtechmedia.dominguez.collections.d r2 = new com.bamtechmedia.dominguez.collections.d
            r2.<init>(r1)
            r1 = r2
        L_0x007c:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r5 = r5.mo29926a(r0, r1)
            r4.f8289U = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.AssetTransitionHandler.m11294e(com.bamtechmedia.dominguez.core.content.assets.b):void");
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: c */
    public void mo12316c(C3626b bVar) {
        C14102b a = C14100a.m44521a("AssetTransitionHandler");
        StringBuilder sb = new StringBuilder();
        sb.append("onAssetSelected - ");
        sb.append(bVar.getTitle());
        a.mo35673d(sb.toString(), new Object[0]);
        this.f8291W.mo12299c(bVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: d */
    public void mo12317d(C3626b bVar) {
        C14102b a = C14100a.m44521a("AssetTransitionHandler");
        StringBuilder sb = new StringBuilder();
        sb.append("onAssetFocused - ");
        sb.append(bVar.getTitle());
        a.mo35673d(sb.toString(), new Object[0]);
        this.f8291W.mo12298a(bVar, (Function1<? super C3626b, C13145v>) new C3274e<Object,C13145v>(this, bVar));
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11293a(C3680n nVar) {
        C3271b bVar = this.f8293c;
        if (bVar != null) {
            PlayerView j = bVar.mo12235j();
            if (j != null) {
                C14100a.m44521a("AssetTransitionHandler").mo35673d("Attach VideoArt to PlayerView", new Object[0]);
                this.f8290V.mo12321a(j, nVar, false, new C3272c(this, nVar), new C3273d(this, nVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo12315a(C3271b bVar) {
        this.f8293c = bVar;
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        this.f8293c = null;
    }
}
