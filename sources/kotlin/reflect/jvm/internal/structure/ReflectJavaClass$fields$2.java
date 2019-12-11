package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "p1", "Ljava/lang/reflect/Field;", "Lkotlin/ParameterName;", "name", "member", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClass.kt */
final /* synthetic */ class ReflectJavaClass$fields$2 extends C12879i implements Function1<Field, ReflectJavaField> {
    public static final ReflectJavaClass$fields$2 INSTANCE = new ReflectJavaClass$fields$2();

    ReflectJavaClass$fields$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(ReflectJavaField.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    public final ReflectJavaField invoke(Field field) {
        return new ReflectJavaField(field);
    }
}
