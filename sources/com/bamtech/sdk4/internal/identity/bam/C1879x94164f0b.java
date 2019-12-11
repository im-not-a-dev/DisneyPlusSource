package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityToken;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "kotlin.jvm.PlatformType", "T", "it", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply", "com/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationManager$create$1$1$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.identity.bam.DefaultAuthenticationManager$create$1$$special$$inlined$synchronized$lambda$1 */
/* compiled from: AuthenticationManager.kt */
final class C1879x94164f0b<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ DefaultAuthenticationManager$create$1 this$0;

    C1879x94164f0b(DefaultAuthenticationManager$create$1 defaultAuthenticationManager$create$1) {
        this.this$0 = defaultAuthenticationManager$create$1;
    }

    public final Single<LoginResponse> apply(String str) {
        Map a = C13170i0.m40332a(C12907r.m40244a("{accessToken}", str));
        Map a2 = C13170i0.m40332a(C12907r.m40244a("isTest", Boolean.valueOf(this.this$0.$isTest)));
        IdentityClient access$getClient$p = this.this$0.this$0.client;
        DefaultAuthenticationManager$create$1 defaultAuthenticationManager$create$1 = this.this$0;
        Completable register = access$getClient$p.register(defaultAuthenticationManager$create$1.$transaction, new RegistrationRequest(defaultAuthenticationManager$create$1.$email, defaultAuthenticationManager$create$1.$password, defaultAuthenticationManager$create$1.$attributes, a2), a);
        IdentityClient access$getClient$p2 = this.this$0.this$0.client;
        DefaultAuthenticationManager$create$1 defaultAuthenticationManager$create$12 = this.this$0;
        return register.mo30044a((SingleSource<T>) access$getClient$p2.authenticate(defaultAuthenticationManager$create$12.$transaction, new AuthenticationRequest(defaultAuthenticationManager$create$12.$email, defaultAuthenticationManager$create$12.$password), a).mo30233g(new Function<T, R>(this) {
            final /* synthetic */ C1879x94164f0b this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                LoginResponse loginResponse = (LoginResponse) obj;
                apply(loginResponse);
                return loginResponse;
            }

            public final LoginResponse apply(LoginResponse loginResponse) {
                IdentityToken identityToken = (IdentityToken) loginResponse;
                BamIdentityTokenKt.saveIdentity(this.this$0.this$0.this$0.storage, new BamIdentityToken(identityToken.getToken(), identityToken.getExpiresIn(), identityToken.getIssuedAt(), identityToken.getSecurityAction()), this.this$0.this$0.this$0.flowConverter);
                return loginResponse;
            }
        }));
    }
}
