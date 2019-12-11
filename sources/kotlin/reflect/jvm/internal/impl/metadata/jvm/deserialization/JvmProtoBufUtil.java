package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;

/* compiled from: JvmProtoBufUtil.kt */
public final class JvmProtoBufUtil {
    private static final ExtensionRegistryLite EXTENSION_REGISTRY;
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    static {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(newInstance);
        Intrinsics.checkReturnedValueIsNotNull((Object) newInstance, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        EXTENSION_REGISTRY = newInstance;
    }

    private JvmProtoBufUtil() {
    }

    public static /* synthetic */ Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil, Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z);
    }

    public static final boolean isMovedFromInterfaceCompanion(Property property) {
        BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = property.getExtension(JvmProtoBuf.flags);
        Intrinsics.checkReturnedValueIsNotNull(extension, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean bool = is_moved_from_interface_companion.get(((Number) extension).intValue());
        Intrinsics.checkReturnedValueIsNotNull((Object) bool, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return bool.booleanValue();
    }

    private final String mapTypeDefault(Type type, NameResolver nameResolver) {
        if (type.hasClassName()) {
            return ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName()));
        }
        return null;
    }

    public static final Pair<JvmNameResolver, Class> readClassDataFrom(String[] strArr, String[] strArr2) {
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        Intrinsics.checkReturnedValueIsNotNull((Object) decodeBytes, "BitEncoding.decodeBytes(data)");
        return readClassDataFrom(decodeBytes, strArr2);
    }

    public static final Pair<JvmNameResolver, Function> readFunctionDataFrom(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(strArr));
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr2), Function.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    private final JvmNameResolver readNameResolver(InputStream inputStream, String[] strArr) {
        StringTableTypes parseDelimitedFrom = StringTableTypes.parseDelimitedFrom(inputStream, EXTENSION_REGISTRY);
        Intrinsics.checkReturnedValueIsNotNull((Object) parseDelimitedFrom, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new JvmNameResolver(parseDelimitedFrom, strArr);
    }

    public static final Pair<JvmNameResolver, Package> readPackageDataFrom(String[] strArr, String[] strArr2) {
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        Intrinsics.checkReturnedValueIsNotNull((Object) decodeBytes, "BitEncoding.decodeBytes(data)");
        return readPackageDataFrom(decodeBytes, strArr2);
    }

    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    public final Method getJvmConstructorSignature(Constructor constructor, NameResolver nameResolver, TypeTable typeTable) {
        String str;
        GeneratedExtension<Constructor, JvmMethodSignature> generatedExtension = JvmProtoBuf.constructorSignature;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension, "JvmProtoBuf.constructorSignature");
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(constructor, generatedExtension);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ValueParameter> valueParameterList = constructor.getValueParameterList();
            Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterList, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) valueParameterList, 10));
            for (ValueParameter valueParameter : valueParameterList) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameter, "it");
                String mapTypeDefault = jvmProtoBufUtil.mapTypeDefault(ProtoTypeTableUtilKt.type(valueParameter, typeTable), nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList.add(mapTypeDefault);
            }
            str = C13199w.m40559a(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            str = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new Method(string, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r4 != null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6, boolean r7) {
        /*
            r3 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature
            java.lang.String r1 = "JvmProtoBuf.propertySignature"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r4, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 == 0) goto L_0x0057
            boolean r2 = r0.hasField()
            if (r2 == 0) goto L_0x001b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.getField()
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 != 0) goto L_0x0021
            if (r7 == 0) goto L_0x0021
            return r1
        L_0x0021:
            if (r0 == 0) goto L_0x002e
            boolean r7 = r0.hasName()
            if (r7 == 0) goto L_0x002e
            int r7 = r0.getName()
            goto L_0x0032
        L_0x002e:
            int r7 = r4.getName()
        L_0x0032:
            if (r0 == 0) goto L_0x0043
            boolean r2 = r0.hasDesc()
            if (r2 == 0) goto L_0x0043
            int r4 = r0.getDesc()
            java.lang.String r4 = r5.getString(r4)
            goto L_0x004d
        L_0x0043:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(r4, r6)
            java.lang.String r4 = r3.mapTypeDefault(r4, r5)
            if (r4 == 0) goto L_0x0057
        L_0x004d:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field");
    }

    public final Method getJvmMethodSignature(Function function, NameResolver nameResolver, TypeTable typeTable) {
        String str;
        Function function2 = function;
        NameResolver nameResolver2 = nameResolver;
        TypeTable typeTable2 = typeTable;
        GeneratedExtension<Function, JvmMethodSignature> generatedExtension = JvmProtoBuf.methodSignature;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension, "JvmProtoBuf.methodSignature");
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(function2, generatedExtension);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List b = C13185o.m40517b((Object) ProtoTypeTableUtilKt.receiverType(function2, typeTable2));
            List<ValueParameter> valueParameterList = function.getValueParameterList();
            Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterList, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) valueParameterList, 10));
            for (ValueParameter valueParameter : valueParameterList) {
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameter, "it");
                arrayList.add(ProtoTypeTableUtilKt.type(valueParameter, typeTable2));
            }
            List<Type> d = C13199w.m40583d((Collection) b, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) d, 10));
            for (Type mapTypeDefault : d) {
                String mapTypeDefault2 = INSTANCE.mapTypeDefault(mapTypeDefault, nameResolver2);
                if (mapTypeDefault2 == null) {
                    return null;
                }
                arrayList2.add(mapTypeDefault2);
            }
            String mapTypeDefault3 = mapTypeDefault(ProtoTypeTableUtilKt.returnType(function2, typeTable2), nameResolver2);
            if (mapTypeDefault3 == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C13199w.m40559a(arrayList2, "", "(", ")", 0, null, null, 56, null));
            sb.append(mapTypeDefault3);
            str = sb.toString();
        } else {
            str = nameResolver2.getString(jvmMethodSignature.getDesc());
        }
        return new Method(nameResolver2.getString(name), str);
    }

    public static final Pair<JvmNameResolver, Class> readClassDataFrom(byte[] bArr, String[] strArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), Class.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    public static final Pair<JvmNameResolver, Package> readPackageDataFrom(byte[] bArr, String[] strArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), Package.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }
}
