package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1 */
/* compiled from: DescriptorEquivalenceForOverrides.kt */
final class C13088x10bda471 implements TypeConstructorEquality {

    /* renamed from: $a */
    final /* synthetic */ CallableDescriptor f29570$a;

    /* renamed from: $b */
    final /* synthetic */ CallableDescriptor f29571$b;

    C13088x10bda471(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f29570$a = callableDescriptor;
        this.f29571$b = callableDescriptor2;
    }

    /* renamed from: invoke */
    public final boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (C12880j.m40224a((Object) typeConstructor, (Object) typeConstructor2)) {
            return true;
        }
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        ClassifierDescriptor declarationDescriptor2 = typeConstructor2.getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof TypeParameterDescriptor) || !(declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return false;
        }
        return DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>(this) {
            final /* synthetic */ C13088x10bda471 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(invoke((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
            }

            public final boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
                return C12880j.m40224a((Object) declarationDescriptor, (Object) this.this$0.f29570$a) && C12880j.m40224a((Object) declarationDescriptor2, (Object) this.this$0.f29571$b);
            }
        });
    }
}
