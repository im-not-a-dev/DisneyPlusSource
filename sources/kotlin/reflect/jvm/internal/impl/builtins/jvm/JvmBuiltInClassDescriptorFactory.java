package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    /* access modifiers changed from: private */
    public static final ClassId CLONEABLE_CLASS_ID;
    /* access modifiers changed from: private */
    public static final Name CLONEABLE_NAME;
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final FqName KOTLIN_FQ_NAME = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME;
    private final NotNullLazyValue cloneable$delegate;
    /* access modifiers changed from: private */
    public final Function1<ModuleDescriptor, DeclarationDescriptor> computeContainingDeclaration;
    /* access modifiers changed from: private */
    public final ModuleDescriptor moduleDescriptor;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Name shortName = KotlinBuiltIns.FQ_NAMES.cloneable.shortName();
        C12880j.m40222a((Object) shortName, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        CLONEABLE_NAME = shortName;
        ClassId classId = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.cloneable.toSafe());
        C12880j.m40222a((Object) classId, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        CLONEABLE_CLASS_ID = classId;
    }

    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor2, Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> function1) {
        this.moduleDescriptor = moduleDescriptor2;
        this.computeContainingDeclaration = function1;
        this.cloneable$delegate = storageManager.createLazyValue(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, storageManager));
    }

    private final ClassDescriptorImpl getCloneable() {
        return (ClassDescriptorImpl) StorageKt.getValue(this.cloneable$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public ClassDescriptor createClass(ClassId classId) {
        if (C12880j.m40224a((Object) classId, (Object) CLONEABLE_CLASS_ID)) {
            return getCloneable();
        }
        return null;
    }

    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName fqName) {
        if (C12880j.m40224a((Object) fqName, (Object) KOTLIN_FQ_NAME)) {
            return C13186o0.m40524a(getCloneable());
        }
        return C13188p0.m40531a();
    }

    public boolean shouldCreateClass(FqName fqName, Name name) {
        return C12880j.m40224a((Object) name, (Object) CLONEABLE_NAME) && C12880j.m40224a((Object) fqName, (Object) KOTLIN_FQ_NAME);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            function1 = C129241.INSTANCE;
        }
        this(storageManager, moduleDescriptor2, function1);
    }
}
