package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* compiled from: TypeIntersectionScope.kt */
final class TypeIntersectionScope$getContributedVariables$1 extends C12881k implements Function1<PropertyDescriptor, PropertyDescriptor> {
    public static final TypeIntersectionScope$getContributedVariables$1 INSTANCE = new TypeIntersectionScope$getContributedVariables$1();

    TypeIntersectionScope$getContributedVariables$1() {
        super(1);
    }

    public final PropertyDescriptor invoke(PropertyDescriptor propertyDescriptor) {
        return propertyDescriptor;
    }
}
