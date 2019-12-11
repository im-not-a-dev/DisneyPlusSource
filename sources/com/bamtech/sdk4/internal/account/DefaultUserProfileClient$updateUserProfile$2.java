package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.configuration.AccountServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0002\b\t"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
final class DefaultUserProfileClient$updateUserProfile$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ UserProfile $userProfile;
    final /* synthetic */ DefaultUserProfileClient this$0;

    DefaultUserProfileClient$updateUserProfile$2(DefaultUserProfileClient defaultUserProfileClient, String str, UserProfile userProfile, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultUserProfileClient;
        this.$accessToken = str;
        this.$userProfile = userProfile;
        this.$transaction = serviceTransaction;
    }

    public final Single<Boolean> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, C13173j0.m40356a(C12907r.m40244a("{accessToken}", this.$accessToken), C12907r.m40244a(UserProfiles.INSTANCE.getID(), this.$userProfile.getProfileId())), null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        Request a = C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new C1823x5de75afa(new ResponseHandler[]{this.this$0.refreshHeaderHandler(serviceTransaction)}, serviceTransaction), new C1824x5de75afb(serviceTransaction)), this.this$0.converter.serialize(this.$userProfile), ConfigurationKt.toDustConfigSettings(configuration));
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String profile_update = AccountServiceConfigurationKt.getPROFILE_UPDATE(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C1825xf7dde33b(a2)).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<Boolean> g = b.mo30222c((Consumer<? super Disposable>) new C1826xf7dde33c<Object>(serviceTransaction2, profile_update)).mo30218b((Consumer<? super Throwable>) new C1827xf7dde33d<Object>(a, serviceTransaction2, profile_update)).mo30233g(new C1828xf7dde33e(serviceTransaction2, profile_update));
        C12880j.m40222a((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
