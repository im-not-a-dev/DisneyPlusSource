package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 */
/* compiled from: findClassInModule.kt */
final /* synthetic */ class C12930x24bfe126 extends C12879i implements Function1<ClassId, ClassId> {
    public static final C12930x24bfe126 INSTANCE = new C12930x24bfe126();

    C12930x24bfe126() {
        super(1);
    }

    public final String getName() {
        return "getOuterClassId";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(ClassId.class);
    }

    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    public final ClassId invoke(ClassId classId) {
        return classId.getOuterClassId();
    }
}
