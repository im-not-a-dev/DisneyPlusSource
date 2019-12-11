package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C0418a;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.h */
/* compiled from: KeyFrames */
public class C0343h {

    /* renamed from: b */
    static HashMap<String, Constructor<? extends C0321d>> f1501b = new HashMap<>();

    /* renamed from: a */
    private HashMap<Integer, ArrayList<C0321d>> f1502a = new HashMap<>();

    static {
        try {
            f1501b.put("KeyAttribute", C0322e.class.getConstructor(new Class[0]));
            f1501b.put("KeyPosition", C0344i.class.getConstructor(new Class[0]));
            f1501b.put("KeyCycle", C0324f.class.getConstructor(new Class[0]));
            f1501b.put("KeyTimeCycle", C0349l.class.getConstructor(new Class[0]));
            f1501b.put("KeyTrigger", C0351m.class.getConstructor(new Class[0]));
            f1501b.put("KeySpring", C0347k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public C0343h(Context context, XmlPullParser xmlPullParser) {
        C0321d dVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        if (f1501b.containsKey(name)) {
                            try {
                                C0321d dVar2 = (C0321d) ((Constructor) f1501b.get(name)).newInstance(new Object[0]);
                                try {
                                    dVar2.mo2192a(context, Xml.asAttributeSet(xmlPullParser));
                                    m1916a(dVar2);
                                    dVar = dVar2;
                                } catch (Exception e) {
                                    C0321d dVar3 = dVar2;
                                    e = e;
                                    dVar = dVar3;
                                    Log.e("KeyFrames", "unable to create ", e);
                                    eventType = xmlPullParser.next();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                Log.e("KeyFrames", "unable to create ", e);
                                eventType = xmlPullParser.next();
                            }
                        } else if (!(!name.equalsIgnoreCase("CustomAttribute") || dVar == null || dVar.f1446d == null)) {
                            C0418a.m2276a(context, xmlPullParser, dVar.f1446d);
                        }
                    } else if (eventType == 3) {
                        if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                            return;
                        }
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1916a(C0321d dVar) {
        if (!this.f1502a.containsKey(Integer.valueOf(dVar.f1444b))) {
            this.f1502a.put(Integer.valueOf(dVar.f1444b), new ArrayList());
        }
        ((ArrayList) this.f1502a.get(Integer.valueOf(dVar.f1444b))).add(dVar);
    }

    /* renamed from: a */
    public void mo2213a(C0354o oVar) {
        ArrayList arrayList = (ArrayList) this.f1502a.get(Integer.valueOf(oVar.f1591b));
        if (arrayList != null) {
            oVar.mo2235a(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f1502a.get(Integer.valueOf(-1));
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C0321d dVar = (C0321d) it.next();
                if (dVar.mo2195a(((C0415c) oVar.f1590a.getLayoutParams()).f1782U)) {
                    oVar.mo2233a(dVar);
                }
            }
        }
    }
}
