package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: KotlinTypeFactory.kt */
public final class KotlinTypeFactory {
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    private KotlinTypeFactory() {
    }

    private final MemberScope computeMemberScope(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if (declarationDescriptor instanceof TypeParameterDescriptor) {
            return declarationDescriptor.getDefaultType().getMemberScope();
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            if (list.isEmpty()) {
                return ((ClassDescriptor) declarationDescriptor).getDefaultType().getMemberScope();
            }
            MemberScope memberScope = ((ClassDescriptor) declarationDescriptor).getMemberScope(TypeConstructorSubstitution.Companion.create(typeConstructor, list));
            Intrinsics.checkReturnedValueIsNotNull((Object) memberScope, "descriptor.getMemberScop…(constructor, arguments))");
            return memberScope;
        } else if (declarationDescriptor instanceof TypeAliasDescriptor) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scope for abbreviation: ");
            sb.append(((TypeAliasDescriptor) declarationDescriptor).getName());
            MemberScope createErrorScope = ErrorUtils.createErrorScope(sb.toString(), true);
            Intrinsics.checkReturnedValueIsNotNull((Object) createErrorScope, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            return createErrorScope;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported classifier: ");
            sb2.append(declarationDescriptor);
            sb2.append(" for constructor: ");
            sb2.append(typeConstructor);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static final UnwrappedType flexibleType(SimpleType simpleType, SimpleType simpleType2) {
        if (Intrinsics.areEqual((Object) simpleType, (Object) simpleType2)) {
            return simpleType;
        }
        return new FlexibleTypeImpl(simpleType, simpleType2);
    }

    public static final SimpleType integerLiteralType(Annotations annotations, IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        List a = C13185o.m40513a();
        MemberScope createErrorScope = ErrorUtils.createErrorScope("Scope for integer literal type", true);
        Intrinsics.checkReturnedValueIsNotNull((Object) createErrorScope, "ErrorUtils.createErrorSc…eger literal type\", true)");
        return simpleTypeWithNonTrivialMemberScope(annotations, integerLiteralTypeConstructor, a, z, createErrorScope);
    }

    public static final SimpleType simpleNotNullType(Annotations annotations, ClassDescriptor classDescriptor, List<? extends TypeProjection> list) {
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor, "descriptor.typeConstructor");
        return simpleType(annotations, typeConstructor, list, false);
    }

    public static final SimpleType simpleType(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        if (!annotations.isEmpty() || !list.isEmpty() || z || typeConstructor.getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(annotations, typeConstructor, list, z, INSTANCE.computeMemberScope(typeConstructor, list));
        }
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            Intrinsics.checkReturnedValueIsNotNull((Object) declarationDescriptor, "constructor.declarationDescriptor!!");
            SimpleType defaultType = declarationDescriptor.getDefaultType();
            Intrinsics.checkReturnedValueIsNotNull((Object) defaultType, "constructor.declarationDescriptor!!.defaultType");
            return defaultType;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public static final SimpleType simpleTypeWithNonTrivialMemberScope(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z, MemberScope memberScope) {
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z, memberScope);
        if (annotations.isEmpty()) {
            return simpleTypeImpl;
        }
        return new AnnotatedSimpleType(simpleTypeImpl, annotations);
    }
}
