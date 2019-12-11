package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1 */
/* compiled from: JvmBuiltInsSettings.kt */
public final class C12927xaea9d104 extends PackageFragmentDescriptorImpl {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    C12927xaea9d104(JvmBuiltInsSettings jvmBuiltInsSettings, ModuleDescriptor moduleDescriptor, FqName fqName) {
        this.this$0 = jvmBuiltInsSettings;
        super(moduleDescriptor, fqName);
    }

    public Empty getMemberScope() {
        return Empty.INSTANCE;
    }
}
