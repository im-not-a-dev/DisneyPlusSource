package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: ClassLiteralValue.kt */
public final class ClassLiteralValue {
    private final int arrayNestedness;
    private final ClassId classId;

    public ClassLiteralValue(ClassId classId2, int i) {
        this.classId = classId2;
        this.arrayNestedness = i;
    }

    public final ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClassLiteralValue) {
                ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
                if (Intrinsics.areEqual((Object) this.classId, (Object) classLiteralValue.classId)) {
                    if (this.arrayNestedness == classLiteralValue.arrayNestedness) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    public final ClassId getClassId() {
        return this.classId;
    }

    public int hashCode() {
        ClassId classId2 = this.classId;
        return ((classId2 != null ? classId2.hashCode() : 0) * 31) + this.arrayNestedness;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.arrayNestedness;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.classId);
        int i3 = this.arrayNestedness;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
