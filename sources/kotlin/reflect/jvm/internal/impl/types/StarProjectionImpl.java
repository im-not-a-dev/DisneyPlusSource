package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C12897k;
import kotlin.Lazy;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* compiled from: StarProjectionImpl.kt */
public final class StarProjectionImpl extends TypeProjectionBase {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(StarProjectionImpl.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    private final Lazy _type$delegate = C12763i.m39922a(C12897k.PUBLICATION, new StarProjectionImpl$_type$2(this));
    /* access modifiers changed from: private */
    public final TypeParameterDescriptor typeParameter;

    public StarProjectionImpl(TypeParameterDescriptor typeParameterDescriptor) {
        this.typeParameter = typeParameterDescriptor;
    }

    private final KotlinType get_type() {
        Lazy lazy = this._type$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (KotlinType) lazy.getValue();
    }

    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    public KotlinType getType() {
        return get_type();
    }

    public boolean isStarProjection() {
        return true;
    }
}
