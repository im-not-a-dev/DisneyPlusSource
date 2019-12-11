package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.C12897k;
import kotlin.Lazy;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: BuiltInsLoader.kt */
public interface BuiltInsLoader {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: BuiltInsLoader.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(Companion.class), "Instance", "getInstance()Lorg/jetbrains/kotlin/builtins/BuiltInsLoader;"))};
        private static final Lazy Instance$delegate = C12763i.m39922a(C12897k.PUBLICATION, BuiltInsLoader$Companion$Instance$2.INSTANCE);

        private Companion() {
        }

        public final BuiltInsLoader getInstance() {
            Lazy lazy = Instance$delegate;
            KProperty kProperty = $$delegatedProperties[0];
            return (BuiltInsLoader) lazy.getValue();
        }
    }

    PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z);
}
