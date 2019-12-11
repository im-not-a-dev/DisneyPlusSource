package p163g.p426g.p436g;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p163g.p426g.p427a.C10790b.C10802l;
import p163g.p426g.p427a.p429j.C10832f;

/* renamed from: g.g.g.m */
/* compiled from: SystemMetadata */
public class C10885m {

    /* renamed from: e */
    public static String f25796e = "androidBuildModel";

    /* renamed from: f */
    public static String f25797f = "operatingSystemVersion";

    /* renamed from: g */
    public static String f25798g = "deviceBrand";

    /* renamed from: h */
    public static String f25799h = "deviceManufacturer";

    /* renamed from: i */
    public static String f25800i = "deviceModel";

    /* renamed from: j */
    public static String f25801j = "deviceType";

    /* renamed from: k */
    public static String f25802k = "deviceVersion";

    /* renamed from: l */
    public static String f25803l = "frameworkName";

    /* renamed from: m */
    public static String f25804m = "frameworkVersion";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10832f f25805a;

    /* renamed from: b */
    private C10875d f25806b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10880i f25807c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<String, String> f25808d = null;

    /* renamed from: g.g.g.m$a */
    /* compiled from: SystemMetadata */
    class C10886a implements Callable<Void> {
        C10886a() {
        }

        public Void call() throws Exception {
            C10885m.this.f25807c.mo27992c("retrieve(): calling MetadataInterface methods");
            if (C10885m.this.f25805a.mo27906h() != null) {
                C10885m.this.f25808d.put(C10885m.f25796e, C10885m.this.f25805a.mo27906h());
            }
            if (C10885m.this.f25805a.mo27901c() != null) {
                C10885m.this.f25808d.put(C10885m.f25797f, C10885m.this.f25805a.mo27901c());
            }
            if (C10885m.this.f25805a.mo27900b() != null) {
                C10885m.this.f25808d.put(C10885m.f25798g, C10885m.this.f25805a.mo27900b());
            }
            if (C10885m.this.f25805a.mo27899a() != null) {
                C10885m.this.f25808d.put(C10885m.f25799h, C10885m.this.f25805a.mo27899a());
            }
            if (C10885m.this.f25805a.mo27903e() != null) {
                C10885m.this.f25808d.put(C10885m.f25800i, C10885m.this.f25805a.mo27903e());
            }
            if (C10885m.this.f25805a.mo27907i() != C10802l.UNKNOWN) {
                C10885m.this.f25808d.put(C10885m.f25801j, C10885m.this.f25805a.mo27907i().toString());
            }
            if (C10885m.this.f25805a.mo27904f() != null) {
                C10885m.this.f25808d.put(C10885m.f25802k, C10885m.this.f25805a.mo27904f());
            }
            if (C10885m.this.f25805a.mo27905g() != null) {
                C10885m.this.f25808d.put(C10885m.f25803l, C10885m.this.f25805a.mo27905g());
            }
            if (C10885m.this.f25805a.mo27902d() != null) {
                C10885m.this.f25808d.put(C10885m.f25804m, C10885m.this.f25805a.mo27902d());
            }
            return null;
        }
    }

    public C10885m(C10880i iVar, C10832f fVar, C10875d dVar) {
        this.f25805a = fVar;
        this.f25806b = dVar;
        this.f25807c = iVar;
    }

    /* renamed from: a */
    public Map<String, String> mo28000a() throws Exception {
        if (this.f25808d == null) {
            mo28001b();
        }
        return this.f25808d;
    }

    /* renamed from: b */
    public void mo28001b() throws Exception {
        this.f25808d = new HashMap();
        this.f25806b.mo27986a((Callable<V>) new C10886a<V>(), "SystemMetadata.retrieve");
        if (this.f25808d.containsKey(f25801j) && ((String) this.f25808d.get(f25801j)) == C10802l.UNKNOWN.toString()) {
            this.f25808d.remove(f25801j);
        }
    }
}
