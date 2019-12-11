package kotlinx.coroutines;

import kotlin.C13142s;
import kotlinx.coroutines.C13324k1;

/* renamed from: kotlinx.coroutines.q1 */
/* compiled from: JobSupport.kt */
public abstract class C13388q1<J extends C13324k1> extends C13404v implements C13396s0, C13238f1 {

    /* renamed from: W */
    public final J f29878W;

    public C13388q1(J j) {
        this.f29878W = j;
    }

    /* renamed from: a */
    public boolean mo34370a() {
        return true;
    }

    /* renamed from: b */
    public C13408v1 mo34371b() {
        return null;
    }

    public void dispose() {
        J j = this.f29878W;
        if (j != null) {
            ((C13391r1) j).mo34586a(this);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }
}
