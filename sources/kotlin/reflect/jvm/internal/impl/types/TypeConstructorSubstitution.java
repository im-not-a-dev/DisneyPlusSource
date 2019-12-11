package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* compiled from: TypeSubstitution.kt */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    /* compiled from: TypeSubstitution.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ TypeConstructorSubstitution createByConstructorsMap$default(Companion companion, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.createByConstructorsMap(map, z);
        }

        public final TypeSubstitution create(KotlinType kotlinType) {
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        public final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map, boolean z) {
            return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(map, z);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeSubstitution create(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
            List parameters = typeConstructor.getParameters();
            String str = "typeConstructor.parameters";
            C12880j.m40222a((Object) parameters, str);
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) C13199w.m40595i(parameters);
            if (!(typeParameterDescriptor != null ? typeParameterDescriptor.isCapturedFromOuterDeclaration() : false)) {
                return new IndexedParametersSubstitution(parameters, list);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            C12880j.m40222a((Object) parameters2, str);
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) parameters2, 10));
            for (TypeParameterDescriptor typeParameterDescriptor2 : parameters2) {
                C12880j.m40222a((Object) typeParameterDescriptor2, "it");
                arrayList.add(typeParameterDescriptor2.getTypeConstructor());
            }
            return createByConstructorsMap$default(this, C13173j0.m40351a((Iterable) C13199w.m40586e((Iterable) arrayList, (Iterable) list)), false, 2, null);
        }
    }

    public static final TypeSubstitution create(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    public static final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.createByConstructorsMap$default(Companion, map, false, 2, null);
    }

    public TypeProjection get(KotlinType kotlinType) {
        return get(kotlinType.getConstructor());
    }

    public abstract TypeProjection get(TypeConstructor typeConstructor);
}
