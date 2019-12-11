package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: ImplicitClassReceiver.kt */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {
    private final ClassDescriptor classDescriptor;
    private final ClassDescriptor declarationDescriptor;
    private final ImplicitClassReceiver original;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor2, ImplicitClassReceiver implicitClassReceiver) {
        this.classDescriptor = classDescriptor2;
        if (implicitClassReceiver == null) {
            implicitClassReceiver = this;
        }
        this.original = implicitClassReceiver;
        this.declarationDescriptor = this.classDescriptor;
    }

    public boolean equals(Object obj) {
        ClassDescriptor classDescriptor2 = this.classDescriptor;
        ClassDescriptor classDescriptor3 = null;
        if (!(obj instanceof ImplicitClassReceiver)) {
            obj = null;
        }
        ImplicitClassReceiver implicitClassReceiver = (ImplicitClassReceiver) obj;
        if (implicitClassReceiver != null) {
            classDescriptor3 = implicitClassReceiver.classDescriptor;
        }
        return C12880j.m40224a((Object) classDescriptor2, (Object) classDescriptor3);
    }

    public final ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class{");
        sb.append(getType());
        sb.append('}');
        return sb.toString();
    }

    public SimpleType getType() {
        SimpleType defaultType = this.classDescriptor.getDefaultType();
        C12880j.m40222a((Object) defaultType, "classDescriptor.defaultType");
        return defaultType;
    }
}
