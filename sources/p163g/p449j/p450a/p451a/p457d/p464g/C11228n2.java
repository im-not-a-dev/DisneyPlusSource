package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11196l2;
import p163g.p449j.p450a.p451a.p457d.p464g.C11228n2;

/* renamed from: g.j.a.a.d.g.n2 */
public abstract class C11228n2<MessageType extends C11196l2<MessageType, BuilderType>, BuilderType extends C11228n2<MessageType, BuilderType>> implements C11245o5 {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo28439a(MessageType messagetype);

    /* renamed from: a */
    public abstract BuilderType mo28440a(byte[] bArr, int i, int i2, C11285r3 r3Var) throws C11258p4;

    /* renamed from: a */
    public final BuilderType mo28728a(byte[] bArr, C11285r3 r3Var) throws C11258p4 {
        mo28440a(bArr, 0, bArr.length, r3Var);
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ C11245o5 mo28729a(C11259p5 p5Var) {
        if (mo28424a().getClass().isInstance(p5Var)) {
            mo28439a((MessageType) (C11196l2) p5Var);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
