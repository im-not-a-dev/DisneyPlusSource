package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0811c;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0812d;
import androidx.recyclerview.widget.RecyclerView.C0813p;
import androidx.recyclerview.widget.RecyclerView.C0820v;
import androidx.recyclerview.widget.RecyclerView.C0825z;
import androidx.recyclerview.widget.RecyclerView.C0825z.C0827b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4154d.C4157c;

public class StaggeredGridLayoutManager extends C0808o implements C0827b {

    /* renamed from: A */
    boolean f3352A = false;

    /* renamed from: B */
    private BitSet f3353B;

    /* renamed from: C */
    int f3354C = -1;

    /* renamed from: D */
    int f3355D = Integer.MIN_VALUE;

    /* renamed from: E */
    C0831d f3356E = new C0831d();

    /* renamed from: F */
    private int f3357F = 2;

    /* renamed from: G */
    private boolean f3358G;

    /* renamed from: H */
    private boolean f3359H;

    /* renamed from: I */
    private C0834e f3360I;

    /* renamed from: J */
    private int f3361J;

    /* renamed from: K */
    private final Rect f3362K = new Rect();

    /* renamed from: L */
    private final C0829b f3363L = new C0829b();

    /* renamed from: M */
    private boolean f3364M = false;

    /* renamed from: N */
    private boolean f3365N = true;

    /* renamed from: O */
    private int[] f3366O;

    /* renamed from: P */
    private final Runnable f3367P = new C0828a();

    /* renamed from: s */
    private int f3368s = -1;

    /* renamed from: t */
    C0836f[] f3369t;

    /* renamed from: u */
    C0892p f3370u;

    /* renamed from: v */
    C0892p f3371v;

    /* renamed from: w */
    private int f3372w;

    /* renamed from: x */
    private int f3373x;

    /* renamed from: y */
    private final C0887l f3374y;

    /* renamed from: z */
    boolean f3375z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C0828a implements Runnable {
        C0828a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo4857H();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0829b {

        /* renamed from: a */
        int f3377a;

        /* renamed from: b */
        int f3378b;

        /* renamed from: c */
        boolean f3379c;

        /* renamed from: d */
        boolean f3380d;

        /* renamed from: e */
        boolean f3381e;

        /* renamed from: f */
        int[] f3382f;

        C0829b() {
            mo4878b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4877a(C0836f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3382f;
            if (iArr == null || iArr.length < length) {
                this.f3382f = new int[StaggeredGridLayoutManager.this.f3369t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3382f[i] = fVarArr[i].mo4912b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4878b() {
            this.f3377a = -1;
            this.f3378b = Integer.MIN_VALUE;
            this.f3379c = false;
            this.f3380d = false;
            this.f3381e = false;
            int[] iArr = this.f3382f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4875a() {
            int i;
            if (this.f3379c) {
                i = StaggeredGridLayoutManager.this.f3370u.mo5112b();
            } else {
                i = StaggeredGridLayoutManager.this.f3370u.mo5120f();
            }
            this.f3378b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4876a(int i) {
            if (this.f3379c) {
                this.f3378b = StaggeredGridLayoutManager.this.f3370u.mo5112b() - i;
            } else {
                this.f3378b = StaggeredGridLayoutManager.this.f3370u.mo5120f() + i;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0830c extends C0813p {

        /* renamed from: e */
        C0836f f3384e;

        /* renamed from: f */
        boolean f3385f;

        public C0830c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: g */
        public final int mo4879g() {
            C0836f fVar = this.f3384e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3406e;
        }

        /* renamed from: h */
        public boolean mo4880h() {
            return this.f3385f;
        }

        public C0830c(int i, int i2) {
            super(i, i2);
        }

        public C0830c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0830c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C0831d {

        /* renamed from: a */
        int[] f3386a;

        /* renamed from: b */
        List<C0832a> f3387b;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C0832a implements Parcelable {
            public static final Creator<C0832a> CREATOR = new C0833a();

            /* renamed from: U */
            int f3388U;

            /* renamed from: V */
            int[] f3389V;

            /* renamed from: W */
            boolean f3390W;

            /* renamed from: c */
            int f3391c;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C0833a implements Creator<C0832a> {
                C0833a() {
                }

                public C0832a createFromParcel(Parcel parcel) {
                    return new C0832a(parcel);
                }

                public C0832a[] newArray(int i) {
                    return new C0832a[i];
                }
            }

            C0832a(Parcel parcel) {
                this.f3391c = parcel.readInt();
                this.f3388U = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f3390W = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f3389V = new int[readInt];
                    parcel.readIntArray(this.f3389V);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo4893a(int i) {
                int[] iArr = this.f3389V;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.f3391c);
                sb.append(", mGapDir=");
                sb.append(this.f3388U);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f3390W);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f3389V));
                sb.append('}');
                return sb.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3391c);
                parcel.writeInt(this.f3388U);
                parcel.writeInt(this.f3390W ? 1 : 0);
                int[] iArr = this.f3389V;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3389V);
            }

            C0832a() {
            }
        }

        C0831d() {
        }

        /* renamed from: c */
        private void m4659c(int i, int i2) {
            List<C0832a> list = this.f3387b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0832a aVar = (C0832a) this.f3387b.get(size);
                    int i3 = aVar.f3391c;
                    if (i3 >= i) {
                        aVar.f3391c = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m4661g(int i) {
            if (this.f3387b == null) {
                return -1;
            }
            C0832a c = mo4889c(i);
            if (c != null) {
                this.f3387b.remove(c);
            }
            int size = this.f3387b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((C0832a) this.f3387b.get(i2)).f3391c >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            C0832a aVar = (C0832a) this.f3387b.get(i2);
            this.f3387b.remove(i2);
            return aVar.f3391c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4885a(int i, C0836f fVar) {
            mo4883a(i);
            this.f3386a[i] = fVar.f3406e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4887b(int i) {
            List<C0832a> list = this.f3387b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((C0832a) this.f3387b.get(size)).f3391c >= i) {
                        this.f3387b.remove(size);
                    }
                }
            }
            return mo4891e(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo4890d(int i) {
            int[] iArr = this.f3386a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo4891e(int i) {
            int[] iArr = this.f3386a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m4661g(i);
            if (g == -1) {
                int[] iArr2 = this.f3386a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3386a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f3386a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo4892f(int i) {
            int length = this.f3386a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: d */
        private void m4660d(int i, int i2) {
            List<C0832a> list = this.f3387b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0832a aVar = (C0832a) this.f3387b.get(size);
                    int i4 = aVar.f3391c;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3387b.remove(size);
                        } else {
                            aVar.f3391c = i4 - i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4883a(int i) {
            int[] iArr = this.f3386a;
            if (iArr == null) {
                this.f3386a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f3386a, -1);
            } else if (i >= iArr.length) {
                this.f3386a = new int[mo4892f(i)];
                System.arraycopy(iArr, 0, this.f3386a, 0, iArr.length);
                int[] iArr2 = this.f3386a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* renamed from: c */
        public C0832a mo4889c(int i) {
            List<C0832a> list = this.f3387b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0832a aVar = (C0832a) this.f3387b.get(size);
                if (aVar.f3391c == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4888b(int i, int i2) {
            int[] iArr = this.f3386a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4883a(i3);
                int[] iArr2 = this.f3386a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3386a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m4660d(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4882a() {
            int[] iArr = this.f3386a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3387b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4884a(int i, int i2) {
            int[] iArr = this.f3386a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4883a(i3);
                int[] iArr2 = this.f3386a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3386a, i, i3, -1);
                m4659c(i, i2);
            }
        }

        /* renamed from: a */
        public void mo4886a(C0832a aVar) {
            if (this.f3387b == null) {
                this.f3387b = new ArrayList();
            }
            int size = this.f3387b.size();
            for (int i = 0; i < size; i++) {
                C0832a aVar2 = (C0832a) this.f3387b.get(i);
                if (aVar2.f3391c == aVar.f3391c) {
                    this.f3387b.remove(i);
                }
                if (aVar2.f3391c >= aVar.f3391c) {
                    this.f3387b.add(i, aVar);
                    return;
                }
            }
            this.f3387b.add(aVar);
        }

        /* renamed from: a */
        public C0832a mo4881a(int i, int i2, int i3, boolean z) {
            List<C0832a> list = this.f3387b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0832a aVar = (C0832a) this.f3387b.get(i4);
                int i5 = aVar.f3391c;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f3388U == i3 || (z && aVar.f3390W))) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0834e implements Parcelable {
        public static final Creator<C0834e> CREATOR = new C0835a();

        /* renamed from: U */
        int f3392U;

        /* renamed from: V */
        int f3393V;

        /* renamed from: W */
        int[] f3394W;

        /* renamed from: X */
        int f3395X;

        /* renamed from: Y */
        int[] f3396Y;

        /* renamed from: Z */
        List<C0832a> f3397Z;

        /* renamed from: a0 */
        boolean f3398a0;

        /* renamed from: b0 */
        boolean f3399b0;

        /* renamed from: c */
        int f3400c;

        /* renamed from: c0 */
        boolean f3401c0;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C0835a implements Creator<C0834e> {
            C0835a() {
            }

            public C0834e createFromParcel(Parcel parcel) {
                return new C0834e(parcel);
            }

            public C0834e[] newArray(int i) {
                return new C0834e[i];
            }
        }

        public C0834e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: X */
        public void mo4899X() {
            this.f3394W = null;
            this.f3393V = 0;
            this.f3400c = -1;
            this.f3392U = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: Y */
        public void mo4900Y() {
            this.f3394W = null;
            this.f3393V = 0;
            this.f3395X = 0;
            this.f3396Y = null;
            this.f3397Z = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3400c);
            parcel.writeInt(this.f3392U);
            parcel.writeInt(this.f3393V);
            if (this.f3393V > 0) {
                parcel.writeIntArray(this.f3394W);
            }
            parcel.writeInt(this.f3395X);
            if (this.f3395X > 0) {
                parcel.writeIntArray(this.f3396Y);
            }
            parcel.writeInt(this.f3398a0 ? 1 : 0);
            parcel.writeInt(this.f3399b0 ? 1 : 0);
            parcel.writeInt(this.f3401c0 ? 1 : 0);
            parcel.writeList(this.f3397Z);
        }

        C0834e(Parcel parcel) {
            this.f3400c = parcel.readInt();
            this.f3392U = parcel.readInt();
            this.f3393V = parcel.readInt();
            int i = this.f3393V;
            if (i > 0) {
                this.f3394W = new int[i];
                parcel.readIntArray(this.f3394W);
            }
            this.f3395X = parcel.readInt();
            int i2 = this.f3395X;
            if (i2 > 0) {
                this.f3396Y = new int[i2];
                parcel.readIntArray(this.f3396Y);
            }
            boolean z = false;
            this.f3398a0 = parcel.readInt() == 1;
            this.f3399b0 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f3401c0 = z;
            this.f3397Z = parcel.readArrayList(C0832a.class.getClassLoader());
        }

        public C0834e(C0834e eVar) {
            this.f3393V = eVar.f3393V;
            this.f3400c = eVar.f3400c;
            this.f3392U = eVar.f3392U;
            this.f3394W = eVar.f3394W;
            this.f3395X = eVar.f3395X;
            this.f3396Y = eVar.f3396Y;
            this.f3398a0 = eVar.f3398a0;
            this.f3399b0 = eVar.f3399b0;
            this.f3401c0 = eVar.f3401c0;
            this.f3397Z = eVar.f3397Z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C0836f {

        /* renamed from: a */
        ArrayList<View> f3402a = new ArrayList<>();

        /* renamed from: b */
        int f3403b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3404c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3405d = 0;

        /* renamed from: e */
        final int f3406e;

        C0836f(int i) {
            this.f3406e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4905a(int i) {
            int i2 = this.f3404c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3402a.size() == 0) {
                return i;
            }
            mo4909a();
            return this.f3404c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4912b(int i) {
            int i2 = this.f3403b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3402a.size() == 0) {
                return i;
            }
            mo4914b();
            return this.f3403b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4917c(View view) {
            C0830c b = mo4913b(view);
            b.f3384e = this;
            this.f3402a.add(0, view);
            this.f3403b = Integer.MIN_VALUE;
            if (this.f3402a.size() == 1) {
                this.f3404c = Integer.MIN_VALUE;
            }
            if (b.mo4774d() || b.mo4773c()) {
                this.f3405d += StaggeredGridLayoutManager.this.f3370u.mo5113b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4919d(int i) {
            this.f3403b = i;
            this.f3404c = i;
        }

        /* renamed from: e */
        public int mo4920e() {
            if (StaggeredGridLayoutManager.this.f3375z) {
                return mo4906a(0, this.f3402a.size(), true);
            }
            return mo4906a(this.f3402a.size() - 1, -1, true);
        }

        /* renamed from: f */
        public int mo4921f() {
            return this.f3405d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int mo4922g() {
            int i = this.f3404c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4909a();
            return this.f3404c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo4923h() {
            int i = this.f3403b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4914b();
            return this.f3403b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo4924i() {
            this.f3403b = Integer.MIN_VALUE;
            this.f3404c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo4925j() {
            int size = this.f3402a.size();
            View view = (View) this.f3402a.remove(size - 1);
            C0830c b = mo4913b(view);
            b.f3384e = null;
            if (b.mo4774d() || b.mo4773c()) {
                this.f3405d -= StaggeredGridLayoutManager.this.f3370u.mo5113b(view);
            }
            if (size == 1) {
                this.f3403b = Integer.MIN_VALUE;
            }
            this.f3404c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo4926k() {
            View view = (View) this.f3402a.remove(0);
            C0830c b = mo4913b(view);
            b.f3384e = null;
            if (this.f3402a.size() == 0) {
                this.f3404c = Integer.MIN_VALUE;
            }
            if (b.mo4774d() || b.mo4773c()) {
                this.f3405d -= StaggeredGridLayoutManager.this.f3370u.mo5113b(view);
            }
            this.f3403b = Integer.MIN_VALUE;
        }

        /* renamed from: d */
        public int mo4918d() {
            if (StaggeredGridLayoutManager.this.f3375z) {
                return mo4906a(this.f3402a.size() - 1, -1, true);
            }
            return mo4906a(0, this.f3402a.size(), true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4909a() {
            ArrayList<View> arrayList = this.f3402a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C0830c b = mo4913b(view);
            this.f3404c = StaggeredGridLayoutManager.this.f3370u.mo5110a(view);
            if (b.f3385f) {
                C0832a c = StaggeredGridLayoutManager.this.f3356E.mo4889c(b.mo4772b());
                if (c != null && c.f3388U == 1) {
                    this.f3404c += c.mo4893a(this.f3406e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4914b() {
            View view = (View) this.f3402a.get(0);
            C0830c b = mo4913b(view);
            this.f3403b = StaggeredGridLayoutManager.this.f3370u.mo5117d(view);
            if (b.f3385f) {
                C0832a c = StaggeredGridLayoutManager.this.f3356E.mo4889c(b.mo4772b());
                if (c != null && c.f3388U == -1) {
                    this.f3403b -= c.mo4893a(this.f3406e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4915c() {
            this.f3402a.clear();
            mo4924i();
            this.f3405d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4916c(int i) {
            int i2 = this.f3403b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3403b = i2 + i;
            }
            int i3 = this.f3404c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3404c = i3 + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4910a(View view) {
            C0830c b = mo4913b(view);
            b.f3384e = this;
            this.f3402a.add(view);
            this.f3404c = Integer.MIN_VALUE;
            if (this.f3402a.size() == 1) {
                this.f3403b = Integer.MIN_VALUE;
            }
            if (b.mo4774d() || b.mo4773c()) {
                this.f3405d += StaggeredGridLayoutManager.this.f3370u.mo5113b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0830c mo4913b(View view) {
            return (C0830c) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4911a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo4905a(Integer.MIN_VALUE);
            } else {
                i2 = mo4912b(Integer.MIN_VALUE);
            }
            mo4915c();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.f3370u.mo5112b()) && (z || i2 <= StaggeredGridLayoutManager.this.f3370u.mo5120f())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f3404c = i2;
                    this.f3403b = i2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4907a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.f3370u.mo5120f();
            int b = StaggeredGridLayoutManager.this.f3370u.mo5112b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f3402a.get(i);
                int d = StaggeredGridLayoutManager.this.f3370u.mo5117d(view);
                int a = StaggeredGridLayoutManager.this.f3370u.mo5110a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > f : a >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo4749l(view);
                        }
                        if (d < f || a > b) {
                            return StaggeredGridLayoutManager.this.mo4749l(view);
                        }
                    } else if (d >= f && a <= b) {
                        return StaggeredGridLayoutManager.this.mo4749l(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4906a(int i, int i2, boolean z) {
            return mo4907a(i, i2, false, false, z);
        }

        /* renamed from: a */
        public View mo4908a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3402a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f3402a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3375z && staggeredGridLayoutManager.mo4749l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3375z && staggeredGridLayoutManager2.mo4749l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3402a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f3402a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3375z && staggeredGridLayoutManager3.mo4749l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3375z && staggeredGridLayoutManager4.mo4749l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0812d a = C0808o.m4305a(context, attributeSet, i, i2);
        mo4871j(a.f3312a);
        mo4872k(a.f3313b);
        mo4870d(a.f3314c);
        this.f3374y = new C0887l();
        m4555O();
    }

    /* renamed from: O */
    private void m4555O() {
        this.f3370u = C0892p.m4933a(this, this.f3372w);
        this.f3371v = C0892p.m4933a(this, 1 - this.f3372w);
    }

    /* renamed from: P */
    private void m4556P() {
        if (this.f3371v.mo5116d() != 1073741824) {
            int e = mo4732e();
            float f = 0.0f;
            for (int i = 0; i < e; i++) {
                View d = mo4729d(i);
                float b = (float) this.f3371v.mo5113b(d);
                if (b >= f) {
                    if (((C0830c) d.getLayoutParams()).mo4880h()) {
                        b = (b * 1.0f) / ((float) this.f3368s);
                    }
                    f = Math.max(f, b);
                }
            }
            int i2 = this.f3373x;
            int round = Math.round(f * ((float) this.f3368s));
            if (this.f3371v.mo5116d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3371v.mo5122g());
            }
            mo4873l(round);
            if (this.f3373x != i2) {
                for (int i3 = 0; i3 < e; i3++) {
                    View d2 = mo4729d(i3);
                    C0830c cVar = (C0830c) d2.getLayoutParams();
                    if (!cVar.f3385f) {
                        if (!mo4863N() || this.f3372w != 1) {
                            int i4 = cVar.f3384e.f3406e;
                            int i5 = this.f3373x * i4;
                            int i6 = i4 * i2;
                            if (this.f3372w == 1) {
                                d2.offsetLeftAndRight(i5 - i6);
                            } else {
                                d2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f3368s;
                            int i8 = i7 - 1;
                            int i9 = cVar.f3384e.f3406e;
                            d2.offsetLeftAndRight(((-(i8 - i9)) * this.f3373x) - ((-((i7 - 1) - i9)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    private void m4557Q() {
        if (this.f3372w == 1 || !mo4863N()) {
            this.f3352A = this.f3375z;
        } else {
            this.f3352A = !this.f3375z;
        }
    }

    /* renamed from: a */
    private boolean m4568a(C0836f fVar) {
        if (this.f3352A) {
            if (fVar.mo4922g() < this.f3370u.mo5112b()) {
                ArrayList<View> arrayList = fVar.f3402a;
                return !fVar.mo4913b((View) arrayList.get(arrayList.size() - 1)).f3385f;
            }
        } else if (fVar.mo4923h() > this.f3370u.mo5120f()) {
            return !fVar.mo4913b((View) fVar.f3402a.get(0)).f3385f;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo4857H() != false) goto L_0x015b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4574c(androidx.recyclerview.widget.RecyclerView.C0820v r9, androidx.recyclerview.widget.RecyclerView.C0788a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f3363L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3360I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3354C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4531b()
            if (r1 != 0) goto L_0x0018
            r8.mo3876b(r9)
            r0.mo4878b()
            return
        L_0x0018:
            boolean r1 = r0.f3381e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3354C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3360I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4878b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3360I
            if (r5 == 0) goto L_0x0037
            r8.m4566a(r0)
            goto L_0x003e
        L_0x0037:
            r8.m4557Q()
            boolean r5 = r8.f3352A
            r0.f3379c = r5
        L_0x003e:
            r8.mo4867b(r10, r0)
            r0.f3381e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3360I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3354C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3379c
            boolean r6 = r8.f3358G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo4863N()
            boolean r6 = r8.f3359H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f3356E
            r5.mo4882a()
            r0.f3380d = r4
        L_0x0060:
            int r5 = r8.mo4732e()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3360I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3393V
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3380d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f3368s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3369t
            r5 = r5[r1]
            r5.mo4915c()
            int r5 = r0.f3378b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f3369t
            r6 = r6[r1]
            r6.mo4919d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3363L
            int[] r1 = r1.f3382f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f3368s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3369t
            r5 = r5[r1]
            r5.mo4915c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f3363L
            int[] r6 = r6.f3382f
            r6 = r6[r1]
            r5.mo4919d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f3368s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3369t
            r5 = r5[r1]
            boolean r6 = r8.f3352A
            int r7 = r0.f3378b
            r5.mo4911a(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3363L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3369t
            r1.mo4877a(r5)
        L_0x00c9:
            r8.mo4699a(r9)
            androidx.recyclerview.widget.l r1 = r8.f3374y
            r1.f3609a = r3
            r8.f3364M = r3
            androidx.recyclerview.widget.p r1 = r8.f3371v
            int r1 = r1.mo5122g()
            r8.mo4873l(r1)
            int r1 = r0.f3377a
            r8.m4570b(r1, r10)
            boolean r1 = r0.f3379c
            if (r1 == 0) goto L_0x00fc
            r8.m4593x(r2)
            androidx.recyclerview.widget.l r1 = r8.f3374y
            r8.m4558a(r9, r1, r10)
            r8.m4593x(r4)
            androidx.recyclerview.widget.l r1 = r8.f3374y
            int r2 = r0.f3377a
            int r5 = r1.f3612d
            int r2 = r2 + r5
            r1.f3611c = r2
            r8.m4558a(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m4593x(r4)
            androidx.recyclerview.widget.l r1 = r8.f3374y
            r8.m4558a(r9, r1, r10)
            r8.m4593x(r2)
            androidx.recyclerview.widget.l r1 = r8.f3374y
            int r2 = r0.f3377a
            int r5 = r1.f3612d
            int r2 = r2 + r5
            r1.f3611c = r2
            r8.m4558a(r9, r1, r10)
        L_0x0113:
            r8.m4556P()
            int r1 = r8.mo4732e()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f3352A
            if (r1 == 0) goto L_0x0127
            r8.m4564a(r9, r10, r4)
            r8.m4572b(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m4572b(r9, r10, r4)
            r8.m4564a(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo4536g()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f3357F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo4732e()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f3364M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo4861L()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f3367P
            r8.mo4713a(r11)
            boolean r11 = r8.mo4857H()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.mo4536g()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3363L
            r11.mo4878b()
        L_0x0166:
            boolean r11 = r0.f3379c
            r8.f3358G = r11
            boolean r11 = r8.mo4863N()
            r8.f3359H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3363L
            r11.mo4878b()
            r8.m4574c(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4574c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: h */
    private int m4577h(C0788a0 a0Var) {
        if (mo4732e() == 0) {
            return 0;
        }
        return C0899s.m4997a(a0Var, this.f3370u, mo4869c(!this.f3365N), mo4866b(!this.f3365N), this, this.f3365N);
    }

    /* renamed from: i */
    private int m4578i(C0788a0 a0Var) {
        if (mo4732e() == 0) {
            return 0;
        }
        return C0899s.m4998a(a0Var, this.f3370u, mo4869c(!this.f3365N), mo4866b(!this.f3365N), this, this.f3365N, this.f3352A);
    }

    /* renamed from: m */
    private int m4580m(int i) {
        int i2 = -1;
        if (mo4732e() == 0) {
            if (this.f3352A) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo4859J()) == this.f3352A) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: n */
    private int m4581n(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f3372w != 1 && mo4863N()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3372w != 1 && mo4863N()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f3372w != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f3372w != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f3372w != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f3372w != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: o */
    private C0832a m4582o(int i) {
        C0832a aVar = new C0832a();
        aVar.f3389V = new int[this.f3368s];
        for (int i2 = 0; i2 < this.f3368s; i2++) {
            aVar.f3389V[i2] = i - this.f3369t[i2].mo4905a(i);
        }
        return aVar;
    }

    /* renamed from: p */
    private C0832a m4583p(int i) {
        C0832a aVar = new C0832a();
        aVar.f3389V = new int[this.f3368s];
        for (int i2 = 0; i2 < this.f3368s; i2++) {
            aVar.f3389V[i2] = this.f3369t[i2].mo4912b(i) - i;
        }
        return aVar;
    }

    /* renamed from: q */
    private void m4586q(View view) {
        for (int i = this.f3368s - 1; i >= 0; i--) {
            this.f3369t[i].mo4917c(view);
        }
    }

    /* renamed from: r */
    private int m4587r(int i) {
        for (int e = mo4732e() - 1; e >= 0; e--) {
            int l = mo4749l(mo4729d(e));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: s */
    private int m4588s(int i) {
        int a = this.f3369t[0].mo4905a(i);
        for (int i2 = 1; i2 < this.f3368s; i2++) {
            int a2 = this.f3369t[i2].mo4905a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: t */
    private int m4589t(int i) {
        int b = this.f3369t[0].mo4912b(i);
        for (int i2 = 1; i2 < this.f3368s; i2++) {
            int b2 = this.f3369t[i2].mo4912b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: u */
    private int m4590u(int i) {
        int a = this.f3369t[0].mo4905a(i);
        for (int i2 = 1; i2 < this.f3368s; i2++) {
            int a2 = this.f3369t[i2].mo4905a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: v */
    private int m4591v(int i) {
        int b = this.f3369t[0].mo4912b(i);
        for (int i2 = 1; i2 < this.f3368s; i2++) {
            int b2 = this.f3369t[i2].mo4912b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: x */
    private void m4593x(int i) {
        C0887l lVar = this.f3374y;
        lVar.f3613e = i;
        int i2 = 1;
        if (this.f3352A != (i == -1)) {
            i2 = -1;
        }
        lVar.f3612d = i2;
    }

    /* renamed from: E */
    public boolean mo3811E() {
        return this.f3360I == null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public boolean mo4855F() {
        int a = this.f3369t[0].mo4905a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3368s; i++) {
            if (this.f3369t[i].mo4905a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public boolean mo4856G() {
        int b = this.f3369t[0].mo4912b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3368s; i++) {
            if (this.f3369t[i].mo4912b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public boolean mo4857H() {
        int i;
        int i2;
        if (mo4732e() == 0 || this.f3357F == 0 || !mo4762v()) {
            return false;
        }
        if (this.f3352A) {
            i2 = mo4860K();
            i = mo4859J();
        } else {
            i2 = mo4859J();
            i = mo4860K();
        }
        if (i2 == 0 && mo4861L() != null) {
            this.f3356E.mo4882a();
            mo4686B();
            mo4685A();
            return true;
        } else if (!this.f3364M) {
            return false;
        } else {
            int i3 = this.f3352A ? -1 : 1;
            int i4 = i + 1;
            C0832a a = this.f3356E.mo4881a(i2, i4, i3, true);
            if (a == null) {
                this.f3364M = false;
                this.f3356E.mo4887b(i4);
                return false;
            }
            C0832a a2 = this.f3356E.mo4881a(i2, a.f3391c, i3 * -1, true);
            if (a2 == null) {
                this.f3356E.mo4887b(a.f3391c);
            } else {
                this.f3356E.mo4887b(a2.f3391c + 1);
            }
            mo4686B();
            mo4685A();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public int mo4858I() {
        View view;
        if (this.f3352A) {
            view = mo4866b(true);
        } else {
            view = mo4869c(true);
        }
        if (view == null) {
            return -1;
        }
        return mo4749l(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public int mo4859J() {
        if (mo4732e() == 0) {
            return 0;
        }
        return mo4749l(mo4729d(0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public int mo4860K() {
        int e = mo4732e();
        if (e == 0) {
            return 0;
        }
        return mo4749l(mo4729d(e - 1));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4861L() {
        /*
            r12 = this;
            int r0 = r12.mo4732e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3368s
            r2.<init>(r3)
            int r3 = r12.f3368s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3372w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo4863N()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f3352A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4729d(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0830c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3384e
            int r9 = r9.f3406e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3384e
            boolean r9 = r12.m4568a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3384e
            int r9 = r9.f3406e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3385f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4729d(r9)
            boolean r10 = r12.f3352A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.p r10 = r12.f3370u
            int r10 = r10.mo5110a(r7)
            androidx.recyclerview.widget.p r11 = r12.f3370u
            int r11 = r11.mo5110a(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.p r10 = r12.f3370u
            int r10 = r10.mo5117d(r7)
            androidx.recyclerview.widget.p r11 = r12.f3370u
            int r11 = r11.mo5117d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0830c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3384e
            int r8 = r8.f3406e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3384e
            int r9 = r9.f3406e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4861L():android.view.View");
    }

    /* renamed from: M */
    public void mo4862M() {
        this.f3356E.mo4882a();
        mo4685A();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public boolean mo4863N() {
        return mo4746k() == 1;
    }

    /* renamed from: b */
    public void mo4333b(RecyclerView recyclerView, C0820v vVar) {
        super.mo4333b(recyclerView, vVar);
        mo4713a(this.f3367P);
        for (int i = 0; i < this.f3368s; i++) {
            this.f3369t[i].mo4915c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: d */
    public void mo4870d(boolean z) {
        mo4331a((String) null);
        C0834e eVar = this.f3360I;
        if (!(eVar == null || eVar.f3398a0 == z)) {
            eVar.f3398a0 = z;
        }
        this.f3375z = z;
        mo4685A();
    }

    /* renamed from: e */
    public void mo3895e(C0820v vVar, C0788a0 a0Var) {
        m4574c(vVar, a0Var, true);
    }

    /* renamed from: f */
    public int mo4341f(C0788a0 a0Var) {
        return m4579j(a0Var);
    }

    /* renamed from: g */
    public void mo4740g(int i) {
        if (i == 0) {
            mo4857H();
        }
    }

    /* renamed from: j */
    public void mo4871j(int i) {
        if (i == 0 || i == 1) {
            mo4331a((String) null);
            if (i != this.f3372w) {
                this.f3372w = i;
                C0892p pVar = this.f3370u;
                this.f3370u = this.f3371v;
                this.f3371v = pVar;
                mo4685A();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: k */
    public void mo4872k(int i) {
        mo4331a((String) null);
        if (i != this.f3368s) {
            mo4862M();
            this.f3368s = i;
            this.f3353B = new BitSet(this.f3368s);
            this.f3369t = new C0836f[this.f3368s];
            for (int i2 = 0; i2 < this.f3368s; i2++) {
                this.f3369t[i2] = new C0836f(i2);
            }
            mo4685A();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4873l(int i) {
        this.f3373x = i / this.f3368s;
        this.f3361J = MeasureSpec.makeMeasureSpec(i, this.f3371v.mo5116d());
    }

    /* renamed from: w */
    public boolean mo4347w() {
        return this.f3357F != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo3930z() {
        /*
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f3360I
            if (r0 == 0) goto L_0x000a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r1.<init>(r0)
            return r1
        L_0x000a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r0.<init>()
            boolean r1 = r4.f3375z
            r0.f3398a0 = r1
            boolean r1 = r4.f3358G
            r0.f3399b0 = r1
            boolean r1 = r4.f3359H
            r0.f3401c0 = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r4.f3356E
            r2 = 0
            if (r1 == 0) goto L_0x0030
            int[] r3 = r1.f3386a
            if (r3 == 0) goto L_0x0030
            r0.f3396Y = r3
            int[] r3 = r0.f3396Y
            int r3 = r3.length
            r0.f3395X = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r1.f3387b
            r0.f3397Z = r1
            goto L_0x0032
        L_0x0030:
            r0.f3395X = r2
        L_0x0032:
            int r1 = r4.mo4732e()
            if (r1 <= 0) goto L_0x0088
            boolean r1 = r4.f3358G
            if (r1 == 0) goto L_0x0041
            int r1 = r4.mo4860K()
            goto L_0x0045
        L_0x0041:
            int r1 = r4.mo4859J()
        L_0x0045:
            r0.f3400c = r1
            int r1 = r4.mo4858I()
            r0.f3392U = r1
            int r1 = r4.f3368s
            r0.f3393V = r1
            int[] r1 = new int[r1]
            r0.f3394W = r1
        L_0x0055:
            int r1 = r4.f3368s
            if (r2 >= r1) goto L_0x008f
            boolean r1 = r4.f3358G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0070
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3369t
            r1 = r1[r2]
            int r1 = r1.mo4905a(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.p r3 = r4.f3370u
            int r3 = r3.mo5112b()
            goto L_0x0080
        L_0x0070:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3369t
            r1 = r1[r2]
            int r1 = r1.mo4912b(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.p r3 = r4.f3370u
            int r3 = r3.mo5120f()
        L_0x0080:
            int r1 = r1 - r3
        L_0x0081:
            int[] r3 = r0.f3394W
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0088:
            r1 = -1
            r0.f3400c = r1
            r0.f3392U = r1
            r0.f3393V = r2
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo3930z():android.os.Parcelable");
    }

    /* renamed from: w */
    private boolean m4592w(int i) {
        boolean z = true;
        if (this.f3372w == 0) {
            if ((i == -1) == this.f3352A) {
                z = false;
            }
            return z;
        }
        if (((i == -1) == this.f3352A) != mo4863N()) {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public int mo4339e(C0788a0 a0Var) {
        return m4578i(a0Var);
    }

    /* renamed from: f */
    public void mo4735f(int i) {
        super.mo4735f(i);
        for (int i2 = 0; i2 < this.f3368s; i2++) {
            this.f3369t[i2].mo4916c(i);
        }
    }

    /* renamed from: g */
    public void mo3901g(C0788a0 a0Var) {
        super.mo3901g(a0Var);
        this.f3354C = -1;
        this.f3355D = Integer.MIN_VALUE;
        this.f3360I = null;
        this.f3363L.mo4878b();
    }

    /* renamed from: q */
    private int m4585q(int i) {
        int e = mo4732e();
        for (int i2 = 0; i2 < e; i2++) {
            int l = mo4749l(mo4729d(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public void mo4733e(int i) {
        super.mo4733e(i);
        for (int i2 = 0; i2 < this.f3368s; i2++) {
            this.f3369t[i2].mo4916c(i);
        }
    }

    /* renamed from: p */
    private void m4584p(View view) {
        for (int i = this.f3368s - 1; i >= 0; i--) {
            this.f3369t[i].mo4910a(view);
        }
    }

    /* renamed from: e */
    private void m4576e(int i, int i2) {
        for (int i3 = 0; i3 < this.f3368s; i3++) {
            if (!this.f3369t[i3].f3402a.isEmpty()) {
                m4567a(this.f3369t[i3], i, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4867b(C0788a0 a0Var, C0829b bVar) {
        if (!mo4865a(a0Var, bVar) && !m4575c(a0Var, bVar)) {
            bVar.mo4875a();
            bVar.f3377a = 0;
        }
    }

    /* renamed from: d */
    public int mo4338d(C0788a0 a0Var) {
        return m4577h(a0Var);
    }

    /* renamed from: i */
    public void mo3903i(int i) {
        C0834e eVar = this.f3360I;
        if (!(eVar == null || eVar.f3400c == i)) {
            eVar.mo4899X();
        }
        this.f3354C = i;
        this.f3355D = Integer.MIN_VALUE;
        mo4685A();
    }

    /* renamed from: d */
    public void mo3890d(RecyclerView recyclerView) {
        this.f3356E.mo4882a();
        mo4685A();
    }

    /* renamed from: j */
    private int m4579j(C0788a0 a0Var) {
        if (mo4732e() == 0) {
            return 0;
        }
        return C0899s.m4999b(a0Var, this.f3370u, mo4869c(!this.f3365N), mo4866b(!this.f3365N), this, this.f3365N);
    }

    /* renamed from: a */
    public void mo4331a(String str) {
        if (this.f3360I == null) {
            super.mo4331a(str);
        }
    }

    /* renamed from: b */
    public int mo4332b(C0788a0 a0Var) {
        return m4578i(a0Var);
    }

    /* renamed from: b */
    public int mo3871b(C0820v vVar, C0788a0 a0Var) {
        if (this.f3372w == 0) {
            return this.f3368s;
        }
        return super.mo3871b(vVar, a0Var);
    }

    /* renamed from: a */
    public void mo4297a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int o = mo4754o() + mo4756p();
        int q = mo4757q() + mo4752n();
        if (this.f3372w == 1) {
            i4 = C0808o.m4303a(i2, rect.height() + q, mo4748l());
            i3 = C0808o.m4303a(i, (this.f3373x * this.f3368s) + o, mo4750m());
        } else {
            i3 = C0808o.m4303a(i, rect.width() + o, mo4750m());
            i4 = C0808o.m4303a(i2, (this.f3373x * this.f3368s) + q, mo4748l());
        }
        mo4723c(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo4866b(boolean z) {
        int f = this.f3370u.mo5120f();
        int b = this.f3370u.mo5112b();
        View view = null;
        for (int e = mo4732e() - 1; e >= 0; e--) {
            View d = mo4729d(e);
            int d2 = this.f3370u.mo5117d(d);
            int a = this.f3370u.mo5110a(d);
            if (a > f && d2 < b) {
                if (a <= b || !z) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    private void m4572b(C0820v vVar, C0788a0 a0Var, boolean z) {
        int v = m4591v(Integer.MAX_VALUE);
        if (v != Integer.MAX_VALUE) {
            int f = v - this.f3370u.mo5120f();
            if (f > 0) {
                int c = f - mo4868c(f, vVar, a0Var);
                if (z && c > 0) {
                    this.f3370u.mo5111a(-c);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4570b(int r5, androidx.recyclerview.widget.RecyclerView.C0788a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.l r0 = r4.f3374y
            r1 = 0
            r0.f3610b = r1
            r0.f3611c = r5
            boolean r0 = r4.mo4764y()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo4534e()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f3352A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.p r5 = r4.f3370u
            int r5 = r5.mo5122g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.p r5 = r4.f3370u
            int r5 = r5.mo5122g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo4737f()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.l r0 = r4.f3374y
            androidx.recyclerview.widget.p r3 = r4.f3370u
            int r3 = r3.mo5120f()
            int r3 = r3 - r6
            r0.f3614f = r3
            androidx.recyclerview.widget.l r6 = r4.f3374y
            androidx.recyclerview.widget.p r0 = r4.f3370u
            int r0 = r0.mo5112b()
            int r0 = r0 + r5
            r6.f3615g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.l r0 = r4.f3374y
            androidx.recyclerview.widget.p r3 = r4.f3370u
            int r3 = r3.mo5109a()
            int r3 = r3 + r5
            r0.f3615g = r3
            androidx.recyclerview.widget.l r5 = r4.f3374y
            int r6 = -r6
            r5.f3614f = r6
        L_0x005d:
            androidx.recyclerview.widget.l r5 = r4.f3374y
            r5.f3616h = r1
            r5.f3609a = r2
            androidx.recyclerview.widget.p r6 = r4.f3370u
            int r6 = r6.mo5116d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.p r6 = r4.f3370u
            int r6 = r6.mo5109a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f3617i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4570b(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: a */
    private void m4566a(C0829b bVar) {
        int i;
        C0834e eVar = this.f3360I;
        int i2 = eVar.f3393V;
        if (i2 > 0) {
            if (i2 == this.f3368s) {
                for (int i3 = 0; i3 < this.f3368s; i3++) {
                    this.f3369t[i3].mo4915c();
                    C0834e eVar2 = this.f3360I;
                    int i4 = eVar2.f3394W[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (eVar2.f3399b0) {
                            i = this.f3370u.mo5112b();
                        } else {
                            i = this.f3370u.mo5120f();
                        }
                        i4 += i;
                    }
                    this.f3369t[i3].mo4919d(i4);
                }
            } else {
                eVar.mo4900Y();
                C0834e eVar3 = this.f3360I;
                eVar3.f3400c = eVar3.f3392U;
            }
        }
        C0834e eVar4 = this.f3360I;
        this.f3359H = eVar4.f3401c0;
        mo4870d(eVar4.f3398a0);
        m4557Q();
        C0834e eVar5 = this.f3360I;
        int i5 = eVar5.f3400c;
        if (i5 != -1) {
            this.f3354C = i5;
            bVar.f3379c = eVar5.f3399b0;
        } else {
            bVar.f3379c = this.f3352A;
        }
        C0834e eVar6 = this.f3360I;
        if (eVar6.f3395X > 1) {
            C0831d dVar = this.f3356E;
            dVar.f3386a = eVar6.f3396Y;
            dVar.f3387b = eVar6.f3397Z;
        }
    }

    /* renamed from: b */
    public void mo3878b(RecyclerView recyclerView, int i, int i2) {
        m4569b(i, i2, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4569b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3352A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4860K()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4859J()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3356E
            r4.mo4891e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3356E
            r9.mo4888b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3356E
            r7.mo4884a(r8, r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3356E
            r9.mo4888b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3356E
            r9.mo4884a(r7, r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.f3352A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.mo4859J()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.mo4860K()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.mo4685A()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4569b(int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4865a(C0788a0 a0Var, C0829b bVar) {
        int i;
        int i2;
        boolean z = false;
        if (!a0Var.mo4536g()) {
            int i3 = this.f3354C;
            if (i3 != -1) {
                if (i3 < 0 || i3 >= a0Var.mo4531b()) {
                    this.f3354C = -1;
                    this.f3355D = Integer.MIN_VALUE;
                } else {
                    C0834e eVar = this.f3360I;
                    if (eVar == null || eVar.f3400c == -1 || eVar.f3393V < 1) {
                        View c = mo4337c(this.f3354C);
                        if (c != null) {
                            if (this.f3352A) {
                                i = mo4860K();
                            } else {
                                i = mo4859J();
                            }
                            bVar.f3377a = i;
                            if (this.f3355D != Integer.MIN_VALUE) {
                                if (bVar.f3379c) {
                                    bVar.f3378b = (this.f3370u.mo5112b() - this.f3355D) - this.f3370u.mo5110a(c);
                                } else {
                                    bVar.f3378b = (this.f3370u.mo5120f() + this.f3355D) - this.f3370u.mo5117d(c);
                                }
                                return true;
                            } else if (this.f3370u.mo5113b(c) > this.f3370u.mo5122g()) {
                                if (bVar.f3379c) {
                                    i2 = this.f3370u.mo5112b();
                                } else {
                                    i2 = this.f3370u.mo5120f();
                                }
                                bVar.f3378b = i2;
                                return true;
                            } else {
                                int d = this.f3370u.mo5117d(c) - this.f3370u.mo5120f();
                                if (d < 0) {
                                    bVar.f3378b = -d;
                                    return true;
                                }
                                int b = this.f3370u.mo5112b() - this.f3370u.mo5110a(c);
                                if (b < 0) {
                                    bVar.f3378b = b;
                                    return true;
                                }
                                bVar.f3378b = Integer.MIN_VALUE;
                            }
                        } else {
                            bVar.f3377a = this.f3354C;
                            int i4 = this.f3355D;
                            if (i4 == Integer.MIN_VALUE) {
                                if (m4580m(bVar.f3377a) == 1) {
                                    z = true;
                                }
                                bVar.f3379c = z;
                                bVar.mo4875a();
                            } else {
                                bVar.mo4876a(i4);
                            }
                            bVar.f3380d = true;
                        }
                    } else {
                        bVar.f3378b = Integer.MIN_VALUE;
                        bVar.f3377a = this.f3354C;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m4571b(C0820v vVar, int i) {
        while (mo4732e() > 0) {
            View d = mo4729d(0);
            if (this.f3370u.mo5110a(d) > i || this.f3370u.mo5119e(d) > i) {
                break;
            }
            C0830c cVar = (C0830c) d.getLayoutParams();
            if (cVar.f3385f) {
                int i2 = 0;
                while (i2 < this.f3368s) {
                    if (this.f3369t[i2].f3402a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3368s; i3++) {
                    this.f3369t[i3].mo4926k();
                }
            } else if (cVar.f3384e.f3402a.size() != 1) {
                cVar.f3384e.mo4926k();
            } else {
                return;
            }
            mo4718b(d, vVar);
        }
    }

    /* renamed from: b */
    public boolean mo3882b() {
        return this.f3372w == 1;
    }

    /* renamed from: b */
    public int mo3870b(int i, C0820v vVar, C0788a0 a0Var) {
        return mo4868c(i, vVar, a0Var);
    }

    /* renamed from: c */
    private boolean m4575c(C0788a0 a0Var, C0829b bVar) {
        int i;
        if (this.f3358G) {
            i = m4587r(a0Var.mo4531b());
        } else {
            i = m4585q(a0Var.mo4531b());
        }
        bVar.f3377a = i;
        bVar.f3378b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: c */
    public int mo4336c(C0788a0 a0Var) {
        return m4579j(a0Var);
    }

    /* renamed from: c */
    private int m4573c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo4869c(boolean z) {
        int f = this.f3370u.mo5120f();
        int b = this.f3370u.mo5112b();
        int e = mo4732e();
        View view = null;
        for (int i = 0; i < e; i++) {
            View d = mo4729d(i);
            int d2 = this.f3370u.mo5117d(d);
            if (this.f3370u.mo5110a(d) > f && d2 < b) {
                if (d2 >= f || !z) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public int mo4325a(C0788a0 a0Var) {
        return m4577h(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4868c(int i, C0820v vVar, C0788a0 a0Var) {
        if (mo4732e() == 0 || i == 0) {
            return 0;
        }
        mo4864a(i, a0Var);
        int a = m4558a(vVar, this.f3374y, a0Var);
        if (this.f3374y.f3610b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f3370u.mo5111a(-i);
        this.f3358G = this.f3352A;
        C0887l lVar = this.f3374y;
        lVar.f3610b = 0;
        m4565a(vVar, lVar);
        return i;
    }

    /* renamed from: a */
    private void m4562a(View view, C0830c cVar, boolean z) {
        if (cVar.f3385f) {
            if (this.f3372w == 1) {
                m4560a(view, this.f3361J, C0808o.m4304a(mo4741h(), mo4744i(), mo4757q() + mo4752n(), cVar.height, true), z);
            } else {
                m4560a(view, C0808o.m4304a(mo4758r(), mo4759s(), mo4754o() + mo4756p(), cVar.width, true), this.f3361J, z);
            }
        } else if (this.f3372w == 1) {
            m4560a(view, C0808o.m4304a(this.f3373x, mo4759s(), 0, cVar.width, false), C0808o.m4304a(mo4741h(), mo4744i(), mo4757q() + mo4752n(), cVar.height, true), z);
        } else {
            m4560a(view, C0808o.m4304a(mo4758r(), mo4759s(), mo4754o() + mo4756p(), cVar.width, true), C0808o.m4304a(this.f3373x, mo4744i(), 0, cVar.height, false), z);
        }
    }

    /* renamed from: c */
    public C0813p mo3884c() {
        if (this.f3372w == 0) {
            return new C0830c(-2, -1);
        }
        return new C0830c(-1, -2);
    }

    /* renamed from: a */
    private void m4560a(View view, int i, int i2, boolean z) {
        boolean z2;
        mo4695a(view, this.f3362K);
        C0830c cVar = (C0830c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f3362K;
        int c = m4573c(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f3362K;
        int c2 = m4573c(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo4720b(view, c, c2, (C0813p) cVar);
        } else {
            z2 = mo4707a(view, c, c2, (C0813p) cVar);
        }
        if (z2) {
            view.measure(c, c2);
        }
    }

    /* renamed from: a */
    public void mo3845a(Parcelable parcelable) {
        if (parcelable instanceof C0834e) {
            this.f3360I = (C0834e) parcelable;
            mo4685A();
        }
    }

    /* renamed from: a */
    public void mo3854a(C0820v vVar, C0788a0 a0Var, View view, C4154d dVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0830c)) {
            super.mo4697a(view, dVar);
            return;
        }
        C0830c cVar = (C0830c) layoutParams;
        if (this.f3372w == 0) {
            dVar.mo14748b((Object) C4157c.m14287a(cVar.mo4879g(), cVar.f3385f ? this.f3368s : 1, -1, -1, cVar.f3385f, false));
        } else {
            dVar.mo14748b((Object) C4157c.m14287a(-1, -1, cVar.mo4879g(), cVar.f3385f ? this.f3368s : 1, cVar.f3385f, false));
        }
    }

    /* renamed from: a */
    public void mo4330a(AccessibilityEvent accessibilityEvent) {
        super.mo4330a(accessibilityEvent);
        if (mo4732e() > 0) {
            View c = mo4869c(false);
            View b = mo4866b(false);
            if (c != null && b != null) {
                int l = mo4749l(c);
                int l2 = mo4749l(b);
                if (l < l2) {
                    accessibilityEvent.setFromIndex(l);
                    accessibilityEvent.setToIndex(l2);
                    return;
                }
                accessibilityEvent.setFromIndex(l2);
                accessibilityEvent.setToIndex(l);
            }
        }
    }

    /* renamed from: a */
    public int mo3835a(C0820v vVar, C0788a0 a0Var) {
        if (this.f3372w == 1) {
            return this.f3368s;
        }
        return super.mo3835a(vVar, a0Var);
    }

    /* renamed from: a */
    private void m4564a(C0820v vVar, C0788a0 a0Var, boolean z) {
        int s = m4588s(Integer.MIN_VALUE);
        if (s != Integer.MIN_VALUE) {
            int b = this.f3370u.mo5112b() - s;
            if (b > 0) {
                int i = b - (-mo4868c(-b, vVar, a0Var));
                if (z && i > 0) {
                    this.f3370u.mo5111a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3856a(RecyclerView recyclerView, int i, int i2) {
        m4569b(i, i2, 1);
    }

    /* renamed from: a */
    public void mo3857a(RecyclerView recyclerView, int i, int i2, int i3) {
        m4569b(i, i2, 8);
    }

    /* renamed from: a */
    public void mo4302a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m4569b(i, i2, 4);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [boolean, int]
      assigns: []
      uses: [boolean, int, ?[int, short, byte, char]]
      mth insns count: 222
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m4558a(androidx.recyclerview.widget.RecyclerView.C0820v r17, androidx.recyclerview.widget.C0887l r18, androidx.recyclerview.widget.RecyclerView.C0788a0 r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.util.BitSet r0 = r6.f3353B
            int r1 = r6.f3368s
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.l r0 = r6.f3374y
            boolean r0 = r0.f3617i
            if (r0 == 0) goto L_0x0025
            int r0 = r8.f3613e
            if (r0 != r10) goto L_0x0020
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0035
        L_0x0020:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0035
        L_0x0025:
            int r0 = r8.f3613e
            if (r0 != r10) goto L_0x002f
            int r0 = r8.f3615g
            int r1 = r8.f3610b
            int r0 = r0 + r1
            goto L_0x0034
        L_0x002f:
            int r0 = r8.f3614f
            int r1 = r8.f3610b
            int r0 = r0 - r1
        L_0x0034:
            r11 = r0
        L_0x0035:
            int r0 = r8.f3613e
            r6.m4576e(r0, r11)
            boolean r0 = r6.f3352A
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.p r0 = r6.f3370u
            int r0 = r0.mo5112b()
            goto L_0x004b
        L_0x0045:
            androidx.recyclerview.widget.p r0 = r6.f3370u
            int r0 = r0.mo5120f()
        L_0x004b:
            r12 = r0
            r0 = 0
        L_0x004d:
            boolean r1 = r18.mo5097a(r19)
            r2 = -1
            if (r1 == 0) goto L_0x01ce
            androidx.recyclerview.widget.l r1 = r6.f3374y
            boolean r1 = r1.f3617i
            if (r1 != 0) goto L_0x0062
            java.util.BitSet r1 = r6.f3353B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ce
        L_0x0062:
            android.view.View r13 = r8.mo5096a(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0830c) r14
            int r0 = r14.mo4772b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f3356E
            int r1 = r1.mo4890d(r0)
            if (r1 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0091
            boolean r1 = r14.f3385f
            if (r1 == 0) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f3369t
            r1 = r1[r9]
            goto L_0x008b
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r1 = r6.m4559a(r8)
        L_0x008b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3356E
            r4.mo4885a(r0, r1)
            goto L_0x0095
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r4 = r6.f3369t
            r1 = r4[r1]
        L_0x0095:
            r15 = r1
            r14.f3384e = r15
            int r1 = r8.f3613e
            if (r1 != r10) goto L_0x00a0
            r6.mo4716b(r13)
            goto L_0x00a3
        L_0x00a0:
            r6.mo4717b(r13, r9)
        L_0x00a3:
            r6.m4562a(r13, r14, r9)
            int r1 = r8.f3613e
            if (r1 != r10) goto L_0x00d4
            boolean r1 = r14.f3385f
            if (r1 == 0) goto L_0x00b3
            int r1 = r6.m4588s(r12)
            goto L_0x00b7
        L_0x00b3:
            int r1 = r15.mo4905a(r12)
        L_0x00b7:
            androidx.recyclerview.widget.p r4 = r6.f3370u
            int r4 = r4.mo5113b(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00d1
            boolean r5 = r14.f3385f
            if (r5 == 0) goto L_0x00d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m4582o(r1)
            r5.f3388U = r2
            r5.f3391c = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3356E
            r9.mo4886a(r5)
        L_0x00d1:
            r5 = r4
            r4 = r1
            goto L_0x00fd
        L_0x00d4:
            boolean r1 = r14.f3385f
            if (r1 == 0) goto L_0x00dd
            int r1 = r6.m4591v(r12)
            goto L_0x00e1
        L_0x00dd:
            int r1 = r15.mo4912b(r12)
        L_0x00e1:
            androidx.recyclerview.widget.p r4 = r6.f3370u
            int r4 = r4.mo5113b(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00fc
            boolean r5 = r14.f3385f
            if (r5 == 0) goto L_0x00fc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m4583p(r1)
            r5.f3388U = r10
            r5.f3391c = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3356E
            r9.mo4886a(r5)
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            boolean r1 = r14.f3385f
            if (r1 == 0) goto L_0x0126
            int r1 = r8.f3612d
            if (r1 != r2) goto L_0x0126
            if (r3 == 0) goto L_0x010a
            r6.f3364M = r10
            goto L_0x0126
        L_0x010a:
            int r1 = r8.f3613e
            if (r1 != r10) goto L_0x0113
            boolean r1 = r16.mo4855F()
            goto L_0x0117
        L_0x0113:
            boolean r1 = r16.mo4856G()
        L_0x0117:
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x0126
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f3356E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r1.mo4889c(r0)
            if (r0 == 0) goto L_0x0124
            r0.f3390W = r10
        L_0x0124:
            r6.f3364M = r10
        L_0x0126:
            r6.m4561a(r13, r14, r8)
            boolean r0 = r16.mo4863N()
            if (r0 == 0) goto L_0x015a
            int r0 = r6.f3372w
            if (r0 != r10) goto L_0x015a
            boolean r0 = r14.f3385f
            if (r0 == 0) goto L_0x013e
            androidx.recyclerview.widget.p r0 = r6.f3371v
            int r0 = r0.mo5112b()
            goto L_0x014f
        L_0x013e:
            androidx.recyclerview.widget.p r0 = r6.f3371v
            int r0 = r0.mo5112b()
            int r1 = r6.f3368s
            int r1 = r1 - r10
            int r2 = r15.f3406e
            int r1 = r1 - r2
            int r2 = r6.f3373x
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x014f:
            androidx.recyclerview.widget.p r1 = r6.f3371v
            int r1 = r1.mo5113b(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x017b
        L_0x015a:
            boolean r0 = r14.f3385f
            if (r0 == 0) goto L_0x0165
            androidx.recyclerview.widget.p r0 = r6.f3371v
            int r0 = r0.mo5120f()
            goto L_0x0172
        L_0x0165:
            int r0 = r15.f3406e
            int r1 = r6.f3373x
            int r0 = r0 * r1
            androidx.recyclerview.widget.p r1 = r6.f3371v
            int r1 = r1.mo5120f()
            int r0 = r0 + r1
        L_0x0172:
            androidx.recyclerview.widget.p r1 = r6.f3371v
            int r1 = r1.mo5113b(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x017b:
            int r0 = r6.f3372w
            if (r0 != r10) goto L_0x0189
            r0 = r16
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
            r0.mo4693a(r1, r2, r3, r4, r5)
            goto L_0x0192
        L_0x0189:
            r0 = r16
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
            r0.mo4693a(r1, r2, r3, r4, r5)
        L_0x0192:
            boolean r0 = r14.f3385f
            if (r0 == 0) goto L_0x019e
            androidx.recyclerview.widget.l r0 = r6.f3374y
            int r0 = r0.f3613e
            r6.m4576e(r0, r11)
            goto L_0x01a5
        L_0x019e:
            androidx.recyclerview.widget.l r0 = r6.f3374y
            int r0 = r0.f3613e
            r6.m4567a(r15, r0, r11)
        L_0x01a5:
            androidx.recyclerview.widget.l r0 = r6.f3374y
            r6.m4565a(r7, r0)
            androidx.recyclerview.widget.l r0 = r6.f3374y
            boolean r0 = r0.f3616h
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r14.f3385f
            if (r0 == 0) goto L_0x01c0
            java.util.BitSet r0 = r6.f3353B
            r0.clear()
            goto L_0x01c9
        L_0x01c0:
            java.util.BitSet r0 = r6.f3353B
            int r1 = r15.f3406e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01ca
        L_0x01c9:
            r3 = 0
        L_0x01ca:
            r0 = 1
            r9 = 0
            goto L_0x004d
        L_0x01ce:
            r3 = 0
            if (r0 != 0) goto L_0x01d6
            androidx.recyclerview.widget.l r0 = r6.f3374y
            r6.m4565a(r7, r0)
        L_0x01d6:
            androidx.recyclerview.widget.l r0 = r6.f3374y
            int r0 = r0.f3613e
            if (r0 != r2) goto L_0x01ee
            androidx.recyclerview.widget.p r0 = r6.f3370u
            int r0 = r0.mo5120f()
            int r0 = r6.m4591v(r0)
            androidx.recyclerview.widget.p r1 = r6.f3370u
            int r1 = r1.mo5120f()
            int r1 = r1 - r0
            goto L_0x0200
        L_0x01ee:
            androidx.recyclerview.widget.p r0 = r6.f3370u
            int r0 = r0.mo5112b()
            int r0 = r6.m4588s(r0)
            androidx.recyclerview.widget.p r1 = r6.f3370u
            int r1 = r1.mo5112b()
            int r1 = r0 - r1
        L_0x0200:
            if (r1 <= 0) goto L_0x0209
            int r0 = r8.f3610b
            int r9 = java.lang.Math.min(r0, r1)
            r3 = r9
        L_0x0209:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4558a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView$a0):int");
    }

    /* renamed from: a */
    private void m4561a(View view, C0830c cVar, C0887l lVar) {
        if (lVar.f3613e == 1) {
            if (cVar.f3385f) {
                m4584p(view);
            } else {
                cVar.f3384e.mo4910a(view);
            }
        } else if (cVar.f3385f) {
            m4586q(view);
        } else {
            cVar.f3384e.mo4917c(view);
        }
    }

    /* renamed from: a */
    private void m4565a(C0820v vVar, C0887l lVar) {
        int i;
        int i2;
        if (lVar.f3609a && !lVar.f3617i) {
            if (lVar.f3610b == 0) {
                if (lVar.f3613e == -1) {
                    m4563a(vVar, lVar.f3615g);
                } else {
                    m4571b(vVar, lVar.f3614f);
                }
            } else if (lVar.f3613e == -1) {
                int i3 = lVar.f3614f;
                int t = i3 - m4589t(i3);
                if (t < 0) {
                    i2 = lVar.f3615g;
                } else {
                    i2 = lVar.f3615g - Math.min(t, lVar.f3610b);
                }
                m4563a(vVar, i2);
            } else {
                int u = m4590u(lVar.f3615g) - lVar.f3615g;
                if (u < 0) {
                    i = lVar.f3614f;
                } else {
                    i = Math.min(u, lVar.f3610b) + lVar.f3614f;
                }
                m4571b(vVar, i);
            }
        }
    }

    /* renamed from: a */
    private void m4567a(C0836f fVar, int i, int i2) {
        int f = fVar.mo4921f();
        if (i == -1) {
            if (fVar.mo4923h() + f <= i2) {
                this.f3353B.set(fVar.f3406e, false);
            }
        } else if (fVar.mo4922g() - f >= i2) {
            this.f3353B.set(fVar.f3406e, false);
        }
    }

    /* renamed from: a */
    private void m4563a(C0820v vVar, int i) {
        for (int e = mo4732e() - 1; e >= 0; e--) {
            View d = mo4729d(e);
            if (this.f3370u.mo5117d(d) < i || this.f3370u.mo5121f(d) < i) {
                break;
            }
            C0830c cVar = (C0830c) d.getLayoutParams();
            if (cVar.f3385f) {
                int i2 = 0;
                while (i2 < this.f3368s) {
                    if (this.f3369t[i2].f3402a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3368s; i3++) {
                    this.f3369t[i3].mo4925j();
                }
            } else if (cVar.f3384e.f3402a.size() != 1) {
                cVar.f3384e.mo4925j();
            } else {
                return;
            }
            mo4718b(d, vVar);
        }
    }

    /* renamed from: a */
    private C0836f m4559a(C0887l lVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m4592w(lVar.f3613e)) {
            i2 = this.f3368s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3368s;
            i = 1;
        }
        C0836f fVar = null;
        if (lVar.f3613e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f = this.f3370u.mo5120f();
            while (i2 != i3) {
                C0836f fVar2 = this.f3369t[i2];
                int a = fVar2.mo4905a(f);
                if (a < i4) {
                    fVar = fVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return fVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b = this.f3370u.mo5112b();
        while (i2 != i3) {
            C0836f fVar3 = this.f3369t[i2];
            int b2 = fVar3.mo4912b(b);
            if (b2 > i5) {
                fVar = fVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return fVar;
    }

    /* renamed from: a */
    public boolean mo3862a() {
        return this.f3372w == 0;
    }

    /* renamed from: a */
    public int mo3833a(int i, C0820v vVar, C0788a0 a0Var) {
        return mo4868c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public PointF mo4327a(int i) {
        int m = m4580m(i);
        PointF pointF = new PointF();
        if (m == 0) {
            return null;
        }
        if (this.f3372w == 0) {
            pointF.x = (float) m;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) m;
        }
        return pointF;
    }

    /* renamed from: a */
    public void mo3858a(RecyclerView recyclerView, C0788a0 a0Var, int i) {
        C0888m mVar = new C0888m(recyclerView.getContext());
        mVar.mo4846c(i);
        mo3877b((C0825z) mVar);
    }

    /* renamed from: a */
    public void mo3841a(int i, int i2, C0788a0 a0Var, C0811c cVar) {
        int i3;
        int i4;
        if (this.f3372w != 0) {
            i = i2;
        }
        if (mo4732e() != 0 && i != 0) {
            mo4864a(i, a0Var);
            int[] iArr = this.f3366O;
            if (iArr == null || iArr.length < this.f3368s) {
                this.f3366O = new int[this.f3368s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3368s; i6++) {
                C0887l lVar = this.f3374y;
                if (lVar.f3612d == -1) {
                    i4 = lVar.f3614f;
                    i3 = this.f3369t[i6].mo4912b(i4);
                } else {
                    i4 = this.f3369t[i6].mo4905a(lVar.f3615g);
                    i3 = this.f3374y.f3615g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3366O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3366O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3374y.mo5097a(a0Var); i8++) {
                cVar.mo4770a(this.f3374y.f3611c, this.f3366O[i8]);
                C0887l lVar2 = this.f3374y;
                lVar2.f3611c += lVar2.f3612d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4864a(int i, C0788a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4860K();
            i2 = 1;
        } else {
            i3 = mo4859J();
            i2 = -1;
        }
        this.f3374y.f3609a = true;
        m4570b(i3, a0Var);
        m4593x(i2);
        C0887l lVar = this.f3374y;
        lVar.f3611c = i3 + lVar.f3612d;
        lVar.f3610b = Math.abs(i);
    }

    /* renamed from: a */
    public C0813p mo3837a(Context context, AttributeSet attributeSet) {
        return new C0830c(context, attributeSet);
    }

    /* renamed from: a */
    public C0813p mo3838a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0830c((MarginLayoutParams) layoutParams);
        }
        return new C0830c(layoutParams);
    }

    /* renamed from: a */
    public boolean mo4303a(C0813p pVar) {
        return pVar instanceof C0830c;
    }

    /* renamed from: a */
    public View mo4295a(View view, int i, C0820v vVar, C0788a0 a0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (mo4732e() == 0) {
            return null;
        }
        View c = mo4722c(view);
        if (c == null) {
            return null;
        }
        m4557Q();
        int n = m4581n(i);
        if (n == Integer.MIN_VALUE) {
            return null;
        }
        C0830c cVar = (C0830c) c.getLayoutParams();
        boolean z = cVar.f3385f;
        C0836f fVar = cVar.f3384e;
        if (n == 1) {
            i2 = mo4860K();
        } else {
            i2 = mo4859J();
        }
        m4570b(i2, a0Var);
        m4593x(n);
        C0887l lVar = this.f3374y;
        lVar.f3611c = lVar.f3612d + i2;
        lVar.f3610b = (int) (((float) this.f3370u.mo5122g()) * 0.33333334f);
        C0887l lVar2 = this.f3374y;
        lVar2.f3616h = true;
        lVar2.f3609a = false;
        m4558a(vVar, lVar2, a0Var);
        this.f3358G = this.f3352A;
        if (!z) {
            View a = fVar.mo4908a(i2, n);
            if (!(a == null || a == c)) {
                return a;
            }
        }
        if (m4592w(n)) {
            for (int i6 = this.f3368s - 1; i6 >= 0; i6--) {
                View a2 = this.f3369t[i6].mo4908a(i2, n);
                if (a2 != null && a2 != c) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f3368s; i7++) {
                View a3 = this.f3369t[i7].mo4908a(i2, n);
                if (a3 != null && a3 != c) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f3375z ^ true) == (n == -1);
        if (!z) {
            if (z2) {
                i5 = fVar.mo4918d();
            } else {
                i5 = fVar.mo4920e();
            }
            View c2 = mo4337c(i5);
            if (!(c2 == null || c2 == c)) {
                return c2;
            }
        }
        if (m4592w(n)) {
            for (int i8 = this.f3368s - 1; i8 >= 0; i8--) {
                if (i8 != fVar.f3406e) {
                    if (z2) {
                        i4 = this.f3369t[i8].mo4918d();
                    } else {
                        i4 = this.f3369t[i8].mo4920e();
                    }
                    View c3 = mo4337c(i4);
                    if (!(c3 == null || c3 == c)) {
                        return c3;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f3368s; i9++) {
                if (z2) {
                    i3 = this.f3369t[i9].mo4918d();
                } else {
                    i3 = this.f3369t[i9].mo4920e();
                }
                View c4 = mo4337c(i3);
                if (c4 != null && c4 != c) {
                    return c4;
                }
            }
        }
        return null;
    }
}
