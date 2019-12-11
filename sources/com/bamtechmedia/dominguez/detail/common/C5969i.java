package com.bamtechmedia.dominguez.detail.common;

import com.bamtechmedia.dominguez.core.content.C3651b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p407e0.C10601l;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.Completable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000f¢\u0006\u0002\u0010\u0010J3\u0010\u0011\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000f¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000f2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J-\u0010\u0017\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000fH\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper;", "", "repository", "Lcom/bamtechmedia/dominguez/watchlist/WatchlistRepository;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "(Lcom/bamtechmedia/dominguez/watchlist/WatchlistRepository;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "add", "", "T", "Lcom/bamtechmedia/dominguez/core/content/Browsable;", "asset", "viewModel", "Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper$ViewModel;", "(Lcom/bamtechmedia/dominguez/core/content/Browsable;Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper$ViewModel;)V", "onClick", "isInWatchlist", "", "(Lcom/bamtechmedia/dominguez/core/content/Browsable;ZLcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper$ViewModel;)V", "onWatchlistError", "wasInWatchlist", "remove", "ViewModel", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.i */
/* compiled from: DetailWatchlistHelper.kt */
public final class C5969i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Disposable f13801a;

    /* renamed from: b */
    private final C10601l f13802b;

    /* renamed from: c */
    private final C7547h f13803c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.i$a */
    /* compiled from: DetailWatchlistHelper.kt */
    public interface C5970a<T extends C3651b> {
        /* renamed from: a */
        void mo17920a(T t, boolean z);

        /* renamed from: b */
        void mo17921b(boolean z);

        C11790c0 getViewModelScope();

        /* renamed from: r */
        void mo17923r();
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.i$b */
    /* compiled from: DetailWatchlistHelper.kt */
    static final class C5971b<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C5969i f13804c;

        C5971b(C5969i iVar) {
            this.f13804c = iVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            Disposable a = this.f13804c.f13801a;
            if (a != null) {
                a.dispose();
            }
            this.f13804c.f13801a = disposable;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.i$c */
    /* compiled from: DetailWatchlistHelper.kt */
    static final class C5972c implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C5970a f13805a;

        C5972c(C5970a aVar) {
            this.f13805a = aVar;
        }

        public final void run() {
            this.f13805a.mo17921b(true);
            this.f13805a.mo17923r();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.i$d */
    /* compiled from: DetailWatchlistHelper.kt */
    static final class C5973d<T> implements Consumer<Throwable> {

        /* renamed from: U */
        final /* synthetic */ C5970a f13806U;

        /* renamed from: c */
        final /* synthetic */ C5969i f13807c;

        C5973d(C5969i iVar, C5970a aVar) {
            this.f13807c = iVar;
            this.f13806U = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f13807c.m19139a(this.f13806U, false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.i$e */
    /* compiled from: DetailWatchlistHelper.kt */
    static final class C5974e<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C5969i f13808c;

        C5974e(C5969i iVar) {
            this.f13808c = iVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            Disposable a = this.f13808c.f13801a;
            if (a != null) {
                a.dispose();
            }
            this.f13808c.f13801a = disposable;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.i$f */
    /* compiled from: DetailWatchlistHelper.kt */
    static final class C5975f implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C5970a f13809a;

        C5975f(C5970a aVar) {
            this.f13809a = aVar;
        }

        public final void run() {
            this.f13809a.mo17921b(false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.i$g */
    /* compiled from: DetailWatchlistHelper.kt */
    static final class C5976g<T> implements Consumer<Throwable> {

        /* renamed from: U */
        final /* synthetic */ C5970a f13810U;

        /* renamed from: c */
        final /* synthetic */ C5969i f13811c;

        C5976g(C5969i iVar, C5970a aVar) {
            this.f13811c = iVar;
            this.f13810U = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f13811c.m19139a(this.f13810U, true);
        }
    }

    public C5969i(C10601l lVar, C7547h hVar) {
        this.f13802b = lVar;
        this.f13803c = hVar;
    }

    /* renamed from: b */
    private final <T extends C3651b> void m19142b(T t, C5970a<T> aVar) {
        Completable c = this.f13802b.mo27468b(t.mo12903f()).mo30052c((Consumer<? super Disposable>) new C5974e<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "repository.removeItem(as…pose(); disposable = it }");
        Object a = c.mo30048a((C11912b<? extends R>) C11793e.m37930a(aVar.getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C5975f(aVar), new C5976g(this, aVar));
    }

    /* renamed from: a */
    public final <T extends C3651b> void mo17919a(T t, boolean z, C5970a<T> aVar) {
        aVar.mo17921b(!z);
        if (!z) {
            mo17918a(t, aVar);
        } else {
            m19142b(t, aVar);
        }
        aVar.mo17920a(t, z);
    }

    /* renamed from: a */
    public final <T extends C3651b> void mo17918a(T t, C5970a<T> aVar) {
        Completable c = this.f13802b.mo27467a(t.mo12903f()).mo30052c((Consumer<? super Disposable>) new C5971b<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "repository.addItem(asset…pose(); disposable = it }");
        Object a = c.mo30048a((C11912b<? extends R>) C11793e.m37930a(aVar.getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C5972c(aVar), new C5973d(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <T extends C3651b> void m19139a(C5970a<T> aVar, boolean z) {
        Integer num;
        aVar.mo17921b(z);
        C7547h hVar = this.f13803c;
        C7544a aVar2 = new C7544a();
        if (!z) {
            num = Integer.valueOf(C7313g.error_addtowatchlist_title);
        } else {
            num = Integer.valueOf(C7313g.error_removefromwatchlist_title);
        }
        aVar2.mo20484i(num);
        aVar2.mo20467a(Integer.valueOf(C7313g.error_add_remove_watchlist_copy));
        aVar2.mo20480g(Integer.valueOf(C7313g.btn_ok));
        hVar.mo20491b(aVar2.mo20465a());
    }
}
