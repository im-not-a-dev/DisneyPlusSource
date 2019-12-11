package com.bamtechmedia.dominguez.analytics;

import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i.C0541c;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.utils.C5861q;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\r¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;", "Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;", "()V", "<set-?>", "", "activePage", "getActivePage", "()Ljava/lang/String;", "activeSection", "getActiveSection", "transactionId", "getTransactionId", "setTransactionId", "(Ljava/lang/String;)V", "registerBackStackListener", "", "fragment", "Landroidx/fragment/app/Fragment;", "replacePlaceholders", "value", "update", "analyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "updateActivePage", "activity", "Landroidx/fragment/app/FragmentActivity;", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.b */
/* compiled from: ActivePageTracker.kt */
public final class C2336b implements C2334a {

    /* renamed from: a */
    private String f6536a = "Unknown Page";

    /* renamed from: b */
    private String f6537b = "Unknown Section";

    /* renamed from: c */
    private String f6538c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.b$a */
    /* compiled from: ActivePageTracker.kt */
    static final class C2337a implements C0541c {

        /* renamed from: U */
        final /* synthetic */ Fragment f6539U;

        /* renamed from: c */
        final /* synthetic */ C2336b f6540c;

        C2337a(C2336b bVar, Fragment fragment) {
            this.f6540c = bVar;
            this.f6539U = fragment;
        }

        /* renamed from: b */
        public final void mo3177b() {
            try {
                C2336b bVar = this.f6540c;
                C0532d requireActivity = this.f6539U.requireActivity();
                Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "fragment.requireActivity()");
                bVar.m8823a(requireActivity);
            } catch (Exception unused) {
                C5861q.m18905a("");
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.b$b */
    /* compiled from: ActivePageTracker.kt */
    static final /* synthetic */ class C2338b extends C12879i implements Function1<C2378m, C13145v> {
        C2338b(C2336b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo11449a(C2378m mVar) {
            ((C2336b) this.receiver).mo11443a(mVar);
        }

        public final String getName() {
            return "update";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C2336b.class);
        }

        public final String getSignature() {
            return "update(Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11449a((C2378m) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.b$c */
    /* compiled from: ActivePageTracker.kt */
    static final /* synthetic */ class C2339c extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C2339c f6541c = new C2339c();

        C2339c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo11450a(Throwable th) {
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
            mo11450a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: b */
    public final String mo11447b() {
        return this.f6537b;
    }

    /* renamed from: c */
    public final String mo11448c() {
        return this.f6538c;
    }

    /* renamed from: a */
    public final String mo11445a() {
        return this.f6536a;
    }

    /* renamed from: a */
    public void mo11443a(C2378m mVar) {
        this.f6536a = mVar.mo11510Y();
        String Z = mVar.mo11511Z();
        if (Z != null) {
            this.f6537b = Z;
        }
        this.f6538c = mVar.mo11513a0();
        StringBuilder sb = new StringBuilder();
        sb.append("Active page: '");
        sb.append(this.f6536a);
        sb.append("', Active Section: '");
        sb.append(this.f6537b);
        sb.append('\'');
        Timber.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public final String mo11446a(String str) {
        return C12832w.m40117a(C12832w.m40117a(str, "{{ANALYTICS_SECTION}}", this.f6537b, false, 4, (Object) null), "{{ANALYTICS_PAGE}}", this.f6536a, false, 4, (Object) null);
    }

    /* renamed from: a */
    public void mo11442a(Fragment fragment) {
        fragment.getChildFragmentManager().mo3151a((C0541c) new C2337a(this, fragment));
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.analytics.b$c] */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.bamtechmedia.dominguez.analytics.c] */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8823a(androidx.fragment.app.C0532d r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.fragment.app.i r1 = r7.getSupportFragmentManager()
            java.lang.String r2 = "supportFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            androidx.fragment.app.Fragment r1 = r1.mo3160f()
        L_0x0012:
            java.lang.String r3 = "candidate.childFragmentManager"
            r4 = 0
            if (r1 == 0) goto L_0x0036
            boolean r5 = r1.isAdded()
            if (r5 == 0) goto L_0x0036
            boolean r5 = r1 instanceof com.bamtechmedia.dominguez.analytics.C2359f0
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r4 = r1
        L_0x0023:
            com.bamtechmedia.dominguez.analytics.f0 r4 = (com.bamtechmedia.dominguez.analytics.C2359f0) r4
            if (r4 == 0) goto L_0x002a
            r0.add(r4)
        L_0x002a:
            androidx.fragment.app.i r1 = r1.getChildFragmentManager()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r3)
            androidx.fragment.app.Fragment r1 = r1.mo3160f()
            goto L_0x0012
        L_0x0036:
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r0)
            java.lang.Object r0 = kotlin.p590y.C13199w.m40591g(r0)
            com.bamtechmedia.dominguez.analytics.f0 r0 = (com.bamtechmedia.dominguez.analytics.C2359f0) r0
            if (r0 == 0) goto L_0x0043
            goto L_0x007d
        L_0x0043:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.fragment.app.i r7 = r7.getSupportFragmentManager()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r2)
            androidx.fragment.app.Fragment r7 = r7.mo3160f()
        L_0x0053:
            if (r7 == 0) goto L_0x0075
            boolean r1 = r7.isAdded()
            if (r1 == 0) goto L_0x0075
            boolean r1 = r7 instanceof com.bamtechmedia.dominguez.analytics.C2413n
            if (r1 != 0) goto L_0x0061
            r1 = r4
            goto L_0x0062
        L_0x0061:
            r1 = r7
        L_0x0062:
            com.bamtechmedia.dominguez.analytics.n r1 = (com.bamtechmedia.dominguez.analytics.C2413n) r1
            if (r1 == 0) goto L_0x0069
            r0.add(r1)
        L_0x0069:
            androidx.fragment.app.i r7 = r7.getChildFragmentManager()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r3)
            androidx.fragment.app.Fragment r7 = r7.mo3160f()
            goto L_0x0053
        L_0x0075:
            java.util.List r7 = kotlin.p590y.C13199w.m40606q(r0)
            java.lang.Object r0 = kotlin.p590y.C13199w.m40591g(r7)
        L_0x007d:
            boolean r7 = r0 instanceof com.bamtechmedia.dominguez.analytics.C2359f0
            if (r7 == 0) goto L_0x00c8
            r7 = r0
            com.bamtechmedia.dominguez.analytics.f0 r7 = (com.bamtechmedia.dominguez.analytics.C2359f0) r7
            io.reactivex.Single r7 = r7.mo11486n()
            if (r0 == 0) goto L_0x00c0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_DESTROY
            com.uber.autodispose.android.lifecycle.b r0 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r0, r1)
            java.lang.String r1 = "AndroidLifecycleScopePro…om(\n    this, untilEvent)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r7 = r7.mo30215a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r0)
            g.n.a.d0 r7 = (p163g.p503n.p504a.C11792d0) r7
            com.bamtechmedia.dominguez.analytics.b$b r0 = new com.bamtechmedia.dominguez.analytics.b$b
            r0.<init>(r6)
            com.bamtechmedia.dominguez.analytics.c r1 = new com.bamtechmedia.dominguez.analytics.c
            r1.<init>(r0)
            com.bamtechmedia.dominguez.analytics.b$c r0 = com.bamtechmedia.dominguez.analytics.C2336b.C2339c.f6541c
            if (r0 == 0) goto L_0x00ba
            com.bamtechmedia.dominguez.analytics.c r2 = new com.bamtechmedia.dominguez.analytics.c
            r2.<init>(r0)
            r0 = r2
        L_0x00ba:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r7.mo29920a(r1, r0)
            goto L_0x00d5
        L_0x00c0:
            kotlin.s r7 = new kotlin.s
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.Fragment"
            r7.<init>(r0)
            throw r7
        L_0x00c8:
            boolean r7 = r0 instanceof com.bamtechmedia.dominguez.analytics.C2413n
            if (r7 == 0) goto L_0x00d5
            com.bamtechmedia.dominguez.analytics.n r0 = (com.bamtechmedia.dominguez.analytics.C2413n) r0
            com.bamtechmedia.dominguez.analytics.m r7 = r0.mo11534e()
            r6.mo11443a(r7)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.C2336b.m8823a(androidx.fragment.app.d):void");
    }
}
