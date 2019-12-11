package com.google.android.exoplayer2.p393v0;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.exoplayer2.v0.l0 */
/* compiled from: XmlPullParserUtil */
public final class C9556l0 {
    /* renamed from: a */
    public static boolean m29463a(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: b */
    public static boolean m29465b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: c */
    public static boolean m29466c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m29463a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: d */
    public static boolean m29467d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m29465b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m29468e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m29465b(xmlPullParser) && m29461a(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: a */
    public static String m29462a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m29464b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m29461a(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m29461a(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
