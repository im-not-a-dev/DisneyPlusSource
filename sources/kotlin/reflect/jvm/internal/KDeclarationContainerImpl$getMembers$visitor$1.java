package kotlin.reflect.jvm.internal;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, mo31007d2 = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$getMembers$visitor$1", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "visitConstructorDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "data", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KDeclarationContainerImpl.kt */
public final class KDeclarationContainerImpl$getMembers$visitor$1 extends DeclarationDescriptorVisitorEmptyBodies<KCallableImpl<?>, C13145v> {
    final /* synthetic */ KDeclarationContainerImpl this$0;

    KDeclarationContainerImpl$getMembers$visitor$1(KDeclarationContainerImpl kDeclarationContainerImpl) {
        this.this$0 = kDeclarationContainerImpl;
    }

    public KCallableImpl<?> visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, C13145v vVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("No constructors should appear in this scope: ");
        sb.append(constructorDescriptor);
        throw new IllegalStateException(sb.toString());
    }

    public KCallableImpl<?> visitFunctionDescriptor(FunctionDescriptor functionDescriptor, C13145v vVar) {
        return new KFunctionImpl(this.this$0, functionDescriptor);
    }

    public KCallableImpl<?> visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, C13145v vVar) {
        return this.this$0.createProperty(propertyDescriptor);
    }
}
