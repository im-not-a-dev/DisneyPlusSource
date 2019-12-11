package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    private final DeserializedAnnotations annotations = new DeserializedAnnotations(this.f29579c.getStorageManager(), new DeserializedTypeParameterDescriptor$annotations$1(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final DeserializationContext f29579c;
    private final TypeParameter proto;

    public DeserializedTypeParameterDescriptor(DeserializationContext deserializationContext, TypeParameter typeParameter, int i) {
        StorageManager storageManager = deserializationContext.getStorageManager();
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeParameter.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Variance variance = typeParameter.getVariance();
        C12880j.m40222a((Object) variance, "proto.variance");
        super(storageManager, containingDeclaration, name, protoEnumFlags.variance(variance), typeParameter.getReified(), i, SourceElement.NO_SOURCE, EMPTY.INSTANCE);
        this.f29579c = deserializationContext;
        this.proto = typeParameter;
    }

    public final TypeParameter getProto() {
        return this.proto;
    }

    /* access modifiers changed from: protected */
    public List<KotlinType> resolveUpperBounds() {
        List<Type> upperBounds = ProtoTypeTableUtilKt.upperBounds(this.proto, this.f29579c.getTypeTable());
        if (upperBounds.isEmpty()) {
            return C13183n.m40498a(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        TypeDeserializer typeDeserializer = this.f29579c.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) upperBounds, 10));
        for (Type type : upperBounds) {
            arrayList.add(typeDeserializer.type(type));
        }
        return arrayList;
    }

    public DeserializedAnnotations getAnnotations() {
        return this.annotations;
    }

    /* access modifiers changed from: protected */
    public Void reportSupertypeLoopError(KotlinType kotlinType) {
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no cycles for deserialized type parameters, but found for: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
}
