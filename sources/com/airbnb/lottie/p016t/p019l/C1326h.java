package com.airbnb.lottie.p016t.p019l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.C1221q;
import com.airbnb.lottie.p012r.p013b.C1228d;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1261n;
import com.airbnb.lottie.p016t.C1267b;
import com.airbnb.lottie.p016t.C1267b.C1268a;
import com.airbnb.lottie.p016t.C1269c;
import com.airbnb.lottie.p016t.C1270d;
import com.airbnb.lottie.p016t.p017j.C1276a;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1286k;
import com.airbnb.lottie.p016t.p018k.C1306n;
import com.airbnb.lottie.p022w.C1375f;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p096e.p113e.C3933f;

/* renamed from: com.airbnb.lottie.t.l.h */
/* compiled from: TextLayer */
public class C1326h extends C1314a {

    /* renamed from: A */
    private final Paint f4996A = new C1328b(this, 1);

    /* renamed from: B */
    private final Map<C1270d, List<C1228d>> f4997B = new HashMap();

    /* renamed from: C */
    private final C3933f<String> f4998C = new C3933f<>();

    /* renamed from: D */
    private final C1261n f4999D;

    /* renamed from: E */
    private final C1191f f5000E;

    /* renamed from: F */
    private final C1182d f5001F;

    /* renamed from: G */
    private C1247a<Integer, Integer> f5002G;

    /* renamed from: H */
    private C1247a<Integer, Integer> f5003H;

    /* renamed from: I */
    private C1247a<Float, Float> f5004I;

    /* renamed from: J */
    private C1247a<Float, Float> f5005J;

    /* renamed from: w */
    private final StringBuilder f5006w = new StringBuilder(2);

    /* renamed from: x */
    private final RectF f5007x = new RectF();

    /* renamed from: y */
    private final Matrix f5008y = new Matrix();

    /* renamed from: z */
    private final Paint f5009z = new C1327a(this, 1);

    /* renamed from: com.airbnb.lottie.t.l.h$a */
    /* compiled from: TextLayer */
    class C1327a extends Paint {
        C1327a(C1326h hVar, int i) {
            super(i);
            setStyle(Style.FILL);
        }
    }

    /* renamed from: com.airbnb.lottie.t.l.h$b */
    /* compiled from: TextLayer */
    class C1328b extends Paint {
        C1328b(C1326h hVar, int i) {
            super(i);
            setStyle(Style.STROKE);
        }
    }

    /* renamed from: com.airbnb.lottie.t.l.h$c */
    /* compiled from: TextLayer */
    static /* synthetic */ class C1329c {

        /* renamed from: a */
        static final /* synthetic */ int[] f5010a = new int[C1268a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.airbnb.lottie.t.b$a[] r0 = com.airbnb.lottie.p016t.C1267b.C1268a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5010a = r0
                int[] r0 = f5010a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.t.b$a r1 = com.airbnb.lottie.p016t.C1267b.C1268a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5010a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.t.b$a r1 = com.airbnb.lottie.p016t.C1267b.C1268a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5010a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.t.b$a r1 = com.airbnb.lottie.p016t.C1267b.C1268a.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p016t.p019l.C1326h.C1329c.<clinit>():void");
        }
    }

    C1326h(C1191f fVar, C1320d dVar) {
        super(fVar, dVar);
        this.f5000E = fVar;
        this.f5001F = dVar.mo6345a();
        this.f4999D = dVar.mo6362q().mo6223a();
        this.f4999D.mo6163a((C1248a) this);
        mo6336a((C1247a<?, ?>) this.f4999D);
        C1286k r = dVar.mo6363r();
        if (r != null) {
            C1276a aVar = r.f4788a;
            if (aVar != null) {
                this.f5002G = aVar.mo6223a();
                this.f5002G.mo6163a((C1248a) this);
                mo6336a(this.f5002G);
            }
        }
        if (r != null) {
            C1276a aVar2 = r.f4789b;
            if (aVar2 != null) {
                this.f5003H = aVar2.mo6223a();
                this.f5003H.mo6163a((C1248a) this);
                mo6336a(this.f5003H);
            }
        }
        if (r != null) {
            C1277b bVar = r.f4790c;
            if (bVar != null) {
                this.f5004I = bVar.mo6223a();
                this.f5004I.mo6163a((C1248a) this);
                mo6336a(this.f5004I);
            }
        }
        if (r != null) {
            C1277b bVar2 = r.f4791d;
            if (bVar2 != null) {
                this.f5005J = bVar2.mo6223a();
                this.f5005J.mo6163a((C1248a) this);
                mo6336a(this.f5005J);
            }
        }
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        super.mo6143a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f5001F.mo6026a().width(), (float) this.f5001F.mo6026a().height());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6339b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f5000E.mo6115u()) {
            canvas.setMatrix(matrix);
        }
        C1267b bVar = (C1267b) this.f4999D.mo6169f();
        C1269c cVar = (C1269c) this.f5001F.mo6039f().get(bVar.f4753b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        C1247a<Integer, Integer> aVar = this.f5002G;
        if (aVar != null) {
            this.f5009z.setColor(((Integer) aVar.mo6169f()).intValue());
        } else {
            this.f5009z.setColor(bVar.f4759h);
        }
        C1247a<Integer, Integer> aVar2 = this.f5003H;
        if (aVar2 != null) {
            this.f4996A.setColor(((Integer) aVar2.mo6169f()).intValue());
        } else {
            this.f4996A.setColor(bVar.f4760i);
        }
        int intValue = ((this.f4939u.mo6188c() == null ? 100 : ((Integer) this.f4939u.mo6188c().mo6169f()).intValue()) * 255) / 100;
        this.f5009z.setAlpha(intValue);
        this.f4996A.setAlpha(intValue);
        C1247a<Float, Float> aVar3 = this.f5004I;
        if (aVar3 != null) {
            this.f4996A.setStrokeWidth(((Float) aVar3.mo6169f()).floatValue());
        } else {
            this.f4996A.setStrokeWidth((float) (bVar.f4761j * ((double) C1375f.m6732a()) * ((double) C1375f.m6733a(matrix))));
        }
        if (this.f5000E.mo6115u()) {
            m6583a(bVar, matrix, cVar, canvas);
        } else {
            m6584a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m6583a(C1267b bVar, Matrix matrix, C1269c cVar, Canvas canvas) {
        C1267b bVar2 = bVar;
        Canvas canvas2 = canvas;
        float f = ((float) bVar2.f4754c) / 100.0f;
        float a = C1375f.m6733a(matrix);
        float a2 = ((float) bVar2.f4757f) * C1375f.m6732a();
        List a3 = m6580a(bVar2.f4752a);
        int size = a3.size();
        int i = 0;
        while (i < size) {
            String str = (String) a3.get(i);
            float a4 = m6577a(str, cVar, f, a);
            canvas.save();
            m6582a(bVar2.f4755d, canvas2, a4);
            canvas2.translate(0.0f, (((float) i) * a2) - ((((float) (size - 1)) * a2) / 2.0f));
            int i2 = i;
            m6589a(str, bVar, matrix, cVar, canvas, a, f);
            canvas.restore();
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private void m6589a(String str, C1267b bVar, Matrix matrix, C1269c cVar, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            C1270d dVar = (C1270d) this.f5001F.mo6033b().mo14172a(C1270d.m6348a(str.charAt(i), cVar.mo6202a(), cVar.mo6204c()));
            if (dVar != null) {
                m6585a(dVar, matrix, f2, bVar, canvas);
                float b = ((float) dVar.mo6206b()) * f2 * C1375f.m6732a() * f;
                float f3 = ((float) bVar.f4756e) / 10.0f;
                C1247a<Float, Float> aVar = this.f5005J;
                if (aVar != null) {
                    f3 += ((Float) aVar.mo6169f()).floatValue();
                }
                canvas.translate(b + (f3 * f), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m6584a(C1267b bVar, C1269c cVar, Matrix matrix, Canvas canvas) {
        float a = C1375f.m6733a(matrix);
        Typeface a2 = this.f5000E.mo6056a(cVar.mo6202a(), cVar.mo6204c());
        if (a2 != null) {
            String str = bVar.f4752a;
            C1221q p = this.f5000E.mo6105p();
            if (p == null) {
                this.f5009z.setTypeface(a2);
                this.f5009z.setTextSize((float) (bVar.f4754c * ((double) C1375f.m6732a())));
                this.f4996A.setTypeface(this.f5009z.getTypeface());
                this.f4996A.setTextSize(this.f5009z.getTextSize());
                float a3 = ((float) bVar.f4757f) * C1375f.m6732a();
                List a4 = m6580a(str);
                int size = a4.size();
                for (int i = 0; i < size; i++) {
                    String str2 = (String) a4.get(i);
                    m6582a(bVar.f4755d, canvas, this.f4996A.measureText(str2));
                    canvas.translate(0.0f, (((float) i) * a3) - ((((float) (size - 1)) * a3) / 2.0f));
                    m6588a(str2, bVar, canvas, a);
                    canvas.setMatrix(matrix);
                }
                return;
            }
            p.mo6139a(str);
            throw null;
        }
    }

    /* renamed from: a */
    private List<String> m6580a(String str) {
        String str2 = "\r";
        return Arrays.asList(str.replaceAll("\r\n", str2).replaceAll("\n", str2).split(str2));
    }

    /* renamed from: a */
    private void m6588a(String str, C1267b bVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String a = m6578a(str, i);
            i += a.length();
            m6587a(a, bVar, canvas);
            float measureText = this.f5009z.measureText(a, 0, 1);
            float f2 = ((float) bVar.f4756e) / 10.0f;
            C1247a<Float, Float> aVar = this.f5005J;
            if (aVar != null) {
                f2 += ((Float) aVar.mo6169f()).floatValue();
            }
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    /* renamed from: a */
    private float m6577a(String str, C1269c cVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C1270d dVar = (C1270d) this.f5001F.mo6033b().mo14172a(C1270d.m6348a(str.charAt(i), cVar.mo6202a(), cVar.mo6204c()));
            if (dVar != null) {
                f3 = (float) (((double) f3) + (dVar.mo6206b() * ((double) f) * ((double) C1375f.m6732a()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: a */
    private void m6582a(C1268a aVar, Canvas canvas, float f) {
        int i = C1329c.f5010a[aVar.ordinal()];
        if (i == 1) {
            return;
        }
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: a */
    private void m6585a(C1270d dVar, Matrix matrix, float f, C1267b bVar, Canvas canvas) {
        List a = m6579a(dVar);
        for (int i = 0; i < a.size(); i++) {
            Path j0 = ((C1228d) a.get(i)).mo6152j0();
            j0.computeBounds(this.f5007x, false);
            this.f5008y.set(matrix);
            this.f5008y.preTranslate(0.0f, ((float) (-bVar.f4758g)) * C1375f.m6732a());
            this.f5008y.preScale(f, f);
            j0.transform(this.f5008y);
            if (bVar.f4762k) {
                m6581a(j0, this.f5009z, canvas);
                m6581a(j0, this.f4996A, canvas);
            } else {
                m6581a(j0, this.f4996A, canvas);
                m6581a(j0, this.f5009z, canvas);
            }
        }
    }

    /* renamed from: a */
    private void m6581a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private void m6587a(String str, C1267b bVar, Canvas canvas) {
        if (bVar.f4762k) {
            m6586a(str, this.f5009z, canvas);
            m6586a(str, this.f4996A, canvas);
            return;
        }
        m6586a(str, this.f4996A, canvas);
        m6586a(str, this.f5009z, canvas);
    }

    /* renamed from: a */
    private void m6586a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: a */
    private List<C1228d> m6579a(C1270d dVar) {
        if (this.f4997B.containsKey(dVar)) {
            return (List) this.f4997B.get(dVar);
        }
        List a = dVar.mo6205a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1228d(this.f5000E, this, (C1306n) a.get(i)));
        }
        this.f4997B.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private String m6578a(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m6590a(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f4998C.mo14060a(j)) {
            return (String) this.f4998C.mo14066c(j);
        }
        this.f5006w.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f5006w.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f5006w.toString();
        this.f4998C.mo14067c(j, sb);
        return sb;
    }

    /* renamed from: a */
    private boolean m6590a(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        super.mo6145a(t, cVar);
        if (t == C1210j.f4521a) {
            C1247a<Integer, Integer> aVar = this.f5002G;
            if (aVar != null) {
                aVar.mo6164a(cVar);
                return;
            }
        }
        if (t == C1210j.f4522b) {
            C1247a<Integer, Integer> aVar2 = this.f5003H;
            if (aVar2 != null) {
                aVar2.mo6164a(cVar);
                return;
            }
        }
        if (t == C1210j.f4535o) {
            C1247a<Float, Float> aVar3 = this.f5004I;
            if (aVar3 != null) {
                aVar3.mo6164a(cVar);
                return;
            }
        }
        if (t == C1210j.f4536p) {
            C1247a<Float, Float> aVar4 = this.f5005J;
            if (aVar4 != null) {
                aVar4.mo6164a(cVar);
            }
        }
    }
}
