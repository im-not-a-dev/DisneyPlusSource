package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.p015s.C1264a;
import com.airbnb.lottie.p015s.C1265b;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.C1274h;
import com.airbnb.lottie.p016t.p019l.C1317b;
import com.airbnb.lottie.p021v.C1362s;
import com.airbnb.lottie.p022w.C1372c;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.airbnb.lottie.f */
/* compiled from: LottieDrawable */
public class C1191f extends Drawable implements Callback, Animatable {

    /* renamed from: j0 */
    private static final String f4470j0 = C1191f.class.getSimpleName();

    /* renamed from: U */
    private C1182d f4471U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C1372c f4472V = new C1372c();

    /* renamed from: W */
    private float f4473W = 1.0f;

    /* renamed from: X */
    private final ArrayList<C1206o> f4474X;

    /* renamed from: Y */
    private C1265b f4475Y;

    /* renamed from: Z */
    private String f4476Z;

    /* renamed from: a0 */
    private C1180b f4477a0;

    /* renamed from: b0 */
    private C1264a f4478b0;

    /* renamed from: c */
    private final Matrix f4479c = new Matrix();

    /* renamed from: c0 */
    C1179a f4480c0;

    /* renamed from: d0 */
    C1221q f4481d0;

    /* renamed from: e0 */
    private boolean f4482e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C1317b f4483f0;

    /* renamed from: g0 */
    private int f4484g0;

    /* renamed from: h0 */
    private boolean f4485h0;

    /* renamed from: i0 */
    private boolean f4486i0;

    /* renamed from: com.airbnb.lottie.f$a */
    /* compiled from: LottieDrawable */
    class C1192a implements C1206o {

        /* renamed from: a */
        final /* synthetic */ String f4487a;

        C1192a(String str) {
            this.f4487a = str;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6082d(this.f4487a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$b */
    /* compiled from: LottieDrawable */
    class C1193b implements C1206o {

        /* renamed from: a */
        final /* synthetic */ int f4489a;

        /* renamed from: b */
        final /* synthetic */ int f4490b;

        C1193b(int i, int i2) {
            this.f4489a = i;
            this.f4490b = i2;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6061a(this.f4489a, this.f4490b);
        }
    }

    /* renamed from: com.airbnb.lottie.f$c */
    /* compiled from: LottieDrawable */
    class C1194c implements C1206o {

        /* renamed from: a */
        final /* synthetic */ int f4492a;

        C1194c(int i) {
            this.f4492a = i;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6060a(this.f4492a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$d */
    /* compiled from: LottieDrawable */
    class C1195d implements C1206o {

        /* renamed from: a */
        final /* synthetic */ float f4494a;

        C1195d(float f) {
            this.f4494a = f;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6075c(this.f4494a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$e */
    /* compiled from: LottieDrawable */
    class C1196e implements C1206o {

        /* renamed from: a */
        final /* synthetic */ C1271e f4496a;

        /* renamed from: b */
        final /* synthetic */ Object f4497b;

        /* renamed from: c */
        final /* synthetic */ C1378c f4498c;

        C1196e(C1271e eVar, Object obj, C1378c cVar) {
            this.f4496a = eVar;
            this.f4497b = obj;
            this.f4498c = cVar;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6067a(this.f4496a, this.f4497b, this.f4498c);
        }
    }

    /* renamed from: com.airbnb.lottie.f$f */
    /* compiled from: LottieDrawable */
    class C1197f implements AnimatorUpdateListener {
        C1197f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C1191f.this.f4483f0 != null) {
                C1191f.this.f4483f0.mo6335a(C1191f.this.f4472V.mo6402f());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.f$g */
    /* compiled from: LottieDrawable */
    class C1198g implements C1206o {
        C1198g() {
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6108s();
        }
    }

    /* renamed from: com.airbnb.lottie.f$h */
    /* compiled from: LottieDrawable */
    class C1199h implements C1206o {
        C1199h() {
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6114t();
        }
    }

    /* renamed from: com.airbnb.lottie.f$i */
    /* compiled from: LottieDrawable */
    class C1200i implements C1206o {

        /* renamed from: a */
        final /* synthetic */ int f4503a;

        C1200i(int i) {
            this.f4503a = i;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6076c(this.f4503a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$j */
    /* compiled from: LottieDrawable */
    class C1201j implements C1206o {

        /* renamed from: a */
        final /* synthetic */ float f4505a;

        C1201j(float f) {
            this.f4505a = f;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6071b(this.f4505a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$k */
    /* compiled from: LottieDrawable */
    class C1202k implements C1206o {

        /* renamed from: a */
        final /* synthetic */ int f4507a;

        C1202k(int i) {
            this.f4507a = i;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6072b(this.f4507a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$l */
    /* compiled from: LottieDrawable */
    class C1203l implements C1206o {

        /* renamed from: a */
        final /* synthetic */ float f4509a;

        C1203l(float f) {
            this.f4509a = f;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6059a(this.f4509a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$m */
    /* compiled from: LottieDrawable */
    class C1204m implements C1206o {

        /* renamed from: a */
        final /* synthetic */ String f4511a;

        C1204m(String str) {
            this.f4511a = str;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6087e(this.f4511a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$n */
    /* compiled from: LottieDrawable */
    class C1205n implements C1206o {

        /* renamed from: a */
        final /* synthetic */ String f4513a;

        C1205n(String str) {
            this.f4513a = str;
        }

        /* renamed from: a */
        public void mo6117a(C1182d dVar) {
            C1191f.this.mo6077c(this.f4513a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$o */
    /* compiled from: LottieDrawable */
    private interface C1206o {
        /* renamed from: a */
        void mo6117a(C1182d dVar);
    }

    public C1191f() {
        new HashSet();
        this.f4474X = new ArrayList<>();
        this.f4484g0 = 255;
        this.f4486i0 = false;
        this.f4472V.addUpdateListener(new C1197f());
    }

    /* renamed from: v */
    private void m6080v() {
        this.f4483f0 = new C1317b(this, C1362s.m6673a(this.f4471U), this.f4471U.mo6042i(), this.f4471U);
    }

    /* renamed from: w */
    private Context m6081w() {
        Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: x */
    private C1264a m6082x() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f4478b0 == null) {
            this.f4478b0 = new C1264a(getCallback(), this.f4480c0);
        }
        return this.f4478b0;
    }

    /* renamed from: y */
    private C1265b m6083y() {
        if (getCallback() == null) {
            return null;
        }
        C1265b bVar = this.f4475Y;
        if (bVar != null && !bVar.mo6194a(m6081w())) {
            this.f4475Y = null;
        }
        if (this.f4475Y == null) {
            this.f4475Y = new C1265b(getCallback(), this.f4476Z, this.f4477a0, this.f4471U.mo6041h());
        }
        return this.f4475Y;
    }

    /* renamed from: z */
    private void m6084z() {
        if (this.f4471U != null) {
            float n = mo6103n();
            setBounds(0, 0, (int) (((float) this.f4471U.mo6026a().width()) * n), (int) (((float) this.f4471U.mo6026a().height()) * n));
        }
    }

    /* renamed from: c */
    public boolean mo6078c() {
        return this.f4482e0;
    }

    /* renamed from: d */
    public void mo6079d() {
        this.f4474X.clear();
        this.f4472V.mo6401e();
    }

    public void draw(Canvas canvas) {
        float f;
        this.f4486i0 = false;
        String str = "Drawable#draw";
        C1181c.m6032a(str);
        if (this.f4483f0 != null) {
            float f2 = this.f4473W;
            float a = m6077a(canvas);
            if (f2 > a) {
                f = this.f4473W / a;
            } else {
                a = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f4471U.mo6026a().width()) / 2.0f;
                float height = ((float) this.f4471U.mo6026a().height()) / 2.0f;
                float f3 = width * a;
                float f4 = height * a;
                canvas.translate((mo6103n() * width) - f3, (mo6103n() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f4479c.reset();
            this.f4479c.preScale(a, a);
            this.f4483f0.mo6142a(canvas, this.f4479c, this.f4484g0);
            C1181c.m6034c(str);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e */
    public void mo6087e(String str) {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            this.f4474X.add(new C1204m(str));
            return;
        }
        C1274h b = dVar.mo6032b(str);
        if (b != null) {
            mo6076c((int) b.f4781b);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public int mo6088f() {
        return (int) this.f4472V.mo6403g();
    }

    /* renamed from: g */
    public String mo6089g() {
        return this.f4476Z;
    }

    public int getAlpha() {
        return this.f4484g0;
    }

    public int getIntrinsicHeight() {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo6026a().height()) * mo6103n());
    }

    public int getIntrinsicWidth() {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo6026a().width()) * mo6103n());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float mo6094h() {
        return this.f4472V.mo6407h();
    }

    /* renamed from: i */
    public float mo6095i() {
        return this.f4472V.mo6408i();
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f4486i0) {
            this.f4486i0 = true;
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo6106q();
    }

    /* renamed from: j */
    public C1215m mo6099j() {
        C1182d dVar = this.f4471U;
        if (dVar != null) {
            return dVar.mo6044k();
        }
        return null;
    }

    /* renamed from: k */
    public float mo6100k() {
        return this.f4472V.mo6402f();
    }

    /* renamed from: l */
    public int mo6101l() {
        return this.f4472V.getRepeatCount();
    }

    /* renamed from: m */
    public int mo6102m() {
        return this.f4472V.getRepeatMode();
    }

    /* renamed from: n */
    public float mo6103n() {
        return this.f4473W;
    }

    /* renamed from: o */
    public float mo6104o() {
        return this.f4472V.mo6410j();
    }

    /* renamed from: p */
    public C1221q mo6105p() {
        return this.f4481d0;
    }

    /* renamed from: q */
    public boolean mo6106q() {
        return this.f4472V.isRunning();
    }

    /* renamed from: r */
    public void mo6107r() {
        this.f4474X.clear();
        this.f4472V.mo6411k();
    }

    /* renamed from: s */
    public void mo6108s() {
        if (this.f4483f0 == null) {
            this.f4474X.add(new C1198g());
        } else {
            this.f4472V.mo6412l();
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        this.f4484g0 = i;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Log.w("LOTTIE", "Use addColorFilter instead.");
    }

    public void start() {
        mo6108s();
    }

    public void stop() {
        mo6079d();
    }

    /* renamed from: t */
    public void mo6114t() {
        if (this.f4483f0 == null) {
            this.f4474X.add(new C1199h());
        } else {
            this.f4472V.mo6415o();
        }
    }

    /* renamed from: u */
    public boolean mo6115u() {
        return this.f4481d0 == null && this.f4471U.mo6033b().mo14175b() > 0;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public void mo6068a(boolean z) {
        if (this.f4482e0 != z) {
            if (VERSION.SDK_INT < 19) {
                Log.w(f4470j0, "Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f4482e0 = z;
            if (this.f4471U != null) {
                m6080v();
            }
        }
    }

    /* renamed from: b */
    public void mo6073b(String str) {
        this.f4476Z = str;
    }

    /* renamed from: c */
    public void mo6076c(int i) {
        if (this.f4471U == null) {
            this.f4474X.add(new C1200i(i));
        } else {
            this.f4472V.mo6396b(i);
        }
    }

    /* renamed from: b */
    public void mo6074b(boolean z) {
        this.f4485h0 = z;
        C1182d dVar = this.f4471U;
        if (dVar != null) {
            dVar.mo6034b(z);
        }
    }

    /* renamed from: d */
    public void mo6082d(String str) {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            this.f4474X.add(new C1192a(str));
            return;
        }
        C1274h b = dVar.mo6032b(str);
        if (b != null) {
            int i = (int) b.f4781b;
            mo6061a(i, ((int) b.f4782c) + i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public void mo6077c(String str) {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            this.f4474X.add(new C1205n(str));
            return;
        }
        C1274h b = dVar.mo6032b(str);
        if (b != null) {
            mo6072b((int) (b.f4781b + b.f4782c));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo6070b() {
        if (this.f4472V.isRunning()) {
            this.f4472V.cancel();
        }
        this.f4471U = null;
        this.f4483f0 = null;
        this.f4475Y = null;
        this.f4472V.mo6399d();
        invalidateSelf();
    }

    /* renamed from: e */
    public void mo6085e(float f) {
        this.f4472V.mo6395b(f);
    }

    /* renamed from: e */
    public void mo6086e(int i) {
        this.f4472V.setRepeatMode(i);
    }

    /* renamed from: a */
    public boolean mo6069a(C1182d dVar) {
        if (this.f4471U == dVar) {
            return false;
        }
        this.f4486i0 = false;
        mo6070b();
        this.f4471U = dVar;
        m6080v();
        this.f4472V.mo6394a(dVar);
        mo6075c(this.f4472V.getAnimatedFraction());
        mo6080d(this.f4473W);
        m6084z();
        Iterator it = new ArrayList(this.f4474X).iterator();
        while (it.hasNext()) {
            ((C1206o) it.next()).mo6117a(dVar);
            it.remove();
        }
        this.f4474X.clear();
        dVar.mo6034b(this.f4485h0);
        return true;
    }

    /* renamed from: e */
    public C1182d mo6084e() {
        return this.f4471U;
    }

    /* renamed from: d */
    public void mo6081d(int i) {
        this.f4472V.setRepeatCount(i);
    }

    /* renamed from: c */
    public void mo6075c(float f) {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            this.f4474X.add(new C1195d(f));
        } else {
            mo6060a((int) C1374e.m6731c(dVar.mo6045l(), this.f4471U.mo6038e(), f));
        }
    }

    /* renamed from: d */
    public void mo6080d(float f) {
        this.f4473W = f;
        m6084z();
    }

    /* renamed from: b */
    public void mo6071b(float f) {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            this.f4474X.add(new C1201j(f));
        } else {
            mo6076c((int) C1374e.m6731c(dVar.mo6045l(), this.f4471U.mo6038e(), f));
        }
    }

    /* renamed from: b */
    public void mo6072b(int i) {
        if (this.f4471U == null) {
            this.f4474X.add(new C1202k(i));
        } else {
            this.f4472V.mo6391a(((float) i) + 0.99f);
        }
    }

    /* renamed from: a */
    public void mo6059a(float f) {
        C1182d dVar = this.f4471U;
        if (dVar == null) {
            this.f4474X.add(new C1203l(f));
        } else {
            mo6072b((int) C1374e.m6731c(dVar.mo6045l(), this.f4471U.mo6038e(), f));
        }
    }

    /* renamed from: a */
    public void mo6061a(int i, int i2) {
        if (this.f4471U == null) {
            this.f4474X.add(new C1193b(i, i2));
        } else {
            this.f4472V.mo6392a((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: a */
    public void mo6063a(AnimatorUpdateListener animatorUpdateListener) {
        this.f4472V.addUpdateListener(animatorUpdateListener);
    }

    /* renamed from: a */
    public void mo6062a(AnimatorListener animatorListener) {
        this.f4472V.addListener(animatorListener);
    }

    /* renamed from: a */
    public void mo6060a(int i) {
        if (this.f4471U == null) {
            this.f4474X.add(new C1194c(i));
        } else {
            this.f4472V.mo6393a(i);
        }
    }

    /* renamed from: a */
    public void mo6065a(C1180b bVar) {
        this.f4477a0 = bVar;
        C1265b bVar2 = this.f4475Y;
        if (bVar2 != null) {
            bVar2.mo6193a(bVar);
        }
    }

    /* renamed from: a */
    public void mo6064a(C1179a aVar) {
        this.f4480c0 = aVar;
        C1264a aVar2 = this.f4478b0;
        if (aVar2 != null) {
            aVar2.mo6191a(aVar);
        }
    }

    /* renamed from: a */
    public void mo6066a(C1221q qVar) {
        this.f4481d0 = qVar;
    }

    /* renamed from: a */
    public void mo6058a() {
        this.f4474X.clear();
        this.f4472V.cancel();
    }

    /* renamed from: a */
    public List<C1271e> mo6057a(C1271e eVar) {
        if (this.f4483f0 == null) {
            Log.w("LOTTIE", "Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f4483f0.mo6144a(eVar, 0, (List<C1271e>) arrayList, new C1271e(new String[0]));
        return arrayList;
    }

    /* renamed from: a */
    public <T> void mo6067a(C1271e eVar, T t, C1378c<T> cVar) {
        if (this.f4483f0 == null) {
            this.f4474X.add(new C1196e(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar.mo6210a() != null) {
            eVar.mo6210a().mo6145a(t, cVar);
        } else {
            List a = mo6057a(eVar);
            for (int i = 0; i < a.size(); i++) {
                ((C1271e) a.get(i)).mo6210a().mo6145a(t, cVar);
            }
            z = true ^ a.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == C1210j.f4518A) {
                mo6075c(mo6100k());
            }
        }
    }

    /* renamed from: a */
    public Bitmap mo6055a(String str) {
        C1265b y = m6083y();
        if (y != null) {
            return y.mo6192a(str);
        }
        return null;
    }

    /* renamed from: a */
    public Typeface mo6056a(String str, String str2) {
        C1264a x = m6082x();
        if (x != null) {
            return x.mo6190a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    private float m6077a(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f4471U.mo6026a().width()), ((float) canvas.getHeight()) / ((float) this.f4471U.mo6026a().height()));
    }
}
