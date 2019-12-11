package p163g.p449j.p450a.p451a.p457d.p463f;

/* renamed from: g.j.a.a.d.f.p */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C11018p extends C11013l {

    /* renamed from: a */
    private final C11017o f26039a = new C11017o();

    C11018p() {
    }

    /* renamed from: a */
    public final void mo28244a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f26039a.mo28247a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
