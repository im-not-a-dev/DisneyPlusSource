package p096e.p158r.p159a.p160a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0492a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p096e.p113e.C3926a;
import p096e.p121h.p122j.p124d.C4044h;
import p096e.p158r.p159a.p160a.C4357b.C4358a;

/* renamed from: e.r.a.a.c */
/* compiled from: AnimatedVectorDrawableCompat */
public class C4359c extends C4368h implements C4357b {

    /* renamed from: U */
    private C4361b f10820U;

    /* renamed from: V */
    private Context f10821V;

    /* renamed from: W */
    private ArgbEvaluator f10822W;

    /* renamed from: X */
    private AnimatorListener f10823X;

    /* renamed from: Y */
    ArrayList<C4358a> f10824Y;

    /* renamed from: Z */
    final Callback f10825Z;

    /* renamed from: e.r.a.a.c$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C4360a implements Callback {
        C4360a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C4359c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C4359c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C4359c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: e.r.a.a.c$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C4361b extends ConstantState {

        /* renamed from: a */
        int f10827a;

        /* renamed from: b */
        C4369i f10828b;

        /* renamed from: c */
        AnimatorSet f10829c;

        /* renamed from: d */
        ArrayList<Animator> f10830d;

        /* renamed from: e */
        C3926a<Animator, String> f10831e;

        public C4361b(Context context, C4361b bVar, Callback callback, Resources resources) {
            if (bVar != null) {
                this.f10827a = bVar.f10827a;
                C4369i iVar = bVar.f10828b;
                if (iVar != null) {
                    ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f10828b = (C4369i) constantState.newDrawable(resources);
                    } else {
                        this.f10828b = (C4369i) constantState.newDrawable();
                    }
                    C4369i iVar2 = this.f10828b;
                    iVar2.mutate();
                    this.f10828b = iVar2;
                    this.f10828b.setCallback(callback);
                    this.f10828b.setBounds(bVar.f10828b.getBounds());
                    this.f10828b.mo15298a(false);
                }
                ArrayList<Animator> arrayList = bVar.f10830d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f10830d = new ArrayList<>(size);
                    this.f10831e = new C3926a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) bVar.f10830d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) bVar.f10831e.get(animator);
                        clone.setTarget(this.f10828b.mo15297a(str));
                        this.f10830d.add(clone);
                        this.f10831e.put(clone, str);
                    }
                    mo15269a();
                }
            }
        }

        /* renamed from: a */
        public void mo15269a() {
            if (this.f10829c == null) {
                this.f10829c = new AnimatorSet();
            }
            this.f10829c.playTogether(this.f10830d);
        }

        public int getChangingConfigurations() {
            return this.f10827a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: e.r.a.a.c$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C4362c extends ConstantState {

        /* renamed from: a */
        private final ConstantState f10832a;

        public C4362c(ConstantState constantState) {
            this.f10832a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f10832a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f10832a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C4359c cVar = new C4359c();
            cVar.f10837c = this.f10832a.newDrawable();
            cVar.f10837c.setCallback(cVar.f10825Z);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C4359c cVar = new C4359c();
            cVar.f10837c = this.f10832a.newDrawable(resources);
            cVar.f10837c.setCallback(cVar.f10825Z);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C4359c cVar = new C4359c();
            cVar.f10837c = this.f10832a.newDrawable(resources, theme);
            cVar.f10837c.setCallback(cVar.f10825Z);
            return cVar;
        }
    }

    C4359c() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C4359c m15029a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C4359c cVar = new C4359c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2638a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return C0492a.m2642a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f10820U.f10828b.draw(canvas);
        if (this.f10820U.f10829c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return C0492a.m2646c(drawable);
        }
        return this.f10820U.f10828b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f10820U.f10827a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return C0492a.m2647d(drawable);
        }
        return this.f10820U.f10828b.getColorFilter();
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f10837c;
        if (drawable == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C4362c(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f10820U.f10828b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f10820U.f10828b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f10820U.f10828b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2639a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C4356a.f10812e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C4369i a2 = C4369i.m15062a(resources, resourceId, theme);
                        a2.mo15298a(false);
                        a2.setCallback(this.f10825Z);
                        C4369i iVar = this.f10820U.f10828b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f10820U.f10828b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C4356a.f10813f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f10821V;
                        if (context != null) {
                            m15031a(string, C4364e.m15037a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f10820U.mo15269a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return C0492a.m2649f(drawable);
        }
        return this.f10820U.f10828b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f10820U.f10829c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f10820U.f10828b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f10820U.f10828b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f10820U.f10828b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f10820U.f10828b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f10820U.f10828b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2641a(drawable, z);
        } else {
            this.f10820U.f10828b.setAutoMirrored(z);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2645b(drawable, i);
        } else {
            this.f10820U.f10828b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2637a(drawable, colorStateList);
        } else {
            this.f10820U.f10828b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2640a(drawable, mode);
        } else {
            this.f10820U.f10828b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f10820U.f10828b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f10820U.f10829c.isStarted()) {
            this.f10820U.f10829c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f10820U.f10829c.end();
        }
    }

    private C4359c(Context context) {
        this(context, null, null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10820U.f10828b.setColorFilter(colorFilter);
        }
    }

    private C4359c(Context context, C4361b bVar, Resources resources) {
        this.f10822W = null;
        this.f10823X = null;
        this.f10824Y = null;
        this.f10825Z = new C4360a();
        this.f10821V = context;
        if (bVar != null) {
            this.f10820U = bVar;
        } else {
            this.f10820U = new C4361b(context, bVar, this.f10825Z, resources);
        }
    }

    /* renamed from: a */
    private void m15030a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m15030a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f10822W == null) {
                    this.f10822W = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f10822W);
            }
        }
    }

    /* renamed from: a */
    private void m15031a(String str, Animator animator) {
        animator.setTarget(this.f10820U.f10828b.mo15297a(str));
        if (VERSION.SDK_INT < 21) {
            m15030a(animator);
        }
        C4361b bVar = this.f10820U;
        if (bVar.f10830d == null) {
            bVar.f10830d = new ArrayList<>();
            this.f10820U.f10831e = new C3926a<>();
        }
        this.f10820U.f10830d.add(animator);
        this.f10820U.f10831e.put(animator, str);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
