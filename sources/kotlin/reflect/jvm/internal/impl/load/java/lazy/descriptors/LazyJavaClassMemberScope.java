package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13147x;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    private final NotNullLazyValue<List<ClassConstructorDescriptor>> constructors;
    /* access modifiers changed from: private */
    public final NotNullLazyValue<Map<Name, JavaField>> enumEntryIndex;
    /* access modifiers changed from: private */
    public final JavaClass jClass;
    /* access modifiers changed from: private */
    public final NotNullLazyValue<Set<Name>> nestedClassIndex;
    private final MemoizedFunctionToNullable<Name, ClassDescriptorBase> nestedClasses;
    private final ClassDescriptor ownerDescriptor;

    public LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass) {
        super(lazyJavaResolverContext);
        this.ownerDescriptor = classDescriptor;
        this.jClass = javaClass;
        this.constructors = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$constructors$1(this, lazyJavaResolverContext));
        this.nestedClassIndex = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$nestedClassIndex$1(this));
        this.enumEntryIndex = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.nestedClasses = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new LazyJavaClassMemberScope$nestedClasses$1(this, lazyJavaResolverContext));
    }

    private final void addAnnotationValueParameter(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        C12880j.m40222a((Object) makeNotNullable, "TypeUtils.makeNotNullable(returnType)");
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(constructorDescriptor, null, i, empty, name, makeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? TypeUtils.makeNotNullable(kotlinType2) : null, getC().getComponents().getSourceElementFactory().source(javaMethod));
        List<ValueParameterDescriptor> list2 = list;
        list.add(valueParameterDescriptorImpl);
    }

    private final void addFunctionFromSupertypes(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z) {
        Collection<SimpleFunctionDescriptor> resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
        C12880j.m40222a((Object) resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…s.errorReporter\n        )");
        if (!z) {
            collection.addAll(resolveOverridesForNonStaticMembers);
            return;
        }
        List d = C13199w.m40583d((Collection) collection, (Iterable) resolveOverridesForNonStaticMembers);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) resolveOverridesForNonStaticMembers, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : resolveOverridesForNonStaticMembers) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptor);
            if (simpleFunctionDescriptor2 != null) {
                C12880j.m40222a((Object) simpleFunctionDescriptor, "resolvedOverride");
                simpleFunctionDescriptor = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(simpleFunctionDescriptor, simpleFunctionDescriptor2, d);
            }
            arrayList.add(simpleFunctionDescriptor);
        }
        collection.addAll(arrayList);
    }

    private final void addOverriddenSpecialMethods(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltinWithDifferentJvmName(simpleFunctionDescriptor, function1, name, collection));
            CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltInWithErasedValueParametersInJava(simpleFunctionDescriptor, function1, collection));
            CollectionsKt.addIfNotNull(collection3, obtainOverrideForSuspend(simpleFunctionDescriptor, function1));
        }
    }

    private final void addPropertyOverrideByMethod(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor createPropertyDescriptorByMethods : set) {
            JavaPropertyDescriptor createPropertyDescriptorByMethods2 = createPropertyDescriptorByMethods(createPropertyDescriptorByMethods, function1);
            if (createPropertyDescriptorByMethods2 != null) {
                collection.add(createPropertyDescriptorByMethods2);
                return;
            }
        }
    }

    private final void computeAnnotationProperties(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) C13199w.m40603n(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).findMethodsByName(name));
        if (javaMethod != null) {
            collection.add(createPropertyDescriptorWithDefaultGetter$default(this, javaMethod, null, Modality.FINAL, 2, null));
        }
    }

    private final List<ValueParameterDescriptor> createAnnotationConstructorParameters(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Pair pair;
        Collection methods = this.jClass.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes attributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : methods) {
            if (C12880j.m40224a((Object) ((JavaMethod) next).getName(), (Object) JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.mo31013a();
        List<JavaMethod> list2 = (List) pair2.mo31014b();
        int i = 0;
        boolean z = list.size() <= 1;
        if (!C13147x.f29590a || z) {
            JavaMethod javaMethod = (JavaMethod) C13199w.m40591g(list);
            if (javaMethod != null) {
                JavaType returnType = javaMethod.getReturnType();
                if (returnType instanceof JavaArrayType) {
                    JavaArrayType javaArrayType = (JavaArrayType) returnType;
                    pair = new Pair(getC().getTypeResolver().transformArrayType(javaArrayType, attributes$default, true), getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default));
                } else {
                    pair = new Pair(getC().getTypeResolver().transformJavaType(returnType, attributes$default), null);
                }
                addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, 0, javaMethod, (KotlinType) pair.mo31013a(), (KotlinType) pair.mo31014b());
            }
            int i2 = javaMethod != null ? 1 : 0;
            for (JavaMethod javaMethod2 : list2) {
                addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, i + i2, javaMethod2, getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default), null);
                i++;
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("There can't be more than one method named 'value' in annotation class: ");
        sb.append(this.jClass);
        throw new AssertionError(sb.toString());
    }

    /* access modifiers changed from: private */
    public final ClassConstructorDescriptor createDefaultConstructor() {
        List list;
        boolean isAnnotationType = this.jClass.isAnnotationType();
        if (this.jClass.isInterface() && !isAnnotationType) {
            return null;
        }
        ClassDescriptor ownerDescriptor2 = getOwnerDescriptor();
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor2, Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        C12880j.m40222a((Object) createJavaConstructor, "JavaClassConstructorDesc….source(jClass)\n        )");
        if (isAnnotationType) {
            list = createAnnotationConstructorParameters(createJavaConstructor);
        } else {
            list = Collections.emptyList();
        }
        createJavaConstructor.setHasSynthesizedParameterNames(false);
        createJavaConstructor.initialize(list, getConstructorVisibility(ownerDescriptor2));
        createJavaConstructor.setHasStableParameterNames(true);
        createJavaConstructor.setReturnType(ownerDescriptor2.getDefaultType());
        getC().getComponents().getJavaResolverCache().recordConstructor(this.jClass, createJavaConstructor);
        return createJavaConstructor;
    }

    private final SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        boolean z;
        boolean z2 = true;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
                if (!(!C12880j.m40224a((Object) simpleFunctionDescriptor, (Object) simpleFunctionDescriptor2)) || simpleFunctionDescriptor2.getInitialSignatureDescriptor() != null || !doesOverride(simpleFunctionDescriptor2, callableDescriptor)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return simpleFunctionDescriptor;
        }
        FunctionDescriptor build = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
        if (build != null) {
            return (SimpleFunctionDescriptor) build;
        }
        C12880j.m40220a();
        throw null;
    }

    private final SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        Object obj;
        Name name = functionDescriptor.getName();
        C12880j.m40222a((Object) name, "overridden.name");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hasSameJvmDescriptorButDoesNotOverride((SimpleFunctionDescriptor) obj, functionDescriptor)) {
                break;
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        CopyBuilder newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        C12880j.m40222a((Object) valueParameters, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) valueParameters, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
            C12880j.m40222a((Object) valueParameterDescriptor, "it");
            KotlinType type = valueParameterDescriptor.getType();
            C12880j.m40222a((Object) type, "it.type");
            arrayList.add(new ValueParameterData(type, valueParameterDescriptor.declaresDefaultValue()));
        }
        List valueParameters2 = simpleFunctionDescriptor.getValueParameters();
        C12880j.m40222a((Object) valueParameters2, "override.valueParameters");
        newCopyBuilder.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, functionDescriptor));
        newCopyBuilder.setSignatureChange();
        newCopyBuilder.setPreserveSourceElement();
        return (SimpleFunctionDescriptor) newCopyBuilder.build();
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor] */
    /* JADX WARNING: type inference failed for: r1v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.Modality] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], kotlin.reflect.jvm.internal.impl.descriptors.Modality, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl]
      uses: [kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor, java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl]
      mth insns count: 87
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor createPropertyDescriptorByMethods(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r10, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> r11) {
        /*
            r9 = this;
            boolean r0 = r9.doesClassOverridesProperty(r10, r11)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r0 = r9.findGetterOverride(r10, r11)
            if (r0 == 0) goto L_0x00f9
            boolean r2 = r10.isVar()
            if (r2 == 0) goto L_0x001f
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r11 = r9.findSetterOverride(r10, r11)
            if (r11 == 0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r1
        L_0x001f:
            r11 = r1
        L_0x0020:
            r2 = 1
            if (r11 == 0) goto L_0x002f
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r11.getModality()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r0.getModality()
            if (r3 != r4) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            boolean r3 = kotlin.C13147x.f29590a
            if (r3 == 0) goto L_0x0072
            if (r2 != 0) goto L_0x0072
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Different accessors modalities when creating overrides for "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r10 = " in "
            r2.append(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r10 = r9.getOwnerDescriptor()
            r2.append(r10)
            java.lang.String r10 = "for getter is "
            r2.append(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r10 = r0.getModality()
            r2.append(r10)
            java.lang.String r10 = ", but for setter is "
            r2.append(r10)
            if (r11 == 0) goto L_0x0065
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r11.getModality()
        L_0x0065:
            r2.append(r1)
            java.lang.String r10 = r2.toString()
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>(r10)
            throw r11
        L_0x0072:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor r8 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = r9.getOwnerDescriptor()
            r8.<init>(r2, r0, r11, r10)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = r0.getReturnType()
            if (r10 == 0) goto L_0x00f5
            java.util.List r2 = kotlin.p590y.C13185o.m40513a()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r3 = r9.getDispatchReceiverParameter()
            r8.setType(r10, r2, r3, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r0.getAnnotations()
            r4 = 0
            r5 = 0
            r6 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r7 = r0.getSource()
            r2 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r10 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createGetter(r2, r3, r4, r5, r6, r7)
            r10.setInitialSignatureDescriptor(r0)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r8.getType()
            r10.initialize(r0)
            java.lang.String r0 = "DescriptorFactory.create…escriptor.type)\n        }"
            kotlin.jvm.internal.C12880j.m40222a(r10, r0)
            if (r11 == 0) goto L_0x00f1
            java.util.List r0 = r11.getValueParameters()
            java.lang.String r1 = "setterMethod.valueParameters"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            java.lang.Object r0 = kotlin.p590y.C13199w.m40591g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            if (r0 == 0) goto L_0x00da
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r1 = r11.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r0.getAnnotations()
            r3 = 0
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r6 = r11.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r7 = r11.getSource()
            r0 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createSetter(r0, r1, r2, r3, r4, r5, r6, r7)
            r1.setInitialSignatureDescriptor(r11)
            goto L_0x00f1
        L_0x00da:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No parameter found for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L_0x00f1:
            r8.initialize(r10, r1)
            return r8
        L_0x00f5:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r1
        L_0x00f9:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.jvm.functions.Function1):kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor");
    }

    private final JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        KotlinType kotlinType2;
        JavaMethod javaMethod2 = javaMethod;
        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod2), modality, javaMethod.getVisibility(), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod2), false);
        C12880j.m40222a((Object) create, "JavaPropertyDescriptor.c…inal = */ false\n        )");
        PropertyGetterDescriptorImpl createDefaultGetter = DescriptorFactory.createDefaultGetter(create, Annotations.Companion.getEMPTY());
        C12880j.m40222a((Object) createDefaultGetter, "DescriptorFactory.create…iptor, Annotations.EMPTY)");
        create.initialize(createDefaultGetter, null);
        if (kotlinType != null) {
            kotlinType2 = kotlinType;
        } else {
            kotlinType2 = computeMethodReturnType(javaMethod2, ContextKt.childForMethod$default(getC(), create, javaMethod, 0, 4, null));
        }
        create.setType(kotlinType2, C13185o.m40513a(), getDispatchReceiverParameter(), null);
        createDefaultGetter.initialize(kotlinType2);
        return create;
    }

    static /* synthetic */ JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter$default(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i, Object obj) {
        if ((i & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter(javaMethod, kotlinType, modality);
    }

    private final SimpleFunctionDescriptor createRenamedCopy(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        CopyBuilder newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        newCopyBuilder.setName(name);
        newCopyBuilder.setSignatureChange();
        newCopyBuilder.setPreserveSourceElement();
        FunctionDescriptor build = newCopyBuilder.build();
        if (build != null) {
            return (SimpleFunctionDescriptor) build;
        }
        C12880j.m40220a();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createSuspendView(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.getValueParameters()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            java.lang.Object r0 = kotlin.p590y.C13199w.m40595i(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            r2 = 0
            if (r0 == 0) goto L_0x008a
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.getDeclarationDescriptor()
            if (r3 == 0) goto L_0x0035
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(r3)
            if (r3 == 0) goto L_0x0035
            boolean r4 = r3.isSafe()
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0035
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.toSafe()
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4 = r5.getC()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r4 = r4.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings r4 = r4.getSettings()
            boolean r4 = r4.isReleaseCoroutines()
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.isContinuation(r3, r4)
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            if (r0 == 0) goto L_0x008a
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r6.newCopyBuilder()
            java.util.List r6 = r6.getValueParameters()
            kotlin.jvm.internal.C12880j.m40222a(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.p590y.C13199w.m40575c(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r2.setValueParameters(r6)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.util.List r0 = r0.getArguments()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r6.setReturnType(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) r0
            if (r0 == 0) goto L_0x0089
            r0.setSuspend(r1)
        L_0x0089:
            return r6
        L_0x008a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.createSuspendView(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    private final boolean doesClassOverridesProperty(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        boolean z = false;
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        SimpleFunctionDescriptor findSetterOverride = findSetterOverride(propertyDescriptor, function1);
        if (findGetterOverride == null) {
            return false;
        }
        if (!propertyDescriptor.isVar()) {
            return true;
        }
        if (findSetterOverride != null && findSetterOverride.getModality() == findGetterOverride.getModality()) {
            z = true;
        }
        return z;
    }

    private final boolean doesOverride(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true);
        C12880j.m40222a((Object) isOverridableByWithoutExternalConditions, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
        Result result = isOverridableByWithoutExternalConditions.getResult();
        C12880j.m40222a((Object) result, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
        if (result != Result.OVERRIDABLE || JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor)) {
            return false;
        }
        return true;
    }

    private final boolean doesOverrideRenamedBuiltins(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        C12880j.m40222a((Object) name, "name");
        List<Name> builtinFunctionNamesByJvmName = builtinMethodsWithDifferentJvmName.getBuiltinFunctionNamesByJvmName(name);
        if ((builtinFunctionNamesByJvmName instanceof Collection) && builtinFunctionNamesByJvmName.isEmpty()) {
            return false;
        }
        for (Name name2 : builtinFunctionNamesByJvmName) {
            Set functionsFromSupertypes = getFunctionsFromSupertypes(name2);
            ArrayList arrayList = new ArrayList();
            for (Object next : functionsFromSupertypes) {
                if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) next)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                SimpleFunctionDescriptor createRenamedCopy = createRenamedCopy(simpleFunctionDescriptor, name2);
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (doesOverrideRenamedDescriptor((SimpleFunctionDescriptor) it.next(), createRenamedCopy)) {
                                z = true;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            z = false;
            continue;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final boolean doesOverrideRenamedDescriptor(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        C12880j.m40222a((Object) functionDescriptor, "if (superDescriptor.isRe…iginal else subDescriptor");
        return doesOverride(functionDescriptor, simpleFunctionDescriptor);
    }

    private final boolean doesOverrideSuspendFunction(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        SimpleFunctionDescriptor createSuspendView = createSuspendView(simpleFunctionDescriptor);
        if (createSuspendView == null) {
            return false;
        }
        Name name = simpleFunctionDescriptor.getName();
        C12880j.m40222a((Object) name, "name");
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if ((functionsFromSupertypes instanceof Collection) && functionsFromSupertypes.isEmpty()) {
            return false;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : functionsFromSupertypes) {
            if (!simpleFunctionDescriptor2.isSuspend() || !doesOverride(createSuspendView, simpleFunctionDescriptor2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final SimpleFunctionDescriptor findGetterByName(PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name identifier = Name.identifier(str);
        C12880j.m40222a((Object) identifier, "Name.identifier(getterName)");
        Iterator it = ((Iterable) function1.invoke(identifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType != null ? kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType()) : false) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor findGetterOverride(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        String str = null;
        CallableMemberDescriptor callableMemberDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        if (callableMemberDescriptor != null) {
            str = BuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(callableMemberDescriptor);
        }
        if (str != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), callableMemberDescriptor)) {
            return findGetterByName(propertyDescriptor, str, function1);
        }
        String str2 = JvmAbi.getterName(propertyDescriptor.getName().asString());
        C12880j.m40222a((Object) str2, "JvmAbi.getterName(name.asString())");
        return findGetterByName(propertyDescriptor, str2, function1);
    }

    private final SimpleFunctionDescriptor findSetterOverride(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name identifier = Name.identifier(JvmAbi.setterName(propertyDescriptor.getName().asString()));
        C12880j.m40222a((Object) identifier, "Name.identifier(JvmAbi.s…terName(name.asString()))");
        Iterator it = ((Iterable) function1.invoke(identifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1) {
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType != null && KotlinBuiltIns.isUnit(returnType)) {
                    KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                    List valueParameters = simpleFunctionDescriptor2.getValueParameters();
                    C12880j.m40222a((Object) valueParameters, "descriptor.valueParameters");
                    Object k = C13199w.m40599k(valueParameters);
                    C12880j.m40222a(k, "descriptor.valueParameters.single()");
                    if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) k).getType(), propertyDescriptor.getType())) {
                        simpleFunctionDescriptor = simpleFunctionDescriptor2;
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final Visibility getConstructorVisibility(ClassDescriptor classDescriptor) {
        Visibility visibility = classDescriptor.getVisibility();
        C12880j.m40222a((Object) visibility, "classDescriptor.visibility");
        if (!C12880j.m40224a((Object) visibility, (Object) JavaVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            return visibility;
        }
        Visibility visibility2 = JavaVisibilities.PROTECTED_AND_PACKAGE;
        C12880j.m40222a((Object) visibility2, "JavaVisibilities.PROTECTED_AND_PACKAGE");
        return visibility2;
    }

    private final Set<SimpleFunctionDescriptor> getFunctionsFromSupertypes(Name name) {
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (KotlinType memberScope : supertypes) {
            C13196t.m40545a((Collection) linkedHashSet, (Iterable) memberScope.getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<PropertyDescriptor> getPropertiesFromSupertypes(Name name) {
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "ownerDescriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (KotlinType memberScope : supertypes) {
            Collection<PropertyDescriptor> contributedVariables = memberScope.getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) contributedVariables, 10));
            for (PropertyDescriptor add : contributedVariables) {
                arrayList2.add(add);
            }
            C13196t.m40545a((Collection) arrayList, (Iterable) arrayList2);
        }
        return C13199w.m40609t(arrayList);
    }

    private final boolean hasSameJvmDescriptorButDoesNotOverride(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        C12880j.m40222a((Object) original, "builtinWithErasedParameters.original");
        if (!C12880j.m40224a((Object) computeJvmDescriptor$default, (Object) MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) || doesOverride(simpleFunctionDescriptor, functionDescriptor)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isVisibleAsFunctionInCurrentClass(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r7) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x0073
        L_0x001b:
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.name.Name r1 = (kotlin.reflect.jvm.internal.impl.name.Name) r1
            java.util.Set r1 = r6.getPropertiesFromSupertypes(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x003b
        L_0x0039:
            r1 = 0
            goto L_0x0070
        L_0x003b:
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1 r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1
            r5.<init>(r6, r7)
            boolean r5 = r6.doesClassOverridesProperty(r4, r5)
            if (r5 == 0) goto L_0x006c
            boolean r4 = r4.isVar()
            if (r4 != 0) goto L_0x006a
            kotlin.reflect.jvm.internal.impl.name.Name r4 = r7.getName()
            java.lang.String r4 = r4.asString()
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isSetterName(r4)
            if (r4 != 0) goto L_0x006c
        L_0x006a:
            r4 = 1
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            if (r4 == 0) goto L_0x003f
            r1 = 1
        L_0x0070:
            if (r1 == 0) goto L_0x001f
            r0 = 1
        L_0x0073:
            if (r0 == 0) goto L_0x0076
            return r3
        L_0x0076:
            boolean r0 = r6.doesOverrideRenamedBuiltins(r7)
            if (r0 != 0) goto L_0x0089
            boolean r0 = r6.shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(r7)
            if (r0 != 0) goto L_0x0089
            boolean r7 = r6.doesOverrideSuspendFunction(r7)
            if (r7 != 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):boolean");
    }

    private final SimpleFunctionDescriptor obtainOverrideForBuiltInWithErasedValueParametersInJava(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Collection<? extends SimpleFunctionDescriptor> collection) {
        FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor);
        if (overriddenBuiltinFunctionWithErasedValueParametersInJava == null) {
            return null;
        }
        SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded = createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(overriddenBuiltinFunctionWithErasedValueParametersInJava, function1);
        if (createOverrideForBuiltinFunctionWithErasedParameterIfNeeded == null) {
            return null;
        }
        if (!isVisibleAsFunctionInCurrentClass(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded)) {
            createOverrideForBuiltinFunctionWithErasedParameterIfNeeded = null;
        }
        if (createOverrideForBuiltinFunctionWithErasedParameterIfNeeded != null) {
            return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
        }
        return null;
    }

    private final SimpleFunctionDescriptor obtainOverrideForBuiltinWithDifferentJvmName(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 == null) {
            return null;
        }
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor2);
        if (jvmMethodNameIfSpecial != null) {
            Name identifier = Name.identifier(jvmMethodNameIfSpecial);
            C12880j.m40222a((Object) identifier, "Name.identifier(nameInJava)");
            for (SimpleFunctionDescriptor createRenamedCopy : (Collection) function1.invoke(identifier)) {
                SimpleFunctionDescriptor createRenamedCopy2 = createRenamedCopy(createRenamedCopy, name);
                if (doesOverrideRenamedDescriptor(simpleFunctionDescriptor2, createRenamedCopy2)) {
                    return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createRenamedCopy2, simpleFunctionDescriptor2, collection);
                }
            }
            return null;
        }
        C12880j.m40220a();
        throw null;
    }

    private final SimpleFunctionDescriptor obtainOverrideForSuspend(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2;
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Name name = simpleFunctionDescriptor.getName();
        C12880j.m40222a((Object) name, "descriptor.name");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                simpleFunctionDescriptor2 = null;
                break;
            }
            simpleFunctionDescriptor2 = createSuspendView((SimpleFunctionDescriptor) it.next());
            if (simpleFunctionDescriptor2 == null || !doesOverride(simpleFunctionDescriptor2, simpleFunctionDescriptor)) {
                simpleFunctionDescriptor2 = null;
                continue;
            }
            if (simpleFunctionDescriptor2 != null) {
                break;
            }
        }
        return simpleFunctionDescriptor2;
    }

    /* access modifiers changed from: private */
    public final JavaClassConstructorDescriptor resolveConstructor(JavaConstructor javaConstructor) {
        ClassDescriptor ownerDescriptor2 = getOwnerDescriptor();
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor2, LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaConstructor), false, getC().getComponents().getSourceElementFactory().source(javaConstructor));
        C12880j.m40222a((Object) createJavaConstructor, "JavaClassConstructorDesc…ce(constructor)\n        )");
        LazyJavaResolverContext childForMethod = ContextKt.childForMethod(getC(), createJavaConstructor, javaConstructor, ownerDescriptor2.getDeclaredTypeParameters().size());
        ResolvedValueParameters resolveValueParameters = resolveValueParameters(childForMethod, createJavaConstructor, javaConstructor.getValueParameters());
        List declaredTypeParameters = ownerDescriptor2.getDeclaredTypeParameters();
        C12880j.m40222a((Object) declaredTypeParameters, "classDescriptor.declaredTypeParameters");
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) typeParameters, 10));
        for (JavaTypeParameter resolveTypeParameter : typeParameters) {
            TypeParameterDescriptor resolveTypeParameter2 = childForMethod.getTypeParameterResolver().resolveTypeParameter(resolveTypeParameter);
            if (resolveTypeParameter2 != null) {
                arrayList.add(resolveTypeParameter2);
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
        createJavaConstructor.initialize(resolveValueParameters.getDescriptors(), javaConstructor.getVisibility(), C13199w.m40583d((Collection) declaredTypeParameters, (Iterable) arrayList));
        createJavaConstructor.setHasStableParameterNames(false);
        createJavaConstructor.setHasSynthesizedParameterNames(resolveValueParameters.getHasSynthesizedNames());
        createJavaConstructor.setReturnType(ownerDescriptor2.getDefaultType());
        childForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor, createJavaConstructor);
        return createJavaConstructor;
    }

    /* access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> searchMethodsByNameWithoutBuiltinMagic(Name name) {
        Collection<JavaMethod> findMethodsByName = ((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).findMethodsByName(name);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) findMethodsByName, 10));
        for (JavaMethod resolveMethodToFunctionDescriptor : findMethodsByName) {
            arrayList.add(resolveMethodToFunctionDescriptor(resolveMethodToFunctionDescriptor));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> searchMethodsInSupertypesWithoutBuiltinMagic(Name name) {
        Set functionsFromSupertypes = getFunctionsFromSupertypes(name);
        ArrayList arrayList = new ArrayList();
        for (Object next : functionsFromSupertypes) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
            if (!(SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) || BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) != null)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final boolean shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        String str = "name";
        C12880j.m40222a((Object) name, str);
        boolean sameAsBuiltinMethodWithErasedValueParameters = builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name);
        boolean z = false;
        if (!sameAsBuiltinMethodWithErasedValueParameters) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        C12880j.m40222a((Object) name2, str);
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name2);
        ArrayList arrayList = new ArrayList();
        for (SimpleFunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava : functionsFromSupertypes) {
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava2 = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava2 != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava2);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (hasSameJvmDescriptorButDoesNotOverride(simpleFunctionDescriptor, (FunctionDescriptor) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public Set<Name> computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        return C13190q0.m40534a((Set) this.nestedClassIndex.invoke(), (Iterable) ((Map) this.enumEntryIndex.invoke()).keySet());
    }

    /* access modifiers changed from: protected */
    public void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> collection, Name name) {
        boolean z;
        Set functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if (!BuiltinMethodsWithDifferentJvmName.INSTANCE.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            if (!(functionsFromSupertypes instanceof Collection) || !functionsFromSupertypes.isEmpty()) {
                Iterator it = functionsFromSupertypes.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isSuspend()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object next : functionsFromSupertypes) {
                    if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) next)) {
                        arrayList.add(next);
                    }
                }
                addFunctionFromSupertypes(collection, name, arrayList, false);
                return;
            }
        }
        SmartSet create = SmartSet.Companion.create();
        Collection resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, functionsFromSupertypes, C13185o.m40513a(), getOwnerDescriptor(), ErrorReporter.DO_NOTHING);
        C12880j.m40222a((Object) resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…rter.DO_NOTHING\n        )");
        addOverriddenSpecialMethods(name, collection, resolveOverridesForNonStaticMembers, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        addOverriddenSpecialMethods(name, collection, resolveOverridesForNonStaticMembers, create, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : functionsFromSupertypes) {
            if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) next2)) {
                arrayList2.add(next2);
            }
        }
        addFunctionFromSupertypes(collection, name, C13199w.m40583d((Collection) arrayList2, (Iterable) create), true);
    }

    /* access modifiers changed from: protected */
    public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
        if (this.jClass.isAnnotationType()) {
            computeAnnotationProperties(name, collection);
        }
        Set propertiesFromSupertypes = getPropertiesFromSupertypes(name);
        if (!propertiesFromSupertypes.isEmpty()) {
            SmartSet create = SmartSet.Companion.create();
            addPropertyOverrideByMethod(propertiesFromSupertypes, collection, new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
            addPropertyOverrideByMethod(propertiesFromSupertypes, create, new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
            Collection resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, C13190q0.m40534a(propertiesFromSupertypes, (Iterable) create), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
            C12880j.m40222a((Object) resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…rorReporter\n            )");
            collection.addAll(resolveOverridesForNonStaticMembers);
        }
    }

    /* access modifiers changed from: protected */
    public Set<Name> computePropertyNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        if (this.jClass.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getFieldNames());
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "ownerDescriptor.typeConstructor.supertypes");
        for (KotlinType memberScope : supertypes) {
            C13196t.m40545a((Collection) linkedHashSet, (Iterable) memberScope.getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.constructors;
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        return (ClassifierDescriptor) this.nestedClasses.invoke(name);
    }

    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        return super.getContributedFunctions(name, lookupLocation);
    }

    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        return super.getContributedVariables(name, lookupLocation);
    }

    /* access modifiers changed from: protected */
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    /* access modifiers changed from: protected */
    public boolean isVisibleAsFunction(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.jClass.isAnnotationType()) {
            return false;
        }
        return isVisibleAsFunctionInCurrentClass(javaMethodDescriptor);
    }

    public void recordLookup(Name name, LookupLocation lookupLocation) {
        UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, getOwnerDescriptor(), name);
    }

    /* access modifiers changed from: protected */
    public MethodSignatureData resolveMethodSignature(JavaMethod javaMethod, List<? extends TypeParameterDescriptor> list, KotlinType kotlinType, List<? extends ValueParameterDescriptor> list2) {
        PropagatedSignature resolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(javaMethod, getOwnerDescriptor(), kotlinType, null, list2, list);
        C12880j.m40222a((Object) resolvePropagatedSignature, "c.components.signaturePr…dTypeParameters\n        )");
        KotlinType returnType = resolvePropagatedSignature.getReturnType();
        C12880j.m40222a((Object) returnType, "propagated.returnType");
        KotlinType receiverType = resolvePropagatedSignature.getReceiverType();
        List valueParameters = resolvePropagatedSignature.getValueParameters();
        C12880j.m40222a((Object) valueParameters, "propagated.valueParameters");
        List typeParameters = resolvePropagatedSignature.getTypeParameters();
        C12880j.m40222a((Object) typeParameters, "propagated.typeParameters");
        boolean hasStableParameterNames = resolvePropagatedSignature.hasStableParameterNames();
        List errors = resolvePropagatedSignature.getErrors();
        C12880j.m40222a((Object) errors, "propagated.errors");
        MethodSignatureData methodSignatureData = new MethodSignatureData(returnType, receiverType, valueParameters, typeParameters, hasStableParameterNames, errors);
        return methodSignatureData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy Java member scope for ");
        sb.append(this.jClass.getFqName());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public HashSet<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "ownerDescriptor.typeConstructor.supertypes");
        HashSet<Name> hashSet = new HashSet<>();
        for (KotlinType memberScope : supertypes) {
            C13196t.m40545a((Collection) hashSet, (Iterable) memberScope.getMemberScope().getFunctionNames());
        }
        hashSet.addAll(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getMethodNames());
        hashSet.addAll(computeClassNames(descriptorKindFilter, function1));
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaClassMemberScope$computeMemberIndex$1.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public ClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}
