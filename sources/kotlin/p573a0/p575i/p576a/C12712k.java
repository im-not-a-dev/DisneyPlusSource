package kotlin.p573a0.p575i.p576a;

import kotlin.jvm.internal.C12878h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.p573a0.C12683c;

/* renamed from: kotlin.a0.i.a.k */
/* compiled from: ContinuationImpl.kt */
public abstract class C12712k extends C12711j implements C12878h<Object>, C12713l {

    /* renamed from: U */
    private final int f29402U;

    public C12712k(int i, C12683c<Object> cVar) {
        super(cVar);
        this.f29402U = i;
    }

    public int getArity() {
        return this.f29402U;
    }

    public String toString() {
        if (mo31045a() != null) {
            return super.toString();
        }
        String a = C12895y.m40228a((C12878h) this);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
