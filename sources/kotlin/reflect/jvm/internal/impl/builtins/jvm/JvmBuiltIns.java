package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: JvmBuiltIns.kt */
public final class JvmBuiltIns extends KotlinBuiltIns {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(JvmBuiltIns.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    /* access modifiers changed from: private */
    public boolean isAdditionalBuiltInsFeatureSupported = true;
    /* access modifiers changed from: private */
    public ModuleDescriptor ownerModuleDescriptor;
    private final NotNullLazyValue settings$delegate;

    /* compiled from: JvmBuiltIns.kt */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Kind.values().length];

        static {
            $EnumSwitchMapping$0[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            $EnumSwitchMapping$0[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            $EnumSwitchMapping$0[Kind.FALLBACK.ordinal()] = 3;
        }
    }

    public JvmBuiltIns(StorageManager storageManager, Kind kind) {
        super(storageManager);
        this.settings$delegate = storageManager.createLazyValue(new JvmBuiltIns$settings$2(this, storageManager));
        int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i == 1) {
            return;
        }
        if (i == 2) {
            createBuiltInsModule(false);
        } else if (i == 3) {
            createBuiltInsModule(true);
        }
    }

    /* access modifiers changed from: protected */
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getSettings();
    }

    /* access modifiers changed from: protected */
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getSettings();
    }

    public final JvmBuiltInsSettings getSettings() {
        return (JvmBuiltInsSettings) StorageKt.getValue(this.settings$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public final void initialize(ModuleDescriptor moduleDescriptor, boolean z) {
        boolean z2 = this.ownerModuleDescriptor == null;
        if (!C13147x.f29590a || z2) {
            this.ownerModuleDescriptor = moduleDescriptor;
            this.isAdditionalBuiltInsFeatureSupported = z;
            return;
        }
        throw new AssertionError("JvmBuiltins repeated initialization");
    }

    /* access modifiers changed from: protected */
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable classDescriptorFactories = super.getClassDescriptorFactories();
        C12880j.m40222a((Object) classDescriptorFactories, "super.getClassDescriptorFactories()");
        StorageManager storageManager = getStorageManager();
        C12880j.m40222a((Object) storageManager, "storageManager");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        C12880j.m40222a((Object) builtInsModule, "builtInsModule");
        JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null);
        return C13199w.m40581d(classDescriptorFactories, (Object) jvmBuiltInClassDescriptorFactory);
    }
}
