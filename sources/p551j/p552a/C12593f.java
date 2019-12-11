package p551j.p552a;

import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;
import p520io.sentry.event.C12562b;
import p520io.sentry.event.Event.C12558a;
import p520io.sentry.event.p550f.C12576b;
import p520io.sentry.event.p550f.C12582h;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.f */
/* compiled from: SentryUncaughtExceptionHandler */
public class C12593f implements UncaughtExceptionHandler {

    /* renamed from: c */
    private static final C13459b f29217c = C13460c.m41415a(C12591d.class);

    /* renamed from: a */
    private UncaughtExceptionHandler f29218a;

    /* renamed from: b */
    private volatile Boolean f29219b = Boolean.valueOf(true);

    public C12593f(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f29218a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static C12593f m39558a() {
        f29217c.mo34720a("Configuring uncaught exception handler.");
        UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            C13459b bVar = f29217c;
            StringBuilder sb = new StringBuilder();
            sb.append("default UncaughtExceptionHandler class='");
            sb.append(defaultUncaughtExceptionHandler.getClass().getName());
            sb.append("'");
            bVar.mo34720a(sb.toString());
        }
        C12593f fVar = new C12593f(defaultUncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(fVar);
        return fVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (this.f29219b.booleanValue()) {
            f29217c.mo34728c("Uncaught exception received.");
            C12562b bVar = new C12562b();
            bVar.mo30748c(th.getMessage());
            bVar.mo30738a(C12558a.FATAL);
            bVar.mo30739a((C12582h) new C12576b(th));
            try {
                C12589b.m39530a(bVar);
            } catch (Exception e) {
                f29217c.mo34723a("Error sending uncaught exception to Sentry.", (Throwable) e);
            }
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.f29218a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else if (!(th instanceof ThreadDeath)) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in thread \"");
            sb.append(thread.getName());
            sb.append("\" ");
            printStream.print(sb.toString());
            th.printStackTrace(System.err);
        }
    }
}
