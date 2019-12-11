package androidx.activity;

import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0715i.C0717b;
import androidx.lifecycle.C0720k;
import androidx.lifecycle.C0722m;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f162a;

    /* renamed from: b */
    final ArrayDeque<C0060b> f163b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0720k, C0059a {

        /* renamed from: U */
        private final C0060b f164U;

        /* renamed from: V */
        private C0059a f165V;

        /* renamed from: c */
        private final C0715i f167c;

        LifecycleOnBackPressedCancellable(C0715i iVar, C0060b bVar) {
            this.f167c = iVar;
            this.f164U = bVar;
            iVar.mo4134a(this);
        }

        /* renamed from: a */
        public void mo330a(C0722m mVar, C0716a aVar) {
            if (aVar == C0716a.ON_START) {
                this.f165V = OnBackPressedDispatcher.this.mo332a(this.f164U);
            } else if (aVar == C0716a.ON_STOP) {
                C0059a aVar2 = this.f165V;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0716a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f167c.mo4135b(this);
            this.f164U.mo339b(this);
            C0059a aVar = this.f165V;
            if (aVar != null) {
                aVar.cancel();
                this.f165V = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0058a implements C0059a {

        /* renamed from: c */
        private final C0060b f169c;

        C0058a(C0060b bVar) {
            this.f169c = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f163b.remove(this.f169c);
            this.f169c.mo339b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f162a = runnable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0059a mo332a(C0060b bVar) {
        this.f163b.add(bVar);
        C0058a aVar = new C0058a(bVar);
        bVar.mo337a((C0059a) aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo334a(C0722m mVar, C0060b bVar) {
        C0715i lifecycle = mVar.getLifecycle();
        if (lifecycle.mo4133a() != C0717b.DESTROYED) {
            bVar.mo337a((C0059a) new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* renamed from: a */
    public void mo333a() {
        Iterator descendingIterator = this.f163b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0060b bVar = (C0060b) descendingIterator.next();
            if (bVar.mo340b()) {
                bVar.mo336a();
                return;
            }
        }
        Runnable runnable = this.f162a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
