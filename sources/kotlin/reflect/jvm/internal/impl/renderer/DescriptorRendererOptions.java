package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: DescriptorRenderer.kt */
public interface DescriptorRendererOptions {

    /* compiled from: DescriptorRenderer.kt */
    public static final class DefaultImpls {
        public static boolean getIncludeAnnotationArguments(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.getAnnotationArgumentsRenderingPolicy().getIncludeAnnotationArguments();
        }

        public static boolean getIncludeEmptyAnnotationArguments(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.getAnnotationArgumentsRenderingPolicy().getIncludeEmptyAnnotationArguments();
        }
    }

    AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    Set<FqName> getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy);

    void setDebugMode(boolean z);

    void setExcludedTypeAnnotationClasses(Set<FqName> set);

    void setModifiers(Set<? extends DescriptorRendererModifier> set);

    void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    void setReceiverAfterName(boolean z);

    void setRenderCompanionObjectName(boolean z);

    void setStartFromName(boolean z);

    void setTextFormat(RenderingFormat renderingFormat);

    void setVerbose(boolean z);

    void setWithDefinedIn(boolean z);

    void setWithoutSuperTypes(boolean z);

    void setWithoutTypeParameters(boolean z);
}
