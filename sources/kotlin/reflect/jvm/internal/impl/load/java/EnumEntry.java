package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* compiled from: utils.kt */
public final class EnumEntry extends JavaDefaultValue {
    private final ClassDescriptor descriptor;

    public EnumEntry(ClassDescriptor classDescriptor) {
        super(null);
        this.descriptor = classDescriptor;
    }
}
