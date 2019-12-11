package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.C12898l;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: methodSignatureMapping.kt */
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {
    public static final JvmTypeFactoryImpl INSTANCE = new JvmTypeFactoryImpl();

    private JvmTypeFactoryImpl() {
    }

    public JvmType boxType(JvmType jvmType) {
        if (!(jvmType instanceof Primitive)) {
            return jvmType;
        }
        Primitive primitive = (Primitive) jvmType;
        if (primitive.getJvmPrimitiveType() == null) {
            return jvmType;
        }
        JvmClassName byFqNameWithoutInnerClasses = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName());
        Intrinsics.checkReturnedValueIsNotNull((Object) byFqNameWithoutInnerClasses, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String internalName = byFqNameWithoutInnerClasses.getInternalName();
        Intrinsics.checkReturnedValueIsNotNull((Object) internalName, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return createObjectType(internalName);
    }

    public JvmType createFromString(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        JvmType jvmType;
        boolean z = false;
        boolean z2 = str.length() > 0;
        if (!C13147x.f29590a || z2) {
            char charAt = str.charAt(0);
            JvmPrimitiveType[] values = JvmPrimitiveType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jvmPrimitiveType = null;
                    break;
                }
                jvmPrimitiveType = values[i];
                if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                    break;
                }
                i++;
            }
            if (jvmPrimitiveType != null) {
                return new Primitive(jvmPrimitiveType);
            }
            if (charAt == 'V') {
                jvmType = new Primitive(null);
            } else if (charAt != '[') {
                if (charAt == 'L' && C12833x.m40169b((CharSequence) str, ';', false, 2, (Object) null)) {
                    z = true;
                }
                if (!C13147x.f29590a || z) {
                    String substring = str.substring(1, str.length() - 1);
                    Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    jvmType = new Object(substring);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type that is not primitive nor array should be Object, but '");
                    sb.append(str);
                    sb.append("' was found");
                    throw new AssertionError(sb.toString());
                }
            } else {
                String substring2 = str.substring(1);
                Intrinsics.checkReturnedValueIsNotNull((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                jvmType = new Array(createFromString(substring2));
            }
            return jvmType;
        }
        throw new AssertionError("empty string as JvmType");
    }

    public Object createObjectType(String str) {
        return new Object(str);
    }

    public JvmType getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }

    public String toString(JvmType jvmType) {
        if (jvmType instanceof Array) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(toString(((Array) jvmType).getElementType()));
            return sb.toString();
        } else if (jvmType instanceof Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((Primitive) jvmType).getJvmPrimitiveType();
            if (jvmPrimitiveType != null) {
                String desc = jvmPrimitiveType.getDesc();
                if (desc != null) {
                    return desc;
                }
            }
            return "V";
        } else if (jvmType instanceof Object) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("L");
            sb2.append(((Object) jvmType).getInternalName());
            sb2.append(";");
            return sb2.toString();
        } else {
            throw new C12898l();
        }
    }
}
