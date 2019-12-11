package com.bamtech.sdk4.internal.service;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.internal.telemetry.dust.DustEvent;
import kotlin.Metadata;
import p520io.reactivex.C11914c;
import p520io.reactivex.CompletableEmitter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "CLIENT", "SERVER", "emitter", "Lio/reactivex/CompletableEmitter;", "subscribe"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ServiceTransaction.kt */
final class ServiceTransaction$logDustEvent$1 implements C11914c {
    final /* synthetic */ String $event;
    final /* synthetic */ boolean $isPublic;
    final /* synthetic */ LogLevel $logLevel;
    final /* synthetic */ DustEvent $payload;
    final /* synthetic */ ServiceTransaction this$0;

    ServiceTransaction$logDustEvent$1(ServiceTransaction serviceTransaction, String str, DustEvent dustEvent, LogLevel logLevel, boolean z) {
        this.this$0 = serviceTransaction;
        this.$event = str;
        this.$payload = dustEvent;
        this.$logLevel = logLevel;
        this.$isPublic = z;
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        try {
            ServiceTransaction serviceTransaction = this.this$0;
            LogEvent logEvent = new LogEvent((Object) this.this$0, this.$event, this.$payload, this.$logLevel, this.$isPublic);
            serviceTransaction.log(logEvent);
        } finally {
            completableEmitter.onComplete();
        }
    }
}
