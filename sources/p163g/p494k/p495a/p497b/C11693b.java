package p163g.p494k.p495a.p497b;

import android.view.View;
import android.view.View.OnClickListener;
import p163g.p494k.p495a.p496a.C11690a;
import p163g.p494k.p495a.p496a.C11691b;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.p527w.C11989a;

/* renamed from: g.k.a.b.b */
/* compiled from: ViewClickObservable */
final class C11693b extends Observable<Object> {

    /* renamed from: c */
    private final View f27225c;

    /* renamed from: g.k.a.b.b$a */
    /* compiled from: ViewClickObservable */
    static final class C11694a extends C11989a implements OnClickListener {

        /* renamed from: U */
        private final View f27226U;

        /* renamed from: V */
        private final C11968q<? super Object> f27227V;

        C11694a(View view, C11968q<? super Object> qVar) {
            this.f27226U = view;
            this.f27227V = qVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29706a() {
            this.f27226U.setOnClickListener(null);
        }

        public void onClick(View view) {
            if (!isDisposed()) {
                this.f27227V.onNext(C11690a.INSTANCE);
            }
        }
    }

    C11693b(View view) {
        this.f27225c = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super Object> qVar) {
        if (C11691b.m37642a(qVar)) {
            C11694a aVar = new C11694a(this.f27225c, qVar);
            qVar.onSubscribe(aVar);
            this.f27225c.setOnClickListener(aVar);
        }
    }
}
