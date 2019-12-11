package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.configuration.AccountServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/account/UserProfile;", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
final class DefaultUserProfileClient$getActiveUserProfile$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;
    final /* synthetic */ DefaultUserProfileClient this$0;

    DefaultUserProfileClient$getActiveUserProfile$2(DefaultUserProfileClient defaultUserProfileClient, String str, ServiceTransaction serviceTransaction, Class cls) {
        this.this$0 = defaultUserProfileClient;
        this.$accessToken = str;
        this.$transaction = serviceTransaction;
        this.$type = cls;
    }

    public final Single<UserProfile> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, C13170i0.m40332a(C12907r.m40244a("{accessToken}", this.$accessToken)), null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultUserProfileClient defaultUserProfileClient = this.this$0;
        Request a = C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C1798xd37c791f(new ResponseHandler[]{defaultUserProfileClient.profilesResponseHandler(serviceTransaction, defaultUserProfileClient.converter, this.$type)}, serviceTransaction), new C1799xd37c7920(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String profile_get_active = AccountServiceConfigurationKt.getPROFILE_GET_ACTIVE(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C1800x3eae2a36(a2)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<UserProfile> g = b.mo30222c((Consumer<? super Disposable>) new C1801x3eae2a37<Object>(serviceTransaction2, profile_get_active)).mo30218b((Consumer<? super Throwable>) new C1802x3eae2a38<Object>(a, serviceTransaction2, profile_get_active)).mo30233g(new C1803x3eae2a39(serviceTransaction2, profile_get_active));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
