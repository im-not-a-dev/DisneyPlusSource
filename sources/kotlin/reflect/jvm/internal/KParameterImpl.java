package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KParameter;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\"H\u0016R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "index", "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "equals", "other", "", "hashCode", "toString", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KParameterImpl.kt */
public final class KParameterImpl implements KParameter {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final LazySoftVal annotations$delegate = ReflectProperties.lazySoft(new KParameterImpl$annotations$2(this));
    private final KCallableImpl<?> callable;
    private final LazySoftVal descriptor$delegate;
    private final int index;
    private final Kind kind;

    static {
        Class<KParameterImpl> cls = KParameterImpl.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public KParameterImpl(KCallableImpl<?> kCallableImpl, int i, Kind kind2, Function0<? extends ParameterDescriptor> function0) {
        this.callable = kCallableImpl;
        this.index = i;
        this.kind = kind2;
        this.descriptor$delegate = ReflectProperties.lazySoft(function0);
    }

    /* access modifiers changed from: private */
    public final ParameterDescriptor getDescriptor() {
        return (ParameterDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            if (C12880j.m40224a((Object) this.callable, (Object) kParameterImpl.callable) && C12880j.m40224a((Object) getDescriptor(), (Object) kParameterImpl.getDescriptor())) {
                return true;
            }
        }
        return false;
    }

    public List<Annotation> getAnnotations() {
        return (List) this.annotations$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final KCallableImpl<?> getCallable() {
        return this.callable;
    }

    public int getIndex() {
        return this.index;
    }

    public Kind getKind() {
        return this.kind;
    }

    public String getName() {
        ParameterDescriptor descriptor = getDescriptor();
        String str = null;
        if (!(descriptor instanceof ValueParameterDescriptor)) {
            descriptor = null;
        }
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) descriptor;
        if (valueParameterDescriptor != null) {
            if (valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
                return null;
            }
            Name name = valueParameterDescriptor.getName();
            C12880j.m40222a((Object) name, "valueParameter.name");
            if (!name.isSpecial()) {
                str = name.asString();
            }
        }
        return str;
    }

    public KType getType() {
        KotlinType type = getDescriptor().getType();
        C12880j.m40222a((Object) type, "descriptor.type");
        return new KTypeImpl(type, new KParameterImpl$type$1(this));
    }

    public int hashCode() {
        return (this.callable.hashCode() * 31) + getDescriptor().hashCode();
    }

    public boolean isOptional() {
        ParameterDescriptor descriptor = getDescriptor();
        if (!(descriptor instanceof ValueParameterDescriptor)) {
            descriptor = null;
        }
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) descriptor;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    public boolean isVararg() {
        ParameterDescriptor descriptor = getDescriptor();
        return (descriptor instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) descriptor).getVarargElementType() != null;
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderParameter(this);
    }
}
