package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.C1032f;
import androidx.work.C1034h;
import androidx.work.C1165k;
import androidx.work.C1166l;
import androidx.work.Operation;
import androidx.work.impl.utils.C1135b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.f */
/* compiled from: WorkContinuationImpl */
public class C1062f extends C1165k {

    /* renamed from: j */
    private static final String f4165j = C1034h.m5551a("WorkContinuationImpl");

    /* renamed from: a */
    private final C1068h f4166a;

    /* renamed from: b */
    private final String f4167b;

    /* renamed from: c */
    private final C1032f f4168c;

    /* renamed from: d */
    private final List<? extends C1166l> f4169d;

    /* renamed from: e */
    private final List<String> f4170e;

    /* renamed from: f */
    private final List<String> f4171f;

    /* renamed from: g */
    private final List<C1062f> f4172g;

    /* renamed from: h */
    private boolean f4173h;

    /* renamed from: i */
    private Operation f4174i;

    C1062f(C1068h hVar, List<? extends C1166l> list) {
        this(hVar, null, C1032f.KEEP, list, null);
    }

    /* renamed from: a */
    public Operation mo5759a() {
        if (!this.f4173h) {
            C1135b bVar = new C1135b(this);
            this.f4166a.mo5780h().mo5939a(bVar);
            this.f4174i = bVar.mo5901b();
        } else {
            C1034h.m5550a().mo5701e(f4165j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f4170e)}), new Throwable[0]);
        }
        return this.f4174i;
    }

    /* renamed from: b */
    public C1032f mo5760b() {
        return this.f4168c;
    }

    /* renamed from: c */
    public List<String> mo5761c() {
        return this.f4170e;
    }

    /* renamed from: d */
    public String mo5762d() {
        return this.f4167b;
    }

    /* renamed from: e */
    public List<C1062f> mo5763e() {
        return this.f4172g;
    }

    /* renamed from: f */
    public List<? extends C1166l> mo5764f() {
        return this.f4169d;
    }

    /* renamed from: g */
    public C1068h mo5765g() {
        return this.f4166a;
    }

    /* renamed from: h */
    public boolean mo5766h() {
        return m5663a(this, new HashSet());
    }

    /* renamed from: i */
    public boolean mo5767i() {
        return this.f4173h;
    }

    /* renamed from: j */
    public void mo5768j() {
        this.f4173h = true;
    }

    C1062f(C1068h hVar, String str, C1032f fVar, List<? extends C1166l> list) {
        this(hVar, str, fVar, list, null);
    }

    C1062f(C1068h hVar, String str, C1032f fVar, List<? extends C1166l> list, List<C1062f> list2) {
        this.f4166a = hVar;
        this.f4167b = str;
        this.f4168c = fVar;
        this.f4169d = list;
        this.f4172g = list2;
        this.f4170e = new ArrayList(this.f4169d.size());
        this.f4171f = new ArrayList();
        if (list2 != null) {
            for (C1062f fVar2 : list2) {
                this.f4171f.addAll(fVar2.f4171f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((C1166l) list.get(i)).mo5951a();
            this.f4170e.add(a);
            this.f4171f.add(a);
        }
    }

    /* renamed from: a */
    private static boolean m5663a(C1062f fVar, Set<String> set) {
        set.addAll(fVar.mo5761c());
        Set a = m5662a(fVar);
        for (String contains : set) {
            if (a.contains(contains)) {
                return true;
            }
        }
        List<C1062f> e = fVar.mo5763e();
        if (e != null && !e.isEmpty()) {
            for (C1062f a2 : e) {
                if (m5663a(a2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.mo5761c());
        return false;
    }

    /* renamed from: a */
    public static Set<String> m5662a(C1062f fVar) {
        HashSet hashSet = new HashSet();
        List<C1062f> e = fVar.mo5763e();
        if (e != null && !e.isEmpty()) {
            for (C1062f c : e) {
                hashSet.addAll(c.mo5761c());
            }
        }
        return hashSet;
    }
}
