package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: AbstractTypeConstructor.kt */
final class AbstractTypeConstructor$supertypes$3 extends C12881k implements Function1<Supertypes, C13145v> {
    final /* synthetic */ AbstractTypeConstructor this$0;

    AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        this.this$0 = abstractTypeConstructor;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Supertypes) obj);
        return C13145v.f29587a;
    }

    public final void invoke(Supertypes supertypes) {
        Collection findLoopsInSupertypesAndDisconnect = this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, supertypes.getAllSupertypes(), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(this), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this));
        List list = null;
        if (findLoopsInSupertypesAndDisconnect.isEmpty()) {
            KotlinType defaultSupertypeIfEmpty = this.this$0.defaultSupertypeIfEmpty();
            findLoopsInSupertypesAndDisconnect = defaultSupertypeIfEmpty != null ? C13183n.m40498a(defaultSupertypeIfEmpty) : null;
            if (findLoopsInSupertypesAndDisconnect == null) {
                findLoopsInSupertypesAndDisconnect = C13185o.m40513a();
            }
        }
        this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, findLoopsInSupertypesAndDisconnect, new Function1<TypeConstructor, Collection<? extends KotlinType>>(this) {
            final /* synthetic */ AbstractTypeConstructor$supertypes$3 this$0;

            {
                this.this$0 = r1;
            }

            public final Collection<KotlinType> invoke(TypeConstructor typeConstructor) {
                return this.this$0.this$0.computeNeighbours(typeConstructor, true);
            }
        }, new Function1<KotlinType, C13145v>(this) {
            final /* synthetic */ AbstractTypeConstructor$supertypes$3 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KotlinType) obj);
                return C13145v.f29587a;
            }

            public final void invoke(KotlinType kotlinType) {
                this.this$0.this$0.reportScopesLoopError(kotlinType);
            }
        });
        if (findLoopsInSupertypesAndDisconnect instanceof List) {
            list = findLoopsInSupertypesAndDisconnect;
        }
        List list2 = list;
        if (list2 == null) {
            list2 = C13199w.m40606q(findLoopsInSupertypesAndDisconnect);
        }
        supertypes.setSupertypesWithoutCycles(list2);
    }
}
