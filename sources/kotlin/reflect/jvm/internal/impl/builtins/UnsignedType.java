package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: UnsignedType.kt */
public enum UnsignedType {
    UBYTE(r2),
    USHORT(r2),
    UINT(r2),
    ULONG(r2);
    
    private final ClassId arrayClassId;
    private final ClassId classId;
    private final Name typeName;

    private UnsignedType(ClassId classId2) {
        this.classId = classId2;
        Name shortClassName = this.classId.getShortClassName();
        Intrinsics.checkReturnedValueIsNotNull((Object) shortClassName, "classId.shortClassName");
        this.typeName = shortClassName;
        FqName packageFqName = this.classId.getPackageFqName();
        StringBuilder sb = new StringBuilder();
        sb.append(this.typeName.asString());
        sb.append("Array");
        this.arrayClassId = new ClassId(packageFqName, Name.identifier(sb.toString()));
    }

    public final ClassId getArrayClassId() {
        return this.arrayClassId;
    }

    public final ClassId getClassId() {
        return this.classId;
    }

    public final Name getTypeName() {
        return this.typeName;
    }
}
