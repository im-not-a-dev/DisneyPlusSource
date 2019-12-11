package p163g.p441i.p442a.p443a.p446s;

import java.util.HashSet;
import p163g.p441i.p442a.p443a.C10903f;
import p163g.p441i.p442a.p443a.C10906h;

/* renamed from: g.i.a.a.s.a */
/* compiled from: DupDetector */
public class C10924a {

    /* renamed from: a */
    protected final Object f25933a;

    /* renamed from: b */
    protected String f25934b;

    /* renamed from: c */
    protected String f25935c;

    /* renamed from: d */
    protected HashSet<String> f25936d;

    private C10924a(Object obj) {
        this.f25933a = obj;
    }

    /* renamed from: a */
    public static C10924a m34489a(C10903f fVar) {
        return new C10924a(fVar);
    }

    /* renamed from: b */
    public Object mo28134b() {
        return this.f25933a;
    }

    /* renamed from: c */
    public void mo28135c() {
        this.f25934b = null;
        this.f25935c = null;
        this.f25936d = null;
    }

    /* renamed from: a */
    public C10924a mo28132a() {
        return new C10924a(this.f25933a);
    }

    /* renamed from: a */
    public boolean mo28133a(String str) throws C10906h {
        String str2 = this.f25934b;
        if (str2 == null) {
            this.f25934b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.f25935c;
            if (str3 == null) {
                this.f25935c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.f25936d == null) {
                    this.f25936d = new HashSet<>(16);
                    this.f25936d.add(this.f25934b);
                    this.f25936d.add(this.f25935c);
                }
                return !this.f25936d.add(str);
            }
        }
    }
}
