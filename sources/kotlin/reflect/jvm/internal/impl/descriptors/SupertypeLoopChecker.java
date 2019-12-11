package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* compiled from: SupertypeLoopChecker.kt */
public interface SupertypeLoopChecker {

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class EMPTY implements SupertypeLoopChecker {
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        public Collection<KotlinType> findLoopsInSupertypesAndDisconnect(TypeConstructor typeConstructor, Collection<? extends KotlinType> collection, Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, Function1<? super KotlinType, C13145v> function12) {
            return collection;
        }
    }

    Collection<KotlinType> findLoopsInSupertypesAndDisconnect(TypeConstructor typeConstructor, Collection<? extends KotlinType> collection, Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, Function1<? super KotlinType, C13145v> function12);
}
