package kotlin.reflect.jvm.internal.impl.serialization;

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
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;

/* compiled from: SerializerExtensionProtocol.kt */
public class SerializerExtensionProtocol {
    private final GeneratedExtension<Class, List<Annotation>> classAnnotation;
    private final GeneratedExtension<Property, Value> compileTimeValue;
    private final GeneratedExtension<Constructor, List<Annotation>> constructorAnnotation;
    private final GeneratedExtension<EnumEntry, List<Annotation>> enumEntryAnnotation;
    private final ExtensionRegistryLite extensionRegistry;
    private final GeneratedExtension<Function, List<Annotation>> functionAnnotation;
    private final GeneratedExtension<Package, Integer> packageFqName;
    private final GeneratedExtension<ValueParameter, List<Annotation>> parameterAnnotation;
    private final GeneratedExtension<Property, List<Annotation>> propertyAnnotation;
    private final GeneratedExtension<Property, List<Annotation>> propertyGetterAnnotation;
    private final GeneratedExtension<Property, List<Annotation>> propertySetterAnnotation;
    private final GeneratedExtension<Type, List<Annotation>> typeAnnotation;
    private final GeneratedExtension<TypeParameter, List<Annotation>> typeParameterAnnotation;

    public SerializerExtensionProtocol(ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<Package, Integer> generatedExtension, GeneratedExtension<Constructor, List<Annotation>> generatedExtension2, GeneratedExtension<Class, List<Annotation>> generatedExtension3, GeneratedExtension<Function, List<Annotation>> generatedExtension4, GeneratedExtension<Property, List<Annotation>> generatedExtension5, GeneratedExtension<Property, List<Annotation>> generatedExtension6, GeneratedExtension<Property, List<Annotation>> generatedExtension7, GeneratedExtension<EnumEntry, List<Annotation>> generatedExtension8, GeneratedExtension<Property, Value> generatedExtension9, GeneratedExtension<ValueParameter, List<Annotation>> generatedExtension10, GeneratedExtension<Type, List<Annotation>> generatedExtension11, GeneratedExtension<TypeParameter, List<Annotation>> generatedExtension12) {
        this.extensionRegistry = extensionRegistryLite;
        this.packageFqName = generatedExtension;
        this.constructorAnnotation = generatedExtension2;
        this.classAnnotation = generatedExtension3;
        this.functionAnnotation = generatedExtension4;
        this.propertyAnnotation = generatedExtension5;
        this.propertyGetterAnnotation = generatedExtension6;
        this.propertySetterAnnotation = generatedExtension7;
        this.enumEntryAnnotation = generatedExtension8;
        this.compileTimeValue = generatedExtension9;
        this.parameterAnnotation = generatedExtension10;
        this.typeAnnotation = generatedExtension11;
        this.typeParameterAnnotation = generatedExtension12;
    }

    public final GeneratedExtension<Class, List<Annotation>> getClassAnnotation() {
        return this.classAnnotation;
    }

    public final GeneratedExtension<Property, Value> getCompileTimeValue() {
        return this.compileTimeValue;
    }

    public final GeneratedExtension<Constructor, List<Annotation>> getConstructorAnnotation() {
        return this.constructorAnnotation;
    }

    public final GeneratedExtension<EnumEntry, List<Annotation>> getEnumEntryAnnotation() {
        return this.enumEntryAnnotation;
    }

    public final ExtensionRegistryLite getExtensionRegistry() {
        return this.extensionRegistry;
    }

    public final GeneratedExtension<Function, List<Annotation>> getFunctionAnnotation() {
        return this.functionAnnotation;
    }

    public final GeneratedExtension<ValueParameter, List<Annotation>> getParameterAnnotation() {
        return this.parameterAnnotation;
    }

    public final GeneratedExtension<Property, List<Annotation>> getPropertyAnnotation() {
        return this.propertyAnnotation;
    }

    public final GeneratedExtension<Property, List<Annotation>> getPropertyGetterAnnotation() {
        return this.propertyGetterAnnotation;
    }

    public final GeneratedExtension<Property, List<Annotation>> getPropertySetterAnnotation() {
        return this.propertySetterAnnotation;
    }

    public final GeneratedExtension<Type, List<Annotation>> getTypeAnnotation() {
        return this.typeAnnotation;
    }

    public final GeneratedExtension<TypeParameter, List<Annotation>> getTypeParameterAnnotation() {
        return this.typeParameterAnnotation;
    }
}
