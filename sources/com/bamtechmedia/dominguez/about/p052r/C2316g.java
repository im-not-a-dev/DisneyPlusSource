package com.bamtechmedia.dominguez.about.p052r;

import android.content.Context;
import com.bamtech.sdk4.session.SessionAccountInfo;
import com.bamtech.sdk4.session.SessionEntitlement;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.about.C2262f.C2266d;
import com.bamtechmedia.dominguez.about.C2285p;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/SessionInfoSectionFactory;", "", "itemsFactory", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "context", "Landroid/content/Context;", "(Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;Landroid/content/Context;)V", "create", "Lcom/xwray/groupie/Group;", "state", "Lcom/bamtechmedia/dominguez/about/AboutViewModel$State;", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.g */
/* compiled from: SessionInfoSectionFactory.kt */
public final class C2316g {

    /* renamed from: a */
    private final C2323a f6469a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f6470b;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory$AboutSection;", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.about.r.g$a */
    /* compiled from: SessionInfoSectionFactory.kt */
    static final class C2317a extends C12881k implements Function1<C2324a, C13145v> {

        /* renamed from: U */
        final /* synthetic */ SessionInfo f6471U;

        /* renamed from: c */
        final /* synthetic */ C2316g f6472c;

        /* renamed from: com.bamtechmedia.dominguez.about.r.g$a$a */
        /* compiled from: SessionInfoSectionFactory.kt */
        static final class C2318a extends C12881k implements Function1<SessionEntitlement, String> {

            /* renamed from: c */
            public static final C2318a f6473c = new C2318a();

            C2318a() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(SessionEntitlement sessionEntitlement) {
                return sessionEntitlement.getName();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.g$a$b */
        /* compiled from: SessionInfoSectionFactory.kt */
        static final class C2319b extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2317a f6474c;

            C2319b(C2317a aVar) {
                this.f6474c = aVar;
                super(0);
            }

            public final void invoke() {
                Context a = this.f6474c.f6472c.f6470b;
                StringBuilder sb = new StringBuilder();
                sb.append("AccountId: ");
                SessionAccountInfo account = this.f6474c.f6471U.getAccount();
                sb.append(account != null ? account.getId() : null);
                C2312e.m8754a(a, sb.toString());
            }
        }

        C2317a(C2316g gVar, SessionInfo sessionInfo) {
            this.f6472c = gVar;
            this.f6471U = sessionInfo;
            super(1);
        }

        /* renamed from: a */
        public final void mo11345a(C2324a aVar) {
            C2324a.m8769a(aVar, C2285p.about_session_id, this.f6471U.getId(), null, 4, null);
            C2324a.m8769a(aVar, C2285p.about_session_country, String.valueOf(this.f6471U.getLocation().getCountryCode()), null, 4, null);
            C2324a.m8769a(aVar, C2285p.about_session_entitlements, C13199w.m40559a(this.f6471U.getEntitlements(), ", ", null, null, 0, null, C2318a.f6473c, 30, null), null, 4, null);
            int i = C2285p.about_session_account_id;
            SessionAccountInfo account = this.f6471U.getAccount();
            aVar.mo11352a(i, String.valueOf(account != null ? account.getId() : null), new C2319b(this));
            C2324a.m8769a(aVar, C2285p.about_session_supported_location, String.valueOf(this.f6471U.getInSupportedLocation()), null, 4, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11345a((C2324a) obj);
            return C13145v.f29587a;
        }
    }

    public C2316g(C2323a aVar, Context context) {
        this.f6469a = aVar;
        this.f6470b = context;
    }

    /* renamed from: a */
    public final C11847b mo11344a(C2266d dVar) {
        SessionInfo d = dVar.mo11311d();
        if (d != null) {
            return this.f6469a.mo11350a(C2285p.about_section_session_info, new C2317a(this, d));
        }
        return null;
    }
}
