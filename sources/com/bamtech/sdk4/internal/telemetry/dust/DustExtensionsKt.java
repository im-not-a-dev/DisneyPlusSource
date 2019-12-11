package com.bamtech.sdk4.internal.telemetry.dust;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\n\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\f"}, mo31007d2 = {"withDust", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "event", "", "data", "", "Lio/reactivex/Maybe;", "T", "Lio/reactivex/Observable;", "Lio/reactivex/Single;", "sdk-service"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: DustExtensions.kt */
public final class DustExtensionsKt {
    public static final Completable withDust(Completable completable, ServiceTransaction serviceTransaction, String str, Object obj) {
        Completable a = completable.mo30052c((Consumer<? super Disposable>) new DustExtensionsKt$withDust$1<Object>(serviceTransaction, str, obj)).mo30036a((Consumer<? super Throwable>) new DustExtensionsKt$withDust$2<Object>(obj, serviceTransaction, str));
        C12880j.m40222a((Object) a, "this\n            .doOnSu…evel.ERROR)\n            }");
        return a;
    }

    public static /* synthetic */ Completable withDust$default(Completable completable, ServiceTransaction serviceTransaction, String str, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return withDust(completable, serviceTransaction, str, obj);
    }

    public static /* synthetic */ Single withDust$default(Single single, ServiceTransaction serviceTransaction, String str, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return withDust(single, serviceTransaction, str, obj);
    }

    public static final <T> Single<T> withDust(Single<T> single, ServiceTransaction serviceTransaction, String str, Object obj) {
        Single<T> b = single.mo30222c((Consumer<? super Disposable>) new DustExtensionsKt$withDust$3<Object>(serviceTransaction, str, obj)).mo30218b((Consumer<? super Throwable>) new DustExtensionsKt$withDust$4<Object>(obj, serviceTransaction, str));
        C12880j.m40222a((Object) b, "this\n            .doOnSu…evel.ERROR)\n            }");
        return b;
    }

    public static /* synthetic */ Observable withDust$default(Observable observable, ServiceTransaction serviceTransaction, String str, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return withDust(observable, serviceTransaction, str, obj);
    }

    public static final <T> Observable<T> withDust(Observable<T> observable, ServiceTransaction serviceTransaction, String str, Object obj) {
        Observable<T> c = observable.mo30188e((Consumer<? super Disposable>) new DustExtensionsKt$withDust$7<Object>(serviceTransaction, str, obj)).mo30177c((Consumer<? super Throwable>) new DustExtensionsKt$withDust$8<Object>(obj, serviceTransaction, str));
        C12880j.m40222a((Object) c, "this\n            .doOnSu…evel.ERROR)\n            }");
        return c;
    }
}
