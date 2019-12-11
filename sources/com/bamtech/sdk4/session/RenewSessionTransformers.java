package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableTransformer;
import p520io.reactivex.MaybeTransformer;
import p520io.reactivex.ObservableTransformer;
import p520io.reactivex.SingleTransformer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\fH&J\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u000e\"\u0004\b\u0000\u0010\fH&J\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u000e\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0014\"\u0004\b\u0000\u0010\fH&J\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0014\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "", "completableRenewSession", "Lio/reactivex/CompletableTransformer;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "handleRenew", "Lio/reactivex/Completable;", "throwable", "", "maybeRenewSession", "Lio/reactivex/MaybeTransformer;", "T", "observableRenewSession", "Lio/reactivex/ObservableTransformer;", "shouldRenew", "", "instance", "Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;", "singleRenewSession", "Lio/reactivex/SingleTransformer;", "sdk-session-renew"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RenewSessionTransformer.kt */
public interface RenewSessionTransformers {
    CompletableTransformer completableRenewSession();

    CompletableTransformer completableRenewSession(ServiceTransaction serviceTransaction);

    Completable handleRenew(ServiceTransaction serviceTransaction, Throwable th);

    <T> MaybeTransformer<T, T> maybeRenewSession();

    <T> MaybeTransformer<T, T> maybeRenewSession(ServiceTransaction serviceTransaction);

    <T> ObservableTransformer<T, T> observableRenewSession();

    <T> ObservableTransformer<T, T> observableRenewSession(ServiceTransaction serviceTransaction);

    boolean shouldRenew(Throwable th, AuthenticationExpiredCallback authenticationExpiredCallback);

    <T> SingleTransformer<T, T> singleRenewSession();

    <T> SingleTransformer<T, T> singleRenewSession(ServiceTransaction serviceTransaction);
}
