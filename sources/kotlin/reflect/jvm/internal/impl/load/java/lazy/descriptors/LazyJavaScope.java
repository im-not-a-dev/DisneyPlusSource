package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C12907r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* compiled from: LazyJavaScope.kt */
public abstract class LazyJavaScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors = this.f29563c.getStorageManager().createRecursionTolerantLazyValue(new LazyJavaScope$allDescriptors$1(this), C13185o.m40513a());

    /* renamed from: c */
    private final LazyJavaResolverContext f29563c;
    private final NotNullLazyValue classNamesLazy$delegate = this.f29563c.getStorageManager().createLazyValue(new LazyJavaScope$classNamesLazy$2(this));
    private final NotNullLazyValue<DeclaredMemberIndex> declaredMemberIndex = this.f29563c.getStorageManager().createLazyValue(new LazyJavaScope$declaredMemberIndex$1(this));
    private final NotNullLazyValue functionNamesLazy$delegate = this.f29563c.getStorageManager().createLazyValue(new LazyJavaScope$functionNamesLazy$2(this));
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions = this.f29563c.getStorageManager().createMemoizedFunction(new LazyJavaScope$functions$1(this));
    private final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> properties = this.f29563c.getStorageManager().createMemoizedFunction(new LazyJavaScope$properties$1(this));
    private final NotNullLazyValue propertyNamesLazy$delegate = this.f29563c.getStorageManager().createLazyValue(new LazyJavaScope$propertyNamesLazy$2(this));

    /* compiled from: LazyJavaScope.kt */
    protected static final class MethodSignatureData {
        private final List<String> errors;
        private final boolean hasStableParameterNames;
        private final KotlinType receiverType;
        private final KotlinType returnType;
        private final List<TypeParameterDescriptor> typeParameters;
        private final List<ValueParameterDescriptor> valueParameters;

        public MethodSignatureData(KotlinType kotlinType, KotlinType kotlinType2, List<? extends ValueParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, boolean z, List<String> list3) {
            this.returnType = kotlinType;
            this.receiverType = kotlinType2;
            this.valueParameters = list;
            this.typeParameters = list2;
            this.hasStableParameterNames = z;
            this.errors = list3;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MethodSignatureData) {
                    MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
                    if (C12880j.m40224a((Object) this.returnType, (Object) methodSignatureData.returnType) && C12880j.m40224a((Object) this.receiverType, (Object) methodSignatureData.receiverType) && C12880j.m40224a((Object) this.valueParameters, (Object) methodSignatureData.valueParameters) && C12880j.m40224a((Object) this.typeParameters, (Object) methodSignatureData.typeParameters)) {
                        if (!(this.hasStableParameterNames == methodSignatureData.hasStableParameterNames) || !C12880j.m40224a((Object) this.errors, (Object) methodSignatureData.errors)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final List<String> getErrors() {
            return this.errors;
        }

        public final boolean getHasStableParameterNames() {
            return this.hasStableParameterNames;
        }

        public final KotlinType getReceiverType() {
            return this.receiverType;
        }

        public final KotlinType getReturnType() {
            return this.returnType;
        }

        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.typeParameters;
        }

        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.valueParameters;
        }

        public int hashCode() {
            KotlinType kotlinType = this.returnType;
            int i = 0;
            int hashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
            KotlinType kotlinType2 = this.receiverType;
            int hashCode2 = (hashCode + (kotlinType2 != null ? kotlinType2.hashCode() : 0)) * 31;
            List<ValueParameterDescriptor> list = this.valueParameters;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            List<TypeParameterDescriptor> list2 = this.typeParameters;
            int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.hasStableParameterNames;
            if (z) {
                z = true;
            }
            int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
            List<String> list3 = this.errors;
            if (list3 != null) {
                i = list3.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MethodSignatureData(returnType=");
            sb.append(this.returnType);
            sb.append(", receiverType=");
            sb.append(this.receiverType);
            sb.append(", valueParameters=");
            sb.append(this.valueParameters);
            sb.append(", typeParameters=");
            sb.append(this.typeParameters);
            sb.append(", hasStableParameterNames=");
            sb.append(this.hasStableParameterNames);
            sb.append(", errors=");
            sb.append(this.errors);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    protected static final class ResolvedValueParameters {
        private final List<ValueParameterDescriptor> descriptors;
        private final boolean hasSynthesizedNames;

        public ResolvedValueParameters(List<? extends ValueParameterDescriptor> list, boolean z) {
            this.descriptors = list;
            this.hasSynthesizedNames = z;
        }

        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.descriptors;
        }

        public final boolean getHasSynthesizedNames() {
            return this.hasSynthesizedNames;
        }
    }

    static {
        Class<LazyJavaScope> cls = LazyJavaScope.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext) {
        this.f29563c = lazyJavaResolverContext;
    }

    private final PropertyDescriptorImpl createPropertyDescriptor(JavaField javaField) {
        boolean z = !javaField.isFinal();
        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f29563c, javaField), Modality.FINAL, javaField.getVisibility(), z, javaField.getName(), this.f29563c.getComponents().getSourceElementFactory().source(javaField), isFinalStatic(javaField));
        C12880j.m40222a((Object) create, "JavaPropertyDescriptor.c…d.isFinalStatic\n        )");
        return create;
    }

    private final Set<Name> getFunctionNamesLazy() {
        return (Set) StorageKt.getValue(this.functionNamesLazy$delegate, (Object) this, $$delegatedProperties[0]);
    }

    private final Set<Name> getPropertyNamesLazy() {
        return (Set) StorageKt.getValue(this.propertyNamesLazy$delegate, (Object) this, $$delegatedProperties[1]);
    }

    private final KotlinType getPropertyType(JavaField javaField) {
        boolean z = false;
        KotlinType transformJavaType = this.f29563c.getTypeResolver().transformJavaType(javaField.getType(), JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null));
        if ((KotlinBuiltIns.isPrimitiveType(transformJavaType) || KotlinBuiltIns.isString(transformJavaType)) && isFinalStatic(javaField) && javaField.getHasConstantNotNullInitializer()) {
            z = true;
        }
        if (!z) {
            return transformJavaType;
        }
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(transformJavaType);
        C12880j.m40222a((Object) makeNotNullable, "TypeUtils.makeNotNullable(propertyType)");
        return makeNotNullable;
    }

    private final boolean isFinalStatic(JavaField javaField) {
        return javaField.isFinal() && javaField.isStatic();
    }

    /* access modifiers changed from: private */
    public final PropertyDescriptor resolveProperty(JavaField javaField) {
        PropertyDescriptorImpl createPropertyDescriptor = createPropertyDescriptor(javaField);
        createPropertyDescriptor.initialize(null, null, null, null);
        createPropertyDescriptor.setType(getPropertyType(javaField), C13185o.m40513a(), getDispatchReceiverParameter(), null);
        if (DescriptorUtils.shouldRecordInitializerForProperty(createPropertyDescriptor, createPropertyDescriptor.getType())) {
            createPropertyDescriptor.setCompileTimeInitializer(this.f29563c.getStorageManager().createNullableLazyValue(new LazyJavaScope$resolveProperty$1(this, javaField, createPropertyDescriptor)));
        }
        this.f29563c.getComponents().getJavaResolverCache().recordField(javaField, createPropertyDescriptor);
        return createPropertyDescriptor;
    }

    /* access modifiers changed from: protected */
    public abstract Set<Name> computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    /* access modifiers changed from: protected */
    public final List<DeclarationDescriptor> computeDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : computeClassNames(descriptorKindFilter, function1)) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    CollectionsKt.addIfNotNull(linkedHashSet, getContributedClassifier(name, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(NonExtensions.INSTANCE)) {
            for (Name name2 : computeFunctionNames(descriptorKindFilter, function1)) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(NonExtensions.INSTANCE)) {
            for (Name name3 : computePropertyNames(descriptorKindFilter, function1)) {
                if (((Boolean) function1.invoke(name3)).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, noLookupLocation));
                }
            }
        }
        return C13199w.m40606q(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    public abstract Set<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    /* access modifiers changed from: protected */
    public abstract DeclaredMemberIndex computeMemberIndex();

    /* access modifiers changed from: protected */
    public final KotlinType computeMethodReturnType(JavaMethod javaMethod, LazyJavaResolverContext lazyJavaResolverContext) {
        return lazyJavaResolverContext.getTypeResolver().transformJavaType(javaMethod.getReturnType(), JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, javaMethod.getContainingClass().isAnnotationType(), null, 2, null));
    }

    /* access modifiers changed from: protected */
    public abstract void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> collection, Name name);

    /* access modifiers changed from: protected */
    public abstract void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection);

    /* access modifiers changed from: protected */
    public abstract Set<Name> computePropertyNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    /* access modifiers changed from: protected */
    public final LazyJavaResolverContext getC() {
        return this.f29563c;
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        return (Collection) this.allDescriptors.invoke();
    }

    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        if (!getFunctionNames().contains(name)) {
            return C13185o.m40513a();
        }
        return (Collection) this.functions.invoke(name);
    }

    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        if (!getVariableNames().contains(name)) {
            return C13185o.m40513a();
        }
        return (Collection) this.properties.invoke(name);
    }

    /* access modifiers changed from: protected */
    public final NotNullLazyValue<DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.declaredMemberIndex;
    }

    /* access modifiers changed from: protected */
    public abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    public Set<Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    /* access modifiers changed from: protected */
    public abstract DeclarationDescriptor getOwnerDescriptor();

    public Set<Name> getVariableNames() {
        return getPropertyNamesLazy();
    }

    /* access modifiers changed from: protected */
    public boolean isVisibleAsFunction(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract MethodSignatureData resolveMethodSignature(JavaMethod javaMethod, List<? extends TypeParameterDescriptor> list, KotlinType kotlinType, List<? extends ValueParameterDescriptor> list2);

    /* access modifiers changed from: protected */
    public final JavaMethodDescriptor resolveMethodToFunctionDescriptor(JavaMethod javaMethod) {
        Map map;
        JavaMethodDescriptor createJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f29563c, javaMethod), javaMethod.getName(), this.f29563c.getComponents().getSourceElementFactory().source(javaMethod));
        C12880j.m40222a((Object) createJavaMethod, "JavaMethodDescriptor.cre….source(method)\n        )");
        LazyJavaResolverContext childForMethod$default = ContextKt.childForMethod$default(this.f29563c, createJavaMethod, javaMethod, 0, 4, null);
        List typeParameters = javaMethod.getTypeParameters();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (true) {
            ReceiverParameterDescriptor receiverParameterDescriptor = null;
            if (it.hasNext()) {
                TypeParameterDescriptor resolveTypeParameter = childForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
                if (resolveTypeParameter != null) {
                    arrayList.add(resolveTypeParameter);
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            } else {
                ResolvedValueParameters resolveValueParameters = resolveValueParameters(childForMethod$default, createJavaMethod, javaMethod.getValueParameters());
                MethodSignatureData resolveMethodSignature = resolveMethodSignature(javaMethod, arrayList, computeMethodReturnType(javaMethod, childForMethod$default), resolveValueParameters.getDescriptors());
                KotlinType receiverType = resolveMethodSignature.getReceiverType();
                if (receiverType != null) {
                    receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(createJavaMethod, receiverType, Annotations.Companion.getEMPTY());
                }
                ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
                List typeParameters2 = resolveMethodSignature.getTypeParameters();
                List valueParameters = resolveMethodSignature.getValueParameters();
                KotlinType returnType = resolveMethodSignature.getReturnType();
                Modality convertFromFlags = Modality.Companion.convertFromFlags(javaMethod.isAbstract(), !javaMethod.isFinal());
                Visibility visibility = javaMethod.getVisibility();
                if (resolveMethodSignature.getReceiverType() != null) {
                    map = C13170i0.m40332a(C12907r.m40244a(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, C13199w.m40589f(resolveValueParameters.getDescriptors())));
                } else {
                    map = C13173j0.m40350a();
                }
                createJavaMethod.initialize(receiverParameterDescriptor, dispatchReceiverParameter, typeParameters2, valueParameters, returnType, convertFromFlags, visibility, map);
                createJavaMethod.setParameterNamesStatus(resolveMethodSignature.getHasStableParameterNames(), resolveValueParameters.getHasSynthesizedNames());
                if (!resolveMethodSignature.getErrors().isEmpty()) {
                    childForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(createJavaMethod, resolveMethodSignature.getErrors());
                }
                return createJavaMethod;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters resolveValueParameters(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r21, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r22, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> r23) {
        /*
            r20 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Iterable r1 = kotlin.p590y.C13199w.m40610u(r23)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.p590y.C13187p.m40525a(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = 0
        L_0x001a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0161
            java.lang.Object r5 = r1.next()
            kotlin.y.b0 r5 = (kotlin.p590y.C13152b0) r5
            int r9 = r5.mo34194a()
            java.lang.Object r5 = r5.mo34195b()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter) r5
            r15 = r21
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r10 = kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(r15, r5)
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r6 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r7 = 3
            r8 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(r6, r3, r8, r7, r8)
            kotlin.reflect.jvm.internal.impl.name.FqName r7 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.PARAMETER_NAME_FQ_NAME
            java.lang.String r11 = "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME"
            kotlin.jvm.internal.C12880j.m40222a(r7, r11)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r7 = r10.findAnnotation(r7)
            if (r7 == 0) goto L_0x0061
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(r7)
            if (r7 == 0) goto L_0x0061
            boolean r11 = r7 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
            if (r11 != 0) goto L_0x0056
            r7 = r8
        L_0x0056:
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r7 = (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) r7
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0062
        L_0x0061:
            r7 = r8
        L_0x0062:
            boolean r11 = r5.isVararg()
            r12 = 1
            if (r11 == 0) goto L_0x00a7
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r11 = r5.getType()
            boolean r13 = r11 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
            if (r13 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r8 = r11
        L_0x0073:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType r8 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) r8
            if (r8 == 0) goto L_0x0090
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver r11 = r21.getTypeResolver()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r11.transformArrayType(r8, r6, r12)
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r8 = r21.getModule()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r8 = r8.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r8 = r8.getArrayElementType(r6)
            kotlin.Pair r6 = kotlin.C12907r.m40244a(r6, r8)
            goto L_0x00b7
        L_0x0090:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Vararg parameter should be an array: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver r11 = r21.getTypeResolver()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r13 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r11.transformJavaType(r13, r6)
            kotlin.Pair r6 = kotlin.C12907r.m40244a(r6, r8)
        L_0x00b7:
            java.lang.Object r8 = r6.mo31013a()
            r13 = r8
            kotlin.reflect.jvm.internal.impl.types.KotlinType r13 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r13
            java.lang.Object r6 = r6.mo31014b()
            r16 = r6
            kotlin.reflect.jvm.internal.impl.types.KotlinType r16 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r16
            kotlin.reflect.jvm.internal.impl.name.Name r6 = r22.getName()
            java.lang.String r6 = r6.asString()
            java.lang.String r8 = "equals"
            boolean r6 = kotlin.jvm.internal.C12880j.m40224a(r6, r8)
            if (r6 == 0) goto L_0x00f6
            int r6 = r23.size()
            if (r6 != r12) goto L_0x00f6
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r6 = r21.getModule()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r6 = r6.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r6 = r6.getNullableAnyType()
            boolean r6 = kotlin.jvm.internal.C12880j.m40224a(r6, r13)
            if (r6 == 0) goto L_0x00f6
            java.lang.String r6 = "other"
            kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r6)
        L_0x00f4:
            r11 = r6
            goto L_0x0131
        L_0x00f6:
            if (r7 == 0) goto L_0x010e
            int r6 = r7.length()
            if (r6 <= 0) goto L_0x0100
            r6 = 1
            goto L_0x0101
        L_0x0100:
            r6 = 0
        L_0x0101:
            if (r6 == 0) goto L_0x010e
            boolean r6 = r0.add(r7)
            if (r6 == 0) goto L_0x010e
            kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r7)
            goto L_0x00f4
        L_0x010e:
            kotlin.reflect.jvm.internal.impl.name.Name r6 = r5.getName()
            if (r6 != 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r12 = r4
        L_0x0116:
            if (r6 == 0) goto L_0x011a
            r11 = r6
            goto L_0x0130
        L_0x011a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = 112(0x70, float:1.57E-43)
            r4.append(r6)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            kotlin.reflect.jvm.internal.impl.name.Name r4 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r4)
            r11 = r4
        L_0x0130:
            r4 = r12
        L_0x0131:
            java.lang.String r6 = "if (function.name.asStri…(\"p$index\")\n            }"
            kotlin.jvm.internal.C12880j.m40222a(r11, r6)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl r14 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl
            r8 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r6 = r21.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory r6 = r6.getSourceElementFactory()
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement r5 = r6.source(r5)
            r6 = r14
            r7 = r22
            r12 = r13
            r13 = r17
            r3 = r14
            r14 = r18
            r15 = r19
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.add(r3)
            r3 = 0
            goto L_0x001a
        L_0x0161:
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r2)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$ResolvedValueParameters r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$ResolvedValueParameters
            r1.<init>(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.util.List):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$ResolvedValueParameters");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy scope for ");
        sb.append(getOwnerDescriptor());
        return sb.toString();
    }
}
