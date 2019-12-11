package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0012\u001a\u00020\r*\u00020\u0002H\u0002\u001a\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0004\u0018\u00010\u0014H\u0000\u001a\u0012\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0015"}, mo31007d2 = {"expectedReceiverType", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "coerceToExpectedReceiverType", "", "descriptor", "createInlineClassAwareCallerIfNeeded", "Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "isDefault", "", "getBoxMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "getUnboxMethod", "hasInlineClassReceiver", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: InlineClassAwareCaller.kt */
public final class InlineClassAwareCallerKt {
    public static final Object coerceToExpectedReceiverType(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        if ((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) callableMemberDescriptor)) {
            return obj;
        }
        KotlinType expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor);
        if (expectedReceiverType != null) {
            Class inlineClass = toInlineClass(expectedReceiverType);
            if (inlineClass != null) {
                Method unboxMethod = getUnboxMethod(inlineClass, callableMemberDescriptor);
                if (unboxMethod != null) {
                    obj = unboxMethod.invoke(obj, new Object[0]);
                }
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(r0) == true) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (hasInlineClassReceiver(r6) != false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.jvm.internal.calls.Caller<M> createInlineClassAwareCallerIfNeeded(kotlin.reflect.jvm.internal.calls.Caller<? extends M> r5, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6, boolean r7) {
        /*
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x005a
            java.util.List r0 = r6.getValueParameters()
            java.lang.String r3 = "descriptor.valueParameters"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x001d
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x0042
        L_0x001d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001b
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r3
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r3.getType()
            java.lang.String r4 = "it.type"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(r3)
            if (r3 == 0) goto L_0x0021
            r0 = 1
        L_0x0042:
            if (r0 != 0) goto L_0x005a
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r6.getReturnType()
            if (r0 == 0) goto L_0x0050
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(r0)
            if (r0 == r2) goto L_0x005a
        L_0x0050:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller
            if (r0 != 0) goto L_0x005b
            boolean r0 = hasInlineClassReceiver(r6)
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r1 = 1
        L_0x005b:
            if (r1 == 0) goto L_0x0063
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller r0 = new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller
            r0.<init>(r6, r5, r7)
            r5 = r0
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(kotlin.reflect.jvm.internal.calls.Caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):kotlin.reflect.jvm.internal.calls.Caller");
    }

    public static /* synthetic */ Caller createInlineClassAwareCallerIfNeeded$default(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createInlineClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z);
    }

    public static final Method getBoxMethod(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", new Class[]{getUnboxMethod(cls, callableMemberDescriptor).getReturnType()});
            Intrinsics.checkReturnedValueIsNotNull((Object) declaredMethod, "getDeclaredMethod(\"box\" …d(descriptor).returnType)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("No box method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(callableMemberDescriptor);
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    private static final KotlinType getExpectedReceiverType(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        if (classDescriptor != null) {
            return classDescriptor.getDefaultType();
        }
        return null;
    }

    public static final Method getUnboxMethod(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.checkReturnedValueIsNotNull((Object) declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("No unbox method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(callableMemberDescriptor);
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    private static final boolean hasInlineClassReceiver(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor);
        return expectedReceiverType != null && InlineClassesUtilsKt.isInlineClassType(expectedReceiverType);
    }

    public static final Class<?> toInlineClass(KotlinType kotlinType) {
        return toInlineClass((DeclarationDescriptor) kotlinType.getConstructor().getDeclarationDescriptor());
    }

    public static final Class<?> toInlineClass(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof ClassDescriptor) {
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            if (classDescriptor.isInline()) {
                Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                if (javaClass != null) {
                    return javaClass;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Class object for the class ");
                sb.append(classDescriptor.getName());
                sb.append(" cannot be found (classId=");
                sb.append(DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor));
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
        }
        return null;
    }
}
