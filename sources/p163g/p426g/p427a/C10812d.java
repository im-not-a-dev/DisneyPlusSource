package p163g.p426g.p427a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g.g.a.d */
/* compiled from: ContentMetadata */
public class C10812d {

    /* renamed from: a */
    public String f25553a = null;

    /* renamed from: b */
    public Map<String, String> f25554b;
    @Deprecated

    /* renamed from: c */
    public int f25555c = -1;

    /* renamed from: d */
    public String f25556d = null;

    /* renamed from: e */
    public String f25557e = null;

    /* renamed from: f */
    public String f25558f = null;

    /* renamed from: g */
    public String f25559g = null;

    /* renamed from: h */
    public boolean f25560h = false;

    /* renamed from: i */
    public C10813a f25561i = C10813a.UNKNOWN;

    /* renamed from: j */
    public int f25562j = -1;

    /* renamed from: k */
    public int f25563k = -1;

    /* renamed from: g.g.a.d$a */
    /* compiled from: ContentMetadata */
    public enum C10813a {
        UNKNOWN,
        LIVE,
        VOD
    }

    public C10812d() {
    }

    public C10812d(C10812d dVar) {
        if (dVar != null) {
            this.f25553a = dVar.f25553a;
            this.f25555c = dVar.f25555c;
            this.f25556d = dVar.f25556d;
            this.f25562j = dVar.f25562j;
            this.f25563k = dVar.f25563k;
            this.f25561i = dVar.f25561i;
            this.f25558f = dVar.f25558f;
            this.f25559g = dVar.f25559g;
            this.f25560h = dVar.f25560h;
            this.f25557e = dVar.f25557e;
            Map<String, String> map = dVar.f25554b;
            if (map != null && !map.isEmpty()) {
                this.f25554b = new HashMap(dVar.f25554b);
            }
        }
    }
}
