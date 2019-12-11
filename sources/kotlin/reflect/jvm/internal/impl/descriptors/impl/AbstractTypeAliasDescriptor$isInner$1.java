package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: AbstractTypeAliasDescriptor.kt */
final class AbstractTypeAliasDescriptor$isInner$1 extends C12881k implements Function1<UnwrappedType, Boolean> {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.this$0 = abstractTypeAliasDescriptor;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((UnwrappedType) obj));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        C12880j.m40222a((Object) unwrappedType, "type");
        if (KotlinTypeKt.isError(unwrappedType)) {
            return false;
        }
        ClassifierDescriptor declarationDescriptor = unwrappedType.getConstructor().getDeclarationDescriptor();
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (C12880j.m40224a((Object) ((TypeParameterDescriptor) declarationDescriptor).getContainingDeclaration(), (Object) this.this$0) ^ true)) {
            return true;
        }
        return false;
    }
}
