package p096e.p158r.p159a.p160a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0492a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import net.danlew.android.joda.DateUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p096e.p113e.C3926a;
import p096e.p121h.p122j.p124d.C4030b;
import p096e.p121h.p122j.p124d.C4044h;
import p096e.p121h.p125k.C4046b;
import p096e.p121h.p125k.C4046b.C4048b;

/* renamed from: e.r.a.a.i */
/* compiled from: VectorDrawableCompat */
public class C4369i extends C4368h {

    /* renamed from: c0 */
    static final Mode f10838c0 = Mode.SRC_IN;

    /* renamed from: U */
    private C4377h f10839U;

    /* renamed from: V */
    private PorterDuffColorFilter f10840V;

    /* renamed from: W */
    private ColorFilter f10841W;

    /* renamed from: X */
    private boolean f10842X;

    /* renamed from: Y */
    private boolean f10843Y;

    /* renamed from: Z */
    private final float[] f10844Z;

    /* renamed from: a0 */
    private final Matrix f10845a0;

    /* renamed from: b0 */
    private final Rect f10846b0;

    /* renamed from: e.r.a.a.i$b */
    /* compiled from: VectorDrawableCompat */
    private static class C4371b extends C4375f {
        C4371b() {
        }

        /* renamed from: a */
        public void mo15322a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C4044h.m13871a(xmlPullParser, "pathData")) {
                TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C4356a.f10811d);
                m15069a(a, xmlPullParser);
                a.recycle();
            }
        }

        /* renamed from: b */
        public boolean mo15323b() {
            return true;
        }

        C4371b(C4371b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m15069a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10873b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f10872a = C4046b.m13888a(string2);
            }
            this.f10874c = C4044h.m13873b(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* renamed from: e.r.a.a.i$c */
    /* compiled from: VectorDrawableCompat */
    private static class C4372c extends C4375f {

        /* renamed from: e */
        private int[] f10847e;

        /* renamed from: f */
        C4030b f10848f;

        /* renamed from: g */
        float f10849g = 0.0f;

        /* renamed from: h */
        C4030b f10850h;

        /* renamed from: i */
        float f10851i = 1.0f;

        /* renamed from: j */
        float f10852j = 1.0f;

        /* renamed from: k */
        float f10853k = 0.0f;

        /* renamed from: l */
        float f10854l = 1.0f;

        /* renamed from: m */
        float f10855m = 0.0f;

        /* renamed from: n */
        Cap f10856n = Cap.BUTT;

        /* renamed from: o */
        Join f10857o = Join.MITER;

        /* renamed from: p */
        float f10858p = 4.0f;

        C4372c() {
        }

        /* renamed from: a */
        private Cap m15072a(int i, Cap cap) {
            if (i == 0) {
                return Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Cap.SQUARE;
            }
            return Cap.ROUND;
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f10852j;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.f10850h.mo14540a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f10851i;
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.f10848f.mo14540a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f10849g;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f10854l;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f10855m;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f10853k;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f10852j = f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f10850h.mo14541a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f10851i = f;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f10848f.mo14541a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f10849g = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f10854l = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f10855m = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f10853k = f;
        }

        /* renamed from: a */
        private Join m15073a(int i, Join join) {
            if (i == 0) {
                return Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Join.BEVEL;
            }
            return Join.ROUND;
        }

        /* renamed from: a */
        public void mo15324a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C4356a.f10810c);
            m15074a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        private void m15074a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f10847e = null;
            if (C4044h.m13871a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f10873b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f10872a = C4046b.m13888a(string2);
                }
                Theme theme2 = theme;
                this.f10850h = C4044h.m13867a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f10852j = C4044h.m13859a(typedArray, xmlPullParser, "fillAlpha", 12, this.f10852j);
                this.f10856n = m15072a(C4044h.m13873b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f10856n);
                this.f10857o = m15073a(C4044h.m13873b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f10857o);
                this.f10858p = C4044h.m13859a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f10858p);
                this.f10848f = C4044h.m13867a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f10851i = C4044h.m13859a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f10851i);
                this.f10849g = C4044h.m13859a(typedArray, xmlPullParser, "strokeWidth", 4, this.f10849g);
                this.f10854l = C4044h.m13859a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f10854l);
                this.f10855m = C4044h.m13859a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f10855m);
                this.f10853k = C4044h.m13859a(typedArray, xmlPullParser, "trimPathStart", 5, this.f10853k);
                this.f10874c = C4044h.m13873b(typedArray, xmlPullParser, "fillType", 13, this.f10874c);
            }
        }

        C4372c(C4372c cVar) {
            super(cVar);
            this.f10847e = cVar.f10847e;
            this.f10848f = cVar.f10848f;
            this.f10849g = cVar.f10849g;
            this.f10851i = cVar.f10851i;
            this.f10850h = cVar.f10850h;
            this.f10874c = cVar.f10874c;
            this.f10852j = cVar.f10852j;
            this.f10853k = cVar.f10853k;
            this.f10854l = cVar.f10854l;
            this.f10855m = cVar.f10855m;
            this.f10856n = cVar.f10856n;
            this.f10857o = cVar.f10857o;
            this.f10858p = cVar.f10858p;
        }

        /* renamed from: a */
        public boolean mo15325a() {
            return this.f10850h.mo14545d() || this.f10848f.mo14545d();
        }

        /* renamed from: a */
        public boolean mo15326a(int[] iArr) {
            return this.f10848f.mo14542a(iArr) | this.f10850h.mo14542a(iArr);
        }
    }

    /* renamed from: e.r.a.a.i$d */
    /* compiled from: VectorDrawableCompat */
    private static class C4373d extends C4374e {

        /* renamed from: a */
        final Matrix f10859a = new Matrix();

        /* renamed from: b */
        final ArrayList<C4374e> f10860b = new ArrayList<>();

        /* renamed from: c */
        float f10861c = 0.0f;

        /* renamed from: d */
        private float f10862d = 0.0f;

        /* renamed from: e */
        private float f10863e = 0.0f;

        /* renamed from: f */
        private float f10864f = 1.0f;

        /* renamed from: g */
        private float f10865g = 1.0f;

        /* renamed from: h */
        private float f10866h = 0.0f;

        /* renamed from: i */
        private float f10867i = 0.0f;

        /* renamed from: j */
        final Matrix f10868j = new Matrix();

        /* renamed from: k */
        int f10869k;

        /* renamed from: l */
        private int[] f10870l;

        /* renamed from: m */
        private String f10871m = null;

        public C4373d(C4373d dVar, C3926a<String, Object> aVar) {
            C4375f fVar;
            super();
            this.f10861c = dVar.f10861c;
            this.f10862d = dVar.f10862d;
            this.f10863e = dVar.f10863e;
            this.f10864f = dVar.f10864f;
            this.f10865g = dVar.f10865g;
            this.f10866h = dVar.f10866h;
            this.f10867i = dVar.f10867i;
            this.f10870l = dVar.f10870l;
            this.f10871m = dVar.f10871m;
            this.f10869k = dVar.f10869k;
            String str = this.f10871m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f10868j.set(dVar.f10868j);
            ArrayList<C4374e> arrayList = dVar.f10860b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C4373d) {
                    this.f10860b.add(new C4373d((C4373d) obj, aVar));
                } else {
                    if (obj instanceof C4372c) {
                        fVar = new C4372c((C4372c) obj);
                    } else if (obj instanceof C4371b) {
                        fVar = new C4371b((C4371b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f10860b.add(fVar);
                    String str2 = fVar.f10873b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m15079b() {
            this.f10868j.reset();
            this.f10868j.postTranslate(-this.f10862d, -this.f10863e);
            this.f10868j.postScale(this.f10864f, this.f10865g);
            this.f10868j.postRotate(this.f10861c, 0.0f, 0.0f);
            this.f10868j.postTranslate(this.f10866h + this.f10862d, this.f10867i + this.f10863e);
        }

        /* renamed from: a */
        public void mo15343a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C4356a.f10809b);
            m15078a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f10871m;
        }

        public Matrix getLocalMatrix() {
            return this.f10868j;
        }

        public float getPivotX() {
            return this.f10862d;
        }

        public float getPivotY() {
            return this.f10863e;
        }

        public float getRotation() {
            return this.f10861c;
        }

        public float getScaleX() {
            return this.f10864f;
        }

        public float getScaleY() {
            return this.f10865g;
        }

        public float getTranslateX() {
            return this.f10866h;
        }

        public float getTranslateY() {
            return this.f10867i;
        }

        public void setPivotX(float f) {
            if (f != this.f10862d) {
                this.f10862d = f;
                m15079b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f10863e) {
                this.f10863e = f;
                m15079b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f10861c) {
                this.f10861c = f;
                m15079b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f10864f) {
                this.f10864f = f;
                m15079b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f10865g) {
                this.f10865g = f;
                m15079b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f10866h) {
                this.f10866h = f;
                m15079b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f10867i) {
                this.f10867i = f;
                m15079b();
            }
        }

        /* renamed from: a */
        private void m15078a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f10870l = null;
            this.f10861c = C4044h.m13859a(typedArray, xmlPullParser, "rotation", 5, this.f10861c);
            this.f10862d = typedArray.getFloat(1, this.f10862d);
            this.f10863e = typedArray.getFloat(2, this.f10863e);
            this.f10864f = C4044h.m13859a(typedArray, xmlPullParser, "scaleX", 3, this.f10864f);
            this.f10865g = C4044h.m13859a(typedArray, xmlPullParser, "scaleY", 4, this.f10865g);
            this.f10866h = C4044h.m13859a(typedArray, xmlPullParser, "translateX", 6, this.f10866h);
            this.f10867i = C4044h.m13859a(typedArray, xmlPullParser, "translateY", 7, this.f10867i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10871m = string;
            }
            m15079b();
        }

        /* renamed from: a */
        public boolean mo15325a() {
            for (int i = 0; i < this.f10860b.size(); i++) {
                if (((C4374e) this.f10860b.get(i)).mo15325a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo15326a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f10860b.size(); i++) {
                z |= ((C4374e) this.f10860b.get(i)).mo15326a(iArr);
            }
            return z;
        }

        public C4373d() {
            super();
        }
    }

    /* renamed from: e.r.a.a.i$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C4374e {
        private C4374e() {
        }

        /* renamed from: a */
        public boolean mo15325a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo15326a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: e.r.a.a.i$f */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C4375f extends C4374e {

        /* renamed from: a */
        protected C4048b[] f10872a = null;

        /* renamed from: b */
        String f10873b;

        /* renamed from: c */
        int f10874c = 0;

        /* renamed from: d */
        int f10875d;

        public C4375f() {
            super();
        }

        /* renamed from: a */
        public void mo15360a(Path path) {
            path.reset();
            C4048b[] bVarArr = this.f10872a;
            if (bVarArr != null) {
                C4048b.m13896a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo15323b() {
            return false;
        }

        public C4048b[] getPathData() {
            return this.f10872a;
        }

        public String getPathName() {
            return this.f10873b;
        }

        public void setPathData(C4048b[] bVarArr) {
            if (!C4046b.m13886a(this.f10872a, bVarArr)) {
                this.f10872a = C4046b.m13889a(bVarArr);
            } else {
                C4046b.m13891b(this.f10872a, bVarArr);
            }
        }

        public C4375f(C4375f fVar) {
            super();
            this.f10873b = fVar.f10873b;
            this.f10875d = fVar.f10875d;
            this.f10872a = C4046b.m13889a(fVar.f10872a);
        }
    }

    /* renamed from: e.r.a.a.i$g */
    /* compiled from: VectorDrawableCompat */
    private static class C4376g {

        /* renamed from: q */
        private static final Matrix f10876q = new Matrix();

        /* renamed from: a */
        private final Path f10877a;

        /* renamed from: b */
        private final Path f10878b;

        /* renamed from: c */
        private final Matrix f10879c;

        /* renamed from: d */
        Paint f10880d;

        /* renamed from: e */
        Paint f10881e;

        /* renamed from: f */
        private PathMeasure f10882f;

        /* renamed from: g */
        private int f10883g;

        /* renamed from: h */
        final C4373d f10884h;

        /* renamed from: i */
        float f10885i;

        /* renamed from: j */
        float f10886j;

        /* renamed from: k */
        float f10887k;

        /* renamed from: l */
        float f10888l;

        /* renamed from: m */
        int f10889m;

        /* renamed from: n */
        String f10890n;

        /* renamed from: o */
        Boolean f10891o;

        /* renamed from: p */
        final C3926a<String, Object> f10892p;

        public C4376g() {
            this.f10879c = new Matrix();
            this.f10885i = 0.0f;
            this.f10886j = 0.0f;
            this.f10887k = 0.0f;
            this.f10888l = 0.0f;
            this.f10889m = 255;
            this.f10890n = null;
            this.f10891o = null;
            this.f10892p = new C3926a<>();
            this.f10884h = new C4373d();
            this.f10877a = new Path();
            this.f10878b = new Path();
        }

        /* renamed from: a */
        private static float m15087a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private void m15089a(C4373d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f10859a.set(matrix);
            dVar.f10859a.preConcat(dVar.f10868j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f10860b.size(); i3++) {
                C4374e eVar = (C4374e) dVar.f10860b.get(i3);
                if (eVar instanceof C4373d) {
                    m15089a((C4373d) eVar, dVar.f10859a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C4375f) {
                    m15090a(dVar, (C4375f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f10889m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f10889m = i;
        }

        /* renamed from: a */
        public void mo15364a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m15089a(this.f10884h, f10876q, canvas, i, i2, colorFilter);
        }

        public C4376g(C4376g gVar) {
            this.f10879c = new Matrix();
            this.f10885i = 0.0f;
            this.f10886j = 0.0f;
            this.f10887k = 0.0f;
            this.f10888l = 0.0f;
            this.f10889m = 255;
            this.f10890n = null;
            this.f10891o = null;
            this.f10892p = new C3926a<>();
            this.f10884h = new C4373d(gVar.f10884h, this.f10892p);
            this.f10877a = new Path(gVar.f10877a);
            this.f10878b = new Path(gVar.f10878b);
            this.f10885i = gVar.f10885i;
            this.f10886j = gVar.f10886j;
            this.f10887k = gVar.f10887k;
            this.f10888l = gVar.f10888l;
            this.f10883g = gVar.f10883g;
            this.f10889m = gVar.f10889m;
            this.f10890n = gVar.f10890n;
            String str = gVar.f10890n;
            if (str != null) {
                this.f10892p.put(str, this);
            }
            this.f10891o = gVar.f10891o;
        }

        /* renamed from: a */
        private void m15090a(C4373d dVar, C4375f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f10887k;
            float f2 = ((float) i2) / this.f10888l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f10859a;
            this.f10879c.set(matrix);
            this.f10879c.postScale(f, f2);
            float a = m15088a(matrix);
            if (a != 0.0f) {
                fVar.mo15360a(this.f10877a);
                Path path = this.f10877a;
                this.f10878b.reset();
                if (fVar.mo15323b()) {
                    this.f10878b.setFillType(fVar.f10874c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                    this.f10878b.addPath(path, this.f10879c);
                    canvas.clipPath(this.f10878b);
                } else {
                    C4372c cVar = (C4372c) fVar;
                    if (!(cVar.f10853k == 0.0f && cVar.f10854l == 1.0f)) {
                        float f3 = cVar.f10853k;
                        float f4 = cVar.f10855m;
                        float f5 = (f3 + f4) % 1.0f;
                        float f6 = (cVar.f10854l + f4) % 1.0f;
                        if (this.f10882f == null) {
                            this.f10882f = new PathMeasure();
                        }
                        this.f10882f.setPath(this.f10877a, false);
                        float length = this.f10882f.getLength();
                        float f7 = f5 * length;
                        float f8 = f6 * length;
                        path.reset();
                        if (f7 > f8) {
                            this.f10882f.getSegment(f7, length, path, true);
                            this.f10882f.getSegment(0.0f, f8, path, true);
                        } else {
                            this.f10882f.getSegment(f7, f8, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f10878b.addPath(path, this.f10879c);
                    if (cVar.f10850h.mo14546e()) {
                        C4030b bVar = cVar.f10850h;
                        if (this.f10881e == null) {
                            this.f10881e = new Paint(1);
                            this.f10881e.setStyle(Style.FILL);
                        }
                        Paint paint = this.f10881e;
                        if (bVar.mo14544c()) {
                            Shader b = bVar.mo14543b();
                            b.setLocalMatrix(this.f10879c);
                            paint.setShader(b);
                            paint.setAlpha(Math.round(cVar.f10852j * 255.0f));
                        } else {
                            paint.setShader(null);
                            paint.setAlpha(255);
                            paint.setColor(C4369i.m15060a(bVar.mo14540a(), cVar.f10852j));
                        }
                        paint.setColorFilter(colorFilter);
                        this.f10878b.setFillType(cVar.f10874c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f10878b, paint);
                    }
                    if (cVar.f10848f.mo14546e()) {
                        C4030b bVar2 = cVar.f10848f;
                        if (this.f10880d == null) {
                            this.f10880d = new Paint(1);
                            this.f10880d.setStyle(Style.STROKE);
                        }
                        Paint paint2 = this.f10880d;
                        Join join = cVar.f10857o;
                        if (join != null) {
                            paint2.setStrokeJoin(join);
                        }
                        Cap cap = cVar.f10856n;
                        if (cap != null) {
                            paint2.setStrokeCap(cap);
                        }
                        paint2.setStrokeMiter(cVar.f10858p);
                        if (bVar2.mo14544c()) {
                            Shader b2 = bVar2.mo14543b();
                            b2.setLocalMatrix(this.f10879c);
                            paint2.setShader(b2);
                            paint2.setAlpha(Math.round(cVar.f10851i * 255.0f));
                        } else {
                            paint2.setShader(null);
                            paint2.setAlpha(255);
                            paint2.setColor(C4369i.m15060a(bVar2.mo14540a(), cVar.f10851i));
                        }
                        paint2.setColorFilter(colorFilter);
                        paint2.setStrokeWidth(cVar.f10849g * min * a);
                        canvas.drawPath(this.f10878b, paint2);
                    }
                }
            }
        }

        /* renamed from: a */
        private float m15088a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m15087a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo15365a() {
            if (this.f10891o == null) {
                this.f10891o = Boolean.valueOf(this.f10884h.mo15325a());
            }
            return this.f10891o.booleanValue();
        }

        /* renamed from: a */
        public boolean mo15366a(int[] iArr) {
            return this.f10884h.mo15326a(iArr);
        }
    }

    /* renamed from: e.r.a.a.i$h */
    /* compiled from: VectorDrawableCompat */
    private static class C4377h extends ConstantState {

        /* renamed from: a */
        int f10893a;

        /* renamed from: b */
        C4376g f10894b;

        /* renamed from: c */
        ColorStateList f10895c;

        /* renamed from: d */
        Mode f10896d;

        /* renamed from: e */
        boolean f10897e;

        /* renamed from: f */
        Bitmap f10898f;

        /* renamed from: g */
        ColorStateList f10899g;

        /* renamed from: h */
        Mode f10900h;

        /* renamed from: i */
        int f10901i;

        /* renamed from: j */
        boolean f10902j;

        /* renamed from: k */
        boolean f10903k;

        /* renamed from: l */
        Paint f10904l;

        public C4377h(C4377h hVar) {
            this.f10895c = null;
            this.f10896d = C4369i.f10838c0;
            if (hVar != null) {
                this.f10893a = hVar.f10893a;
                this.f10894b = new C4376g(hVar.f10894b);
                Paint paint = hVar.f10894b.f10881e;
                if (paint != null) {
                    this.f10894b.f10881e = new Paint(paint);
                }
                Paint paint2 = hVar.f10894b.f10880d;
                if (paint2 != null) {
                    this.f10894b.f10880d = new Paint(paint2);
                }
                this.f10895c = hVar.f10895c;
                this.f10896d = hVar.f10896d;
                this.f10897e = hVar.f10897e;
            }
        }

        /* renamed from: a */
        public void mo15372a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f10898f, null, rect, mo15371a(colorFilter));
        }

        /* renamed from: b */
        public boolean mo15377b() {
            return this.f10894b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo15378c(int i, int i2) {
            this.f10898f.eraseColor(0);
            this.f10894b.mo15364a(new Canvas(this.f10898f), i, i2, (ColorFilter) null);
        }

        /* renamed from: d */
        public void mo15380d() {
            this.f10899g = this.f10895c;
            this.f10900h = this.f10896d;
            this.f10901i = this.f10894b.getRootAlpha();
            this.f10902j = this.f10897e;
            this.f10903k = false;
        }

        public int getChangingConfigurations() {
            return this.f10893a;
        }

        public Drawable newDrawable() {
            return new C4369i(this);
        }

        /* renamed from: b */
        public void mo15376b(int i, int i2) {
            if (this.f10898f == null || !mo15374a(i, i2)) {
                this.f10898f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f10903k = true;
            }
        }

        public Drawable newDrawable(Resources resources) {
            return new C4369i(this);
        }

        /* renamed from: a */
        public Paint mo15371a(ColorFilter colorFilter) {
            if (!mo15377b() && colorFilter == null) {
                return null;
            }
            if (this.f10904l == null) {
                this.f10904l = new Paint();
                this.f10904l.setFilterBitmap(true);
            }
            this.f10904l.setAlpha(this.f10894b.getRootAlpha());
            this.f10904l.setColorFilter(colorFilter);
            return this.f10904l;
        }

        /* renamed from: c */
        public boolean mo15379c() {
            return this.f10894b.mo15365a();
        }

        /* renamed from: a */
        public boolean mo15374a(int i, int i2) {
            return i == this.f10898f.getWidth() && i2 == this.f10898f.getHeight();
        }

        /* renamed from: a */
        public boolean mo15373a() {
            return !this.f10903k && this.f10899g == this.f10895c && this.f10900h == this.f10896d && this.f10902j == this.f10897e && this.f10901i == this.f10894b.getRootAlpha();
        }

        public C4377h() {
            this.f10895c = null;
            this.f10896d = C4369i.f10838c0;
            this.f10894b = new C4376g();
        }

        /* renamed from: a */
        public boolean mo15375a(int[] iArr) {
            boolean a = this.f10894b.mo15366a(iArr);
            this.f10903k |= a;
            return a;
        }
    }

    /* renamed from: e.r.a.a.i$i */
    /* compiled from: VectorDrawableCompat */
    private static class C4378i extends ConstantState {

        /* renamed from: a */
        private final ConstantState f10905a;

        public C4378i(ConstantState constantState) {
            this.f10905a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f10905a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f10905a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C4369i iVar = new C4369i();
            iVar.f10837c = (VectorDrawable) this.f10905a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C4369i iVar = new C4369i();
            iVar.f10837c = (VectorDrawable) this.f10905a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C4369i iVar = new C4369i();
            iVar.f10837c = (VectorDrawable) this.f10905a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C4369i() {
        this.f10843Y = true;
        this.f10844Z = new float[9];
        this.f10845a0 = new Matrix();
        this.f10846b0 = new Rect();
        this.f10839U = new C4377h();
    }

    public static C4369i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C4369i iVar = new C4369i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo15297a(String str) {
        return this.f10839U.f10894b.f10892p.get(str);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2642a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f10846b0);
        if (this.f10846b0.width() > 0 && this.f10846b0.height() > 0) {
            ColorFilter colorFilter = this.f10841W;
            if (colorFilter == null) {
                colorFilter = this.f10840V;
            }
            canvas.getMatrix(this.f10845a0);
            this.f10845a0.getValues(this.f10844Z);
            float abs = Math.abs(this.f10844Z[0]);
            float abs2 = Math.abs(this.f10844Z[4]);
            float abs3 = Math.abs(this.f10844Z[1]);
            float abs4 = Math.abs(this.f10844Z[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f10846b0.height()) * abs2);
            int min = Math.min(DateUtils.FORMAT_NO_MIDNIGHT, (int) (((float) this.f10846b0.width()) * abs));
            int min2 = Math.min(DateUtils.FORMAT_NO_MIDNIGHT, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f10846b0;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m15065a()) {
                    canvas.translate((float) this.f10846b0.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f10846b0.offsetTo(0, 0);
                this.f10839U.mo15376b(min, min2);
                if (!this.f10843Y) {
                    this.f10839U.mo15378c(min, min2);
                } else if (!this.f10839U.mo15373a()) {
                    this.f10839U.mo15378c(min, min2);
                    this.f10839U.mo15380d();
                }
                this.f10839U.mo15372a(canvas, colorFilter, this.f10846b0);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return C0492a.m2646c(drawable);
        }
        return this.f10839U.f10894b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f10839U.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return C0492a.m2647d(drawable);
        }
        return this.f10841W;
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f10837c;
        if (drawable != null && VERSION.SDK_INT >= 24) {
            return new C4378i(drawable.getConstantState());
        }
        this.f10839U.f10893a = getChangingConfigurations();
        return this.f10839U;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f10839U.f10894b.f10886j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f10839U.f10894b.f10885i;
    }

    public int getOpacity() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return C0492a.m2649f(drawable);
        }
        return this.f10839U.f10897e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10837c
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            e.r.a.a.i$h r0 = r1.f10839U
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo15379c()
            if (r0 != 0) goto L_0x0028
            e.r.a.a.i$h r0 = r1.f10839U
            android.content.res.ColorStateList r0 = r0.f10895c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p158r.p159a.p160a.C4369i.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10842X && super.mutate() == this) {
            this.f10839U = new C4377h(this.f10839U);
            this.f10842X = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C4377h hVar = this.f10839U;
        ColorStateList colorStateList = hVar.f10895c;
        if (colorStateList != null) {
            Mode mode = hVar.f10896d;
            if (mode != null) {
                this.f10840V = mo15296a(this.f10840V, colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (hVar.mo15379c() && hVar.mo15375a(iArr)) {
            invalidateSelf();
            z = true;
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.f10839U.f10894b.getRootAlpha() != i) {
            this.f10839U.f10894b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2641a(drawable, z);
        } else {
            this.f10839U.f10897e = z;
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2645b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2637a(drawable, colorStateList);
            return;
        }
        C4377h hVar = this.f10839U;
        if (hVar.f10895c != colorStateList) {
            hVar.f10895c = colorStateList;
            this.f10840V = mo15296a(this.f10840V, colorStateList, hVar.f10896d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2640a(drawable, mode);
            return;
        }
        C4377h hVar = this.f10839U;
        if (hVar.f10896d != mode) {
            hVar.f10896d = mode;
            this.f10840V = mo15296a(this.f10840V, hVar.f10895c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PorterDuffColorFilter mo15296a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f10841W = colorFilter;
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p096e.p158r.p159a.p160a.C4369i m15062a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            e.r.a.a.i r0 = new e.r.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p096e.p121h.p122j.p124d.C4039f.m13851a(r6, r7, r8)
            r0.f10837c = r6
            e.r.a.a.i$i r6 = new e.r.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f10837c
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            e.r.a.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p158r.p159a.p160a.C4369i.m15062a(android.content.res.Resources, int, android.content.res.Resources$Theme):e.r.a.a.i");
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2639a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C4377h hVar = this.f10839U;
        hVar.f10894b = new C4376g();
        TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C4356a.f10808a);
        m15064a(a, xmlPullParser, theme);
        a.recycle();
        hVar.f10893a = getChangingConfigurations();
        hVar.f10903k = true;
        m15063a(resources, xmlPullParser, attributeSet, theme);
        this.f10840V = mo15296a(this.f10840V, hVar.f10895c, hVar.f10896d);
    }

    C4369i(C4377h hVar) {
        this.f10843Y = true;
        this.f10844Z = new float[9];
        this.f10845a0 = new Matrix();
        this.f10846b0 = new Rect();
        this.f10839U = hVar;
        this.f10840V = mo15296a(this.f10840V, hVar.f10895c, hVar.f10896d);
    }

    /* renamed from: a */
    static int m15060a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static Mode m15061a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m15064a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) throws XmlPullParserException {
        C4377h hVar = this.f10839U;
        C4376g gVar = hVar.f10894b;
        hVar.f10896d = m15061a(C4044h.m13873b(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList a = C4044h.m13863a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a != null) {
            hVar.f10895c = a;
        }
        hVar.f10897e = C4044h.m13870a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f10897e);
        gVar.f10887k = C4044h.m13859a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f10887k);
        gVar.f10888l = C4044h.m13859a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f10888l);
        if (gVar.f10887k <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (gVar.f10888l > 0.0f) {
            gVar.f10885i = typedArray.getDimension(3, gVar.f10885i);
            gVar.f10886j = typedArray.getDimension(2, gVar.f10886j);
            if (gVar.f10885i <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (gVar.f10886j > 0.0f) {
                gVar.setAlpha(C4044h.m13859a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f10890n = string;
                    gVar.f10892p.put(string, gVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    /* renamed from: a */
    private void m15063a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C4377h hVar = this.f10839U;
        C4376g gVar = hVar.f10894b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f10884h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C4373d dVar = (C4373d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C4372c cVar = new C4372c();
                    cVar.mo15324a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10860b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f10892p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f10893a = cVar.f10875d | hVar.f10893a;
                } else if ("clip-path".equals(name)) {
                    C4371b bVar = new C4371b();
                    bVar.mo15322a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10860b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f10892p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f10893a = bVar.f10875d | hVar.f10893a;
                } else if (str.equals(name)) {
                    C4373d dVar2 = new C4373d();
                    dVar2.mo15343a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10860b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f10892p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f10893a = dVar2.f10869k | hVar.f10893a;
                }
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15298a(boolean z) {
        this.f10843Y = z;
    }

    /* renamed from: a */
    private boolean m15065a() {
        if (VERSION.SDK_INT < 17 || !isAutoMirrored() || C0492a.m2648e(this) != 1) {
            return false;
        }
        return true;
    }
}
