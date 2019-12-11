package p163g.p174d.p178b.p185g0.p189y5;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.p179a0.C4817a;
import p163g.p174d.p178b.p196m0.C5306d;
import p163g.p174d.p178b.p196m0.C5307e;

/* renamed from: g.d.b.g0.y5.g */
/* compiled from: TrickPlayView.kt */
public final class C5252g {

    /* renamed from: a */
    private boolean f12601a;

    /* renamed from: b */
    private float f12602b;

    /* renamed from: c */
    private boolean f12603c = true;

    /* renamed from: d */
    private final int[] f12604d;

    /* renamed from: e */
    private final View f12605e;

    /* renamed from: f */
    private final TextView f12606f;

    /* renamed from: g */
    private final boolean f12607g;

    /* renamed from: h */
    private final ImageView f12608h;

    /* renamed from: i */
    private final ImageView f12609i;

    /* renamed from: j */
    private final ImageView f12610j;

    /* renamed from: k */
    private final C5232d f12611k;

    /* renamed from: l */
    private final long f12612l;

    /* renamed from: m */
    private final long f12613m;

    /* renamed from: n */
    private final ProgressBar f12614n;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5252g(android.view.View r1, android.widget.TextView r2, boolean r3, android.widget.ImageView r4, android.widget.ImageView r5, p163g.p174d.p178b.C5294k r6, android.widget.ImageView r7, p163g.p174d.p178b.p185g0.p189y5.C5232d r8, long r9, long r11, android.widget.ProgressBar r13) {
        /*
            r0 = this;
            r0.<init>()
            r0.f12605e = r1
            r0.f12606f = r2
            r0.f12607g = r3
            r0.f12608h = r4
            r0.f12609i = r5
            r0.f12610j = r7
            r0.f12611k = r8
            r0.f12612l = r9
            r0.f12613m = r11
            r0.f12614n = r13
            r1 = 1
            r0.f12603c = r1
            if (r6 == 0) goto L_0x0023
            int[] r1 = r6.mo16888a()
            if (r1 == 0) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r1 = 0
            int[] r1 = new int[r1]
        L_0x0026:
            r0.f12604d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p185g0.p189y5.C5252g.<init>(android.view.View, android.widget.TextView, boolean, android.widget.ImageView, android.widget.ImageView, g.d.b.k, android.widget.ImageView, g.d.b.g0.y5.d, long, long, android.widget.ProgressBar):void");
    }

    /* renamed from: a */
    public final void mo16769a(boolean z) {
        this.f12601a = z;
        if (!z) {
            mo16773b(this.f12605e);
            mo16773b((View) this.f12610j);
        }
    }

    /* renamed from: b */
    public final void mo16771b() {
        mo16774c(this.f12605e);
        mo16774c(this.f12610j);
        mo16766a(1);
        this.f12603c = true;
    }

    /* renamed from: c */
    public final void mo16774c(View view) {
        if (view != null) {
            C5307e.m17961a(view);
        }
    }

    /* renamed from: a */
    public final float mo16763a(View view, int i) {
        if ((view != null ? view.getParent() : null) == null || !(view.getParent() instanceof View)) {
            return 0.0f;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            return m17612a(this.f12602b, (float) i, ((View) parent).getWidth());
        }
        throw new C13142s("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: b */
    public final void mo16772b(long j) {
        if (this.f12601a) {
            this.f12602b = mo16762a(j);
            TextView textView = this.f12606f;
            if (textView != null) {
                textView.setText(C5306d.m17959a(j, this.f12607g));
            }
            View view = this.f12605e;
            if (view != null) {
                view.setTranslationX(mo16763a(view, view != null ? view.getWidth() : 0));
            }
            mo16768a(this.f12605e);
        }
    }

    /* renamed from: a */
    private final float m17612a(float f, float f2, int i) {
        return Math.max(0.0f, Math.min(f - (f2 / 2.0f), ((float) i) - f2));
    }

    /* renamed from: b */
    public final void mo16773b(View view) {
        if (view != null) {
            C5307e.m17962a(view, this.f12612l);
        }
    }

    /* renamed from: a */
    public final void mo16767a(Bitmap bitmap) {
        if (this.f12601a) {
            ImageView imageView = this.f12610j;
            if (imageView == null) {
                return;
            }
            if (C12880j.m40224a((Object) bitmap, (Object) C4817a.f11967f.mo16212b()) || C12880j.m40224a((Object) bitmap, (Object) C4817a.f11967f.mo16211a()) || bitmap.getHeight() == 0) {
                mo16773b((View) imageView);
                return;
            }
            imageView.setTranslationX(mo16763a((View) this.f12610j, mo16765a(imageView, bitmap)));
            imageView.setImageBitmap(bitmap);
            imageView.invalidate();
            mo16768a((View) imageView);
        }
    }

    /* renamed from: a */
    public final int mo16765a(ImageView imageView, Bitmap bitmap) {
        if (!this.f12603c) {
            return imageView.getWidth();
        }
        Point a = this.f12611k.mo16744a(((float) bitmap.getWidth()) / ((float) bitmap.getHeight()));
        imageView.getLayoutParams().width = a.x;
        imageView.getLayoutParams().height = a.y;
        imageView.requestLayout();
        this.f12603c = false;
        return a.x;
    }

    /* renamed from: a */
    public final boolean mo16770a() {
        return (this.f12606f == null || this.f12605e == null || this.f12614n == null || this.f12610j == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo16768a(View view) {
        if (view != null) {
            C5307e.m17964a(view, this.f12613m, null, 2, null);
        }
    }

    /* renamed from: a */
    public final float mo16762a(long j) {
        return mo16764a(this.f12614n, j);
    }

    /* renamed from: a */
    public final void mo16766a(int i) {
        if (this.f12608h != null && this.f12609i != null) {
            int c = C13174k.m40395c(this.f12604d, Math.abs(i));
            if (c == -1) {
                this.f12608h.setVisibility(4);
                this.f12609i.setVisibility(4);
            } else if (i > 0) {
                this.f12608h.setVisibility(4);
                this.f12609i.setVisibility(0);
                this.f12609i.setImageLevel(c);
            } else {
                this.f12609i.setVisibility(4);
                this.f12608h.setVisibility(0);
                this.f12608h.setImageLevel(c);
            }
        }
    }

    /* renamed from: a */
    public final float mo16764a(ProgressBar progressBar, long j) {
        if (progressBar == null) {
            return 0.0f;
        }
        return progressBar.getX() + ((float) progressBar.getPaddingLeft()) + (((((float) progressBar.getWidth()) - ((float) progressBar.getPaddingLeft())) - ((float) progressBar.getPaddingRight())) * (((float) j) / ((float) progressBar.getMax())));
    }
}
