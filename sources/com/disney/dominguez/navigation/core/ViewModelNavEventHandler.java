package com.disney.dominguez.navigation.core;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0741y;
import com.disney.dominguez.navigation.core.C8436a.C8437a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB!\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\bJ\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0003R(\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, mo31007d2 = {"Lcom/disney/dominguez/navigation/core/ViewModelNavEventHandler;", "Landroidx/lifecycle/ViewModel;", "Lcom/disney/dominguez/navigation/core/NavEventHandler;", "handler", "Landroid/os/Handler;", "isOnMainThread", "Lkotlin/Function0;", "", "(Landroid/os/Handler;Lkotlin/jvm/functions/Function0;)V", "value", "delegate", "getDelegate", "()Lcom/disney/dominguez/navigation/core/NavEventHandler;", "setDelegate", "(Lcom/disney/dominguez/navigation/core/NavEventHandler;)V", "pendingNavEvent", "Lcom/disney/dominguez/navigation/core/NavEventHandler$NavEvent;", "registeredLifecycles", "", "", "getRegisteredLifecycles$core_ui_framework_release", "()Ljava/util/Set;", "logIfEnabled", "", "message", "", "navigate", "navEvent", "navigateOnUI", "Companion", "Observer", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ViewModelNavEventHandler.kt */
public final class ViewModelNavEventHandler extends C0741y implements C8436a {
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static boolean f17965Y;

    /* renamed from: Z */
    public static final C8434b f17966Z = new C8434b(null);

    /* renamed from: U */
    private C8437a f17967U;

    /* renamed from: V */
    private C8436a f17968V;

    /* renamed from: W */
    private final Handler f17969W;

    /* renamed from: X */
    private final Function0<Boolean> f17970X;

    /* renamed from: c */
    private final Set<Integer> f17971c;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/disney/dominguez/navigation/core/ViewModelNavEventHandler$Observer;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "viewModelNavEventHandler", "Lcom/disney/dominguez/navigation/core/ViewModelNavEventHandler;", "actualNavEventHandler", "Lcom/disney/dominguez/navigation/core/NavEventHandler;", "(Lcom/disney/dominguez/navigation/core/ViewModelNavEventHandler;Lcom/disney/dominguez/navigation/core/NavEventHandler;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "toString", "", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ViewModelNavEventHandler.kt */
    public static final class Observer implements C0710d {

        /* renamed from: U */
        private final C8436a f17972U;

        /* renamed from: c */
        private final ViewModelNavEventHandler f17973c;

        public Observer(ViewModelNavEventHandler viewModelNavEventHandler, C8436a aVar) {
            this.f17973c = viewModelNavEventHandler;
            this.f17972U = aVar;
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

        /* renamed from: d */
        public void mo4129d(C0722m mVar) {
            this.f17973c.mo21646a((C8436a) null);
        }

        /* renamed from: e */
        public /* synthetic */ void mo4130e(C0722m mVar) {
            C0708c.m3733b(this, mVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f17972U, (java.lang.Object) r3.f17972U) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.disney.dominguez.navigation.core.ViewModelNavEventHandler.Observer
                if (r0 == 0) goto L_0x001d
                com.disney.dominguez.navigation.core.ViewModelNavEventHandler$Observer r3 = (com.disney.dominguez.navigation.core.ViewModelNavEventHandler.Observer) r3
                com.disney.dominguez.navigation.core.ViewModelNavEventHandler r0 = r2.f17973c
                com.disney.dominguez.navigation.core.ViewModelNavEventHandler r1 = r3.f17973c
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.disney.dominguez.navigation.core.a r0 = r2.f17972U
                com.disney.dominguez.navigation.core.a r3 = r3.f17972U
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disney.dominguez.navigation.core.ViewModelNavEventHandler.Observer.equals(java.lang.Object):boolean");
        }

        /* renamed from: f */
        public void mo4131f(C0722m mVar) {
            this.f17973c.mo21646a(this.f17972U);
        }

        public int hashCode() {
            ViewModelNavEventHandler viewModelNavEventHandler = this.f17973c;
            int i = 0;
            int hashCode = (viewModelNavEventHandler != null ? viewModelNavEventHandler.hashCode() : 0) * 31;
            C8436a aVar = this.f17972U;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Observer(viewModelNavEventHandler=");
            sb.append(this.f17973c);
            sb.append(", actualNavEventHandler=");
            sb.append(this.f17972U);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disney.dominguez.navigation.core.ViewModelNavEventHandler$a */
    /* compiled from: ViewModelNavEventHandler.kt */
    static final class C8433a extends C12881k implements Function0<Boolean> {

        /* renamed from: c */
        public static final C8433a f17974c = new C8433a();

        C8433a() {
            super(0);
        }

        public final boolean invoke() {
            return C12880j.m40224a((Object) Looper.getMainLooper(), (Object) Looper.myLooper());
        }
    }

    /* renamed from: com.disney.dominguez.navigation.core.ViewModelNavEventHandler$b */
    /* compiled from: ViewModelNavEventHandler.kt */
    public static final class C8434b {
        private C8434b() {
        }

        /* renamed from: a */
        public final boolean mo21651a() {
            return ViewModelNavEventHandler.f17965Y;
        }

        public /* synthetic */ C8434b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.disney.dominguez.navigation.core.ViewModelNavEventHandler$c */
    /* compiled from: ViewModelNavEventHandler.kt */
    static final class C8435c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C8437a f17975U;

        /* renamed from: c */
        final /* synthetic */ ViewModelNavEventHandler f17976c;

        C8435c(ViewModelNavEventHandler viewModelNavEventHandler, C8437a aVar) {
            this.f17976c = viewModelNavEventHandler;
            this.f17975U = aVar;
        }

        public final void run() {
            this.f17976c.m24530b(this.f17975U);
        }
    }

    public ViewModelNavEventHandler() {
        this(null, null, 3, null);
    }

    public /* synthetic */ ViewModelNavEventHandler(Handler handler, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            handler = new Handler(Looper.getMainLooper());
        }
        if ((i & 2) != 0) {
            function0 = C8433a.f17974c;
        }
        this(handler, function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m24530b(C8437a aVar) {
        C8436a aVar2 = this.f17968V;
        if (aVar2 != null) {
            try {
                if (f17966Z.mo21651a()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Navigating: ");
                    sb.append(aVar);
                    C14100a.m44522a(sb.toString(), new Object[0]);
                }
                aVar2.mo21645a(aVar);
            } catch (Exception e) {
                C14100a.m44528b(e, "Navigation failed, setting pendingNavEvent", new Object[0]);
                this.f17967U = aVar;
            }
        } else {
            this.f17967U = aVar;
        }
    }

    /* renamed from: y */
    public final Set<Integer> mo21647y() {
        return this.f17971c;
    }

    /* renamed from: a */
    public final void mo21646a(C8436a aVar) {
        if (aVar != null) {
            if (this.f17968V == null) {
                C8437a aVar2 = this.f17967U;
                if (aVar2 != null) {
                    aVar.mo21645a(aVar2);
                    this.f17967U = null;
                }
            } else {
                throw new AssertionError("Listener can not be set twice.");
            }
        }
        this.f17968V = aVar;
    }

    public ViewModelNavEventHandler(Handler handler, Function0<Boolean> function0) {
        this.f17969W = handler;
        this.f17970X = function0;
        this.f17971c = new LinkedHashSet();
    }

    /* renamed from: a */
    public void mo21645a(C8437a aVar) {
        if (((Boolean) this.f17970X.invoke()).booleanValue()) {
            m24530b(aVar);
        } else {
            this.f17969W.post(new C8435c(this, aVar));
        }
    }
}
