package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;

/* compiled from: BuiltInSerializerProtocol.kt */
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {
    public static final BuiltInSerializerProtocol INSTANCE = new BuiltInSerializerProtocol();

    private BuiltInSerializerProtocol() {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        BuiltInsProtoBuf.registerAllExtensions(newInstance);
        Intrinsics.checkReturnedValueIsNotNull((Object) newInstance, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        GeneratedExtension<Package, Integer> generatedExtension = BuiltInsProtoBuf.packageFqName;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension, "BuiltInsProtoBuf.packageFqName");
        GeneratedExtension<Constructor, List<Annotation>> generatedExtension2 = BuiltInsProtoBuf.constructorAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension2, "BuiltInsProtoBuf.constructorAnnotation");
        GeneratedExtension<Class, List<Annotation>> generatedExtension3 = BuiltInsProtoBuf.classAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension3, "BuiltInsProtoBuf.classAnnotation");
        GeneratedExtension<Function, List<Annotation>> generatedExtension4 = BuiltInsProtoBuf.functionAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension4, "BuiltInsProtoBuf.functionAnnotation");
        GeneratedExtension<Property, List<Annotation>> generatedExtension5 = BuiltInsProtoBuf.propertyAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension5, "BuiltInsProtoBuf.propertyAnnotation");
        GeneratedExtension<Property, List<Annotation>> generatedExtension6 = BuiltInsProtoBuf.propertyGetterAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension6, "BuiltInsProtoBuf.propertyGetterAnnotation");
        GeneratedExtension<Property, List<Annotation>> generatedExtension7 = BuiltInsProtoBuf.propertySetterAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension7, "BuiltInsProtoBuf.propertySetterAnnotation");
        GeneratedExtension<EnumEntry, List<Annotation>> generatedExtension8 = BuiltInsProtoBuf.enumEntryAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension8, "BuiltInsProtoBuf.enumEntryAnnotation");
        GeneratedExtension<Property, Value> generatedExtension9 = BuiltInsProtoBuf.compileTimeValue;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension9, "BuiltInsProtoBuf.compileTimeValue");
        GeneratedExtension<ValueParameter, List<Annotation>> generatedExtension10 = BuiltInsProtoBuf.parameterAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension10, "BuiltInsProtoBuf.parameterAnnotation");
        GeneratedExtension<Type, List<Annotation>> generatedExtension11 = BuiltInsProtoBuf.typeAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension11, "BuiltInsProtoBuf.typeAnnotation");
        GeneratedExtension<TypeParameter, List<Annotation>> generatedExtension12 = BuiltInsProtoBuf.typeParameterAnnotation;
        Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension12, "BuiltInsProtoBuf.typeParameterAnnotation");
        super(newInstance, generatedExtension, generatedExtension2, generatedExtension3, generatedExtension4, generatedExtension5, generatedExtension6, generatedExtension7, generatedExtension8, generatedExtension9, generatedExtension10, generatedExtension11, generatedExtension12);
    }

    private final String shortName(FqName fqName) {
        if (fqName.isRoot()) {
            return "default-package";
        }
        String asString = fqName.shortName().asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "fqName.shortName().asString()");
        return asString;
    }

    public final String getBuiltInsFileName(FqName fqName) {
        StringBuilder sb = new StringBuilder();
        sb.append(shortName(fqName));
        sb.append(".");
        sb.append("kotlin_builtins");
        return sb.toString();
    }

    public final String getBuiltInsFilePath(FqName fqName) {
        StringBuilder sb = new StringBuilder();
        String asString = fqName.asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "fqName.asString()");
        sb.append(C12832w.m40115a(asString, '.', '/', false, 4, (Object) null));
        sb.append("/");
        sb.append(getBuiltInsFileName(fqName));
        return sb.toString();
    }
}
