package p602m.p613d.p614a;

/* renamed from: m.d.a.a2 */
/* compiled from: OIDTokenizer */
public class C13481a2 {

    /* renamed from: a */
    private String f30019a;

    /* renamed from: b */
    private int f30020b = 0;

    public C13481a2(String str) {
        this.f30019a = str;
    }

    /* renamed from: a */
    public boolean mo34777a() {
        return this.f30020b != -1;
    }

    /* renamed from: b */
    public String mo34778b() {
        int i = this.f30020b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.f30019a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.f30019a.substring(this.f30020b);
            this.f30020b = -1;
            return substring;
        }
        String substring2 = this.f30019a.substring(this.f30020b, indexOf);
        this.f30020b = indexOf + 1;
        return substring2;
    }
}
