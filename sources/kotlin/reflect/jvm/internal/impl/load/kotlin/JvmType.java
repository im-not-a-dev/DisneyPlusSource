package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: methodSignatureMapping.kt */
public abstract class JvmType {

    /* compiled from: methodSignatureMapping.kt */
    public static final class Array extends JvmType {
        private final JvmType elementType;

        public Array(JvmType jvmType) {
            super(null);
            this.elementType = jvmType;
        }

        public final JvmType getElementType() {
            return this.elementType;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class Object extends JvmType {
        private final String internalName;

        public Object(String str) {
            super(null);
            this.internalName = str;
        }

        public final String getInternalName() {
            return this.internalName;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class Primitive extends JvmType {
        private final JvmPrimitiveType jvmPrimitiveType;

        public Primitive(JvmPrimitiveType jvmPrimitiveType2) {
            super(null);
            this.jvmPrimitiveType = jvmPrimitiveType2;
        }

        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.jvmPrimitiveType;
        }
    }

    private JvmType() {
    }

    public String toString() {
        return JvmTypeFactoryImpl.INSTANCE.toString(this);
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
