package androidx.work;

import java.util.List;

/* renamed from: androidx.work.g */
/* compiled from: InputMerger */
public abstract class C1033g {

    /* renamed from: a */
    private static final String f4070a = C1034h.m5551a("InputMerger");

    /* renamed from: a */
    public static C1033g m5548a(String str) {
        try {
            return (C1033g) Class.forName(str).newInstance();
        } catch (Exception e) {
            C1034h a = C1034h.m5550a();
            String str2 = f4070a;
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble instantiating + ");
            sb.append(str);
            a.mo5698b(str2, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public abstract Data mo5572a(List<Data> list);
}
