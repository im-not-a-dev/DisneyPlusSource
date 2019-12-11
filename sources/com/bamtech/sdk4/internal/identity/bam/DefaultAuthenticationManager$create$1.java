package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "kotlin.jvm.PlatformType", "T", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$create$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ Object $attributes;
    final /* synthetic */ String $email;
    final /* synthetic */ boolean $isTest;
    final /* synthetic */ String $password;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAuthenticationManager this$0;

    DefaultAuthenticationManager$create$1(DefaultAuthenticationManager defaultAuthenticationManager, ServiceTransaction serviceTransaction, boolean z, String str, String str2, Object obj) {
        this.this$0 = defaultAuthenticationManager;
        this.$transaction = serviceTransaction;
        this.$isTest = z;
        this.$email = str;
        this.$password = str2;
        this.$attributes = obj;
    }

    public final SingleSource<? extends IdentityToken> call() {
        Single single;
        synchronized (this.this$0) {
            if (this.this$0.authenticateProcess != null) {
                single = this.this$0.authenticateProcess;
                if (single == null) {
                    Intrinsics.throwNpe();
                    throw null;
                }
            } else {
                DefaultAuthenticationManager defaultAuthenticationManager = this.this$0;
                DefaultAuthenticationManager defaultAuthenticationManager2 = this.this$0;
                Single g = this.this$0.accessTokenProvider.getAccessToken(this.$transaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C1879x94164f0b<Object,Object>(this)).mo30218b((Consumer<? super Throwable>) new C1881x94164f0c<Object>(this)).mo30226d().mo30233g(DefaultAuthenticationManager$create$1$1$3.INSTANCE);
                Intrinsics.checkReturnedValueIsNotNull((Object) g, "accessTokenProvider.getA…                        }");
                defaultAuthenticationManager.authenticateProcess = defaultAuthenticationManager2.releaseLockOnTerminate(g);
                single = this.this$0.authenticateProcess;
                if (single == null) {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        }
        return single;
    }
}
