package kotlin.p588j0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.p589f0.C12872a;
import kotlin.p586h0.C12757d;
import kotlin.p587i0.C12775h;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.j0.d */
/* compiled from: Strings.kt */
final class C12802d implements C12775h<C12757d> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f29475a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f29476b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f29477c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> f29478d;

    /* renamed from: kotlin.j0.d$a */
    /* compiled from: Strings.kt */
    public static final class C12803a implements Iterator<C12757d>, C12872a {

        /* renamed from: U */
        private int f29479U;

        /* renamed from: V */
        private int f29480V;

        /* renamed from: W */
        private C12757d f29481W;

        /* renamed from: X */
        private int f29482X;

        /* renamed from: Y */
        final /* synthetic */ C12802d f29483Y;

        /* renamed from: c */
        private int f29484c = -1;

        C12803a(C12802d dVar) {
            this.f29483Y = dVar;
            this.f29479U = C12762h.m39914a(dVar.f29476b, 0, dVar.f29475a.length());
            this.f29480V = this.f29479U;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r6.f29482X < kotlin.p588j0.C12802d.m40016c(r6.f29483Y)) goto L_0x0025;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m40018b() {
            /*
                r6 = this;
                int r0 = r6.f29480V
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f29484c = r1
                r0 = 0
                r6.f29481W = r0
                goto L_0x00a2
            L_0x000c:
                kotlin.j0.d r0 = r6.f29483Y
                int r0 = r0.f29477c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0025
                int r0 = r6.f29482X
                int r0 = r0 + r3
                r6.f29482X = r0
                int r0 = r6.f29482X
                kotlin.j0.d r4 = r6.f29483Y
                int r4 = r4.f29477c
                if (r0 >= r4) goto L_0x0033
            L_0x0025:
                int r0 = r6.f29480V
                kotlin.j0.d r4 = r6.f29483Y
                java.lang.CharSequence r4 = r4.f29475a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0049
            L_0x0033:
                int r0 = r6.f29479U
                kotlin.h0.d r1 = new kotlin.h0.d
                kotlin.j0.d r4 = r6.f29483Y
                java.lang.CharSequence r4 = r4.f29475a
                int r4 = kotlin.p588j0.C12833x.m40172c(r4)
                r1.<init>(r0, r4)
                r6.f29481W = r1
                r6.f29480V = r2
                goto L_0x00a0
            L_0x0049:
                kotlin.j0.d r0 = r6.f29483Y
                kotlin.jvm.functions.Function2 r0 = r0.f29478d
                kotlin.j0.d r4 = r6.f29483Y
                java.lang.CharSequence r4 = r4.f29475a
                int r5 = r6.f29480V
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x0079
                int r0 = r6.f29479U
                kotlin.h0.d r1 = new kotlin.h0.d
                kotlin.j0.d r4 = r6.f29483Y
                java.lang.CharSequence r4 = r4.f29475a
                int r4 = kotlin.p588j0.C12833x.m40172c(r4)
                r1.<init>(r0, r4)
                r6.f29481W = r1
                r6.f29480V = r2
                goto L_0x00a0
            L_0x0079:
                java.lang.Object r2 = r0.mo31013a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo31014b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f29479U
                kotlin.h0.d r4 = kotlin.p586h0.C12762h.m39920d(r4, r2)
                r6.f29481W = r4
                int r2 = r2 + r0
                r6.f29479U = r2
                int r2 = r6.f29479U
                if (r0 != 0) goto L_0x009d
                r1 = 1
            L_0x009d:
                int r2 = r2 + r1
                r6.f29480V = r2
            L_0x00a0:
                r6.f29484c = r3
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p588j0.C12802d.C12803a.m40018b():void");
        }

        public boolean hasNext() {
            if (this.f29484c == -1) {
                m40018b();
            }
            return this.f29484c == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C12757d next() {
            if (this.f29484c == -1) {
                m40018b();
            }
            if (this.f29484c != 0) {
                C12757d dVar = this.f29481W;
                if (dVar != null) {
                    this.f29481W = null;
                    this.f29484c = -1;
                    return dVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }
    }

    public C12802d(CharSequence charSequence, int i, int i2, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        this.f29475a = charSequence;
        this.f29476b = i;
        this.f29477c = i2;
        this.f29478d = function2;
    }

    public Iterator<C12757d> iterator() {
        return new C12803a(this);
    }
}
