package p602m.p609c.p611g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import p602m.p609c.C13459b;
import p602m.p609c.p610f.C13463a;
import p602m.p609c.p610f.C13465c;
import p602m.p609c.p610f.C13466d;

/* renamed from: m.c.g.f */
/* compiled from: SubstituteLogger */
public class C13472f implements C13459b {

    /* renamed from: U */
    private volatile C13459b f29999U;

    /* renamed from: V */
    private Boolean f30000V;

    /* renamed from: W */
    private Method f30001W;

    /* renamed from: X */
    private C13463a f30002X;

    /* renamed from: Y */
    private Queue<C13466d> f30003Y;

    /* renamed from: Z */
    private final boolean f30004Z;

    /* renamed from: c */
    private final String f30005c;

    public C13472f(String str, Queue<C13466d> queue, boolean z) {
        this.f30005c = str;
        this.f30003Y = queue;
        this.f30004Z = z;
    }

    /* renamed from: e */
    private C13459b m41480e() {
        if (this.f30002X == null) {
            this.f30002X = new C13463a(this, this.f30003Y);
        }
        return this.f30002X;
    }

    /* renamed from: a */
    public void mo34720a(String str) {
        mo34749a().mo34720a(str);
    }

    /* renamed from: b */
    public void mo34725b(String str, Object obj) {
        mo34749a().mo34725b(str, obj);
    }

    /* renamed from: c */
    public void mo34728c(String str) {
        mo34749a().mo34728c(str);
    }

    /* renamed from: d */
    public void mo34732d(String str, Object obj) {
        mo34749a().mo34732d(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13472f.class != obj.getClass()) {
            return false;
        }
        return this.f30005c.equals(((C13472f) obj).f30005c);
    }

    public String getName() {
        return this.f30005c;
    }

    public int hashCode() {
        return this.f30005c.hashCode();
    }

    /* renamed from: a */
    public void mo34722a(String str, Object obj, Object obj2) {
        mo34749a().mo34722a(str, obj, obj2);
    }

    /* renamed from: b */
    public void mo34724b(String str) {
        mo34749a().mo34724b(str);
    }

    /* renamed from: c */
    public void mo34729c(String str, Object obj) {
        mo34749a().mo34729c(str, obj);
    }

    /* renamed from: d */
    public boolean mo34754d() {
        return this.f29999U == null;
    }

    /* renamed from: a */
    public void mo34721a(String str, Object obj) {
        mo34749a().mo34721a(str, obj);
    }

    /* renamed from: b */
    public void mo34726b(String str, Object obj, Object obj2) {
        mo34749a().mo34726b(str, obj, obj2);
    }

    /* renamed from: c */
    public void mo34731c(String str, Throwable th) {
        mo34749a().mo34731c(str, th);
    }

    /* renamed from: a */
    public void mo34723a(String str, Throwable th) {
        mo34749a().mo34723a(str, th);
    }

    /* renamed from: b */
    public void mo34727b(String str, Throwable th) {
        mo34749a().mo34727b(str, th);
    }

    /* renamed from: c */
    public void mo34730c(String str, Object obj, Object obj2) {
        mo34749a().mo34730c(str, obj, obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13459b mo34749a() {
        if (this.f29999U != null) {
            return this.f29999U;
        }
        if (this.f30004Z) {
            return C13468b.f29998c;
        }
        return m41480e();
    }

    /* renamed from: b */
    public boolean mo34752b() {
        Boolean bool = this.f30000V;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f30001W = this.f29999U.getClass().getMethod("log", new Class[]{C13465c.class});
            this.f30000V = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f30000V = Boolean.FALSE;
        }
        return this.f30000V.booleanValue();
    }

    /* renamed from: c */
    public boolean mo34753c() {
        return this.f29999U instanceof C13468b;
    }

    /* renamed from: a */
    public void mo34750a(C13459b bVar) {
        this.f29999U = bVar;
    }

    /* renamed from: a */
    public void mo34751a(C13465c cVar) {
        if (mo34752b()) {
            try {
                this.f30001W.invoke(this.f29999U, new Object[]{cVar});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }
}
