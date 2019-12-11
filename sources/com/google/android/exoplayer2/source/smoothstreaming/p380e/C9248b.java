package com.google.android.exoplayer2.source.smoothstreaming.p380e;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p366s0.p371v.C8980k;
import com.google.android.exoplayer2.p366s0.p371v.C8984n;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9544h;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a.C9246a;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a.C9247b;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.b */
/* compiled from: SsManifestParser */
public class C9248b implements C9456a<C9245a> {

    /* renamed from: a */
    private final XmlPullParserFactory f21029a;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.b$a */
    /* compiled from: SsManifestParser */
    private static abstract class C9249a {

        /* renamed from: a */
        private final String f21030a;

        /* renamed from: b */
        private final String f21031b;

        /* renamed from: c */
        private final C9249a f21032c;

        /* renamed from: d */
        private final List<Pair<String, Object>> f21033d = new LinkedList();

        public C9249a(C9249a aVar, String str, String str2) {
            this.f21032c = aVar;
            this.f21030a = str;
            this.f21031b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Object mo23991a();

        /* renamed from: a */
        public final Object mo23993a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f21031b.equals(name)) {
                        mo24001c(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo23999b(name)) {
                            mo24001c(xmlPullParser);
                        } else {
                            C9249a a = m27940a(this, name, this.f21030a);
                            if (a == null) {
                                i = 1;
                            } else {
                                mo23994a(a.mo23993a(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo24002d(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo23998b(xmlPullParser);
                    if (!mo23999b(name2)) {
                        return mo23991a();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo23994a(Object obj) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final long mo23997b(XmlPullParser xmlPullParser, String str) throws C8723g0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C8723g0((Throwable) e);
                }
            } else {
                throw new C9250b(str);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo23998b(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo23999b(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final String mo24000c(XmlPullParser xmlPullParser, String str) throws C9250b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C9250b(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo24001c(XmlPullParser xmlPullParser) throws C8723g0;

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo24002d(XmlPullParser xmlPullParser) {
        }

        /* renamed from: a */
        private C9249a m27940a(C9249a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C9252d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new C9251c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C9254f(aVar, str2);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo23995a(String str, Object obj) {
            this.f21033d.add(Pair.create(str, obj));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo23992a(String str) {
            for (int i = 0; i < this.f21033d.size(); i++) {
                Pair pair = (Pair) this.f21033d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            C9249a aVar = this.f21032c;
            return aVar == null ? null : aVar.mo23992a(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo23989a(XmlPullParser xmlPullParser, String str, int i) throws C8723g0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new C8723g0((Throwable) e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo23988a(XmlPullParser xmlPullParser, String str) throws C8723g0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C8723g0((Throwable) e);
                }
            } else {
                throw new C9250b(str);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final long mo23990a(XmlPullParser xmlPullParser, String str, long j) throws C8723g0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new C8723g0((Throwable) e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo23996a(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.b$b */
    /* compiled from: SsManifestParser */
    public static class C9250b extends C8723g0 {
        public C9250b(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Missing required field: ");
            sb.append(str);
            super(sb.toString());
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.b$c */
    /* compiled from: SsManifestParser */
    private static class C9251c extends C9249a {

        /* renamed from: e */
        private boolean f21034e;

        /* renamed from: f */
        private UUID f21035f;

        /* renamed from: g */
        private byte[] f21036g;

        public C9251c(C9249a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: a */
        public Object mo23991a() {
            UUID uuid = this.f21035f;
            return new C9246a(uuid, C8980k.m26491a(uuid, this.f21036g), m27957a(this.f21036g));
        }

        /* renamed from: b */
        public boolean mo23999b(String str) {
            return "ProtectionHeader".equals(str);
        }

        /* renamed from: c */
        public void mo24001c(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f21034e = true;
                this.f21035f = UUID.fromString(m27959c(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        /* renamed from: d */
        public void mo24002d(XmlPullParser xmlPullParser) {
            if (this.f21034e) {
                this.f21036g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }

        /* renamed from: b */
        public void mo23998b(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f21034e = false;
            }
        }

        /* renamed from: a */
        private static C8984n[] m27957a(byte[] bArr) {
            C8984n nVar = new C8984n(true, null, 8, m27958b(bArr), 0, 0, null);
            return new C8984n[]{nVar};
        }

        /* renamed from: b */
        private static byte[] m27958b(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            m27956a(decode, 0, 3);
            m27956a(decode, 1, 2);
            m27956a(decode, 4, 5);
            m27956a(decode, 6, 7);
            return decode;
        }

        /* renamed from: a */
        private static void m27956a(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        /* renamed from: c */
        private static String m27959c(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.b$d */
    /* compiled from: SsManifestParser */
    private static class C9252d extends C9249a {

        /* renamed from: e */
        private Format f21037e;

        public C9252d(C9249a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: d */
        private static String m27966d(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        /* renamed from: a */
        public Object mo23991a() {
            return this.f21037e;
        }

        /* renamed from: c */
        public void mo24001c(XmlPullParser xmlPullParser) throws C8723g0 {
            XmlPullParser xmlPullParser2 = xmlPullParser;
            int intValue = ((Integer) mo23992a("Type")).intValue();
            String attributeValue = xmlPullParser2.getAttributeValue(null, "Index");
            String str = (String) mo23992a("Name");
            int a = mo23988a(xmlPullParser2, "Bitrate");
            String d = m27966d(mo24000c(xmlPullParser2, "FourCC"));
            String str2 = "CodecPrivateData";
            if (intValue == 2) {
                this.f21037e = Format.m24882a(attributeValue, str, "video/mp4", d, (String) null, (Metadata) null, a, mo23988a(xmlPullParser2, "MaxWidth"), mo23988a(xmlPullParser2, "MaxHeight"), -1.0f, m27965c(xmlPullParser2.getAttributeValue(null, str2)), 0, 0);
                return;
            }
            String str3 = "Language";
            if (intValue == 1) {
                String str4 = "audio/mp4a-latm";
                if (d == null) {
                    d = str4;
                }
                int a2 = mo23988a(xmlPullParser2, "Channels");
                int a3 = mo23988a(xmlPullParser2, "SamplingRate");
                List c = m27965c(xmlPullParser2.getAttributeValue(null, str2));
                if (c.isEmpty() && str4.equals(d)) {
                    c = Collections.singletonList(C9544h.m29336a(a3, a2));
                }
                this.f21037e = Format.m24883a(attributeValue, str, "audio/mp4", d, (String) null, (Metadata) null, a, a2, a3, c, 0, 0, (String) mo23992a(str3));
            } else if (intValue == 3) {
                String str5 = (String) mo23992a("Subtype");
                char c2 = 65535;
                int hashCode = str5.hashCode();
                if (hashCode != 2061026) {
                    if (hashCode == 2094737 && str5.equals("DESC")) {
                        c2 = 1;
                    }
                } else if (str5.equals("CAPT")) {
                    c2 = 0;
                }
                int i = c2 != 0 ? c2 != 1 ? 0 : 1024 : 64;
                this.f21037e = Format.m24884b(attributeValue, str, "application/mp4", d, null, a, 0, i, (String) mo23992a(str3));
            } else {
                this.f21037e = Format.m24880a(attributeValue, str, "application/mp4", d, null, a, 0, 0, null);
            }
        }

        /* renamed from: c */
        private static List<byte[]> m27965c(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] a = C9554k0.m29416a(str);
                byte[][] b = C9544h.m29342b(a);
                if (b == null) {
                    arrayList.add(a);
                } else {
                    Collections.addAll(arrayList, b);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.b$e */
    /* compiled from: SsManifestParser */
    private static class C9253e extends C9249a {

        /* renamed from: e */
        private final List<C9247b> f21038e = new LinkedList();

        /* renamed from: f */
        private int f21039f;

        /* renamed from: g */
        private int f21040g;

        /* renamed from: h */
        private long f21041h;

        /* renamed from: i */
        private long f21042i;

        /* renamed from: j */
        private long f21043j;

        /* renamed from: k */
        private int f21044k = -1;

        /* renamed from: l */
        private boolean f21045l;

        /* renamed from: m */
        private C9246a f21046m = null;

        public C9253e(C9249a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
        }

        /* renamed from: a */
        public void mo23994a(Object obj) {
            if (obj instanceof C9247b) {
                this.f21038e.add((C9247b) obj);
            } else if (obj instanceof C9246a) {
                C9537e.m29301b(this.f21046m == null);
                this.f21046m = (C9246a) obj;
            }
        }

        /* renamed from: c */
        public void mo24001c(XmlPullParser xmlPullParser) throws C8723g0 {
            this.f21039f = mo23988a(xmlPullParser, "MajorVersion");
            this.f21040g = mo23988a(xmlPullParser, "MinorVersion");
            String str = "TimeScale";
            this.f21041h = mo23990a(xmlPullParser, str, 10000000);
            this.f21042i = mo23997b(xmlPullParser, "Duration");
            this.f21043j = mo23990a(xmlPullParser, "DVRWindowLength", 0);
            this.f21044k = mo23989a(xmlPullParser, "LookaheadCount", -1);
            this.f21045l = mo23996a(xmlPullParser, "IsLive", false);
            mo23995a(str, (Object) Long.valueOf(this.f21041h));
        }

        /* renamed from: a */
        public Object mo23991a() {
            C9247b[] bVarArr = new C9247b[this.f21038e.size()];
            this.f21038e.toArray(bVarArr);
            C9246a aVar = this.f21046m;
            if (aVar != null) {
                DrmInitData drmInitData = new DrmInitData(new C8692b(aVar.f21010a, "video/mp4", aVar.f21011b));
                for (C9247b bVar : bVarArr) {
                    int i = bVar.f21013a;
                    if (i == 2 || i == 1) {
                        Format[] formatArr = bVar.f21022j;
                        for (int i2 = 0; i2 < formatArr.length; i2++) {
                            formatArr[i2] = formatArr[i2].mo22602a(drmInitData);
                        }
                    }
                }
            }
            C9245a aVar2 = new C9245a(this.f21039f, this.f21040g, this.f21041h, this.f21042i, this.f21043j, this.f21044k, this.f21045l, this.f21046m, bVarArr);
            return aVar2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.b$f */
    /* compiled from: SsManifestParser */
    private static class C9254f extends C9249a {

        /* renamed from: e */
        private final String f21047e;

        /* renamed from: f */
        private final List<Format> f21048f = new LinkedList();

        /* renamed from: g */
        private int f21049g;

        /* renamed from: h */
        private String f21050h;

        /* renamed from: i */
        private long f21051i;

        /* renamed from: j */
        private String f21052j;

        /* renamed from: k */
        private String f21053k;

        /* renamed from: l */
        private int f21054l;

        /* renamed from: m */
        private int f21055m;

        /* renamed from: n */
        private int f21056n;

        /* renamed from: o */
        private int f21057o;

        /* renamed from: p */
        private String f21058p;

        /* renamed from: q */
        private ArrayList<Long> f21059q;

        /* renamed from: r */
        private long f21060r;

        public C9254f(C9249a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f21047e = str;
        }

        /* renamed from: e */
        private void m27972e(XmlPullParser xmlPullParser) throws C8723g0 {
            this.f21049g = m27974g(xmlPullParser);
            mo23995a("Type", (Object) Integer.valueOf(this.f21049g));
            String str = "Subtype";
            if (this.f21049g == 3) {
                this.f21050h = mo24000c(xmlPullParser, str);
            } else {
                this.f21050h = xmlPullParser.getAttributeValue(null, str);
            }
            mo23995a(str, (Object) this.f21050h);
            this.f21052j = xmlPullParser.getAttributeValue(null, "Name");
            this.f21053k = mo24000c(xmlPullParser, "Url");
            this.f21054l = mo23989a(xmlPullParser, "MaxWidth", -1);
            this.f21055m = mo23989a(xmlPullParser, "MaxHeight", -1);
            this.f21056n = mo23989a(xmlPullParser, "DisplayWidth", -1);
            this.f21057o = mo23989a(xmlPullParser, "DisplayHeight", -1);
            String str2 = "Language";
            this.f21058p = xmlPullParser.getAttributeValue(null, str2);
            mo23995a(str2, (Object) this.f21058p);
            String str3 = "TimeScale";
            this.f21051i = (long) mo23989a(xmlPullParser, str3, -1);
            if (this.f21051i == -1) {
                this.f21051i = ((Long) mo23992a(str3)).longValue();
            }
            this.f21059q = new ArrayList<>();
        }

        /* renamed from: f */
        private void m27973f(XmlPullParser xmlPullParser) throws C8723g0 {
            int size = this.f21059q.size();
            long a = mo23990a(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (a == -9223372036854775807L) {
                if (size == 0) {
                    a = 0;
                } else if (this.f21060r != -1) {
                    a = ((Long) this.f21059q.get(size - 1)).longValue() + this.f21060r;
                } else {
                    throw new C8723g0("Unable to infer start time");
                }
            }
            this.f21059q.add(Long.valueOf(a));
            this.f21060r = mo23990a(xmlPullParser, "d", -9223372036854775807L);
            long a2 = mo23990a(xmlPullParser, "r", 1);
            if (a2 <= 1 || this.f21060r != -9223372036854775807L) {
                while (true) {
                    long j = (long) i;
                    if (j < a2) {
                        this.f21059q.add(Long.valueOf((this.f21060r * j) + a));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                throw new C8723g0("Repeated chunk with unspecified duration");
            }
        }

        /* renamed from: g */
        private int m27974g(XmlPullParser xmlPullParser) throws C8723g0 {
            String str = "Type";
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C9250b(str);
            } else if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            } else {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid key value[");
                sb.append(attributeValue);
                sb.append("]");
                throw new C8723g0(sb.toString());
            }
        }

        /* renamed from: a */
        public void mo23994a(Object obj) {
            if (obj instanceof Format) {
                this.f21048f.add((Format) obj);
            }
        }

        /* renamed from: b */
        public boolean mo23999b(String str) {
            return "c".equals(str);
        }

        /* renamed from: c */
        public void mo24001c(XmlPullParser xmlPullParser) throws C8723g0 {
            if ("c".equals(xmlPullParser.getName())) {
                m27973f(xmlPullParser);
            } else {
                m27972e(xmlPullParser);
            }
        }

        /* renamed from: a */
        public Object mo23991a() {
            Format[] formatArr = new Format[this.f21048f.size()];
            Format[] formatArr2 = formatArr;
            this.f21048f.toArray(formatArr);
            C9247b bVar = r2;
            C9247b bVar2 = new C9247b(this.f21047e, this.f21053k, this.f21049g, this.f21050h, this.f21051i, this.f21052j, this.f21054l, this.f21055m, this.f21056n, this.f21057o, this.f21058p, formatArr2, this.f21059q, this.f21060r);
            return bVar;
        }
    }

    public C9248b() {
        try {
            this.f21029a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: a */
    public C9245a m27939a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f21029a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C9245a) new C9253e(null, uri.toString()).mo23993a(newPullParser);
        } catch (XmlPullParserException e) {
            throw new C8723g0((Throwable) e);
        }
    }
}
