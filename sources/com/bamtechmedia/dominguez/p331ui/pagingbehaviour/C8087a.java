package com.bamtechmedia.dominguez.p331ui.pagingbehaviour;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3323f0;
import com.bamtechmedia.dominguez.collections.p079n0.C3429a;
import com.bamtechmedia.dominguez.collections.p079n0.C3429a.C3430a;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ#\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0016H\u0002J$\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010#\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0016H\u0016J\b\u0010(\u001a\u00020\u0014H&J\u0012\u0010)\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u0016H\u0007J\b\u0010*\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/BaseAutoPagingBehaviour;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View$OnKeyListener;", "Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingBehaviour;", "autoPagingSession", "Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;", "collectionsAppConfig", "Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "disposable$annotations", "()V", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "enableAutoPaging", "", "enable", "", "stoppedByUser", "enableAutoPaging$core_release", "(ZLjava/lang/Boolean;)V", "mayStartAutoPaging", "onKey", "v", "Landroid/view/View;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "requestStartAutoPaging", "context", "Landroid/content/Context;", "forceAutoPaging", "selectNextItem", "startAutoPagingInternal", "stopAutoPaging", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.a */
/* compiled from: BaseAutoPagingBehaviour.kt */
public abstract class C8087a implements OnAttachStateChangeListener, OnKeyListener, C3429a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C3323f0 f17317U;

    /* renamed from: V */
    private final C3441g f17318V;

    /* renamed from: W */
    private final C11969r f17319W;

    /* renamed from: c */
    private Disposable f17320c;

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.a$a */
    /* compiled from: BaseAutoPagingBehaviour.kt */
    static final class C8088a<T> implements C11952h<Long> {

        /* renamed from: c */
        final /* synthetic */ C8087a f17321c;

        C8088a(C8087a aVar) {
            this.f17321c = aVar;
        }

        /* renamed from: a */
        public final boolean test(Long l) {
            return this.f17321c.f17317U.mo12379v();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.a$b */
    /* compiled from: BaseAutoPagingBehaviour.kt */
    static final class C8089b<T> implements Consumer<Long> {

        /* renamed from: c */
        public static final C8089b f17322c = new C8089b();

        C8089b() {
        }

        /* renamed from: a */
        public final void accept(Long l) {
            C3320f.f8371a.mo12375a().set(true);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.a$c */
    /* compiled from: BaseAutoPagingBehaviour.kt */
    static final class C8090c<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C8087a f17323c;

        C8090c(C8087a aVar) {
            this.f17323c = aVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            Timber.m44521a(this.f17323c.getClass().getSimpleName()).mo35673d("selectNextItem", new Object[0]);
            this.f17323c.mo21083b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.a$d */
    /* compiled from: BaseAutoPagingBehaviour.kt */
    static final class C8091d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C8091d f17324c = new C8091d();

        C8091d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    public C8087a(C3323f0 f0Var, C3441g gVar, C11969r rVar) {
        this.f17317U = f0Var;
        this.f17318V = gVar;
        this.f17319W = rVar;
    }

    /* renamed from: c */
    private final boolean mo21084c() {
        return this.f17320c == null;
    }

    /* renamed from: b */
    public abstract void mo21083b();

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 20) {
            this.f17317U.mo12376a(true);
            if (view != null) {
                Context context = view.getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context, "it.context");
                mo12601a(context, true);
            }
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "v.context");
        C3430a.m11713a(this, context, false, 2, null);
    }

    public void onViewDetachedFromWindow(View view) {
        mo12600a();
    }

    /* renamed from: a */
    public void mo12601a(Context context, boolean z) {
        if (this.f17318V.mo12615a() > 0 && !C5837i.m18836a(context)) {
            mo21087a(z);
        }
    }

    /* renamed from: a */
    public final void mo21087a(boolean z) {
        if (z) {
            m23466a(this, true, null, 2, null);
        }
        if (mo21084c() || z) {
            Timber.m44521a(getClass().getSimpleName()).mo35673d("startAutoPagingInternal", new Object[0]);
            Disposable disposable = this.f17320c;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f17320c = Single.m38397b(this.f17318V.mo12615a(), TimeUnit.MILLISECONDS, C11934b.m38498a()).mo30211a(this.f17319W).mo30230f().mo30085b((C11952h<? super T>) new C8088a<Object>(this)).mo30083b((Consumer<? super T>) C8089b.f17322c).mo30077a((Consumer<? super T>) new C8090c<Object>(this), (Consumer<? super Throwable>) C8091d.f17324c);
        }
    }

    /* renamed from: a */
    public void mo12600a() {
        if (this.f17320c != null) {
            Timber.m44521a(getClass().getSimpleName()).mo35673d("stopAutoPaging", new Object[0]);
            Disposable disposable = this.f17320c;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f17320c = null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m23466a(C8087a aVar, boolean z, Boolean bool, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bool = null;
            }
            aVar.mo21088a(z, bool);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableAutoPaging");
    }

    /* renamed from: a */
    public final void mo21088a(boolean z, Boolean bool) {
        this.f17317U.mo12377c(z);
        if (bool != null) {
            this.f17317U.mo12376a(bool.booleanValue());
        }
    }
}
