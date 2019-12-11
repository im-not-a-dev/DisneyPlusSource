package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Set<PrimitiveType> NUMBER_TYPES = null;
    private FqName arrayTypeFqName;
    private final Name arrayTypeName;
    private FqName typeFqName;
    private final Name typeName;

    static {
        PrimitiveType primitiveType;
        PrimitiveType primitiveType2;
        PrimitiveType primitiveType3;
        PrimitiveType primitiveType4;
        PrimitiveType primitiveType5;
        PrimitiveType primitiveType6;
        PrimitiveType primitiveType7;
        NUMBER_TYPES = Collections.unmodifiableSet(EnumSet.of(primitiveType, new PrimitiveType[]{primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7}));
    }

    private PrimitiveType(String str) {
        this.typeFqName = null;
        this.arrayTypeFqName = null;
        this.typeName = Name.identifier(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Array");
        this.arrayTypeName = Name.identifier(sb.toString());
    }

    public FqName getArrayTypeFqName() {
        FqName fqName = this.arrayTypeFqName;
        if (fqName != null) {
            if (fqName == null) {
                $$$reportNull$$$0(4);
            }
            return fqName;
        }
        this.arrayTypeFqName = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(this.arrayTypeName);
        FqName fqName2 = this.arrayTypeFqName;
        if (fqName2 == null) {
            $$$reportNull$$$0(5);
        }
        return fqName2;
    }

    public Name getArrayTypeName() {
        Name name = this.arrayTypeName;
        if (name == null) {
            $$$reportNull$$$0(3);
        }
        return name;
    }

    public FqName getTypeFqName() {
        FqName fqName = this.typeFqName;
        if (fqName != null) {
            if (fqName == null) {
                $$$reportNull$$$0(1);
            }
            return fqName;
        }
        this.typeFqName = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName);
        FqName fqName2 = this.typeFqName;
        if (fqName2 == null) {
            $$$reportNull$$$0(2);
        }
        return fqName2;
    }

    public Name getTypeName() {
        Name name = this.typeName;
        if (name == null) {
            $$$reportNull$$$0(0);
        }
        return name;
    }
}
