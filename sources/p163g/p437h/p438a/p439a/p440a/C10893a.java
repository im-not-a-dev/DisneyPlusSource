package p163g.p437h.p438a.p439a.p440a;

import androidx.fragment.app.C0532d;
import com.disney.dominguez.navigation.core.C8436a;
import com.disney.dominguez.navigation.core.C8436a.C8437a;

/* renamed from: g.h.a.a.a.a */
/* compiled from: eventHandlers.kt */
public final class C10893a implements C8436a {

    /* renamed from: c */
    private final C0532d f25824c;

    public C10893a(C0532d dVar) {
        this.f25824c = dVar;
    }

    /* renamed from: a */
    public void mo21645a(C8437a aVar) {
        if (aVar instanceof C10895c) {
            ((C10895c) aVar).mo28013a().invoke(this.f25824c);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can not handle ");
        sb.append(aVar);
        throw new AssertionError(sb.toString());
    }
}
