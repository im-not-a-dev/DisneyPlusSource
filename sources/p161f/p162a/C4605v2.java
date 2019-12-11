package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: f.a.v2 */
public class C4605v2 implements C4630y2 {

    /* renamed from: d */
    private static final String f11471d = C1557c.m7461a(C4605v2.class);

    /* renamed from: a */
    private final C4630y2 f11472a;

    /* renamed from: b */
    private final C4419d f11473b;

    /* renamed from: c */
    private boolean f11474c = false;

    public C4605v2(C4630y2 y2Var, C4419d dVar) {
        this.f11472a = y2Var;
        this.f11473b = dVar;
    }

    /* renamed from: a */
    public void mo15464a(C4432e1 e1Var) {
        if (this.f11474c) {
            String str = f11471d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not adding event: ");
            sb.append(e1Var);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        try {
            this.f11472a.mo15464a(e1Var);
        } catch (Exception e) {
            String str2 = f11471d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to insert event into storage. ");
            sb2.append(e1Var);
            C1557c.m7470c(str2, sb2.toString(), e);
            m16001a(this.f11473b, e);
        }
    }

    /* renamed from: b */
    public void mo15467b(List<C4432e1> list) {
        if (this.f11474c) {
            String str = f11471d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not deleting event: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        try {
            this.f11472a.mo15467b(list);
        } catch (Exception e) {
            String str2 = f11471d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to delete events from storage. ");
            sb2.append(list);
            C1557c.m7470c(str2, sb2.toString(), e);
            m16001a(this.f11473b, e);
        }
    }

    /* renamed from: d */
    public void mo15468d() {
        C1557c.m7473e(f11471d, "Setting this provider and internal storage provider to closed.");
        this.f11474c = true;
        this.f11472a.mo15468d();
    }

    /* renamed from: a */
    public void mo15465a(List<C4432e1> list) {
        if (this.f11474c) {
            String str = f11471d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not adding events: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        try {
            this.f11472a.mo15465a(list);
        } catch (Exception e) {
            String str2 = f11471d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to insert events into storage. ");
            sb2.append(list);
            C1557c.m7470c(str2, sb2.toString(), e);
            m16001a(this.f11473b, e);
        }
    }

    /* renamed from: a */
    public Collection<C4432e1> mo15463a() {
        if (this.f11474c) {
            C1557c.m7473e(f11471d, "Storage provider is closed. Not getting all events.");
            return Collections.emptyList();
        }
        try {
            return this.f11472a.mo15463a();
        } catch (Exception e) {
            C1557c.m7470c(f11471d, "Failed to get all events from storage.", e);
            m16001a(this.f11473b, e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private void m16001a(C4419d dVar, Throwable th) {
        try {
            dVar.mo15485a(new C4618x("A storage exception has occurred. Please view the stack trace for more details.", th), C4618x.class);
        } catch (Exception e) {
            C1557c.m7470c(f11471d, "Failed to log throwable.", e);
        }
    }
}
