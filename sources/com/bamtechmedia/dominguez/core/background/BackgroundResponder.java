package com.bamtechmedia.dominguez.core.background;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/background/BackgroundResponder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", "appPresence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "getAppPresence", "()Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "appPresenceDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "processPresence", "presence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse;", "coreCommon_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BackgroundResponder.kt */
public abstract class BackgroundResponder implements C0710d {

    /* renamed from: c */
    private final CompositeDisposable f8925c = new CompositeDisposable();

    /* renamed from: com.bamtechmedia.dominguez.core.background.BackgroundResponder$a */
    /* compiled from: BackgroundResponder.kt */
    static final class C3587a<T> implements Consumer<C5766a> {

        /* renamed from: c */
        final /* synthetic */ BackgroundResponder f8926c;

        C3587a(BackgroundResponder backgroundResponder) {
            this.f8926c = backgroundResponder;
        }

        /* renamed from: a */
        public final void accept(C5766a aVar) {
            BackgroundResponder backgroundResponder = this.f8926c;
            C12880j.m40222a((Object) aVar, "it");
            backgroundResponder.mo11409a(aVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.background.BackgroundResponder$b */
    /* compiled from: BackgroundResponder.kt */
    static final /* synthetic */ class C3588b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3588b f8927c = new C3588b();

        C3588b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12796a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12796a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: a */
    public abstract void mo11409a(C5766a aVar);

    /* renamed from: b */
    public abstract C5765a mo11410b();

    /* JADX WARNING: type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.core.background.BackgroundResponder$b] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.core.background.a] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4127b(androidx.lifecycle.C0722m r5) {
        /*
            r4 = this;
            io.reactivex.disposables.CompositeDisposable r5 = r4.f8925c
            com.bamtechmedia.dominguez.core.lifecycle.a r0 = r4.mo11410b()
            io.reactivex.Observable r0 = r0.mo17649a()
            com.bamtechmedia.dominguez.core.background.BackgroundResponder$a r1 = new com.bamtechmedia.dominguez.core.background.BackgroundResponder$a
            r1.<init>(r4)
            com.bamtechmedia.dominguez.core.background.BackgroundResponder$b r2 = com.bamtechmedia.dominguez.core.background.BackgroundResponder.C3588b.f8927c
            if (r2 == 0) goto L_0x0019
            com.bamtechmedia.dominguez.core.background.a r3 = new com.bamtechmedia.dominguez.core.background.a
            r3.<init>(r2)
            r2 = r3
        L_0x0019:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r0 = r0.mo30157a(r1, r2)
            r5.mo30250b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.background.BackgroundResponder.mo4127b(androidx.lifecycle.m):void");
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        this.f8925c.mo30247a();
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }
}
