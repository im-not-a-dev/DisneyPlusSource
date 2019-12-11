package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0319b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* compiled from: ConstraintAttribute */
public class C0418a {

    /* renamed from: a */
    String f1830a;

    /* renamed from: b */
    private C0420b f1831b;

    /* renamed from: c */
    private int f1832c;

    /* renamed from: d */
    private float f1833d;

    /* renamed from: e */
    private String f1834e;

    /* renamed from: f */
    boolean f1835f;

    /* renamed from: g */
    private int f1836g;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* compiled from: ConstraintAttribute */
    static /* synthetic */ class C0419a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1837a = new int[C0420b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.C0418a.C0420b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1837a = r0
                int[] r0 = f1837a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0418a.C0420b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1837a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0418a.C0420b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1837a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0418a.C0420b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f1837a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0418a.C0420b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f1837a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0418a.C0420b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f1837a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0418a.C0420b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f1837a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0418a.C0420b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0418a.C0419a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* compiled from: ConstraintAttribute */
    public enum C0420b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0418a(String str, C0420b bVar, Object obj) {
        this.f1830a = str;
        this.f1831b = bVar;
        mo2394a(obj);
    }

    /* renamed from: a */
    private static int m2274a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: a */
    public C0420b mo2392a() {
        return this.f1831b;
    }

    /* renamed from: b */
    public float mo2396b() {
        switch (C0419a.f1837a[this.f1831b.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return (float) this.f1832c;
            case 4:
                return this.f1833d;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f1835f ? 0.0f : 1.0f;
            case 7:
                return this.f1833d;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: c */
    public int mo2397c() {
        int i = C0419a.f1837a[this.f1831b.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    /* renamed from: a */
    public void mo2395a(float[] fArr) {
        switch (C0419a.f1837a[this.f1831b.ordinal()]) {
            case 1:
            case 2:
                int i = this.f1836g;
                int i2 = (i >> 24) & 255;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                float pow3 = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = ((float) i2) / 255.0f;
                return;
            case 3:
                fArr[0] = (float) this.f1832c;
                return;
            case 4:
                fArr[0] = this.f1833d;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f1835f ? 0.0f : 1.0f;
                return;
            case 7:
                fArr[0] = this.f1833d;
                return;
            default:
                return;
        }
    }

    public C0418a(C0418a aVar, Object obj) {
        this.f1830a = aVar.f1830a;
        this.f1831b = aVar.f1831b;
        mo2394a(obj);
    }

    /* renamed from: a */
    public void mo2394a(Object obj) {
        switch (C0419a.f1837a[this.f1831b.ordinal()]) {
            case 1:
            case 2:
                this.f1836g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f1832c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f1833d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f1834e = (String) obj;
                return;
            case 6:
                this.f1835f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f1833d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static HashMap<String, C0418a> m2275a(HashMap<String, C0418a> hashMap, View view) {
        HashMap<String, C0418a> hashMap2 = new HashMap<>();
        Class cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0418a aVar = (C0418a) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new C0418a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMap");
                    sb.append(str);
                    hashMap2.put(str, new C0418a(aVar, cls.getMethod(sb.toString(), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: a */
    public static void m2277a(View view, HashMap<String, C0418a> hashMap) {
        Class cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0418a aVar = (C0418a) hashMap.get(str);
            StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(str);
            String sb2 = sb.toString();
            try {
                switch (C0419a.f1837a[aVar.f1831b.ordinal()]) {
                    case 1:
                        cls.getMethod(sb2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1836g)});
                        break;
                    case 2:
                        Method method = cls.getMethod(sb2, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1836g);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(sb2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1832c)});
                        break;
                    case 4:
                        cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1833d)});
                        break;
                    case 5:
                        cls.getMethod(sb2, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f1834e});
                        break;
                    case 6:
                        cls.getMethod(sb2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f1835f)});
                        break;
                    case 7:
                        cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1833d)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo2393a(View view, float[] fArr) {
        View view2 = view;
        String str = "\"";
        String str2 = "on View \"";
        String str3 = "TransitionLayout";
        Class cls = view.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        sb.append(this.f1830a);
        String sb2 = sb.toString();
        try {
            boolean z = true;
            switch (C0419a.f1837a[this.f1831b.ordinal()]) {
                case 1:
                    Method method = cls.getMethod(sb2, new Class[]{Integer.TYPE});
                    int a = m2274a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a2 = m2274a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    method.invoke(view2, new Object[]{Integer.valueOf((a << 16) | (m2274a((int) (fArr[3] * 255.0f)) << 24) | (a2 << 8) | m2274a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 2:
                    Method method2 = cls.getMethod(sb2, new Class[]{Drawable.class});
                    int a3 = m2274a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a4 = m2274a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    int a5 = (a3 << 16) | (m2274a((int) (fArr[3] * 255.0f)) << 24) | (a4 << 8) | m2274a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(a5);
                    method2.invoke(view2, new Object[]{colorDrawable});
                    return;
                case 3:
                    cls.getMethod(sb2, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 4:
                    cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 5:
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("unable to interpolate strings ");
                    sb3.append(this.f1830a);
                    throw new RuntimeException(sb3.toString());
                case 6:
                    Method method3 = cls.getMethod(sb2, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method3.invoke(view2, objArr);
                    return;
                case 7:
                    cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("no method ");
            sb4.append(sb2);
            sb4.append(str2);
            sb4.append(C0319b.m1806a(view));
            sb4.append(str);
            Log.e(str3, sb4.toString());
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("cannot access method ");
            sb5.append(sb2);
            sb5.append(str2);
            sb5.append(C0319b.m1806a(view));
            sb5.append(str);
            Log.e(str3, sb5.toString());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m2276a(Context context, XmlPullParser xmlPullParser, HashMap<String, C0418a> hashMap) {
        C0420b bVar;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0420b bVar2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0436i.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Character.toUpperCase(str.charAt(0)));
                    sb.append(str.substring(1));
                    str = sb.toString();
                }
            } else if (index == C0436i.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = C0420b.BOOLEAN_TYPE;
            } else {
                if (index == C0436i.CustomAttribute_customColorValue) {
                    bVar = C0420b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0436i.CustomAttribute_customColorDrawableValue) {
                    bVar = C0420b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0436i.CustomAttribute_customPixelDimension) {
                    bVar = C0420b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C0436i.CustomAttribute_customDimension) {
                    bVar = C0420b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0436i.CustomAttribute_customFloatValue) {
                    bVar = C0420b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0436i.CustomAttribute_customIntegerValue) {
                    bVar = C0420b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0436i.CustomAttribute_customStringValue) {
                    bVar = C0420b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C0418a(str, bVar2, obj));
        }
        obtainStyledAttributes.recycle();
    }
}
