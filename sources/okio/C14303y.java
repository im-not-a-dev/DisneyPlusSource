package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001f\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\bJ\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lokio/Timeout;", "", "()V", "deadlineNanoTime", "", "hasDeadline", "", "timeoutNanos", "clearDeadline", "clearTimeout", "deadline", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "", "other", "block", "Lkotlin/Function0;", "throwIfReached", "timeout", "waitUntilNotified", "monitor", "Companion", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* renamed from: okio.y */
/* compiled from: Timeout.kt */
public class C14303y {

    /* renamed from: d */
    public static final C14303y f31915d = new C14304a();

    /* renamed from: a */
    private boolean f31916a;

    /* renamed from: b */
    private long f31917b;

    /* renamed from: c */
    private long f31918c;

    /* renamed from: okio.y$a */
    /* compiled from: Timeout.kt */
    public static final class C14304a extends C14303y {
        C14304a() {
        }

        /* renamed from: a */
        public C14303y mo36416a(long j) {
            return this;
        }

        /* renamed from: a */
        public C14303y mo36417a(long j, TimeUnit timeUnit) {
            return this;
        }

        /* renamed from: e */
        public void mo36421e() {
        }
    }

    /* renamed from: okio.y$b */
    /* compiled from: Timeout.kt */
    public static final class C14305b {
        private C14305b() {
        }

        public /* synthetic */ C14305b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C14305b(null);
    }

    /* renamed from: a */
    public C14303y mo36417a(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.f31918c = timeUnit.toNanos(j);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("timeout < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: b */
    public C14303y mo36418b() {
        this.f31918c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo36419c() {
        if (this.f31916a) {
            return this.f31917b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public boolean mo36420d() {
        return this.f31916a;
    }

    /* renamed from: e */
    public void mo36421e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f31916a && this.f31917b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: f */
    public long mo36467f() {
        return this.f31918c;
    }

    /* renamed from: a */
    public C14303y mo36416a(long j) {
        this.f31916a = true;
        this.f31917b = j;
        return this;
    }

    /* renamed from: a */
    public C14303y mo36415a() {
        this.f31916a = false;
        return this;
    }
}
