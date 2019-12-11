package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.r */
/* compiled from: CompletedExceptionally.kt */
public class C13389r {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f29879b = AtomicIntegerFieldUpdater.newUpdater(C13389r.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f29880a;

    public C13389r(Throwable th, boolean z) {
        this.f29880a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [boolean, int]
      assigns: [int]
      uses: [boolean]
      mth insns count: 2
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34581a() {
        /*
            r1 = this;
            int r0 = r1._handled
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13389r.mo34581a():boolean");
    }

    /* renamed from: b */
    public final boolean mo34582b() {
        return f29879b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C13323k0.m40937a((Object) this));
        sb.append('[');
        sb.append(this.f29880a);
        sb.append(']');
        return sb.toString();
    }

    public /* synthetic */ C13389r(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(th, z);
    }
}
