package kotlin.p590y;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0006J\u0015\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010 J'\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "getCapacity", "()I", "<set-?>", "size", "getSize", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.y.m0 */
/* compiled from: SlidingWindow.kt */
final class C13181m0<T> extends C13155d<T> implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final Object[] f29613U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f29614V;

    /* renamed from: W */
    private int f29615W;

    /* renamed from: X */
    private final int f29616X;

    /* renamed from: kotlin.y.m0$a */
    /* compiled from: SlidingWindow.kt */
    public static final class C13182a extends C13153c<T> {

        /* renamed from: V */
        private int f29617V;

        /* renamed from: W */
        private int f29618W;

        /* renamed from: X */
        final /* synthetic */ C13181m0 f29619X;

        C13182a(C13181m0 m0Var) {
            this.f29619X = m0Var;
            this.f29617V = m0Var.size();
            this.f29618W = m0Var.f29614V;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34201b() {
            if (this.f29617V == 0) {
                mo34203c();
                return;
            }
            mo34202b(this.f29619X.f29613U[this.f29618W]);
            this.f29618W = (this.f29618W + 1) % this.f29619X.mo34265c();
            this.f29617V--;
        }
    }

    public C13181m0(int i) {
        this.f29616X = i;
        if (this.f29616X >= 0) {
            this.f29613U = new Object[this.f29616X];
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ring buffer capacity should not be negative but it is ");
        sb.append(this.f29616X);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void add(T t) {
        if (!mo34266d()) {
            this.f29613U[(this.f29614V + size()) % mo34265c()] = t;
            this.f29615W = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: c */
    public final int mo34265c() {
        return this.f29616X;
    }

    /* renamed from: d */
    public final boolean mo34266d() {
        return size() == this.f29616X;
    }

    /* renamed from: f */
    public final void mo34267f(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > size()) {
                z = false;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("n shouldn't be greater than the buffer size: n = ");
                sb.append(i);
                sb.append(", size = ");
                sb.append(size());
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (i > 0) {
                int i2 = this.f29614V;
                int c = (i2 + i) % mo34265c();
                if (i2 > c) {
                    C13171j.m40337a(this.f29613U, null, i2, this.f29616X);
                    C13171j.m40337a(this.f29613U, null, 0, c);
                } else {
                    C13171j.m40337a(this.f29613U, null, i2, c);
                }
                this.f29614V = c;
                this.f29615W = size() - i;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("n shouldn't be negative but it is ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
    }

    public T get(int i) {
        C13155d.f29598c.mo34219a(i, size());
        return this.f29613U[(this.f29614V + i) % mo34265c()];
    }

    public Iterator<T> iterator() {
        return new C13182a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            Intrinsics.checkReturnedValueIsNotNull((Object) tArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = this.f29614V;
        int i3 = 0;
        while (i3 < size && i2 < this.f29616X) {
            tArr[i3] = this.f29613U[i2];
            i3++;
            i2++;
        }
        while (i3 < size) {
            tArr[i3] = this.f29613U[i];
            i3++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        if (tArr != null) {
            return tArr;
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public int mo31124b() {
        return this.f29615W;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
