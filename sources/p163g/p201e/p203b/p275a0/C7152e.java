package p163g.p201e.p203b.p275a0;

import com.bamtechmedia.dominguez.config.C3524e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0019\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\fHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/RipcutConfig;", "", "appConfigMap", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;)V", "defaultScalingAlgorithm", "", "getDefaultScalingAlgorithm", "()Ljava/lang/String;", "defaultScalingAlgorithm$delegate", "Lkotlin/Lazy;", "imageFadeDurationMs", "", "getImageFadeDurationMs", "()Ljava/lang/Integer;", "imageFadeDurationMs$delegate", "preferRgb565BelowMemory", "", "getPreferRgb565BelowMemory", "()J", "preferRgb565BelowMemory$delegate", "preferRgb565BelowSdk", "getPreferRgb565BelowSdk", "()I", "preferRgb565BelowSdk$delegate", "component1", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.a0.e */
/* compiled from: RipcutConfig.kt */
public final class C7152e {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f15802f;

    /* renamed from: a */
    private final Lazy f15803a = C12763i.m39921a(new C7154b(this));

    /* renamed from: b */
    private final Lazy f15804b = C12763i.m39921a(new C7155c(this));

    /* renamed from: c */
    private final Lazy f15805c = C12763i.m39921a(new C7156d(this));

    /* renamed from: d */
    private final Lazy f15806d = C12763i.m39921a(new C7157e(this));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3524e f15807e;

    /* renamed from: g.e.b.a0.e$a */
    /* compiled from: RipcutConfig.kt */
    public static final class C7153a {
        private C7153a() {
        }

        public /* synthetic */ C7153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.a0.e$b */
    /* compiled from: RipcutConfig.kt */
    static final class C7154b extends C12881k implements Function0<String> {

        /* renamed from: c */
        final /* synthetic */ C7152e f15808c;

        C7154b(C7152e eVar) {
            this.f15808c = eVar;
            super(0);
        }

        public final String invoke() {
            String str = (String) this.f15808c.f15807e.mo12720d("ripcutDefaultScalingAlgorithm", new String[0]);
            if (str == null || !(!C12832w.m40118a(str))) {
                return null;
            }
            return str;
        }
    }

    /* renamed from: g.e.b.a0.e$c */
    /* compiled from: RipcutConfig.kt */
    static final class C7155c extends C12881k implements Function0<Integer> {

        /* renamed from: c */
        final /* synthetic */ C7152e f15809c;

        C7155c(C7152e eVar) {
            this.f15809c = eVar;
            super(0);
        }

        public final Integer invoke() {
            return this.f15809c.f15807e.mo12719c("imageFadeDurationMs", new String[0]);
        }
    }

    /* renamed from: g.e.b.a0.e$d */
    /* compiled from: RipcutConfig.kt */
    static final class C7156d extends C12881k implements Function0<Long> {

        /* renamed from: c */
        final /* synthetic */ C7152e f15810c;

        C7156d(C7152e eVar) {
            this.f15810c = eVar;
            super(0);
        }

        public final long invoke() {
            Long a = this.f15810c.f15807e.mo12716a("ripcut", "preferRgb565BelowMemory");
            if (a != null) {
                return a.longValue();
            }
            return 1073741824;
        }
    }

    /* renamed from: g.e.b.a0.e$e */
    /* compiled from: RipcutConfig.kt */
    static final class C7157e extends C12881k implements Function0<Integer> {

        /* renamed from: c */
        final /* synthetic */ C7152e f15811c;

        C7157e(C7152e eVar) {
            this.f15811c = eVar;
            super(0);
        }

        public final int invoke() {
            Integer c = this.f15811c.f15807e.mo12719c("ripcut", "preferRgb565BelowSdk");
            if (c != null) {
                return c.intValue();
            }
            return 21;
        }
    }

    static {
        Class<C7152e> cls = C7152e.class;
        f15802f = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "defaultScalingAlgorithm", "getDefaultScalingAlgorithm()Ljava/lang/String;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "imageFadeDurationMs", "getImageFadeDurationMs()Ljava/lang/Integer;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "preferRgb565BelowMemory", "getPreferRgb565BelowMemory()J")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "preferRgb565BelowSdk", "getPreferRgb565BelowSdk()I"))};
        new C7153a(null);
    }

    public C7152e(C3524e eVar) {
        this.f15807e = eVar;
    }

    /* renamed from: a */
    public final String mo19973a() {
        Lazy lazy = this.f15803a;
        KProperty kProperty = f15802f[0];
        return (String) lazy.getValue();
    }

    /* renamed from: b */
    public final Integer mo19974b() {
        Lazy lazy = this.f15804b;
        KProperty kProperty = f15802f[1];
        return (Integer) lazy.getValue();
    }

    /* renamed from: c */
    public final long mo19975c() {
        Lazy lazy = this.f15805c;
        KProperty kProperty = f15802f[2];
        return ((Number) lazy.getValue()).longValue();
    }

    /* renamed from: d */
    public final int mo19976d() {
        Lazy lazy = this.f15806d;
        KProperty kProperty = f15802f[3];
        return ((Number) lazy.getValue()).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f15807e, (java.lang.Object) ((p163g.p201e.p203b.p275a0.C7152e) r2).f15807e) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p163g.p201e.p203b.p275a0.C7152e
            if (r0 == 0) goto L_0x0013
            g.e.b.a0.e r2 = (p163g.p201e.p203b.p275a0.C7152e) r2
            com.bamtechmedia.dominguez.config.e r0 = r1.f15807e
            com.bamtechmedia.dominguez.config.e r2 = r2.f15807e
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p275a0.C7152e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3524e eVar = this.f15807e;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RipcutConfig(appConfigMap=");
        sb.append(this.f15807e);
        sb.append(")");
        return sb.toString();
    }
}
