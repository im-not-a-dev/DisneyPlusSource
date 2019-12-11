package p163g.p201e.p203b.p286j;

import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p408f0.C10611d;

/* renamed from: g.e.b.j.p */
/* compiled from: UnauthenicatedDeepLinkHandlerImpl.kt */
public final class C7305p implements C7304o {

    /* renamed from: a */
    private final C10611d f16057a;

    /* renamed from: b */
    private final C7296g f16058b;

    /* renamed from: c */
    private final C7287b f16059c;

    public C7305p(C10611d dVar, C7296g gVar, C7287b bVar) {
        this.f16057a = dVar;
        this.f16058b = gVar;
        this.f16059c = bVar;
    }

    /* renamed from: a */
    public void mo20112a() {
        HttpUrl x = this.f16058b.mo20107x();
        if (x != null && this.f16059c.mo20098a(x)) {
            this.f16057a.mo27479a(x);
            C7296g gVar = this.f16058b;
            String httpUrl = x.toString();
            String str = "url.toString()";
            C12880j.m40222a((Object) httpUrl, str);
            String str2 = "";
            gVar.mo20104b(httpUrl, str2);
            C7296g gVar2 = this.f16058b;
            String httpUrl2 = x.toString();
            C12880j.m40222a((Object) httpUrl2, str);
            gVar2.mo20103a(httpUrl2, str2);
            this.f16058b.mo20106s();
        }
    }
}
