package com.google.android.exoplayer2.p382u0.p390t;

import android.text.TextUtils;
import com.google.android.exoplayer2.p393v0.C9546i;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.u0.t.a */
/* compiled from: CssParser */
final class C9378a {

    /* renamed from: c */
    private static final Pattern f21616c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    private final C9572w f21617a = new C9572w();

    /* renamed from: b */
    private final StringBuilder f21618b = new StringBuilder();

    /* renamed from: b */
    static String m28639b(C9572w wVar, StringBuilder sb) {
        m28646f(wVar);
        if (wVar.mo24679a() == 0) {
            return null;
        }
        String a = m28636a(wVar, sb);
        String str = "";
        if (!str.equals(a)) {
            return a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append((char) wVar.mo24711v());
        return sb2.toString();
    }

    /* renamed from: c */
    private static boolean m28642c(C9572w wVar) {
        char a = m28635a(wVar, wVar.mo24688c());
        if (a != 9 && a != 10 && a != 12 && a != 13 && a != ' ') {
            return false;
        }
        wVar.mo24695f(1);
        return true;
    }

    /* renamed from: d */
    private static String m28644d(C9572w wVar, StringBuilder sb) {
        m28646f(wVar);
        if (wVar.mo24679a() < 5) {
            return null;
        }
        if (!"::cue".equals(wVar.mo24687b(5))) {
            return null;
        }
        int c = wVar.mo24688c();
        String b = m28639b(wVar, sb);
        if (b == null) {
            return null;
        }
        if ("{".equals(b)) {
            wVar.mo24693e(c);
            return "";
        }
        String d = "(".equals(b) ? m28643d(wVar) : null;
        String b2 = m28639b(wVar, sb);
        if (!")".equals(b2) || b2 == null) {
            return null;
        }
        return d;
    }

    /* renamed from: e */
    static void m28645e(C9572w wVar) {
        do {
        } while (!TextUtils.isEmpty(wVar.mo24700k()));
    }

    /* renamed from: f */
    static void m28646f(C9572w wVar) {
        while (true) {
            boolean z = true;
            while (wVar.mo24679a() > 0 && z) {
                if (!m28642c(wVar) && !m28640b(wVar)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public List<C9381d> mo24221a(C9572w wVar) {
        String str;
        this.f21618b.setLength(0);
        int c = wVar.mo24688c();
        m28645e(wVar);
        this.f21617a.mo24684a(wVar.f22333a, wVar.mo24688c());
        this.f21617a.mo24693e(c);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d = m28644d(this.f21617a, this.f21618b);
            if (d == null) {
                return arrayList;
            }
            if (!"{".equals(m28639b(this.f21617a, this.f21618b))) {
                return arrayList;
            }
            C9381d dVar = new C9381d();
            m28637a(dVar, d);
            String str2 = null;
            boolean z = false;
            while (true) {
                str = "}";
                if (z) {
                    break;
                }
                int c2 = this.f21617a.mo24688c();
                str2 = m28639b(this.f21617a, this.f21618b);
                boolean z2 = str2 == null || str.equals(str2);
                if (!z2) {
                    this.f21617a.mo24693e(c2);
                    m28638a(this.f21617a, dVar, this.f21618b);
                }
                z = z2;
            }
            if (str.equals(str2)) {
                arrayList.add(dVar);
            }
        }
    }

    /* renamed from: c */
    private static String m28641c(C9572w wVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c = wVar.mo24688c();
            String b = m28639b(wVar, sb);
            if (b == null) {
                return null;
            }
            if ("}".equals(b) || ";".equals(b)) {
                wVar.mo24693e(c);
                z = true;
            } else {
                sb2.append(b);
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private static boolean m28640b(C9572w wVar) {
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        byte[] bArr = wVar.f22333a;
        if (c + 2 <= d) {
            int i = c + 1;
            if (bArr[c] == 47) {
                int i2 = i + 1;
                if (bArr[i] == 42) {
                    while (true) {
                        int i3 = i2 + 1;
                        if (i3 >= d) {
                            wVar.mo24695f(d - wVar.mo24688c());
                            return true;
                        } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                            i2 = i3 + 1;
                            d = i2;
                        } else {
                            i2 = i3;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private static String m28643d(C9572w wVar) {
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        boolean z = false;
        while (c < d && !z) {
            int i = c + 1;
            z = ((char) wVar.f22333a[c]) == ')';
            c = i;
        }
        return wVar.mo24687b((c - 1) - wVar.mo24688c()).trim();
    }

    /* renamed from: a */
    private static void m28638a(C9572w wVar, C9381d dVar, StringBuilder sb) {
        m28646f(wVar);
        String a = m28636a(wVar, sb);
        String str = "";
        if (!str.equals(a)) {
            if (":".equals(m28639b(wVar, sb))) {
                m28646f(wVar);
                String c = m28641c(wVar, sb);
                if (c != null && !str.equals(c)) {
                    int c2 = wVar.mo24688c();
                    String b = m28639b(wVar, sb);
                    if (!";".equals(b)) {
                        if ("}".equals(b)) {
                            wVar.mo24693e(c2);
                        }
                    }
                    if ("color".equals(a)) {
                        dVar.mo24229b(C9546i.m29355a(c));
                    } else if ("background-color".equals(a)) {
                        dVar.mo24224a(C9546i.m29355a(c));
                    } else if ("text-decoration".equals(a)) {
                        if ("underline".equals(c)) {
                            dVar.mo24232c(true);
                        }
                    } else if ("font-family".equals(a)) {
                        dVar.mo24225a(c);
                    } else if ("font-weight".equals(a)) {
                        if ("bold".equals(c)) {
                            dVar.mo24226a(true);
                        }
                    } else if ("font-style".equals(a) && "italic".equals(c)) {
                        dVar.mo24230b(true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static char m28635a(C9572w wVar, int i) {
        return (char) wVar.f22333a[i];
    }

    /* renamed from: a */
    private static String m28636a(C9572w wVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        while (c < d && !z) {
            char c2 = (char) wVar.f22333a[c];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                c++;
                sb.append(c2);
            }
        }
        wVar.mo24695f(c - wVar.mo24688c());
        return sb.toString();
    }

    /* renamed from: a */
    private void m28637a(C9381d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f21616c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.mo24236d(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] a = C9554k0.m29423a(str, "\\.");
            String str2 = a[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.mo24234c(str2.substring(0, indexOf2));
                dVar.mo24231b(str2.substring(indexOf2 + 1));
            } else {
                dVar.mo24234c(str2);
            }
            if (a.length > 1) {
                dVar.mo24227a((String[]) Arrays.copyOfRange(a, 1, a.length));
            }
        }
    }
}
