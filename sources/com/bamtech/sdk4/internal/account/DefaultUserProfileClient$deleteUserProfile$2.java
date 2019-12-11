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
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
final class DefaultUserProfileClient$deleteUserProfile$2<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ String $profileId;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultUserProfileClient this$0;

    DefaultUserProfileClient$deleteUserProfile$2(DefaultUserProfileClient defaultUserProfileClient, String str, String str2, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultUserProfileClient;
        this.$accessToken = str;
        this.$profileId = str2;
        this.$transaction = serviceTransaction;
    }

    public final Maybe<CreateAccountGrantResponse> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, C13173j0.m40356a(C12907r.m40244a("{accessToken}", this.$accessToken), C12907r.m40244a(UserProfiles.INSTANCE.getID(), this.$profileId)), null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultUserProfileClient defaultUserProfileClient = this.this$0;
        Request a = C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C1792x651e5758(new ResponseHandler[]{defaultUserProfileClient.profileUpdateResponseHandler(serviceTransaction, defaultUserProfileClient.converter)}, serviceTransaction), new C1793x651e5759(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String profile_delete = AccountServiceConfigurationKt.getPROFILE_DELETE(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Maybe b = C1681c.m7780a(a, a2).mo30234h().mo30124c((C11945a) new C1794xafb91f2d(a2)).mo30119b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Maybe<CreateAccountGrantResponse> a3 = b.mo30116b((Consumer<? super Disposable>) new C1795xafb91f2e<Object>(serviceTransaction2, profile_delete)).mo30102a((Consumer<? super Throwable>) new C1796xafb91f2f<Object>(a, serviceTransaction2, profile_delete)).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new C1797xafb91f30<Object,Object>(serviceTransaction2, profile_delete));
        C12880j.m40222a((Object) a3, "this.asMaybe()\n        .…)\n            }\n        }");
        return a3;
    }
}
