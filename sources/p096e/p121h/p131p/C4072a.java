package p096e.p121h.p131p;

import android.util.Base64;
import java.util.List;
import p096e.p121h.p134r.C4117i;

/* renamed from: e.h.p.a */
/* compiled from: FontRequest */
public final class C4072a {

    /* renamed from: a */
    private final String f10274a;

    /* renamed from: b */
    private final String f10275b;

    /* renamed from: c */
    private final String f10276c;

    /* renamed from: d */
    private final List<List<byte[]>> f10277d;

    /* renamed from: e */
    private final int f10278e = 0;

    /* renamed from: f */
    private final String f10279f;

    public C4072a(String str, String str2, String str3, List<List<byte[]>> list) {
        C4117i.m14095a(str);
        this.f10274a = str;
        C4117i.m14095a(str2);
        this.f10275b = str2;
        C4117i.m14095a(str3);
        this.f10276c = str3;
        C4117i.m14095a(list);
        this.f10277d = list;
        StringBuilder sb = new StringBuilder(this.f10274a);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.f10275b);
        sb.append(str4);
        sb.append(this.f10276c);
        this.f10279f = sb.toString();
    }

    /* renamed from: a */
    public List<List<byte[]>> mo14594a() {
        return this.f10277d;
    }

    /* renamed from: b */
    public int mo14595b() {
        return this.f10278e;
    }

    /* renamed from: c */
    public String mo14596c() {
        return this.f10279f;
    }

    /* renamed from: d */
    public String mo14597d() {
        return this.f10274a;
    }

    /* renamed from: e */
    public String mo14598e() {
        return this.f10275b;
    }

    /* renamed from: f */
    public String mo14599f() {
        return this.f10276c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.f10274a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f10275b);
        sb2.append(", mQuery: ");
        sb2.append(this.f10276c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f10277d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f10277d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.f10278e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
