package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: typeSignatureMapping.kt */
public class JvmDescriptorTypeWriter<T> {
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(T t) {
        writeJvmTypeAsIs(t);
    }

    /* access modifiers changed from: protected */
    public final void writeJvmTypeAsIs(T t) {
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                JvmTypeFactory<T> jvmTypeFactory2 = this.jvmTypeFactory;
                StringBuilder sb = new StringBuilder();
                sb.append(C12832w.m40113a("[", this.jvmCurrentTypeArrayLevel));
                sb.append(this.jvmTypeFactory.toString(t));
                t = jvmTypeFactory2.createFromString(sb.toString());
            }
            this.jvmCurrentType = t;
        }
    }

    public void writeTypeVariable(Name name, T t) {
        writeJvmTypeAsIs(t);
    }
}
