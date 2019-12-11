package androidx.work.impl;

import androidx.lifecycle.C0730s;
import androidx.work.Operation;
import androidx.work.Operation.State;
import androidx.work.Operation.State.C1016a;
import androidx.work.Operation.State.SUCCESS;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: androidx.work.impl.b */
/* compiled from: OperationImpl */
public class C1040b implements Operation {

    /* renamed from: c */
    private final C0730s<State> f4087c = new C0730s<>();

    /* renamed from: d */
    private final SettableFuture<SUCCESS> f4088d = SettableFuture.m5920d();

    public C1040b() {
        mo5714a(Operation.f4004b);
    }

    /* renamed from: a */
    public ListenableFuture<SUCCESS> mo5618a() {
        return this.f4088d;
    }

    /* renamed from: a */
    public void mo5714a(State state) {
        this.f4087c.mo4095a(state);
        if (state instanceof SUCCESS) {
            this.f4088d.mo5910a((SUCCESS) state);
        } else if (state instanceof C1016a) {
            this.f4088d.mo5911a(((C1016a) state).mo5620a());
        }
    }
}
