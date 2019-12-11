package com.bamtechmedia.dominguez.core.p087h;

import android.app.Application;
import android.os.Trace;
import com.bamtechmedia.dominguez.core.p087h.C3824a.C3825a;
import java.util.Comparator;
import java.util.Set;
import kotlin.Metadata;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/app/DispatchingInitializationAction;", "Lcom/bamtechmedia/dominguez/core/app/AppInitializationAction;", "actions", "", "(Ljava/util/Set;)V", "getActions", "()Ljava/util/Set;", "onApplicationCreate", "", "application", "Landroid/app/Application;", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.h.e */
/* compiled from: DispatchingInitializationAction.kt */
public final class C3829e implements C3824a {

    /* renamed from: a */
    private final Set<C3824a> f9515a;

    /* renamed from: com.bamtechmedia.dominguez.core.h.e$a */
    /* compiled from: Comparisons.kt */
    public static final class C3830a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C13206b.m40622a(Integer.valueOf(((C3824a) t).mo11494a()), Integer.valueOf(((C3824a) t2).mo11494a()));
        }
    }

    public C3829e(Set<? extends C3824a> set) {
        this.f9515a = set;
    }

    /* renamed from: a */
    public int mo11494a() {
        return C3825a.m12913a(this);
    }

    /* renamed from: a */
    public void mo11495a(Application application) {
        for (C3824a aVar : C13199w.m40562a((Iterable) C13199w.m40606q(this.f9515a), (Comparator) new C3830a())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing: ");
            sb.append(aVar);
            Timber.m44529c(sb.toString(), new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Init ");
            sb2.append(aVar.getClass().getSimpleName());
            Trace.beginSection(sb2.toString());
            aVar.mo11495a(application);
            Trace.endSection();
        }
    }
}
