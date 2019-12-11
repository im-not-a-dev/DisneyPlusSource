package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.k */
/* compiled from: Lambda.kt */
public abstract class C12881k<R> implements C12878h<R>, Serializable {
    private final int arity;

    public C12881k(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String a = C12895y.m40229a(this);
        C12880j.m40222a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
