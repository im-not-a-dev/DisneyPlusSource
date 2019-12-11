package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13142s;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: ValueParameterDescriptorImpl.kt */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {
    public static final Companion Companion = new Companion(null);
    private final boolean declaresDefaultValue;
    private final int index;
    private final boolean isCrossinline;
    private final boolean isNoinline;
    private final ValueParameterDescriptor original;
    private final KotlinType varargElementType;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ValueParameterDescriptorImpl createWithDestructuringDeclarations(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType kotlinType, boolean z, boolean z2, boolean z3, KotlinType kotlinType2, SourceElement sourceElement, Function0<? extends List<? extends VariableDescriptor>> function0) {
            if (function0 == null) {
                ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement);
                return valueParameterDescriptorImpl;
            }
            WithDestructuringDeclaration withDestructuringDeclaration = new WithDestructuringDeclaration(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
            return withDestructuringDeclaration;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(WithDestructuringDeclaration.class), "destructuringVariables", "getDestructuringVariables()Ljava/util/List;"))};
        private final Lazy destructuringVariables$delegate;

        public WithDestructuringDeclaration(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType kotlinType, boolean z, boolean z2, boolean z3, KotlinType kotlinType2, SourceElement sourceElement, Function0<? extends List<? extends VariableDescriptor>> function0) {
            super(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement);
            this.destructuringVariables$delegate = C12763i.m39921a(function0);
        }

        public ValueParameterDescriptor copy(CallableDescriptor callableDescriptor, Name name, int i) {
            Annotations annotations = getAnnotations();
            Intrinsics.checkReturnedValueIsNotNull((Object) annotations, "annotations");
            KotlinType type = getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "type");
            boolean declaresDefaultValue = declaresDefaultValue();
            boolean isCrossinline = isCrossinline();
            boolean isNoinline = isNoinline();
            KotlinType varargElementType = getVarargElementType();
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement, "SourceElement.NO_SOURCE");
            WithDestructuringDeclaration withDestructuringDeclaration = new WithDestructuringDeclaration(callableDescriptor, null, i, annotations, name, type, declaresDefaultValue, isCrossinline, isNoinline, varargElementType, sourceElement, new ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(this));
            return withDestructuringDeclaration;
        }

        public final List<VariableDescriptor> getDestructuringVariables() {
            Lazy lazy = this.destructuringVariables$delegate;
            KProperty kProperty = $$delegatedProperties[0];
            return (List) lazy.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ValueParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r8, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r9, int r10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r11, kotlin.reflect.jvm.internal.impl.name.Name r12, kotlin.reflect.jvm.internal.impl.types.KotlinType r13, boolean r14, boolean r15, boolean r16, kotlin.reflect.jvm.internal.impl.types.KotlinType r17, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r18) {
        /*
            r7 = this;
            r6 = r7
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.index = r0
            r0 = r14
            r6.declaresDefaultValue = r0
            r0 = r15
            r6.isCrossinline = r0
            r0 = r16
            r6.isNoinline = r0
            r0 = r17
            r6.varargElementType = r0
            if (r9 == 0) goto L_0x0020
            r0 = r9
            goto L_0x0021
        L_0x0020:
            r0 = r6
        L_0x0021:
            r6.original = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, int, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.types.KotlinType, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement):void");
    }

    public static final ValueParameterDescriptorImpl createWithDestructuringDeclarations(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType kotlinType, boolean z, boolean z2, boolean z3, KotlinType kotlinType2, SourceElement sourceElement, Function0<? extends List<? extends VariableDescriptor>> function0) {
        return Companion.createWithDestructuringDeclarations(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitValueParameterDescriptor(this, d);
    }

    public ValueParameterDescriptor copy(CallableDescriptor callableDescriptor, Name name, int i) {
        Annotations annotations = getAnnotations();
        Intrinsics.checkReturnedValueIsNotNull((Object) annotations, "annotations");
        KotlinType type = getType();
        Intrinsics.checkReturnedValueIsNotNull((Object) type, "type");
        boolean declaresDefaultValue2 = declaresDefaultValue();
        boolean isCrossinline2 = isCrossinline();
        boolean isNoinline2 = isNoinline();
        KotlinType varargElementType2 = getVarargElementType();
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement, "SourceElement.NO_SOURCE");
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(callableDescriptor, null, i, annotations, name, type, declaresDefaultValue2, isCrossinline2, isNoinline2, varargElementType2, sourceElement);
        return valueParameterDescriptorImpl;
    }

    public boolean declaresDefaultValue() {
        if (this.declaresDefaultValue) {
            CallableDescriptor containingDeclaration = getContainingDeclaration();
            if (containingDeclaration != null) {
                Kind kind = ((CallableMemberDescriptor) containingDeclaration).getKind();
                Intrinsics.checkReturnedValueIsNotNull((Object) kind, "(containingDeclaration a…bleMemberDescriptor).kind");
                if (kind.isReal()) {
                    return true;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            }
        }
        return false;
    }

    public Void getCompileTimeInitializer() {
        return null;
    }

    public int getIndex() {
        return this.index;
    }

    public Collection<ValueParameterDescriptor> getOverriddenDescriptors() {
        Collection<CallableDescriptor> overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        Intrinsics.checkReturnedValueIsNotNull((Object) overriddenDescriptors, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) overriddenDescriptors, 10));
        for (CallableDescriptor callableDescriptor : overriddenDescriptors) {
            Intrinsics.checkReturnedValueIsNotNull((Object) callableDescriptor, "it");
            arrayList.add((ValueParameterDescriptor) callableDescriptor.getValueParameters().get(getIndex()));
        }
        return arrayList;
    }

    public KotlinType getVarargElementType() {
        return this.varargElementType;
    }

    public Visibility getVisibility() {
        Visibility visibility = Visibilities.LOCAL;
        Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "Visibilities.LOCAL");
        return visibility;
    }

    public boolean isCrossinline() {
        return this.isCrossinline;
    }

    public boolean isLateInit() {
        return DefaultImpls.isLateInit(this);
    }

    public boolean isNoinline() {
        return this.isNoinline;
    }

    public boolean isVar() {
        return false;
    }

    public CallableDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        if (containingDeclaration != null) {
            return (CallableDescriptor) containingDeclaration;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    public ValueParameterDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public ValueParameterDescriptor getOriginal() {
        ValueParameterDescriptor valueParameterDescriptor = this.original;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.getOriginal();
    }
}
