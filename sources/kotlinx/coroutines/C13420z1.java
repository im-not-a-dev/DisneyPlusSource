package kotlinx.coroutines;

import kotlin.C13145v;
import kotlinx.coroutines.internal.C13268i;

/* renamed from: kotlinx.coroutines.z1 */
/* compiled from: CancellableContinuation.kt */
final class C13420z1 extends C13236f {

    /* renamed from: c */
    private final C13268i f29914c;

    public C13420z1(C13268i iVar) {
        this.f29914c = iVar;
    }

    /* renamed from: a */
    public void mo34381a(Throwable th) {
        this.f29914c.mo34417k();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo34381a((Throwable) obj);
        return C13145v.f29587a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveOnCancel[");
        sb.append(this.f29914c);
        sb.append(']');
        return sb.toString();
    }
}
