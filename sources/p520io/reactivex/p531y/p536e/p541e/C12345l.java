package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p531y.p535d.C12059h;

/* renamed from: io.reactivex.y.e.e.l */
/* compiled from: ObservableDoOnLifecycle */
public final class C12345l<T> extends C12294a<T, T> {

    /* renamed from: U */
    private final Consumer<? super Disposable> f28537U;

    /* renamed from: V */
    private final C11945a f28538V;

    public C12345l(Observable<T> observable, Consumer<? super Disposable> consumer, C11945a aVar) {
        super(observable);
        this.f28537U = consumer;
        this.f28538V = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12059h(qVar, this.f28537U, this.f28538V));
    }
}
