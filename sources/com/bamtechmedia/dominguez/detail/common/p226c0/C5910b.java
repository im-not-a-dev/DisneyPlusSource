package com.bamtechmedia.dominguez.detail.common.p226c0;

import android.app.Activity;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p299m.C7540c;

/* renamed from: com.bamtechmedia.dominguez.detail.common.c0.b */
/* compiled from: DetailErrorStateHandler.kt */
public final class C5910b {

    /* renamed from: a */
    private final C7540c f13695a;

    public C5910b(C7540c cVar) {
        this.f13695a = cVar;
    }

    /* renamed from: a */
    public final boolean mo17817a(C5909a aVar, Activity activity, boolean z) {
        if (aVar.mo17815b()) {
            m18997a(C7313g.error_medianotallowed_parental_control, activity);
            return true;
        } else if (!aVar.mo17814a() && !aVar.mo17816e()) {
            return false;
        } else {
            m18997a(m18996a(z), activity);
            return true;
        }
    }

    /* renamed from: a */
    private final int m18996a(boolean z) {
        return z ? C7313g.network_error_message : C7313g.error_mediaunavailable;
    }

    /* renamed from: a */
    private final void m18997a(int i, Activity activity) {
        activity.onBackPressed();
        this.f13695a.mo20439a(Integer.valueOf(i), Integer.valueOf(C7313g.btn_ok));
    }
}
