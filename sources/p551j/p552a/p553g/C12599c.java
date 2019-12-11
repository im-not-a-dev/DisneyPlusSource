package p551j.p552a.p553g;

import android.os.Looper;
import java.lang.Thread.State;

/* renamed from: j.a.g.c */
/* compiled from: ApplicationNotResponding */
class C12599c extends Throwable {

    /* renamed from: c */
    private State f29231c;

    public C12599c(String str) {
        super(str);
    }

    /* renamed from: a */
    public State mo30910a() {
        return this.f29231c;
    }

    public Throwable fillInStackTrace() {
        Thread thread = Looper.getMainLooper().getThread();
        this.f29231c = thread.getState();
        setStackTrace(thread.getStackTrace());
        return this;
    }
}
