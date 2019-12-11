package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Annotations annotations;
    private final NotNullLazyValue binaryClasses$delegate = this.f29560c.getStorageManager().createLazyValue(new LazyJavaPackageFragment$binaryClasses$2(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LazyJavaResolverContext f29560c;
    /* access modifiers changed from: private */
    public final JavaPackage jPackage;
    private final NotNullLazyValue partToFacade$delegate;
    private final JvmPackageScope scope = new JvmPackageScope(this.f29560c, this.jPackage, this);
    private final NotNullLazyValue<List<FqName>> subPackages = this.f29560c.getStorageManager().createRecursionTolerantLazyValue(new LazyJavaPackageFragment$subPackages$1(this), C13185o.m40513a());

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Kind.values().length];

        static {
            $EnumSwitchMapping$0[Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            $EnumSwitchMapping$0[Kind.FILE_FACADE.ordinal()] = 2;
        }
    }

    static {
        Class<LazyJavaPackageFragment> cls = LazyJavaPackageFragment.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    public LazyJavaPackageFragment(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage) {
        Annotations annotations2;
        super(lazyJavaResolverContext.getModule(), javaPackage.getFqName());
        this.jPackage = javaPackage;
        this.f29560c = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext, this, null, 0, 6, null);
        if (this.f29560c.getComponents().getAnnotationTypeQualifierResolver().getDisabled()) {
            annotations2 = Annotations.Companion.getEMPTY();
        } else {
            annotations2 = LazyJavaAnnotationsKt.resolveAnnotations(this.f29560c, this.jPackage);
        }
        this.annotations = annotations2;
        this.partToFacade$delegate = this.f29560c.getStorageManager().createLazyValue(new LazyJavaPackageFragment$partToFacade$2(this));
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass javaClass) {
        return this.scope.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(javaClass);
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.binaryClasses$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return (List) this.subPackages.invoke();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy Java package fragment: ");
        sb.append(getFqName());
        return sb.toString();
    }

    public JvmPackageScope getMemberScope() {
        return this.scope;
    }
}
