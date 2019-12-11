package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType.Factory;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;", "reflectType", "Ljava/lang/reflect/WildcardType;", "(Ljava/lang/reflect/WildcardType;)V", "bound", "getBound", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "isExtends", "", "()Z", "getReflectType", "()Ljava/lang/reflect/WildcardType;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaWildcardType.kt */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {
    private final WildcardType reflectType;

    public ReflectJavaWildcardType(WildcardType wildcardType) {
        this.reflectType = wildcardType;
    }

    public boolean isExtends() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, "reflectType.upperBounds");
        return !Intrinsics.areEqual((Object) (Type) C13174k.m40406f(upperBounds), (Object) Object.class);
    }

    public ReflectJavaType getBound() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wildcard types with many bounds are not yet supported: ");
            sb.append(getReflectType());
            throw new UnsupportedOperationException(sb.toString());
        } else if (lowerBounds.length == 1) {
            Factory factory = ReflectJavaType.Factory;
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerBounds, "lowerBounds");
            Object j = C13174k.m40410j(lowerBounds);
            Intrinsics.checkReturnedValueIsNotNull(j, "lowerBounds.single()");
            return factory.create((Type) j);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, "upperBounds");
            Type type = (Type) C13174k.m40410j(upperBounds);
            if (!(!Intrinsics.areEqual((Object) type, (Object) Object.class))) {
                return null;
            }
            Factory factory2 = ReflectJavaType.Factory;
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "ub");
            return factory2.create(type);
        }
    }

    /* access modifiers changed from: protected */
    public WildcardType getReflectType() {
        return this.reflectType;
    }
}
