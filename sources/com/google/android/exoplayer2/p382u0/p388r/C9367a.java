package com.google.android.exoplayer2.p382u0.p388r;

import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.p382u0.C9327g;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9556l0;
import com.google.android.exoplayer2.p393v0.C9563q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.exoplayer2.u0.r.a */
/* compiled from: TtmlDecoder */
public final class C9367a extends C9323c {

    /* renamed from: o */
    private static final Pattern f21550o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p */
    private static final Pattern f21551p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q */
    private static final Pattern f21552q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r */
    private static final Pattern f21553r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    private static final Pattern f21554s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    private static final Pattern f21555t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    private static final C9369b f21556u = new C9369b(30.0f, 1, 1);

    /* renamed from: v */
    private static final C9368a f21557v = new C9368a(32, 15);

    /* renamed from: n */
    private final XmlPullParserFactory f21558n;

    /* renamed from: com.google.android.exoplayer2.u0.r.a$a */
    /* compiled from: TtmlDecoder */
    private static final class C9368a {

        /* renamed from: a */
        final int f21559a;

        C9368a(int i, int i2) {
            this.f21559a = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.r.a$b */
    /* compiled from: TtmlDecoder */
    private static final class C9369b {

        /* renamed from: a */
        final float f21560a;

        /* renamed from: b */
        final int f21561b;

        /* renamed from: c */
        final int f21562c;

        C9369b(float f, int i, int i2) {
            this.f21560a = f;
            this.f21561b = i;
            this.f21562c = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.r.a$c */
    /* compiled from: TtmlDecoder */
    private static final class C9370c {

        /* renamed from: a */
        final int f21563a;

        /* renamed from: b */
        final int f21564b;

        C9370c(int i, int i2) {
            this.f21563a = i;
            this.f21564b = i2;
        }
    }

    public C9367a() {
        super("TtmlDecoder");
        try {
            this.f21558n = XmlPullParserFactory.newInstance();
            this.f21558n.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: b */
    private C9370c m28572b(XmlPullParser xmlPullParser) {
        String a = C9556l0.m29462a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f21554s.matcher(a);
        String str = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring non-pixel tts extent: ");
            sb.append(a);
            C9563q.m29500d(str, sb.toString());
            return null;
        }
        try {
            return new C9370c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring malformed tts extent: ");
            sb2.append(a);
            C9563q.m29500d(str, sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9375f m28575a(byte[] bArr, int i, boolean z) throws C9327g {
        C9370c cVar;
        C9368a aVar;
        C9369b bVar;
        C9375f fVar;
        C9369b bVar2;
        try {
            XmlPullParser newPullParser = this.f21558n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            C9370c cVar2 = null;
            hashMap2.put("", new C9372c(null));
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C9369b bVar3 = f21556u;
            C9368a aVar2 = f21557v;
            C9375f fVar2 = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C9371b bVar4 = (C9371b) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    String str = "tt";
                    if (eventType == 2) {
                        if (str.equals(name)) {
                            C9369b a = m28563a(newPullParser);
                            aVar = m28562a(newPullParser, f21557v);
                            cVar = m28572b(newPullParser);
                            bVar = a;
                        } else {
                            cVar = cVar2;
                            bVar = bVar3;
                            aVar = aVar2;
                        }
                        String str2 = "TtmlDecoder";
                        if (!m28571a(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring unsupported tag: ");
                            sb.append(newPullParser.getName());
                            C9563q.m29499c(str2, sb.toString());
                            i2++;
                            bVar3 = bVar;
                        } else {
                            if ("head".equals(name)) {
                                fVar = fVar2;
                                bVar2 = bVar;
                                m28568a(newPullParser, hashMap, aVar, cVar, hashMap2, hashMap3);
                            } else {
                                fVar = fVar2;
                                bVar2 = bVar;
                                try {
                                    C9371b a2 = m28564a(newPullParser, bVar4, hashMap2, bVar2);
                                    arrayDeque.push(a2);
                                    if (bVar4 != null) {
                                        bVar4.mo24194a(a2);
                                    }
                                } catch (C9327g e) {
                                    C9563q.m29498b(str2, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar3 = bVar2;
                            fVar2 = fVar;
                        }
                    } else {
                        C9375f fVar3 = fVar2;
                        if (eventType == 4) {
                            bVar4.mo24194a(C9371b.m28578a(newPullParser.getText()));
                        } else if (eventType == 3) {
                            fVar2 = newPullParser.getName().equals(str) ? new C9375f((C9371b) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : fVar3;
                            arrayDeque.pop();
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                        fVar2 = fVar3;
                        cVar = cVar2;
                        aVar = aVar2;
                    }
                    aVar2 = aVar;
                    cVar2 = cVar;
                } else {
                    C9375f fVar4 = fVar2;
                    if (eventType == 2) {
                        i2++;
                    } else if (eventType == 3) {
                        i2--;
                    }
                    fVar2 = fVar4;
                }
                newPullParser.next();
            }
            return fVar2;
        } catch (XmlPullParserException e2) {
            throw new C9327g("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }

    /* renamed from: b */
    private String[] m28573b(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C9554k0.m29423a(trim, "\\s+");
    }

    /* renamed from: a */
    private C9369b m28563a(XmlPullParser xmlPullParser) throws C9327g {
        String str = "http://www.w3.org/ns/ttml#parameter";
        String attributeValue = xmlPullParser.getAttributeValue(str, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] a = C9554k0.m29423a(attributeValue2, " ");
            if (a.length == 2) {
                f = ((float) Integer.parseInt(a[0])) / ((float) Integer.parseInt(a[1]));
            } else {
                throw new C9327g("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = f21556u.f21561b;
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f21556u.f21562c;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C9369b(((float) parseInt) * f, i, i2);
    }

    /* renamed from: a */
    private C9368a m28562a(XmlPullParser xmlPullParser, C9368a aVar) throws C9327g {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f21555t.matcher(attributeValue);
        String str = "Ignoring malformed cell resolution: ";
        String str2 = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(attributeValue);
            C9563q.m29500d(str2, sb.toString());
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C9368a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new C9327g(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(attributeValue);
            C9563q.m29500d(str2, sb3.toString());
            return aVar;
        }
    }

    /* renamed from: a */
    private Map<String, C9374e> m28568a(XmlPullParser xmlPullParser, Map<String, C9374e> map, C9368a aVar, C9370c cVar, Map<String, C9372c> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            String str = "style";
            if (C9556l0.m29467d(xmlPullParser, str)) {
                String a = C9556l0.m29462a(xmlPullParser, str);
                C9374e a2 = m28567a(xmlPullParser, new C9374e());
                if (a != null) {
                    for (String str2 : m28573b(a)) {
                        a2.mo24201a((C9374e) map.get(str2));
                    }
                }
                if (a2.mo24214f() != null) {
                    map.put(a2.mo24214f(), a2);
                }
            } else if (C9556l0.m29467d(xmlPullParser, "region")) {
                C9372c a3 = m28565a(xmlPullParser, aVar, cVar);
                if (a3 != null) {
                    map2.put(a3.f21577a, a3);
                }
            } else if (C9556l0.m29467d(xmlPullParser, "metadata")) {
                m28570a(xmlPullParser, map3);
            }
        } while (!C9556l0.m29466c(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: a */
    private void m28570a(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (C9556l0.m29467d(xmlPullParser, "image")) {
                String a = C9556l0.m29462a(xmlPullParser, "id");
                if (a != null) {
                    map.put(a, xmlPullParser.nextText());
                }
            }
        } while (!C9556l0.m29466c(xmlPullParser, "metadata"));
    }

    /* renamed from: a */
    private C9372c m28565a(XmlPullParser xmlPullParser, C9368a aVar, C9370c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C9370c cVar2 = cVar;
        String a = C9556l0.m29462a(xmlPullParser2, "id");
        if (a == null) {
            return null;
        }
        String a2 = C9556l0.m29462a(xmlPullParser2, "origin");
        String str = "TtmlDecoder";
        if (a2 != null) {
            Matcher matcher = f21553r.matcher(a2);
            Matcher matcher2 = f21554s.matcher(a2);
            String str2 = "Ignoring region with malformed origin: ";
            String str3 = "Ignoring region with missing tts:extent: ";
            if (matcher.matches()) {
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    f = Float.parseFloat(matcher.group(2)) / 100.0f;
                    f2 = parseFloat;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(a2);
                    C9563q.m29500d(str, sb.toString());
                    return null;
                }
            } else if (!matcher2.matches()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring region with unsupported origin: ");
                sb2.append(a2);
                C9563q.m29500d(str, sb2.toString());
                return null;
            } else if (cVar2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(a2);
                C9563q.m29500d(str, sb3.toString());
                return null;
            } else {
                try {
                    int parseInt = Integer.parseInt(matcher2.group(1));
                    f2 = ((float) parseInt) / ((float) cVar2.f21563a);
                    f = ((float) Integer.parseInt(matcher2.group(2))) / ((float) cVar2.f21564b);
                } catch (NumberFormatException unused2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(a2);
                    C9563q.m29500d(str, sb4.toString());
                    return null;
                }
            }
            String a3 = C9556l0.m29462a(xmlPullParser2, "extent");
            if (a3 != null) {
                Matcher matcher3 = f21553r.matcher(a3);
                Matcher matcher4 = f21554s.matcher(a3);
                String str4 = "Ignoring region with malformed extent: ";
                if (matcher3.matches()) {
                    try {
                        f4 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                        f3 = Float.parseFloat(matcher3.group(2)) / 100.0f;
                    } catch (NumberFormatException unused3) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str4);
                        sb5.append(a2);
                        C9563q.m29500d(str, sb5.toString());
                        return null;
                    }
                } else if (!matcher4.matches()) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Ignoring region with unsupported extent: ");
                    sb6.append(a2);
                    C9563q.m29500d(str, sb6.toString());
                    return null;
                } else if (cVar2 == null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str3);
                    sb7.append(a2);
                    C9563q.m29500d(str, sb7.toString());
                    return null;
                } else {
                    try {
                        int parseInt2 = Integer.parseInt(matcher4.group(1));
                        f4 = ((float) parseInt2) / ((float) cVar2.f21563a);
                        f3 = ((float) Integer.parseInt(matcher4.group(2))) / ((float) cVar2.f21564b);
                    } catch (NumberFormatException unused4) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str4);
                        sb8.append(a2);
                        C9563q.m29500d(str, sb8.toString());
                        return null;
                    }
                }
                String a4 = C9556l0.m29462a(xmlPullParser2, "displayAlign");
                if (a4 != null) {
                    String k = C9554k0.m29457k(a4);
                    char c = 65535;
                    int hashCode = k.hashCode();
                    if (hashCode != -1364013995) {
                        if (hashCode == 92734940 && k.equals("after")) {
                            c = 1;
                        }
                    } else if (k.equals("center")) {
                        c = 0;
                    }
                    if (c == 0) {
                        f += f3 / 2.0f;
                        i = 1;
                    } else if (c == 1) {
                        f += f3;
                        i = 2;
                    }
                    C9372c cVar3 = new C9372c(a, f2, f, 0, i, f4, f3, 1, 1.0f / ((float) aVar.f21559a));
                    return cVar3;
                }
                i = 0;
                C9372c cVar32 = new C9372c(a, f2, f, 0, i, f4, f3, 1, 1.0f / ((float) aVar.f21559a));
                return cVar32;
            }
            C9563q.m29500d(str, "Ignoring region without an extent");
            return null;
        }
        C9563q.m29500d(str, "Ignoring region without an origin");
        return null;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.p382u0.p388r.C9374e m28567a(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.p382u0.p388r.C9374e r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = r13
            r13 = 0
        L_0x0007:
            if (r13 >= r0) goto L_0x01ff
            java.lang.String r3 = r12.getAttributeValue(r13)
            java.lang.String r4 = r12.getAttributeName(r13)
            int r5 = r4.hashCode()
            r6 = 4
            r7 = -1
            r8 = 2
            r9 = 3
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x006f;
                case -1224696685: goto L_0x0065;
                case -1065511464: goto L_0x005b;
                case -879295043: goto L_0x0050;
                case -734428249: goto L_0x0046;
                case 3355: goto L_0x003c;
                case 94842723: goto L_0x0032;
                case 365601008: goto L_0x0028;
                case 1287124693: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0079
        L_0x001e:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0028:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 4
            goto L_0x007a
        L_0x0032:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 2
            goto L_0x007a
        L_0x003c:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 0
            goto L_0x007a
        L_0x0046:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 5
            goto L_0x007a
        L_0x0050:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 8
            goto L_0x007a
        L_0x005b:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 7
            goto L_0x007a
        L_0x0065:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 3
            goto L_0x007a
        L_0x006f:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 6
            goto L_0x007a
        L_0x0079:
            r4 = -1
        L_0x007a:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x01e8;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01a6;
                case 3: goto L_0x019e;
                case 4: goto L_0x0180;
                case 5: goto L_0x0171;
                case 6: goto L_0x0162;
                case 7: goto L_0x00e2;
                case 8: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x01fb
        L_0x0081:
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.m29457k(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x00ab;
                case -1026963764: goto L_0x00a1;
                case 913457136: goto L_0x0097;
                case 1679736913: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x00b4
        L_0x008d:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = 0
            goto L_0x00b4
        L_0x0097:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = 1
            goto L_0x00b4
        L_0x00a1:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = 2
            goto L_0x00b4
        L_0x00ab:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = 3
        L_0x00b4:
            if (r7 == 0) goto L_0x00d9
            if (r7 == r10) goto L_0x00d0
            if (r7 == r8) goto L_0x00c7
            if (r7 == r9) goto L_0x00be
            goto L_0x01fb
        L_0x00be:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            r2.mo24212d(r1)
            goto L_0x01fb
        L_0x00c7:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            r2.mo24212d(r10)
            goto L_0x01fb
        L_0x00d0:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            r2.mo24209c(r1)
            goto L_0x01fb
        L_0x00d9:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            r2.mo24209c(r10)
            goto L_0x01fb
        L_0x00e2:
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.m29457k(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0116;
                case 100571: goto L_0x010c;
                case 3317767: goto L_0x0102;
                case 108511772: goto L_0x00f8;
                case 109757538: goto L_0x00ee;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x011f
        L_0x00ee:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = 1
            goto L_0x011f
        L_0x00f8:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = 2
            goto L_0x011f
        L_0x0102:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = 0
            goto L_0x011f
        L_0x010c:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = 3
            goto L_0x011f
        L_0x0116:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = 4
        L_0x011f:
            if (r7 == 0) goto L_0x0157
            if (r7 == r10) goto L_0x014c
            if (r7 == r8) goto L_0x0141
            if (r7 == r9) goto L_0x0136
            if (r7 == r6) goto L_0x012b
            goto L_0x01fb
        L_0x012b:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            r2.mo24200a(r3)
            goto L_0x01fb
        L_0x0136:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r2.mo24200a(r3)
            goto L_0x01fb
        L_0x0141:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r2.mo24200a(r3)
            goto L_0x01fb
        L_0x014c:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2.mo24200a(r3)
            goto L_0x01fb
        L_0x0157:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2.mo24200a(r3)
            goto L_0x01fb
        L_0x0162:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r2.mo24207b(r3)
            goto L_0x01fb
        L_0x0171:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r2.mo24203a(r3)
            goto L_0x01fb
        L_0x0180:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)     // Catch:{ g -> 0x0189 }
            m28569a(r3, r2)     // Catch:{ g -> 0x0189 }
            goto L_0x01fb
        L_0x0189:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r5, r3)
            goto L_0x01fb
        L_0x019e:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            r2.mo24202a(r3)
            goto L_0x01fb
        L_0x01a6:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            int r4 = com.google.android.exoplayer2.p393v0.C9546i.m29357b(r3)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r2.mo24205b(r4)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            goto L_0x01fb
        L_0x01b2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r5, r3)
            goto L_0x01fb
        L_0x01c7:
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            int r4 = com.google.android.exoplayer2.p393v0.C9546i.m29357b(r3)     // Catch:{ IllegalArgumentException -> 0x01d3 }
            r2.mo24199a(r4)     // Catch:{ IllegalArgumentException -> 0x01d3 }
            goto L_0x01fb
        L_0x01d3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r5, r3)
            goto L_0x01fb
        L_0x01e8:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01fb
            com.google.android.exoplayer2.u0.r.e r2 = r11.m28566a(r2)
            r2.mo24206b(r3)
        L_0x01fb:
            int r13 = r13 + 1
            goto L_0x0007
        L_0x01ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p388r.C9367a.m28567a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.u0.r.e):com.google.android.exoplayer2.u0.r.e");
    }

    /* renamed from: a */
    private C9374e m28566a(C9374e eVar) {
        return eVar == null ? new C9374e() : eVar;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.p382u0.p388r.C9371b m28564a(org.xmlpull.v1.XmlPullParser r21, com.google.android.exoplayer2.p382u0.p388r.C9371b r22, java.util.Map<java.lang.String, com.google.android.exoplayer2.p382u0.p388r.C9372c> r23, com.google.android.exoplayer2.p382u0.p388r.C9367a.C9369b r24) throws com.google.android.exoplayer2.p382u0.C9327g {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r21.getAttributeCount()
            r5 = 0
            com.google.android.exoplayer2.u0.r.e r11 = r0.m28567a(r1, r5)
            java.lang.String r9 = ""
            r17 = r5
            r18 = r17
            r16 = r9
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0029:
            if (r5 >= r4) goto L_0x00ce
            java.lang.String r6 = r1.getAttributeName(r5)
            java.lang.String r7 = r1.getAttributeValue(r5)
            int r19 = r6.hashCode()
            switch(r19) {
                case -934795532: goto L_0x006d;
                case 99841: goto L_0x0063;
                case 100571: goto L_0x0059;
                case 93616297: goto L_0x004f;
                case 109780401: goto L_0x0045;
                case 1292595405: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0077
        L_0x003b:
            java.lang.String r8 = "backgroundImage"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0077
            r6 = 5
            goto L_0x0078
        L_0x0045:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0077
            r6 = 3
            goto L_0x0078
        L_0x004f:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0077
            r6 = 0
            goto L_0x0078
        L_0x0059:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0077
            r6 = 1
            goto L_0x0078
        L_0x0063:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0077
            r6 = 2
            goto L_0x0078
        L_0x006d:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0077
            r6 = 4
            goto L_0x0078
        L_0x0077:
            r6 = -1
        L_0x0078:
            if (r6 == 0) goto L_0x00c3
            r8 = 1
            if (r6 == r8) goto L_0x00bb
            r8 = 2
            if (r6 == r8) goto L_0x00b3
            r8 = 3
            if (r6 == r8) goto L_0x00a7
            r8 = 4
            if (r6 == r8) goto L_0x009c
            r8 = 5
            if (r6 == r8) goto L_0x008a
            goto L_0x0099
        L_0x008a:
            java.lang.String r6 = "#"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x0099
            r6 = 1
            java.lang.String r6 = r7.substring(r6)
            r17 = r6
        L_0x0099:
            r6 = r23
            goto L_0x00ca
        L_0x009c:
            r6 = r23
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00ca
            r16 = r7
            goto L_0x00ca
        L_0x00a7:
            r6 = r23
            java.lang.String[] r7 = r0.m28573b(r7)
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00ca
            r18 = r7
            goto L_0x00ca
        L_0x00b3:
            r6 = r23
            long r7 = m28561a(r7, r3)
            r14 = r7
            goto L_0x00ca
        L_0x00bb:
            r6 = r23
            long r7 = m28561a(r7, r3)
            r12 = r7
            goto L_0x00ca
        L_0x00c3:
            r6 = r23
            long r7 = m28561a(r7, r3)
            r9 = r7
        L_0x00ca:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x00ce:
            if (r2 == 0) goto L_0x00e8
            long r3 = r2.f21568d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00ed
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e0
            long r9 = r9 + r3
        L_0x00e0:
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00ed
            long r3 = r2.f21568d
            long r12 = r12 + r3
            goto L_0x00ed
        L_0x00e8:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00ed:
            r7 = r9
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0103
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00f9
            long r14 = r14 + r7
            r9 = r14
            goto L_0x0104
        L_0x00f9:
            if (r2 == 0) goto L_0x0103
            long r2 = r2.f21569e
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0103
            r9 = r2
            goto L_0x0104
        L_0x0103:
            r9 = r12
        L_0x0104:
            java.lang.String r6 = r21.getName()
            r12 = r18
            r13 = r16
            r14 = r17
            com.google.android.exoplayer2.u0.r.b r1 = com.google.android.exoplayer2.p382u0.p388r.C9371b.m28579a(r6, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p388r.C9367a.m28564a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.u0.r.b, java.util.Map, com.google.android.exoplayer2.u0.r.a$b):com.google.android.exoplayer2.u0.r.b");
    }

    /* renamed from: a */
    private static boolean m28571a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: a */
    private static void m28569a(String str, C9374e eVar) throws C9327g {
        Matcher matcher;
        String[] a = C9554k0.m29423a(str, "\\s+");
        if (a.length == 1) {
            matcher = f21552q.matcher(str);
        } else if (a.length == 2) {
            matcher = f21552q.matcher(a[1]);
            C9563q.m29500d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(a.length);
            sb.append(".");
            throw new C9327g(sb.toString());
        }
        String str2 = "'.";
        if (matcher.matches()) {
            String group = matcher.group(3);
            char c = 65535;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && group.equals("px")) {
                        c = 0;
                    }
                } else if (group.equals("em")) {
                    c = 1;
                }
            } else if (group.equals("%")) {
                c = 2;
            }
            if (c == 0) {
                eVar.mo24208c(1);
            } else if (c == 1) {
                eVar.mo24208c(2);
            } else if (c == 2) {
                eVar.mo24208c(3);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid unit for fontSize: '");
                sb2.append(group);
                sb2.append(str2);
                throw new C9327g(sb2.toString());
            }
            eVar.mo24198a(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append(str2);
        throw new C9327g(sb3.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m28561a(java.lang.String r14, com.google.android.exoplayer2.p382u0.p388r.C9367a.C9369b r15) throws com.google.android.exoplayer2.p382u0.C9327g {
        /*
            java.util.regex.Pattern r0 = f21550o
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0076
            java.lang.String r14 = r0.group(r8)
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0048
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0049
        L_0x0048:
            r10 = r5
        L_0x0049:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x005a
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.f21560a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x005b
        L_0x005a:
            r10 = r5
        L_0x005b:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0071
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.f21561b
            double r4 = (double) r14
            double r0 = r0 / r4
            float r14 = r15.f21560a
            double r14 = (double) r14
            double r5 = r0 / r14
        L_0x0071:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0076:
            java.util.regex.Pattern r0 = f21551p
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0113
            java.lang.String r14 = r0.group(r8)
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00de
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00d4
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00ca
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00c0
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00b6
            r11 = 116(0x74, float:1.63E-43)
            if (r1 == r11) goto L_0x00ac
            goto L_0x00e8
        L_0x00ac:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e8
            r14 = 5
            goto L_0x00e9
        L_0x00b6:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e8
            r14 = 2
            goto L_0x00e9
        L_0x00c0:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e8
            r14 = 3
            goto L_0x00e9
        L_0x00ca:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e8
            r14 = 1
            goto L_0x00e9
        L_0x00d4:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e8
            r14 = 0
            goto L_0x00e9
        L_0x00de:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e8
            r14 = 4
            goto L_0x00e9
        L_0x00e8:
            r14 = -1
        L_0x00e9:
            if (r14 == 0) goto L_0x0108
            if (r14 == r8) goto L_0x0105
            if (r14 == r7) goto L_0x010f
            if (r14 == r6) goto L_0x00fe
            if (r14 == r5) goto L_0x00fa
            if (r14 == r4) goto L_0x00f6
            goto L_0x010f
        L_0x00f6:
            int r14 = r15.f21562c
            double r14 = (double) r14
            goto L_0x0103
        L_0x00fa:
            float r14 = r15.f21560a
            double r14 = (double) r14
            goto L_0x0103
        L_0x00fe:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x0103:
            double r9 = r9 / r14
            goto L_0x010f
        L_0x0105:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x010d
        L_0x0108:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x010d:
            double r9 = r9 * r14
        L_0x010f:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x0113:
            com.google.android.exoplayer2.u0.g r15 = new com.google.android.exoplayer2.u0.g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p388r.C9367a.m28561a(java.lang.String, com.google.android.exoplayer2.u0.r.a$b):long");
    }
}
