package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C13266g;
import kotlinx.coroutines.internal.C13268i;

/* renamed from: kotlinx.coroutines.v1 */
/* compiled from: JobSupport.kt */
public final class C13408v1 extends C13266g implements C13238f1 {
    /* renamed from: a */
    public final String mo34627a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object d = mo34422d();
        if (d != null) {
            boolean z = true;
            for (C13268i iVar = (C13268i) d; !Intrinsics.areEqual((Object) iVar, (Object) this); iVar = iVar.mo34423e()) {
                if (iVar instanceof C13388q1) {
                    C13388q1 q1Var = (C13388q1) iVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(q1Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public boolean mo34370a() {
        return true;
    }

    /* renamed from: b */
    public C13408v1 mo34371b() {
        return this;
    }

    public String toString() {
        return C13292j0.m40865c() ? mo34627a("Active") : super.toString();
    }
}
