package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.util.List;
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
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;

public final class BuiltInsProtoBuf {
    public static final GeneratedExtension<Class, List<Annotation>> classAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Class.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<Property, Value> compileTimeValue = GeneratedMessageLite.newSingularGeneratedExtension(Property.getDefaultInstance(), Value.getDefaultInstance(), Value.getDefaultInstance(), null, 151, FieldType.MESSAGE, Value.class);
    public static final GeneratedExtension<Constructor, List<Annotation>> constructorAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Constructor.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<EnumEntry, List<Annotation>> enumEntryAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(EnumEntry.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<Function, List<Annotation>> functionAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Function.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<Package, Integer> packageFqName = GeneratedMessageLite.newSingularGeneratedExtension(Package.getDefaultInstance(), Integer.valueOf(0), null, null, 151, FieldType.INT32, Integer.class);
    public static final GeneratedExtension<ValueParameter, List<Annotation>> parameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ValueParameter.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<Property, List<Annotation>> propertyAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Property.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<Property, List<Annotation>> propertyGetterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Property.getDefaultInstance(), Annotation.getDefaultInstance(), null, 152, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<Property, List<Annotation>> propertySetterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Property.getDefaultInstance(), Annotation.getDefaultInstance(), null, 153, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<Type, List<Annotation>> typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Type.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<TypeParameter, List<Annotation>> typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(TypeParameter.getDefaultInstance(), Annotation.getDefaultInstance(), null, 150, FieldType.MESSAGE, false, Annotation.class);

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(packageFqName);
        extensionRegistryLite.add(classAnnotation);
        extensionRegistryLite.add(constructorAnnotation);
        extensionRegistryLite.add(functionAnnotation);
        extensionRegistryLite.add(propertyAnnotation);
        extensionRegistryLite.add(propertyGetterAnnotation);
        extensionRegistryLite.add(propertySetterAnnotation);
        extensionRegistryLite.add(compileTimeValue);
        extensionRegistryLite.add(enumEntryAnnotation);
        extensionRegistryLite.add(parameterAnnotation);
        extensionRegistryLite.add(typeAnnotation);
        extensionRegistryLite.add(typeParameterAnnotation);
    }
}
