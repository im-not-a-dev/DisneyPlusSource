package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.AuthenticationFlow;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&JG\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u0001H\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H&J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH&J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationManager;", "", "authenticate", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "email", "", "password", "create", "T", "attributes", "isTest", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)Lio/reactivex/Single;", "deauthenticate", "Lio/reactivex/Completable;", "getAuthenticationFlow", "", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "redeemOneTimePasscode", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "passcode", "requestOneTimePasscode", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "requiresAuthentication", "Companion", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
public interface AuthenticationManager {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationManager$Companion;", "", "()V", "CONCURRENT_REQUEST_LIMIT_EXCEPTION_CODE", "", "CONCURRENT_REQUEST_LIMIT_EXCEPTION_MESSAGE", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationManager.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationManager.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Single create$default(AuthenticationManager authenticationManager, ServiceTransaction serviceTransaction, String str, String str2, Object obj, boolean z, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 8) != 0) {
                    obj = null;
                }
                return authenticationManager.create(serviceTransaction, str, str2, obj, (i & 16) != 0 ? false : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }

    static {
        Companion companion = Companion.$$INSTANCE;
    }

    Single<IdentityToken> authenticate(ServiceTransaction serviceTransaction, String str, String str2);

    <T> Single<IdentityToken> create(ServiceTransaction serviceTransaction, String str, String str2, T t, boolean z);

    Single<List<AuthenticationFlow>> getAuthenticationFlow(ServiceTransaction serviceTransaction, String str);

    Single<RedeemedPasscodeToken> redeemOneTimePasscode(ServiceTransaction serviceTransaction, String str, String str2);

    Completable requestOneTimePasscode(ServiceTransaction serviceTransaction, String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason);

    boolean requiresAuthentication(ServiceTransaction serviceTransaction);
}
