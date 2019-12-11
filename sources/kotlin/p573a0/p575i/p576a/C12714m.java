package kotlin.p573a0.p575i.p576a;

import kotlin.jvm.internal.C12878h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.p573a0.C12683c;

/* renamed from: kotlin.a0.i.a.m */
/* compiled from: ContinuationImpl.kt */
public abstract class C12714m extends C12704d implements C12878h<Object>, C12713l {

    /* renamed from: W */
    private final int f29403W;

    public C12714m(int i, C12683c<Object> cVar) {
        super(cVar);
        this.f29403W = i;
    }

    public int getArity() {
        return this.f29403W;
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
