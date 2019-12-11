package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
public final class AnnotationAndConstantLoaderImpl implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {
    private final AnnotationDeserializer deserializer;
    private final SerializerExtensionProtocol protocol;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[AnnotatedCallableKind.values().length];

        static {
            $EnumSwitchMapping$0[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            $EnumSwitchMapping$0[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            $EnumSwitchMapping$0[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
        }
    }

    public AnnotationAndConstantLoaderImpl(ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses, SerializerExtensionProtocol serializerExtensionProtocol) {
        this.protocol = serializerExtensionProtocol;
        this.deserializer = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
    }

    public List<AnnotationDescriptor> loadCallableAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        List<Annotation> list;
        if (messageLite instanceof Constructor) {
            list = (List) ((Constructor) messageLite).getExtension(this.protocol.getConstructorAnnotation());
        } else if (messageLite instanceof Function) {
            list = (List) ((Function) messageLite).getExtension(this.protocol.getFunctionAnnotation());
        } else if (messageLite instanceof Property) {
            int i = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
            if (i == 1) {
                list = (List) ((Property) messageLite).getExtension(this.protocol.getPropertyAnnotation());
            } else if (i == 2) {
                list = (List) ((Property) messageLite).getExtension(this.protocol.getPropertyGetterAnnotation());
            } else if (i == 3) {
                list = (List) ((Property) messageLite).getExtension(this.protocol.getPropertySetterAnnotation());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message: ");
            sb.append(messageLite);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (list == null) {
            list = C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (Annotation deserializeAnnotation : list) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    public List<AnnotationDescriptor> loadClassAnnotations(Class classR) {
        List<Annotation> list = (List) classR.getClassProto().getExtension(this.protocol.getClassAnnotation());
        if (list == null) {
            list = C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (Annotation deserializeAnnotation : list) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, classR.getNameResolver()));
        }
        return arrayList;
    }

    public List<AnnotationDescriptor> loadEnumEntryAnnotations(ProtoContainer protoContainer, EnumEntry enumEntry) {
        List<Annotation> list = (List) enumEntry.getExtension(this.protocol.getEnumEntryAnnotation());
        if (list == null) {
            list = C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (Annotation deserializeAnnotation : list) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    public List<AnnotationDescriptor> loadExtensionReceiverParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return C13185o.m40513a();
    }

    public List<AnnotationDescriptor> loadPropertyBackingFieldAnnotations(ProtoContainer protoContainer, Property property) {
        return C13185o.m40513a();
    }

    public List<AnnotationDescriptor> loadPropertyDelegateFieldAnnotations(ProtoContainer protoContainer, Property property) {
        return C13185o.m40513a();
    }

    public List<AnnotationDescriptor> loadTypeAnnotations(Type type, NameResolver nameResolver) {
        List<Annotation> list = (List) type.getExtension(this.protocol.getTypeAnnotation());
        if (list == null) {
            list = C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (Annotation deserializeAnnotation : list) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, nameResolver));
        }
        return arrayList;
    }

    public List<AnnotationDescriptor> loadTypeParameterAnnotations(TypeParameter typeParameter, NameResolver nameResolver) {
        List<Annotation> list = (List) typeParameter.getExtension(this.protocol.getTypeParameterAnnotation());
        if (list == null) {
            list = C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (Annotation deserializeAnnotation : list) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, nameResolver));
        }
        return arrayList;
    }

    public List<AnnotationDescriptor> loadValueParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ValueParameter valueParameter) {
        List<Annotation> list = (List) valueParameter.getExtension(this.protocol.getParameterAnnotation());
        if (list == null) {
            list = C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (Annotation deserializeAnnotation : list) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    public ConstantValue<?> loadPropertyConstant(ProtoContainer protoContainer, Property property, KotlinType kotlinType) {
        Value value = (Value) ProtoBufUtilKt.getExtensionOrNull(property, this.protocol.getCompileTimeValue());
        if (value != null) {
            return this.deserializer.resolveValue(kotlinType, value, protoContainer.getNameResolver());
        }
        return null;
    }
}
