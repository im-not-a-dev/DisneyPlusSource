package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12680a;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12693c;
import kotlinx.coroutines.C13225c2.C13226a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, mo31007d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.c0 */
/* compiled from: CoroutineContext.kt */
public final class C13222c0 extends C12680a implements C13225c2<String> {

    /* renamed from: U */
    public static final C13223a f29654U = new C13223a(null);

    /* renamed from: c */
    private final long f29655c;

    /* renamed from: kotlinx.coroutines.c0$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C13223a implements C12693c<C13222c0> {
        private C13223a() {
        }

        public /* synthetic */ C13223a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13222c0(long j) {
        super(f29654U);
        this.f29655c = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C13222c0) {
                if (this.f29655c == ((C13222c0) obj).f29655c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final long mo34360f() {
        return this.f29655c;
    }

    public <R> R fold(R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
        return C13226a.m40663a(this, r, function2);
    }

    public <E extends C12691b> E get(C12693c<E> cVar) {
        return C13226a.m40664a((C13225c2<S>) this, cVar);
    }

    public int hashCode() {
        long j = this.f29655c;
        return (int) (j ^ (j >>> 32));
    }

    public C12688f minusKey(C12693c<?> cVar) {
        return C13226a.m40666b(this, cVar);
    }

    public C12688f plus(C12688f fVar) {
        return C13226a.m40665a((C13225c2<S>) this, fVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineId(");
        sb.append(this.f29655c);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r9 != null) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m40656a(kotlin.p573a0.C12688f r9) {
        /*
            r8 = this;
            kotlinx.coroutines.d0$a r0 = kotlinx.coroutines.C13228d0.f29656U
            kotlin.a0.f$b r9 = r9.get(r0)
            kotlinx.coroutines.d0 r9 = (kotlinx.coroutines.C13228d0) r9
            if (r9 == 0) goto L_0x0011
            java.lang.String r9 = r9.mo34364f()
            if (r9 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r9 = "coroutine"
        L_0x0013:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "oldName"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.lang.String r3 = " @"
            r2 = r1
            int r2 = kotlin.p588j0.C12833x.m40158b(r2, r3, r4, r5, r6, r7)
            if (r2 >= 0) goto L_0x0036
            int r2 = r1.length()
        L_0x0036:
            int r3 = r9.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r9)
            r9 = 35
            r4.append(r9)
            long r2 = r8.f29655c
            r4.append(r2)
            java.lang.String r9 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r9, r2)
            r0.setName(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13222c0.m40656a(kotlin.a0.f):java.lang.String");
    }

    /* renamed from: a */
    public void mo34357a(C12688f fVar, String str) {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkReturnedValueIsNotNull((Object) currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }
}
