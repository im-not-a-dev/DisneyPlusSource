package com.bamtech.core.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J9\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u000e\u0010\u0018\u001a\n\u0012\u0002\b\u00030\nj\u0002`\u000bH\u0002J9\u0010\u0019\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0016J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J(\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J9\u0010\u001f\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0016J \u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J \u0010 \u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000f0\nH\u0016JA\u0010 \u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010!J(\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J9\u0010#\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0016J \u0010#\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J9\u0010$\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0016J \u0010$\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J9\u0010%\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0016J \u0010%\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0016\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\nj\u0002`\u000b0'H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007RV\u0010\b\u001aJ\u0012\u001e\u0012\u001c\u0012\u0002\b\u0003 \f*\u000e\u0012\u0002\b\u0003\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\nj\u0002`\u000b \f*$\u0012\u001e\u0012\u001c\u0012\u0002\b\u0003 \f*\u000e\u0012\u0002\b\u0003\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\nj\u0002`\u000b\u0018\u00010\t0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, mo31007d2 = {"Lcom/bamtech/core/logging/DefaultLogger;", "Lcom/bamtech/core/logging/LogDispatcher;", "Lcom/bamtech/core/logging/LogPublisher;", "debugEnabled", "", "(Z)V", "getDebugEnabled", "()Z", "subject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/core/logging/LogEvent;", "Lcom/bamtech/core/logging/AnyEvent;", "kotlin.jvm.PlatformType", "d", "", "T", "", "source", "name", "", "data", "isPublic", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Z)V", "dispatch", "logEvent", "e", "ex", "t", "", "logLevel", "Lcom/bamtech/core/logging/LogLevel;", "i", "log", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/core/logging/LogLevel;Z)V", "logException", "trace", "v", "w", "watch", "Lio/reactivex/Observable;", "logging"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: DefaultLogger.kt */
public final class DefaultLogger implements LogDispatcher, LogPublisher {
    private final boolean debugEnabled;
    private PublishSubject<LogEvent<?>> subject;

    public DefaultLogger() {
        this(false, 1, null);
    }

    public DefaultLogger(boolean z) {
        this.debugEnabled = z;
        this.subject = PublishSubject.m38553q();
    }

    private final void dispatch(LogEvent<?> logEvent) {
        if (!Intrinsics.areEqual((Object) logEvent.getLevel(), (Object) LogLevel.NONE)) {
            if (this.debugEnabled || logEvent.getLevel().compareTo(LogLevel.DEBUG) < 0) {
                this.subject.onNext(logEvent);
            }
        }
    }

    /* renamed from: d */
    public void mo7350d(Object obj, String str, boolean z) {
        LogEvent logEvent = new LogEvent(LogEventKt.getName(obj), str, null, LogLevel.DEBUG, z);
        dispatch(logEvent);
    }

    /* renamed from: ex */
    public void mo7351ex(Throwable th, String str, LogLevel logLevel, boolean z) {
        dispatch(new ExceptionEvent(str, th, logLevel, z));
    }

    public <T> void log(LogEvent<T> logEvent) {
        dispatch(logEvent);
    }

    public void logException(Throwable th, String str, LogLevel logLevel, boolean z) {
        dispatch(new ExceptionEvent(str, th, logLevel, z));
    }

    /* renamed from: w */
    public void mo7355w(Object obj, String str, boolean z) {
        LogEvent logEvent = new LogEvent(LogEventKt.getName(obj), str, null, LogLevel.WARN, z);
        dispatch(logEvent);
    }

    public Observable<LogEvent<?>> watch() {
        if (this.subject.mo30303p() || this.subject.mo30302o()) {
            this.subject = PublishSubject.m38553q();
        }
        PublishSubject<LogEvent<?>> publishSubject = this.subject;
        Intrinsics.checkReturnedValueIsNotNull((Object) publishSubject, "subject");
        return publishSubject;
    }

    /* renamed from: d */
    public <T> void mo7349d(Object obj, String str, T t, boolean z) {
        LogEvent logEvent = new LogEvent(LogEventKt.getName(obj), str, t, LogLevel.DEBUG, z);
        dispatch(logEvent);
    }

    public <T> void log(Object obj, String str, T t, LogLevel logLevel, boolean z) {
        LogEvent logEvent = new LogEvent(LogEventKt.getName(obj), str, t, logLevel, z);
        dispatch(logEvent);
    }

    public /* synthetic */ DefaultLogger(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            z = false;
        }
        this(z);
    }
}
