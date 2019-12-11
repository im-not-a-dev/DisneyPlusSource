package com.bamtechmedia.dominguez.about.p052r;

import com.bamtechmedia.dominguez.about.C2262f.C2266d;
import com.bamtechmedia.dominguez.about.C2277j;
import com.bamtechmedia.dominguez.about.C2285p;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.core.p218n.C5783b.C5784a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/AppConfigSectionFactory;", "", "sectionFactory", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "navigation", "Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;", "(Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;)V", "create", "Lcom/xwray/groupie/Group;", "state", "Lcom/bamtechmedia/dominguez/about/AboutViewModel$State;", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.a */
/* compiled from: AppConfigSectionFactory.kt */
public final class C2287a {

    /* renamed from: a */
    private final C2323a f6422a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5773a f6423b;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory$AboutSection;", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.about.r.a$a */
    /* compiled from: AppConfigSectionFactory.kt */
    static final class C2288a extends C12881k implements Function1<C2324a, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C2266d f6424U;

        /* renamed from: c */
        final /* synthetic */ C2287a f6425c;

        /* renamed from: com.bamtechmedia.dominguez.about.r.a$a$a */
        /* compiled from: AppConfigSectionFactory.kt */
        static final class C2289a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2288a f6426c;

            C2289a(C2288a aVar) {
                this.f6426c = aVar;
                super(0);
            }

            public final void invoke() {
                C5784a.m18743a(this.f6426c.f6425c.f6423b, C2277j.f6411V.mo11324a(this.f6426c.f6424U.mo11310c().mo12717a()), null, 2, null);
            }
        }

        C2288a(C2287a aVar, C2266d dVar) {
            this.f6425c = aVar;
            this.f6424U = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11331a(C2324a aVar) {
            aVar.mo11352a(C2285p.about_app_config_current, "Combination of default and remote config", new C2289a(this));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11331a((C2324a) obj);
            return C13145v.f29587a;
        }
    }

    public C2287a(C2323a aVar, C5773a aVar2) {
        this.f6422a = aVar;
        this.f6423b = aVar2;
    }

    /* renamed from: a */
    public final C11847b mo11330a(C2266d dVar) {
        return this.f6422a.mo11350a(C2285p.about_section_config, new C2288a(this, dVar));
    }
}
