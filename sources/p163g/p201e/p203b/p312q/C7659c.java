package p163g.p201e.p203b.p312q;

import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import com.bamtechmedia.dominguez.config.C3524e;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/GlobalNavConfig;", "", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "isTelevision", "", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Z)V", "defaultTabs", "", "", "getDefaultTabs", "()Ljava/util/List;", "tabs", "getTabs", "Companion", "globalNav_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.c */
/* compiled from: GlobalNavConfig.kt */
public final class C7659c {

    /* renamed from: a */
    private final C3524e f16686a;

    /* renamed from: b */
    private final boolean f16687b;

    /* renamed from: g.e.b.q.c$a */
    /* compiled from: GlobalNavConfig.kt */
    public static final class C7660a {
        private C7660a() {
        }

        public /* synthetic */ C7660a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7660a(null);
    }

    public C7659c(C3524e eVar, boolean z) {
        this.f16686a = eVar;
        this.f16687b = z;
    }

    /* renamed from: b */
    private final List<String> m22651b() {
        if (this.f16687b) {
            return C13185o.m40520c(SubjectTokenTypes.ACCOUNT, "search", "home", "watchlist", "movies", "series", "originals", "settings");
        }
        return C13185o.m40520c("home", "search", "downloads", SubjectTokenTypes.ACCOUNT);
    }

    /* renamed from: a */
    public final List<String> mo20585a() {
        List<String> list = (List) this.f16686a.mo12720d("globalNav", "tabs");
        return list != null ? list : m22651b();
    }
}
