package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;

/* compiled from: TypeSubstitution.kt */
public final class TypeConstructorSubstitution$Companion$createByConstructorsMap$1 extends TypeConstructorSubstitution {
    final /* synthetic */ boolean $approximateCapturedTypes;
    final /* synthetic */ Map $map;

    TypeConstructorSubstitution$Companion$createByConstructorsMap$1(Map map, boolean z) {
        this.$map = map;
        this.$approximateCapturedTypes = z;
    }

    public boolean approximateCapturedTypes() {
        return this.$approximateCapturedTypes;
    }

    public TypeProjection get(TypeConstructor typeConstructor) {
        return (TypeProjection) this.$map.get(typeConstructor);
    }

    public boolean isEmpty() {
        return this.$map.isEmpty();
    }
}
