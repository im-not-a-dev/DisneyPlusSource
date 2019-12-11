package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C12898l;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: constantValues.kt */
public final class KClassValue extends ConstantValue<Value> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: constantValues.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ConstantValue<?> create(KotlinType kotlinType) {
            KClassValue kClassValue = null;
            if (KotlinTypeKt.isError(kotlinType)) {
                return null;
            }
            KotlinType kotlinType2 = kotlinType;
            int i = 0;
            while (KotlinBuiltIns.isArray(kotlinType2)) {
                kotlinType2 = ((TypeProjection) C13199w.m40599k(kotlinType2.getArguments())).getType();
                C12880j.m40222a((Object) kotlinType2, "type.arguments.single().type");
                i++;
            }
            ClassifierDescriptor declarationDescriptor = kotlinType2.getConstructor().getDeclarationDescriptor();
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassId classId = DescriptorUtilsKt.getClassId(declarationDescriptor);
                if (classId == null) {
                    return new KClassValue((Value) new LocalClass(kotlinType));
                }
                kClassValue = new KClassValue(classId, i);
            } else if (declarationDescriptor instanceof TypeParameterDescriptor) {
                ClassId classId2 = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.any.toSafe());
                C12880j.m40222a((Object) classId2, "ClassId.topLevel(KotlinB…ns.FQ_NAMES.any.toSafe())");
                kClassValue = new KClassValue(classId2, 0);
            }
            return kClassValue;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: constantValues.kt */
    public static abstract class Value {

        /* compiled from: constantValues.kt */
        public static final class LocalClass extends Value {
            private final KotlinType type;

            public LocalClass(KotlinType kotlinType) {
                super(null);
                this.type = kotlinType;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.type, (java.lang.Object) ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) r2).type) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass
                    if (r0 == 0) goto L_0x0013
                    kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue$Value$LocalClass r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) r2
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r1.type
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = r2.type
                    boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass.equals(java.lang.Object):boolean");
            }

            public final KotlinType getType() {
                return this.type;
            }

            public int hashCode() {
                KotlinType kotlinType = this.type;
                if (kotlinType != null) {
                    return kotlinType.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("LocalClass(type=");
                sb.append(this.type);
                sb.append(")");
                return sb.toString();
            }
        }

        /* compiled from: constantValues.kt */
        public static final class NormalClass extends Value {
            private final ClassLiteralValue value;

            public NormalClass(ClassLiteralValue classLiteralValue) {
                super(null);
                this.value = classLiteralValue;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.value, (java.lang.Object) ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) r2).value) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass
                    if (r0 == 0) goto L_0x0013
                    kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue$Value$NormalClass r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) r2
                    kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue r0 = r1.value
                    kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue r2 = r2.value
                    boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass.equals(java.lang.Object):boolean");
            }

            public final int getArrayDimensions() {
                return this.value.getArrayNestedness();
            }

            public final ClassId getClassId() {
                return this.value.getClassId();
            }

            public final ClassLiteralValue getValue() {
                return this.value;
            }

            public int hashCode() {
                ClassLiteralValue classLiteralValue = this.value;
                if (classLiteralValue != null) {
                    return classLiteralValue.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("NormalClass(value=");
                sb.append(this.value);
                sb.append(")");
                return sb.toString();
            }
        }

        private Value() {
        }

        public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KClassValue(Value value) {
        super(value);
    }

    public final KotlinType getArgumentType(ModuleDescriptor moduleDescriptor) {
        Value value = (Value) getValue();
        if (value instanceof LocalClass) {
            return ((LocalClass) getValue()).getType();
        }
        if (value instanceof NormalClass) {
            ClassLiteralValue value2 = ((NormalClass) getValue()).getValue();
            ClassId component1 = value2.component1();
            int component2 = value2.component2();
            ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, component1);
            if (findClassAcrossModuleDependencies != null) {
                SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
                C12880j.m40222a((Object) defaultType, "descriptor.defaultType");
                KotlinType replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
                for (int i = 0; i < component2; i++) {
                    replaceArgumentsWithStarProjections = moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, replaceArgumentsWithStarProjections);
                    C12880j.m40222a((Object) replaceArgumentsWithStarProjections, "module.builtIns.getArray…Variance.INVARIANT, type)");
                }
                return replaceArgumentsWithStarProjections;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unresolved type: ");
            sb.append(component1);
            sb.append(" (arrayDimensions=");
            sb.append(component2);
            sb.append(')');
            SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
            C12880j.m40222a((Object) createErrorType, "ErrorUtils.createErrorTy…sions=$arrayDimensions)\")");
            return createErrorType;
        }
        throw new C12898l();
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        Annotations empty = Annotations.Companion.getEMPTY();
        ClassDescriptor kClass = moduleDescriptor.getBuiltIns().getKClass();
        C12880j.m40222a((Object) kClass, "module.builtIns.kClass");
        return KotlinTypeFactory.simpleNotNullType(empty, kClass, C13183n.m40498a(new TypeProjectionImpl(getArgumentType(moduleDescriptor))));
    }

    public KClassValue(ClassLiteralValue classLiteralValue) {
        this((Value) new NormalClass(classLiteralValue));
    }

    public KClassValue(ClassId classId, int i) {
        this(new ClassLiteralValue(classId, i));
    }
}
