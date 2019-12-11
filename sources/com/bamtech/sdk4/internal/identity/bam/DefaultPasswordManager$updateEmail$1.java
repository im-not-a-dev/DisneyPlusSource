package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/bamtech/sdk4/identity/IdentityToken;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PasswordManager.kt */
final class DefaultPasswordManager$updateEmail$1<T, R> implements Function<IdentityToken, CompletableSource> {
    final /* synthetic */ String $newEmail;
    final /* synthetic */ String $password;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPasswordManager this$0;

    DefaultPasswordManager$updateEmail$1(DefaultPasswordManager defaultPasswordManager, ServiceTransaction serviceTransaction, String str, String str2) {
        this.this$0 = defaultPasswordManager;
        this.$transaction = serviceTransaction;
        this.$newEmail = str;
        this.$password = str2;
    }

    public final Completable apply(IdentityToken identityToken) {
        return this.this$0.client.changeEmail(this.$transaction, new ChangeEmailRequest(this.$newEmail, this.$password), C13170i0.m40332a(C12907r.m40244a("{identityToken}", identityToken.getToken())));
    }
}
