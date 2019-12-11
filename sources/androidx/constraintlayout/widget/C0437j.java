package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.j */
/* compiled from: StateSet */
public class C0437j {

    /* renamed from: a */
    int f1990a = -1;

    /* renamed from: b */
    int f1991b = -1;

    /* renamed from: c */
    int f1992c = -1;

    /* renamed from: d */
    private SparseArray<C0438a> f1993d = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.j$a */
    /* compiled from: StateSet */
    static class C0438a {

        /* renamed from: a */
        int f1994a;

        /* renamed from: b */
        ArrayList<C0439b> f1995b = new ArrayList<>();

        /* renamed from: c */
        int f1996c = -1;

        public C0438a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.State_android_id) {
                    this.f1994a = obtainStyledAttributes.getResourceId(index, this.f1994a);
                } else if (index == C0436i.State_constraints) {
                    this.f1996c = obtainStyledAttributes.getResourceId(index, this.f1996c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1996c);
                    context.getResources().getResourceName(this.f1996c);
                    boolean equals = "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2463a(C0439b bVar) {
            this.f1995b.add(bVar);
        }

        /* renamed from: a */
        public int mo2462a(float f, float f2) {
            for (int i = 0; i < this.f1995b.size(); i++) {
                if (((C0439b) this.f1995b.get(i)).mo2464a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.j$b */
    /* compiled from: StateSet */
    static class C0439b {

        /* renamed from: a */
        float f1997a = Float.NaN;

        /* renamed from: b */
        float f1998b = Float.NaN;

        /* renamed from: c */
        float f1999c = Float.NaN;

        /* renamed from: d */
        float f2000d = Float.NaN;

        /* renamed from: e */
        int f2001e = -1;

        public C0439b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.Variant_constraints) {
                    this.f2001e = obtainStyledAttributes.getResourceId(index, this.f2001e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2001e);
                    context.getResources().getResourceName(this.f2001e);
                    boolean equals = "layout".equals(resourceTypeName);
                } else if (index == C0436i.Variant_region_heightLessThan) {
                    this.f2000d = obtainStyledAttributes.getDimension(index, this.f2000d);
                } else if (index == C0436i.Variant_region_heightMoreThan) {
                    this.f1998b = obtainStyledAttributes.getDimension(index, this.f1998b);
                } else if (index == C0436i.Variant_region_widthLessThan) {
                    this.f1999c = obtainStyledAttributes.getDimension(index, this.f1999c);
                } else if (index == C0436i.Variant_region_widthMoreThan) {
                    this.f1997a = obtainStyledAttributes.getDimension(index, this.f1997a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2464a(float f, float f2) {
            if (!Float.isNaN(this.f1997a) && f < this.f1997a) {
                return false;
            }
            if (!Float.isNaN(this.f1998b) && f2 < this.f1998b) {
                return false;
            }
            if (!Float.isNaN(this.f1999c) && f > this.f1999c) {
                return false;
            }
            if (Float.isNaN(this.f2000d) || f2 <= this.f2000d) {
                return true;
            }
            return false;
        }
    }

    public C0437j(Context context, XmlPullParser xmlPullParser) {
        new SparseArray();
        m2355a(context, xmlPullParser);
    }

    /* renamed from: a */
    private void m2355a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0436i.StateSet_defaultState) {
                this.f1990a = obtainStyledAttributes.getResourceId(index, this.f1990a);
            }
        }
        C0438a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 0) {
                    String str = "StateSet";
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case 80204913:
                                if (name.equals("State")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1301459538:
                                if (name.equals("LayoutDescription")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals(str)) {
                                    c = 1;
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
                                aVar = new C0438a(context, xmlPullParser);
                                this.f1993d.put(aVar.f1994a, aVar);
                            } else if (c != 3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("unknown tag ");
                                sb.append(name);
                                Log.v("ConstraintLayoutStates", sb.toString());
                            } else {
                                C0439b bVar = new C0439b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.mo2463a(bVar);
                                }
                            }
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else if (str.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public int mo2461b(int i, int i2, float f, float f2) {
        C0438a aVar;
        if (i == i2) {
            if (i2 == -1) {
                aVar = (C0438a) this.f1993d.valueAt(0);
            } else {
                aVar = (C0438a) this.f1993d.get(this.f1991b);
            }
            if (aVar == null) {
                return -1;
            }
            if (this.f1992c != -1 && ((C0439b) aVar.f1995b.get(i)).mo2464a(f, f2)) {
                return i;
            }
            int a = aVar.mo2462a(f, f2);
            if (i == a) {
                return i;
            }
            return a == -1 ? aVar.f1996c : ((C0439b) aVar.f1995b.get(a)).f2001e;
        }
        C0438a aVar2 = (C0438a) this.f1993d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int a2 = aVar2.mo2462a(f, f2);
        return a2 == -1 ? aVar2.f1996c : ((C0439b) aVar2.f1995b.get(a2)).f2001e;
    }

    /* renamed from: a */
    public int mo2460a(int i, int i2, int i3) {
        return mo2461b(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: a */
    public int mo2459a(int i, int i2, float f, float f2) {
        C0438a aVar = (C0438a) this.f1993d.get(i2);
        if (f != -1.0f && f2 != -1.0f) {
            C0439b bVar = null;
            Iterator it = aVar.f1995b.iterator();
            while (it.hasNext()) {
                C0439b bVar2 = (C0439b) it.next();
                if (bVar2.mo2464a(f, f2)) {
                    if (i == bVar2.f2001e) {
                        return i;
                    }
                    bVar = bVar2;
                }
            }
            if (bVar != null) {
                return bVar.f2001e;
            }
            return aVar.f1996c;
        } else if (aVar.f1996c == i) {
            return i;
        } else {
            Iterator it2 = aVar.f1995b.iterator();
            while (it2.hasNext()) {
                if (i == ((C0439b) it2.next()).f2001e) {
                    return i;
                }
            }
            return aVar.f1996c;
        }
    }
}
