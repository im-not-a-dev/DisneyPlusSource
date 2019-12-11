package p163g.p201e.p203b.p286j;

import android.content.Intent;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p408f0.C10611d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/deeplink/DeepLinkRouterImpl;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkRouter;", "dispatchingDeepLinkHandler", "Lcom/bamtechmedia/dominguez/deeplink/DispatchingDeepLinkHandler;", "viewModel", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkViewModel;", "config", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkConfig;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "navigation", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;", "webRouter", "Lcom/bamtechmedia/dominguez/web/WebRouter;", "(Lcom/bamtechmedia/dominguez/deeplink/DispatchingDeepLinkHandler;Lcom/bamtechmedia/dominguez/deeplink/DeepLinkViewModel;Lcom/bamtechmedia/dominguez/deeplink/DeepLinkConfig;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;Lcom/bamtechmedia/dominguez/web/WebRouter;)V", "markDeepLinkHandled", "", "deeplinkUrl", "", "deepLinkPageName", "navigateToDeepLink", "rootFragment", "Landroidx/fragment/app/Fragment;", "deepLink", "Lokhttp3/HttpUrl;", "Factory", "deeplink_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.j.f */
/* compiled from: DeepLinkRouterImpl.kt */
public final class C7293f implements C7292e {

    /* renamed from: a */
    private final C7303n f16030a;

    /* renamed from: b */
    private final C7296g f16031b;

    /* renamed from: c */
    private final C7287b f16032c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6667g1 f16033d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5792f f16034e;

    /* renamed from: f */
    private final C10611d f16035f;

    /* renamed from: g.e.b.j.f$a */
    /* compiled from: DeepLinkRouterImpl.kt */
    public static final class C7294a {

        /* renamed from: a */
        private final C7303n f16036a;

        /* renamed from: b */
        private final C7296g f16037b;

        /* renamed from: c */
        private final C6667g1 f16038c;

        /* renamed from: d */
        private final C7287b f16039d;

        /* renamed from: e */
        private final C10611d f16040e;

        public C7294a(C7303n nVar, C7296g gVar, C6667g1 g1Var, C7287b bVar, C10611d dVar) {
            this.f16036a = nVar;
            this.f16037b = gVar;
            this.f16038c = g1Var;
            this.f16039d = bVar;
            this.f16040e = dVar;
        }

        /* renamed from: a */
        public final C7293f mo20100a(C5792f fVar) {
            C7293f fVar2 = new C7293f(this.f16036a, this.f16037b, this.f16039d, this.f16038c, fVar, this.f16040e);
            return fVar2;
        }
    }

    /* renamed from: g.e.b.j.f$b */
    /* compiled from: DeepLinkRouterImpl.kt */
    static final class C7295b extends C12881k implements Function1<Fragment, C13145v> {

        /* renamed from: U */
        final /* synthetic */ Fragment f16041U;

        /* renamed from: V */
        final /* synthetic */ boolean f16042V;

        /* renamed from: W */
        final /* synthetic */ boolean f16043W;

        /* renamed from: X */
        final /* synthetic */ List f16044X;

        /* renamed from: Y */
        final /* synthetic */ Intent f16045Y;

        /* renamed from: c */
        final /* synthetic */ C7293f f16046c;

        C7295b(C7293f fVar, Fragment fragment, boolean z, boolean z2, List list, Intent intent) {
            this.f16046c = fVar;
            this.f16041U = fragment;
            this.f16042V = z;
            this.f16043W = z2;
            this.f16044X = list;
            this.f16045Y = intent;
            super(1);
        }

        /* renamed from: a */
        public final void mo20101a(Fragment fragment) {
            C0564o a = fragment.getChildFragmentManager().mo3147a();
            a.mo3311a(this.f16046c.f16034e.mo17698b(), this.f16041U);
            a.mo3048d(this.f16041U);
            a.mo3030a();
            if (!this.f16042V || !this.f16043W) {
                List<Fragment> list = this.f16044X;
                if (list != null) {
                    for (Fragment fragment2 : list) {
                        C0564o a2 = fragment.getChildFragmentManager().mo3147a();
                        a2.mo3316a(true);
                        a2.mo3318b(this.f16046c.f16034e.mo17698b(), fragment2);
                        a2.mo3048d(fragment2);
                        a2.mo3315a((String) null);
                        a2.mo3030a();
                    }
                    return;
                }
                Intent intent = this.f16045Y;
                if (intent != null) {
                    intent.putExtra("maturityRank", ((C6626c0) this.f16046c.f16033d.mo19381b().mo30224c()).mo19354R());
                    fragment.startActivityForResult(this.f16045Y, 7000);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Deep link can not both start a new fragment and a new activity");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20101a((Fragment) obj);
            return C13145v.f29587a;
        }
    }

    public C7293f(C7303n nVar, C7296g gVar, C7287b bVar, C6667g1 g1Var, C5792f fVar, C10611d dVar) {
        this.f16030a = nVar;
        this.f16031b = gVar;
        this.f16032c = bVar;
        this.f16033d = g1Var;
        this.f16034e = fVar;
        this.f16035f = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20099a(androidx.fragment.app.Fragment r18, okhttp3.HttpUrl r19) {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            g.e.b.j.n r0 = r7.f16030a
            java.util.List r0 = r0.createDeepLinkedFragmentStack(r8)
            if (r0 == 0) goto L_0x000e
        L_0x000c:
            r10 = r0
            goto L_0x001c
        L_0x000e:
            g.e.b.j.n r0 = r7.f16030a
            androidx.fragment.app.Fragment r0 = r0.createDeepLinkedFragment(r8)
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = kotlin.p590y.C13183n.m40498a(r0)
            goto L_0x000c
        L_0x001b:
            r10 = 0
        L_0x001c:
            g.e.b.j.n r0 = r7.f16030a
            android.content.Intent r6 = r0.createDeepLinkedIntent(r8)
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L_0x0028
            r13 = 1
            goto L_0x0029
        L_0x0028:
            r13 = 0
        L_0x0029:
            if (r6 == 0) goto L_0x002d
            r14 = 1
            goto L_0x002e
        L_0x002d:
            r14 = 0
        L_0x002e:
            com.bamtechmedia.dominguez.core.n.f r15 = r7.f16034e
            g.e.b.j.f$b r5 = new g.e.b.j.f$b
            r0 = r5
            r1 = r17
            r2 = r18
            r3 = r13
            r4 = r14
            r9 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.mo17684a(r9)
            java.net.URL r0 = r19.mo35766q()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "deepLink.url().toString()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r11 = 0
        L_0x0054:
            java.lang.String r1 = ""
            if (r13 == 0) goto L_0x007e
            if (r10 == 0) goto L_0x0062
            java.lang.Object r2 = kotlin.p590y.C13199w.m40593h(r10)
            r9 = r2
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            goto L_0x0063
        L_0x0062:
            r9 = 0
        L_0x0063:
            boolean r2 = r9 instanceof com.bamtechmedia.dominguez.analytics.C2413n
            if (r2 != 0) goto L_0x006a
            r16 = 0
            goto L_0x006c
        L_0x006a:
            r16 = r9
        L_0x006c:
            com.bamtechmedia.dominguez.analytics.n r16 = (com.bamtechmedia.dominguez.analytics.C2413n) r16
            if (r16 == 0) goto L_0x009e
            com.bamtechmedia.dominguez.analytics.m r2 = r16.mo11534e()
            if (r2 == 0) goto L_0x009e
            java.lang.String r2 = r2.mo11510Y()
            if (r2 == 0) goto L_0x009e
            r1 = r2
            goto L_0x009e
        L_0x007e:
            if (r14 == 0) goto L_0x0083
            java.lang.String r1 = "Video Player"
            goto L_0x009e
        L_0x0083:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Page Name for "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " not found!"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r12]
            p686n.p687a.Timber.m44532e(r2, r3)
        L_0x009e:
            if (r11 != 0) goto L_0x00b7
            g.e.b.j.b r2 = r7.f16032c
            boolean r2 = r2.mo20098a(r8)
            if (r2 == 0) goto L_0x00b1
            r7.m21914a(r0, r1)
            g.e.b.f0.d r0 = r7.f16035f
            r0.mo27479a(r8)
            goto L_0x00ba
        L_0x00b1:
            g.e.b.j.g r0 = r7.f16031b
            r0.mo20108y()
            goto L_0x00ba
        L_0x00b7:
            r7.m21914a(r0, r1)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p286j.C7293f.mo20099a(androidx.fragment.app.Fragment, okhttp3.HttpUrl):void");
    }

    /* renamed from: a */
    private final void m21914a(String str, String str2) {
        this.f16031b.mo20104b(str, str2);
        this.f16031b.mo20103a(str, str2);
        this.f16031b.mo20106s();
    }
}
