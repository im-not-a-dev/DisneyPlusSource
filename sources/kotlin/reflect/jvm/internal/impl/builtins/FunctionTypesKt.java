package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* compiled from: functionTypes.kt */
public final class FunctionTypesKt {
    public static final SimpleType createFunctionType(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> list, List<Name> list2, KotlinType kotlinType2, boolean z) {
        List functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, list, list2, kotlinType2, kotlinBuiltIns);
        int size = list.size();
        if (kotlinType != null) {
            size++;
        }
        ClassDescriptor suspendFunction = z ? kotlinBuiltIns.getSuspendFunction(size) : kotlinBuiltIns.getFunction(size);
        Intrinsics.checkReturnedValueIsNotNull((Object) suspendFunction, "if (suspendFunction) bui…tFunction(parameterCount)");
        if (kotlinType != null) {
            FqName fqName = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
            String str = "KotlinBuiltIns.FQ_NAMES.extensionFunctionType";
            Intrinsics.checkReturnedValueIsNotNull((Object) fqName, str);
            if (annotations.findAnnotation(fqName) == null) {
                Companion companion = Annotations.Companion;
                FqName fqName2 = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
                Intrinsics.checkReturnedValueIsNotNull((Object) fqName2, str);
                annotations = companion.create(C13199w.m40581d((Iterable) annotations, (Object) new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName2, C13173j0.m40350a())));
            }
        }
        return KotlinTypeFactory.simpleNotNullType(annotations, suspendFunction, functionTypeArgumentProjections);
    }

    public static /* synthetic */ SimpleType createFunctionType$default(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List list, List list2, KotlinType kotlinType2, boolean z, int i, Object obj) {
        return createFunctionType(kotlinBuiltIns, annotations, kotlinType, list, list2, kotlinType2, (i & 64) != 0 ? false : z);
    }

    public static final Name extractParameterNameFromFunctionTypeArgument(KotlinType kotlinType) {
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.FQ_NAMES.parameterName;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
        AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
        if (findAnnotation != null) {
            Object n = C13199w.m40603n(findAnnotation.getAllValueArguments().values());
            if (!(n instanceof StringValue)) {
                n = null;
            }
            StringValue stringValue = (StringValue) n;
            if (stringValue != null) {
                String str = (String) stringValue.getValue();
                if (str != null) {
                    if (!Name.isValidIdentifier(str)) {
                        str = null;
                    }
                    if (str != null) {
                        return Name.identifier(str);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r2.isSpecial() == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType r9, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r10, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> r11, kotlin.reflect.jvm.internal.impl.types.KotlinType r12, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L_0x000c
            r4 = 1
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            int r1 = r1 + r4
            int r1 = r1 + r3
            r0.<init>(r1)
            r1 = 0
            if (r9 == 0) goto L_0x001a
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r9)
            goto L_0x001b
        L_0x001a:
            r9 = r1
        L_0x001b:
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(r0, r9)
            java.util.Iterator r9 = r10.iterator()
        L_0x0022:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x008f
            java.lang.Object r10 = r9.next()
            int r3 = r2 + 1
            if (r2 < 0) goto L_0x008b
            kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r10
            if (r11 == 0) goto L_0x0043
            java.lang.Object r2 = r11.get(r2)
            kotlin.reflect.jvm.internal.impl.name.Name r2 = (kotlin.reflect.jvm.internal.impl.name.Name) r2
            if (r2 == 0) goto L_0x0043
            boolean r4 = r2.isSpecial()
            if (r4 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            if (r2 == 0) goto L_0x0082
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor r4 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$FqNames r5 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES
            kotlin.reflect.jvm.internal.impl.name.FqName r5 = r5.parameterName
            java.lang.String r6 = "KotlinBuiltIns.FQ_NAMES.parameterName"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r6)
            java.lang.String r6 = "name"
            kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r6)
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
            java.lang.String r2 = r2.asString()
            java.lang.String r8 = "name.asString()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r8)
            r7.<init>(r2)
            kotlin.Pair r2 = kotlin.C12907r.m40244a(r6, r7)
            java.util.Map r2 = kotlin.p590y.C13170i0.m40332a(r2)
            r4.<init>(r13, r5, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r5 = r10.getAnnotations()
            java.util.List r4 = kotlin.p590y.C13199w.m40581d(r5, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r2.create(r4)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(r10, r2)
        L_0x0082:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r10)
            r0.add(r10)
            r2 = r3
            goto L_0x0022
        L_0x008b:
            kotlin.p590y.C13180m.m40455c()
            throw r1
        L_0x008f:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r12)
            r0.add(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.List, java.util.List, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns):java.util.List");
    }

    public static final Kind getFunctionalClassKind(DeclarationDescriptor declarationDescriptor) {
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (C13147x.f29590a && !isBuiltinFunctionalType) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a function type: ");
            sb.append(kotlinType);
            throw new AssertionError(sb.toString());
        } else if (isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return ((TypeProjection) C13199w.m40589f(kotlinType.getArguments())).getType();
        } else {
            return null;
        }
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!C13147x.f29590a || isBuiltinFunctionalType) {
            KotlinType type = ((TypeProjection) C13199w.m40593h(kotlinType.getArguments())).getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "arguments.last().type");
            return type;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a function type: ");
        sb.append(kotlinType);
        throw new AssertionError(sb.toString());
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!C13147x.f29590a || isBuiltinFunctionalType) {
            List arguments = kotlinType.getArguments();
            int isBuiltinExtensionFunctionalType = isBuiltinExtensionFunctionalType(kotlinType);
            boolean z = true;
            int size = arguments.size() - 1;
            if (isBuiltinExtensionFunctionalType > size) {
                z = false;
            }
            if (!C13147x.f29590a || z) {
                return arguments.subList(isBuiltinExtensionFunctionalType, size);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not an exact function type: ");
            sb.append(kotlinType);
            throw new AssertionError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Not a function type: ");
        sb2.append(kotlinType);
        throw new AssertionError(sb2.toString());
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        return isBuiltinFunctionalType(kotlinType) && isTypeAnnotatedWithExtensionFunctionType(kotlinType);
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        Kind functionalClassKind = declarationDescriptor != null ? getFunctionalClassKind((DeclarationDescriptor) declarationDescriptor) : null;
        return functionalClassKind == Kind.Function || functionalClassKind == Kind.SuspendFunction;
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor != null ? getFunctionalClassKind((DeclarationDescriptor) declarationDescriptor) : null) == Kind.Function;
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor != null ? getFunctionalClassKind((DeclarationDescriptor) declarationDescriptor) : null) == Kind.SuspendFunction;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return annotations.findAnnotation(fqName) != null;
    }

    private static final Kind getFunctionalClassKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        BuiltInFictitiousFunctionClassFactory.Companion companion = BuiltInFictitiousFunctionClassFactory.Companion;
        String asString = fqNameUnsafe.shortName().asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "shortName().asString()");
        FqName parent = fqNameUnsafe.toSafe().parent();
        Intrinsics.checkReturnedValueIsNotNull((Object) parent, "toSafe().parent()");
        return companion.getFunctionalClassKind(asString, parent);
    }
}
