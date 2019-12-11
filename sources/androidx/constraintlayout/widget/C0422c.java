package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
/* compiled from: ConstraintLayoutStates */
public class C0422c {

    /* renamed from: a */
    private final ConstraintLayout f1854a;

    /* renamed from: b */
    C0425d f1855b;

    /* renamed from: c */
    int f1856c = -1;

    /* renamed from: d */
    int f1857d = -1;

    /* renamed from: e */
    private SparseArray<C0423a> f1858e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0425d> f1859f = new SparseArray<>();

    /* renamed from: g */
    private C0433f f1860g = null;

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* compiled from: ConstraintLayoutStates */
    static class C0423a {

        /* renamed from: a */
        int f1861a;

        /* renamed from: b */
        ArrayList<C0424b> f1862b = new ArrayList<>();

        /* renamed from: c */
        int f1863c = -1;

        /* renamed from: d */
        C0425d f1864d;

        public C0423a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.State_android_id) {
                    this.f1861a = obtainStyledAttributes.getResourceId(index, this.f1861a);
                } else if (index == C0436i.State_constraints) {
                    this.f1863c = obtainStyledAttributes.getResourceId(index, this.f1863c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1863c);
                    context.getResources().getResourceName(this.f1863c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f1864d = new C0425d();
                        this.f1864d.mo2416a(context, this.f1863c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2408a(C0424b bVar) {
            this.f1862b.add(bVar);
        }

        /* renamed from: a */
        public int mo2407a(float f, float f2) {
            for (int i = 0; i < this.f1862b.size(); i++) {
                if (((C0424b) this.f1862b.get(i)).mo2409a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* compiled from: ConstraintLayoutStates */
    static class C0424b {

        /* renamed from: a */
        float f1865a = Float.NaN;

        /* renamed from: b */
        float f1866b = Float.NaN;

        /* renamed from: c */
        float f1867c = Float.NaN;

        /* renamed from: d */
        float f1868d = Float.NaN;

        /* renamed from: e */
        int f1869e = -1;

        /* renamed from: f */
        C0425d f1870f;

        public C0424b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.Variant_constraints) {
                    this.f1869e = obtainStyledAttributes.getResourceId(index, this.f1869e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1869e);
                    context.getResources().getResourceName(this.f1869e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f1870f = new C0425d();
                        this.f1870f.mo2416a(context, this.f1869e);
                    }
                } else if (index == C0436i.Variant_region_heightLessThan) {
                    this.f1868d = obtainStyledAttributes.getDimension(index, this.f1868d);
                } else if (index == C0436i.Variant_region_heightMoreThan) {
                    this.f1866b = obtainStyledAttributes.getDimension(index, this.f1866b);
                } else if (index == C0436i.Variant_region_widthLessThan) {
                    this.f1867c = obtainStyledAttributes.getDimension(index, this.f1867c);
                } else if (index == C0436i.Variant_region_widthMoreThan) {
                    this.f1865a = obtainStyledAttributes.getDimension(index, this.f1865a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2409a(float f, float f2) {
            if (!Float.isNaN(this.f1865a) && f < this.f1865a) {
                return false;
            }
            if (!Float.isNaN(this.f1866b) && f2 < this.f1866b) {
                return false;
            }
            if (!Float.isNaN(this.f1867c) && f > this.f1867c) {
                return false;
            }
            if (Float.isNaN(this.f1868d) || f2 <= this.f1868d) {
                return true;
            }
            return false;
        }
    }

    C0422c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1854a = constraintLayout;
        m2296a(context, i);
    }

    /* renamed from: a */
    public void mo2405a(int i, float f, float f2) {
        C0425d dVar;
        int i2;
        C0423a aVar;
        C0425d dVar2;
        int i3;
        int i4 = this.f1856c;
        if (i4 == i) {
            if (i == -1) {
                aVar = (C0423a) this.f1858e.valueAt(0);
            } else {
                aVar = (C0423a) this.f1858e.get(i4);
            }
            int i5 = this.f1857d;
            if (i5 == -1 || !((C0424b) aVar.f1862b.get(i5)).mo2409a(f, f2)) {
                int a = aVar.mo2407a(f, f2);
                if (this.f1857d != a) {
                    if (a == -1) {
                        dVar2 = this.f1855b;
                    } else {
                        dVar2 = ((C0424b) aVar.f1862b.get(a)).f1870f;
                    }
                    if (a == -1) {
                        i3 = aVar.f1863c;
                    } else {
                        i3 = ((C0424b) aVar.f1862b.get(a)).f1869e;
                    }
                    if (dVar2 != null) {
                        this.f1857d = a;
                        C0433f fVar = this.f1860g;
                        if (fVar != null) {
                            fVar.mo2451b(-1, i3);
                        }
                        dVar2.mo2427b(this.f1854a);
                        C0433f fVar2 = this.f1860g;
                        if (fVar2 != null) {
                            fVar2.mo2450a(-1, i3);
                        }
                    }
                }
            }
        } else {
            this.f1856c = i;
            C0423a aVar2 = (C0423a) this.f1858e.get(this.f1856c);
            int a2 = aVar2.mo2407a(f, f2);
            if (a2 == -1) {
                dVar = aVar2.f1864d;
            } else {
                dVar = ((C0424b) aVar2.f1862b.get(a2)).f1870f;
            }
            if (a2 == -1) {
                i2 = aVar2.f1863c;
            } else {
                i2 = ((C0424b) aVar2.f1862b.get(a2)).f1869e;
            }
            if (dVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("NO Constraint set found ! id=");
                sb.append(i);
                sb.append(", dim =");
                sb.append(f);
                sb.append(", ");
                sb.append(f2);
                Log.v("ConstraintLayoutStates", sb.toString());
                return;
            }
            this.f1857d = a2;
            C0433f fVar3 = this.f1860g;
            if (fVar3 != null) {
                fVar3.mo2451b(i, i2);
            }
            dVar.mo2427b(this.f1854a);
            C0433f fVar4 = this.f1860g;
            if (fVar4 != null) {
                fVar4.mo2450a(i, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo2406a(C0433f fVar) {
        this.f1860g = fVar;
    }

    /* renamed from: a */
    private void m2296a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0423a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0423a(context, xml);
                            this.f1858e.put(aVar.f1861a, aVar);
                        } else if (c == 3) {
                            C0424b bVar = new C0424b(context, xml);
                            if (aVar != null) {
                                aVar.mo2408a(bVar);
                            }
                        } else if (c != 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown tag ");
                            sb.append(name);
                            Log.v("ConstraintLayoutStates", sb.toString());
                        } else {
                            m2297a(context, (XmlPullParser) xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2297a(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0425d dVar = new C0425d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String str = "mId";
            if (str.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), str, context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing mId");
                    } else {
                        i = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                dVar.mo2417a(context, xmlPullParser);
                this.f1859f.put(i, dVar);
                return;
            }
        }
    }
}
