package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: f.a.s2 */
public class C4577s2 implements C4630y2 {

    /* renamed from: d */
    private static final String f11387d = C1557c.m7461a(C4577s2.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4630y2 f11388a;

    /* renamed from: b */
    private final ThreadPoolExecutor f11389b;

    /* renamed from: c */
    private boolean f11390c = false;

    /* renamed from: f.a.s2$a */
    class C4578a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C4432e1 f11392c;

        C4578a(C4432e1 e1Var) {
            this.f11392c = e1Var;
        }

        public void run() {
            C4577s2.this.f11388a.mo15464a(this.f11392c);
        }
    }

    /* renamed from: f.a.s2$b */
    class C4579b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ List f11394c;

        C4579b(List list) {
            this.f11394c = list;
        }

        public void run() {
            C4577s2.this.f11388a.mo15465a(this.f11394c);
        }
    }

    /* renamed from: f.a.s2$c */
    class C4580c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ List f11396c;

        C4580c(List list) {
            this.f11396c = list;
        }

        public void run() {
            C4577s2.this.f11388a.mo15467b(this.f11396c);
        }
    }

    /* renamed from: f.a.s2$d */
    class C4581d implements Callable<Collection<C4432e1>> {
        C4581d() {
        }

        /* renamed from: a */
        public Collection<C4432e1> call() {
            return C4577s2.this.f11388a.mo15463a();
        }
    }

    public C4577s2(C4630y2 y2Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f11388a = y2Var;
        this.f11389b = threadPoolExecutor;
    }

    /* renamed from: b */
    public void mo15467b(List<C4432e1> list) {
        if (this.f11390c) {
            String str = f11387d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not deleting events: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        this.f11389b.execute(new C4580c(list));
    }

    /* renamed from: d */
    public synchronized void mo15468d() {
        C1557c.m7473e(f11387d, "Setting this provider and internal storage provider to closed. Cancelling all queued storage provider work.");
        this.f11390c = true;
        this.f11388a.mo15468d();
        this.f11389b.shutdownNow();
    }

    @Deprecated
    /* renamed from: a */
    public void mo15464a(C4432e1 e1Var) {
        if (this.f11390c) {
            String str = f11387d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not adding event: ");
            sb.append(e1Var);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        this.f11389b.execute(new C4578a(e1Var));
    }

    /* renamed from: a */
    public void mo15465a(List<C4432e1> list) {
        if (this.f11390c) {
            String str = f11387d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not adding events: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        this.f11389b.execute(new C4579b(list));
    }

    /* renamed from: a */
    public synchronized Collection<C4432e1> mo15463a() {
        if (this.f11390c) {
            C1557c.m7473e(f11387d, "Storage provider is closed. Not getting all events.");
            return null;
        }
        try {
            return (Collection) this.f11389b.submit(new C4581d()).get();
        } catch (Exception e) {
            throw new RuntimeException("Error while trying to asynchronously get all events.", e);
        }
    }
}
