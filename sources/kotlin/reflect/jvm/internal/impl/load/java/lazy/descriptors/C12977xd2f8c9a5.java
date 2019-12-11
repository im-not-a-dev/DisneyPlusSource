package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 */
/* compiled from: LazyJavaStaticClassScope.kt */
final class C12977xd2f8c9a5 extends C12881k implements Function1<MemberScope, Collection<? extends PropertyDescriptor>> {
    final /* synthetic */ Name $name;

    C12977xd2f8c9a5(Name name) {
        this.$name = name;
        super(1);
    }

    public final Collection<? extends PropertyDescriptor> invoke(MemberScope memberScope) {
        return memberScope.getContributedVariables(this.$name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }
}
