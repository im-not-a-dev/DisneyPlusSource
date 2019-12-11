package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0019\u0010\u0002\u001a\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "p1", "Ljava/lang/reflect/Constructor;", "Lkotlin/ParameterName;", "name", "member", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClass.kt */
final /* synthetic */ class ReflectJavaClass$constructors$2 extends C12879i implements Function1<Constructor<?>, ReflectJavaConstructor> {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2();

    ReflectJavaClass$constructors$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(ReflectJavaConstructor.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    public final ReflectJavaConstructor invoke(Constructor<?> constructor) {
        return new ReflectJavaConstructor(constructor);
    }
}
