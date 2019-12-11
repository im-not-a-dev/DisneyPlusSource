package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.C12880j;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.C13343m0;

/* renamed from: kotlinx.coroutines.android.a */
/* compiled from: HandlerDispatcher.kt */
public final class C13214a extends C13215b implements C13343m0 {

    /* renamed from: U */
    private final String f29648U;

    /* renamed from: V */
    private final boolean f29649V;
    private volatile C13214a _immediate;

    /* renamed from: c */
    private final Handler f29650c;

    private C13214a(Handler handler, String str, boolean z) {
        C13214a aVar = null;
        super(null);
        this.f29650c = handler;
        this.f29648U = str;
        this.f29649V = z;
        if (this.f29649V) {
            aVar = this;
        }
        this._immediate = aVar;
        if (this._immediate == null) {
            this._immediate = new C13214a(this.f29650c, this.f29648U, true);
        }
    }

    /* renamed from: a */
    public void mo34340a(C12688f fVar, Runnable runnable) {
        this.f29650c.post(runnable);
    }

    /* renamed from: b */
    public boolean mo34349b(C12688f fVar) {
        return !this.f29649V || (C12880j.m40224a((Object) Looper.myLooper(), (Object) this.f29650c.getLooper()) ^ true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13214a) && ((C13214a) obj).f29650c == this.f29650c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f29650c);
    }

    public String toString() {
        String str = this.f29648U;
        if (str == null) {
            String handler = this.f29650c.toString();
            C12880j.m40222a((Object) handler, "handler.toString()");
            return handler;
        } else if (!this.f29649V) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29648U);
            sb.append(" [immediate]");
            return sb.toString();
        }
    }

    public C13214a(Handler handler, String str) {
        this(handler, str, false);
    }
}
