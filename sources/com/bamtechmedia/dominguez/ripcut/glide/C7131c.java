package com.bamtechmedia.dominguez.ripcut.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10667n;
import p163g.p413f.p414a.p417r.C10695h;
import p163g.p413f.p414a.p417r.C10703m;
import p163g.p413f.p414a.p420u.C10723a;
import p163g.p413f.p414a.p420u.C10731h;

/* renamed from: com.bamtechmedia.dominguez.ripcut.glide.c */
/* compiled from: GlideRequests */
public class C7131c extends C10667n {
    public C7131c(C10652e eVar, C10695h hVar, C10703m mVar, Context context) {
        super(eVar, hVar, mVar, context);
    }

    /* renamed from: e */
    public C7130b<Bitmap> m21637e() {
        return (C7130b) super.mo19948e();
    }

    /* renamed from: f */
    public C7130b<Drawable> m21639f() {
        return (C7130b) super.mo19949f();
    }

    /* renamed from: a */
    public <ResourceType> C7130b<ResourceType> m21633a(Class<ResourceType> cls) {
        return new C7130b<>(this.f25200c, this, cls, this.f25192U);
    }

    /* renamed from: a */
    public C7130b<Drawable> m21634a(String str) {
        return (C7130b) super.mo19946a(str);
    }

    /* renamed from: a */
    public C7130b<Drawable> m21632a(Uri uri) {
        return (C7130b) super.mo19944a(uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19947a(C10731h hVar) {
        if (hVar instanceof C7129a) {
            super.mo19947a(hVar);
        } else {
            super.mo19947a((C10731h) new C7129a().m21567a((C10723a<?>) hVar));
        }
    }
}
