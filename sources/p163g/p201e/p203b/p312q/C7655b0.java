package p163g.p201e.p203b.p312q;

import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.C5673a.C5675b;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.profiles.C6761p0;
import com.disney.disneyplus.R;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p299m.p300y.C7576g;
import p163g.p201e.p203b.p312q.C7713w.C7714a;
import p163g.p201e.p203b.p316t.C7775d;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/TvGlobalNavViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavViewModelHelper$State;", "Lcom/bamtechmedia/dominguez/options/OptionsGlobalNavigation;", "profileRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "freeTrialWelcomeDelegate", "Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeDelegate;", "helper", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavViewModelHelper;", "config", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavConfig;", "slugProvider", "Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;Lcom/bamtechmedia/dominguez/core/OfflineState;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeDelegate;Lcom/bamtechmedia/dominguez/globalnav/GlobalNavViewModelHelper;Lcom/bamtechmedia/dominguez/globalnav/GlobalNavConfig;Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;)V", "getConfig", "()Lcom/bamtechmedia/dominguez/globalnav/GlobalNavConfig;", "getHelper", "()Lcom/bamtechmedia/dominguez/globalnav/GlobalNavViewModelHelper;", "getMenuItems", "", "Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyNavigationBar$DisneyMenuItemView;", "showOfflineFlashMessageWithChangeInConnection", "", "startHome", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.b0 */
/* compiled from: TvGlobalNavViewModel.kt */
public final class C7655b0 extends C5741g<C7714a> implements C7775d {

    /* renamed from: U */
    private final C3796d f16678U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C7547h f16679V;

    /* renamed from: W */
    private final C7713w f16680W;

    /* renamed from: X */
    private final C7659c f16681X;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6761p0 f16682c;

    /* renamed from: g.e.b.q.b0$a */
    /* compiled from: TvGlobalNavViewModel.kt */
    static final class C7656a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7655b0 f16683c;

        C7656a(C7655b0 b0Var) {
            this.f16683c = b0Var;
            super(0);
        }

        public final void invoke() {
            this.f16683c.f16682c.mo19487a(false);
        }
    }

    /* renamed from: g.e.b.q.b0$b */
    /* compiled from: TvGlobalNavViewModel.kt */
    static final class C7657b<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C7655b0 f16684c;

        C7657b(C7655b0 b0Var) {
            this.f16684c = b0Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            Intrinsics.checkReturnedValueIsNotNull((Object) bool, "showOfflineMessage");
            if (bool.booleanValue()) {
                this.f16684c.f16679V.mo20489a(C7576g.ERROR, (int) R.string.offline_flash_message);
            }
        }
    }

    /* renamed from: g.e.b.q.b0$c */
    /* compiled from: TvGlobalNavViewModel.kt */
    static final /* synthetic */ class C7658c extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7658c f16685c = new C7658c();

        C7658c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20584a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20584a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01d4, code lost:
        if (r2 != null) goto L_0x01d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7655b0(com.bamtechmedia.dominguez.profiles.C6761p0 r16, com.bamtechmedia.dominguez.core.C3796d r17, p163g.p201e.p203b.p299m.C7547h r18, p163g.p201e.p203b.p298l.C7509h r19, p163g.p201e.p203b.p312q.C7713w r20, p163g.p201e.p203b.p312q.C7659c r21, com.bamtechmedia.dominguez.core.content.collections.C3678l r22, com.bamtechmedia.dominguez.profiles.C6627c1 r23) {
        /*
            r15 = this;
            r0 = r15
            r1 = 0
            r2 = 1
            r15.<init>(r1, r2, r1)
            r1 = r16
            r0.f16682c = r1
            r1 = r17
            r0.f16678U = r1
            r1 = r18
            r0.f16679V = r1
            r1 = r20
            r0.f16680W = r1
            r1 = r21
            r0.f16681X = r1
            g.e.b.q.w r1 = r0.f16680W
            g.n.a.c0 r2 = r15.getViewModelScope()
            g.e.b.q.q r3 = p163g.p201e.p203b.p312q.C7699q.f16743e
            r1.mo20631a(r2, r3)
            g.e.b.q.c r1 = r0.f16681X
            java.util.List r1 = r1.mo20585a()
            java.util.Iterator r1 = r1.iterator()
        L_0x002f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01eb
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            switch(r3) {
                case -1177318867: goto L_0x01ac;
                case -1068259517: goto L_0x0173;
                case -906336856: goto L_0x0143;
                case -905838985: goto L_0x010a;
                case -279939603: goto L_0x00da;
                case -199315262: goto L_0x00a1;
                case 3208415: goto L_0x0072;
                case 1434631203: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x002f
        L_0x0043:
            java.lang.String r3 = "settings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            java.lang.Class<g.e.b.t.l> r4 = p163g.p201e.p203b.p316t.C7784l.class
            r5 = 2131428236(0x7f0b038c, float:1.847811E38)
            r2 = 2131231259(0x7f08021b, float:1.8078594E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2131953008(0x7f130570, float:1.9542475E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r2 = 2131951672(0x7f130038, float:1.9539765E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 480(0x1e0, float:6.73E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x0072:
            java.lang.String r3 = "home"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            java.lang.Class<com.bamtechmedia.dominguez.discover.e> r4 = com.bamtechmedia.dominguez.discover.C6099e.class
            r5 = 2131428238(0x7f0b038e, float:1.8478115E38)
            r2 = 2131231207(0x7f0801e7, float:1.8078488E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2131952994(0x7f130562, float:1.9542446E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r9 = 1
            r2 = 2131951656(0x7f130028, float:1.9539733E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 448(0x1c0, float:6.28E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x00a1:
            java.lang.String r3 = "originals"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            java.lang.Class<g.e.b.u.d> r4 = p163g.p201e.p203b.p318u.C7813d.class
            r5 = 2131428240(0x7f0b0390, float:1.8478119E38)
            r2 = 2131231264(0x7f080220, float:1.8078604E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2131953000(0x7f130568, float:1.9542459E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            g.e.b.u.d$a r2 = p163g.p201e.p203b.p318u.C7813d.f16901k0
            com.bamtechmedia.dominguez.core.content.collections.k r8 = r22.mo13392e()
            android.os.Bundle r10 = r2.mo20719a(r8)
            r9 = 0
            r2 = 2131951661(0x7f13002d, float:1.9539743E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r11 = 0
            r12 = 0
            r13 = 416(0x1a0, float:5.83E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x00da:
            java.lang.String r3 = "watchlist"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            java.lang.Class<g.e.b.e0.i> r4 = p163g.p201e.p203b.p407e0.C10597i.class
            r5 = 2131428244(0x7f0b0394, float:1.8478127E38)
            r2 = 2131231270(0x7f080226, float:1.8078616E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2131953012(0x7f130574, float:1.9542483E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r2 = 2131951674(0x7f13003a, float:1.953977E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 480(0x1e0, float:6.73E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x010a:
            java.lang.String r3 = "series"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            java.lang.Class<g.e.b.s.e> r4 = p163g.p201e.p203b.p315s.C7745e.class
            r5 = 2131428243(0x7f0b0393, float:1.8478125E38)
            r2 = 2131231258(0x7f08021a, float:1.8078592E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2131953006(0x7f13056e, float:1.954247E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            g.e.b.s.e$a r2 = p163g.p201e.p203b.p315s.C7745e.f16813n0
            com.bamtechmedia.dominguez.core.content.collections.k r8 = r22.mo13395g()
            android.os.Bundle r10 = r2.mo20658a(r8)
            r9 = 0
            r2 = 2131951670(0x7f130036, float:1.9539761E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r11 = 0
            r12 = 0
            r13 = 416(0x1a0, float:5.83E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x0143:
            java.lang.String r3 = "search"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            java.lang.Class<com.bamtechmedia.dominguez.search.y> r4 = com.bamtechmedia.dominguez.search.C8068y.class
            r5 = 2131428242(0x7f0b0392, float:1.8478123E38)
            r2 = 2131231252(0x7f080214, float:1.807858E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2131953004(0x7f13056c, float:1.9542467E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r2 = 2131951667(0x7f130033, float:1.9539755E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 480(0x1e0, float:6.73E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x0173:
            java.lang.String r3 = "movies"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            java.lang.Class<g.e.b.s.e> r4 = p163g.p201e.p203b.p315s.C7745e.class
            r5 = 2131428239(0x7f0b038f, float:1.8478117E38)
            r2 = 2131231228(0x7f0801fc, float:1.8078531E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2131952998(0x7f130566, float:1.9542455E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            g.e.b.s.e$a r2 = p163g.p201e.p203b.p315s.C7745e.f16813n0
            com.bamtechmedia.dominguez.core.content.collections.k r8 = r22.mo13391d()
            android.os.Bundle r10 = r2.mo20658a(r8)
            r9 = 0
            r2 = 2131951658(0x7f13002a, float:1.9539737E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r11 = 0
            r12 = 0
            r13 = 416(0x1a0, float:5.83E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x01ac:
            java.lang.String r3 = "account"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            g.e.b.q.w r3 = r0.f16680W
            r4 = 0
            r5 = 2131428241(0x7f0b0391, float:1.847812E38)
            r6 = 0
            r7 = 0
            g.e.b.q.b0$a r11 = new g.e.b.q.b0$a
            r11.<init>(r15)
            r9 = 0
            r10 = 0
            r2 = 2131951664(0x7f130030, float:1.9539749E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            com.bamtechmedia.dominguez.profiles.c0 r2 = r23.mo19287b()
            if (r2 == 0) goto L_0x01d7
            java.lang.String r2 = r2.getProfileName()
            if (r2 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            java.lang.String r2 = "Default"
        L_0x01d9:
            java.lang.String r12 = "user_profile"
            kotlin.Pair r2 = kotlin.C12907r.m40244a(r12, r2)
            java.util.Map r12 = kotlin.p590y.C13170i0.m40332a(r2)
            r13 = 109(0x6d, float:1.53E-43)
            r14 = 0
            p163g.p201e.p203b.p312q.C7713w.m22755a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x01eb:
            r15.m22644A()
            g.n.a.c0 r1 = r15.getViewModelScope()
            r2 = r19
            r2.mo20396a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p312q.C7655b0.<init>(com.bamtechmedia.dominguez.profiles.p0, com.bamtechmedia.dominguez.core.d, g.e.b.m.h, g.e.b.l.h, g.e.b.q.w, g.e.b.q.c, com.bamtechmedia.dominguez.core.content.collections.l, com.bamtechmedia.dominguez.profiles.c1):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [g.e.b.q.b0$c, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [g.e.b.q.c0] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22644A() {
        /*
            r4 = this;
            com.bamtechmedia.dominguez.core.d r0 = r4.f16678U
            io.reactivex.Observable r0 = r0.mo13696k()
            g.n.a.c0 r1 = r4.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30161a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.a0 r0 = (p163g.p503n.p504a.C11786a0) r0
            g.e.b.q.b0$b r1 = new g.e.b.q.b0$b
            r1.<init>(r4)
            g.e.b.q.b0$c r2 = p163g.p201e.p203b.p312q.C7655b0.C7658c.f16685c
            if (r2 == 0) goto L_0x0028
            g.e.b.q.c0 r3 = new g.e.b.q.c0
            r3.<init>(r2)
            r2 = r3
        L_0x0028:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo29915a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p312q.C7655b0.m22644A():void");
    }

    /* renamed from: y */
    public final C7713w mo20581y() {
        return this.f16680W;
    }

    /* renamed from: z */
    public final List<C5675b> mo20582z() {
        return C13199w.m40606q(this.f16680W.mo20629a().keySet());
    }
}
