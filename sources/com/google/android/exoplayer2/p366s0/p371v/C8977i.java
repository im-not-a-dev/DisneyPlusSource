package com.google.android.exoplayer2.p366s0.p371v;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p359j.C8758b;
import com.google.android.exoplayer2.metadata.p359j.C8766f;
import com.google.android.exoplayer2.metadata.p359j.C8773i;
import com.google.android.exoplayer2.metadata.p359j.C8774j;
import com.google.android.exoplayer2.metadata.p359j.C8780m;
import com.google.android.exoplayer2.p366s0.C8916k;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9572w;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.s0.v.i */
/* compiled from: MetadataUtil */
final class C8977i {

    /* renamed from: A */
    private static final int f19602A = Util.m29428b("sosn");

    /* renamed from: B */
    private static final int f19603B = Util.m29428b("tvsh");

    /* renamed from: C */
    private static final int f19604C = Util.m29428b("----");

    /* renamed from: D */
    private static final String[] f19605D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f19606a = Util.m29428b("nam");

    /* renamed from: b */
    private static final int f19607b = Util.m29428b("trk");

    /* renamed from: c */
    private static final int f19608c = Util.m29428b("cmt");

    /* renamed from: d */
    private static final int f19609d = Util.m29428b("day");

    /* renamed from: e */
    private static final int f19610e = Util.m29428b("ART");

    /* renamed from: f */
    private static final int f19611f = Util.m29428b("too");

    /* renamed from: g */
    private static final int f19612g = Util.m29428b("alb");

    /* renamed from: h */
    private static final int f19613h = Util.m29428b("com");

    /* renamed from: i */
    private static final int f19614i = Util.m29428b("wrt");

    /* renamed from: j */
    private static final int f19615j = Util.m29428b("lyr");

    /* renamed from: k */
    private static final int f19616k = Util.m29428b("gen");

    /* renamed from: l */
    private static final int f19617l = Util.m29428b("covr");

    /* renamed from: m */
    private static final int f19618m = Util.m29428b("gnre");

    /* renamed from: n */
    private static final int f19619n = Util.m29428b("grp");

    /* renamed from: o */
    private static final int f19620o = Util.m29428b("disk");

    /* renamed from: p */
    private static final int f19621p = Util.m29428b("trkn");

    /* renamed from: q */
    private static final int f19622q = Util.m29428b("tmpo");

    /* renamed from: r */
    private static final int f19623r = Util.m29428b("cpil");

    /* renamed from: s */
    private static final int f19624s = Util.m29428b("aART");

    /* renamed from: t */
    private static final int f19625t = Util.m29428b("sonm");

    /* renamed from: u */
    private static final int f19626u = Util.m29428b("soal");

    /* renamed from: v */
    private static final int f19627v = Util.m29428b("soar");

    /* renamed from: w */
    private static final int f19628w = Util.m29428b("soaa");

    /* renamed from: x */
    private static final int f19629x = Util.m29428b("soco");

    /* renamed from: y */
    private static final int f19630y = Util.m29428b("rtng");

    /* renamed from: z */
    private static final int f19631z = Util.m29428b("pgap");

    /* renamed from: a */
    public static Format m26454a(int i, Format format, Metadata metadata, Metadata metadata2, C8916k kVar) {
        if (i == 1) {
            if (kVar.mo23314a()) {
                format = format.mo22600a(kVar.f19146a, kVar.f19147b);
            }
            if (metadata != null) {
                return format.mo22603a(metadata);
            }
            return format;
        } else if (i != 2 || metadata2 == null) {
            return format;
        } else {
            Format format2 = format;
            for (int i2 = 0; i2 < metadata2.mo22862X(); i2++) {
                C8737b a = metadata2.mo22863a(i2);
                if (a instanceof C8975h) {
                    C8975h hVar = (C8975h) a;
                    if ("com.android.capture.fps".equals(hVar.f19601c) && hVar.f19600W == 23) {
                        try {
                            format2 = format2.mo22598a(ByteBuffer.wrap(hVar.f19598U).asFloatBuffer().get()).mo22603a(new Metadata(hVar));
                        } catch (NumberFormatException unused) {
                            Log.m29500d("MetadataUtil", "Ignoring invalid framerate");
                        }
                    }
                }
            }
            return format2;
        }
    }

    /* renamed from: b */
    public static C8737b m26461b(C9572w wVar) {
        int c = wVar.mo24688c() + wVar.mo24698i();
        int i = wVar.mo24698i();
        int i2 = (i >> 24) & 255;
        if (i2 == 169 || i2 == 253) {
            int i3 = 16777215 & i;
            if (i3 == f19608c) {
                C8766f a = m26456a(i, wVar);
                wVar.mo24693e(c);
                return a;
            }
            if (i3 != f19606a) {
                if (i3 != f19607b) {
                    if (i3 != f19613h) {
                        if (i3 != f19614i) {
                            if (i3 == f19609d) {
                                C8780m b = m26462b(i, "TDRC", wVar);
                                wVar.mo24693e(c);
                                return b;
                            } else if (i3 == f19610e) {
                                C8780m b2 = m26462b(i, "TPE1", wVar);
                                wVar.mo24693e(c);
                                return b2;
                            } else if (i3 == f19611f) {
                                C8780m b3 = m26462b(i, "TSSE", wVar);
                                wVar.mo24693e(c);
                                return b3;
                            } else if (i3 == f19612g) {
                                C8780m b4 = m26462b(i, "TALB", wVar);
                                wVar.mo24693e(c);
                                return b4;
                            } else if (i3 == f19615j) {
                                C8780m b5 = m26462b(i, "USLT", wVar);
                                wVar.mo24693e(c);
                                return b5;
                            } else if (i3 == f19616k) {
                                C8780m b6 = m26462b(i, "TCON", wVar);
                                wVar.mo24693e(c);
                                return b6;
                            } else if (i3 == f19619n) {
                                C8780m b7 = m26462b(i, "TIT1", wVar);
                                wVar.mo24693e(c);
                                return b7;
                            }
                        }
                    }
                    C8780m b8 = m26462b(i, "TCOM", wVar);
                    wVar.mo24693e(c);
                    return b8;
                }
            }
            C8780m b9 = m26462b(i, "TIT2", wVar);
            wVar.mo24693e(c);
            return b9;
        }
        try {
            if (i == f19618m) {
                return m26463c(wVar);
            }
            if (i == f19620o) {
                C8780m a2 = m26459a(i, "TPOS", wVar);
                wVar.mo24693e(c);
                return a2;
            } else if (i == f19621p) {
                C8780m a3 = m26459a(i, "TRCK", wVar);
                wVar.mo24693e(c);
                return a3;
            } else if (i == f19622q) {
                C8773i a4 = m26457a(i, "TBPM", wVar, true, false);
                wVar.mo24693e(c);
                return a4;
            } else if (i == f19623r) {
                C8773i a5 = m26457a(i, "TCMP", wVar, true, true);
                wVar.mo24693e(c);
                return a5;
            } else if (i == f19617l) {
                C8758b a6 = m26455a(wVar);
                wVar.mo24693e(c);
                return a6;
            } else if (i == f19624s) {
                C8780m b10 = m26462b(i, "TPE2", wVar);
                wVar.mo24693e(c);
                return b10;
            } else if (i == f19625t) {
                C8780m b11 = m26462b(i, "TSOT", wVar);
                wVar.mo24693e(c);
                return b11;
            } else if (i == f19626u) {
                C8780m b12 = m26462b(i, "TSO2", wVar);
                wVar.mo24693e(c);
                return b12;
            } else if (i == f19627v) {
                C8780m b13 = m26462b(i, "TSOA", wVar);
                wVar.mo24693e(c);
                return b13;
            } else if (i == f19628w) {
                C8780m b14 = m26462b(i, "TSOP", wVar);
                wVar.mo24693e(c);
                return b14;
            } else if (i == f19629x) {
                C8780m b15 = m26462b(i, "TSOC", wVar);
                wVar.mo24693e(c);
                return b15;
            } else if (i == f19630y) {
                C8773i a7 = m26457a(i, "ITUNESADVISORY", wVar, false, false);
                wVar.mo24693e(c);
                return a7;
            } else if (i == f19631z) {
                C8773i a8 = m26457a(i, "ITUNESGAPLESS", wVar, false, true);
                wVar.mo24693e(c);
                return a8;
            } else if (i == f19602A) {
                C8780m b16 = m26462b(i, "TVSHOWSORT", wVar);
                wVar.mo24693e(c);
                return b16;
            } else if (i == f19603B) {
                C8780m b17 = m26462b(i, "TVSHOW", wVar);
                wVar.mo24693e(c);
                return b17;
            } else if (i == f19604C) {
                C8773i a9 = m26458a(wVar, c);
                wVar.mo24693e(c);
                return a9;
            }
        } finally {
            wVar.mo24693e(c);
        }
        String str = "MetadataUtil";
        StringBuilder sb = new StringBuilder();
        sb.append("Skipped unknown metadata entry: ");
        sb.append(C8958c.m26355a(i));
        Log.m29495a(str, sb.toString());
        wVar.mo24693e(c);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.metadata.p359j.C8780m m26463c(com.google.android.exoplayer2.util.C9572w r3) {
        /*
            int r3 = m26464d(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f19605D
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            com.google.android.exoplayer2.metadata.j.m r1 = new com.google.android.exoplayer2.metadata.j.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.google.android.exoplayer2.util.Log.m29500d(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p371v.C8977i.m26463c(com.google.android.exoplayer2.v0.w):com.google.android.exoplayer2.metadata.j.m");
    }

    /* renamed from: d */
    private static int m26464d(C9572w wVar) {
        wVar.mo24695f(4);
        if (wVar.mo24698i() == C8958c.f19429T0) {
            wVar.mo24695f(8);
            return wVar.mo24711v();
        }
        Log.m29500d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: a */
    public static C8975h m26460a(C9572w wVar, int i, String str) {
        while (true) {
            int c = wVar.mo24688c();
            if (c >= i) {
                return null;
            }
            int i2 = wVar.mo24698i();
            if (wVar.mo24698i() == C8958c.f19429T0) {
                int i3 = wVar.mo24698i();
                int i4 = wVar.mo24698i();
                int i5 = i2 - 16;
                byte[] bArr = new byte[i5];
                wVar.mo24685a(bArr, 0, i5);
                return new C8975h(str, bArr, i4, i3);
            }
            wVar.mo24693e(c + i2);
        }
    }

    /* renamed from: a */
    private static C8766f m26456a(int i, C9572w wVar) {
        int i2 = wVar.mo24698i();
        if (wVar.mo24698i() == C8958c.f19429T0) {
            wVar.mo24695f(8);
            String a = wVar.mo24680a(i2 - 16);
            return new C8766f("und", a, a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse comment attribute: ");
        sb.append(C8958c.m26355a(i));
        Log.m29500d("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: a */
    private static C8773i m26457a(int i, String str, C9572w wVar, boolean z, boolean z2) {
        C8773i iVar;
        int d = m26464d(wVar);
        if (z2) {
            d = Math.min(1, d);
        }
        if (d >= 0) {
            if (z) {
                iVar = new C8780m(str, null, Integer.toString(d));
            } else {
                iVar = new C8766f("und", str, Integer.toString(d));
            }
            return iVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse uint8 attribute: ");
        sb.append(C8958c.m26355a(i));
        Log.m29500d("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: a */
    private static C8780m m26459a(int i, String str, C9572w wVar) {
        int i2 = wVar.mo24698i();
        if (wVar.mo24698i() == C8958c.f19429T0 && i2 >= 22) {
            wVar.mo24695f(10);
            int B = wVar.mo24676B();
            if (B > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(B);
                String sb2 = sb.toString();
                int B2 = wVar.mo24676B();
                if (B2 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(B2);
                    sb2 = sb3.toString();
                }
                return new C8780m(str, null, sb2);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Failed to parse index/count attribute: ");
        sb4.append(C8958c.m26355a(i));
        Log.m29500d("MetadataUtil", sb4.toString());
        return null;
    }

    /* renamed from: a */
    private static C8758b m26455a(C9572w wVar) {
        int i = wVar.mo24698i();
        String str = "MetadataUtil";
        if (wVar.mo24698i() == C8958c.f19429T0) {
            int b = C8958c.m26356b(wVar.mo24698i());
            String str2 = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized cover art flags: ");
                sb.append(b);
                Log.m29500d(str, sb.toString());
                return null;
            }
            wVar.mo24695f(4);
            byte[] bArr = new byte[(i - 16)];
            wVar.mo24685a(bArr, 0, bArr.length);
            return new C8758b(str2, null, 3, bArr);
        }
        Log.m29500d(str, "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: a */
    private static C8773i m26458a(C9572w wVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (wVar.mo24688c() < i) {
            int c = wVar.mo24688c();
            int i4 = wVar.mo24698i();
            int i5 = wVar.mo24698i();
            wVar.mo24695f(4);
            if (i5 == C8958c.f19425R0) {
                str = wVar.mo24680a(i4 - 12);
            } else if (i5 == C8958c.f19427S0) {
                str2 = wVar.mo24680a(i4 - 12);
            } else {
                if (i5 == C8958c.f19429T0) {
                    i2 = c;
                    i3 = i4;
                }
                wVar.mo24695f(i4 - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        wVar.mo24693e(i2);
        wVar.mo24695f(16);
        return new C8774j(str, str2, wVar.mo24680a(i3 - 16));
    }

    /* renamed from: b */
    private static C8780m m26462b(int i, String str, C9572w wVar) {
        int i2 = wVar.mo24698i();
        if (wVar.mo24698i() == C8958c.f19429T0) {
            wVar.mo24695f(8);
            return new C8780m(str, null, wVar.mo24680a(i2 - 16));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse text attribute: ");
        sb.append(C8958c.m26355a(i));
        Log.m29500d("MetadataUtil", sb.toString());
        return null;
    }
}
