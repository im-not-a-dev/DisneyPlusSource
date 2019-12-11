package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: JavaTypeResolver.kt */
final class JavaTypeResolver$transformJavaClassifierType$1 extends C12881k implements Function0<SimpleType> {
    final /* synthetic */ JavaClassifierType $javaType;

    JavaTypeResolver$transformJavaClassifierType$1(JavaClassifierType javaClassifierType) {
        this.$javaType = javaClassifierType;
        super(0);
    }

    public final SimpleType invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unresolved java class ");
        sb.append(this.$javaType.getPresentableText());
        SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
        C12880j.m40222a((Object) createErrorType, "ErrorUtils.createErrorTy…vaType.presentableText}\")");
        return createErrorType;
    }
}
