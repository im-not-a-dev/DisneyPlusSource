package p163g.p174d.p178b.p190h0;

/* renamed from: g.d.b.h0.e */
/* compiled from: TIT2Id3Tag */
public class C5278e extends C5275b {
    public C5278e(byte[] bArr) {
        super("TIT2", m17703a(bArr));
    }

    /* renamed from: a */
    private static String m17703a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return "";
        }
        int i = length - 1;
        if (bArr[i] == 0) {
            return new String(bArr, 0, i);
        }
        return new String(bArr);
    }

    /* renamed from: c */
    public String mo16846c() {
        return (String) mo16841a();
    }

    public C5278e(String str) {
        super("TIT2", str);
    }

    /* renamed from: a */
    public void mo16842a(C5276c cVar) {
        cVar.mo16835a(this);
    }
}
