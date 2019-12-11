package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.C12897k;
import kotlin.Lazy;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* compiled from: ReflectionTypes.kt */
public final class ReflectionTypes {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    public static final Companion Companion = new Companion(null);
    private final ClassLookup kClass$delegate = new ClassLookup(1);
    private final ClassLookup kMutableProperty0$delegate = new ClassLookup(1);
    private final ClassLookup kMutableProperty1$delegate = new ClassLookup(2);
    private final ClassLookup kMutableProperty2$delegate = new ClassLookup(3);
    private final ClassLookup kProperty$delegate = new ClassLookup(1);
    private final ClassLookup kProperty0$delegate = new ClassLookup(1);
    private final ClassLookup kProperty1$delegate = new ClassLookup(2);
    private final ClassLookup kProperty2$delegate = new ClassLookup(3);
    private final Lazy kotlinReflectScope$delegate;
    private final NotFoundClasses notFoundClasses;

    /* compiled from: ReflectionTypes.kt */
    private static final class ClassLookup {
        private final int numberOfTypeParameters;

        public ClassLookup(int i) {
            this.numberOfTypeParameters = i;
        }

        public final ClassDescriptor getValue(ReflectionTypes reflectionTypes, KProperty<?> kProperty) {
            return reflectionTypes.find(C12832w.m40125f(kProperty.getName()), this.numberOfTypeParameters);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    public static final class Companion {
        private Companion() {
        }

        public final KotlinType createKPropertyStarType(ModuleDescriptor moduleDescriptor) {
            ClassId classId = KotlinBuiltIns.FQ_NAMES.kProperty;
            C12880j.m40222a((Object) classId, "KotlinBuiltIns.FQ_NAMES.kProperty");
            ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, classId);
            if (findClassAcrossModuleDependencies == null) {
                return null;
            }
            Annotations empty = Annotations.Companion.getEMPTY();
            TypeConstructor typeConstructor = findClassAcrossModuleDependencies.getTypeConstructor();
            C12880j.m40222a((Object) typeConstructor, "kPropertyClass.typeConstructor");
            List parameters = typeConstructor.getParameters();
            C12880j.m40222a((Object) parameters, "kPropertyClass.typeConstructor.parameters");
            Object k = C13199w.m40599k(parameters);
            C12880j.m40222a(k, "kPropertyClass.typeConstructor.parameters.single()");
            return KotlinTypeFactory.simpleNotNullType(empty, findClassAcrossModuleDependencies, C13183n.m40498a(new StarProjectionImpl((TypeParameterDescriptor) k)));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<ReflectionTypes> cls = ReflectionTypes.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    }

    public ReflectionTypes(ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses2) {
        this.notFoundClasses = notFoundClasses2;
        this.kotlinReflectScope$delegate = C12763i.m39922a(C12897k.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(moduleDescriptor));
    }

    /* access modifiers changed from: private */
    public final ClassDescriptor find(String str, int i) {
        Name identifier = Name.identifier(str);
        C12880j.m40222a((Object) identifier, "Name.identifier(className)");
        ClassifierDescriptor contributedClassifier = getKotlinReflectScope().getContributedClassifier(identifier, NoLookupLocation.FROM_REFLECTION);
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) contributedClassifier;
        return classDescriptor != null ? classDescriptor : this.notFoundClasses.getClass(new ClassId(ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), identifier), C13183n.m40498a(Integer.valueOf(i)));
    }

    private final MemberScope getKotlinReflectScope() {
        Lazy lazy = this.kotlinReflectScope$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (MemberScope) lazy.getValue();
    }

    public final ClassDescriptor getKClass() {
        return this.kClass$delegate.getValue(this, $$delegatedProperties[1]);
    }
}
