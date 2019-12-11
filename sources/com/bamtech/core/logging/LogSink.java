package com.bamtech.core.logging;

import java.util.HashSet;
import kotlin.Metadata;
import p520io.reactivex.p521a0.C11909b;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0002j\u0002`\u00030\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u00030\u0002j\u0002`\u0003H\u0014J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u00030\u0002j\u0002`\u0003H$J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u00030\u0002j\u0002`\u0003H\u0016¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/core/logging/LogSink;", "Lio/reactivex/observers/DisposableObserver;", "Lcom/bamtech/core/logging/LogEvent;", "Lcom/bamtech/core/logging/AnyEvent;", "()V", "isLoggable", "", "logEvent", "log", "", "onComplete", "onError", "e", "", "onNext", "Collection", "logging"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: LogSink.kt */
public abstract class LogSink extends C11909b<LogEvent<?>> {

    @Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/core/logging/LogSink$Collection;", "Ljava/util/HashSet;", "Lcom/bamtech/core/logging/LogSink;", "()V", "Companion", "logging"}, mo31008k = 1, mo31009mv = {1, 1, 9})
    /* compiled from: LogSink.kt */
    public static final class Collection extends HashSet<LogSink> {
        public static final Companion Companion = new Companion(null);

        @Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J+\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\t\"\u0002H\u0006H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/core/logging/LogSink$Collection$Companion;", "", "()V", "empty", "Lcom/bamtech/core/logging/LogSink$Collection;", "of", "T", "Lcom/bamtech/core/logging/LogSink;", "sink", "", "([Lcom/bamtech/core/logging/LogSink;)Lcom/bamtech/core/logging/LogSink$Collection;", "logging"}, mo31008k = 1, mo31009mv = {1, 1, 9})
        /* compiled from: LogSink.kt */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: of */
            public final <T extends LogSink> Collection mo7376of(T... tArr) {
                Collection collection = new Collection(null);
                C13196t.m40546a((java.util.Collection) collection, (Object[]) tArr);
                return collection;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Collection() {
        }

        public /* bridge */ boolean contains(LogSink logSink) {
            return super.contains(logSink);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ boolean remove(LogSink logSink) {
            return super.remove(logSink);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public /* synthetic */ Collection(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof LogSink) {
                return contains((LogSink) obj);
            }
            return false;
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof LogSink) {
                return remove((LogSink) obj);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean isLoggable(LogEvent<?> logEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void log(LogEvent<?> logEvent);

    public void onComplete() {
    }

    public void onError(Throwable th) {
    }

    public void onNext(LogEvent<?> logEvent) {
        if (isLoggable(logEvent)) {
            log(logEvent);
        }
    }
}
