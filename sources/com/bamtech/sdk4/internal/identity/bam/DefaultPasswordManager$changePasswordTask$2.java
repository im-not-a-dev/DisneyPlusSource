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
final class DefaultPasswordManager$changePasswordTask$2<T, R> implements Function<IdentityToken, CompletableSource> {
    final /* synthetic */ String $newPassword;
    final /* synthetic */ String $oldPassword;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPasswordManager this$0;

    DefaultPasswordManager$changePasswordTask$2(DefaultPasswordManager defaultPasswordManager, String str, String str2, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultPasswordManager;
        this.$oldPassword = str;
        this.$newPassword = str2;
        this.$transaction = serviceTransaction;
    }

    public final Completable apply(IdentityToken identityToken) {
        return this.this$0.client.changePassword(this.$transaction, new ChangePasswordRequest(this.$oldPassword, this.$newPassword), C13170i0.m40332a(C12907r.m40244a("{identityToken}", identityToken.getToken())));
    }
}
