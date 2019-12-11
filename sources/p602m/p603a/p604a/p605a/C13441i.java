package p602m.p603a.p604a.p605a;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: m.a.a.a.i */
/* compiled from: OptionGroup */
public class C13441i implements Serializable {

    /* renamed from: U */
    private String f29944U;

    /* renamed from: V */
    private boolean f29945V;

    /* renamed from: c */
    private Map f29946c = new HashMap();

    /* renamed from: a */
    public Collection mo34681a() {
        return this.f29946c.values();
    }

    /* renamed from: b */
    public String mo34683b() {
        return this.f29944U;
    }

    /* renamed from: c */
    public boolean mo34684c() {
        return this.f29945V;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = mo34681a().iterator();
        stringBuffer.append("[");
        while (it.hasNext()) {
            C13440h hVar = (C13440h) it.next();
            if (hVar.mo34669f() != null) {
                stringBuffer.append("-");
                stringBuffer.append(hVar.mo34669f());
            } else {
                stringBuffer.append("--");
                stringBuffer.append(hVar.mo34667e());
            }
            stringBuffer.append(" ");
            stringBuffer.append(hVar.mo34664c());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo34682a(C13440h hVar) throws C13431a {
        String str = this.f29944U;
        if (str == null || str.equals(hVar.mo34669f())) {
            this.f29944U = hVar.mo34669f();
            return;
        }
        throw new C13431a(this, hVar);
    }
}
