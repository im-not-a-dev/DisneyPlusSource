package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: AnnotationDeserializer.kt */
public final class AnnotationDeserializer {
    private final ModuleDescriptor module;
    private final NotFoundClasses notFoundClasses;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Type.values().length];

        static {
            $EnumSwitchMapping$0[Type.BYTE.ordinal()] = 1;
            $EnumSwitchMapping$0[Type.CHAR.ordinal()] = 2;
            $EnumSwitchMapping$0[Type.SHORT.ordinal()] = 3;
            $EnumSwitchMapping$0[Type.INT.ordinal()] = 4;
            $EnumSwitchMapping$0[Type.LONG.ordinal()] = 5;
            $EnumSwitchMapping$0[Type.FLOAT.ordinal()] = 6;
            $EnumSwitchMapping$0[Type.DOUBLE.ordinal()] = 7;
            $EnumSwitchMapping$0[Type.BOOLEAN.ordinal()] = 8;
            $EnumSwitchMapping$0[Type.STRING.ordinal()] = 9;
            $EnumSwitchMapping$0[Type.CLASS.ordinal()] = 10;
            $EnumSwitchMapping$0[Type.ENUM.ordinal()] = 11;
            $EnumSwitchMapping$0[Type.ANNOTATION.ordinal()] = 12;
            $EnumSwitchMapping$0[Type.ARRAY.ordinal()] = 13;
            $EnumSwitchMapping$1[Type.CLASS.ordinal()] = 1;
            $EnumSwitchMapping$1[Type.ARRAY.ordinal()] = 2;
        }
    }

    public AnnotationDeserializer(ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses2) {
        this.module = moduleDescriptor;
        this.notFoundClasses = notFoundClasses2;
    }

    private final boolean doesValueConformToExpectedType(ConstantValue<?> constantValue, KotlinType kotlinType, Value value) {
        Type type = value.getType();
        if (type != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            if (i == 1) {
                ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
                if (!(declarationDescriptor instanceof ClassDescriptor)) {
                    declarationDescriptor = null;
                }
                ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor != null && !KotlinBuiltIns.isKClass(classDescriptor)) {
                    return false;
                }
            } else if (i == 2) {
                if ((constantValue instanceof ArrayValue) && ((List) ((ArrayValue) constantValue).getValue()).size() == value.getArrayElementList().size()) {
                    KotlinType arrayElementType = getBuiltIns().getArrayElementType(kotlinType);
                    Intrinsics.checkReturnedValueIsNotNull((Object) arrayElementType, "builtIns.getArrayElementType(expectedType)");
                    ArrayValue arrayValue = (ArrayValue) constantValue;
                    C12757d a = C13185o.m40514a((Collection) arrayValue.getValue());
                    if (!(a instanceof Collection) || !((Collection) a).isEmpty()) {
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            int b = ((C13162e0) it).mo31079b();
                            ConstantValue constantValue2 = (ConstantValue) ((List) arrayValue.getValue()).get(b);
                            Value arrayElement = value.getArrayElement(b);
                            Intrinsics.checkReturnedValueIsNotNull((Object) arrayElement, "value.getArrayElement(i)");
                            if (!doesValueConformToExpectedType(constantValue2, arrayElementType, arrayElement)) {
                                return false;
                            }
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Deserialized ArrayValue should have the same number of elements as the original array value: ");
                    sb.append(constantValue);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            return true;
        }
        return Intrinsics.areEqual((Object) constantValue.getType(this.module), (Object) kotlinType);
    }

    private final KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    private final Pair<Name, ConstantValue<?>> resolveArgument(Argument argument, Map<Name, ? extends ValueParameterDescriptor> map, NameResolver nameResolver) {
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) map.get(NameResolverUtilKt.getName(nameResolver, argument.getNameId()));
        if (valueParameterDescriptor == null) {
            return null;
        }
        Name name = NameResolverUtilKt.getName(nameResolver, argument.getNameId());
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.checkReturnedValueIsNotNull((Object) type, "parameter.type");
        Value value = argument.getValue();
        Intrinsics.checkReturnedValueIsNotNull((Object) value, "proto.value");
        return new Pair<>(name, resolveValueAndCheckExpectedType(type, value, nameResolver));
    }

    private final ClassDescriptor resolveClass(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }

    private final ConstantValue<?> resolveValueAndCheckExpectedType(KotlinType kotlinType, Value value, NameResolver nameResolver) {
        ConstantValue<?> resolveValue = resolveValue(kotlinType, value, nameResolver);
        if (!doesValueConformToExpectedType(resolveValue, kotlinType, value)) {
            resolveValue = null;
        }
        if (resolveValue != null) {
            return resolveValue;
        }
        Companion companion = ErrorValue.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected argument value: actual type ");
        sb.append(value.getType());
        sb.append(" != expected type ");
        sb.append(kotlinType);
        return companion.create(sb.toString());
    }

    public final AnnotationDescriptor deserializeAnnotation(Annotation annotation, NameResolver nameResolver) {
        String str;
        ClassDescriptor resolveClass = resolveClass(NameResolverUtilKt.getClassId(nameResolver, annotation.getId()));
        Map a = C13173j0.m40350a();
        if (annotation.getArgumentCount() != 0 && !ErrorUtils.isError(resolveClass) && DescriptorUtils.isAnnotationClass(resolveClass)) {
            Collection constructors = resolveClass.getConstructors();
            Intrinsics.checkReturnedValueIsNotNull((Object) constructors, "annotationClass.constructors");
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) C13199w.m40603n(constructors);
            if (classConstructorDescriptor != null) {
                List valueParameters = classConstructorDescriptor.getValueParameters();
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) valueParameters, 10)), 16));
                Iterator it = valueParameters.iterator();
                while (true) {
                    str = "it";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) next;
                    Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, str);
                    linkedHashMap.put(valueParameterDescriptor.getName(), next);
                }
                List<Argument> argumentList = annotation.getArgumentList();
                Intrinsics.checkReturnedValueIsNotNull((Object) argumentList, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (Argument argument : argumentList) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) argument, str);
                    Pair resolveArgument = resolveArgument(argument, linkedHashMap, nameResolver);
                    if (resolveArgument != null) {
                        arrayList.add(resolveArgument);
                    }
                }
                a = C13173j0.m40351a((Iterable) arrayList);
            }
        }
        return new AnnotationDescriptorImpl(resolveClass.getDefaultType(), a, SourceElement.NO_SOURCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveValue(kotlin.reflect.jvm.internal.impl.types.KotlinType r6, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r7, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r8) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED
            int r1 = r7.getFlags()
            java.lang.Boolean r0 = r0.get(r1)
            java.lang.String r1 = "Flags.IS_UNSIGNED.get(value.flags)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            boolean r0 = r0.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = r7.getType()
            if (r1 == 0) goto L_0x013e
            int[] r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            switch(r1) {
                case 1: goto L_0x0129;
                case 2: goto L_0x011d;
                case 3: goto L_0x0108;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00e2;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00cd;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00aa;
                case 10: goto L_0x0097;
                case 11: goto L_0x0080;
                case 12: goto L_0x006c;
                case 13: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x013e
        L_0x0026:
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory r0 = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE
            java.util.List r7 = r7.getArrayElementList()
            java.lang.String r1 = "value.arrayElementList"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.p590y.C13187p.m40525a(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0040:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r7.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r2
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r3 = r5.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.getAnyType()
            java.lang.String r4 = "builtIns.anyType"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r4)
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r2 = r5.resolveValue(r3, r2, r8)
            r1.add(r2)
            goto L_0x0040
        L_0x0066:
            kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue r6 = r0.createArrayValue(r1, r6)
            goto L_0x013d
        L_0x006c:
            kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r7 = r7.getAnnotation()
            java.lang.String r0 = "value.annotation"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r7 = r5.deserializeAnnotation(r7, r8)
            r6.<init>(r7)
            goto L_0x013d
        L_0x0080:
            kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue
            int r0 = r7.getClassId()
            kotlin.reflect.jvm.internal.impl.name.ClassId r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(r8, r0)
            int r7 = r7.getEnumValueId()
            kotlin.reflect.jvm.internal.impl.name.Name r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r8, r7)
            r6.<init>(r0, r7)
            goto L_0x013d
        L_0x0097:
            kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue
            int r0 = r7.getClassId()
            kotlin.reflect.jvm.internal.impl.name.ClassId r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(r8, r0)
            int r7 = r7.getArrayDimensionCount()
            r6.<init>(r8, r7)
            goto L_0x013d
        L_0x00aa:
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
            int r7 = r7.getStringValue()
            java.lang.String r7 = r8.getString(r7)
            r6.<init>(r7)
            goto L_0x013d
        L_0x00b9:
            kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue
            long r7 = r7.getIntValue()
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00c7
            r7 = 1
            goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            r6.<init>(r7)
            goto L_0x013d
        L_0x00cd:
            kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue
            double r7 = r7.getDoubleValue()
            r6.<init>(r7)
            goto L_0x013d
        L_0x00d8:
            kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue
            float r7 = r7.getFloatValue()
            r6.<init>(r7)
            goto L_0x013d
        L_0x00e2:
            long r6 = r7.getIntValue()
            if (r0 == 0) goto L_0x00ee
            kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue r8 = new kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue
            r8.<init>(r6)
            goto L_0x00f3
        L_0x00ee:
            kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue r8 = new kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue
            r8.<init>(r6)
        L_0x00f3:
            r6 = r8
            goto L_0x013d
        L_0x00f5:
            long r6 = r7.getIntValue()
            int r7 = (int) r6
            if (r0 == 0) goto L_0x0102
            kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue
            r6.<init>(r7)
            goto L_0x013d
        L_0x0102:
            kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue
            r6.<init>(r7)
            goto L_0x013d
        L_0x0108:
            long r6 = r7.getIntValue()
            int r7 = (int) r6
            short r6 = (short) r7
            if (r0 == 0) goto L_0x0116
            kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue
            r7.<init>(r6)
            goto L_0x011b
        L_0x0116:
            kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue
            r7.<init>(r6)
        L_0x011b:
            r6 = r7
            goto L_0x013d
        L_0x011d:
            kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue
            long r7 = r7.getIntValue()
            int r8 = (int) r7
            char r7 = (char) r8
            r6.<init>(r7)
            goto L_0x013d
        L_0x0129:
            long r6 = r7.getIntValue()
            int r7 = (int) r6
            byte r6 = (byte) r7
            if (r0 == 0) goto L_0x0137
            kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue
            r7.<init>(r6)
            goto L_0x011b
        L_0x0137:
            kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue
            r7.<init>(r6)
            goto L_0x011b
        L_0x013d:
            return r6
        L_0x013e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unsupported annotation argument type: "
            r8.append(r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r7 = r7.getType()
            r8.append(r7)
            java.lang.String r7 = " (expected "
            r8.append(r7)
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.resolveValue(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver):kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue");
    }
}
