package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.b */
final /* synthetic */ class C9646b implements Comparator {

    /* renamed from: c */
    static final Comparator f22655c = new C9646b();

    private C9646b() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).mo25000c().compareTo(((Scope) obj2).mo25000c());
    }
}
