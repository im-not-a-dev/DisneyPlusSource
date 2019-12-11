package p096e.p105b.p106a.p107a;

import java.util.concurrent.Executor;

/* renamed from: e.b.a.a.a */
/* compiled from: ArchTaskExecutor */
public class C3902a extends C3907c {

    /* renamed from: c */
    private static volatile C3902a f9680c;

    /* renamed from: d */
    private static final Executor f9681d = new C3904b();

    /* renamed from: a */
    private C3907c f9682a = this.f9683b;

    /* renamed from: b */
    private C3907c f9683b = new C3905b();

    /* renamed from: e.b.a.a.a$a */
    /* compiled from: ArchTaskExecutor */
    static class C3903a implements Executor {
        C3903a() {
        }

        public void execute(Runnable runnable) {
            C3902a.m13112c().mo13973b(runnable);
        }
    }

    /* renamed from: e.b.a.a.a$b */
    /* compiled from: ArchTaskExecutor */
    static class C3904b implements Executor {
        C3904b() {
        }

        public void execute(Runnable runnable) {
            C3902a.m13112c().mo13971a(runnable);
        }
    }

    static {
        new C3903a();
    }

    private C3902a() {
    }

    /* renamed from: c */
    public static C3902a m13112c() {
        if (f9680c != null) {
            return f9680c;
        }
        synchronized (C3902a.class) {
            if (f9680c == null) {
                f9680c = new C3902a();
            }
        }
        return f9680c;
    }

    /* renamed from: a */
    public void mo13971a(Runnable runnable) {
        this.f9682a.mo13971a(runnable);
    }

    /* renamed from: b */
    public void mo13973b(Runnable runnable) {
        this.f9682a.mo13973b(runnable);
    }

    /* renamed from: b */
    public static Executor m13111b() {
        return f9681d;
    }

    /* renamed from: a */
    public boolean mo13972a() {
        return this.f9682a.mo13972a();
    }
}
