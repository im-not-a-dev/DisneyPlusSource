package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.C12897k;
import kotlin.C12898l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.p590y.C13180m;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.KTypeImpl.WhenMappings;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KTypeImpl.kt */
final class KTypeImpl$arguments$2 extends C12881k implements Function0<List<? extends KTypeProjection>> {
    final /* synthetic */ KTypeImpl this$0;

    KTypeImpl$arguments$2(KTypeImpl kTypeImpl) {
        this.this$0 = kTypeImpl;
        super(0);
    }

    public final List<KTypeProjection> invoke() {
        KTypeProjection kTypeProjection;
        List arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return C13185o.m40513a();
        }
        Lazy a = C12763i.m39922a(C12897k.PUBLICATION, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this));
        KProperty kProperty = KTypeImpl.$$delegatedProperties[3];
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) arguments, 10));
        int i = 0;
        for (Object next : arguments) {
            int i2 = i + 1;
            if (i >= 0) {
                TypeProjection typeProjection = (TypeProjection) next;
                if (typeProjection.isStarProjection()) {
                    kTypeProjection = KTypeProjection.Companion.getSTAR();
                } else {
                    KotlinType type = typeProjection.getType();
                    C12880j.m40222a((Object) type, "typeProjection.type");
                    KTypeImpl kTypeImpl = new KTypeImpl(type, new KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(i, this, a, kProperty));
                    int i3 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                    if (i3 == 1) {
                        kTypeProjection = KTypeProjection.Companion.invariant(kTypeImpl);
                    } else if (i3 == 2) {
                        kTypeProjection = KTypeProjection.Companion.contravariant(kTypeImpl);
                    } else if (i3 == 3) {
                        kTypeProjection = KTypeProjection.Companion.covariant(kTypeImpl);
                    } else {
                        throw new C12898l();
                    }
                }
                arrayList.add(kTypeProjection);
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        return arrayList;
    }
}
