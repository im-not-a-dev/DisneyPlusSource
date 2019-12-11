package p551j.p552a.p557i.p558f;

/* renamed from: j.a.i.f.c */
/* compiled from: EnvironmentBasedLocator */
public class C12611c implements C12610b {

    /* renamed from: a */
    private final String f29251a;

    public C12611c() {
        this("SENTRY_PROPERTIES_FILE");
    }

    /* renamed from: a */
    public String mo30921a() {
        return System.getenv(this.f29251a);
    }

    public C12611c(String str) {
        this.f29251a = str;
    }
}
