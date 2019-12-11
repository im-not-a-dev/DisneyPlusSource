package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.d2 */
final class C11073d2<T> extends C11038b2<T> {

    /* renamed from: c */
    private final T f26132c;

    C11073d2(T t) {
        this.f26132c = t;
    }

    /* renamed from: a */
    public final T mo28313a() {
        return this.f26132c;
    }

    /* renamed from: b */
    public final boolean mo28314b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11073d2)) {
            return false;
        }
        return this.f26132c.equals(((C11073d2) obj).f26132c);
    }

    public final int hashCode() {
        return this.f26132c.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26132c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
