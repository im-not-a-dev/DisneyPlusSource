package com.bamtechmedia.dominguez.playback.mobile;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11969r;
import p520io.reactivex.Observable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/mobile/LocalBookmarksMarker;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "localBookmarks", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;Lio/reactivex/Scheduler;)V", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LocalBookmarksMarker.kt */
public final class LocalBookmarksMarker implements C0710d {

    /* renamed from: U */
    private final C11969r f14728U;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3165c<C3693o> f14729c;

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.LocalBookmarksMarker$a */
    /* compiled from: LocalBookmarksMarker.kt */
    static final class C6513a<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksMarker f14730c;

        C6513a(LocalBookmarksMarker localBookmarksMarker) {
            this.f14730c = localBookmarksMarker;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f14730c.f14729c.mo12188b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.LocalBookmarksMarker$b */
    /* compiled from: LocalBookmarksMarker.kt */
    static final class C6514b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6514b f14731c = new C6514b();

        C6514b() {
        }

        /* renamed from: a */
        public final void mo19176a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo19176a((Throwable) obj);
            throw null;
        }
    }

    public LocalBookmarksMarker(C3165c<C3693o> cVar, C11969r rVar) {
        this.f14729c = cVar;
        this.f14728U = rVar;
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
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        Observable b = Observable.m38307b(1, TimeUnit.MINUTES, this.f14728U);
        C12880j.m40222a((Object) b, "Observable.interval(1, T…eUnit.MINUTES, scheduler)");
        C10541b a = C10541b.m33255a(mVar, C0716a.ON_STOP);
        C12880j.m40222a((Object) a, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a2 = b.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a2).mo29915a(new C6513a(this), C6514b.f14731c);
    }
}
