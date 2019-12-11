package p161f.p162a;

import android.util.Base64;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;

/* renamed from: f.a.h5 */
public abstract class C4466h5 implements C4641z4 {

    /* renamed from: d */
    private static final String f11092d = C1557c.m7461a(C4466h5.class);

    /* renamed from: a */
    private long f11093a;

    /* renamed from: b */
    private long f11094b;

    /* renamed from: c */
    private C4432e1 f11095c;

    protected C4466h5() {
        this.f11094b = C4472i3.m15487c();
        this.f11093a = this.f11094b / 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15613a(String str) {
        if (C1563i.m7490d(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            String str2 = f11092d;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected error decoding Base64 encoded campaign Id ");
            sb.append(str);
            C1557c.m7470c(str2, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: c */
    public long mo15614c() {
        return this.f11093a;
    }

    /* renamed from: e */
    public C4432e1 mo15615e() {
        return this.f11095c;
    }

    /* renamed from: g */
    public long mo15616g() {
        return this.f11094b;
    }

    protected C4466h5(C4432e1 e1Var) {
        this();
        this.f11095c = e1Var;
    }
}
