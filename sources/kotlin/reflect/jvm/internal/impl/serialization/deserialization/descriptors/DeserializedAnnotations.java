package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: DeserializedAnnotations.kt */
public class DeserializedAnnotations implements Annotations {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(DeserializedAnnotations.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    private final NotNullLazyValue annotations$delegate;

    public DeserializedAnnotations(StorageManager storageManager, Function0<? extends List<? extends AnnotationDescriptor>> function0) {
        this.annotations$delegate = storageManager.createLazyValue(function0);
    }

    private final List<AnnotationDescriptor> getAnnotations() {
        return (List) StorageKt.getValue(this.annotations$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public AnnotationDescriptor findAnnotation(FqName fqName) {
        return DefaultImpls.findAnnotation(this, fqName);
    }

    public boolean hasAnnotation(FqName fqName) {
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    public boolean isEmpty() {
        return getAnnotations().isEmpty();
    }

    public Iterator<AnnotationDescriptor> iterator() {
        return getAnnotations().iterator();
    }
}
