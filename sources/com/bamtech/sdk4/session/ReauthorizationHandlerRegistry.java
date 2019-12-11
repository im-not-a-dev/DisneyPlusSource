package com.bamtech.sdk4.session;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.InvalidStateException;
import com.bamtech.sdk4.service.InvalidStateException.Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KClass;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\u0011\u001a\u00020\u0007R\"\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "", "()V", "handlerMap", "", "Lkotlin/reflect/KClass;", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "Lcom/bamtech/sdk4/session/ReauthorizationHandler;", "exchange", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "mode", "throwable", "", "register", "", "handler", "sdk-session-renew"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReauthorizationHandlerRegistry.kt */
public final class ReauthorizationHandlerRegistry {
    private final Map<KClass<? extends ReauthorizeMode>, ReauthorizationHandler> handlerMap = new LinkedHashMap();

    public final Completable exchange(ServiceTransaction serviceTransaction, ReauthorizeMode reauthorizeMode, Throwable th) {
        ReauthorizeMode reauthorizeMode2 = reauthorizeMode;
        ReauthorizationHandler reauthorizationHandler = (ReauthorizationHandler) this.handlerMap.get(C12895y.m40230a(reauthorizeMode.getClass()));
        if (reauthorizeMode2 instanceof NoAction) {
            DefaultImpls.log$default(serviceTransaction, this, "Exchange", "No action was requested", null, false, 24, null);
            Completable a = Completable.m38154a(th);
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Completable.error(throwable)");
            return a;
        } else if (reauthorizationHandler != null) {
            DefaultImpls.log$default(serviceTransaction, this, "Exchange", "Handler found", null, false, 24, null);
            return reauthorizationHandler.handle(serviceTransaction, reauthorizeMode2);
        } else {
            ServiceTransaction serviceTransaction2 = serviceTransaction;
            DefaultImpls.log$default(serviceTransaction, this, "Exchange", "There was no available handler", null, false, 24, null);
            Completable a2 = Completable.m38154a((Throwable) Companion.create$default(InvalidStateException.Companion, serviceTransaction.getId(), "plugin.not.found", "App was supposed to provide a ReauthorizationHandler but did not ", null, 8, null));
            Intrinsics.checkReturnedValueIsNotNull((Object) a2, "Completable.error(exception)");
            return a2;
        }
    }

    public final void register(KClass<? extends ReauthorizeMode> kClass, ReauthorizationHandler reauthorizationHandler) {
        this.handlerMap.put(kClass, reauthorizationHandler);
    }
}
