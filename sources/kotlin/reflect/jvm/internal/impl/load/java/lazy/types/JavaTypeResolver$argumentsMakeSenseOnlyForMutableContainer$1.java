package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

/* compiled from: JavaTypeResolver.kt */
final class JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 extends C12881k implements Function1<JavaType, Boolean> {
    public static final JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 INSTANCE = new JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1();

    JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((JavaType) obj));
    }

    public final boolean invoke(JavaType javaType) {
        if (!(javaType instanceof JavaWildcardType)) {
            javaType = null;
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        return (javaWildcardType == null || javaWildcardType.getBound() == null || javaWildcardType.isExtends()) ? false : true;
    }
}
