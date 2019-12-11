package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.view.View.BaseSavedState;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p023x.C1378c;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: k0 */
    private static final String f4414k0 = LottieAnimationView.class.getSimpleName();

    /* renamed from: V */
    private final C1208h<C1182d> f4415V = new C1174a();

    /* renamed from: W */
    private final C1208h<Throwable> f4416W = new C1175b(this);

    /* renamed from: a0 */
    private final C1191f f4417a0 = new C1191f();

    /* renamed from: b0 */
    private String f4418b0;

    /* renamed from: c0 */
    private int f4419c0;

    /* renamed from: d0 */
    private boolean f4420d0 = false;

    /* renamed from: e0 */
    private boolean f4421e0 = false;

    /* renamed from: f0 */
    private boolean f4422f0 = false;

    /* renamed from: g0 */
    private C1219o f4423g0 = C1219o.AUTOMATIC;

    /* renamed from: h0 */
    private Set<C1209i> f4424h0 = new HashSet();

    /* renamed from: i0 */
    private C1212l<C1182d> f4425i0;

    /* renamed from: j0 */
    private C1182d f4426j0;

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    class C1174a implements C1208h<C1182d> {
        C1174a() {
        }

        /* renamed from: a */
        public void mo6018a(C1182d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    class C1175b implements C1208h<Throwable> {
        C1175b(LottieAnimationView lottieAnimationView) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo6018a(Object obj) {
            mo6019a((Throwable) obj);
            throw null;
        }

        /* renamed from: a */
        public void mo6019a(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    static /* synthetic */ class C1176c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4428a = new int[C1219o.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.airbnb.lottie.o[] r0 = com.airbnb.lottie.C1219o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4428a = r0
                int[] r0 = f4428a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.o r1 = com.airbnb.lottie.C1219o.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4428a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.o r1 = com.airbnb.lottie.C1219o.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4428a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.o r1 = com.airbnb.lottie.C1219o.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C1176c.<clinit>():void");
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    private static class C1177d extends BaseSavedState {
        public static final Creator<C1177d> CREATOR = new C1178a();

        /* renamed from: U */
        int f4429U;

        /* renamed from: V */
        float f4430V;

        /* renamed from: W */
        boolean f4431W;

        /* renamed from: X */
        String f4432X;

        /* renamed from: Y */
        int f4433Y;

        /* renamed from: Z */
        int f4434Z;

        /* renamed from: c */
        String f4435c;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$d$a */
        static class C1178a implements Creator<C1177d> {
            C1178a() {
            }

            public C1177d createFromParcel(Parcel parcel) {
                return new C1177d(parcel, null);
            }

            public C1177d[] newArray(int i) {
                return new C1177d[i];
            }
        }

        /* synthetic */ C1177d(Parcel parcel, C1174a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4435c);
            parcel.writeFloat(this.f4430V);
            parcel.writeInt(this.f4431W ? 1 : 0);
            parcel.writeString(this.f4432X);
            parcel.writeInt(this.f4433Y);
            parcel.writeInt(this.f4434Z);
        }

        C1177d(Parcelable parcelable) {
            super(parcelable);
        }

        private C1177d(Parcel parcel) {
            super(parcel);
            this.f4435c = parcel.readString();
            this.f4430V = parcel.readFloat();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f4431W = z;
            this.f4432X = parcel.readString();
            this.f4433Y = parcel.readInt();
            this.f4434Z = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m6009a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m6009a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1218n.LottieAnimationView);
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_url);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(C1218n.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string = obtainStyledAttributes.getString(C1218n.LottieAnimationView_lottie_fileName);
                if (string != null) {
                    setAnimation(string);
                }
            } else if (hasValue3) {
                String string2 = obtainStyledAttributes.getString(C1218n.LottieAnimationView_lottie_url);
                if (string2 != null) {
                    setAnimationFromUrl(string2);
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(C1218n.LottieAnimationView_lottie_autoPlay, false)) {
            this.f4421e0 = true;
            this.f4422f0 = true;
        }
        if (obtainStyledAttributes.getBoolean(C1218n.LottieAnimationView_lottie_loop, false)) {
            this.f4417a0.mo6081d(-1);
        }
        if (obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(C1218n.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(C1218n.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(C1218n.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C1218n.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(C1218n.LottieAnimationView_lottie_progress, 0.0f));
        mo5969a(obtainStyledAttributes.getBoolean(C1218n.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_colorFilter)) {
            C1220p pVar = new C1220p(obtainStyledAttributes.getColor(C1218n.LottieAnimationView_lottie_colorFilter, 0));
            mo5967a(new C1271e("**"), C1210j.f4519B, new C1378c(pVar));
        }
        if (obtainStyledAttributes.hasValue(C1218n.LottieAnimationView_lottie_scale)) {
            this.f4417a0.mo6080d(obtainStyledAttributes.getFloat(C1218n.LottieAnimationView_lottie_scale, 1.0f));
        }
        obtainStyledAttributes.recycle();
        m6012j();
    }

    /* renamed from: h */
    private void m6010h() {
        C1212l<C1182d> lVar = this.f4425i0;
        if (lVar != null) {
            lVar.mo6131d(this.f4415V);
            this.f4425i0.mo6130c(this.f4416W);
        }
    }

    /* renamed from: i */
    private void m6011i() {
        this.f4426j0 = null;
        this.f4417a0.mo6070b();
    }

    /* renamed from: j */
    private void m6012j() {
        int i = C1176c.f4428a[this.f4423g0.ordinal()];
        int i2 = 2;
        if (i == 1) {
            setLayerType(2, null);
        } else if (i == 2) {
            setLayerType(1, null);
        } else if (i == 3) {
            C1182d dVar = this.f4426j0;
            boolean z = false;
            if (dVar == null || !dVar.mo6046m() || VERSION.SDK_INT >= 28) {
                C1182d dVar2 = this.f4426j0;
                if (dVar2 == null || dVar2.mo6043j() <= 4) {
                    z = true;
                }
            }
            if (!z) {
                i2 = 1;
            }
            setLayerType(i2, null);
        }
    }

    private void setCompositionTask(C1212l<C1182d> lVar) {
        m6011i();
        m6010h();
        lVar.mo6129b(this.f4415V);
        lVar.mo6128a(this.f4416W);
        this.f4425i0 = lVar;
    }

    /* renamed from: d */
    public boolean mo5971d() {
        return this.f4417a0.mo6106q();
    }

    /* renamed from: e */
    public void mo5972e() {
        this.f4417a0.mo6107r();
        m6012j();
    }

    /* renamed from: f */
    public void mo5973f() {
        this.f4417a0.mo6108s();
        m6012j();
    }

    /* renamed from: g */
    public void mo5974g() {
        this.f4417a0.mo6114t();
        m6012j();
    }

    public C1182d getComposition() {
        return this.f4426j0;
    }

    public long getDuration() {
        C1182d dVar = this.f4426j0;
        if (dVar != null) {
            return (long) dVar.mo6035c();
        }
        return 0;
    }

    public int getFrame() {
        return this.f4417a0.mo6088f();
    }

    public String getImageAssetsFolder() {
        return this.f4417a0.mo6089g();
    }

    public float getMaxFrame() {
        return this.f4417a0.mo6094h();
    }

    public float getMinFrame() {
        return this.f4417a0.mo6095i();
    }

    public C1215m getPerformanceTracker() {
        return this.f4417a0.mo6099j();
    }

    public float getProgress() {
        return this.f4417a0.mo6100k();
    }

    public int getRepeatCount() {
        return this.f4417a0.mo6101l();
    }

    public int getRepeatMode() {
        return this.f4417a0.mo6102m();
    }

    public float getScale() {
        return this.f4417a0.mo6103n();
    }

    public float getSpeed() {
        return this.f4417a0.mo6104o();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C1191f fVar = this.f4417a0;
        if (drawable2 == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4422f0 && this.f4421e0) {
            mo5973f();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo5971d()) {
            mo5963a();
            this.f4421e0 = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1177d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1177d dVar = (C1177d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f4418b0 = dVar.f4435c;
        if (!TextUtils.isEmpty(this.f4418b0)) {
            setAnimation(this.f4418b0);
        }
        this.f4419c0 = dVar.f4429U;
        int i = this.f4419c0;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(dVar.f4430V);
        if (dVar.f4431W) {
            mo5973f();
        }
        this.f4417a0.mo6073b(dVar.f4432X);
        setRepeatMode(dVar.f4433Y);
        setRepeatCount(dVar.f4434Z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1177d dVar = new C1177d(super.onSaveInstanceState());
        dVar.f4435c = this.f4418b0;
        dVar.f4429U = this.f4419c0;
        dVar.f4430V = this.f4417a0.mo6100k();
        dVar.f4431W = this.f4417a0.mo6106q();
        dVar.f4432X = this.f4417a0.mo6089g();
        dVar.f4433Y = this.f4417a0.mo6102m();
        dVar.f4434Z = this.f4417a0.mo6101l();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (this.f4417a0 != null) {
            if (i != 0) {
                this.f4420d0 = mo5971d();
                if (mo5971d()) {
                    mo5972e();
                }
            } else if (this.f4420d0) {
                mo5974g();
            }
        }
    }

    public void setAnimation(int i) {
        this.f4419c0 = i;
        this.f4418b0 = null;
        setCompositionTask(C1183e.m6062a(getContext(), i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        mo5968a(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(C1183e.m6072c(getContext(), str));
    }

    public void setComposition(C1182d dVar) {
        if (C1181c.f4436a) {
            String str = f4414k0;
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(dVar);
            Log.v(str, sb.toString());
        }
        this.f4417a0.setCallback(this);
        this.f4426j0 = dVar;
        boolean a = this.f4417a0.mo6069a(dVar);
        m6012j();
        if (getDrawable() != this.f4417a0 || a) {
            setImageDrawable(null);
            setImageDrawable(this.f4417a0);
            requestLayout();
            for (C1209i a2 : this.f4424h0) {
                a2.mo6123a(dVar);
            }
        }
    }

    public void setFontAssetDelegate(C1179a aVar) {
        this.f4417a0.mo6064a(aVar);
    }

    public void setFrame(int i) {
        this.f4417a0.mo6060a(i);
    }

    public void setImageAssetDelegate(C1180b bVar) {
        this.f4417a0.mo6065a(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f4417a0.mo6073b(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m6010h();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        m6010h();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        m6010h();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f4417a0.mo6072b(i);
    }

    public void setMaxProgress(float f) {
        this.f4417a0.mo6059a(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f4417a0.mo6082d(str);
    }

    public void setMinFrame(int i) {
        this.f4417a0.mo6076c(i);
    }

    public void setMinProgress(float f) {
        this.f4417a0.mo6071b(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f4417a0.mo6074b(z);
    }

    public void setProgress(float f) {
        this.f4417a0.mo6075c(f);
    }

    public void setRenderMode(C1219o oVar) {
        this.f4423g0 = oVar;
        m6012j();
    }

    public void setRepeatCount(int i) {
        this.f4417a0.mo6081d(i);
    }

    public void setRepeatMode(int i) {
        this.f4417a0.mo6086e(i);
    }

    public void setScale(float f) {
        this.f4417a0.mo6080d(f);
        if (getDrawable() == this.f4417a0) {
            setImageDrawable(null);
            setImageDrawable(this.f4417a0);
        }
    }

    public void setSpeed(float f) {
        this.f4417a0.mo6085e(f);
    }

    public void setTextDelegate(C1221q qVar) {
        this.f4417a0.mo6066a(qVar);
    }

    public void setMaxFrame(String str) {
        this.f4417a0.mo6077c(str);
    }

    public void setMinFrame(String str) {
        this.f4417a0.mo6087e(str);
    }

    public void setAnimation(String str) {
        this.f4418b0 = str;
        this.f4419c0 = 0;
        setCompositionTask(C1183e.m6063a(getContext(), str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6009a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6009a(attributeSet);
    }

    /* renamed from: a */
    public void mo5969a(boolean z) {
        this.f4417a0.mo6068a(z);
    }

    /* renamed from: a */
    public void mo5968a(String str, String str2) {
        mo5966a(new JsonReader(new StringReader(str)), str2);
    }

    /* renamed from: a */
    public void mo5966a(JsonReader jsonReader, String str) {
        setCompositionTask(C1183e.m6064a(jsonReader, str));
    }

    /* renamed from: a */
    public void mo5965a(AnimatorUpdateListener animatorUpdateListener) {
        this.f4417a0.mo6063a(animatorUpdateListener);
    }

    /* renamed from: a */
    public void mo5964a(AnimatorListener animatorListener) {
        this.f4417a0.mo6062a(animatorListener);
    }

    /* renamed from: a */
    public <T> void mo5967a(C1271e eVar, T t, C1378c<T> cVar) {
        this.f4417a0.mo6067a(eVar, t, cVar);
    }

    /* renamed from: a */
    public void mo5963a() {
        this.f4417a0.mo6058a();
        m6012j();
    }

    /* renamed from: a */
    public boolean mo5970a(C1209i iVar) {
        return this.f4424h0.add(iVar);
    }
}
