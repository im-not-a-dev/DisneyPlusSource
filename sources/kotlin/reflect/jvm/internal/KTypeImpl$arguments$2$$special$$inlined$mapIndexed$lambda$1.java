package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KProperty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo31007d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke", "kotlin/reflect/jvm/internal/KTypeImpl$arguments$2$1$type$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KTypeImpl.kt */
final class KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1 extends C12881k implements Function0<Type> {

    /* renamed from: $i */
    final /* synthetic */ int f29550$i;
    final /* synthetic */ Lazy $parameterizedTypeArguments$inlined;
    final /* synthetic */ KProperty $parameterizedTypeArguments$metadata$inlined;
    final /* synthetic */ KTypeImpl$arguments$2 this$0;

    KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(int i, KTypeImpl$arguments$2 kTypeImpl$arguments$2, Lazy lazy, KProperty kProperty) {
        this.f29550$i = i;
        this.this$0 = kTypeImpl$arguments$2;
        this.$parameterizedTypeArguments$inlined = lazy;
        this.$parameterizedTypeArguments$metadata$inlined = kProperty;
        super(0);
    }

    public final Type invoke() {
        Type javaType$kotlin_reflection = this.this$0.this$0.getJavaType$kotlin_reflection();
        if (javaType$kotlin_reflection instanceof Class) {
            Class cls = (Class) javaType$kotlin_reflection;
            Class<Object> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.checkReturnedValueIsNotNull((Object) componentType, "if (javaType.isArray) ja…Type else Any::class.java");
            return componentType;
        } else if (javaType$kotlin_reflection instanceof GenericArrayType) {
            if (this.f29550$i == 0) {
                Type genericComponentType = ((GenericArrayType) javaType$kotlin_reflection).getGenericComponentType();
                Intrinsics.checkReturnedValueIsNotNull((Object) genericComponentType, "javaType.genericComponentType");
                return genericComponentType;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array type has been queried for a non-0th argument: ");
            sb.append(this.this$0.this$0);
            throw new KotlinReflectionInternalError(sb.toString());
        } else if (javaType$kotlin_reflection instanceof ParameterizedType) {
            Type type = (Type) ((List) this.$parameterizedTypeArguments$inlined.getValue()).get(this.f29550$i);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) C13174k.m40406f(lowerBounds);
                if (type2 != null) {
                    type = type2;
                } else {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, "argument.upperBounds");
                    type = (Type) C13174k.m40405e(upperBounds);
                }
            }
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "if (argument !is Wildcar…ument.upperBounds.first()");
            return type;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Non-generic type has been queried for arguments: ");
            sb2.append(this.this$0.this$0);
            throw new KotlinReflectionInternalError(sb2.toString());
        }
    }
}
