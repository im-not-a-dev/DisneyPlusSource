package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: JvmBuiltIns.kt */
final class JvmBuiltIns$settings$2 extends C12881k implements Function0<JvmBuiltInsSettings> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltIns this$0;

    JvmBuiltIns$settings$2(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        this.this$0 = jvmBuiltIns;
        this.$storageManager = storageManager;
        super(0);
    }

    public final JvmBuiltInsSettings invoke() {
        ModuleDescriptorImpl builtInsModule = this.this$0.getBuiltInsModule();
        C12880j.m40222a((Object) builtInsModule, "builtInsModule");
        return new JvmBuiltInsSettings(builtInsModule, this.$storageManager, new Function0<ModuleDescriptor>(this) {
            final /* synthetic */ JvmBuiltIns$settings$2 this$0;

            {
                this.this$0 = r1;
            }

            public final ModuleDescriptor invoke() {
                ModuleDescriptor access$getOwnerModuleDescriptor$p = this.this$0.this$0.ownerModuleDescriptor;
                if (access$getOwnerModuleDescriptor$p != null) {
                    return access$getOwnerModuleDescriptor$p;
                }
                throw new AssertionError("JvmBuiltins has not been initialized properly");
            }
        }, new Function0<Boolean>(this) {
            final /* synthetic */ JvmBuiltIns$settings$2 this$0;

            {
                this.this$0 = r1;
            }

            public final boolean invoke() {
                if (this.this$0.this$0.ownerModuleDescriptor != null) {
                    return this.this$0.this$0.isAdditionalBuiltInsFeatureSupported;
                }
                throw new AssertionError("JvmBuiltins has not been initialized properly");
            }
        });
    }
}
