package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: LocalClassifierTypeSettings.kt */
public interface LocalClassifierTypeSettings {

    /* compiled from: LocalClassifierTypeSettings.kt */
    public static final class Default implements LocalClassifierTypeSettings {
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        public SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }
    }

    SimpleType getReplacementTypeForLocalClassifiers();
}
