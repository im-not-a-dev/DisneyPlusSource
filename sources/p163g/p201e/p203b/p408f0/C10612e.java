package p163g.p201e.p203b.p408f0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import okhttp3.HttpUrl;
import p096e.p110c.p111b.C3918a.C3919a;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p409g0.p410a.C10616a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/web/WebRouterImpl;", "Lcom/bamtechmedia/dominguez/web/WebRouter;", "context", "Landroid/content/Context;", "navigation", "Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;", "router", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "appCanHandle", "", "url", "", "createIntent", "Landroid/content/Intent;", "Lokhttp3/HttpUrl;", "resolveInfo", "Landroid/content/pm/ResolveInfo;", "forceWebIntent", "link", "launchCustomTab", "", "openBrowser", "web_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.f0.e */
/* compiled from: WebRouterImpl.kt */
public final class C10612e implements C10611d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f25053a;

    /* renamed from: b */
    private final C5773a f25054b;

    /* renamed from: c */
    private final C7547h f25055c;

    /* renamed from: g.e.b.f0.e$a */
    /* compiled from: WebRouterImpl.kt */
    static final class C10613a extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: U */
        final /* synthetic */ String f25056U;

        /* renamed from: c */
        final /* synthetic */ C10612e f25057c;

        C10613a(C10612e eVar, String str) {
            this.f25057c = eVar;
            this.f25056U = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo27480a(C0532d dVar) {
            C3919a aVar = new C3919a();
            aVar.mo14006a(C5837i.m18835a(this.f25057c.f25053a, C10616a.themeColorAccent2, null, false, 6, null));
            aVar.mo14007a().mo14005a(dVar, Uri.parse(this.f25056U));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27480a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.f0.e$b */
    /* compiled from: WebRouterImpl.kt */
    static final class C10614b extends C12881k implements Function1<Context, Intent> {

        /* renamed from: c */
        final /* synthetic */ Intent f25058c;

        C10614b(Intent intent) {
            this.f25058c = intent;
            super(1);
        }

        /* renamed from: a */
        public final Intent invoke(Context context) {
            return this.f25058c;
        }
    }

    public C10612e(Context context, C5773a aVar, C7547h hVar) {
        this.f25053a = context;
        this.f25054b = aVar;
        this.f25055c = hVar;
    }

    /* renamed from: b */
    private final Intent m33339b(HttpUrl httpUrl) {
        String httpUrl2 = httpUrl.mo35758i().mo35774b("web.disneyplus.com").mo35772a().toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) httpUrl2, "link.newBuilder().host(\"….com\").build().toString()");
        List queryIntentActivities = this.f25053a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(httpUrl2)), 0);
        Intrinsics.checkReturnedValueIsNotNull((Object) queryIntentActivities, "context.packageManager.q… Uri.parse(queryUrl)), 0)");
        ArrayList<ResolveInfo> arrayList = new ArrayList<>();
        for (Object next : queryIntentActivities) {
            if (true ^ Intrinsics.areEqual((Object) ((ResolveInfo) next).activityInfo.packageName, (Object) this.f25053a.getPackageName())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (ResolveInfo resolveInfo : arrayList) {
            Intrinsics.checkReturnedValueIsNotNull((Object) resolveInfo, "it");
            arrayList2.add(m33337a(httpUrl, resolveInfo));
        }
        if (arrayList2.size() <= 1) {
            return (Intent) C13199w.m40591g((List) arrayList2);
        }
        Intent createChooser = Intent.createChooser((Intent) C13199w.m40589f((List) arrayList2), null);
        Object[] array = C13199w.m40571c((Iterable) arrayList2, 1).toArray(new Intent[0]);
        if (array != null) {
            return createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array);
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public void mo27479a(HttpUrl httpUrl) {
        HttpUrl a = httpUrl.mo35758i().mo35777d("https").mo35772a();
        String httpUrl2 = a.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) httpUrl2, "httpsUrl.toString()");
        if (!m33338a(httpUrl2)) {
            m33340b(httpUrl2);
            return;
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "httpsUrl");
        Intent b = m33339b(a);
        if (b != null) {
            this.f25054b.mo17672b(new C10614b(b));
            return;
        }
        C7547h hVar = this.f25055c;
        C7544a aVar = new C7544a();
        StringBuilder sb = new StringBuilder();
        sb.append("Could not open url ");
        sb.append(httpUrl);
        aVar.mo20475d(sb.toString());
        hVar.mo20491b(aVar.mo20465a());
    }

    /* renamed from: a */
    private final boolean m33338a(String str) {
        List<ResolveInfo> queryIntentActivities = this.f25053a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        Intrinsics.checkReturnedValueIsNotNull((Object) queryIntentActivities, "context.packageManager.q…VIEW, Uri.parse(url)), 0)");
        if ((queryIntentActivities instanceof Collection) && queryIntentActivities.isEmpty()) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (Intrinsics.areEqual((Object) resolveInfo.activityInfo.packageName, (Object) this.f25053a.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final Intent m33337a(HttpUrl httpUrl, ResolveInfo resolveInfo) {
        Intent component = new Intent("android.intent.action.VIEW", Uri.parse(httpUrl.toString())).setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
        Intrinsics.checkReturnedValueIsNotNull((Object) component, "Intent(Intent.ACTION_VIE…eInfo.activityInfo.name))");
        return component;
    }

    /* renamed from: b */
    private final void m33340b(String str) {
        this.f25054b.mo17670a((Function1<? super C0532d, C13145v>) new C10613a<Object,C13145v>(this, str));
    }
}
