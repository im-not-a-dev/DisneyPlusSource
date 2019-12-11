package p551j.p552a.p560j;

import java.util.HashSet;
import java.util.Set;
import p520io.sentry.event.Event;
import p551j.p552a.p563m.C12654a;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.j.a */
/* compiled from: AbstractConnection */
public abstract class C12624a implements C12634d {

    /* renamed from: W */
    private static final C13459b f29264W = C13460c.m41415a(C12624a.class);

    /* renamed from: X */
    private static final C13459b f29265X;

    /* renamed from: U */
    private Set<C12637g> f29266U = new HashSet();

    /* renamed from: V */
    private C12640i f29267V = new C12640i();

    /* renamed from: c */
    private final String f29268c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C12624a.class.getName());
        sb.append(".lockdown");
        f29265X = C13460c.m41416a(sb.toString());
    }

    protected C12624a(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry sentry_version=6,sentry_client=");
        sb.append(C12654a.m39689a());
        sb.append(",");
        sb.append("sentry_key=");
        sb.append(str);
        if (!C12677b.m39771a(str2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(",sentry_secret=");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        this.f29268c = sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo30924a() {
        return this.f29268c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo30926b(Event event) throws C12635e;

    /* renamed from: a */
    public final void mo30925a(Event event) throws C12635e {
        try {
            if (!this.f29267V.mo30948a()) {
                mo30926b(event);
                this.f29267V.mo30950b();
                for (C12637g gVar : this.f29266U) {
                    try {
                        gVar.mo30939a(event);
                    } catch (Exception e) {
                        C13459b bVar = f29264W;
                        StringBuilder sb = new StringBuilder();
                        sb.append("An exception occurred while running an EventSendCallback.onSuccess: ");
                        sb.append(gVar.getClass().getName());
                        bVar.mo34727b(sb.toString(), (Throwable) e);
                    }
                }
                return;
            }
            throw new C12641j();
        } catch (C12635e e2) {
            for (C12637g gVar2 : this.f29266U) {
                try {
                    gVar2.mo30940a(event, e2);
                } catch (Exception e3) {
                    C13459b bVar2 = f29264W;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("An exception occurred while running an EventSendCallback.onFailure: ");
                    sb2.append(gVar2.getClass().getName());
                    bVar2.mo34727b(sb2.toString(), (Throwable) e3);
                }
            }
            if (this.f29267V.mo30949a(e2)) {
                C13459b bVar3 = f29265X;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Initiated a temporary lockdown because of exception: ");
                sb3.append(e2.getMessage());
                bVar3.mo34724b(sb3.toString());
            }
            throw e2;
        }
    }
}
