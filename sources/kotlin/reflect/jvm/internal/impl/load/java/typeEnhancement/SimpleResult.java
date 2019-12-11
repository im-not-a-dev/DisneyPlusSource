package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: typeEnhancement.kt */
final class SimpleResult extends Result {
    private final SimpleType type;

    public SimpleResult(SimpleType simpleType, int i, boolean z) {
        super(simpleType, i, z);
        this.type = simpleType;
    }

    public SimpleType getType() {
        return this.type;
    }
}
