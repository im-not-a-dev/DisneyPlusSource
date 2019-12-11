package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Map;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final NotNullLazyValue allValueArguments$delegate = this.f29556c.getStorageManager().createLazyValue(new LazyJavaAnnotationDescriptor$allValueArguments$2(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LazyJavaResolverContext f29556c;
    private final NullableLazyValue fqName$delegate = this.f29556c.getStorageManager().createNullableLazyValue(new LazyJavaAnnotationDescriptor$fqName$2(this));
    private final boolean isIdeExternalAnnotation = this.javaAnnotation.isIdeExternalAnnotation();
    /* access modifiers changed from: private */
    public final JavaAnnotation javaAnnotation;
    private final JavaSourceElement source = this.f29556c.getComponents().getSourceElementFactory().source(this.javaAnnotation);
    private final NotNullLazyValue type$delegate = this.f29556c.getStorageManager().createLazyValue(new LazyJavaAnnotationDescriptor$type$2(this));

    static {
        Class<LazyJavaAnnotationDescriptor> cls = LazyJavaAnnotationDescriptor.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation2) {
        this.f29556c = lazyJavaResolverContext;
        this.javaAnnotation = javaAnnotation2;
    }

    /* access modifiers changed from: private */
    public final ClassDescriptor createTypeForMissingDependencies(FqName fqName) {
        ModuleDescriptor module = this.f29556c.getModule();
        ClassId classId = ClassId.topLevel(fqName);
        C12880j.m40222a((Object) classId, "ClassId.topLevel(fqName)");
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(module, classId, this.f29556c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    /* access modifiers changed from: private */
    public final ConstantValue<?> resolveAnnotationArgument(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.INSTANCE.createConstantValue(((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue());
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return resolveFromEnumValue(javaEnumValueAnnotationArgument.getEnumClassId(), javaEnumValueAnnotationArgument.getEntryName());
        } else if (javaAnnotationArgument instanceof JavaArrayAnnotationArgument) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                C12880j.m40222a((Object) name, "DEFAULT_ANNOTATION_MEMBER_NAME");
            }
            return resolveFromArray(name, ((JavaArrayAnnotationArgument) javaAnnotationArgument).getElements());
        } else if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
            return resolveFromAnnotation(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
        } else {
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return resolveFromJavaClassObjectType(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType());
            }
            return null;
        }
    }

    private final ConstantValue<?> resolveFromAnnotation(JavaAnnotation javaAnnotation2) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f29556c, javaAnnotation2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r3 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveFromArray(kotlin.reflect.jvm.internal.impl.name.Name r3, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> r4) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r2.getType()
            java.lang.String r1 = "type"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0011
            return r1
        L_0x0011:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(r2)
            if (r0 == 0) goto L_0x0075
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r3 = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.getAnnotationParameterByName(r3, r0)
            if (r3 == 0) goto L_0x0024
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r3.getType()
            if (r3 == 0) goto L_0x0024
            goto L_0x003e
        L_0x0024:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r3 = r2.f29556c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r3 = r3.getComponents()
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r3 = r3.getModule()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r3 = r3.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            java.lang.String r1 = "Unknown array element type"
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType(r1)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.getArrayType(r0, r1)
        L_0x003e:
            java.lang.String r0 = "DescriptorResolverUtils.… type\")\n                )"
            kotlin.jvm.internal.C12880j.m40222a(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.p590y.C13187p.m40525a(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x0052:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r4.next()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument) r1
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r1 = r2.resolveAnnotationArgument(r1)
            if (r1 == 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue
            r1.<init>()
        L_0x006a:
            r0.add(r1)
            goto L_0x0052
        L_0x006e:
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory r4 = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE
            kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue r3 = r4.createArrayValue(r0, r3)
            return r3
        L_0x0075:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.resolveFromArray(kotlin.reflect.jvm.internal.impl.name.Name, java.util.List):kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue");
    }

    private final ConstantValue<?> resolveFromEnumValue(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    private final ConstantValue<?> resolveFromJavaClassObjectType(JavaType javaType) {
        return KClassValue.Companion.create(this.f29556c.getTypeResolver().transformJavaType(javaType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null)));
    }

    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, (Object) this, $$delegatedProperties[2]);
    }

    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.fqName$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, (Object) this, $$delegatedProperties[1]);
    }

    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }

    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    public JavaSourceElement getSource() {
        return this.source;
    }
}
