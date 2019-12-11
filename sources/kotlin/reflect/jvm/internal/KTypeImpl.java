package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.C12899m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12888r;
import kotlin.jvm.internal.C12889s;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p581d0.C12731a;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00068@X\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006(²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0002"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "isMarkedNullable", "", "()Z", "javaType", "getJavaType$kotlin_reflection", "()Ljava/lang/reflect/Type;", "javaType$delegate", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-reflection", "parameterizedTypeArguments"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KTypeImpl.kt */
public final class KTypeImpl implements KType {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final LazySoftVal arguments$delegate = ReflectProperties.lazySoft(new KTypeImpl$arguments$2(this));
    private final LazySoftVal classifier$delegate = ReflectProperties.lazySoft(new KTypeImpl$classifier$2(this));
    private final LazySoftVal javaType$delegate;
    private final KotlinType type;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Variance.values().length];

        static {
            $EnumSwitchMapping$0[Variance.INVARIANT.ordinal()] = 1;
            $EnumSwitchMapping$0[Variance.IN_VARIANCE.ordinal()] = 2;
            $EnumSwitchMapping$0[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    static {
        Class<KTypeImpl> cls = KTypeImpl.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "javaType", "getJavaType$kotlin_reflection()Ljava/lang/reflect/Type;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "arguments", "getArguments()Ljava/util/List;")), C12895y.m40234a((C12888r) new C12889s(C12895y.m40230a((Class) cls), "parameterizedTypeArguments", "<v#0>"))};
    }

    public KTypeImpl(KotlinType kotlinType, Function0<? extends Type> function0) {
        this.type = kotlinType;
        this.javaType$delegate = ReflectProperties.lazySoft(function0);
    }

    /* access modifiers changed from: private */
    public final KClassifier convert(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof ClassDescriptor) {
            Class javaClass = UtilKt.toJavaClass((ClassDescriptor) declarationDescriptor);
            if (javaClass == null) {
                return null;
            }
            if (javaClass.isArray()) {
                TypeProjection typeProjection = (TypeProjection) C13199w.m40600l(kotlinType.getArguments());
                if (typeProjection != null) {
                    KotlinType type2 = typeProjection.getType();
                    if (type2 != null) {
                        C12880j.m40222a((Object) type2, "type.arguments.singleOrN…return KClassImpl(jClass)");
                        KClassifier convert = convert(type2);
                        if (convert != null) {
                            return new KClassImpl(ReflectClassUtilKt.createArrayType(C12731a.m39866a(KTypesJvm.getJvmErasure(convert))));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine classifier for array element type: ");
                        sb.append(this);
                        throw new KotlinReflectionInternalError(sb.toString());
                    }
                }
                return new KClassImpl(javaClass);
            } else if (TypeUtils.isNullableType(kotlinType)) {
                return new KClassImpl(javaClass);
            } else {
                Class primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(javaClass);
                if (primitiveByWrapper != null) {
                    javaClass = primitiveByWrapper;
                }
                return new KClassImpl(javaClass);
            }
        } else if (declarationDescriptor instanceof TypeParameterDescriptor) {
            return new KTypeParameterImpl((TypeParameterDescriptor) declarationDescriptor);
        } else {
            if (!(declarationDescriptor instanceof TypeAliasDescriptor)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("An operation is not implemented: ");
            sb2.append("Type alias classifiers are not yet supported");
            throw new C12899m(sb2.toString());
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof KTypeImpl) && C12880j.m40224a((Object) this.type, (Object) ((KTypeImpl) obj).type);
    }

    public List<Annotation> getAnnotations() {
        return UtilKt.computeAnnotations(this.type);
    }

    public List<KTypeProjection> getArguments() {
        return (List) this.arguments$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public KClassifier getClassifier() {
        return (KClassifier) this.classifier$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final Type getJavaType$kotlin_reflection() {
        return (Type) this.javaType$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final KotlinType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public boolean isMarkedNullable() {
        return this.type.isMarkedNullable();
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderType(this.type);
    }
}
