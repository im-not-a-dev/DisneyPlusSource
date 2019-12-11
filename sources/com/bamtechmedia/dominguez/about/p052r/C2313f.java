package com.bamtechmedia.dominguez.about.p052r;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import androidx.appcompat.app.C0081c.C0082a;
import com.bamtechmedia.dominguez.about.C2258d;
import com.bamtechmedia.dominguez.about.C2279k;
import com.bamtechmedia.dominguez.about.C2285p;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/LocationOverrideHelper;", "", "debugOverrides", "Lcom/bamtechmedia/dominguez/about/PersistedDebugOverrides;", "invalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "fragment", "Lcom/bamtechmedia/dominguez/about/AboutFragment;", "(Lcom/bamtechmedia/dominguez/about/PersistedDebugOverrides;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;Lcom/bamtechmedia/dominguez/about/AboutFragment;)V", "currentValue", "", "showDialog", "", "configMap", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "Companion", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.f */
/* compiled from: LocationOverrideHelper.kt */
public final class C2313f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2279k f6464a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3419l f6465b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2258d f6466c;

    /* renamed from: com.bamtechmedia.dominguez.about.r.f$a */
    /* compiled from: LocationOverrideHelper.kt */
    public static final class C2314a {
        private C2314a() {
        }

        public /* synthetic */ C2314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.r.f$b */
    /* compiled from: LocationOverrideHelper.kt */
    static final class C2315b implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ String[] f6467U;

        /* renamed from: c */
        final /* synthetic */ C2313f f6468c;

        C2315b(C2313f fVar, String[] strArr) {
            this.f6468c = fVar;
            this.f6467U = strArr;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2279k a = this.f6468c.f6464a;
            Object a2 = C13174k.m40369a((Object[]) this.f6467U, i);
            if (!(!Intrinsics.areEqual((Object) (String) a2, (Object) "Disabled"))) {
                a2 = null;
            }
            a.mo11326a((String) a2);
            C3724a.f9310a.mo13579a(Long.valueOf(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(20)));
            this.f6468c.f6465b.mo12598d();
            this.f6468c.f6466c.mo11301p();
        }
    }

    static {
        new C2314a(null);
    }

    public C2313f(C2279k kVar, C3419l lVar, C2258d dVar) {
        this.f6464a = kVar;
        this.f6465b = lVar;
        this.f6466c = dVar;
    }

    /* renamed from: a */
    public final void mo11342a(C3524e eVar) {
        List list = (List) eVar.mo12720d("availableDebugCountryOverrides", new String[0]);
        if (list == null) {
            list = C13185o.m40520c("AU", "CA", "NL", "NZ", "RU", "US");
        }
        Object[] array = C13199w.m40583d((Collection) C13183n.m40498a("Disabled"), (Iterable) list).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            C0082a aVar = new C0082a(this.f6466c.requireContext());
            aVar.mo417a(C2285p.about_location_override_title);
            aVar.mo425a((CharSequence[]) strArr, (OnClickListener) new C2315b(this, strArr));
            aVar.mo426a().show();
            return;
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final String mo11341a() {
        String a = this.f6464a.mo11325a();
        return a != null ? a : "Disabled";
    }
}
