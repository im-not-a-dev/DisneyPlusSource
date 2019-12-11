package com.bamtechmedia.dominguez.profiles;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6770a;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6774b;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6778d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.profiles.q0 */
/* compiled from: ProfilesGlobalNavRouterImpl.kt */
public final class C6765q0 implements C6761p0 {

    /* renamed from: a */
    private final String f15139a = C6769r0.class.getSimpleName();

    /* renamed from: b */
    private final C5773a f15140b;

    /* renamed from: c */
    private final C6627c1 f15141c;

    public C6765q0(C5773a aVar, C6627c1 c1Var) {
        this.f15140b = aVar;
        this.f15141c = c1Var;
    }

    /* renamed from: a */
    public void mo19486a() {
        C5773a aVar = this.f15140b;
        C6770a aVar2 = C6769r0.f15147c0;
        C6774b bVar = C6774b.f15156c;
        C6626c0 b = this.f15141c.mo19287b();
        C5773a.m18723a(aVar, (Fragment) aVar2.mo19496a(bVar, b != null ? b.mo19354R() : false), false, this.f15139a, 2, (Object) null);
    }

    public void close() {
        C5773a aVar = this.f15140b;
        String str = this.f15139a;
        Intrinsics.checkReturnedValueIsNotNull((Object) str, "hostBackStackName");
        aVar.mo17669a(str);
    }

    /* renamed from: a */
    public void mo19487a(boolean z) {
        C6770a aVar = C6769r0.f15147c0;
        C6778d dVar = C6778d.f15158c;
        C6626c0 b = this.f15141c.mo19287b();
        C6769r0 a = aVar.mo19496a(dVar, b != null ? b.mo19354R() : false);
        if (z) {
            C5773a.m18724b(this.f15140b, a, null, null, 6, null);
        } else {
            C5773a.m18723a(this.f15140b, (Fragment) a, false, this.f15139a, 2, (Object) null);
        }
    }
}
