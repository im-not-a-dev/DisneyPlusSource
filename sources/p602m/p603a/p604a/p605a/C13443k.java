package p602m.p603a.p604a.p605a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: m.a.a.a.k */
/* compiled from: Options */
public class C13443k implements Serializable {

    /* renamed from: U */
    private Map f29947U = new HashMap();

    /* renamed from: V */
    private List f29948V = new ArrayList();

    /* renamed from: W */
    private Map f29949W = new HashMap();

    /* renamed from: c */
    private Map f29950c = new HashMap();

    /* renamed from: a */
    public C13443k mo34688a(C13440h hVar) {
        String d = hVar.mo34666d();
        if (hVar.mo34676l()) {
            this.f29947U.put(hVar.mo34667e(), hVar);
        }
        if (hVar.mo34679o()) {
            if (this.f29948V.contains(d)) {
                List list = this.f29948V;
                list.remove(list.indexOf(d));
            }
            this.f29948V.add(d);
        }
        this.f29950c.put(d, hVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List mo34689b() {
        return new ArrayList(this.f29950c.values());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ Options: [ short ");
        stringBuffer.append(this.f29950c.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.f29947U);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public boolean mo34691b(String str) {
        String b = C13447o.m41363b(str);
        return this.f29950c.containsKey(b) || this.f29947U.containsKey(b);
    }

    /* renamed from: b */
    public C13441i mo34690b(C13440h hVar) {
        return (C13441i) this.f29949W.get(hVar.mo34666d());
    }

    /* renamed from: a */
    public List mo34686a() {
        return this.f29948V;
    }

    /* renamed from: a */
    public C13440h mo34687a(String str) {
        String b = C13447o.m41363b(str);
        if (this.f29950c.containsKey(b)) {
            return (C13440h) this.f29950c.get(b);
        }
        return (C13440h) this.f29947U.get(b);
    }
}
