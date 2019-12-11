package kotlinx.coroutines.p597o2;

import kotlinx.coroutines.internal.C13279q;

/* renamed from: kotlinx.coroutines.o2.d */
/* compiled from: Mutex.kt */
public final class C13380d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13279q f29866a = new C13279q("UNLOCK_FAIL");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C13279q f29867b = new C13279q("LOCKED");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C13279q f29868c = new C13279q("UNLOCKED");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C13371a f29869d = new C13371a(f29867b);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C13371a f29870e = new C13371a(f29868c);

    static {
        new C13279q("LOCK_FAIL");
        new C13279q("ENQUEUE_FAIL");
        new C13279q("SELECT_SUCCESS");
    }

    /* renamed from: a */
    public static /* synthetic */ C13372b m41114a(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m41113a(z);
    }

    /* renamed from: a */
    public static final C13372b m41113a(boolean z) {
        return new C13374c(z);
    }
}
