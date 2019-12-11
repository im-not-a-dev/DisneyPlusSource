package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends C12881k implements Function0<ClassDescriptorImpl> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltInClassDescriptorFactory this$0;

    JvmBuiltInClassDescriptorFactory$cloneable$2(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        this.this$0 = jvmBuiltInClassDescriptorFactory;
        this.$storageManager = storageManager;
        super(0);
    }

    public final ClassDescriptorImpl invoke() {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl((DeclarationDescriptor) this.this$0.computeContainingDeclaration.invoke(this.this$0.moduleDescriptor), JvmBuiltInClassDescriptorFactory.CLONEABLE_NAME, Modality.ABSTRACT, ClassKind.INTERFACE, C13183n.m40498a(this.this$0.moduleDescriptor.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, this.$storageManager);
        classDescriptorImpl.initialize(new CloneableClassScope(this.$storageManager, classDescriptorImpl), C13188p0.m40531a(), null);
        return classDescriptorImpl;
    }
}
