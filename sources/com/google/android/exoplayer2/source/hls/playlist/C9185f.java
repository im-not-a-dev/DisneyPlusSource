package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import com.google.android.exoplayer2.p366s0.p371v.C8980k;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.source.C9202k0;
import com.google.android.exoplayer2.source.hls.playlist.C9182e.C9184b;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.f */
/* compiled from: HlsPlaylistParser */
public final class C9185f implements C9456a<HlsPlaylist> {

    /* renamed from: A */
    private static final Pattern f20766A = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: B */
    private static final Pattern f20767B = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: C */
    private static final Pattern f20768C = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: D */
    private static final Pattern f20769D = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: E */
    private static final Pattern f20770E = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: F */
    private static final Pattern f20771F = m27668a("AUTOSELECT");

    /* renamed from: G */
    private static final Pattern f20772G = m27668a("DEFAULT");

    /* renamed from: H */
    private static final Pattern f20773H = m27668a("FORCED");

    /* renamed from: I */
    private static final Pattern f20774I = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f20775J = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: K */
    private static final Pattern f20776K = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: b */
    private static final Pattern f20777b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: c */
    private static final Pattern f20778c = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: d */
    private static final Pattern f20779d = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f20780e = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f20781f = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: g */
    private static final Pattern f20782g = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: h */
    private static final Pattern f20783h = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: i */
    private static final Pattern f20784i = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: j */
    private static final Pattern f20785j = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: k */
    private static final Pattern f20786k = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: l */
    private static final Pattern f20787l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: m */
    private static final Pattern f20788m = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: n */
    private static final Pattern f20789n = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: o */
    private static final Pattern f20790o = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: p */
    private static final Pattern f20791p = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: q */
    private static final Pattern f20792q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: r */
    private static final Pattern f20793r = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: s */
    private static final Pattern f20794s = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: t */
    private static final Pattern f20795t = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: u */
    private static final Pattern f20796u = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: v */
    private static final Pattern f20797v = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: w */
    private static final Pattern f20798w = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: x */
    private static final Pattern f20799x = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: y */
    private static final Pattern f20800y = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: z */
    private static final Pattern f20801z = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: a */
    private final C9182e f20802a;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.f$a */
    /* compiled from: HlsPlaylistParser */
    private static class C9186a {

        /* renamed from: a */
        private final BufferedReader f20803a;

        /* renamed from: b */
        private final Queue<String> f20804b;

        /* renamed from: c */
        private String f20805c;

        public C9186a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f20804b = queue;
            this.f20803a = bufferedReader;
        }

        /* renamed from: a */
        public boolean mo23896a() throws IOException {
            if (this.f20805c != null) {
                return true;
            }
            if (!this.f20804b.isEmpty()) {
                this.f20805c = (String) this.f20804b.poll();
                return true;
            }
            do {
                String readLine = this.f20803a.readLine();
                this.f20805c = readLine;
                if (readLine == null) {
                    return false;
                }
                this.f20805c = this.f20805c.trim();
            } while (this.f20805c.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String mo23897b() throws IOException {
            if (!mo23896a()) {
                return null;
            }
            String str = this.f20805c;
            this.f20805c = null;
            return str;
        }
    }

    public C9185f() {
        this(C9182e.f20748l);
    }

    /* renamed from: b */
    private static C9184b m27673b(ArrayList<C9184b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C9184b bVar = (C9184b) arrayList.get(i);
            if (str.equals(bVar.f20762c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m27676c(String str) {
        int i = m27670a(str, f20772G, false) ? 1 : 0;
        if (m27670a(str, f20773H, false)) {
            i |= 2;
        }
        return m27670a(str, f20771F, false) ? i | 4 : i;
    }

    public C9185f(C9182e eVar) {
        this.f20802a = eVar;
    }

    /* renamed from: a */
    public HlsPlaylist m27680a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (m27669a(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                C9182e a = m27665a(new C9186a(arrayDeque, bufferedReader), uri.toString());
                                Util.m29406a((Closeable) bufferedReader);
                                return a;
                            }
                        }
                    } else {
                        Util.m29406a((Closeable) bufferedReader);
                        throw new C8723g0("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return m27663a(this.f20802a, new C9186a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new C9202k0("Input does not start with the #EXTM3U header.", uri);
        } finally {
            Util.m29406a((Closeable) bufferedReader);
        }
    }

    /* renamed from: b */
    private static int m27671b(String str, Map<String, String> map) {
        String a = m27667a(str, f20769D, map);
        int i = 0;
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        String[] a2 = Util.m29423a(a, ",");
        if (Util.m29415a((Object[]) a2, (Object) "public.accessibility.describes-video")) {
            i = DateUtils.FORMAT_NO_NOON;
        }
        if (Util.m29415a((Object[]) a2, (Object) "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.m29415a((Object[]) a2, (Object) "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        if (Util.m29415a((Object[]) a2, (Object) "public.easy-to-read")) {
            i |= ContentServiceClientExtras.URL_SIZE_LIMIT;
        }
        return i;
    }

    /* renamed from: c */
    private static long m27677c(String str, Pattern pattern) throws C8723g0 {
        return Long.parseLong(m27675b(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: c */
    private static String m27678c(String str, Map<String, String> map) {
        Matcher matcher = f20776K.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static String m27674b(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: b */
    private static int m27672b(String str, Pattern pattern) throws C8723g0 {
        return Integer.parseInt(m27675b(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: b */
    private static String m27675b(String str, Pattern pattern, Map<String, String> map) throws C8723g0 {
        String a = m27667a(str, pattern, map);
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw new C8723g0(sb.toString());
    }

    /* renamed from: a */
    private static boolean m27669a(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int a = m27660a(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (a != "#EXTM3U".charAt(i)) {
                return false;
            }
            a = bufferedReader.read();
        }
        return Util.m29452f(m27660a(bufferedReader, false, a));
    }

    /* renamed from: a */
    private static int m27660a(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.m29452f(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.C9182e m27665a(com.google.android.exoplayer2.source.hls.playlist.C9185f.C9186a r39, java.lang.String r40) throws java.io.IOException {
        /*
            r1 = r40
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r13 = 0
            r14 = 0
        L_0x0036:
            boolean r15 = r39.mo23896a()
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            r17 = -1
            if (r15 == 0) goto L_0x01c3
            java.lang.String r15 = r39.mo23897b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x004f
            r8.add(r15)
        L_0x004f:
            java.lang.String r9 = "#EXT-X-DEFINE"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x0070
            java.util.regex.Pattern r9 = f20767B
            java.lang.String r9 = m27675b(r15, r9, r11)
            java.util.regex.Pattern r10 = f20774I
            java.lang.String r10 = m27675b(r15, r10, r11)
            r11.put(r9, r10)
        L_0x0066:
            r19 = r7
            r21 = r8
            r20 = r12
            r18 = r14
            goto L_0x01b9
        L_0x0070:
            java.lang.String r9 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x007a
            r14 = 1
            goto L_0x0036
        L_0x007a:
            java.lang.String r9 = "#EXT-X-MEDIA"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x0086
            r3.add(r15)
            goto L_0x0066
        L_0x0086:
            java.lang.String r9 = "#EXT-X-SESSION-KEY"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x00c0
            java.util.regex.Pattern r9 = f20797v
            java.lang.String r10 = "identity"
            java.lang.String r9 = m27666a(r15, r9, r10, r11)
            com.google.android.exoplayer2.drm.DrmInitData$b r9 = m27662a(r15, r9, r11)
            if (r9 == 0) goto L_0x00ba
            java.util.regex.Pattern r10 = f20796u
            java.lang.String r10 = m27675b(r15, r10, r11)
            java.lang.String r10 = m27674b(r10)
            com.google.android.exoplayer2.drm.DrmInitData r15 = new com.google.android.exoplayer2.drm.DrmInitData
            r19 = r7
            r18 = r14
            r14 = 1
            com.google.android.exoplayer2.drm.DrmInitData$b[] r7 = new com.google.android.exoplayer2.drm.DrmInitData.C8692b[r14]
            r14 = 0
            r7[r14] = r9
            r15.<init>(r10, r7)
            r12.add(r15)
            goto L_0x01b5
        L_0x00ba:
            r19 = r7
            r18 = r14
            goto L_0x01b5
        L_0x00c0:
            r19 = r7
            r18 = r14
            java.lang.String r7 = "#EXT-X-STREAM-INF"
            boolean r7 = r15.startsWith(r7)
            if (r7 == 0) goto L_0x01b5
            java.lang.String r7 = "CLOSED-CAPTIONS=NONE"
            boolean r7 = r15.contains(r7)
            r13 = r13 | r7
            java.util.regex.Pattern r7 = f20782g
            int r7 = m27672b(r15, r7)
            java.util.regex.Pattern r9 = f20777b
            java.lang.String r9 = m27667a(r15, r9, r11)
            if (r9 == 0) goto L_0x00e5
            int r7 = java.lang.Integer.parseInt(r9)
        L_0x00e5:
            java.util.regex.Pattern r9 = f20784i
            java.lang.String r24 = m27667a(r15, r9, r11)
            java.util.regex.Pattern r9 = f20785j
            java.lang.String r9 = m27667a(r15, r9, r11)
            if (r9 == 0) goto L_0x0115
            java.lang.String r10 = "x"
            java.lang.String[] r9 = r9.split(r10)
            r10 = 0
            r14 = r9[r10]
            int r10 = java.lang.Integer.parseInt(r14)
            r14 = 1
            r9 = r9[r14]
            int r9 = java.lang.Integer.parseInt(r9)
            if (r10 <= 0) goto L_0x010f
            if (r9 > 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r17 = r9
            goto L_0x0110
        L_0x010f:
            r10 = -1
        L_0x0110:
            r27 = r10
            r28 = r17
            goto L_0x0119
        L_0x0115:
            r27 = -1
            r28 = -1
        L_0x0119:
            java.util.regex.Pattern r9 = f20786k
            java.lang.String r9 = m27667a(r15, r9, r11)
            if (r9 == 0) goto L_0x0128
            float r16 = java.lang.Float.parseFloat(r9)
            r29 = r16
            goto L_0x012a
        L_0x0128:
            r29 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x012a:
            java.util.regex.Pattern r9 = f20778c
            java.lang.String r9 = m27667a(r15, r9, r11)
            java.util.regex.Pattern r10 = f20779d
            java.lang.String r10 = m27667a(r15, r10, r11)
            java.util.regex.Pattern r14 = f20780e
            java.lang.String r14 = m27667a(r15, r14, r11)
            r37 = r13
            java.util.regex.Pattern r13 = f20781f
            java.lang.String r13 = m27667a(r15, r13, r11)
            java.lang.String r15 = r39.mo23897b()
            java.lang.String r15 = m27678c(r15, r11)
            android.net.Uri r15 = com.google.android.exoplayer2.p393v0.C9549j0.m29368b(r1, r15)
            int r16 = r2.size()
            java.lang.String r20 = java.lang.Integer.toString(r16)
            r21 = 0
            r23 = 0
            r25 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            java.lang.String r22 = "application/x-mpegURL"
            r26 = r7
            com.google.android.exoplayer2.Format r32 = com.google.android.exoplayer2.Format.m24882a(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r20 = r12
            com.google.android.exoplayer2.source.hls.playlist.e$b r12 = new com.google.android.exoplayer2.source.hls.playlist.e$b
            r30 = r12
            r31 = r15
            r33 = r9
            r34 = r10
            r35 = r14
            r36 = r13
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r2.add(r12)
            java.lang.Object r12 = r0.get(r15)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L_0x0192
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0.put(r15, r12)
        L_0x0192:
            com.google.android.exoplayer2.source.hls.n$b r15 = new com.google.android.exoplayer2.source.hls.n$b
            r21 = r8
            long r7 = (long) r7
            r30 = r15
            r31 = r7
            r33 = r9
            r34 = r10
            r35 = r14
            r36 = r13
            r30.<init>(r31, r33, r34, r35, r36)
            r12.add(r15)
            r14 = r18
            r7 = r19
            r12 = r20
            r8 = r21
            r13 = r37
            goto L_0x0036
        L_0x01b5:
            r21 = r8
            r20 = r12
        L_0x01b9:
            r14 = r18
            r7 = r19
            r12 = r20
            r8 = r21
            goto L_0x0036
        L_0x01c3:
            r19 = r7
            r21 = r8
            r20 = r12
            r18 = r14
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r9 = 0
        L_0x01d6:
            int r10 = r2.size()
            r12 = 0
            if (r9 >= r10) goto L_0x022c
            java.lang.Object r10 = r2.get(r9)
            com.google.android.exoplayer2.source.hls.playlist.e$b r10 = (com.google.android.exoplayer2.source.hls.playlist.C9182e.C9184b) r10
            android.net.Uri r14 = r10.f20760a
            boolean r14 = r8.add(r14)
            if (r14 == 0) goto L_0x0221
            com.google.android.exoplayer2.Format r14 = r10.f20761b
            com.google.android.exoplayer2.metadata.Metadata r14 = r14.f18347Z
            if (r14 != 0) goto L_0x01f3
            r14 = 1
            goto L_0x01f4
        L_0x01f3:
            r14 = 0
        L_0x01f4:
            com.google.android.exoplayer2.p393v0.Assertions.checkState(r14)
            com.google.android.exoplayer2.source.hls.n r14 = new com.google.android.exoplayer2.source.hls.n
            android.net.Uri r15 = r10.f20760a
            java.lang.Object r15 = r0.get(r15)
            java.util.List r15 = (java.util.List) r15
            r14.<init>(r12, r12, r15)
            com.google.android.exoplayer2.Format r12 = r10.f20761b
            com.google.android.exoplayer2.metadata.Metadata r15 = new com.google.android.exoplayer2.metadata.Metadata
            r22 = r0
            r39 = r8
            r0 = 1
            com.google.android.exoplayer2.metadata.Metadata$b[] r8 = new com.google.android.exoplayer2.metadata.Metadata.C8737b[r0]
            r0 = 0
            r8[r0] = r14
            r15.<init>(r8)
            com.google.android.exoplayer2.Format r0 = r12.mo22603a(r15)
            com.google.android.exoplayer2.source.hls.playlist.e$b r0 = r10.mo23895a(r0)
            r7.add(r0)
            goto L_0x0225
        L_0x0221:
            r22 = r0
            r39 = r8
        L_0x0225:
            int r9 = r9 + 1
            r8 = r39
            r0 = r22
            goto L_0x01d6
        L_0x022c:
            r8 = r12
            r9 = r8
            r0 = 0
        L_0x022f:
            int r10 = r3.size()
            if (r0 >= r10) goto L_0x03e7
            java.lang.Object r10 = r3.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.util.regex.Pattern r14 = f20768C
            java.lang.String r14 = m27675b(r10, r14, r11)
            java.util.regex.Pattern r15 = f20767B
            java.lang.String r15 = m27675b(r10, r15, r11)
            java.util.regex.Pattern r12 = f20799x
            java.lang.String r12 = m27667a(r10, r12, r11)
            if (r12 != 0) goto L_0x0251
            r12 = 0
            goto L_0x0255
        L_0x0251:
            android.net.Uri r12 = com.google.android.exoplayer2.p393v0.C9549j0.m29368b(r1, r12)
        L_0x0255:
            java.util.regex.Pattern r1 = f20766A
            java.lang.String r34 = m27667a(r10, r1, r11)
            int r33 = m27676c(r10)
            int r1 = m27671b(r10, r11)
            r35 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            r36 = r8
            java.lang.String r8 = ":"
            r3.append(r8)
            r3.append(r15)
            java.lang.String r22 = r3.toString()
            com.google.android.exoplayer2.metadata.Metadata r3 = new com.google.android.exoplayer2.metadata.Metadata
            r37 = r7
            r8 = 1
            com.google.android.exoplayer2.metadata.Metadata$b[] r7 = new com.google.android.exoplayer2.metadata.Metadata.C8737b[r8]
            com.google.android.exoplayer2.source.hls.n r8 = new com.google.android.exoplayer2.source.hls.n
            r38 = r13
            java.util.List r13 = java.util.Collections.emptyList()
            r8.<init>(r14, r15, r13)
            r13 = 0
            r7[r13] = r8
            r3.<init>(r7)
            java.util.regex.Pattern r7 = f20801z
            java.lang.String r7 = m27675b(r10, r7, r11)
            int r8 = r7.hashCode()
            r13 = 2
            switch(r8) {
                case -959297733: goto L_0x02c0;
                case -333210994: goto L_0x02b6;
                case 62628790: goto L_0x02ac;
                case 81665115: goto L_0x02a2;
                default: goto L_0x02a1;
            }
        L_0x02a1:
            goto L_0x02ca
        L_0x02a2:
            java.lang.String r8 = "VIDEO"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02ca
            r7 = 0
            goto L_0x02cb
        L_0x02ac:
            java.lang.String r8 = "AUDIO"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02ca
            r7 = 1
            goto L_0x02cb
        L_0x02b6:
            java.lang.String r8 = "CLOSED-CAPTIONS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02ca
            r7 = 3
            goto L_0x02cb
        L_0x02c0:
            java.lang.String r8 = "SUBTITLES"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02ca
            r7 = 2
            goto L_0x02cb
        L_0x02ca:
            r7 = -1
        L_0x02cb:
            if (r7 == 0) goto L_0x0388
            r8 = 1
            if (r7 == r8) goto L_0x033f
            if (r7 == r13) goto L_0x031d
            r8 = 3
            if (r7 == r8) goto L_0x02d7
            goto L_0x03d8
        L_0x02d7:
            java.util.regex.Pattern r3 = f20770E
            java.lang.String r3 = m27675b(r10, r3, r11)
            java.lang.String r7 = "CC"
            boolean r7 = r3.startsWith(r7)
            if (r7 == 0) goto L_0x02f0
            java.lang.String r3 = r3.substring(r13)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r7 = "application/cea-608"
            goto L_0x02fb
        L_0x02f0:
            r7 = 7
            java.lang.String r3 = r3.substring(r7)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r7 = "application/cea-708"
        L_0x02fb:
            r31 = r3
            r25 = r7
            if (r9 != 0) goto L_0x0306
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0306:
            r24 = 0
            r26 = 0
            r27 = -1
            r23 = r15
            r28 = r33
            r29 = r1
            r30 = r34
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24881a(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9.add(r1)
            goto L_0x03d8
        L_0x031d:
            r26 = 0
            r27 = -1
            java.lang.String r24 = "application/x-mpegURL"
            java.lang.String r25 = "text/vtt"
            r23 = r15
            r28 = r33
            r29 = r1
            r30 = r34
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24884b(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.google.android.exoplayer2.Format r1 = r1.mo22603a(r3)
            com.google.android.exoplayer2.source.hls.playlist.e$a r3 = new com.google.android.exoplayer2.source.hls.playlist.e$a
            r3.<init>(r12, r1, r14, r15)
            r6.add(r3)
            goto L_0x03d8
        L_0x033f:
            com.google.android.exoplayer2.source.hls.playlist.e$b r7 = m27664a(r2, r14)
            if (r7 == 0) goto L_0x0351
            com.google.android.exoplayer2.Format r7 = r7.f20761b
            java.lang.String r7 = r7.f18346Y
            r8 = 1
            java.lang.String r7 = com.google.android.exoplayer2.p393v0.Util.m29396a(r7, r8)
            r26 = r7
            goto L_0x0354
        L_0x0351:
            r8 = 1
            r26 = 0
        L_0x0354:
            if (r26 == 0) goto L_0x035d
            java.lang.String r7 = com.google.android.exoplayer2.p393v0.C9566t.m29511d(r26)
            r25 = r7
            goto L_0x035f
        L_0x035d:
            r25 = 0
        L_0x035f:
            int r29 = m27661a(r10, r11)
            r27 = 0
            r28 = -1
            r30 = -1
            r31 = 0
            java.lang.String r24 = "application/x-mpegURL"
            r23 = r15
            r32 = r33
            r33 = r1
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24883a(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            if (r12 != 0) goto L_0x037b
            r8 = r1
            goto L_0x03da
        L_0x037b:
            com.google.android.exoplayer2.source.hls.playlist.e$a r7 = new com.google.android.exoplayer2.source.hls.playlist.e$a
            com.google.android.exoplayer2.Format r1 = r1.mo22603a(r3)
            r7.<init>(r12, r1, r14, r15)
            r5.add(r7)
            goto L_0x03d8
        L_0x0388:
            r8 = 1
            com.google.android.exoplayer2.source.hls.playlist.e$b r7 = m27673b(r2, r14)
            if (r7 == 0) goto L_0x03a6
            com.google.android.exoplayer2.Format r7 = r7.f20761b
            java.lang.String r10 = r7.f18346Y
            java.lang.String r10 = com.google.android.exoplayer2.p393v0.Util.m29396a(r10, r13)
            int r13 = r7.f18355g0
            int r8 = r7.f18356h0
            float r7 = r7.f18357i0
            r31 = r7
            r30 = r8
            r26 = r10
            r29 = r13
            goto L_0x03ae
        L_0x03a6:
            r26 = 0
            r29 = -1
            r30 = -1
            r31 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x03ae:
            if (r26 == 0) goto L_0x03b7
            java.lang.String r7 = com.google.android.exoplayer2.p393v0.C9566t.m29511d(r26)
            r25 = r7
            goto L_0x03b9
        L_0x03b7:
            r25 = 0
        L_0x03b9:
            r27 = 0
            r28 = -1
            r32 = 0
            java.lang.String r24 = "application/x-mpegURL"
            r23 = r15
            r34 = r1
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24882a(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            com.google.android.exoplayer2.Format r1 = r1.mo22603a(r3)
            if (r12 != 0) goto L_0x03d0
            goto L_0x03d8
        L_0x03d0:
            com.google.android.exoplayer2.source.hls.playlist.e$a r3 = new com.google.android.exoplayer2.source.hls.playlist.e$a
            r3.<init>(r12, r1, r14, r15)
            r4.add(r3)
        L_0x03d8:
            r8 = r36
        L_0x03da:
            int r0 = r0 + 1
            r1 = r40
            r3 = r35
            r7 = r37
            r13 = r38
            r12 = 0
            goto L_0x022f
        L_0x03e7:
            r37 = r7
            r36 = r8
            r38 = r13
            if (r38 == 0) goto L_0x03f4
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
        L_0x03f4:
            com.google.android.exoplayer2.source.hls.playlist.e r13 = new com.google.android.exoplayer2.source.hls.playlist.e
            r0 = r13
            r1 = r40
            r2 = r21
            r3 = r37
            r7 = r19
            r8 = r36
            r10 = r18
            r12 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.C9185f.m27665a(com.google.android.exoplayer2.source.hls.playlist.f$a, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.e");
    }

    /* renamed from: a */
    private static C9184b m27664a(ArrayList<C9184b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C9184b bVar = (C9184b) arrayList.get(i);
            if (str.equals(bVar.f20763d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static HlsMediaPlaylist m27663a(C9182e eVar, C9186a aVar, String str) throws IOException {
        long j;
        String str2;
        TreeMap treeMap;
        DrmInitData drmInitData;
        long j2;
        long j3;
        C9182e eVar2 = eVar;
        boolean z = eVar2.f20716c;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TreeMap treeMap2 = new TreeMap();
        String str3 = "";
        char c = 0;
        int i = 1;
        boolean z2 = z;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        String str4 = str3;
        boolean z3 = false;
        int i2 = 0;
        String str5 = null;
        String str6 = null;
        long j6 = 0;
        int i3 = 0;
        long j7 = 0;
        int i4 = 1;
        boolean z4 = false;
        DrmInitData drmInitData2 = null;
        long j8 = 0;
        long j9 = 0;
        DrmInitData drmInitData3 = null;
        boolean z5 = false;
        String str7 = null;
        long j10 = -1;
        int i5 = 0;
        long j11 = 0;
        C9176a aVar2 = null;
        while (true) {
            long j12 = 0;
            while (aVar.mo23896a()) {
                String b = aVar.mo23897b();
                if (b.startsWith("#EXT")) {
                    arrayList2.add(b);
                }
                if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String b2 = m27675b(b, f20789n, hashMap);
                    if ("VOD".equals(b2)) {
                        i2 = 1;
                    } else if ("EVENT".equals(b2)) {
                        i2 = 2;
                    }
                } else if (b.startsWith("#EXT-X-START")) {
                    j4 = (long) (m27659a(b, f20793r) * 1000000.0d);
                } else {
                    String str8 = "@";
                    if (b.startsWith("#EXT-X-MAP")) {
                        String b3 = m27675b(b, f20799x, hashMap);
                        String a = m27667a(b, f20795t, (Map<String, String>) hashMap);
                        if (a != null) {
                            String[] split = a.split(str8);
                            long parseLong = Long.parseLong(split[c]);
                            if (split.length > i) {
                                j8 = Long.parseLong(split[i]);
                            }
                            j2 = parseLong;
                            j3 = j8;
                        } else {
                            j3 = j8;
                            j2 = j10;
                        }
                        if (str5 == null || str7 != null) {
                            aVar2 = new C9176a(b3, j3, j2, str5, str7);
                            c = 0;
                            j8 = 0;
                            j10 = -1;
                        } else {
                            throw new C8723g0("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                        }
                    } else {
                        if (b.startsWith("#EXT-X-TARGETDURATION")) {
                            j5 = ((long) m27672b(b, f20787l)) * 1000000;
                        } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j9 = m27677c(b, f20790o);
                            j7 = j9;
                        } else if (b.startsWith("#EXT-X-VERSION")) {
                            i4 = m27672b(b, f20788m);
                        } else {
                            if (b.startsWith("#EXT-X-DEFINE")) {
                                String a2 = m27667a(b, f20775J, (Map<String, String>) hashMap);
                                if (a2 != null) {
                                    String str9 = (String) eVar2.f20755j.get(a2);
                                    if (str9 != null) {
                                        hashMap.put(a2, str9);
                                    }
                                } else {
                                    hashMap.put(m27675b(b, f20767B, hashMap), m27675b(b, f20774I, hashMap));
                                }
                            } else if (b.startsWith("#EXTINF")) {
                                long a3 = (long) (m27659a(b, f20791p) * 1000000.0d);
                                str4 = m27666a(b, f20792q, str3, hashMap);
                                j12 = a3;
                            } else if (b.startsWith("#EXT-X-KEY")) {
                                String b4 = m27675b(b, f20796u, hashMap);
                                String str10 = "identity";
                                String a4 = m27666a(b, f20797v, str10, hashMap);
                                if ("NONE".equals(b4)) {
                                    treeMap2.clear();
                                    str5 = null;
                                    drmInitData3 = null;
                                    str7 = null;
                                } else {
                                    String a5 = m27667a(b, f20800y, (Map<String, String>) hashMap);
                                    if (!str10.equals(a4)) {
                                        if (str6 == null) {
                                            str6 = m27674b(b4);
                                        }
                                        C8692b a6 = m27662a(b, a4, (Map<String, String>) hashMap);
                                        if (a6 != null) {
                                            treeMap2.put(a4, a6);
                                            str7 = a5;
                                            str5 = null;
                                            drmInitData3 = null;
                                        }
                                    } else if ("AES-128".equals(b4)) {
                                        str5 = m27675b(b, f20799x, hashMap);
                                        str7 = a5;
                                    }
                                    str7 = a5;
                                    str5 = null;
                                }
                            } else if (b.startsWith("#EXT-X-BYTERANGE")) {
                                String[] split2 = m27675b(b, f20794s, hashMap).split(str8);
                                j10 = Long.parseLong(split2[0]);
                                if (split2.length > i) {
                                    j8 = Long.parseLong(split2[i]);
                                }
                            } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                i3 = Integer.parseInt(b.substring(b.indexOf(58) + i));
                                z3 = true;
                            } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                i5++;
                            } else if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                if (j6 == 0) {
                                    j6 = C.msToUs(Util.m29454h(b.substring(b.indexOf(58) + i))) - j11;
                                }
                            } else if (b.equals("#EXT-X-GAP")) {
                                c = 0;
                                z5 = true;
                            } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                c = 0;
                                z2 = true;
                            } else if (b.equals("#EXT-X-ENDLIST")) {
                                c = 0;
                                z4 = true;
                            } else if (!b.startsWith("#")) {
                                String str11 = str5 == null ? null : str7 != null ? str7 : Long.toHexString(j9);
                                long j13 = j9 + 1;
                                int i6 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
                                long j14 = i6 == 0 ? 0 : j8;
                                if (drmInitData3 != null || treeMap2.isEmpty()) {
                                    treeMap = treeMap2;
                                    str2 = str3;
                                    j = j13;
                                    drmInitData = drmInitData3;
                                } else {
                                    treeMap = treeMap2;
                                    C8692b[] bVarArr = (C8692b[]) treeMap2.values().toArray(new C8692b[0]);
                                    drmInitData = new DrmInitData(str6, bVarArr);
                                    if (drmInitData2 == null) {
                                        C8692b[] bVarArr2 = new C8692b[bVarArr.length];
                                        str2 = str3;
                                        j = j13;
                                        for (int i7 = 0; i7 < bVarArr.length; i7++) {
                                            bVarArr2[i7] = bVarArr[i7].mo22761a((byte[]) null);
                                        }
                                        drmInitData2 = new DrmInitData(str6, bVarArr2);
                                    } else {
                                        str2 = str3;
                                        j = j13;
                                    }
                                }
                                C9176a aVar3 = new C9176a(m27678c(b, (Map<String, String>) hashMap), aVar2, str4, j12, i5, j11, drmInitData, str5, str11, j14, j10, z5);
                                arrayList.add(aVar3);
                                j11 += j12;
                                if (i6 != 0) {
                                    j14 += j10;
                                }
                                j8 = j14;
                                eVar2 = eVar;
                                drmInitData3 = drmInitData;
                                j10 = -1;
                                treeMap2 = treeMap;
                                str3 = str2;
                                str4 = str3;
                                j9 = j;
                                c = 0;
                                i = 1;
                                z5 = false;
                            }
                            eVar2 = eVar;
                            treeMap2 = treeMap2;
                            str3 = str3;
                            c = 0;
                            i = 1;
                        }
                        c = 0;
                    }
                }
            }
            HlsMediaPlaylist hlsMediaPlaylist = new HlsMediaPlaylist(i2, str, arrayList2, j4, j6, z3, i3, j7, i4, j5, z2, z4, j6 != 0, drmInitData2, arrayList);
            return hlsMediaPlaylist;
        }
    }

    /* renamed from: a */
    private static int m27661a(String str, Map<String, String> map) {
        String a = m27667a(str, f20783h, map);
        if (a != null) {
            return Integer.parseInt(Util.m29437b(a, "/")[0]);
        }
        return -1;
    }

    /* renamed from: a */
    private static C8692b m27662a(String str, String str2, Map<String, String> map) throws C8723g0 {
        String str3 = "1";
        String a = m27666a(str, f20798w, str3, map);
        String str4 = "video/mp4";
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String b = m27675b(str, f20799x, map);
            return new C8692b(C.WIDEVINE_UUID, str4, Base64.decode(b.substring(b.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C8692b(C.WIDEVINE_UUID, "hls", Util.m29447d(str));
        } else if (!"com.microsoft.playready".equals(str2) || !str3.equals(a)) {
            return null;
        } else {
            String b2 = m27675b(str, f20799x, map);
            return new C8692b(C.PLAYREADY_UUID, str4, C8980k.m26491a(C.PLAYREADY_UUID, Base64.decode(b2.substring(b2.indexOf(44)), 0)));
        }
    }

    /* renamed from: a */
    private static double m27659a(String str, Pattern pattern) throws C8723g0 {
        return Double.parseDouble(m27675b(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: a */
    private static String m27667a(String str, Pattern pattern, Map<String, String> map) {
        return m27666a(str, pattern, null, map);
    }

    /* renamed from: a */
    private static String m27666a(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : m27678c(str2, map);
    }

    /* renamed from: a */
    private static boolean m27670a(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    /* renamed from: a */
    private static Pattern m27668a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=(");
        sb.append("NO");
        sb.append("|");
        sb.append("YES");
        sb.append(")");
        return Pattern.compile(sb.toString());
    }
}
