package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C12898l;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.C13147x;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils.UninferredParameterTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnresolvedType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Lazy functionTypeAnnotationsRenderer$delegate;
    private final Lazy functionTypeParameterTypesRenderer$delegate;
    private final DescriptorRendererOptionsImpl options;

    /* compiled from: DescriptorRendererImpl.kt */
    private final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<C13145v, StringBuilder> {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[PropertyAccessorRenderingPolicy.values().length];

            static {
                $EnumSwitchMapping$0[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                $EnumSwitchMapping$0[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                $EnumSwitchMapping$0[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        private final void visitPropertyAccessorDescriptor(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) {
            int i = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i == 1) {
                DescriptorRendererImpl.this.renderAccessorModifiers(propertyAccessorDescriptor, sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" for ");
                sb.append(sb2.toString());
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
                Intrinsics.checkReturnedValueIsNotNull((Object) correspondingProperty, "descriptor.correspondingProperty");
                descriptorRendererImpl.renderProperty(correspondingProperty, sb);
            } else if (i == 2) {
                visitFunctionDescriptor((FunctionDescriptor) propertyAccessorDescriptor, sb);
            }
        }

        public /* bridge */ /* synthetic */ Object visitClassDescriptor(ClassDescriptor classDescriptor, Object obj) {
            visitClassDescriptor(classDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, Object obj) {
            visitConstructorDescriptor(constructorDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitFunctionDescriptor(FunctionDescriptor functionDescriptor, Object obj) {
            visitFunctionDescriptor(functionDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitModuleDeclaration(ModuleDescriptor moduleDescriptor, Object obj) {
            visitModuleDeclaration(moduleDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, Object obj) {
            visitPackageFragmentDescriptor(packageFragmentDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, Object obj) {
            visitPackageViewDescriptor(packageViewDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, Object obj) {
            visitPropertyDescriptor(propertyDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, Object obj) {
            visitPropertyGetterDescriptor(propertyGetterDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, Object obj) {
            visitPropertySetterDescriptor(propertySetterDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, Object obj) {
            visitReceiverParameterDescriptor(receiverParameterDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, Object obj) {
            visitTypeAliasDescriptor(typeAliasDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, Object obj) {
            visitTypeParameterDescriptor(typeParameterDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public /* bridge */ /* synthetic */ Object visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, Object obj) {
            visitValueParameterDescriptor(valueParameterDescriptor, (StringBuilder) obj);
            return C13145v.f29587a;
        }

        public void visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderClass(classDescriptor, sb);
        }

        public void visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderConstructor(constructorDescriptor, sb);
        }

        public void visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderFunction(functionDescriptor, sb);
        }

        public void visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderName(moduleDescriptor, sb, true);
        }

        public void visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderPackageFragment(packageFragmentDescriptor, sb);
        }

        public void visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderPackageView(packageViewDescriptor, sb);
        }

        public void visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderProperty(propertyDescriptor, sb);
        }

        public void visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb) {
            visitPropertyAccessorDescriptor(propertyGetterDescriptor, sb, "getter");
        }

        public void visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb) {
            visitPropertyAccessorDescriptor(propertySetterDescriptor, sb, "setter");
        }

        public void visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb) {
            sb.append(receiverParameterDescriptor.getName());
        }

        public void visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderTypeAlias(typeAliasDescriptor, sb);
        }

        public void visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderTypeParameter(typeParameterDescriptor, sb, true);
        }

        public void visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb) {
            DescriptorRendererImpl.this.renderValueParameter(valueParameterDescriptor, true, sb, true);
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[RenderingFormat.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[RenderingFormat.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[RenderingFormat.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$3 = new int[RenderingFormat.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$4 = new int[ParameterNameRenderingPolicy.values().length];

        static {
            $EnumSwitchMapping$0[RenderingFormat.PLAIN.ordinal()] = 1;
            $EnumSwitchMapping$0[RenderingFormat.HTML.ordinal()] = 2;
            $EnumSwitchMapping$1[RenderingFormat.PLAIN.ordinal()] = 1;
            $EnumSwitchMapping$1[RenderingFormat.HTML.ordinal()] = 2;
            $EnumSwitchMapping$2[RenderingFormat.PLAIN.ordinal()] = 1;
            $EnumSwitchMapping$2[RenderingFormat.HTML.ordinal()] = 2;
            $EnumSwitchMapping$3[RenderingFormat.PLAIN.ordinal()] = 1;
            $EnumSwitchMapping$3[RenderingFormat.HTML.ordinal()] = 2;
            $EnumSwitchMapping$4[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            $EnumSwitchMapping$4[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            $EnumSwitchMapping$4[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
        }
    }

    static {
        Class<DescriptorRendererImpl> cls = DescriptorRendererImpl.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "functionTypeAnnotationsRenderer", "getFunctionTypeAnnotationsRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRendererImpl;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "functionTypeParameterTypesRenderer", "getFunctionTypeParameterTypesRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer;"))};
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.options = descriptorRendererOptionsImpl;
        boolean isLocked = this.options.isLocked();
        if (!C13147x.f29590a || isLocked) {
            this.functionTypeAnnotationsRenderer$delegate = C12763i.m39921a(new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));
            this.functionTypeParameterTypesRenderer$delegate = C12763i.m39921a(new DescriptorRendererImpl$functionTypeParameterTypesRenderer$2(this));
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    private final void appendDefinedIn(StringBuilder sb, DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor)) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                sb.append(" is a module");
                return;
            }
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null && !(containingDeclaration instanceof ModuleDescriptor)) {
                String str = " ";
                sb.append(str);
                sb.append(renderMessage("defined in"));
                sb.append(str);
                FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
                Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "DescriptorUtils.getFqName(containingDeclaration)");
                sb.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
                if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource)) {
                    SourceElement source = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource();
                    Intrinsics.checkReturnedValueIsNotNull((Object) source, "descriptor.source");
                    SourceFile containingFile = source.getContainingFile();
                    Intrinsics.checkReturnedValueIsNotNull((Object) containingFile, "descriptor.source.containingFile");
                    String name = containingFile.getName();
                    if (name != null) {
                        sb.append(str);
                        sb.append(renderMessage("in file"));
                        sb.append(str);
                        sb.append(name);
                    }
                }
            }
        }
    }

    private final void appendTypeProjections(StringBuilder sb, List<? extends TypeProjection> list) {
        List<? extends TypeProjection> list2 = list;
        StringBuilder sb2 = sb;
        C13199w.m40557a(list2, sb2, ", ", null, null, 0, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60, null);
    }

    private final String arrow() {
        int i = WhenMappings.$EnumSwitchMapping$2[getTextFormat().ordinal()];
        if (i == 1) {
            return escape("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new C12898l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0.toString(), (java.lang.Object) r8) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean differsOnlyInNullability(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            java.lang.String r0 = kotlin.p588j0.C12832w.m40117a(r0, r1, r2, r3, r4, r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0050
            r0 = 2
            r2 = 0
            java.lang.String r3 = "?"
            boolean r0 = kotlin.p588j0.C12832w.m40121a(r8, r3, r1, r0, r2)
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r2 = 63
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r0 != 0) goto L_0x0050
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 40
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r7 == 0) goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.differsOnlyInNullability(java.lang.String, java.lang.String):boolean");
    }

    private final String escape(String str) {
        return getTextFormat().escape(str);
    }

    private final DescriptorRendererImpl getFunctionTypeAnnotationsRenderer() {
        Lazy lazy = this.functionTypeAnnotationsRenderer$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (DescriptorRendererImpl) lazy.getValue();
    }

    private final DescriptorRenderer getFunctionTypeParameterTypesRenderer() {
        Lazy lazy = this.functionTypeParameterTypesRenderer$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (DescriptorRenderer) lazy.getValue();
    }

    /* renamed from: gt */
    private final String m40245gt() {
        return escape(">");
    }

    private final boolean hasModifiersOrAnnotations(KotlinType kotlinType) {
        return FunctionTypesKt.isSuspendFunctionType(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    private final Modality implicitModalityWithoutExtensions(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkReturnedValueIsNotNull((Object) overriddenDescriptors, "this.overriddenDescriptors");
        if ((!overriddenDescriptors.isEmpty()) && classDescriptor.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || !(!Intrinsics.areEqual((Object) callableMemberDescriptor.getVisibility(), (Object) Visibilities.PRIVATE))) {
            return Modality.FINAL;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Modality modality2 = Modality.ABSTRACT;
        if (modality != modality2) {
            modality2 = Modality.OPEN;
        }
        return modality2;
    }

    /* renamed from: lt */
    private final String m40246lt() {
        return escape("<");
    }

    private final boolean overridesSomething(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }

    private final void renderAbbreviatedTypeExpansion(StringBuilder sb, AbbreviatedType abbreviatedType) {
        if (getTextFormat() == RenderingFormat.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
        sb.append(" */");
        if (getTextFormat() == RenderingFormat.HTML) {
            sb.append("</i></font>");
        }
    }

    /* access modifiers changed from: private */
    public final void renderAccessorModifiers(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb) {
        renderMemberModifiers(propertyAccessorDescriptor, sb);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void renderAdditionalModifiers(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r7, java.lang.StringBuilder r8) {
        /*
            r6 = this;
            boolean r0 = r7.isOperator()
            java.lang.String r1 = "it"
            java.lang.String r2 = "functionDescriptor.overriddenDescriptors"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0043
            java.util.Collection r0 = r7.getOverriddenDescriptors()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L_0x001f
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x001f
        L_0x001d:
            r0 = 1
            goto L_0x0039
        L_0x001f:
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x001d
            java.lang.Object r5 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r5
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r1)
            boolean r5 = r5.isOperator()
            if (r5 == 0) goto L_0x0023
            r0 = 0
        L_0x0039:
            if (r0 != 0) goto L_0x0041
            boolean r0 = r6.getAlwaysRenderModifiers()
            if (r0 == 0) goto L_0x0043
        L_0x0041:
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            boolean r5 = r7.isInfix()
            if (r5 == 0) goto L_0x0080
            java.util.Collection r5 = r7.getOverriddenDescriptors()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r2)
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L_0x005d
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x005d
        L_0x005b:
            r1 = 1
            goto L_0x0077
        L_0x005d:
            java.util.Iterator r2 = r5.iterator()
        L_0x0061:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x005b
            java.lang.Object r5 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r5
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r1)
            boolean r5 = r5.isInfix()
            if (r5 == 0) goto L_0x0061
            r1 = 0
        L_0x0077:
            if (r1 != 0) goto L_0x007f
            boolean r1 = r6.getAlwaysRenderModifiers()
            if (r1 == 0) goto L_0x0080
        L_0x007f:
            r3 = 1
        L_0x0080:
            boolean r1 = r7.isTailrec()
            java.lang.String r2 = "tailrec"
            r6.renderModifier(r8, r1, r2)
            r6.renderSuspendModifier(r7, r8)
            boolean r7 = r7.isInline()
            java.lang.String r1 = "inline"
            r6.renderModifier(r8, r7, r1)
            java.lang.String r7 = "infix"
            r6.renderModifier(r8, r3, r7)
            java.lang.String r7 = "operator"
            r6.renderModifier(r8, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderAdditionalModifiers(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.StringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4 A[LOOP:3: B:30:0x009e->B:32:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> renderAndSortAnnotationArguments(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r8) {
        /*
            r7 = this;
            java.util.Map r0 = r8.getAllValueArguments()
            boolean r1 = r7.getRenderDefaultAnnotationArguments()
            r2 = 0
            if (r1 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r8 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(r8)
            goto L_0x0011
        L_0x0010:
            r8 = r2
        L_0x0011:
            r1 = 10
            if (r8 == 0) goto L_0x0067
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r8 = r8.getUnsubstitutedPrimaryConstructor()
            if (r8 == 0) goto L_0x0067
            java.util.List r8 = r8.getValueParameters()
            if (r8 == 0) goto L_0x0067
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x002a:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r8.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r4
            boolean r4 = r4.declaresDefaultValue()
            if (r4 == 0) goto L_0x002a
            r2.add(r3)
            goto L_0x002a
        L_0x0041:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r3 = kotlin.p590y.C13187p.m40525a(r2, r1)
            r8.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x004e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0068
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r3
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r3.getName()
            r8.add(r3)
            goto L_0x004e
        L_0x0067:
            r8 = r2
        L_0x0068:
            if (r8 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            java.util.List r8 = kotlin.p590y.C13185o.m40513a()
        L_0x006f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x0078:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r3.next()
            r5 = r4
            kotlin.reflect.jvm.internal.impl.name.Name r5 = (kotlin.reflect.jvm.internal.impl.name.Name) r5
            boolean r5 = r0.containsKey(r5)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0078
            r2.add(r4)
            goto L_0x0078
        L_0x0091:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.p590y.C13187p.m40525a(r2, r1)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x009e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.name.Name r4 = (kotlin.reflect.jvm.internal.impl.name.Name) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = r4.asString()
            r5.append(r4)
            java.lang.String r4 = " = ..."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.add(r4)
            goto L_0x009e
        L_0x00c3:
            java.util.Set r0 = r0.entrySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = kotlin.p590y.C13187p.m40525a(r0, r1)
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00d4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0115
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            kotlin.reflect.jvm.internal.impl.name.Name r4 = (kotlin.reflect.jvm.internal.impl.name.Name) r4
            java.lang.Object r1 = r1.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.asString()
            r5.append(r6)
            java.lang.String r6 = " = "
            r5.append(r6)
            boolean r4 = r8.contains(r4)
            if (r4 != 0) goto L_0x0108
            java.lang.String r1 = r7.renderConstant(r1)
            goto L_0x010a
        L_0x0108:
            java.lang.String r1 = "..."
        L_0x010a:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.add(r1)
            goto L_0x00d4
        L_0x0115:
            java.util.List r8 = kotlin.p590y.C13199w.m40583d(r3, r2)
            java.util.List r8 = kotlin.p590y.C13199w.m40604o(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderAndSortAnnotationArguments(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor):java.util.List");
    }

    private final void renderAnnotations(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            Function1 annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!C13199w.m40564a((Iterable) excludedTypeAnnotationClasses, (Object) annotationDescriptor.getFqName()) && (annotationFilter == null || ((Boolean) annotationFilter.invoke(annotationDescriptor)).booleanValue())) {
                    sb.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        C12828s.m40102a(sb);
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    static /* synthetic */ void renderAnnotations$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.renderAnnotations(sb, annotated, annotationUseSiteTarget);
    }

    private final void renderCapturedTypeParametersIfRequired(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) declaredTypeParameters, "classifier.declaredTypeParameters");
        TypeConstructor typeConstructor = classifierDescriptorWithTypeParameters.getTypeConstructor();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor, "classifier.typeConstructor");
        List parameters = typeConstructor.getParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) parameters, "classifier.typeConstructor.parameters");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb.append(" /*captured type parameters: ");
            renderTypeParameterList(sb, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* access modifiers changed from: private */
    public final void renderClass(ClassDescriptor classDescriptor, StringBuilder sb) {
        boolean z = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        String str = "klass.kind";
        if (!getStartFromName()) {
            renderAnnotations$default(this, sb, classDescriptor, null, 2, null);
            if (!z) {
                Visibility visibility = classDescriptor.getVisibility();
                Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "klass.visibility");
                renderVisibility(visibility, sb);
            }
            if (!(classDescriptor.getKind() == ClassKind.INTERFACE && classDescriptor.getModality() == Modality.ABSTRACT)) {
                ClassKind kind = classDescriptor.getKind();
                Intrinsics.checkReturnedValueIsNotNull((Object) kind, str);
                if (!kind.isSingleton() || classDescriptor.getModality() != Modality.FINAL) {
                    Modality modality = classDescriptor.getModality();
                    Intrinsics.checkReturnedValueIsNotNull((Object) modality, "klass.modality");
                    renderModality(modality, sb, implicitModalityWithoutExtensions(classDescriptor));
                }
            }
            renderMemberModifiers(classDescriptor, sb);
            renderModifier(sb, getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner(), "inner");
            renderModifier(sb, getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData(), "data");
            renderModifier(sb, getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            renderClassKindPrefix(classDescriptor, sb);
        }
        if (!DescriptorUtils.isCompanionObject(classDescriptor)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            renderName(classDescriptor, sb, true);
        } else {
            renderCompanionObjectName(classDescriptor, sb);
        }
        if (!z) {
            List declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) declaredTypeParameters, "klass.declaredTypeParameters");
            renderTypeParameters(declaredTypeParameters, sb, false);
            renderCapturedTypeParametersIfRequired(classDescriptor, sb);
            ClassKind kind2 = classDescriptor.getKind();
            Intrinsics.checkReturnedValueIsNotNull((Object) kind2, str);
            if (!kind2.isSingleton() && getClassWithPrimaryConstructor()) {
                ClassConstructorDescriptor unsubstitutedPrimaryConstructor = classDescriptor.getUnsubstitutedPrimaryConstructor();
                if (unsubstitutedPrimaryConstructor != null) {
                    sb.append(" ");
                    renderAnnotations$default(this, sb, unsubstitutedPrimaryConstructor, null, 2, null);
                    Visibility visibility2 = unsubstitutedPrimaryConstructor.getVisibility();
                    Intrinsics.checkReturnedValueIsNotNull((Object) visibility2, "primaryConstructor.visibility");
                    renderVisibility(visibility2, sb);
                    sb.append(renderKeyword("constructor"));
                    List valueParameters = unsubstitutedPrimaryConstructor.getValueParameters();
                    Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "primaryConstructor.valueParameters");
                    renderValueParameters(valueParameters, unsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb);
                }
            }
            renderSuperTypes(classDescriptor, sb);
            renderWhereSuffix(declaredTypeParameters, sb);
        }
    }

    private final void renderClassKindPrefix(ClassDescriptor classDescriptor, StringBuilder sb) {
        sb.append(renderKeyword(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final void renderCompanionObjectName(DeclarationDescriptor declarationDescriptor, StringBuilder sb) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb.append("companion object");
            }
            renderSpaceIfNeeded(sb);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb.append("of ");
                Name name = containingDeclaration.getName();
                Intrinsics.checkReturnedValueIsNotNull((Object) name, "containingDeclaration.name");
                sb.append(renderName(name, false));
            }
        }
        if (getVerbose() || (!Intrinsics.areEqual((Object) declarationDescriptor.getName(), (Object) SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT))) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            Name name2 = declarationDescriptor.getName();
            Intrinsics.checkReturnedValueIsNotNull((Object) name2, "descriptor.name");
            sb.append(renderName(name2, true));
        }
    }

    /* access modifiers changed from: private */
    public final String renderConstant(ConstantValue<?> constantValue) {
        if (constantValue instanceof ArrayValue) {
            return C13199w.m40559a((Iterable) ((ArrayValue) constantValue).getValue(), ", ", "{", "}", 0, null, new DescriptorRendererImpl$renderConstant$1(this), 24, null);
        } else if (constantValue instanceof AnnotationValue) {
            return C12833x.m40137a(DescriptorRenderer.renderAnnotation$default(this, (AnnotationDescriptor) ((AnnotationValue) constantValue).getValue(), null, 2, null), (CharSequence) "@");
        } else {
            if (!(constantValue instanceof KClassValue)) {
                return constantValue.toString();
            }
            Value value = (Value) ((KClassValue) constantValue).getValue();
            String str = "::class";
            if (value instanceof LocalClass) {
                StringBuilder sb = new StringBuilder();
                sb.append(((LocalClass) value).getType());
                sb.append(str);
                return sb.toString();
            } else if (value instanceof NormalClass) {
                NormalClass normalClass = (NormalClass) value;
                String asString = normalClass.getClassId().asSingleFqName().asString();
                Intrinsics.checkReturnedValueIsNotNull((Object) asString, "classValue.classId.asSingleFqName().asString()");
                int arrayDimensions = normalClass.getArrayDimensions();
                for (int i = 0; i < arrayDimensions; i++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("kotlin.Array<");
                    sb2.append(asString);
                    sb2.append('>');
                    asString = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(asString);
                sb3.append(str);
                return sb3.toString();
            } else {
                throw new C12898l();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void renderConstructor(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
        StringBuilder sb2 = sb;
        renderAnnotations$default(this, sb, constructorDescriptor, null, 2, null);
        Visibility visibility = constructorDescriptor.getVisibility();
        Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "constructor.visibility");
        boolean renderVisibility = renderVisibility(visibility, sb2);
        renderMemberKind(constructorDescriptor, sb);
        boolean z = getRenderConstructorKeyword() || !constructorDescriptor.isPrimary() || renderVisibility;
        if (z) {
            sb2.append(renderKeyword("constructor"));
        }
        ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
        Intrinsics.checkReturnedValueIsNotNull((Object) containingDeclaration, "constructor.containingDeclaration");
        String str = "constructor.typeParameters";
        if (getSecondaryConstructorsAsPrimary()) {
            if (z) {
                sb2.append(" ");
            }
            renderName(containingDeclaration, sb2, true);
            List typeParameters = constructorDescriptor.getTypeParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeParameters, str);
            renderTypeParameters(typeParameters, sb2, false);
        }
        List valueParameters = constructorDescriptor.getValueParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "constructor.valueParameters");
        renderValueParameters(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb2);
        if (getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof ClassDescriptor)) {
            ClassConstructorDescriptor unsubstitutedPrimaryConstructor = ((ClassDescriptor) containingDeclaration).getUnsubstitutedPrimaryConstructor();
            if (unsubstitutedPrimaryConstructor != null) {
                List valueParameters2 = unsubstitutedPrimaryConstructor.getValueParameters();
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters2, "primaryConstructor.valueParameters");
                ArrayList arrayList = new ArrayList();
                for (Object next : valueParameters2) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) next;
                    if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sb2.append(" : ");
                    sb2.append(renderKeyword("this"));
                    sb2.append(C13199w.m40559a(arrayList, ", ", "(", ")", 0, null, DescriptorRendererImpl$renderConstructor$1.INSTANCE, 24, null));
                }
            }
        }
        if (getSecondaryConstructorsAsPrimary()) {
            List typeParameters2 = constructorDescriptor.getTypeParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeParameters2, str);
            renderWhereSuffix(typeParameters2, sb2);
        }
    }

    private final void renderDefaultType(StringBuilder sb, KotlinType kotlinType) {
        renderAnnotations$default(this, sb, kotlinType, null, 2, null);
        if (KotlinTypeKt.isError(kotlinType)) {
            if (!(kotlinType instanceof UnresolvedType) || !getPresentableUnresolvedTypes()) {
                sb.append(kotlinType.getConstructor().toString());
            } else {
                sb.append(((UnresolvedType) kotlinType).getPresentableName());
            }
            sb.append(renderTypeArguments(kotlinType.getArguments()));
        } else {
            renderTypeConstructorAndArguments$default(this, sb, kotlinType, null, 2, null);
        }
        if (kotlinType.isMarkedNullable()) {
            sb.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb.append("!!");
        }
    }

    private final String renderError(String str) {
        int i = WhenMappings.$EnumSwitchMapping$1[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("<font color=red><b>");
            sb.append(str);
            sb.append("</b></font>");
            return sb.toString();
        }
        throw new C12898l();
    }

    /* access modifiers changed from: private */
    public final void renderFunction(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        String str = "function.typeParameters";
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderAnnotations$default(this, sb, functionDescriptor, null, 2, null);
                Visibility visibility = functionDescriptor.getVisibility();
                Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "function.visibility");
                renderVisibility(visibility, sb);
                renderModalityForCallable(functionDescriptor, sb);
                if (getIncludeAdditionalModifiers()) {
                    renderMemberModifiers(functionDescriptor, sb);
                }
                renderOverride(functionDescriptor, sb);
                if (getIncludeAdditionalModifiers()) {
                    renderAdditionalModifiers(functionDescriptor, sb);
                } else {
                    renderSuspendModifier(functionDescriptor, sb);
                }
                renderMemberKind(functionDescriptor, sb);
                if (getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(renderKeyword("fun"));
            sb.append(" ");
            List typeParameters = functionDescriptor.getTypeParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeParameters, str);
            renderTypeParameters(typeParameters, sb, true);
            renderReceiver(functionDescriptor, sb);
        }
        renderName(functionDescriptor, sb, true);
        List valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "function.valueParameters");
        renderValueParameters(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb);
        renderReceiverAfterName(functionDescriptor, sb);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : renderType(returnType));
        }
        List typeParameters2 = functionDescriptor.getTypeParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeParameters2, str);
        renderWhereSuffix(typeParameters2, sb);
    }

    private final void renderFunctionType(StringBuilder sb, KotlinType kotlinType) {
        Name name;
        int length = sb.length();
        renderAnnotations$default(getFunctionTypeAnnotationsRenderer(), sb, kotlinType, null, 2, null);
        boolean z = true;
        boolean z2 = sb.length() != length;
        boolean isSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean isMarkedNullable = kotlinType.isMarkedNullable();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        boolean z3 = isMarkedNullable || (z2 && receiverTypeFromFunctionType != null);
        String str = "(";
        if (z3) {
            if (isSuspendFunctionType) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    boolean z4 = C12839z.m40188g(sb) == ' ';
                    if (C13147x.f29590a && !z4) {
                        throw new AssertionError("Assertion failed");
                    } else if (sb.charAt(C12833x.m40172c(sb) - 1) != ')') {
                        sb.insert(C12833x.m40172c(sb), "()");
                    }
                }
                sb.append(str);
            }
        }
        renderModifier(sb, isSuspendFunctionType, "suspend");
        String str2 = ")";
        if (receiverTypeFromFunctionType != null) {
            if ((!shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) || receiverTypeFromFunctionType.isMarkedNullable()) && !hasModifiersOrAnnotations(receiverTypeFromFunctionType)) {
                z = false;
            }
            if (z) {
                sb.append(str);
            }
            renderNormalizedType(sb, receiverTypeFromFunctionType);
            if (z) {
                sb.append(str2);
            }
            sb.append(".");
        }
        sb.append(str);
        int i = 0;
        for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
            if (i > 0) {
                sb.append(", ");
            }
            if (getParameterNamesInFunctionalTypes()) {
                KotlinType type = typeProjection.getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type, "typeProjection.type");
                name = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
            } else {
                name = null;
            }
            if (name != null) {
                sb.append(renderName(name, false));
                sb.append(": ");
            }
            sb.append(getFunctionTypeParameterTypesRenderer().renderTypeProjection(typeProjection));
            i++;
        }
        sb.append(") ");
        sb.append(arrow());
        sb.append(" ");
        renderNormalizedType(sb, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z3) {
            sb.append(str2);
        }
        if (isMarkedNullable) {
            sb.append("?");
        }
    }

    private final void renderInitializer(VariableDescriptor variableDescriptor, StringBuilder sb) {
        if (getIncludePropertyConstant()) {
            ConstantValue compileTimeInitializer = variableDescriptor.getCompileTimeInitializer();
            if (compileTimeInitializer != null) {
                sb.append(" = ");
                Intrinsics.checkReturnedValueIsNotNull((Object) compileTimeInitializer, "constant");
                sb.append(escape(renderConstant(compileTimeInitializer)));
            }
        }
    }

    private final String renderKeyword(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            if (!getBoldOnlyForNamesInHtml()) {
                StringBuilder sb = new StringBuilder();
                sb.append("<b>");
                sb.append(str);
                sb.append("</b>");
                str = sb.toString();
            }
            return str;
        }
        throw new C12898l();
    }

    private final void renderMemberKind(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != Kind.DECLARATION) {
            sb.append("/*");
            String name = callableMemberDescriptor.getKind().name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                sb.append(lowerCase);
                sb.append("*/ ");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    private final void renderMemberModifiers(MemberDescriptor memberDescriptor, StringBuilder sb) {
        renderModifier(sb, memberDescriptor.isExternal(), "external");
        boolean z = true;
        renderModifier(sb, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        if (!getModifiers().contains(DescriptorRendererModifier.ACTUAL) || !memberDescriptor.isActual()) {
            z = false;
        }
        renderModifier(sb, z, "actual");
    }

    private final void renderModality(Modality modality, StringBuilder sb, Modality modality2) {
        if (getRenderDefaultModality() || modality != modality2) {
            boolean contains = getModifiers().contains(DescriptorRendererModifier.MODALITY);
            String name = modality.name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                renderModifier(sb, contains, lowerCase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    private final void renderModalityForCallable(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if ((!DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) || callableMemberDescriptor.getModality() != Modality.FINAL) && !(getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && overridesSomething(callableMemberDescriptor))) {
            Modality modality = callableMemberDescriptor.getModality();
            Intrinsics.checkReturnedValueIsNotNull((Object) modality, "callable.modality");
            renderModality(modality, sb, implicitModalityWithoutExtensions(callableMemberDescriptor));
        }
    }

    private final void renderModifier(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(renderKeyword(str));
            sb.append(" ");
        }
    }

    private final void renderNormalizedType(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof AbbreviatedType)) {
            unwrap = null;
        }
        AbbreviatedType abbreviatedType = (AbbreviatedType) unwrap;
        if (abbreviatedType != null) {
            if (getRenderTypeExpansions()) {
                renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
            } else {
                renderNormalizedTypeAsIs(sb, abbreviatedType.getAbbreviation());
                if (getRenderUnabbreviatedType()) {
                    renderAbbreviatedTypeExpansion(sb, abbreviatedType);
                }
            }
            return;
        }
        renderNormalizedTypeAsIs(sb, kotlinType);
    }

    private final void renderNormalizedTypeAsIs(StringBuilder sb, KotlinType kotlinType) {
        if (!(kotlinType instanceof WrappedType) || !getDebugMode() || ((WrappedType) kotlinType).isComputed()) {
            UnwrappedType unwrap = kotlinType.unwrap();
            if (unwrap instanceof FlexibleType) {
                sb.append(((FlexibleType) unwrap).render(this, this));
            } else if (unwrap instanceof SimpleType) {
                renderSimpleType(sb, (SimpleType) unwrap);
            }
            return;
        }
        sb.append("<Not computed yet>");
    }

    private final void renderOverride(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && overridesSomething(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            renderModifier(sb, true, "override");
            if (getVerbose()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb.append("*/ ");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void renderPackageFragment(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
        renderPackageHeader(packageFragmentDescriptor.getFqName(), "package-fragment", sb);
        if (getDebugMode()) {
            sb.append(" in ");
            renderName(packageFragmentDescriptor.getContainingDeclaration(), sb, false);
        }
    }

    private final void renderPackageHeader(FqName fqName, String str, StringBuilder sb) {
        sb.append(renderKeyword(str));
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkReturnedValueIsNotNull((Object) unsafe, "fqName.toUnsafe()");
        String renderFqName = renderFqName(unsafe);
        if (renderFqName.length() > 0) {
            sb.append(" ");
            sb.append(renderFqName);
        }
    }

    /* access modifiers changed from: private */
    public final void renderPackageView(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
        renderPackageHeader(packageViewDescriptor.getFqName(), "package", sb);
        if (getDebugMode()) {
            sb.append(" in context of ");
            renderName(packageViewDescriptor.getModule(), sb, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void renderPossiblyInnerType(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType r4) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType r0 = r4.getOuterType()
            if (r0 == 0) goto L_0x0026
            r2.renderPossiblyInnerType(r3, r0)
            r0 = 46
            r3.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters r0 = r4.getClassifierDescriptor()
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r0.getName()
            java.lang.String r1 = "possiblyInnerType.classifierDescriptor.name"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            r1 = 0
            java.lang.String r0 = r2.renderName(r0, r1)
            r3.append(r0)
            if (r3 == 0) goto L_0x0026
            goto L_0x003a
        L_0x0026:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters r0 = r4.getClassifierDescriptor()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r0 = r0.getTypeConstructor()
            java.lang.String r1 = "possiblyInnerType.classi…escriptor.typeConstructor"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            java.lang.String r0 = r2.renderTypeConstructor(r0)
            r3.append(r0)
        L_0x003a:
            java.util.List r4 = r4.getArguments()
            java.lang.String r4 = r2.renderTypeArguments(r4)
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderPossiblyInnerType(java.lang.StringBuilder, kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType):void");
    }

    /* access modifiers changed from: private */
    public final void renderProperty(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        String str = "property.typeParameters";
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderPropertyAnnotations(propertyDescriptor, sb);
                Visibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "property.visibility");
                renderVisibility(visibility, sb);
                boolean z = false;
                renderModifier(sb, getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                renderMemberModifiers(propertyDescriptor, sb);
                renderModalityForCallable(propertyDescriptor, sb);
                renderOverride(propertyDescriptor, sb);
                if (getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z = true;
                }
                renderModifier(sb, z, "lateinit");
                renderMemberKind(propertyDescriptor, sb);
            }
            renderValVarPrefix(propertyDescriptor, sb);
            List typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeParameters, str);
            renderTypeParameters(typeParameters, sb, true);
            renderReceiver(propertyDescriptor, sb);
        }
        renderName(propertyDescriptor, sb, true);
        sb.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.checkReturnedValueIsNotNull((Object) type, "property.type");
        sb.append(renderType(type));
        renderReceiverAfterName(propertyDescriptor, sb);
        renderInitializer(propertyDescriptor, sb);
        List typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeParameters2, str);
        renderWhereSuffix(typeParameters2, sb);
    }

    private final void renderPropertyAnnotations(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            renderAnnotations$default(this, sb, propertyDescriptor, null, 2, null);
            FieldDescriptor backingField = propertyDescriptor.getBackingField();
            String str = "it";
            if (backingField != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) backingField, str);
                renderAnnotations(sb, backingField, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
            if (delegateField != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) delegateField, str);
                renderAnnotations(sb, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) getter, str);
                    renderAnnotations(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) setter, str);
                    renderAnnotations(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    Intrinsics.checkReturnedValueIsNotNull((Object) setter, "setter");
                    List valueParameters = setter.getValueParameters();
                    Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "setter.valueParameters");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) C13199w.m40599k(valueParameters);
                    Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, str);
                    renderAnnotations(sb, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void renderReceiver(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "receiver.type");
            String renderType = renderType(type);
            if (shouldRenderAsPrettyFunctionType(type) && !TypeUtils.isNullableType(type)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(renderType);
                sb2.append(')');
                renderType = sb2.toString();
            }
            sb.append(renderType);
            sb.append(".");
        }
    }

    private final void renderReceiverAfterName(CallableDescriptor callableDescriptor, StringBuilder sb) {
        if (getReceiverAfterName()) {
            ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                sb.append(" on ");
                KotlinType type = extensionReceiverParameter.getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type, "receiver.type");
                sb.append(renderType(type));
            }
        }
    }

    private final void renderSimpleType(StringBuilder sb, SimpleType simpleType) {
        String str = "???";
        if (Intrinsics.areEqual((Object) simpleType, (Object) TypeUtils.CANT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb.append(str);
        } else if (ErrorUtils.isUninferredParameter(simpleType)) {
            if (getUninferredTypeParameterAsName()) {
                TypeConstructor constructor = simpleType.getConstructor();
                if (constructor != null) {
                    TypeParameterDescriptor typeParameterDescriptor = ((UninferredParameterTypeConstructor) constructor).getTypeParameterDescriptor();
                    Intrinsics.checkReturnedValueIsNotNull((Object) typeParameterDescriptor, "(type.constructor as Uni…).typeParameterDescriptor");
                    String name = typeParameterDescriptor.getName().toString();
                    Intrinsics.checkReturnedValueIsNotNull((Object) name, "(type.constructor as Uni…escriptor.name.toString()");
                    sb.append(renderError(name));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
                }
            } else {
                sb.append(str);
            }
        } else if (KotlinTypeKt.isError(simpleType)) {
            renderDefaultType(sb, simpleType);
        } else {
            if (shouldRenderAsPrettyFunctionType(simpleType)) {
                renderFunctionType(sb, simpleType);
            } else {
                renderDefaultType(sb, simpleType);
            }
        }
    }

    private final void renderSpaceIfNeeded(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final void renderSuperTypes(ClassDescriptor classDescriptor, StringBuilder sb) {
        if (!getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor, "klass.typeConstructor");
            Collection supertypes = typeConstructor.getSupertypes();
            Intrinsics.checkReturnedValueIsNotNull((Object) supertypes, "klass.typeConstructor.supertypes");
            if (!supertypes.isEmpty() && (supertypes.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny((KotlinType) supertypes.iterator().next()))) {
                renderSpaceIfNeeded(sb);
                sb.append(": ");
                StringBuilder sb2 = sb;
                C13199w.m40557a(supertypes, sb2, ", ", null, null, 0, null, new DescriptorRendererImpl$renderSuperTypes$1(this), 60, null);
            }
        }
    }

    private final void renderSuspendModifier(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        renderModifier(sb, functionDescriptor.isSuspend(), "suspend");
    }

    /* access modifiers changed from: private */
    public final void renderTypeAlias(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
        renderAnnotations$default(this, sb, typeAliasDescriptor, null, 2, null);
        Visibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "typeAlias.visibility");
        renderVisibility(visibility, sb);
        renderMemberModifiers(typeAliasDescriptor, sb);
        sb.append(renderKeyword("typealias"));
        sb.append(" ");
        renderName(typeAliasDescriptor, sb, true);
        List declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) declaredTypeParameters, "typeAlias.declaredTypeParameters");
        renderTypeParameters(declaredTypeParameters, sb, false);
        renderCapturedTypeParametersIfRequired(typeAliasDescriptor, sb);
        sb.append(" = ");
        sb.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final void renderTypeConstructorAndArguments(StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType buildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (buildPossiblyInnerType == null) {
            sb.append(renderTypeConstructor(typeConstructor));
            sb.append(renderTypeArguments(kotlinType.getArguments()));
            return;
        }
        renderPossiblyInnerType(sb, buildPossiblyInnerType);
    }

    static /* synthetic */ void renderTypeConstructorAndArguments$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.renderTypeConstructorAndArguments(sb, kotlinType, typeConstructor);
    }

    /* access modifiers changed from: private */
    public final void renderTypeParameter(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m40246lt());
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        renderModifier(sb, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z2 = true;
        renderModifier(sb, label.length() > 0, label);
        renderAnnotations$default(this, sb, typeParameterDescriptor, null, 2, null);
        renderName(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        String str = "upperBound";
        String str2 = " : ";
        if ((size > 1 && !z) || size == 1) {
            KotlinType kotlinType = (KotlinType) typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                sb.append(str2);
                Intrinsics.checkReturnedValueIsNotNull((Object) kotlinType, str);
                sb.append(renderType(kotlinType));
            }
        } else if (z) {
            for (KotlinType kotlinType2 : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType2)) {
                    if (z2) {
                        sb.append(str2);
                    } else {
                        sb.append(" & ");
                    }
                    Intrinsics.checkReturnedValueIsNotNull((Object) kotlinType2, str);
                    sb.append(renderType(kotlinType2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m40245gt());
        }
    }

    private final void renderTypeParameterList(StringBuilder sb, List<? extends TypeParameterDescriptor> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter((TypeParameterDescriptor) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final void renderTypeParameters(List<? extends TypeParameterDescriptor> list, StringBuilder sb, boolean z) {
        if (!getWithoutTypeParameters() && !list.isEmpty()) {
            sb.append(m40246lt());
            renderTypeParameterList(sb, list);
            sb.append(m40245gt());
            if (z) {
                sb.append(" ");
            }
        }
    }

    private final void renderValVarPrefix(VariableDescriptor variableDescriptor, StringBuilder sb) {
        if (!(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb.append(renderKeyword(variableDescriptor.isVar() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if ((getDebugMode() ? r8.declaresDefaultValue() : kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(r8)) != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r8, boolean r9, java.lang.StringBuilder r10, boolean r11) {
        /*
            r7 = this;
            if (r11 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r7.renderKeyword(r0)
            r10.append(r0)
            java.lang.String r0 = " "
            r10.append(r0)
        L_0x0010:
            boolean r0 = r7.getVerbose()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r10.append(r0)
            int r0 = r8.getIndex()
            r10.append(r0)
            java.lang.String r0 = "*/ "
            r10.append(r0)
        L_0x0027:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r10
            r3 = r8
            renderAnnotations$default(r1, r2, r3, r4, r5, r6)
            boolean r0 = r8.isCrossinline()
            java.lang.String r1 = "crossinline"
            r7.renderModifier(r10, r0, r1)
            boolean r0 = r8.isNoinline()
            java.lang.String r1 = "noinline"
            r7.renderModifier(r10, r0, r1)
            boolean r0 = r7.getRenderPrimaryConstructorParametersAsProperties()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006b
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r0 = r8.getContainingDeclaration()
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor
            if (r3 != 0) goto L_0x0053
            r0 = r1
        L_0x0053:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r0
            if (r0 == 0) goto L_0x006b
            boolean r0 = r0.isPrimary()
            if (r0 != r2) goto L_0x006b
            boolean r0 = r7.getActualPropertiesInPrimaryConstructor()
            java.lang.String r3 = "actual"
            r7.renderModifier(r10, r0, r3)
            java.lang.String r0 = "val"
            r7.renderModifier(r10, r2, r0)
        L_0x006b:
            r7.renderVariable(r8, r9, r10, r11)
            kotlin.jvm.functions.Function1 r9 = r7.getDefaultParameterValueRenderer()
            if (r9 == 0) goto L_0x0086
            boolean r9 = r7.getDebugMode()
            if (r9 == 0) goto L_0x007f
            boolean r9 = r8.declaresDefaultValue()
            goto L_0x0083
        L_0x007f:
            boolean r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(r8)
        L_0x0083:
            if (r9 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            if (r2 == 0) goto L_0x00ae
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = " = "
            r9.append(r11)
            kotlin.jvm.functions.Function1 r11 = r7.getDefaultParameterValueRenderer()
            if (r11 == 0) goto L_0x00aa
            java.lang.Object r8 = r11.invoke(r8)
            java.lang.String r8 = (java.lang.String) r8
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r10.append(r8)
            goto L_0x00ae
        L_0x00aa:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r1
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final void renderValueParameters(Collection<? extends ValueParameterDescriptor> collection, boolean z, StringBuilder sb) {
        boolean shouldRenderParameterNames = shouldRenderParameterNames(z);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb);
        int i = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i, size, sb);
            renderValueParameter(valueParameterDescriptor, shouldRenderParameterNames, sb, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i, size, sb);
            i++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb);
    }

    private final void renderVariable(VariableDescriptor variableDescriptor, boolean z, StringBuilder sb, boolean z2) {
        KotlinType type = variableDescriptor.getType();
        Intrinsics.checkReturnedValueIsNotNull((Object) type, "variable.type");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) (!(variableDescriptor instanceof ValueParameterDescriptor) ? null : variableDescriptor);
        KotlinType varargElementType = valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null;
        KotlinType kotlinType = varargElementType != null ? varargElementType : type;
        renderModifier(sb, varargElementType != null, "vararg");
        if (z2 && !getStartFromName()) {
            renderValVarPrefix(variableDescriptor, sb);
        }
        if (z) {
            renderName(variableDescriptor, sb, z2);
            sb.append(": ");
        }
        sb.append(renderType(kotlinType));
        renderInitializer(variableDescriptor, sb);
        if (getVerbose() && varargElementType != null) {
            sb.append(" /*");
            sb.append(renderType(type));
            sb.append("*/");
        }
    }

    private final boolean renderVisibility(Visibility visibility, StringBuilder sb) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            visibility = visibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual((Object) visibility, (Object) Visibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb.append(renderKeyword(visibility.getDisplayName()));
        sb.append(" ");
        return true;
    }

    private final void renderWhereSuffix(List<? extends TypeParameterDescriptor> list, StringBuilder sb) {
        if (!getWithoutTypeParameters()) {
            ArrayList arrayList = new ArrayList(0);
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                List upperBounds = typeParameterDescriptor.getUpperBounds();
                Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, "typeParameter.upperBounds");
                for (KotlinType kotlinType : C13199w.m40571c((Iterable) upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    Name name = typeParameterDescriptor.getName();
                    Intrinsics.checkReturnedValueIsNotNull((Object) name, "typeParameter.name");
                    sb2.append(renderName(name, false));
                    sb2.append(" : ");
                    Intrinsics.checkReturnedValueIsNotNull((Object) kotlinType, "it");
                    sb2.append(renderType(kotlinType));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                String str = " ";
                sb.append(str);
                sb.append(renderKeyword("where"));
                sb.append(str);
                C13199w.m40557a(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
            }
        }
    }

    private final String replacePrefixes(String str, String str2, String str3, String str4, String str5) {
        if (C12832w.m40123b(str, str2, false, 2, null) && C12832w.m40123b(str3, str4, false, 2, null)) {
            int length = str2.length();
            String str6 = "null cannot be cast to non-null type java.lang.String";
            if (str != null) {
                String substring = str.substring(length);
                String str7 = "(this as java.lang.String).substring(startIndex)";
                Intrinsics.checkReturnedValueIsNotNull((Object) substring, str7);
                int length2 = str4.length();
                if (str3 != null) {
                    String substring2 = str3.substring(length2);
                    Intrinsics.checkReturnedValueIsNotNull((Object) substring2, str7);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(substring);
                    String sb2 = sb.toString();
                    if (Intrinsics.areEqual((Object) substring, (Object) substring2)) {
                        return sb2;
                    }
                    if (differsOnlyInNullability(substring, substring2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append("!");
                        return sb3.toString();
                    }
                } else {
                    throw new TypeCastException(str6);
                }
            } else {
                throw new TypeCastException(str6);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean shouldRenderAsPrettyFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType r4) {
        /*
            r3 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isBuiltinFunctionalType(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r4 = r4.getArguments()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = 1
            goto L_0x002f
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            boolean r0 = r0.isStarProjection()
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.shouldRenderAsPrettyFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType):boolean");
    }

    private final boolean shouldRenderParameterNames(boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$4[getParameterNameRenderingPolicy().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        throw new C12898l();
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    public final DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    public RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    public ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    public String render(DeclarationDescriptor declarationDescriptor) {
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb);
        if (getWithDefinedIn()) {
            appendDefinedIn(sb, declarationDescriptor);
        }
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String renderAnnotation(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget) {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(annotationUseSiteTarget.getRenderName());
            sb2.append(":");
            sb.append(sb2.toString());
        }
        KotlinType type = annotationDescriptor.getType();
        sb.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List renderAndSortAnnotationArguments = renderAndSortAnnotationArguments(annotationDescriptor);
            if (getIncludeEmptyAnnotationArguments() || (!renderAndSortAnnotationArguments.isEmpty())) {
                C13199w.m40557a(renderAndSortAnnotationArguments, sb, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().getDeclarationDescriptor() instanceof MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        String sb3 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public String renderClassifierName(ClassifierDescriptor classifierDescriptor) {
        if (ErrorUtils.isError(classifierDescriptor)) {
            return classifierDescriptor.getTypeConstructor().toString();
        }
        return getClassifierNamePolicy().renderClassifier(classifierDescriptor, this);
    }

    public String renderFlexibleType(String str, String str2, KotlinBuiltIns kotlinBuiltIns) {
        String str3 = str;
        String str4 = str2;
        if (!differsOnlyInNullability(str, str2)) {
            ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
            ClassDescriptor collection = kotlinBuiltIns.getCollection();
            Intrinsics.checkReturnedValueIsNotNull((Object) collection, "builtIns.collection");
            String b = C12833x.m40163b(classifierNamePolicy.renderClassifier(collection, this), "Collection", (String) null, 2, (Object) null);
            String str5 = "Mutable";
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(str5);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b);
            sb3.append('(');
            sb3.append(str5);
            sb3.append(')');
            String replacePrefixes = replacePrefixes(str, sb2, str2, b, sb3.toString());
            if (replacePrefixes != null) {
                return replacePrefixes;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(b);
            sb4.append("MutableMap.MutableEntry");
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(b);
            sb6.append("Map.Entry");
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(b);
            sb8.append("(Mutable)Map.(Mutable)Entry");
            String replacePrefixes2 = replacePrefixes(str, sb5, str2, sb7, sb8.toString());
            if (replacePrefixes2 != null) {
                return replacePrefixes2;
            }
            ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
            ClassDescriptor array = kotlinBuiltIns.getArray();
            Intrinsics.checkReturnedValueIsNotNull((Object) array, "builtIns.array");
            String b2 = C12833x.m40163b(classifierNamePolicy2.renderClassifier(array, this), "Array", (String) null, 2, (Object) null);
            StringBuilder sb9 = new StringBuilder();
            sb9.append(b2);
            sb9.append(escape("Array<"));
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(b2);
            sb11.append(escape("Array<out "));
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(b2);
            sb13.append(escape("Array<(out) "));
            String replacePrefixes3 = replacePrefixes(str, sb10, str2, sb12, sb13.toString());
            if (replacePrefixes3 != null) {
                return replacePrefixes3;
            }
            StringBuilder sb14 = new StringBuilder();
            sb14.append('(');
            sb14.append(str);
            sb14.append("..");
            sb14.append(str4);
            sb14.append(')');
            return sb14.toString();
        } else if (C12832w.m40123b(str4, "(", false, 2, null)) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append('(');
            sb15.append(str);
            sb15.append(")!");
            return sb15.toString();
        } else {
            StringBuilder sb16 = new StringBuilder();
            sb16.append(str);
            sb16.append("!");
            return sb16.toString();
        }
    }

    public String renderFqName(FqNameUnsafe fqNameUnsafe) {
        List pathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkReturnedValueIsNotNull((Object) pathSegments, "fqName.pathSegments()");
        return renderFqName(pathSegments);
    }

    public String renderMessage(String str) {
        int i = WhenMappings.$EnumSwitchMapping$3[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("<i>");
            sb.append(str);
            sb.append("</i>");
            return sb.toString();
        }
        throw new C12898l();
    }

    public String renderName(Name name, boolean z) {
        String escape = escape(RenderingUtilsKt.render(name));
        if (!getBoldOnlyForNamesInHtml() || getTextFormat() != RenderingFormat.HTML || !z) {
            return escape;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<b>");
        sb.append(escape);
        sb.append("</b>");
        return sb.toString();
    }

    public String renderType(KotlinType kotlinType) {
        StringBuilder sb = new StringBuilder();
        renderNormalizedType(sb, (KotlinType) getTypeNormalizer().invoke(kotlinType));
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String renderTypeArguments(List<? extends TypeProjection> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m40246lt());
        appendTypeProjections(sb, list);
        sb.append(m40245gt());
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String renderTypeConstructor(TypeConstructor typeConstructor) {
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if ((declarationDescriptor instanceof TypeParameterDescriptor) || (declarationDescriptor instanceof ClassDescriptor) || (declarationDescriptor instanceof TypeAliasDescriptor)) {
            return renderClassifierName(declarationDescriptor);
        }
        if (declarationDescriptor == null) {
            return typeConstructor.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected classifier: ");
        sb.append(declarationDescriptor.getClass());
        throw new IllegalStateException(sb.toString().toString());
    }

    public String renderTypeProjection(TypeProjection typeProjection) {
        StringBuilder sb = new StringBuilder();
        appendTypeProjections(sb, C13183n.m40498a(typeProjection));
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    public void setDebugMode(boolean z) {
        this.options.setDebugMode(z);
    }

    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        this.options.setModifiers(set);
    }

    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    public void setReceiverAfterName(boolean z) {
        this.options.setReceiverAfterName(z);
    }

    public void setRenderCompanionObjectName(boolean z) {
        this.options.setRenderCompanionObjectName(z);
    }

    public void setStartFromName(boolean z) {
        this.options.setStartFromName(z);
    }

    public void setTextFormat(RenderingFormat renderingFormat) {
        this.options.setTextFormat(renderingFormat);
    }

    public void setVerbose(boolean z) {
        this.options.setVerbose(z);
    }

    public void setWithDefinedIn(boolean z) {
        this.options.setWithDefinedIn(z);
    }

    public void setWithoutSuperTypes(boolean z) {
        this.options.setWithoutSuperTypes(z);
    }

    public void setWithoutTypeParameters(boolean z) {
        this.options.setWithoutTypeParameters(z);
    }

    private final String renderFqName(List<Name> list) {
        return escape(RenderingUtilsKt.renderFqName(list));
    }

    /* access modifiers changed from: private */
    public final void renderName(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        Name name = declarationDescriptor.getName();
        Intrinsics.checkReturnedValueIsNotNull((Object) name, "descriptor.name");
        sb.append(renderName(name, z));
    }
}
