package com.bamtechmedia.dominguez.auth.p066r0;

import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\r\u001a\u00020\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouterImpl;", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "navigation", "Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "(Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "requestIdRes", "", "getRequestIdRes", "()I", "setRequestIdRes", "(I)V", "showLogOutConfirmDialog", "", "messageOverride", "(Ljava/lang/Integer;I)V", "startLogOutDialog", "isSoftLogout", "", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.r0.k */
/* compiled from: LogOutRouterImpl.kt */
public final class C2811k implements C2809j {

    /* renamed from: a */
    private int f7564a;

    /* renamed from: b */
    private final C5773a f7565b;

    /* renamed from: c */
    private final C7547h f7566c;

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.k$a */
    /* compiled from: LogOutRouterImpl.kt */
    static final class C2812a extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: c */
        final /* synthetic */ boolean f7567c;

        C2812a(boolean z) {
            this.f7567c = z;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
            if (r0 != null) goto L_0x001a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11814a(androidx.fragment.app.C0532d r3) {
            /*
                r2 = this;
                androidx.fragment.app.i r0 = r3.getSupportFragmentManager()
                java.lang.String r1 = "supportFragmentManager"
                kotlin.jvm.internal.C12880j.m40222a(r0, r1)
                androidx.fragment.app.Fragment r0 = r0.mo3160f()
                if (r0 == 0) goto L_0x0016
                androidx.fragment.app.i r0 = r0.getChildFragmentManager()
                if (r0 == 0) goto L_0x0016
                goto L_0x001a
            L_0x0016:
                androidx.fragment.app.i r0 = r3.getSupportFragmentManager()
            L_0x001a:
                java.lang.String r3 = "primaryNavigationFragmen…?: supportFragmentManager"
                kotlin.jvm.internal.C12880j.m40222a(r0, r3)
                com.bamtechmedia.dominguez.auth.r0.e$a r3 = com.bamtechmedia.dominguez.auth.p066r0.C2797e.f7551c0
                boolean r1 = r2.f7567c
                com.bamtechmedia.dominguez.auth.r0.e r3 = r3.mo11809a(r1)
                androidx.fragment.app.o r0 = r0.mo3147a()
                java.lang.String r1 = "LogOutDialogFragment"
                r3.show(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p066r0.C2811k.C2812a.mo11814a(androidx.fragment.app.d):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11814a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    public C2811k(C5773a aVar, C7547h hVar) {
        this.f7565b = aVar;
        this.f7566c = hVar;
    }

    /* renamed from: a */
    public void mo11813a(Integer num, int i) {
        this.f7564a = i;
        C7547h hVar = this.f7566c;
        C7544a aVar = new C7544a();
        aVar.mo20466a(i);
        aVar.mo20484i(Integer.valueOf(C2721j0.log_out_confirmation_title));
        aVar.mo20467a(num);
        aVar.mo20480g(Integer.valueOf(C2721j0.log_out));
        aVar.mo20472c(Integer.valueOf(C2721j0.cancel));
        hVar.mo20491b(aVar.mo20465a());
    }

    /* renamed from: a */
    public void mo11812a(int i, boolean z) {
        if (this.f7564a == i) {
            this.f7564a = 0;
            this.f7565b.mo17670a((Function1<? super C0532d, C13145v>) new C2812a<Object,C13145v>(z));
        }
    }
}
