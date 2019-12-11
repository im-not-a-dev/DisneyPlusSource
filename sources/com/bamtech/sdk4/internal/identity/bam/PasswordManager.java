package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H&¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/PasswordManager;", "", "changePassword", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "oldPassword", "", "newPassword", "requestPasswordReset", "email", "resetPassword", "resetToken", "updateEmail", "newEmail", "password", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PasswordManager.kt */
public interface PasswordManager {
    Completable changePassword(ServiceTransaction serviceTransaction, String str, String str2);

    Completable updateEmail(ServiceTransaction serviceTransaction, String str, String str2);
}
