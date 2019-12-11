package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* compiled from: AbstractTypeAliasDescriptor.kt */
public final class AbstractTypeAliasDescriptor$typeConstructor$1 implements TypeConstructor {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    AbstractTypeAliasDescriptor$typeConstructor$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.this$0 = abstractTypeAliasDescriptor;
    }

    public KotlinBuiltIns getBuiltIns() {
        return DescriptorUtilsKt.getBuiltIns(getDeclarationDescriptor());
    }

    public List<TypeParameterDescriptor> getParameters() {
        return this.this$0.getTypeConstructorTypeParameters();
    }

    public Collection<KotlinType> getSupertypes() {
        Collection<KotlinType> supertypes = getDeclarationDescriptor().getUnderlyingType().getConstructor().getSupertypes();
        Intrinsics.checkReturnedValueIsNotNull((Object) supertypes, "declarationDescriptor.un…pe.constructor.supertypes");
        return supertypes;
    }

    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[typealias ");
        sb.append(getDeclarationDescriptor().getName().asString());
        sb.append(']');
        return sb.toString();
    }

    public TypeAliasDescriptor getDeclarationDescriptor() {
        return this.this$0;
    }
}
