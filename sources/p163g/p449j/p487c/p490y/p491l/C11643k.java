package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.sql.Time;
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

/* renamed from: g.j.c.y.l.k */
/* compiled from: TimeTypeAdapter */
public final class C11643k extends C11571v<Time> {

    /* renamed from: b */
    public static final C11573w f27139b = new C11644a();

    /* renamed from: a */
    private final DateFormat f27140a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: g.j.c.y.l.k$a */
    /* compiled from: TimeTypeAdapter */
    static class C11644a implements C11573w {
        C11644a() {
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            if (aVar.mo29701a() == Time.class) {
                return new C11643k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Time m37490a(C11533a aVar) throws IOException {
        if (aVar.peek() == C11535b.NULL) {
            aVar.mo29478n();
            return null;
        }
        try {
            return new Time(this.f27140a.parse(aVar.mo29479o()).getTime());
        } catch (ParseException e) {
            throw new C11567t((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo29459a(C11536c cVar, Time time) throws IOException {
        cVar.mo29501g(time == null ? null : this.f27140a.format(time));
    }
}
