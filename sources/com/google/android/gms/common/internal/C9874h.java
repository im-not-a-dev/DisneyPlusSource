package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9850c.C9851a;
import com.google.android.gms.common.internal.C9850c.C9852b;
import com.google.android.gms.common.internal.C9876i.C9877a;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C9874h<T extends IInterface> extends C9850c<T> implements C9689f, C9877a {

    /* renamed from: B */
    private final C9864d f23133B;

    /* renamed from: C */
    private final Set<Scope> f23134C;

    /* renamed from: D */
    private final Account f23135D;

    protected C9874h(Context context, Looper looper, int i, C9864d dVar, C9700b bVar, C9701c cVar) {
        C9879j a = C9879j.m30789a(context);
        GoogleApiAvailability a2 = GoogleApiAvailability.m30032a();
        C9908u.m30853a(bVar);
        C9700b bVar2 = bVar;
        C9908u.m30853a(cVar);
        this(context, looper, a, a2, i, dVar, bVar2, cVar);
    }

    /* renamed from: a */
    private static C9851a m30771a(C9700b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C9863c0(bVar);
    }

    /* renamed from: b */
    private final Set<Scope> m30773b(Set<Scope> set) {
        mo25376a(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final C9864d mo25375C() {
        return this.f23133B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<Scope> mo25376a(Set<Scope> set) {
        return set;
    }

    /* renamed from: i */
    public int mo24962i() {
        return super.mo24962i();
    }

    /* renamed from: r */
    public final Account mo25330r() {
        return this.f23135D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Set<Scope> mo25335w() {
        return this.f23134C;
    }

    /* renamed from: a */
    private static C9852b m30772a(C9701c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C9867d0(cVar);
    }

    protected C9874h(Context context, Looper looper, C9879j jVar, GoogleApiAvailability googleApiAvailability, int i, C9864d dVar, C9700b bVar, C9701c cVar) {
        super(context, looper, jVar, googleApiAvailability, i, m30771a(bVar), m30772a(cVar), dVar.mo25361g());
        this.f23133B = dVar;
        this.f23135D = dVar.mo25353a();
        Set<Scope> d = dVar.mo25358d();
        m30773b(d);
        this.f23134C = d;
    }
}
