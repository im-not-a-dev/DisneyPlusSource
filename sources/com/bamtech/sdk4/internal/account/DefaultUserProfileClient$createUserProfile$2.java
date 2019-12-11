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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\n¢\u0006\u0002\b\n"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/account/UserProfile;", "T", "U", "V", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
final class DefaultUserProfileClient$createUserProfile$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ Object $attributes;
    final /* synthetic */ Object $metadata;
    final /* synthetic */ String $profileName;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;
    final /* synthetic */ DefaultUserProfileClient this$0;

    DefaultUserProfileClient$createUserProfile$2(DefaultUserProfileClient defaultUserProfileClient, String str, Object obj, Object obj2, String str2, ServiceTransaction serviceTransaction, Class cls) {
        this.this$0 = defaultUserProfileClient;
        this.$profileName = str;
        this.$attributes = obj;
        this.$metadata = obj2;
        this.$accessToken = str2;
        this.$transaction = serviceTransaction;
        this.$type = cls;
    }

    public final Single<UserProfile> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        CreateProfile createProfile = new CreateProfile(this.$profileName, this.$attributes, this.$metadata);
        Link updateTemplates$default = Link.updateTemplates$default(link, C13170i0.m40332a(C12907r.m40244a("{accessToken}", this.$accessToken)), null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultUserProfileClient defaultUserProfileClient = this.this$0;
        Request a = C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new C1786x708d2ca7(new ResponseHandler[]{defaultUserProfileClient.profilesResponseHandler(serviceTransaction, defaultUserProfileClient.converter, this.$type)}, serviceTransaction), new C1787x708d2ca8(serviceTransaction)), this.this$0.converter.serialize(createProfile), ConfigurationKt.toDustConfigSettings(configuration));
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String profile_create = AccountServiceConfigurationKt.getPROFILE_CREATE(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C1788x8c0a5bae(a2)).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<UserProfile> g = b.mo30222c((Consumer<? super Disposable>) new C1789x8c0a5baf<Object>(serviceTransaction2, profile_create)).mo30218b((Consumer<? super Throwable>) new C1790x8c0a5bb0<Object>(a, serviceTransaction2, profile_create)).mo30233g(new C1791x8c0a5bb1(serviceTransaction2, profile_create));
        C12880j.m40222a((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
