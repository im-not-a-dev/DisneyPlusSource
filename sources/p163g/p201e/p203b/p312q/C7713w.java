package p163g.p201e.p203b.p312q;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.C5673a.C5674a;
import com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.C5673a.C5675b;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7300k;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00015B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u0017\u001a\u00020\u00182\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aH\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\nJ\u0001\u0010\"\u001a\u0004\u0018\u00010\u00142\u0012\b\u0002\u0010#\u001a\f\u0012\u0006\b\u0001\u0012\u00020%\u0018\u00010$2\b\b\u0001\u0010\u001d\u001a\u00020\u001a2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010-2\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002000/¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020\u001fJ\u000e\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00066"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/GlobalNavViewModelHelper;", "", "router", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavRouter;", "deepLinks", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;", "globalNavAccessibilityClass", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavAccessibilityClass;", "(Lcom/bamtechmedia/dominguez/globalnav/GlobalNavRouter;Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;Lcom/bamtechmedia/dominguez/globalnav/GlobalNavAccessibilityClass;)V", "globalNavDeepLinkViewMapper", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavDeepLinkMapper;", "globalNavDeepLinkViewMapper$annotations", "()V", "getGlobalNavDeepLinkViewMapper", "()Lcom/bamtechmedia/dominguez/globalnav/GlobalNavDeepLinkMapper;", "setGlobalNavDeepLinkViewMapper", "(Lcom/bamtechmedia/dominguez/globalnav/GlobalNavDeepLinkMapper;)V", "tabs", "", "Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyNavigationBar$DisneyMenuItemView;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTab;", "getTabs", "()Ljava/util/Map;", "getItemType", "Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyNavigationBar$DisneyMenuItemType;", "icon", "", "(Ljava/lang/Integer;)Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyNavigationBar$DisneyMenuItemType;", "getTab", "id", "initDeepLink", "", "viewModelScope", "Lcom/uber/autodispose/ScopeProvider;", "newTab", "fragment", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "titleId", "contentDescription", "isTopLevel", "", "fragmentArguments", "Landroid/os/Bundle;", "onClick", "Lkotlin/Function0;", "contentDescriptionMap", "", "", "(Ljava/lang/Class;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLandroid/os/Bundle;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTab;", "startInitialTab", "startTabForItem", "tabId", "State", "globalNav_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.w */
/* compiled from: GlobalNavViewModelHelper.kt */
public final class C7713w {

    /* renamed from: a */
    private final Map<C5675b, C7689j> f16765a = new LinkedHashMap();

    /* renamed from: b */
    public C7683e f16766b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7687h f16767c;

    /* renamed from: d */
    private final C7300k f16768d;

    /* renamed from: e */
    private final C7654b f16769e;

    /* renamed from: g.e.b.q.w$a */
    /* compiled from: GlobalNavViewModelHelper.kt */
    public static final class C7714a {

        /* renamed from: a */
        private final int f16770a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7714a) {
                    if (this.f16770a == ((C7714a) obj).f16770a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f16770a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(numActiveDownloads=");
            sb.append(this.f16770a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.q.w$b */
    /* compiled from: GlobalNavViewModelHelper.kt */
    static final class C7715b<T> implements Consumer<HttpUrl> {

        /* renamed from: U */
        final /* synthetic */ C7683e f16771U;

        /* renamed from: c */
        final /* synthetic */ C7713w f16772c;

        C7715b(C7713w wVar, C7683e eVar) {
            this.f16772c = wVar;
            this.f16771U = eVar;
        }

        /* renamed from: a */
        public final void accept(HttpUrl httpUrl) {
            C7687h a = this.f16772c.f16767c;
            C7713w wVar = this.f16772c;
            C7683e eVar = this.f16771U;
            Intrinsics.checkReturnedValueIsNotNull((Object) httpUrl, "it");
            a.mo20601a(wVar.m22756b(eVar.mo20597a(httpUrl)));
        }
    }

    /* renamed from: g.e.b.q.w$c */
    /* compiled from: GlobalNavViewModelHelper.kt */
    static final class C7716c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7716c f16773c = new C7716c();

        C7716c() {
        }

        /* renamed from: a */
        public final void mo20637a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20637a((Throwable) obj);
            throw null;
        }
    }

    public C7713w(C7687h hVar, C7300k kVar, C7654b bVar) {
        this.f16767c = hVar;
        this.f16768d = kVar;
        this.f16769e = bVar;
    }

    /* renamed from: b */
    public final void mo20632b() {
        int i;
        HttpUrl x = this.f16768d.mo20107x();
        if (x != null) {
            C7683e eVar = this.f16766b;
            if (eVar != null) {
                i = eVar.mo20597a(x);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("globalNavDeepLinkViewMapper");
                throw null;
            }
        } else {
            i = C7718y.menu_home;
        }
        this.f16767c.mo20601a(m22756b(i));
    }

    /* renamed from: a */
    public final Map<C5675b, C7689j> mo20629a() {
        return this.f16765a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C7689j m22756b(int i) {
        Object obj;
        boolean z;
        Iterator it = this.f16765a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C5675b) ((Entry) obj).getKey()).mo17507c() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Entry entry = (Entry) obj;
        if (entry != null) {
            C7689j jVar = (C7689j) entry.getValue();
            if (jVar != null) {
                return jVar;
            }
        }
        throw new IllegalArgumentException("This item entry id is not related to a Global Nav tab.");
    }

    /* renamed from: a */
    public final void mo20630a(int i) {
        this.f16767c.mo20601a(m22756b(i));
    }

    /* renamed from: a */
    public final void mo20631a(C11790c0 c0Var, C7683e eVar) {
        this.f16766b = eVar;
        Object a = this.f16768d.mo20105o().mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(c0Var));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C7715b(this, eVar), C7716c.f16773c);
    }

    /* renamed from: a */
    public static /* synthetic */ C7689j m22755a(C7713w wVar, Class cls, int i, Integer num, Integer num2, Integer num3, boolean z, Bundle bundle, Function0 function0, Map map, int i2, Object obj) {
        int i3 = i2;
        return wVar.mo20628a((i3 & 1) != 0 ? null : cls, i, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : num3, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : bundle, (i3 & 128) != 0 ? null : function0, (i3 & 256) != 0 ? C13173j0.m40350a() : map);
    }

    /* renamed from: a */
    public final C7689j mo20628a(Class<? extends Fragment> cls, int i, Integer num, Integer num2, Integer num3, boolean z, Bundle bundle, Function0<C13145v> function0, Map<String, String> map) {
        String str;
        Class<? extends Fragment> cls2 = cls;
        Integer num4 = num2;
        Map<C5675b, C7689j> map2 = this.f16765a;
        C7689j jVar = null;
        if (num4 != null) {
            String a = C5880u.m18936a(num2.intValue());
            if (a != null) {
                String lowerCase = a.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                str = C12832w.m40125f(lowerCase);
            } else {
                throw new C13142s("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str = null;
        }
        C5675b bVar = new C5675b(i, num, str, this.f16769e.mo20580a(num4, num3, map), m22752a(num), function0);
        if (cls2 != null) {
            int i2 = i;
            jVar = new C7689j(cls, z, i, bundle);
        }
        return (C7689j) map2.put(bVar, jVar);
    }

    /* renamed from: a */
    private final C5674a m22752a(Integer num) {
        if (num == null) {
            return C5674a.PROFILE;
        }
        return C5674a.OTHER;
    }
}
