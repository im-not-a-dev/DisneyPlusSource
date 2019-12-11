package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11567t;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.j */
/* compiled from: SqlDateTypeAdapter */
public final class C11641j extends C11571v<Date> {

    /* renamed from: b */
    public static final C11573w f27137b = new C11642a();

    /* renamed from: a */
    private final DateFormat f27138a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: g.j.c.y.l.j$a */
    /* compiled from: SqlDateTypeAdapter */
    static class C11642a implements C11573w {
        C11642a() {
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            if (aVar.mo29701a() == Date.class) {
                return new C11641j();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Date m37485a(C11533a aVar) throws IOException {
        if (aVar.peek() == C11535b.NULL) {
            aVar.mo29478n();
            return null;
        }
        try {
            return new Date(this.f27138a.parse(aVar.mo29479o()).getTime());
        } catch (ParseException e) {
            throw new C11567t((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo29459a(C11536c cVar, Date date) throws IOException {
        cVar.mo29501g(date == null ? null : this.f27138a.format(date));
    }
}
