package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.NoSuchElementException;

/* renamed from: g.j.a.a.d.g.u2 */
final class C11328u2 extends C11356w2 {

    /* renamed from: U */
    private final int f26553U = this.f26554V.size();

    /* renamed from: V */
    private final /* synthetic */ C11342v2 f26554V;

    /* renamed from: c */
    private int f26555c = 0;

    C11328u2(C11342v2 v2Var) {
        this.f26554V = v2Var;
    }

    public final boolean hasNext() {
        return this.f26555c < this.f26553U;
    }

    public final byte nextByte() {
        int i = this.f26555c;
        if (i < this.f26553U) {
            this.f26555c = i + 1;
            return this.f26554V.mo28518g(i);
        }
        throw new NoSuchElementException();
    }
}
