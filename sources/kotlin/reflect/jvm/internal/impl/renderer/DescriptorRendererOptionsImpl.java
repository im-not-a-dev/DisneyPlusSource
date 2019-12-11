package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.C13147x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12883m;
import kotlin.jvm.internal.C12884n;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p583f0.C12739a;
import kotlin.p583f0.C12740b;
import kotlin.p583f0.C12742d;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final C12742d actualPropertiesInPrimaryConstructor$delegate;
    private final C12742d alwaysRenderModifiers$delegate;
    private final C12742d annotationArgumentsRenderingPolicy$delegate;
    private final C12742d annotationFilter$delegate;
    private final C12742d boldOnlyForNamesInHtml$delegate;
    private final C12742d classWithPrimaryConstructor$delegate;
    private final C12742d classifierNamePolicy$delegate = property(SOURCE_CODE_QUALIFIED.INSTANCE);
    private final C12742d debugMode$delegate;
    private final C12742d defaultParameterValueRenderer$delegate;
    private final C12742d eachAnnotationOnNewLine$delegate;
    private final C12742d enhancedTypes$delegate;
    private final C12742d excludedAnnotationClasses$delegate;
    private final C12742d excludedTypeAnnotationClasses$delegate;
    private final C12742d includeAdditionalModifiers$delegate;
    private final C12742d includePropertyConstant$delegate;
    private boolean isLocked;
    private final C12742d modifiers$delegate;
    private final C12742d normalizedVisibilities$delegate;
    private final C12742d overrideRenderingPolicy$delegate;
    private final C12742d parameterNameRenderingPolicy$delegate;
    private final C12742d parameterNamesInFunctionalTypes$delegate;
    private final C12742d presentableUnresolvedTypes$delegate;
    private final C12742d propertyAccessorRenderingPolicy$delegate;
    private final C12742d receiverAfterName$delegate;
    private final C12742d renderCompanionObjectName$delegate;
    private final C12742d renderConstructorDelegation$delegate;
    private final C12742d renderConstructorKeyword$delegate;
    private final C12742d renderDefaultAnnotationArguments$delegate;
    private final C12742d renderDefaultModality$delegate;
    private final C12742d renderDefaultVisibility$delegate;
    private final C12742d renderFunctionContracts$delegate;
    private final C12742d renderPrimaryConstructorParametersAsProperties$delegate;
    private final C12742d renderTypeExpansions$delegate;
    private final C12742d renderUnabbreviatedType$delegate;
    private final C12742d secondaryConstructorsAsPrimary$delegate;
    private final C12742d startFromDeclarationKeyword$delegate;
    private final C12742d startFromName$delegate;
    private final C12742d textFormat$delegate;
    private final C12742d typeNormalizer$delegate;
    private final C12742d uninferredTypeParameterAsName$delegate;
    private final C12742d unitReturnType$delegate;
    private final C12742d valueParametersHandler$delegate;
    private final C12742d verbose$delegate;
    private final C12742d withDefinedIn$delegate;
    private final C12742d withSourceFileForTopLevel$delegate;
    private final C12742d withoutReturnType$delegate;
    private final C12742d withoutSuperTypes$delegate;
    private final C12742d withoutTypeParameters$delegate;

    static {
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "withDefinedIn", "getWithDefinedIn()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "modifiers", "getModifiers()Ljava/util/Set;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "startFromName", "getStartFromName()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "debugMode", "getDebugMode()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "verbose", "getVerbose()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "unitReturnType", "getUnitReturnType()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "withoutReturnType", "getWithoutReturnType()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "enhancedTypes", "getEnhancedTypes()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderDefaultModality", "getRenderDefaultModality()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "includePropertyConstant", "getIncludePropertyConstant()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "receiverAfterName", "getReceiverAfterName()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C12895y.m40233a((C12883m) new C12884n(C12895y.m40230a((Class) cls), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z"))};
    }

    public DescriptorRendererOptionsImpl() {
        Boolean valueOf = Boolean.valueOf(true);
        this.withDefinedIn$delegate = property(valueOf);
        this.withSourceFileForTopLevel$delegate = property(valueOf);
        this.modifiers$delegate = property(DescriptorRendererModifier.DEFAULTS);
        Boolean valueOf2 = Boolean.valueOf(false);
        this.startFromName$delegate = property(valueOf2);
        this.startFromDeclarationKeyword$delegate = property(valueOf2);
        this.debugMode$delegate = property(valueOf2);
        this.classWithPrimaryConstructor$delegate = property(valueOf2);
        this.verbose$delegate = property(valueOf2);
        this.unitReturnType$delegate = property(valueOf);
        this.withoutReturnType$delegate = property(valueOf2);
        this.enhancedTypes$delegate = property(valueOf2);
        this.normalizedVisibilities$delegate = property(valueOf2);
        this.renderDefaultVisibility$delegate = property(valueOf);
        this.renderDefaultModality$delegate = property(valueOf);
        this.renderConstructorDelegation$delegate = property(valueOf2);
        this.renderPrimaryConstructorParametersAsProperties$delegate = property(valueOf2);
        this.actualPropertiesInPrimaryConstructor$delegate = property(valueOf2);
        this.uninferredTypeParameterAsName$delegate = property(valueOf2);
        this.includePropertyConstant$delegate = property(valueOf2);
        this.withoutTypeParameters$delegate = property(valueOf2);
        this.withoutSuperTypes$delegate = property(valueOf2);
        this.typeNormalizer$delegate = property(DescriptorRendererOptionsImpl$typeNormalizer$2.INSTANCE);
        this.defaultParameterValueRenderer$delegate = property(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.INSTANCE);
        this.secondaryConstructorsAsPrimary$delegate = property(valueOf);
        this.overrideRenderingPolicy$delegate = property(OverrideRenderingPolicy.RENDER_OPEN);
        this.valueParametersHandler$delegate = property(DEFAULT.INSTANCE);
        this.textFormat$delegate = property(RenderingFormat.PLAIN);
        this.parameterNameRenderingPolicy$delegate = property(ParameterNameRenderingPolicy.ALL);
        this.receiverAfterName$delegate = property(valueOf2);
        this.renderCompanionObjectName$delegate = property(valueOf2);
        this.propertyAccessorRenderingPolicy$delegate = property(PropertyAccessorRenderingPolicy.DEBUG);
        this.renderDefaultAnnotationArguments$delegate = property(valueOf2);
        this.eachAnnotationOnNewLine$delegate = property(valueOf2);
        this.excludedAnnotationClasses$delegate = property(C13188p0.m40531a());
        this.excludedTypeAnnotationClasses$delegate = property(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve());
        this.annotationFilter$delegate = property(null);
        this.annotationArgumentsRenderingPolicy$delegate = property(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.alwaysRenderModifiers$delegate = property(valueOf2);
        this.renderConstructorKeyword$delegate = property(valueOf);
        this.renderUnabbreviatedType$delegate = property(valueOf);
        this.renderTypeExpansions$delegate = property(valueOf2);
        this.includeAdditionalModifiers$delegate = property(valueOf);
        this.parameterNamesInFunctionalTypes$delegate = property(valueOf);
        this.renderFunctionContracts$delegate = property(valueOf2);
        this.presentableUnresolvedTypes$delegate = property(valueOf2);
        this.boldOnlyForNamesInHtml$delegate = property(valueOf2);
    }

    private final <T> C12742d<DescriptorRendererOptionsImpl, T> property(T t) {
        C12739a aVar = C12739a.f29411a;
        return new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(t, t, this);
    }

    public final DescriptorRendererOptionsImpl copy() {
        Field[] declaredFields;
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        for (Field field : cls.getDeclaredFields()) {
            Intrinsics.checkReturnedValueIsNotNull((Object) field, "field");
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (!(obj instanceof C12740b)) {
                    obj = null;
                }
                C12740b bVar = (C12740b) obj;
                if (bVar != null) {
                    String name = field.getName();
                    String str = "field.name";
                    Intrinsics.checkReturnedValueIsNotNull((Object) name, str);
                    boolean b = true ^ C12832w.m40123b(name, "is", false, 2, null);
                    if (!C13147x.f29590a || b) {
                        KClass a = C12895y.m40230a((Class) cls);
                        String name2 = field.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("get");
                        String name3 = field.getName();
                        Intrinsics.checkReturnedValueIsNotNull((Object) name3, str);
                        sb.append(C12832w.m40125f(name3));
                        field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.property(bVar.getValue(this, new C12891u(a, name2, sb.toString()))));
                    } else {
                        throw new AssertionError("Fields named is* are not supported here yet");
                    }
                } else {
                    continue;
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) this.actualPropertiesInPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.alwaysRenderModifiers$delegate.getValue(this, $$delegatedProperties[38])).booleanValue();
    }

    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.annotationArgumentsRenderingPolicy$delegate.getValue(this, $$delegatedProperties[37]);
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return (Function1) this.annotationFilter$delegate.getValue(this, $$delegatedProperties[36]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) this.boldOnlyForNamesInHtml$delegate.getValue(this, $$delegatedProperties[46])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.classWithPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.classifierNamePolicy$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public boolean getDebugMode() {
        return ((Boolean) this.debugMode$delegate.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (Function1) this.defaultParameterValueRenderer$delegate.getValue(this, $$delegatedProperties[23]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) this.eachAnnotationOnNewLine$delegate.getValue(this, $$delegatedProperties[33])).booleanValue();
    }

    public boolean getEnhancedTypes() {
        return ((Boolean) this.enhancedTypes$delegate.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.excludedAnnotationClasses$delegate.getValue(this, $$delegatedProperties[34]);
    }

    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.excludedTypeAnnotationClasses$delegate.getValue(this, $$delegatedProperties[35]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.includeAdditionalModifiers$delegate.getValue(this, $$delegatedProperties[42])).booleanValue();
    }

    public boolean getIncludeAnnotationArguments() {
        return DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.includePropertyConstant$delegate.getValue(this, $$delegatedProperties[19])).booleanValue();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.modifiers$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.normalizedVisibilities$delegate.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.overrideRenderingPolicy$delegate.getValue(this, $$delegatedProperties[25]);
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.parameterNameRenderingPolicy$delegate.getValue(this, $$delegatedProperties[28]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.parameterNamesInFunctionalTypes$delegate.getValue(this, $$delegatedProperties[43])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) this.presentableUnresolvedTypes$delegate.getValue(this, $$delegatedProperties[45])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) this.propertyAccessorRenderingPolicy$delegate.getValue(this, $$delegatedProperties[31]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.receiverAfterName$delegate.getValue(this, $$delegatedProperties[29])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.renderCompanionObjectName$delegate.getValue(this, $$delegatedProperties[30])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) this.renderConstructorDelegation$delegate.getValue(this, $$delegatedProperties[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.renderConstructorKeyword$delegate.getValue(this, $$delegatedProperties[39])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.renderDefaultAnnotationArguments$delegate.getValue(this, $$delegatedProperties[32])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) this.renderDefaultModality$delegate.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.renderDefaultVisibility$delegate.getValue(this, $$delegatedProperties[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) this.renderPrimaryConstructorParametersAsProperties$delegate.getValue(this, $$delegatedProperties[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) this.renderTypeExpansions$delegate.getValue(this, $$delegatedProperties[41])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.renderUnabbreviatedType$delegate.getValue(this, $$delegatedProperties[40])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.secondaryConstructorsAsPrimary$delegate.getValue(this, $$delegatedProperties[24])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.startFromDeclarationKeyword$delegate.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.startFromName$delegate.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.textFormat$delegate.getValue(this, $$delegatedProperties[27]);
    }

    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return (Function1) this.typeNormalizer$delegate.getValue(this, $$delegatedProperties[22]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.uninferredTypeParameterAsName$delegate.getValue(this, $$delegatedProperties[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.unitReturnType$delegate.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    public ValueParametersHandler getValueParametersHandler() {
        return (ValueParametersHandler) this.valueParametersHandler$delegate.getValue(this, $$delegatedProperties[26]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.verbose$delegate.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.withDefinedIn$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.withSourceFileForTopLevel$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.withoutReturnType$delegate.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.withoutSuperTypes$delegate.getValue(this, $$delegatedProperties[21])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.withoutTypeParameters$delegate.getValue(this, $$delegatedProperties[20])).booleanValue();
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void lock() {
        boolean z = !this.isLocked;
        if (!C13147x.f29590a || z) {
            this.isLocked = true;
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        this.annotationArgumentsRenderingPolicy$delegate.setValue(this, $$delegatedProperties[37], annotationArgumentsRenderingPolicy);
    }

    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        this.classifierNamePolicy$delegate.setValue(this, $$delegatedProperties[0], classifierNamePolicy);
    }

    public void setDebugMode(boolean z) {
        this.debugMode$delegate.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        this.excludedTypeAnnotationClasses$delegate.setValue(this, $$delegatedProperties[35], set);
    }

    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        this.modifiers$delegate.setValue(this, $$delegatedProperties[3], set);
    }

    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.parameterNameRenderingPolicy$delegate.setValue(this, $$delegatedProperties[28], parameterNameRenderingPolicy);
    }

    public void setReceiverAfterName(boolean z) {
        this.receiverAfterName$delegate.setValue(this, $$delegatedProperties[29], Boolean.valueOf(z));
    }

    public void setRenderCompanionObjectName(boolean z) {
        this.renderCompanionObjectName$delegate.setValue(this, $$delegatedProperties[30], Boolean.valueOf(z));
    }

    public void setStartFromName(boolean z) {
        this.startFromName$delegate.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public void setTextFormat(RenderingFormat renderingFormat) {
        this.textFormat$delegate.setValue(this, $$delegatedProperties[27], renderingFormat);
    }

    public void setVerbose(boolean z) {
        this.verbose$delegate.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public void setWithDefinedIn(boolean z) {
        this.withDefinedIn$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public void setWithoutSuperTypes(boolean z) {
        this.withoutSuperTypes$delegate.setValue(this, $$delegatedProperties[21], Boolean.valueOf(z));
    }

    public void setWithoutTypeParameters(boolean z) {
        this.withoutTypeParameters$delegate.setValue(this, $$delegatedProperties[20], Boolean.valueOf(z));
    }
}
