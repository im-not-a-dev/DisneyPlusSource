package p096e.p097a.p100l.p101a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0242j0;
import androidx.core.graphics.drawable.C0494c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p096e.p097a.p102m.C3886b;
import p096e.p113e.C3933f;
import p096e.p113e.C3942j;
import p096e.p121h.p122j.p124d.C4044h;
import p096e.p158r.p159a.p160a.C4359c;
import p096e.p158r.p159a.p160a.C4369i;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.l.a.a */
/* compiled from: AnimatedStateListDrawableCompat */
public class C3870a extends C3883d implements C0494c {

    /* renamed from: h0 */
    private C3873c f9541h0;

    /* renamed from: i0 */
    private C3877g f9542i0;

    /* renamed from: j0 */
    private int f9543j0;

    /* renamed from: k0 */
    private int f9544k0;

    /* renamed from: l0 */
    private boolean f9545l0;

    /* renamed from: e.a.l.a.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3872b extends C3877g {

        /* renamed from: a */
        private final Animatable f9546a;

        C3872b(Animatable animatable) {
            super();
            this.f9546a = animatable;
        }

        /* renamed from: c */
        public void mo13786c() {
            this.f9546a.start();
        }

        /* renamed from: d */
        public void mo13787d() {
            this.f9546a.stop();
        }
    }

    /* renamed from: e.a.l.a.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C3873c extends C3884a {

        /* renamed from: K */
        C3933f<Long> f9547K;

        /* renamed from: L */
        C3942j<Integer> f9548L;

        C3873c(C3873c cVar, C3870a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f9547K = cVar.f9547K;
                this.f9548L = cVar.f9548L;
                return;
            }
            this.f9547K = new C3933f<>();
            this.f9548L = new C3942j<>();
        }

        /* renamed from: f */
        private static long m12963f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo13788a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo13843a(drawable);
            long f = m12963f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f9547K.mo14059a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f9547K.mo14059a(m12963f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo13790b(int[] iArr) {
            int a = super.mo13897a(iArr);
            if (a >= 0) {
                return a;
            }
            return super.mo13897a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo13791c(int i, int i2) {
            return (int) ((Long) this.f9547K.mo14062b(m12963f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo13792d(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f9548L.mo14177b(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo13794e(int i, int i2) {
            return (((Long) this.f9547K.mo14062b(m12963f(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo13795m() {
            this.f9547K = this.f9547K.clone();
            this.f9548L = this.f9548L.clone();
        }

        public Drawable newDrawable() {
            return new C3870a(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo13793d(int i, int i2) {
            return (((Long) this.f9547K.mo14062b(m12963f(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0;
        }

        public Drawable newDrawable(Resources resources) {
            return new C3870a(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo13789a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo13898a(iArr, drawable);
            this.f9548L.mo14179c(a, Integer.valueOf(i));
            return a;
        }
    }

    /* renamed from: e.a.l.a.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3874d extends C3877g {

        /* renamed from: a */
        private final C4359c f9549a;

        C3874d(C4359c cVar) {
            super();
            this.f9549a = cVar;
        }

        /* renamed from: c */
        public void mo13786c() {
            this.f9549a.start();
        }

        /* renamed from: d */
        public void mo13787d() {
            this.f9549a.stop();
        }
    }

    /* renamed from: e.a.l.a.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3875e extends C3877g {

        /* renamed from: a */
        private final ObjectAnimator f9550a;

        /* renamed from: b */
        private final boolean f9551b;

        C3875e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C3876f fVar = new C3876f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo13800a());
            ofInt.setInterpolator(fVar);
            this.f9551b = z2;
            this.f9550a = ofInt;
        }

        /* renamed from: a */
        public boolean mo13798a() {
            return this.f9551b;
        }

        /* renamed from: b */
        public void mo13799b() {
            this.f9550a.reverse();
        }

        /* renamed from: c */
        public void mo13786c() {
            this.f9550a.start();
        }

        /* renamed from: d */
        public void mo13787d() {
            this.f9550a.cancel();
        }
    }

    /* renamed from: e.a.l.a.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3876f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f9552a;

        /* renamed from: b */
        private int f9553b;

        /* renamed from: c */
        private int f9554c;

        C3876f(AnimationDrawable animationDrawable, boolean z) {
            mo13801a(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo13801a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9553b = numberOfFrames;
            int[] iArr = this.f9552a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9552a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9552a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f9554c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f9554c)) + 0.5f);
            int i2 = this.f9553b;
            int[] iArr = this.f9552a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f9554c) : 0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo13800a() {
            return this.f9554c;
        }
    }

    /* renamed from: e.a.l.a.a$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C3877g {
        private C3877g() {
        }

        /* renamed from: a */
        public boolean mo13798a() {
            return false;
        }

        /* renamed from: b */
        public void mo13799b() {
        }

        /* renamed from: c */
        public abstract void mo13786c();

        /* renamed from: d */
        public abstract void mo13787d();
    }

    static {
        Class<C3870a> cls = C3870a.class;
    }

    public C3870a() {
        this(null, null);
    }

    /* renamed from: b */
    public static C3870a m12950b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3870a aVar = new C3870a();
            aVar.mo13779a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: c */
    private void m12952c() {
        onStateChange(getState());
    }

    /* renamed from: d */
    private int m12954d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C3886b.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C3886b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C3886b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable a2 = resourceId2 > 0 ? C0242j0.m1346a().mo1692a(context, resourceId2) : null;
        a.recycle();
        int[] a3 = mo13896a(attributeSet);
        String str = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                a2 = C4369i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a2 != null) {
            return this.f9541h0.mo13789a(a3, a2, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: e */
    private int m12955e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C3886b.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C3886b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C3886b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C3886b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable a2 = resourceId3 > 0 ? C0242j0.m1346a().mo1692a(context, resourceId3) : null;
        boolean z = a.getBoolean(C3886b.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        String str = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                a2 = C4359c.m15029a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f9541h0.mo13788a(resourceId, resourceId2, a2, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C3877g gVar = this.f9542i0;
        if (gVar != null) {
            gVar.mo13787d();
            this.f9542i0 = null;
            mo13805a(this.f9543j0);
            this.f9543j0 = -1;
            this.f9544k0 = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f9545l0) {
            super.mutate();
            if (this == this) {
                this.f9541h0.mo13795m();
                this.f9545l0 = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b = this.f9541h0.mo13790b(iArr);
        boolean z = b != mo13807b() && (m12951b(b) || mo13805a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f9542i0 != null && (visible || z2)) {
            if (z) {
                this.f9542i0.mo13786c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C3870a(C3873c cVar, Resources resources) {
        super(null);
        this.f9543j0 = -1;
        this.f9544k0 = -1;
        mo13780a((C3881c) new C3873c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: c */
    private void m12953c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m12954d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m12955e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo13779a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C3886b.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C3886b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m12949a(a);
        mo13803a(resources);
        a.recycle();
        m12953c(context, resources, xmlPullParser, attributeSet, theme);
        m12952c();
    }

    /* renamed from: b */
    private boolean m12951b(int i) {
        int i2;
        C3877g gVar;
        C3877g gVar2 = this.f9542i0;
        if (gVar2 == null) {
            i2 = mo13807b();
        } else if (i == this.f9543j0) {
            return true;
        } else {
            if (i != this.f9544k0 || !gVar2.mo13798a()) {
                i2 = this.f9543j0;
                gVar2.mo13787d();
            } else {
                gVar2.mo13799b();
                this.f9543j0 = this.f9544k0;
                this.f9544k0 = i;
                return true;
            }
        }
        this.f9542i0 = null;
        this.f9544k0 = -1;
        this.f9543j0 = -1;
        C3873c cVar = this.f9541h0;
        int d = cVar.mo13792d(i2);
        int d2 = cVar.mo13792d(i);
        if (!(d2 == 0 || d == 0)) {
            int c = cVar.mo13791c(d, d2);
            if (c < 0) {
                return false;
            }
            boolean e = cVar.mo13794e(d, d2);
            mo13805a(c);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                gVar = new C3875e((AnimationDrawable) current, cVar.mo13793d(d, d2), e);
            } else if (current instanceof C4359c) {
                gVar = new C3874d((C4359c) current);
            } else if (current instanceof Animatable) {
                gVar = new C3872b((Animatable) current);
            }
            gVar.mo13786c();
            this.f9542i0 = gVar;
            this.f9544k0 = i2;
            this.f9543j0 = i;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m12949a(TypedArray typedArray) {
        C3873c cVar = this.f9541h0;
        if (VERSION.SDK_INT >= 21) {
            cVar.f9581d |= typedArray.getChangingConfigurations();
        }
        cVar.mo13852b(typedArray.getBoolean(C3886b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f9586i));
        cVar.mo13848a(typedArray.getBoolean(C3886b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f9589l));
        cVar.mo13851b(typedArray.getInt(C3886b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f9569A));
        cVar.mo13855c(typedArray.getInt(C3886b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f9570B));
        setDither(typedArray.getBoolean(C3886b.AnimatedStateListDrawableCompat_android_dither, cVar.f9601x));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3873c m12958a() {
        return new C3873c(this.f9541h0, this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13780a(C3881c cVar) {
        super.mo13780a(cVar);
        if (cVar instanceof C3873c) {
            this.f9541h0 = (C3873c) cVar;
        }
    }
}
