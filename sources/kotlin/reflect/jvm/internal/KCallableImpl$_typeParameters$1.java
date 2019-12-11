package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KCallableImpl.kt */
final class KCallableImpl$_typeParameters$1 extends C12881k implements Function0<List<? extends KTypeParameterImpl>> {
    final /* synthetic */ KCallableImpl this$0;

    KCallableImpl$_typeParameters$1(KCallableImpl kCallableImpl) {
        this.this$0 = kCallableImpl;
        super(0);
    }

    public final List<KTypeParameterImpl> invoke() {
        List<TypeParameterDescriptor> typeParameters = this.this$0.getDescriptor().getTypeParameters();
        C12880j.m40222a((Object) typeParameters, "descriptor.typeParameters");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) typeParameters, 10));
        for (TypeParameterDescriptor kTypeParameterImpl : typeParameters) {
            arrayList.add(new KTypeParameterImpl(kTypeParameterImpl));
        }
        return arrayList;
    }
}
