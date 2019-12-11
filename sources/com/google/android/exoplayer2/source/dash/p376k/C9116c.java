package com.google.android.exoplayer2.source.dash.p376k;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.p356g.C8746a;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.C9549j0;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9556l0;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9566t;
import com.google.android.exoplayer2.source.dash.p376k.C9127j.C9129b;
import com.google.android.exoplayer2.source.dash.p376k.C9127j.C9130c;
import com.google.android.exoplayer2.source.dash.p376k.C9127j.C9131d;
import com.google.android.exoplayer2.source.dash.p376k.C9127j.C9132e;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.danlew.android.joda.DateUtils;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.google.android.exoplayer2.source.dash.k.c */
/* compiled from: DashManifestParser */
public class C9116c extends DefaultHandler implements C9456a<C9115b> {

    /* renamed from: b */
    private static final Pattern f20435b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    private static final Pattern f20436c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    private static final Pattern f20437d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: a */
    private final XmlPullParserFactory f20438a;

    /* renamed from: com.google.android.exoplayer2.source.dash.k.c$a */
    /* compiled from: DashManifestParser */
    protected static final class C9117a {

        /* renamed from: a */
        public final Format f20439a;

        /* renamed from: b */
        public final String f20440b;

        /* renamed from: c */
        public final C9127j f20441c;

        /* renamed from: d */
        public final String f20442d;

        /* renamed from: e */
        public final ArrayList<C8692b> f20443e;

        /* renamed from: f */
        public final ArrayList<C9118d> f20444f;

        /* renamed from: g */
        public final long f20445g;

        public C9117a(Format format, String str, C9127j jVar, String str2, ArrayList<C8692b> arrayList, ArrayList<C9118d> arrayList2, long j) {
            this.f20439a = format;
            this.f20440b = str;
            this.f20441c = jVar;
            this.f20442d = str2;
            this.f20443e = arrayList;
            this.f20444f = arrayList2;
            this.f20445g = j;
        }
    }

    public C9116c() {
        try {
            this.f20438a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: k */
    public static void m27282k(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (C9556l0.m29465b(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (C9556l0.m29465b(xmlPullParser)) {
                    i++;
                } else if (C9556l0.m29463a(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int m27283l(org.xmlpull.v1.XmlPullParser r5) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r5 = r5.getAttributeValue(r0, r1)
            java.lang.String r5 = com.google.android.exoplayer2.p393v0.Util.m29457k(r5)
            r0 = -1
            if (r5 != 0) goto L_0x000f
            return r0
        L_0x000f:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case 1596796: goto L_0x0038;
                case 2937391: goto L_0x002e;
                case 3094035: goto L_0x0024;
                case 3133436: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0042
        L_0x001a:
            java.lang.String r1 = "fa01"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 3
            goto L_0x0043
        L_0x0024:
            java.lang.String r1 = "f801"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 2
            goto L_0x0043
        L_0x002e:
            java.lang.String r1 = "a000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "4000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == 0) goto L_0x0052
            if (r5 == r4) goto L_0x0051
            if (r5 == r3) goto L_0x004f
            if (r5 == r2) goto L_0x004c
            return r0
        L_0x004c:
            r5 = 8
            return r5
        L_0x004f:
            r5 = 6
            return r5
        L_0x0051:
            return r3
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.p376k.C9116c.m27283l(org.xmlpull.v1.XmlPullParser):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo23708b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String b = m27272b(xmlPullParser, "schemeIdUri", (String) null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(b)) {
            i = m27267a(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(b)) {
            i = m27283l(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!C9556l0.m29466c(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v3, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v3, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r2v14, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r5v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v0
      assigns: []
      uses: []
      mth insns count: 148
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013f A[LOOP:1: B:35:0x009d->B:75:0x013f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012e A[EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  
    EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  
    EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  
    EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012e A[EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  
    EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  
    EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012e A[EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  
    EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012e A[EDGE_INSN: B:77:0x012e->B:70:0x012e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 20 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.C8692b> mo23710c(org.xmlpull.v1.XmlPullParser r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            java.lang.String r2 = "schemeIdUri"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0098
            java.lang.String r2 = com.google.android.exoplayer2.p393v0.Util.m29457k(r2)
            r5 = -1
            int r6 = r2.hashCode()
            r7 = 489446379(0x1d2c5beb, float:2.281153E-21)
            r8 = 2
            if (r6 == r7) goto L_0x003b
            r7 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r6 == r7) goto L_0x0031
            r7 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r6 == r7) goto L_0x0027
            goto L_0x0044
        L_0x0027:
            java.lang.String r6 = "urn:mpeg:dash:mp4protection:2011"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0044
            r5 = 0
            goto L_0x0044
        L_0x0031:
            java.lang.String r6 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0044
            r5 = 2
            goto L_0x0044
        L_0x003b:
            java.lang.String r6 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0044
            r5 = 1
        L_0x0044:
            if (r5 == 0) goto L_0x0052
            if (r5 == r3) goto L_0x004e
            if (r5 == r8) goto L_0x004b
            goto L_0x0098
        L_0x004b:
            java.util.UUID r2 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            goto L_0x0050
        L_0x004e:
            java.util.UUID r2 = com.google.android.exoplayer2.C.PLAYREADY_UUID
        L_0x0050:
            r5 = r1
            goto L_0x009a
        L_0x0052:
            java.lang.String r2 = "value"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            java.lang.String r5 = "default_KID"
            java.lang.String r5 = com.google.android.exoplayer2.p393v0.C9556l0.m29464b(r0, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0092
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0092
            java.lang.String r6 = "\\s+"
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            java.util.UUID[] r6 = new java.util.UUID[r6]
            r7 = 0
        L_0x0076:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x0084
            r8 = r5[r7]
            java.util.UUID r8 = java.util.UUID.fromString(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0076
        L_0x0084:
            java.util.UUID r5 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            byte[] r5 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26492a(r5, r6, r1)
            java.util.UUID r6 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            r7 = r1
            r8 = 0
            r15 = r6
            r6 = r2
            r2 = r15
            goto L_0x009d
        L_0x0092:
            r5 = r1
            r7 = r5
            r6 = r2
            r8 = 0
            r2 = r7
            goto L_0x009d
        L_0x0098:
            r2 = r1
            r5 = r2
        L_0x009a:
            r6 = r5
            r7 = r6
            r8 = 0
        L_0x009d:
            r17.next()
            java.lang.String r9 = "ms:laurl"
            boolean r9 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r9)
            if (r9 == 0) goto L_0x00b4
            java.lang.String r7 = "licenseUrl"
            java.lang.String r7 = r0.getAttributeValue(r1, r7)
        L_0x00ae:
            r10 = r2
            r13 = r5
        L_0x00b0:
            r11 = r7
            r14 = r8
            goto L_0x0126
        L_0x00b4:
            java.lang.String r9 = "widevine:license"
            boolean r9 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r9)
            if (r9 == 0) goto L_0x00d0
            java.lang.String r8 = "robustness_level"
            java.lang.String r8 = r0.getAttributeValue(r1, r8)
            if (r8 == 0) goto L_0x00ce
            java.lang.String r9 = "HW"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x00ce
            r8 = 1
            goto L_0x00ae
        L_0x00ce:
            r8 = 0
            goto L_0x00ae
        L_0x00d0:
            r9 = 4
            if (r5 != 0) goto L_0x00fb
            java.lang.String r10 = "pssh"
            boolean r10 = com.google.android.exoplayer2.p393v0.C9556l0.m29468e(r0, r10)
            if (r10 == 0) goto L_0x00fb
            int r10 = r17.next()
            if (r10 != r9) goto L_0x00fb
            java.lang.String r2 = r17.getText()
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.util.UUID r5 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26495c(r2)
            if (r5 != 0) goto L_0x00f8
            java.lang.String r2 = "MpdParser"
            java.lang.String r9 = "Skipping malformed cenc:pssh data"
            com.google.android.exoplayer2.p393v0.Log.m29500d(r2, r9)
            r13 = r1
            goto L_0x00f9
        L_0x00f8:
            r13 = r2
        L_0x00f9:
            r10 = r5
            goto L_0x00b0
        L_0x00fb:
            if (r5 != 0) goto L_0x0122
            java.util.UUID r10 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0122
            java.lang.String r10 = "mspr:pro"
            boolean r10 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r10)
            if (r10 == 0) goto L_0x0122
            int r10 = r17.next()
            if (r10 != r9) goto L_0x0122
            java.util.UUID r5 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            java.lang.String r9 = r17.getText()
            byte[] r9 = android.util.Base64.decode(r9, r4)
            byte[] r5 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26491a(r5, r9)
            goto L_0x00ae
        L_0x0122:
            m27282k(r17)
            goto L_0x00ae
        L_0x0126:
            java.lang.String r2 = "ContentProtection"
            boolean r2 = com.google.android.exoplayer2.p393v0.C9556l0.m29466c(r0, r2)
            if (r2 == 0) goto L_0x013f
            if (r10 == 0) goto L_0x0139
            com.google.android.exoplayer2.drm.DrmInitData$b r0 = new com.google.android.exoplayer2.drm.DrmInitData$b
            java.lang.String r12 = "video/mp4"
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x013a
        L_0x0139:
            r0 = r1
        L_0x013a:
            android.util.Pair r0 = android.util.Pair.create(r6, r0)
            return r0
        L_0x013f:
            r2 = r10
            r7 = r11
            r5 = r13
            r8 = r14
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.p376k.C9116c.mo23710c(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo23711d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C9119e mo23712e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str = "";
        String b = m27272b(xmlPullParser, "schemeIdUri", str);
        String b2 = m27272b(xmlPullParser, "value", str);
        long d = m27278d(xmlPullParser, "timescale", 1);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DateUtils.FORMAT_NO_NOON);
        do {
            xmlPullParser.next();
            if (C9556l0.m29467d(xmlPullParser, "Event")) {
                arrayList.add(mo23682a(xmlPullParser, b, b2, d, byteArrayOutputStream));
            } else {
                m27282k(xmlPullParser);
            }
        } while (!C9556l0.m29466c(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        C8746a[] aVarArr = new C8746a[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            aVarArr[i] = (C8746a) pair.second;
        }
        return mo23690a(b, b2, d, jArr, aVarArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C9122h mo23713f(XmlPullParser xmlPullParser) {
        return mo23693a(xmlPullParser, "sourceURL", "range");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C9121g mo23714g(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String b = m27272b(xmlPullParser, "moreInformationURL", (String) null);
        String b2 = m27272b(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C9556l0.m29467d(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C9556l0.m29467d(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C9556l0.m29467d(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m27282k(xmlPullParser);
            }
            String str4 = str3;
            if (C9556l0.m29466c(xmlPullParser, "ProgramInformation")) {
                C9121g gVar = new C9121g(str, str2, str4, b, b2);
                return gVar;
            }
            str3 = str4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public List<C9131d> mo23715h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (C9556l0.m29467d(xmlPullParser, "S")) {
                j = m27278d(xmlPullParser, "t", j);
                long d = m27278d(xmlPullParser, "d", -9223372036854775807L);
                int a = m27267a(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < a; i++) {
                    arrayList.add(mo23699a(j, d));
                    j += d;
                }
            } else {
                m27282k(xmlPullParser);
            }
        } while (!C9556l0.m29466c(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C9122h mo23716i(XmlPullParser xmlPullParser) {
        return mo23693a(xmlPullParser, "media", "mediaRange");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C9135m mo23717j(XmlPullParser xmlPullParser) {
        return mo23703a(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* renamed from: f */
    protected static String m27280f(List<C9118d> list) {
        for (int i = 0; i < list.size(); i++) {
            C9118d dVar = (C9118d) list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(dVar.f20446a)) {
                if ("ec+3".equals(dVar.f20447b)) {
                    return "audio/eac3-joc";
                }
            }
        }
        return "audio/eac3";
    }

    /* renamed from: a */
    public C9115b m27311a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f20438a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return mo23688a(newPullParser, uri.toString());
            }
            throw new C8723g0("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new C8723g0((Throwable) e);
        }
    }

    /* renamed from: d */
    protected static int m27277d(List<C9118d> list) {
        for (int i = 0; i < list.size(); i++) {
            C9118d dVar = (C9118d) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f20446a)) {
                String str = dVar.f20447b;
                if (str != null) {
                    Matcher matcher = f20436c.matcher(str);
                    if (matcher.matches()) {
                        return Integer.parseInt(matcher.group(1));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to parse CEA-608 channel number from: ");
                    sb.append(dVar.f20447b);
                    Log.m29500d("MpdParser", sb.toString());
                } else {
                    continue;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo23707b(List<C9118d> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C9118d dVar = (C9118d) list.get(i2);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f20446a)) {
                i |= mo23679a(dVar.f20447b);
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0179 A[LOOP:0: B:20:0x006c->B:67:0x0179, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.p376k.C9115b mo23688a(org.xmlpull.v1.XmlPullParser r33, java.lang.String r34) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r32 = this;
            r0 = r33
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r3 = "availabilityStartTime"
            long r5 = m27269b(r0, r3, r1)
            java.lang.String r3 = "mediaPresentationDuration"
            long r3 = m27273c(r0, r3, r1)
            java.lang.String r7 = "minBufferTime"
            long r9 = m27273c(r0, r7, r1)
            r7 = 0
            java.lang.String r8 = "type"
            java.lang.String r8 = r0.getAttributeValue(r7, r8)
            r12 = 0
            if (r8 == 0) goto L_0x002d
            java.lang.String r13 = "dynamic"
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto L_0x002d
            r13 = 1
            goto L_0x002e
        L_0x002d:
            r13 = 0
        L_0x002e:
            if (r13 == 0) goto L_0x0037
            java.lang.String r8 = "minimumUpdatePeriod"
            long r14 = m27273c(r0, r8, r1)
            goto L_0x0038
        L_0x0037:
            r14 = r1
        L_0x0038:
            if (r13 == 0) goto L_0x0041
            java.lang.String r8 = "timeShiftBufferDepth"
            long r16 = m27273c(r0, r8, r1)
            goto L_0x0043
        L_0x0041:
            r16 = r1
        L_0x0043:
            if (r13 == 0) goto L_0x004c
            java.lang.String r8 = "suggestedPresentationDelay"
            long r18 = m27273c(r0, r8, r1)
            goto L_0x004e
        L_0x004c:
            r18 = r1
        L_0x004e:
            java.lang.String r8 = "publishTime"
            long r20 = m27269b(r0, r8, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r13 == 0) goto L_0x005e
            r22 = r1
            goto L_0x0060
        L_0x005e:
            r22 = 0
        L_0x0060:
            r25 = r7
            r26 = r25
            r27 = r26
            r1 = r22
            r22 = 0
            r7 = r34
        L_0x006c:
            r33.next()
            java.lang.String r11 = "BaseURL"
            boolean r11 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r11)
            if (r11 == 0) goto L_0x008a
            if (r12 != 0) goto L_0x0082
            java.lang.String r7 = m27271b(r0, r7)
            r30 = r14
            r12 = 1
            goto L_0x0130
        L_0x0082:
            r28 = r1
            r34 = r12
            r30 = r14
            goto L_0x012c
        L_0x008a:
            java.lang.String r11 = "ProgramInformation"
            boolean r11 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r11)
            if (r11 == 0) goto L_0x009c
            com.google.android.exoplayer2.source.dash.k.g r11 = r32.mo23714g(r33)
            r25 = r11
        L_0x0098:
            r30 = r14
            goto L_0x0130
        L_0x009c:
            java.lang.String r11 = "UTCTiming"
            boolean r11 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r11)
            if (r11 == 0) goto L_0x00ab
            com.google.android.exoplayer2.source.dash.k.m r11 = r32.mo23717j(r33)
            r26 = r11
            goto L_0x0098
        L_0x00ab:
            java.lang.String r11 = "Location"
            boolean r11 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r11)
            if (r11 == 0) goto L_0x00be
            java.lang.String r11 = r33.nextText()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r27 = r11
            goto L_0x0098
        L_0x00be:
            java.lang.String r11 = "Period"
            boolean r11 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r11)
            if (r11 == 0) goto L_0x0123
            if (r22 != 0) goto L_0x0123
            r11 = r32
            r34 = r12
            android.util.Pair r12 = r11.mo23681a(r0, r7, r1)
            r28 = r1
            java.lang.Object r1 = r12.first
            com.google.android.exoplayer2.source.dash.k.f r1 = (com.google.android.exoplayer2.source.dash.p376k.C9120f) r1
            r30 = r14
            long r14 = r1.f20454b
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x0103
            if (r13 == 0) goto L_0x00e8
            r22 = 1
            goto L_0x012c
        L_0x00e8:
            com.google.android.exoplayer2.g0 r0 = new com.google.android.exoplayer2.g0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to determine start of period "
            r1.append(r2)
            int r2 = r8.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0103:
            java.lang.Object r2 = r12.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r14 = r2.longValue()
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x011a
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x011d
        L_0x011a:
            long r11 = r1.f20454b
            long r11 = r11 + r14
        L_0x011d:
            r8.add(r1)
            r28 = r11
            goto L_0x012c
        L_0x0123:
            r28 = r1
            r34 = r12
            r30 = r14
            m27282k(r33)
        L_0x012c:
            r12 = r34
            r1 = r28
        L_0x0130:
            java.lang.String r11 = "MPD"
            boolean r11 = com.google.android.exoplayer2.p393v0.C9556l0.m29466c(r0, r11)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 == 0) goto L_0x0179
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0151
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0146
            goto L_0x0152
        L_0x0146:
            if (r13 == 0) goto L_0x0149
            goto L_0x0151
        L_0x0149:
            com.google.android.exoplayer2.g0 r0 = new com.google.android.exoplayer2.g0
            java.lang.String r1 = "Unable to determine duration of static manifest."
            r0.<init>(r1)
            throw r0
        L_0x0151:
            r1 = r3
        L_0x0152:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0171
            r4 = r32
            r23 = r8
            r7 = r1
            r11 = r13
            r12 = r30
            r14 = r16
            r16 = r18
            r18 = r20
            r20 = r25
            r21 = r26
            r22 = r27
            com.google.android.exoplayer2.source.dash.k.b r0 = r4.mo23687a(r5, r7, r9, r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r0
        L_0x0171:
            com.google.android.exoplayer2.g0 r0 = new com.google.android.exoplayer2.g0
            java.lang.String r1 = "No periods found."
            r0.<init>(r1)
            throw r0
        L_0x0179:
            r14 = r30
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.p376k.C9116c.mo23688a(org.xmlpull.v1.XmlPullParser, java.lang.String):com.google.android.exoplayer2.source.dash.k.b");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo23706b(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            return DateUtils.FORMAT_NO_NOON;
        }
        if (c == 1) {
            return DateUtils.FORMAT_NO_MIDNIGHT;
        }
        if (c == 2) {
            return 4;
        }
        if (c != 3) {
            return c != 4 ? 0 : 1;
        }
        return 8;
    }

    /* renamed from: b */
    private static String m27270b(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    /* renamed from: d */
    protected static long m27278d(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* renamed from: g */
    protected static long m27281g(List<C9118d> list) {
        for (int i = 0; i < list.size(); i++) {
            C9118d dVar = (C9118d) list.get(i);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(dVar.f20446a)) {
                return Long.parseLong(dVar.f20447b);
            }
        }
        return -1;
    }

    /* renamed from: b */
    protected static long m27269b(XmlPullParser xmlPullParser, String str, long j) throws C8723g0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return Util.m29454h(attributeValue);
    }

    /* renamed from: b */
    protected static String m27271b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.next();
        return C9549j0.m29365a(str, xmlPullParser.getText());
    }

    /* renamed from: b */
    protected static String m27272b(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: e */
    protected static int m27279e(List<C9118d> list) {
        for (int i = 0; i < list.size(); i++) {
            C9118d dVar = (C9118d) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f20446a)) {
                String str = dVar.f20447b;
                if (str != null) {
                    Matcher matcher = f20437d.matcher(str);
                    if (matcher.matches()) {
                        return Integer.parseInt(matcher.group(1));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to parse CEA-708 service block number from: ");
                    sb.append(dVar.f20447b);
                    Log.m29500d("MpdParser", sb.toString());
                } else {
                    continue;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo23709c(List<C9118d> list) {
        for (int i = 0; i < list.size(); i++) {
            C9118d dVar = (C9118d) list.get(i);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f20446a)) {
                if ("main".equals(dVar.f20447b)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    private static String m27275c(String str, String str2) {
        if (C9566t.m29517j(str)) {
            return C9566t.m29508a(str2);
        }
        if (C9566t.m29519l(str)) {
            return C9566t.m29516i(str2);
        }
        if (m27276c(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if (str2 != null) {
                if (str2.startsWith("stpp")) {
                    return "application/ttml+xml";
                }
                if (str2.startsWith("wvtt")) {
                    return "application/x-mp4-vtt";
                }
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9115b mo23687a(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C9121g gVar, C9135m mVar, Uri uri, List<C9120f> list) {
        C9115b bVar = new C9115b(j, j2, j3, z, j4, j5, j6, j7, gVar, mVar, uri, list);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9135m mo23703a(String str, String str2) {
        return new C9135m(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<C9120f, Long> mo23681a(XmlPullParser xmlPullParser, String str, long j) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long c = m27273c(xmlPullParser, "start", j);
        long c2 = m27273c(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        C9127j jVar = null;
        do {
            xmlPullParser.next();
            if (C9556l0.m29467d(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = m27271b(xmlPullParser, str);
                    z = true;
                }
            } else if (C9556l0.m29467d(xmlPullParser, "AdaptationSet")) {
                arrayList.add(mo23686a(xmlPullParser, str, jVar));
            } else if (C9556l0.m29467d(xmlPullParser, "EventStream")) {
                arrayList2.add(mo23712e(xmlPullParser));
            } else if (C9556l0.m29467d(xmlPullParser, "SegmentBase")) {
                jVar = mo23701a(xmlPullParser, (C9132e) null);
            } else if (C9556l0.m29467d(xmlPullParser, "SegmentList")) {
                jVar = mo23696a(xmlPullParser, (C9129b) null);
            } else if (C9556l0.m29467d(xmlPullParser, "SegmentTemplate")) {
                jVar = mo23698a(xmlPullParser, (C9130c) null, Collections.emptyList());
            } else {
                m27282k(xmlPullParser);
            }
        } while (!C9556l0.m29466c(xmlPullParser, "Period"));
        return Pair.create(mo23691a(attributeValue, c, (List<C9114a>) arrayList, (List<C9119e>) arrayList2), Long.valueOf(c2));
    }

    /* renamed from: c */
    private static boolean m27276c(String str) {
        return C9566t.m29518k(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* renamed from: c */
    protected static C9118d m27274c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String b = m27272b(xmlPullParser, "schemeIdUri", "");
        String b2 = m27272b(xmlPullParser, "value", (String) null);
        String b3 = m27272b(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!C9556l0.m29466c(xmlPullParser, str));
        return new C9118d(b, b2, b3);
    }

    /* renamed from: c */
    protected static long m27273c(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return Util.m29455i(attributeValue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9120f mo23691a(String str, long j, List<C9114a> list, List<C9119e> list2) {
        C9120f fVar = new C9120f(str, j, list, list2);
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x022d A[LOOP:0: B:1:0x006c->B:60:0x022d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ff A[EDGE_INSN: B:61:0x01ff->B:54:0x01ff ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.p376k.C9114a mo23686a(org.xmlpull.v1.XmlPullParser r40, java.lang.String r41, com.google.android.exoplayer2.source.dash.p376k.C9127j r42) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r39 = this;
            r15 = r39
            r14 = r40
            r0 = -1
            java.lang.String r1 = "id"
            int r16 = m27267a(r14, r1, r0)
            int r1 = r39.mo23711d(r40)
            r13 = 0
            java.lang.String r2 = "mimeType"
            java.lang.String r17 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r18 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r19 = m27267a(r14, r2, r0)
            java.lang.String r2 = "height"
            int r20 = m27267a(r14, r2, r0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r21 = m27265a(r14, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r22 = m27267a(r14, r2, r0)
            java.lang.String r12 = "lang"
            java.lang.String r2 = r14.getAttributeValue(r13, r12)
            java.lang.String r3 = "label"
            java.lang.String r23 = r14.getAttributeValue(r13, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r24 = 0
            r5 = r41
            r27 = r42
            r3 = r1
            r4 = r2
            r28 = r13
            r25 = 0
            r26 = -1
        L_0x006c:
            r40.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r0 == 0) goto L_0x009a
            if (r25 != 0) goto L_0x0098
            java.lang.String r0 = m27271b(r14, r5)
            r1 = 1
            r31 = r0
            r2 = r3
            r30 = r4
            r3 = r6
            r5 = r7
            r33 = r8
            r34 = r9
            r4 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r1 = r14
            r6 = r15
            r0 = r28
            r25 = 1
            goto L_0x01f7
        L_0x0098:
            r2 = r3
            goto L_0x00d0
        L_0x009a:
            java.lang.String r0 = "ContentProtection"
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r0 == 0) goto L_0x00b7
            android.util.Pair r0 = r39.mo23710c(r40)
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x00ae
            r28 = r1
            java.lang.String r28 = (java.lang.String) r28
        L_0x00ae:
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x00b5
            r11.add(r0)
        L_0x00b5:
            r2 = r3
            goto L_0x00d0
        L_0x00b7:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r14.getAttributeValue(r13, r12)
            java.lang.String r4 = m27270b(r4, r0)
            int r0 = r39.mo23711d(r40)
            int r0 = m27266a(r3, r0)
            r2 = r0
        L_0x00d0:
            r30 = r4
            r31 = r5
            r3 = r6
            r5 = r7
            r33 = r8
            r34 = r9
            r4 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r1 = r14
            r6 = r15
            goto L_0x01f5
        L_0x00e5:
            java.lang.String r0 = "Role"
            boolean r1 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r1 == 0) goto L_0x00f5
            com.google.android.exoplayer2.source.dash.k.d r0 = m27274c(r14, r0)
            r8.add(r0)
            goto L_0x0098
        L_0x00f5:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r0 == 0) goto L_0x0102
            int r26 = r39.mo23708b(r40)
            goto L_0x00b5
        L_0x0102:
            java.lang.String r0 = "Accessibility"
            boolean r1 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r1 == 0) goto L_0x0112
            com.google.android.exoplayer2.source.dash.k.d r0 = m27274c(r14, r0)
            r9.add(r0)
            goto L_0x0098
        L_0x0112:
            java.lang.String r0 = "SupplementalProperty"
            boolean r1 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r1 == 0) goto L_0x0123
            com.google.android.exoplayer2.source.dash.k.d r0 = m27274c(r14, r0)
            r7.add(r0)
            goto L_0x0098
        L_0x0123:
            java.lang.String r0 = "Representation"
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r14, r0)
            if (r0 == 0) goto L_0x0182
            r0 = r39
            r1 = r40
            r2 = r5
            r29 = r3
            r3 = r23
            r30 = r4
            r4 = r17
            r31 = r5
            r5 = r18
            r32 = r6
            r6 = r19
            r41 = r7
            r7 = r20
            r33 = r8
            r8 = r21
            r34 = r9
            r9 = r26
            r35 = r10
            r10 = r22
            r36 = r11
            r11 = r30
            r37 = r12
            r12 = r33
            r38 = r13
            r13 = r34
            r14 = r41
            r15 = r27
            com.google.android.exoplayer2.source.dash.k.c$a r0 = r0.mo23689a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.google.android.exoplayer2.Format r1 = r0.f20439a
            r6 = r39
            int r1 = r6.mo23678a(r1)
            r2 = r29
            int r1 = m27266a(r2, r1)
            r3 = r32
            r3.add(r0)
            r5 = r41
            r2 = r1
            r0 = r28
            r4 = r35
            r1 = r40
            goto L_0x01f7
        L_0x0182:
            r2 = r3
            r30 = r4
            r31 = r5
            r3 = r6
            r41 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r6 = r15
            java.lang.String r0 = "SegmentBase"
            r1 = r40
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r1, r0)
            if (r0 == 0) goto L_0x01b2
            r0 = r27
            com.google.android.exoplayer2.source.dash.k.j$e r0 = (com.google.android.exoplayer2.source.dash.p376k.C9127j.C9132e) r0
            com.google.android.exoplayer2.source.dash.k.j$e r0 = r6.mo23701a(r1, r0)
        L_0x01a9:
            r5 = r41
        L_0x01ab:
            r27 = r0
            r0 = r28
            r4 = r35
            goto L_0x01f7
        L_0x01b2:
            java.lang.String r0 = "SegmentList"
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r1, r0)
            if (r0 == 0) goto L_0x01c3
            r0 = r27
            com.google.android.exoplayer2.source.dash.k.j$b r0 = (com.google.android.exoplayer2.source.dash.p376k.C9127j.C9129b) r0
            com.google.android.exoplayer2.source.dash.k.j$b r0 = r6.mo23696a(r1, r0)
            goto L_0x01a9
        L_0x01c3:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r1, r0)
            if (r0 == 0) goto L_0x01d6
            r0 = r27
            com.google.android.exoplayer2.source.dash.k.j$c r0 = (com.google.android.exoplayer2.source.dash.p376k.C9127j.C9130c) r0
            r5 = r41
            com.google.android.exoplayer2.source.dash.k.j$c r0 = r6.mo23698a(r1, r0, r5)
            goto L_0x01ab
        L_0x01d6:
            r5 = r41
            java.lang.String r0 = "InbandEventStream"
            boolean r4 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r1, r0)
            if (r4 == 0) goto L_0x01ea
            com.google.android.exoplayer2.source.dash.k.d r0 = m27274c(r1, r0)
            r4 = r35
            r4.add(r0)
            goto L_0x01f5
        L_0x01ea:
            r4 = r35
            boolean r0 = com.google.android.exoplayer2.p393v0.C9556l0.m29465b(r40)
            if (r0 == 0) goto L_0x01f5
            r39.mo23704a(r40)
        L_0x01f5:
            r0 = r28
        L_0x01f7:
            java.lang.String r7 = "AdaptationSet"
            boolean r7 = com.google.android.exoplayer2.p393v0.C9556l0.m29466c(r1, r7)
            if (r7 == 0) goto L_0x022d
            java.util.ArrayList r7 = new java.util.ArrayList
            int r1 = r3.size()
            r7.<init>(r1)
            r1 = 0
        L_0x0209:
            int r8 = r3.size()
            if (r1 >= r8) goto L_0x0221
            java.lang.Object r8 = r3.get(r1)
            com.google.android.exoplayer2.source.dash.k.c$a r8 = (com.google.android.exoplayer2.source.dash.p376k.C9116c.C9117a) r8
            r9 = r36
            com.google.android.exoplayer2.source.dash.k.i r8 = r6.mo23694a(r8, r0, r9, r4)
            r7.add(r8)
            int r1 = r1 + 1
            goto L_0x0209
        L_0x0221:
            r0 = r39
            r1 = r16
            r3 = r7
            r4 = r34
            com.google.android.exoplayer2.source.dash.k.a r0 = r0.mo23685a(r1, r2, r3, r4, r5)
            return r0
        L_0x022d:
            r28 = r0
            r14 = r1
            r10 = r4
            r7 = r5
            r15 = r6
            r4 = r30
            r5 = r31
            r8 = r33
            r9 = r34
            r11 = r36
            r12 = r37
            r13 = r38
            r6 = r3
            r3 = r2
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.p376k.C9116c.mo23686a(org.xmlpull.v1.XmlPullParser, java.lang.String, com.google.android.exoplayer2.source.dash.k.j):com.google.android.exoplayer2.source.dash.k.a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9114a mo23685a(int i, int i2, List<C9123i> list, List<C9118d> list2, List<C9118d> list3) {
        C9114a aVar = new C9114a(i, i2, list, list2, list3);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23678a(Format format) {
        String str = format.f18349b0;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (C9566t.m29519l(str)) {
            return 2;
        }
        if (C9566t.m29517j(str)) {
            return 1;
        }
        if (m27276c(str)) {
            return 3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23704a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m27282k(xmlPullParser);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015b A[LOOP:0: B:1:0x0058->B:44:0x015b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f A[EDGE_INSN: B:45:0x011f->B:38:0x011f ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.p376k.C9116c.C9117a mo23689a(org.xmlpull.v1.XmlPullParser r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, int r29, float r30, int r31, int r32, java.lang.String r33, java.util.List<com.google.android.exoplayer2.source.dash.p376k.C9118d> r34, java.util.List<com.google.android.exoplayer2.source.dash.p376k.C9118d> r35, java.util.List<com.google.android.exoplayer2.source.dash.p376k.C9118d> r36, com.google.android.exoplayer2.source.dash.p376k.C9127j r37) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r22 = this;
            r15 = r22
            r0 = r23
            r1 = 0
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            java.lang.String r3 = "bandwidth"
            r4 = -1
            int r9 = m27267a(r0, r3, r4)
            java.lang.String r3 = "mimeType"
            r4 = r26
            java.lang.String r3 = m27272b(r0, r3, r4)
            java.lang.String r4 = "codecs"
            r5 = r27
            java.lang.String r13 = m27272b(r0, r4, r5)
            java.lang.String r4 = "width"
            r5 = r28
            int r4 = m27267a(r0, r4, r5)
            java.lang.String r5 = "height"
            r6 = r29
            int r5 = m27267a(r0, r5, r6)
            r6 = r30
            float r6 = m27265a(r0, r6)
            java.lang.String r7 = "audioSamplingRate"
            r8 = r32
            int r8 = m27267a(r0, r7, r8)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r7 = 0
            r16 = r31
            r10 = r37
            r17 = r1
            r1 = r24
        L_0x0058:
            r23.next()
            r26 = r13
            java.lang.String r13 = "BaseURL"
            boolean r13 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r13)
            if (r13 == 0) goto L_0x0080
            if (r7 != 0) goto L_0x0078
            java.lang.String r1 = m27271b(r0, r1)
            r7 = 1
        L_0x006c:
            r13 = r36
        L_0x006e:
            r18 = r17
            r17 = r10
            r10 = r16
            r16 = r1
            goto L_0x0117
        L_0x0078:
            r13 = r36
            r24 = r1
            r27 = r7
            goto L_0x010d
        L_0x0080:
            java.lang.String r13 = "AudioChannelConfiguration"
            boolean r13 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r13)
            if (r13 == 0) goto L_0x0097
            int r13 = r22.mo23708b(r23)
            r16 = r1
            r18 = r17
            r17 = r10
            r10 = r13
            r13 = r36
            goto L_0x0117
        L_0x0097:
            java.lang.String r13 = "SegmentBase"
            boolean r13 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r13)
            if (r13 == 0) goto L_0x00a6
            com.google.android.exoplayer2.source.dash.k.j$e r10 = (com.google.android.exoplayer2.source.dash.p376k.C9127j.C9132e) r10
            com.google.android.exoplayer2.source.dash.k.j$e r10 = r15.mo23701a(r0, r10)
            goto L_0x006c
        L_0x00a6:
            java.lang.String r13 = "SegmentList"
            boolean r13 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r13)
            if (r13 == 0) goto L_0x00b5
            com.google.android.exoplayer2.source.dash.k.j$b r10 = (com.google.android.exoplayer2.source.dash.p376k.C9127j.C9129b) r10
            com.google.android.exoplayer2.source.dash.k.j$b r10 = r15.mo23696a(r0, r10)
            goto L_0x006c
        L_0x00b5:
            java.lang.String r13 = "SegmentTemplate"
            boolean r13 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r13)
            if (r13 == 0) goto L_0x00c6
            com.google.android.exoplayer2.source.dash.k.j$c r10 = (com.google.android.exoplayer2.source.dash.p376k.C9127j.C9130c) r10
            r13 = r36
            com.google.android.exoplayer2.source.dash.k.j$c r10 = r15.mo23698a(r0, r10, r13)
            goto L_0x006e
        L_0x00c6:
            r13 = r36
            r24 = r1
            java.lang.String r1 = "ContentProtection"
            boolean r1 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r1)
            if (r1 == 0) goto L_0x00e8
            android.util.Pair r1 = r22.mo23710c(r23)
            r27 = r7
            java.lang.Object r7 = r1.first
            if (r7 == 0) goto L_0x00e0
            r17 = r7
            java.lang.String r17 = (java.lang.String) r17
        L_0x00e0:
            java.lang.Object r1 = r1.second
            if (r1 == 0) goto L_0x010d
            r14.add(r1)
            goto L_0x010d
        L_0x00e8:
            r27 = r7
            java.lang.String r1 = "InbandEventStream"
            boolean r7 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r1)
            if (r7 == 0) goto L_0x00fa
            com.google.android.exoplayer2.source.dash.k.d r1 = m27274c(r0, r1)
            r12.add(r1)
            goto L_0x010d
        L_0x00fa:
            java.lang.String r1 = "SupplementalProperty"
            boolean r7 = com.google.android.exoplayer2.p393v0.C9556l0.m29467d(r0, r1)
            if (r7 == 0) goto L_0x010a
            com.google.android.exoplayer2.source.dash.k.d r1 = m27274c(r0, r1)
            r11.add(r1)
            goto L_0x010d
        L_0x010a:
            m27282k(r23)
        L_0x010d:
            r7 = r27
            r18 = r17
            r17 = r10
            r10 = r16
            r16 = r24
        L_0x0117:
            java.lang.String r1 = "Representation"
            boolean r1 = com.google.android.exoplayer2.p393v0.C9556l0.m29466c(r0, r1)
            if (r1 == 0) goto L_0x015b
            r0 = r22
            r1 = r2
            r2 = r25
            r7 = r10
            r10 = r33
            r19 = r11
            r11 = r34
            r20 = r12
            r12 = r35
            r13 = r26
            r21 = r14
            r14 = r19
            com.google.android.exoplayer2.Format r0 = r0.mo23683a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r17 == 0) goto L_0x013e
            r1 = r17
            goto L_0x0143
        L_0x013e:
            com.google.android.exoplayer2.source.dash.k.j$e r1 = new com.google.android.exoplayer2.source.dash.k.j$e
            r1.<init>()
        L_0x0143:
            com.google.android.exoplayer2.source.dash.k.c$a r2 = new com.google.android.exoplayer2.source.dash.k.c$a
            r3 = -1
            r23 = r2
            r24 = r0
            r25 = r16
            r26 = r1
            r27 = r18
            r28 = r21
            r29 = r20
            r30 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            return r2
        L_0x015b:
            r13 = r26
            r1 = r16
            r16 = r10
            r10 = r17
            r17 = r18
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.p376k.C9116c.mo23689a(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, com.google.android.exoplayer2.source.dash.k.j):com.google.android.exoplayer2.source.dash.k.c$a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Format mo23683a(String str, String str2, String str3, int i, int i2, float f, int i3, int i4, int i5, String str4, List<C9118d> list, List<C9118d> list2, String str5, List<C9118d> list3) {
        String str6;
        int i6;
        int e;
        List<C9118d> list4 = list;
        String c = m27275c(str3, str5);
        int c2 = mo23709c(list4);
        int b = mo23707b(list4) | mo23680a(list2);
        if (c != null) {
            String f2 = "audio/eac3".equals(c) ? m27280f(list3) : c;
            if (C9566t.m29519l(f2)) {
                return Format.m24882a(str, str2, str3, f2, str5, (Metadata) null, i5, i, i2, f, null, c2, b);
            }
            if (C9566t.m29517j(f2)) {
                return Format.m24883a(str, str2, str3, f2, str5, (Metadata) null, i5, i3, i4, null, c2, b, str4);
            }
            if (m27276c(f2)) {
                if ("application/cea-608".equals(f2)) {
                    e = m27277d(list2);
                } else if ("application/cea-708".equals(f2)) {
                    e = m27279e(list2);
                } else {
                    i6 = -1;
                    return Format.m24881a(str, str2, str3, f2, str5, i5, c2, b, str4, i6);
                }
                i6 = e;
                return Format.m24881a(str, str2, str3, f2, str5, i5, c2, b, str4, i6);
            }
            str6 = f2;
        } else {
            str6 = c;
        }
        return Format.m24880a(str, str2, str3, str6, str5, i5, c2, b, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9123i mo23694a(C9117a aVar, String str, ArrayList<C8692b> arrayList, ArrayList<C9118d> arrayList2) {
        Format format = aVar.f20439a;
        String str2 = aVar.f20442d;
        if (str2 != null) {
            str = str2;
        }
        ArrayList<C8692b> arrayList3 = aVar.f20443e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m27268a(arrayList3);
            format = format.mo22602a(new DrmInitData(str, (List<C8692b>) arrayList3));
        }
        Format format2 = format;
        ArrayList<C9118d> arrayList4 = aVar.f20444f;
        arrayList4.addAll(arrayList2);
        return C9123i.m27331a(aVar.f20445g, format2, aVar.f20440b, aVar.f20441c, arrayList4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9132e mo23701a(XmlPullParser xmlPullParser, C9132e eVar) throws XmlPullParserException, IOException {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C9132e eVar2 = eVar;
        long d = m27278d(xmlPullParser2, "timescale", eVar2 != null ? eVar2.f20476b : 1);
        long j3 = 0;
        long d2 = m27278d(xmlPullParser2, "presentationTimeOffset", eVar2 != null ? eVar2.f20477c : 0);
        long j4 = eVar2 != null ? eVar2.f20487d : 0;
        if (eVar2 != null) {
            j3 = eVar2.f20488e;
        }
        C9122h hVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        if (eVar2 != null) {
            hVar = eVar2.f20475a;
        }
        do {
            xmlPullParser.next();
            if (C9556l0.m29467d(xmlPullParser2, "Initialization")) {
                hVar = mo23713f(xmlPullParser);
            } else {
                m27282k(xmlPullParser);
            }
        } while (!C9556l0.m29466c(xmlPullParser2, "SegmentBase"));
        return mo23700a(hVar, d, d2, j2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9132e mo23700a(C9122h hVar, long j, long j2, long j3, long j4) {
        C9132e eVar = new C9132e(hVar, j, j2, j3, j4);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9129b mo23696a(XmlPullParser xmlPullParser, C9129b bVar) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C9129b bVar2 = bVar;
        long j = 1;
        long d = m27278d(xmlPullParser2, "timescale", bVar2 != null ? bVar2.f20476b : 1);
        long d2 = m27278d(xmlPullParser2, "presentationTimeOffset", bVar2 != null ? bVar2.f20477c : 0);
        long d3 = m27278d(xmlPullParser2, "duration", bVar2 != null ? bVar2.f20479e : -9223372036854775807L);
        if (bVar2 != null) {
            j = bVar2.f20478d;
        }
        long d4 = m27278d(xmlPullParser2, "startNumber", j);
        List list = null;
        C9122h hVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (C9556l0.m29467d(xmlPullParser2, "Initialization")) {
                hVar = mo23713f(xmlPullParser);
            } else if (C9556l0.m29467d(xmlPullParser2, "SegmentTimeline")) {
                list2 = mo23715h(xmlPullParser);
            } else if (C9556l0.m29467d(xmlPullParser2, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(mo23716i(xmlPullParser));
            } else {
                m27282k(xmlPullParser);
            }
        } while (!C9556l0.m29466c(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (hVar == null) {
                hVar = bVar2.f20475a;
            }
            if (list2 == null) {
                list2 = bVar2.f20480f;
            }
            if (list == null) {
                list = bVar2.f20481g;
            }
        }
        return mo23695a(hVar, d, d2, d4, d3, list2, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9129b mo23695a(C9122h hVar, long j, long j2, long j3, long j4, List<C9131d> list, List<C9122h> list2) {
        C9129b bVar = new C9129b(hVar, j, j2, j3, j4, list, list2);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9130c mo23698a(XmlPullParser xmlPullParser, C9130c cVar, List<C9118d> list) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C9130c cVar2 = cVar;
        long j = 1;
        long d = m27278d(xmlPullParser2, "timescale", cVar2 != null ? cVar2.f20476b : 1);
        long d2 = m27278d(xmlPullParser2, "presentationTimeOffset", cVar2 != null ? cVar2.f20477c : 0);
        long d3 = m27278d(xmlPullParser2, "duration", cVar2 != null ? cVar2.f20479e : -9223372036854775807L);
        if (cVar2 != null) {
            j = cVar2.f20478d;
        }
        long d4 = m27278d(xmlPullParser2, "startNumber", j);
        long g = m27281g(list);
        C9134l a = mo23702a(xmlPullParser2, "media", cVar2 != null ? cVar2.f20483h : null);
        C9134l a2 = mo23702a(xmlPullParser2, "initialization", cVar2 != null ? cVar2.f20482g : null);
        C9122h hVar = null;
        List<C9131d> list2 = null;
        while (true) {
            xmlPullParser.next();
            C9122h hVar2 = hVar;
            if (C9556l0.m29467d(xmlPullParser2, "Initialization")) {
                hVar = mo23713f(xmlPullParser);
            } else {
                if (C9556l0.m29467d(xmlPullParser2, "SegmentTimeline")) {
                    list2 = mo23715h(xmlPullParser);
                } else {
                    m27282k(xmlPullParser);
                }
                hVar = hVar2;
            }
            if (C9556l0.m29466c(xmlPullParser2, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar2 != null) {
            if (hVar == null) {
                hVar = cVar2.f20475a;
            }
            if (list2 == null) {
                list2 = cVar2.f20480f;
            }
        }
        return mo23697a(hVar, d, d2, d4, g, d3, list2, a2, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9130c mo23697a(C9122h hVar, long j, long j2, long j3, long j4, long j5, List<C9131d> list, C9134l lVar, C9134l lVar2) {
        C9130c cVar = new C9130c(hVar, j, j2, j3, j4, j5, list, lVar, lVar2);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9119e mo23690a(String str, String str2, long j, long[] jArr, C8746a[] aVarArr) {
        C9119e eVar = new C9119e(str, str2, j, jArr, aVarArr);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<Long, C8746a> mo23682a(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long d = m27278d(xmlPullParser2, "id", 0);
        long d2 = m27278d(xmlPullParser2, "duration", -9223372036854775807L);
        long d3 = m27278d(xmlPullParser2, "presentationTime", 0);
        long c = Util.m29439c(d2, 1000, j);
        long c2 = Util.m29439c(d3, 1000000, j);
        String b = m27272b(xmlPullParser2, "messageData", (String) null);
        byte[] a = mo23705a(xmlPullParser2, byteArrayOutputStream);
        Long valueOf = Long.valueOf(c2);
        if (b != null) {
            a = Util.m29447d(b);
        }
        return Pair.create(valueOf, mo23684a(str, str2, d, c, a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo23705a(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, Utf8Charset.NAME);
        xmlPullParser.nextToken();
        while (!C9556l0.m29466c(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.valueOf(false));
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8746a mo23684a(String str, String str2, long j, long j2, byte[] bArr) {
        C8746a aVar = new C8746a(str, str2, j2, j, bArr);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9131d mo23699a(long j, long j2) {
        return new C9131d(j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9134l mo23702a(XmlPullParser xmlPullParser, String str, C9134l lVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? C9134l.m27374a(attributeValue) : lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9122h mo23693a(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return mo23692a(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return mo23692a(attributeValue, j2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9122h mo23692a(String str, long j, long j2) {
        C9122h hVar = new C9122h(str, j, j2);
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23680a(List<C9118d> list) {
        int b;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C9118d dVar = (C9118d) list.get(i2);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f20446a)) {
                b = mo23679a(dVar.f20447b);
            } else {
                if ("urn:tva:metadata:cs:AudioPurposeCS:2007".equalsIgnoreCase(dVar.f20446a)) {
                    b = mo23706b(dVar.f20447b);
                }
            }
            i |= b;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23679a(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            int r2 = r8.hashCode()
            r3 = 8
            r4 = 4
            r5 = 2
            r6 = 1
            switch(r2) {
                case -2060497896: goto L_0x007b;
                case -1724546052: goto L_0x0070;
                case -1580883024: goto L_0x0065;
                case -1408024454: goto L_0x005b;
                case 99825: goto L_0x0051;
                case 3343801: goto L_0x0047;
                case 3530173: goto L_0x003c;
                case 552573414: goto L_0x0032;
                case 899152809: goto L_0x0028;
                case 1629013393: goto L_0x001e;
                case 1855372047: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0085
        L_0x0013:
            java.lang.String r2 = "supplementary"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 2
            goto L_0x0086
        L_0x001e:
            java.lang.String r2 = "emergency"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 5
            goto L_0x0086
        L_0x0028:
            java.lang.String r2 = "commentary"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 3
            goto L_0x0086
        L_0x0032:
            java.lang.String r2 = "caption"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 6
            goto L_0x0086
        L_0x003c:
            java.lang.String r2 = "sign"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 8
            goto L_0x0086
        L_0x0047:
            java.lang.String r2 = "main"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 0
            goto L_0x0086
        L_0x0051:
            java.lang.String r2 = "dub"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 4
            goto L_0x0086
        L_0x005b:
            java.lang.String r2 = "alternate"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 1
            goto L_0x0086
        L_0x0065:
            java.lang.String r2 = "enhanced-audio-intelligibility"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 10
            goto L_0x0086
        L_0x0070:
            java.lang.String r2 = "description"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 9
            goto L_0x0086
        L_0x007b:
            java.lang.String r2 = "subtitle"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0085
            r8 = 7
            goto L_0x0086
        L_0x0085:
            r8 = -1
        L_0x0086:
            switch(r8) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x00a1;
                case 2: goto L_0x00a0;
                case 3: goto L_0x009f;
                case 4: goto L_0x009c;
                case 5: goto L_0x0099;
                case 6: goto L_0x0096;
                case 7: goto L_0x0093;
                case 8: goto L_0x0090;
                case 9: goto L_0x008d;
                case 10: goto L_0x008a;
                default: goto L_0x0089;
            }
        L_0x0089:
            return r0
        L_0x008a:
            r8 = 2048(0x800, float:2.87E-42)
            return r8
        L_0x008d:
            r8 = 512(0x200, float:7.175E-43)
            return r8
        L_0x0090:
            r8 = 256(0x100, float:3.59E-43)
            return r8
        L_0x0093:
            r8 = 128(0x80, float:1.794E-43)
            return r8
        L_0x0096:
            r8 = 64
            return r8
        L_0x0099:
            r8 = 32
            return r8
        L_0x009c:
            r8 = 16
            return r8
        L_0x009f:
            return r3
        L_0x00a0:
            return r4
        L_0x00a1:
            return r5
        L_0x00a2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.p376k.C9116c.mo23679a(java.lang.String):int");
    }

    /* renamed from: a */
    private static void m27268a(ArrayList<C8692b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C8692b bVar = (C8692b) arrayList.get(size);
            if (!bVar.mo22760X()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((C8692b) arrayList.get(i)).mo22762a(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static int m27266a(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    /* renamed from: a */
    protected static float m27265a(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f20435b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: a */
    protected static int m27267a(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }
}
