package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.AccountServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0002\b\t"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
final class DefaultUserProfileClient$getUserProfiles$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;
    final /* synthetic */ DefaultUserProfileClient this$0;

    DefaultUserProfileClient$getUserProfiles$2(DefaultUserProfileClient defaultUserProfileClient, String str, ServiceTransaction serviceTransaction, Class cls) {
        this.this$0 = defaultUserProfileClient;
        this.$accessToken = str;
        this.$transaction = serviceTransaction;
        this.$type = cls;
    }

    public final Single<List<T>> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, C13170i0.m40332a(C12907r.m40244a("{accessToken}", this.$accessToken)), null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultUserProfileClient defaultUserProfileClient = this.this$0;
        Request a = C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C1810xb182f8f0(new ResponseHandler[]{defaultUserProfileClient.profilesResponseHandler(serviceTransaction, defaultUserProfileClient.converter, this.$type)}, serviceTransaction), new C1811xb182f8f1(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String profile_get_multiple = AccountServiceConfigurationKt.getPROFILE_GET_MULTIPLE(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C1812x24996305(a2)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<List<T>> g = b.mo30222c((Consumer<? super Disposable>) new C1813x24996306<Object>(serviceTransaction2, profile_get_multiple)).mo30218b((Consumer<? super Throwable>) new C1814x24996307<Object>(a, serviceTransaction2, profile_get_multiple)).mo30233g(new C1815x24996308(serviceTransaction2, profile_get_multiple));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
