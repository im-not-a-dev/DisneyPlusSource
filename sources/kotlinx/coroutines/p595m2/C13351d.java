package kotlinx.coroutines.p595m2;

import java.util.concurrent.RejectedExecutionException;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.C13330l0;
import kotlinx.coroutines.C13418z;
import kotlinx.coroutines.C13419z0;

/* renamed from: kotlinx.coroutines.m2.d */
/* compiled from: Dispatcher.kt */
public class C13351d extends C13419z0 {

    /* renamed from: U */
    private final int f29821U;

    /* renamed from: V */
    private final int f29822V;

    /* renamed from: W */
    private final long f29823W;

    /* renamed from: X */
    private final String f29824X;

    /* renamed from: c */
    private C13345a f29825c;

    public C13351d(int i, int i2, long j, String str) {
        this.f29821U = i;
        this.f29822V = i2;
        this.f29823W = j;
        this.f29824X = str;
        this.f29825c = mo34542g();
    }

    /* renamed from: g */
    private final C13345a mo34542g() {
        C13345a aVar = new C13345a(this.f29821U, this.f29822V, this.f29823W, this.f29824X);
        return aVar;
    }

    /* renamed from: a */
    public void mo34340a(C12688f fVar, Runnable runnable) {
        try {
            C13345a.m40991a(this.f29825c, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            C13330l0.f29765Z.mo34340a(fVar, runnable);
        }
    }

    /* renamed from: b */
    public final C13418z mo34544b(int i) {
        if (i > 0) {
            return new C13353f(this, i, C13359l.PROBABLY_BLOCKING);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected positive parallelism level, but have ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public /* synthetic */ C13351d(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            i = C13360m.f29842c;
        }
        if ((i3 & 2) != 0) {
            i2 = C13360m.f29843d;
        }
        if ((i3 & 4) != 0) {
            str = "DefaultDispatcher";
        }
        this(i, i2, str);
    }

    /* renamed from: a */
    public final void mo34543a(Runnable runnable, C13357j jVar, boolean z) {
        try {
            this.f29825c.mo34522a(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            C13330l0.f29765Z.mo34617a((Runnable) this.f29825c.mo34520a(runnable, jVar));
        }
    }

    public C13351d(int i, int i2, String str) {
        this(i, i2, C13360m.f29844e, str);
    }
}
