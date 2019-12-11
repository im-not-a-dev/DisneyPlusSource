package p096e.p121h.p122j.p124d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p096e.p121h.C4024i;
import p096e.p121h.p131p.C4072a;

/* renamed from: e.h.j.d.c */
/* compiled from: FontResourcesParserCompat */
public class C4031c {

    /* renamed from: e.h.j.d.c$a */
    /* compiled from: FontResourcesParserCompat */
    public interface C4032a {
    }

    /* renamed from: e.h.j.d.c$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class C4033b implements C4032a {

        /* renamed from: a */
        private final C4034c[] f10230a;

        public C4033b(C4034c[] cVarArr) {
            this.f10230a = cVarArr;
        }

        /* renamed from: a */
        public C4034c[] mo14547a() {
            return this.f10230a;
        }
    }

    /* renamed from: e.h.j.d.c$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C4034c {

        /* renamed from: a */
        private final String f10231a;

        /* renamed from: b */
        private int f10232b;

        /* renamed from: c */
        private boolean f10233c;

        /* renamed from: d */
        private String f10234d;

        /* renamed from: e */
        private int f10235e;

        /* renamed from: f */
        private int f10236f;

        public C4034c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f10231a = str;
            this.f10232b = i;
            this.f10233c = z;
            this.f10234d = str2;
            this.f10235e = i2;
            this.f10236f = i3;
        }

        /* renamed from: a */
        public String mo14548a() {
            return this.f10231a;
        }

        /* renamed from: b */
        public int mo14549b() {
            return this.f10236f;
        }

        /* renamed from: c */
        public int mo14550c() {
            return this.f10235e;
        }

        /* renamed from: d */
        public String mo14551d() {
            return this.f10234d;
        }

        /* renamed from: e */
        public int mo14552e() {
            return this.f10232b;
        }

        /* renamed from: f */
        public boolean mo14553f() {
            return this.f10233c;
        }
    }

    /* renamed from: e.h.j.d.c$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C4035d implements C4032a {

        /* renamed from: a */
        private final C4072a f10237a;

        /* renamed from: b */
        private final int f10238b;

        /* renamed from: c */
        private final int f10239c;

        public C4035d(C4072a aVar, int i, int i2) {
            this.f10237a = aVar;
            this.f10239c = i;
            this.f10238b = i2;
        }

        /* renamed from: a */
        public int mo14554a() {
            return this.f10239c;
        }

        /* renamed from: b */
        public C4072a mo14555b() {
            return this.f10237a;
        }

        /* renamed from: c */
        public int mo14556c() {
            return this.f10238b;
        }
    }

    /* renamed from: a */
    public static C4032a m13823a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m13827b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    private static C4032a m13827b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        String str = "font-family";
        xmlPullParser.require(2, null, str);
        if (xmlPullParser.getName().equals(str)) {
            return m13828c(xmlPullParser, resources);
        }
        m13826a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C4032a m13828c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C4024i.FontFamily);
        String string = obtainAttributes.getString(C4024i.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C4024i.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C4024i.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C4024i.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C4024i.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C4024i.FontFamily_fontProviderFetchTimeout, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m13829d(xmlPullParser, resources));
                    } else {
                        m13826a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C4033b((C4034c[]) arrayList.toArray(new C4034c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m13826a(xmlPullParser);
        }
        return new C4035d(new C4072a(string, string2, string3, m13824a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C4034c m13829d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C4024i.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C4024i.FontFamilyFont_fontWeight) ? C4024i.FontFamilyFont_fontWeight : C4024i.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C4024i.FontFamilyFont_fontStyle) ? C4024i.FontFamilyFont_fontStyle : C4024i.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C4024i.FontFamilyFont_ttcIndex) ? C4024i.FontFamilyFont_ttcIndex : C4024i.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C4024i.FontFamilyFont_fontVariationSettings) ? C4024i.FontFamilyFont_fontVariationSettings : C4024i.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C4024i.FontFamilyFont_font) ? C4024i.FontFamilyFont_font : C4024i.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m13826a(xmlPullParser);
        }
        C4034c cVar = new C4034c(string2, i, z, string, i3, resourceId);
        return cVar;
    }

    /* renamed from: a */
    private static int m13822a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m13824a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m13822a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m13825a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m13825a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m13825a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m13826a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
