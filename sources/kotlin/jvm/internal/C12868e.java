package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import kotlin.p581d0.C12731a;
import kotlin.p581d0.C12732b;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

/* renamed from: kotlin.jvm.internal.e */
/* compiled from: ClassReference.kt */
public final class C12868e implements KClass<Object>, C12866d {

    /* renamed from: c */
    private final Class<?> f29517c;

    public C12868e(Class<?> cls) {
        this.f29517c = cls;
    }

    /* renamed from: a */
    private final Void m40209a() {
        throw new C12732b();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12868e) && C12880j.m40224a((Object) C12731a.m39869b(this), (Object) C12731a.m39869b((KClass) obj));
    }

    public List<Annotation> getAnnotations() {
        m40209a();
        throw null;
    }

    public Collection<KFunction<Object>> getConstructors() {
        m40209a();
        throw null;
    }

    public Class<?> getJClass() {
        return this.f29517c;
    }

    public Collection<KCallable<?>> getMembers() {
        m40209a();
        throw null;
    }

    public Collection<KClass<?>> getNestedClasses() {
        m40209a();
        throw null;
    }

    public Object getObjectInstance() {
        m40209a();
        throw null;
    }

    public String getQualifiedName() {
        m40209a();
        throw null;
    }

    public List<KClass<? extends Object>> getSealedSubclasses() {
        m40209a();
        throw null;
    }

    public String getSimpleName() {
        m40209a();
        throw null;
    }

    public List<KType> getSupertypes() {
        m40209a();
        throw null;
    }

    public List<KTypeParameter> getTypeParameters() {
        m40209a();
        throw null;
    }

    public KVisibility getVisibility() {
        m40209a();
        throw null;
    }

    public int hashCode() {
        return C12731a.m39869b(this).hashCode();
    }

    public boolean isAbstract() {
        m40209a();
        throw null;
    }

    public boolean isCompanion() {
        m40209a();
        throw null;
    }

    public boolean isData() {
        m40209a();
        throw null;
    }

    public boolean isFinal() {
        m40209a();
        throw null;
    }

    public boolean isInner() {
        m40209a();
        throw null;
    }

    public boolean isInstance(Object obj) {
        m40209a();
        throw null;
    }

    public boolean isOpen() {
        m40209a();
        throw null;
    }

    public boolean isSealed() {
        m40209a();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getJClass().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
