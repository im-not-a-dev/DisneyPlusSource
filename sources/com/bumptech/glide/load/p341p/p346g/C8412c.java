package com.bumptech.glide.load.p341p.p346g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p341p.p346g.C8417g.C8419b;
import java.nio.ByteBuffer;
import java.util.List;
import p096e.p158r.p159a.p160a.C4357b;
import p096e.p158r.p159a.p160a.C4357b.C4358a;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.p416q.C10680a;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.p.g.c */
/* compiled from: GifDrawable */
public class C8412c extends Drawable implements C8419b, Animatable, C4357b {

    /* renamed from: U */
    private boolean f17915U;

    /* renamed from: V */
    private boolean f17916V;

    /* renamed from: W */
    private boolean f17917W;

    /* renamed from: X */
    private boolean f17918X;

    /* renamed from: Y */
    private int f17919Y;

    /* renamed from: Z */
    private int f17920Z;

    /* renamed from: a0 */
    private boolean f17921a0;

    /* renamed from: b0 */
    private Paint f17922b0;

    /* renamed from: c */
    private final C8413a f17923c;

    /* renamed from: c0 */
    private Rect f17924c0;

    /* renamed from: d0 */
    private List<C4358a> f17925d0;

    /* renamed from: com.bumptech.glide.load.p.g.c$a */
    /* compiled from: GifDrawable */
    static final class C8413a extends ConstantState {

        /* renamed from: a */
        final C8417g f17926a;

        C8413a(C8417g gVar) {
            this.f17926a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C8412c(this);
        }
    }

    public C8412c(Context context, C10680a aVar, C8118l<Bitmap> lVar, int i, int i2, Bitmap bitmap) {
        C8417g gVar = new C8417g(C10652e.m33418b(context), aVar, i, i2, lVar, bitmap);
        this(new C8413a(gVar));
    }

    /* renamed from: h */
    private Callback m24461h() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: i */
    private Rect m24462i() {
        if (this.f17924c0 == null) {
            this.f17924c0 = new Rect();
        }
        return this.f17924c0;
    }

    /* renamed from: j */
    private Paint m24463j() {
        if (this.f17922b0 == null) {
            this.f17922b0 = new Paint(2);
        }
        return this.f17922b0;
    }

    /* renamed from: k */
    private void m24464k() {
        List<C4358a> list = this.f17925d0;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C4358a) this.f17925d0.get(i)).mo15240a(this);
            }
        }
    }

    /* renamed from: l */
    private void m24465l() {
        this.f17919Y = 0;
    }

    /* renamed from: m */
    private void m24466m() {
        C10774j.m34016a(!this.f17917W, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f17923c.f17926a.mo21628f() == 1) {
            invalidateSelf();
        } else if (!this.f17915U) {
            this.f17915U = true;
            this.f17923c.f17926a.mo21622a((C8419b) this);
            invalidateSelf();
        }
    }

    /* renamed from: n */
    private void m24467n() {
        this.f17915U = false;
        this.f17923c.f17926a.mo21624b(this);
    }

    /* renamed from: a */
    public void mo21596a(C8118l<Bitmap> lVar, Bitmap bitmap) {
        this.f17923c.f17926a.mo21620a(lVar, bitmap);
    }

    /* renamed from: b */
    public ByteBuffer mo21597b() {
        return this.f17923c.f17926a.mo21623b();
    }

    /* renamed from: c */
    public Bitmap mo21598c() {
        return this.f17923c.f17926a.mo21627e();
    }

    /* renamed from: d */
    public int mo21599d() {
        return this.f17923c.f17926a.mo21628f();
    }

    public void draw(Canvas canvas) {
        if (!this.f17917W) {
            if (this.f17921a0) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m24462i());
                this.f17921a0 = false;
            }
            canvas.drawBitmap(this.f17923c.f17926a.mo21625c(), null, m24462i(), m24463j());
        }
    }

    /* renamed from: e */
    public int mo21601e() {
        return this.f17923c.f17926a.mo21626d();
    }

    /* renamed from: f */
    public int mo21602f() {
        return this.f17923c.f17926a.mo21630h();
    }

    /* renamed from: g */
    public void mo21603g() {
        this.f17917W = true;
        this.f17923c.f17926a.mo21619a();
    }

    public ConstantState getConstantState() {
        return this.f17923c;
    }

    public int getIntrinsicHeight() {
        return this.f17923c.f17926a.mo21629g();
    }

    public int getIntrinsicWidth() {
        return this.f17923c.f17926a.mo21631i();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f17915U;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17921a0 = true;
    }

    public void setAlpha(int i) {
        m24463j().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m24463j().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C10774j.m34016a(!this.f17917W, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f17918X = z;
        if (!z) {
            m24467n();
        } else if (this.f17916V) {
            m24466m();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f17916V = true;
        m24465l();
        if (this.f17918X) {
            m24466m();
        }
    }

    public void stop() {
        this.f17916V = false;
        m24467n();
    }

    /* renamed from: a */
    public void mo21595a() {
        if (m24461h() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo21601e() == mo21599d() - 1) {
            this.f17919Y++;
        }
        int i = this.f17920Z;
        if (i != -1 && this.f17919Y >= i) {
            m24464k();
            stop();
        }
    }

    C8412c(C8413a aVar) {
        this.f17918X = true;
        this.f17920Z = -1;
        C10774j.m34012a(aVar);
        this.f17923c = aVar;
    }
}
