package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KPackageImpl.kt */
final class KPackageImpl$Data$scope$2 extends C12881k implements Function0<MemberScope> {
    final /* synthetic */ Data this$0;

    KPackageImpl$Data$scope$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final MemberScope invoke() {
        ReflectKotlinClass access$getKotlinClass$p = this.this$0.getKotlinClass();
        if (access$getKotlinClass$p != null) {
            return this.this$0.getModuleData().getPackagePartScopeCache().getPackagePartScope(access$getKotlinClass$p);
        }
        return Empty.INSTANCE;
    }
}
