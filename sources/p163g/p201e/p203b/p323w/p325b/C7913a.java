package p163g.p201e.p203b.p323w.p325b;

import com.bamtechmedia.dominguez.config.C3524e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p323w.p324a.C7912a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/performance/config/PerformanceConfigImpl;", "Lcom/bamtechmedia/dominguez/performance/api/PerformanceConfig;", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;)V", "traceEnabled", "", "getTraceEnabled", "()Z", "traceEnabled$delegate", "Lkotlin/Lazy;", "performance_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.w.b.a */
/* compiled from: PerformanceConfigImpl.kt */
public final class C7913a implements C7912a {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f17047c = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7913a.class), "traceEnabled", "getTraceEnabled()Z"))};

    /* renamed from: a */
    private final Lazy f17048a = C12763i.m39921a(new C7914a(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3524e f17049b;

    /* renamed from: g.e.b.w.b.a$a */
    /* compiled from: PerformanceConfigImpl.kt */
    static final class C7914a extends C12881k implements Function0<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C7913a f17050c;

        C7914a(C7913a aVar) {
            this.f17050c = aVar;
            super(0);
        }

        public final boolean invoke() {
            Boolean bool = (Boolean) this.f17050c.f17049b.mo12720d("performance", "traceEnabled");
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public C7913a(C3524e eVar) {
        this.f17049b = eVar;
    }

    /* renamed from: a */
    public boolean mo20835a() {
        Lazy lazy = this.f17048a;
        KProperty kProperty = f17047c[0];
        return ((Boolean) lazy.getValue()).booleanValue();
    }
}
