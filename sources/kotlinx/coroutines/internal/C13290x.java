package kotlinx.coroutines.internal;

import kotlin.p573a0.C12688f;

/* renamed from: kotlinx.coroutines.internal.x */
/* compiled from: ThreadContext.kt */
final class C13290x {

    /* renamed from: a */
    private Object[] f29725a;

    /* renamed from: b */
    private int f29726b;

    /* renamed from: c */
    private final C12688f f29727c;

    public C13290x(C12688f fVar, int i) {
        this.f29727c = fVar;
        this.f29725a = new Object[i];
    }

    /* renamed from: a */
    public final C12688f mo34465a() {
        return this.f29727c;
    }

    /* renamed from: b */
    public final void mo34467b() {
        this.f29726b = 0;
    }

    /* renamed from: c */
    public final Object mo34468c() {
        Object[] objArr = this.f29725a;
        int i = this.f29726b;
        this.f29726b = i + 1;
        return objArr[i];
    }

    /* renamed from: a */
    public final void mo34466a(Object obj) {
        Object[] objArr = this.f29725a;
        int i = this.f29726b;
        this.f29726b = i + 1;
        objArr[i] = obj;
    }
}
