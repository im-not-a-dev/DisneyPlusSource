package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C12898l;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* compiled from: DescriptorRenderer.kt */
public abstract class DescriptorRenderer {
    public static final DescriptorRenderer COMPACT = Companion.withOptions(DescriptorRenderer$Companion$COMPACT$1.INSTANCE);
    public static final DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES = Companion.withOptions(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.INSTANCE);
    public static final DescriptorRenderer COMPACT_WITH_MODIFIERS = Companion.withOptions(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.INSTANCE);
    public static final DescriptorRenderer COMPACT_WITH_SHORT_TYPES = Companion.withOptions(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.INSTANCE);
    public static final Companion Companion = new Companion(null);
    public static final DescriptorRenderer DEBUG_TEXT = Companion.withOptions(DescriptorRenderer$Companion$DEBUG_TEXT$1.INSTANCE);
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES = Companion.withOptions(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.INSTANCE);
    public static final DescriptorRenderer HTML = Companion.withOptions(DescriptorRenderer$Companion$HTML$1.INSTANCE);
    public static final DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES = Companion.withOptions(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.INSTANCE);
    public static final DescriptorRenderer SHORT_NAMES_IN_TYPES = Companion.withOptions(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.INSTANCE);

    /* compiled from: DescriptorRenderer.kt */
    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[ClassKind.values().length];

            static {
                $EnumSwitchMapping$0[ClassKind.CLASS.ordinal()] = 1;
                $EnumSwitchMapping$0[ClassKind.INTERFACE.ordinal()] = 2;
                $EnumSwitchMapping$0[ClassKind.ENUM_CLASS.ordinal()] = 3;
                $EnumSwitchMapping$0[ClassKind.OBJECT.ordinal()] = 4;
                $EnumSwitchMapping$0[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                $EnumSwitchMapping$0[ClassKind.ENUM_ENTRY.ordinal()] = 6;
            }
        }

        private Companion() {
        }

        public final String getClassifierKindPrefix(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
            if (classifierDescriptorWithTypeParameters instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (classifierDescriptorWithTypeParameters instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorWithTypeParameters;
                if (classDescriptor.isCompanionObject()) {
                    return "companion object";
                }
                switch (WhenMappings.$EnumSwitchMapping$0[classDescriptor.getKind().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new C12898l();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected classifier: ");
                sb.append(classifierDescriptorWithTypeParameters);
                throw new AssertionError(sb.toString());
            }
        }

        public final DescriptorRenderer withOptions(Function1<? super DescriptorRendererOptions, C13145v> function1) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            function1.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public interface ValueParametersHandler {

        /* compiled from: DescriptorRenderer.kt */
        public static final class DEFAULT implements ValueParametersHandler {
            public static final DEFAULT INSTANCE = new DEFAULT();

            private DEFAULT() {
            }

            public void appendAfterValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i, int i2, StringBuilder sb) {
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }

            public void appendAfterValueParameters(int i, StringBuilder sb) {
                sb.append(")");
            }

            public void appendBeforeValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i, int i2, StringBuilder sb) {
            }

            public void appendBeforeValueParameters(int i, StringBuilder sb) {
                sb.append("(");
            }
        }

        void appendAfterValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i, int i2, StringBuilder sb);

        void appendAfterValueParameters(int i, StringBuilder sb);

        void appendBeforeValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i, int i2, StringBuilder sb);

        void appendBeforeValueParameters(int i, StringBuilder sb);
    }

    public static /* synthetic */ String renderAnnotation$default(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                annotationUseSiteTarget = null;
            }
            return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }

    public abstract String render(DeclarationDescriptor declarationDescriptor);

    public abstract String renderAnnotation(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String renderFlexibleType(String str, String str2, KotlinBuiltIns kotlinBuiltIns);

    public abstract String renderFqName(FqNameUnsafe fqNameUnsafe);

    public abstract String renderName(Name name, boolean z);

    public abstract String renderType(KotlinType kotlinType);

    public abstract String renderTypeProjection(TypeProjection typeProjection);

    public final DescriptorRenderer withOptions(Function1<? super DescriptorRendererOptions, C13145v> function1) {
        DescriptorRendererOptionsImpl copy = ((DescriptorRendererImpl) this).getOptions().copy();
        function1.invoke(copy);
        copy.lock();
        return new DescriptorRendererImpl(copy);
    }
}
