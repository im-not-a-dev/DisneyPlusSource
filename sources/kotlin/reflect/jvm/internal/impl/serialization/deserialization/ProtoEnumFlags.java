package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.C12898l;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;

/* compiled from: ProtoEnumFlags.kt */
public final class ProtoEnumFlags {
    public static final ProtoEnumFlags INSTANCE = new ProtoEnumFlags();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[MemberKind.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Kind.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[Modality.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$3 = new int[kotlin.reflect.jvm.internal.impl.descriptors.Modality.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$4 = new int[Visibility.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$5 = new int[Class.Kind.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$6 = new int[ClassKind.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$7 = new int[Variance.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$8 = new int[Projection.values().length];

        static {
            $EnumSwitchMapping$0[MemberKind.DECLARATION.ordinal()] = 1;
            $EnumSwitchMapping$0[MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            $EnumSwitchMapping$0[MemberKind.DELEGATION.ordinal()] = 3;
            $EnumSwitchMapping$0[MemberKind.SYNTHESIZED.ordinal()] = 4;
            $EnumSwitchMapping$1[Kind.DECLARATION.ordinal()] = 1;
            $EnumSwitchMapping$1[Kind.FAKE_OVERRIDE.ordinal()] = 2;
            $EnumSwitchMapping$1[Kind.DELEGATION.ordinal()] = 3;
            $EnumSwitchMapping$1[Kind.SYNTHESIZED.ordinal()] = 4;
            $EnumSwitchMapping$2[Modality.FINAL.ordinal()] = 1;
            $EnumSwitchMapping$2[Modality.OPEN.ordinal()] = 2;
            $EnumSwitchMapping$2[Modality.ABSTRACT.ordinal()] = 3;
            $EnumSwitchMapping$2[Modality.SEALED.ordinal()] = 4;
            $EnumSwitchMapping$3[kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL.ordinal()] = 1;
            $EnumSwitchMapping$3[kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN.ordinal()] = 2;
            $EnumSwitchMapping$3[kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT.ordinal()] = 3;
            $EnumSwitchMapping$3[kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED.ordinal()] = 4;
            $EnumSwitchMapping$4[Visibility.INTERNAL.ordinal()] = 1;
            $EnumSwitchMapping$4[Visibility.PRIVATE.ordinal()] = 2;
            $EnumSwitchMapping$4[Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            $EnumSwitchMapping$4[Visibility.PROTECTED.ordinal()] = 4;
            $EnumSwitchMapping$4[Visibility.PUBLIC.ordinal()] = 5;
            $EnumSwitchMapping$4[Visibility.LOCAL.ordinal()] = 6;
            $EnumSwitchMapping$5[Class.Kind.CLASS.ordinal()] = 1;
            $EnumSwitchMapping$5[Class.Kind.INTERFACE.ordinal()] = 2;
            $EnumSwitchMapping$5[Class.Kind.ENUM_CLASS.ordinal()] = 3;
            $EnumSwitchMapping$5[Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            $EnumSwitchMapping$5[Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            $EnumSwitchMapping$5[Class.Kind.OBJECT.ordinal()] = 6;
            $EnumSwitchMapping$5[Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            $EnumSwitchMapping$6[ClassKind.CLASS.ordinal()] = 1;
            $EnumSwitchMapping$6[ClassKind.INTERFACE.ordinal()] = 2;
            $EnumSwitchMapping$6[ClassKind.ENUM_CLASS.ordinal()] = 3;
            $EnumSwitchMapping$6[ClassKind.ENUM_ENTRY.ordinal()] = 4;
            $EnumSwitchMapping$6[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            $EnumSwitchMapping$6[ClassKind.OBJECT.ordinal()] = 6;
            $EnumSwitchMapping$7[Variance.IN.ordinal()] = 1;
            $EnumSwitchMapping$7[Variance.OUT.ordinal()] = 2;
            $EnumSwitchMapping$7[Variance.INV.ordinal()] = 3;
            $EnumSwitchMapping$8[Projection.IN.ordinal()] = 1;
            $EnumSwitchMapping$8[Projection.OUT.ordinal()] = 2;
            $EnumSwitchMapping$8[Projection.INV.ordinal()] = 3;
            $EnumSwitchMapping$8[Projection.STAR.ordinal()] = 4;
        }
    }

    private ProtoEnumFlags() {
    }

    public final ClassKind classKind(Class.Kind kind) {
        if (kind != null) {
            switch (WhenMappings.$EnumSwitchMapping$5[kind.ordinal()]) {
                case 1:
                    return ClassKind.CLASS;
                case 2:
                    return ClassKind.INTERFACE;
                case 3:
                    return ClassKind.ENUM_CLASS;
                case 4:
                    return ClassKind.ENUM_ENTRY;
                case 5:
                    return ClassKind.ANNOTATION_CLASS;
                case 6:
                case 7:
                    return ClassKind.OBJECT;
            }
        }
        return ClassKind.CLASS;
    }

    public final Kind memberKind(MemberKind memberKind) {
        if (memberKind != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[memberKind.ordinal()];
            if (i == 1) {
                return Kind.DECLARATION;
            }
            if (i == 2) {
                return Kind.FAKE_OVERRIDE;
            }
            if (i == 3) {
                return Kind.DELEGATION;
            }
            if (i == 4) {
                return Kind.SYNTHESIZED;
            }
        }
        return Kind.DECLARATION;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.Modality modality(Modality modality) {
        if (modality != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[modality.ordinal()];
            if (i == 1) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
            }
            if (i == 2) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
            }
            if (i == 3) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
            }
            if (i == 4) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED;
            }
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    public final kotlin.reflect.jvm.internal.impl.types.Variance variance(Variance variance) {
        int i = WhenMappings.$EnumSwitchMapping$7[variance.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        throw new C12898l();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility(Visibility visibility) {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2;
        if (visibility != null) {
            switch (WhenMappings.$EnumSwitchMapping$4[visibility.ordinal()]) {
                case 1:
                    visibility2 = Visibilities.INTERNAL;
                    break;
                case 2:
                    visibility2 = Visibilities.PRIVATE;
                    break;
                case 3:
                    visibility2 = Visibilities.PRIVATE_TO_THIS;
                    break;
                case 4:
                    visibility2 = Visibilities.PROTECTED;
                    break;
                case 5:
                    visibility2 = Visibilities.PUBLIC;
                    break;
                case 6:
                    visibility2 = Visibilities.LOCAL;
                    break;
            }
        }
        visibility2 = Visibilities.PRIVATE;
        C12880j.m40222a((Object) visibility2, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
        return visibility2;
    }

    public final kotlin.reflect.jvm.internal.impl.types.Variance variance(Projection projection) {
        int i = WhenMappings.$EnumSwitchMapping$8[projection.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        if (i != 4) {
            throw new C12898l();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Only IN, OUT and INV are supported. Actual argument: ");
        sb.append(projection);
        throw new IllegalArgumentException(sb.toString());
    }
}
