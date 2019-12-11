package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeMappingMode.kt */
public final class TypeMappingMode {
    public static final TypeMappingMode CLASS_DECLARATION;
    public static final Companion Companion = new Companion(null);
    public static final TypeMappingMode DEFAULT;
    public static final TypeMappingMode GENERIC_ARGUMENT;
    public static final TypeMappingMode RETURN_TYPE_BOXED;
    public static final TypeMappingMode SUPER_TYPE;
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;
    private final TypeMappingMode genericArgumentMode;
    private final TypeMappingMode genericContravariantArgumentMode;
    private final TypeMappingMode genericInvariantArgumentMode;
    private final boolean isForAnnotationParameter;
    private final boolean kotlinCollectionsToJavaCollections;
    private final boolean needInlineClassWrapping;
    private final boolean needPrimitiveBoxing;
    private final boolean skipDeclarationSiteWildcards;
    private final boolean skipDeclarationSiteWildcardsIfPossible;

    /* compiled from: TypeMappingMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Variance.values().length];

        static {
            $EnumSwitchMapping$0[Variance.IN_VARIANCE.ordinal()] = 1;
            $EnumSwitchMapping$0[Variance.INVARIANT.ordinal()] = 2;
        }
    }

    static {
        TypeMappingMode typeMappingMode = new TypeMappingMode(false, false, false, false, false, null, false, null, null, 511, null);
        GENERIC_ARGUMENT = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, true, false, false, false, null, false, null, null, 509, null);
        RETURN_TYPE_BOXED = typeMappingMode2;
        TypeMappingMode typeMappingMode3 = new TypeMappingMode(false, false, false, false, false, GENERIC_ARGUMENT, false, null, null, 476, null);
        DEFAULT = typeMappingMode3;
        TypeMappingMode typeMappingMode4 = new TypeMappingMode(false, true, false, false, false, GENERIC_ARGUMENT, false, null, null, 476, null);
        CLASS_DECLARATION = typeMappingMode4;
        TypeMappingMode typeMappingMode5 = new TypeMappingMode(false, false, false, true, false, GENERIC_ARGUMENT, false, null, null, 471, null);
        SUPER_TYPE = typeMappingMode5;
        TypeMappingMode typeMappingMode6 = new TypeMappingMode(false, false, false, true, false, GENERIC_ARGUMENT, false, null, null, 407, null);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = typeMappingMode6;
        TypeMappingMode typeMappingMode7 = new TypeMappingMode(false, false, true, false, false, GENERIC_ARGUMENT, false, null, null, 475, null);
        TypeMappingMode typeMappingMode8 = new TypeMappingMode(false, false, true, false, false, typeMappingMode7, false, null, null, 472, null);
        VALUE_FOR_ANNOTATION = typeMappingMode8;
    }

    private TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TypeMappingMode typeMappingMode, boolean z6, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3) {
        this.needPrimitiveBoxing = z;
        this.needInlineClassWrapping = z2;
        this.isForAnnotationParameter = z3;
        this.skipDeclarationSiteWildcards = z4;
        this.skipDeclarationSiteWildcardsIfPossible = z5;
        this.genericArgumentMode = typeMappingMode;
        this.kotlinCollectionsToJavaCollections = z6;
        this.genericContravariantArgumentMode = typeMappingMode2;
        this.genericInvariantArgumentMode = typeMappingMode3;
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.kotlinCollectionsToJavaCollections;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.needInlineClassWrapping;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.needPrimitiveBoxing;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final TypeMappingMode toGenericArgumentMode(Variance variance) {
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            TypeMappingMode typeMappingMode = this.genericContravariantArgumentMode;
            if (typeMappingMode != null) {
                return typeMappingMode;
            }
        } else if (i != 2) {
            TypeMappingMode typeMappingMode2 = this.genericArgumentMode;
            if (typeMappingMode2 != null) {
                return typeMappingMode2;
            }
        } else {
            TypeMappingMode typeMappingMode3 = this.genericInvariantArgumentMode;
            if (typeMappingMode3 != null) {
                return typeMappingMode3;
            }
        }
        return this;
    }

    public final TypeMappingMode wrapInlineClassesMode() {
        TypeMappingMode typeMappingMode = new TypeMappingMode(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode);
        return typeMappingMode;
    }

    /* synthetic */ TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TypeMappingMode typeMappingMode, boolean z6, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        boolean z7 = true;
        boolean z8 = (i2 & 1) != 0 ? true : z;
        boolean z9 = (i2 & 2) != 0 ? true : z2;
        boolean z10 = false;
        boolean z11 = (i2 & 4) != 0 ? false : z3;
        boolean z12 = (i2 & 8) != 0 ? false : z4;
        if ((i2 & 16) == 0) {
            z10 = z5;
        }
        TypeMappingMode typeMappingMode4 = (i2 & 32) != 0 ? null : typeMappingMode;
        if ((i2 & 64) == 0) {
            z7 = z6;
        }
        this(z8, z9, z11, z12, z10, typeMappingMode4, z7, (i2 & 128) != 0 ? typeMappingMode4 : typeMappingMode2, (i2 & 256) != 0 ? typeMappingMode4 : typeMappingMode3);
    }
}
