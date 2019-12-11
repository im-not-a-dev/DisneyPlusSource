package p520io.reactivex.p530x;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.reactivex.x.a */
/* compiled from: CompositeException */
public final class C11998a extends RuntimeException {

    /* renamed from: U */
    private final String f27730U;

    /* renamed from: V */
    private Throwable f27731V;

    /* renamed from: c */
    private final List<Throwable> f27732c;

    /* renamed from: io.reactivex.x.a$a */
    /* compiled from: CompositeException */
    static final class C11999a extends RuntimeException {
        C11999a() {
        }

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: io.reactivex.x.a$b */
    /* compiled from: CompositeException */
    static abstract class C12000b {
        C12000b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo30341a(Object obj);
    }

    /* renamed from: io.reactivex.x.a$c */
    /* compiled from: CompositeException */
    static final class C12001c extends C12000b {

        /* renamed from: a */
        private final PrintStream f27733a;

        C12001c(PrintStream printStream) {
            this.f27733a = printStream;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30341a(Object obj) {
            this.f27733a.println(obj);
        }
    }

    /* renamed from: io.reactivex.x.a$d */
    /* compiled from: CompositeException */
    static final class C12002d extends C12000b {

        /* renamed from: a */
        private final PrintWriter f27734a;

        C12002d(PrintWriter printWriter) {
            this.f27734a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30341a(Object obj) {
            this.f27734a.println(obj);
        }
    }

    public C11998a(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: b */
    private List<Throwable> m38607b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<Throwable> mo30334a() {
        return this.f27732c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f27731V     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            io.reactivex.x.a$a r0 = new io.reactivex.x.a$a     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.f27732c     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.m38607b(r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.mo30333a(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.f27731V = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.f27731V     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p530x.C11998a.getCause():java.lang.Throwable");
    }

    public String getMessage() {
        return this.f27730U;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* renamed from: a */
    private void m38605a(C12000b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.f27732c) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m38606a(sb, th, "\t");
            i++;
        }
        bVar.mo30341a(sb.toString());
    }

    public void printStackTrace(PrintStream printStream) {
        m38605a((C12000b) new C12001c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m38605a((C12000b) new C12002d(printWriter));
    }

    public C11998a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof C11998a) {
                    linkedHashSet.addAll(((C11998a) th).mo30334a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f27732c = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27732c.size());
            sb.append(" exceptions occurred. ");
            this.f27730U = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* renamed from: a */
    private void m38606a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m38606a(sb, th.getCause(), "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Throwable mo30333a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }
}
