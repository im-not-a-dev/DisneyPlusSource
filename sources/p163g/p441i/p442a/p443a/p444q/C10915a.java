package p163g.p441i.p442a.p443a.p444q;

import java.io.IOException;
import java.math.BigDecimal;
import net.danlew.android.joda.DateUtils;
import p163g.p441i.p442a.p443a.C10903f;
import p163g.p441i.p442a.p443a.C10903f.C10904a;
import p163g.p441i.p442a.p443a.C10909k;
import p163g.p441i.p442a.p443a.C10910l;
import p163g.p441i.p442a.p443a.p446s.C10924a;
import p163g.p441i.p442a.p443a.p446s.C10926c;

/* renamed from: g.i.a.a.q.a */
/* compiled from: GeneratorBase */
public abstract class C10915a extends C10903f {

    /* renamed from: U */
    protected C10910l f25899U;

    /* renamed from: V */
    protected int f25900V;

    /* renamed from: W */
    protected boolean f25901W;

    /* renamed from: X */
    protected C10926c f25902X;

    static {
        C10904a.WRITE_NUMBERS_AS_STRINGS.mo28069b();
        C10904a.ESCAPE_NON_ASCII.mo28069b();
        C10904a.STRICT_DUPLICATE_DETECTION.mo28069b();
    }

    protected C10915a(int i, C10910l lVar) {
        this.f25900V = i;
        this.f25899U = lVar;
        this.f25902X = C10926c.m34500a(C10904a.STRICT_DUPLICATE_DETECTION.mo28068a(i) ? C10924a.m34489a((C10903f) this) : null);
        this.f25901W = C10904a.WRITE_NUMBERS_AS_STRINGS.mo28068a(i);
    }

    /* renamed from: a */
    public final boolean mo28102a(C10904a aVar) {
        return (aVar.mo28069b() & this.f25900V) != 0;
    }

    /* renamed from: b */
    public void mo28054b(Object obj) throws IOException {
        if (obj == null) {
            mo28057d();
        } else {
            C10910l lVar = this.f25899U;
            if (lVar != null) {
                lVar.mo28088a(this, obj);
                return;
            }
            mo28041a(obj);
        }
    }

    public void close() throws IOException {
    }

    /* renamed from: g */
    public C10909k mo28104g() {
        return this.f25902X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo28101a(int i, int i2) throws IOException {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + DateUtils.FORMAT_ABBREV_MONTH + (i2 - 56320);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Incomplete surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i2));
        mo28059e(sb.toString());
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28103b(BigDecimal bigDecimal) throws IOException {
        if (!C10904a.WRITE_BIGDECIMAL_AS_PLAIN.mo28068a(this.f25900V)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        mo28059e(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), Integer.valueOf(9999), Integer.valueOf(9999)}));
        throw null;
    }
}
