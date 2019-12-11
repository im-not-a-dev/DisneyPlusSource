package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.p581d0.C12732b;
import kotlin.reflect.KCallable;

/* renamed from: kotlin.jvm.internal.q */
/* compiled from: PackageReference.kt */
public final class C12887q implements C12866d {

    /* renamed from: c */
    private final Class<?> f29527c;

    public C12887q(Class<?> cls, String str) {
        this.f29527c = cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12887q) && C12880j.m40224a((Object) getJClass(), (Object) ((C12887q) obj).getJClass());
    }

    public Class<?> getJClass() {
        return this.f29527c;
    }

    public Collection<KCallable<?>> getMembers() {
        throw new C12732b();
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getJClass().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
