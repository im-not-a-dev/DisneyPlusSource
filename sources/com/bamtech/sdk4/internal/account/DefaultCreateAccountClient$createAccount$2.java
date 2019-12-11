package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.internal.configuration.AccountServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.Map;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/account/CreateAccountResult;", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: CreateAccountClient.kt */
final class DefaultCreateAccountClient$createAccount$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Converter $converter;
    final /* synthetic */ CreateAccountRequest $request;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultCreateAccountClient this$0;

    DefaultCreateAccountClient$createAccount$2(DefaultCreateAccountClient defaultCreateAccountClient, Map map, ServiceTransaction serviceTransaction, Converter converter, CreateAccountRequest createAccountRequest) {
        this.this$0 = defaultCreateAccountClient;
        this.$tokenMap = map;
        this.$transaction = serviceTransaction;
        this.$converter = converter;
        this.$request = createAccountRequest;
    }

    public final Single<CreateAccountResult> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$tokenMap, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        Request a = C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new C1768xf398abe9(new ResponseHandler[]{this.this$0.responseHandler(serviceTransaction)}, serviceTransaction), new C1769xf398abea(serviceTransaction)), this.$converter.serialize(this.$request), ConfigurationKt.toDustConfigSettings(configuration));
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String account_create_account = AccountServiceConfigurationKt.getACCOUNT_CREATE_ACCOUNT(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C1770xeaf5d1ac(a2)).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<CreateAccountResult> g = b.mo30222c((Consumer<? super Disposable>) new C1771xeaf5d1ad<Object>(serviceTransaction2, account_create_account)).mo30218b((Consumer<? super Throwable>) new C1772xeaf5d1ae<Object>(a, serviceTransaction2, account_create_account)).mo30233g(new C1773xeaf5d1af(serviceTransaction2, account_create_account));
        C12880j.m40222a((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
