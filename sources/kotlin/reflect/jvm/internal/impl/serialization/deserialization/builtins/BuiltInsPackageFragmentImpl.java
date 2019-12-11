package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {
    public static final Companion Companion = new Companion(null);
    private final boolean isFallback;

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
            r11 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
            kotlin.p580c0.C12724b.m39863a(r13, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
            throw r11;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl create(kotlin.reflect.jvm.internal.impl.name.FqName r10, kotlin.reflect.jvm.internal.impl.storage.StorageManager r11, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r12, java.io.InputStream r13, boolean r14) {
            /*
                r9 = this;
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion$Companion r0 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.Companion     // Catch:{ all -> 0x0063 }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion r6 = r0.readFrom(r13)     // Catch:{ all -> 0x0063 }
                r0 = 0
                if (r6 == 0) goto L_0x005d
                boolean r1 = r6.isCompatible()     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x002d
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE     // Catch:{ all -> 0x0063 }
                kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r1 = r1.getExtensionRegistry()     // Catch:{ all -> 0x0063 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r5 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.parseFrom(r13, r1)     // Catch:{ all -> 0x0063 }
                kotlin.p580c0.C12724b.m39863a(r13, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl
                java.lang.String r0 = "proto"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r0)
                r8 = 0
                r1 = r13
                r2 = r10
                r3 = r11
                r4 = r12
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r13
            L_0x002d:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0063 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
                r11.<init>()     // Catch:{ all -> 0x0063 }
                java.lang.String r12 = "Kotlin built-in definition format version is not supported: "
                r11.append(r12)     // Catch:{ all -> 0x0063 }
                java.lang.String r12 = "expected "
                r11.append(r12)     // Catch:{ all -> 0x0063 }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion r12 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.INSTANCE     // Catch:{ all -> 0x0063 }
                r11.append(r12)     // Catch:{ all -> 0x0063 }
                java.lang.String r12 = ", actual "
                r11.append(r12)     // Catch:{ all -> 0x0063 }
                r11.append(r6)     // Catch:{ all -> 0x0063 }
                java.lang.String r12 = ". "
                r11.append(r12)     // Catch:{ all -> 0x0063 }
                java.lang.String r12 = "Please update Kotlin"
                r11.append(r12)     // Catch:{ all -> 0x0063 }
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0063 }
                r10.<init>(r11)     // Catch:{ all -> 0x0063 }
                throw r10     // Catch:{ all -> 0x0063 }
            L_0x005d:
                java.lang.String r10 = "version"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)     // Catch:{ all -> 0x0063 }
                throw r0
            L_0x0063:
                r10 = move-exception
                throw r10     // Catch:{ all -> 0x0065 }
            L_0x0065:
                r11 = move-exception
                kotlin.p580c0.C12724b.m39863a(r13, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, java.io.InputStream, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z);
    }

    private BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, null);
        this.isFallback = z;
    }
}
