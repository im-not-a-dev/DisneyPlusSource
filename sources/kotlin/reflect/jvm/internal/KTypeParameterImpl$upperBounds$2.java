package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KTypeParameterImpl.kt */
final class KTypeParameterImpl$upperBounds$2 extends C12881k implements Function0<List<? extends KTypeImpl>> {
    final /* synthetic */ KTypeParameterImpl this$0;

    KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        this.this$0 = kTypeParameterImpl;
        super(0);
    }

    public final List<KTypeImpl> invoke() {
        List<KotlinType> upperBounds = this.this$0.getDescriptor().getUpperBounds();
        C12880j.m40222a((Object) upperBounds, "descriptor.upperBounds");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) upperBounds, 10));
        for (KotlinType kotlinType : upperBounds) {
            C12880j.m40222a((Object) kotlinType, "kotlinType");
            arrayList.add(new KTypeImpl(kotlinType, new KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1(this)));
        }
        return arrayList;
    }
}
