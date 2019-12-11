package p163g.p426g.p435f;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: g.g.f.c */
/* compiled from: EventQueue */
public class C10856c {

    /* renamed from: a */
    private List<Map<String, Object>> f25665a;

    /* renamed from: b */
    private int f25666b;

    public C10856c() {
        this.f25665a = null;
        this.f25666b = 0;
        this.f25665a = new ArrayList();
    }

    /* renamed from: a */
    public void mo27933a(String str, Map<String, Object> map, int i) {
        map.put("t", str);
        map.put("st", Integer.valueOf(i));
        map.put("seq", Integer.valueOf(this.f25666b));
        this.f25666b++;
        this.f25665a.add(map);
    }

    /* renamed from: b */
    public int mo27934b() {
        return this.f25665a.size();
    }

    /* renamed from: a */
    public List<Map<String, Object>> mo27932a() {
        List<Map<String, Object>> list = this.f25665a;
        this.f25665a = new ArrayList();
        return list;
    }
}
