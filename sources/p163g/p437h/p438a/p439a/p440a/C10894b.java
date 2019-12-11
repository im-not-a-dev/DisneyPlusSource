package p163g.p437h.p438a.p439a.p440a;

import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import com.disney.dominguez.navigation.core.C8436a;
import com.disney.dominguez.navigation.core.C8436a.C8437a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;

/* renamed from: g.h.a.a.a.b */
/* compiled from: eventHandlers.kt */
public final class C10894b implements C8436a {

    /* renamed from: c */
    private final Fragment f25825c;

    public C10894b(Fragment fragment) {
        this.f25825c = fragment;
    }

    /* renamed from: a */
    public void mo21645a(C8437a aVar) {
        if (aVar instanceof C10896d) {
            ((C10896d) aVar).mo28014a().invoke(this.f25825c);
        } else if (aVar instanceof C10895c) {
            Function1 a = ((C10895c) aVar).mo28013a();
            C0532d requireActivity = this.f25825c.requireActivity();
            C12880j.m40222a((Object) requireActivity, "fragment.requireActivity()");
            a.invoke(requireActivity);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not handle ");
            sb.append(aVar);
            throw new AssertionError(sb.toString());
        }
    }
}
