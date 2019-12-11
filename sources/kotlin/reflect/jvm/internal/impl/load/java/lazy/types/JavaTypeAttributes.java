package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeAttributes {
    private final JavaTypeFlexibility flexibility;
    private final TypeUsage howThisTypeIsUsed;
    private final boolean isForAnnotationParameter;
    private final TypeParameterDescriptor upperBoundOfTypeParameter;

    public JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, TypeParameterDescriptor typeParameterDescriptor) {
        this.howThisTypeIsUsed = typeUsage;
        this.flexibility = javaTypeFlexibility;
        this.isForAnnotationParameter = z;
        this.upperBoundOfTypeParameter = typeParameterDescriptor;
    }

    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.howThisTypeIsUsed;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.flexibility;
        }
        if ((i & 4) != 0) {
            z = javaTypeAttributes.isForAnnotationParameter;
        }
        if ((i & 8) != 0) {
            typeParameterDescriptor = javaTypeAttributes.upperBoundOfTypeParameter;
        }
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility, z, typeParameterDescriptor);
    }

    public final JavaTypeAttributes copy(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, TypeParameterDescriptor typeParameterDescriptor) {
        return new JavaTypeAttributes(typeUsage, javaTypeFlexibility, z, typeParameterDescriptor);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JavaTypeAttributes) {
                JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
                if (C12880j.m40224a((Object) this.howThisTypeIsUsed, (Object) javaTypeAttributes.howThisTypeIsUsed) && C12880j.m40224a((Object) this.flexibility, (Object) javaTypeAttributes.flexibility)) {
                    if (!(this.isForAnnotationParameter == javaTypeAttributes.isForAnnotationParameter) || !C12880j.m40224a((Object) this.upperBoundOfTypeParameter, (Object) javaTypeAttributes.upperBoundOfTypeParameter)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final JavaTypeFlexibility getFlexibility() {
        return this.flexibility;
    }

    public final TypeUsage getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    public final TypeParameterDescriptor getUpperBoundOfTypeParameter() {
        return this.upperBoundOfTypeParameter;
    }

    public int hashCode() {
        TypeUsage typeUsage = this.howThisTypeIsUsed;
        int i = 0;
        int hashCode = (typeUsage != null ? typeUsage.hashCode() : 0) * 31;
        JavaTypeFlexibility javaTypeFlexibility = this.flexibility;
        int hashCode2 = (hashCode + (javaTypeFlexibility != null ? javaTypeFlexibility.hashCode() : 0)) * 31;
        boolean z = this.isForAnnotationParameter;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        TypeParameterDescriptor typeParameterDescriptor = this.upperBoundOfTypeParameter;
        if (typeParameterDescriptor != null) {
            i = typeParameterDescriptor.hashCode();
        }
        return i2 + i;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JavaTypeAttributes(howThisTypeIsUsed=");
        sb.append(this.howThisTypeIsUsed);
        sb.append(", flexibility=");
        sb.append(this.flexibility);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.isForAnnotationParameter);
        sb.append(", upperBoundOfTypeParameter=");
        sb.append(this.upperBoundOfTypeParameter);
        sb.append(")");
        return sb.toString();
    }

    public final JavaTypeAttributes withFlexibility(JavaTypeFlexibility javaTypeFlexibility) {
        return copy$default(this, null, javaTypeFlexibility, false, null, 13, null);
    }

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            javaTypeFlexibility = JavaTypeFlexibility.INFLEXIBLE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            typeParameterDescriptor = null;
        }
        this(typeUsage, javaTypeFlexibility, z, typeParameterDescriptor);
    }
}
