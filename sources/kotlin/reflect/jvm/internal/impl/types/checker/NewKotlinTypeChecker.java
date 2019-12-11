package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.C12898l;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: NewKotlinTypeChecker.kt */
public final class NewKotlinTypeChecker implements KotlinTypeChecker {
    public static final NewKotlinTypeChecker INSTANCE = new NewKotlinTypeChecker();

    private NewKotlinTypeChecker() {
    }

    public boolean equalTypes(KotlinType kotlinType, KotlinType kotlinType2) {
        return equalTypes(new ClassicTypeCheckerContext(false, false, 2, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public boolean isSubtypeOf(KotlinType kotlinType, KotlinType kotlinType2) {
        return isSubtypeOf(new ClassicTypeCheckerContext(true, false, 2, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType transformToNewType(kotlin.reflect.jvm.internal.impl.types.SimpleType r12) {
        /*
            r11 = this;
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r0 = r12.getConstructor()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl
            r2 = 1
            r3 = 10
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0082
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl r0 = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl) r0
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r1 = r0.getProjection()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r1.getProjectionKind()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r6 != r7) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            if (r1 == 0) goto L_0x002f
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            if (r1 == 0) goto L_0x002f
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r1 = r1.unwrap()
            r8 = r1
            goto L_0x0030
        L_0x002f:
            r8 = r4
        L_0x0030:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r1 = r0.getNewTypeConstructor()
            if (r1 != 0) goto L_0x0067
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r1 = r0.getProjection()
            java.util.Collection r2 = r0.getSupertypes()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r3 = kotlin.p590y.C13187p.m40525a(r2, r3)
            r5.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x004b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r3 = r3.unwrap()
            r5.add(r3)
            goto L_0x004b
        L_0x005f:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r2 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
            r2.<init>(r1, r5)
            r0.setNewTypeConstructor(r2)
        L_0x0067:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType r1 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r6 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r7 = r0.getNewTypeConstructor()
            if (r7 == 0) goto L_0x007e
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r9 = r12.getAnnotations()
            boolean r10 = r12.isMarkedNullable()
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x007e:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r4
        L_0x0082:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor
            if (r1 == 0) goto L_0x00c7
            kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor) r0
            java.util.Collection r0 = r0.getSupertypes()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.p590y.C13187p.m40525a(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0099:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
            boolean r3 = r12.isMarkedNullable()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified(r2, r3)
            r1.add(r2)
            goto L_0x0099
        L_0x00b1:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r1 = r12.getAnnotations()
            java.util.List r2 = kotlin.p590y.C13185o.m40513a()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = r12.getMemberScope()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(r1, r0, r2, r5, r12)
            return r12
        L_0x00c7:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r1 == 0) goto L_0x0115
            boolean r1 = r12.isMarkedNullable()
            if (r1 == 0) goto L_0x0115
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r0
            java.util.Collection r1 = r0.getSupertypes()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r3 = kotlin.p590y.C13187p.m40525a(r1, r3)
            r6.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x00e5:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00fa
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(r3)
            r6.add(r3)
            r3 = 1
            goto L_0x00e5
        L_0x00fa:
            if (r3 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r4 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r4.<init>(r6)
        L_0x0102:
            if (r4 == 0) goto L_0x0105
            r0 = r4
        L_0x0105:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r12 = r12.getAnnotations()
            java.util.List r1 = kotlin.p590y.C13185o.m40513a()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r2 = r0.createScopeForKotlinType()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(r12, r0, r1, r5, r2)
        L_0x0115:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.transformToNewType(kotlin.reflect.jvm.internal.impl.types.SimpleType):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    public final boolean equalTypes(ClassicTypeCheckerContext classicTypeCheckerContext, UnwrappedType unwrappedType, UnwrappedType unwrappedType2) {
        return AbstractTypeChecker.INSTANCE.equalTypes(classicTypeCheckerContext, unwrappedType, unwrappedType2);
    }

    public final boolean isSubtypeOf(ClassicTypeCheckerContext classicTypeCheckerContext, UnwrappedType unwrappedType, UnwrappedType unwrappedType2) {
        return AbstractTypeChecker.INSTANCE.isSubtypeOf(classicTypeCheckerContext, unwrappedType, unwrappedType2);
    }

    public final UnwrappedType transformToNewType(UnwrappedType unwrappedType) {
        UnwrappedType unwrappedType2;
        if (unwrappedType instanceof SimpleType) {
            unwrappedType2 = transformToNewType((SimpleType) unwrappedType);
        } else if (unwrappedType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            SimpleType transformToNewType = transformToNewType(flexibleType.getLowerBound());
            SimpleType transformToNewType2 = transformToNewType(flexibleType.getUpperBound());
            if (transformToNewType == flexibleType.getLowerBound() && transformToNewType2 == flexibleType.getUpperBound()) {
                unwrappedType2 = unwrappedType;
            } else {
                unwrappedType2 = KotlinTypeFactory.flexibleType(transformToNewType, transformToNewType2);
            }
        } else {
            throw new C12898l();
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedType2, unwrappedType);
    }
}
