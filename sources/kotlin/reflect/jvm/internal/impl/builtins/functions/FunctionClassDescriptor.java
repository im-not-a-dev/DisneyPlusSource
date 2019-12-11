package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C12898l;
import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: FunctionClassDescriptor.kt */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final ClassId functionClassId = new ClassId(KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, Name.identifier("Function"));
    /* access modifiers changed from: private */
    public static final ClassId kFunctionClassId = new ClassId(ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), Name.identifier("KFunction"));
    private final int arity;
    /* access modifiers changed from: private */
    public final PackageFragmentDescriptor containingDeclaration;
    private final Kind functionKind;
    private final FunctionClassScope memberScope = new FunctionClassScope(this.storageManager, this);
    /* access modifiers changed from: private */
    public final List<TypeParameterDescriptor> parameters;
    /* access modifiers changed from: private */
    public final StorageManager storageManager;
    private final FunctionTypeConstructor typeConstructor = new FunctionTypeConstructor();

    /* compiled from: FunctionClassDescriptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    private final class FunctionTypeConstructor extends AbstractClassTypeConstructor {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Kind.values().length];

            static {
                $EnumSwitchMapping$0[Kind.Function.ordinal()] = 1;
                $EnumSwitchMapping$0[Kind.KFunction.ordinal()] = 2;
                $EnumSwitchMapping$0[Kind.SuspendFunction.ordinal()] = 3;
                $EnumSwitchMapping$0[Kind.KSuspendFunction.ordinal()] = 4;
            }
        }

        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.storageManager);
        }

        /* access modifiers changed from: protected */
        public Collection<KotlinType> computeSupertypes() {
            List<ClassId> list;
            int i = WhenMappings.$EnumSwitchMapping$0[FunctionClassDescriptor.this.getFunctionKind().ordinal()];
            if (i == 1) {
                list = C13183n.m40498a(FunctionClassDescriptor.functionClassId);
            } else if (i == 2) {
                list = C13185o.m40520c(FunctionClassDescriptor.kFunctionClassId, new ClassId(KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, Kind.Function.numberedClassName(FunctionClassDescriptor.this.getArity())));
            } else if (i == 3) {
                list = C13183n.m40498a(FunctionClassDescriptor.functionClassId);
            } else if (i == 4) {
                list = C13185o.m40520c(FunctionClassDescriptor.kFunctionClassId, new ClassId(DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE, Kind.SuspendFunction.numberedClassName(FunctionClassDescriptor.this.getArity())));
            } else {
                throw new C12898l();
            }
            ModuleDescriptor containingDeclaration = FunctionClassDescriptor.this.containingDeclaration.getContainingDeclaration();
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
            for (ClassId classId : list) {
                ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (findClassAcrossModuleDependencies != null) {
                    List parameters = getParameters();
                    TypeConstructor typeConstructor = findClassAcrossModuleDependencies.getTypeConstructor();
                    Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor, "descriptor.typeConstructor");
                    List<TypeParameterDescriptor> e = C13199w.m40587e(parameters, typeConstructor.getParameters().size());
                    ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) e, 10));
                    for (TypeParameterDescriptor defaultType : e) {
                        arrayList2.add(new TypeProjectionImpl(defaultType.getDefaultType()));
                    }
                    arrayList.add(KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), findClassAcrossModuleDependencies, arrayList2));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Built-in class ");
                    sb.append(classId);
                    sb.append(" not found");
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            return C13199w.m40606q(arrayList);
        }

        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.parameters;
        }

        /* access modifiers changed from: protected */
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return EMPTY.INSTANCE;
        }

        public boolean isDenotable() {
            return true;
        }

        public String toString() {
            return getDeclarationDescriptor().toString();
        }

        public FunctionClassDescriptor getDeclarationDescriptor() {
            return FunctionClassDescriptor.this;
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    public enum Kind {
        Function(r2, r3),
        SuspendFunction(r2, r3),
        KFunction(ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), r3),
        KSuspendFunction(ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), r3);
        
        public static final Companion Companion = null;
        private final String classNamePrefix;
        private final FqName packageFqName;

        /* compiled from: FunctionClassDescriptor.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Kind byClassNamePrefix(FqName fqName, String str) {
                Kind[] values;
                for (Kind kind : Kind.values()) {
                    if (Intrinsics.areEqual((Object) kind.getPackageFqName(), (Object) fqName) && C12832w.m40123b(str, kind.getClassNamePrefix(), false, 2, null)) {
                        return kind;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Companion = new Companion(null);
        }

        private Kind(FqName fqName, String str) {
            this.packageFqName = fqName;
            this.classNamePrefix = str;
        }

        public final String getClassNamePrefix() {
            return this.classNamePrefix;
        }

        public final FqName getPackageFqName() {
            return this.packageFqName;
        }

        public final Name numberedClassName(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.classNamePrefix);
            sb.append(i);
            Name identifier = Name.identifier(sb.toString());
            Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(\"$classNamePrefix$arity\")");
            return identifier;
        }
    }

    public FunctionClassDescriptor(StorageManager storageManager2, PackageFragmentDescriptor packageFragmentDescriptor, Kind kind, int i) {
        super(storageManager2, kind.numberedClassName(i));
        this.storageManager = storageManager2;
        this.containingDeclaration = packageFragmentDescriptor;
        this.functionKind = kind;
        this.arity = i;
        final ArrayList arrayList = new ArrayList();
        C129231 r6 = new Function2<Variance, String, C13145v>(this) {
            final /* synthetic */ FunctionClassDescriptor this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Variance) obj, (String) obj2);
                return C13145v.f29587a;
            }

            public final void invoke(Variance variance, String str) {
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this.this$0, Annotations.Companion.getEMPTY(), false, variance, Name.identifier(str), arrayList.size()));
            }
        };
        C12757d dVar = new C12757d(1, this.arity);
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) dVar, 10));
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            int b = ((C13162e0) it).mo31079b();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(b);
            r6.invoke(variance, sb.toString());
            arrayList2.add(C13145v.f29587a);
        }
        r6.invoke(Variance.OUT_VARIANCE, "R");
        this.parameters = C13199w.m40606q(arrayList);
    }

    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.arity;
    }

    public Void getCompanionObjectDescriptor() {
        return null;
    }

    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.parameters;
    }

    public final Kind getFunctionKind() {
        return this.functionKind;
    }

    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement, "SourceElement.NO_SOURCE");
        return sourceElement;
    }

    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    public Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public Visibility getVisibility() {
        Visibility visibility = Visibilities.PUBLIC;
        Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "Visibilities.PUBLIC");
        return visibility;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isInner() {
        return false;
    }

    public String toString() {
        String asString = getName().asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "name.asString()");
        return asString;
    }

    public List<ClassConstructorDescriptor> getConstructors() {
        return C13185o.m40513a();
    }

    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    public List<ClassDescriptor> getSealedSubclasses() {
        return C13185o.m40513a();
    }

    public Empty getStaticScope() {
        return Empty.INSTANCE;
    }

    public FunctionClassScope getUnsubstitutedMemberScope() {
        return this.memberScope;
    }
}
