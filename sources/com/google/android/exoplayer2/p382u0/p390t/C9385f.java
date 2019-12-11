package com.google.android.exoplayer2.p382u0.p390t;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.p382u0.p390t.C9382e.C9384b;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.u0.t.f */
/* compiled from: WebvttCueParser */
public final class C9385f {

    /* renamed from: b */
    public static final Pattern f21654b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c */
    private static final Pattern f21655c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a */
    private final StringBuilder f21656a = new StringBuilder();

    /* renamed from: com.google.android.exoplayer2.u0.t.f$a */
    /* compiled from: WebvttCueParser */
    private static final class C9386a {

        /* renamed from: e */
        private static final String[] f21657e = new String[0];

        /* renamed from: a */
        public final String f21658a;

        /* renamed from: b */
        public final int f21659b;

        /* renamed from: c */
        public final String f21660c;

        /* renamed from: d */
        public final String[] f21661d;

        private C9386a(String str, int i, String str2, String[] strArr) {
            this.f21659b = i;
            this.f21658a = str;
            this.f21660c = str2;
            this.f21661d = strArr;
        }

        /* renamed from: a */
        public static C9386a m28709a(String str, int i) {
            String str2;
            String[] strArr;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a = Util.m29423a(trim, "\\.");
            String str3 = a[0];
            if (a.length > 1) {
                strArr = (String[]) Arrays.copyOfRange(a, 1, a.length);
            } else {
                strArr = f21657e;
            }
            return new C9386a(str3, i, str2, strArr);
        }

        /* renamed from: a */
        public static C9386a m28708a() {
            String str = "";
            return new C9386a(str, 0, str, new String[0]);
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.t.f$b */
    /* compiled from: WebvttCueParser */
    private static final class C9387b implements Comparable<C9387b> {

        /* renamed from: U */
        public final C9381d f21662U;

        /* renamed from: c */
        public final int f21663c;

        public C9387b(int i, C9381d dVar) {
            this.f21663c = i;
            this.f21662U = dVar;
        }

        /* renamed from: a */
        public int compareTo(C9387b bVar) {
            return this.f21663c - bVar.f21663c;
        }
    }

    /* renamed from: b */
    private static void m28702b(String str, C9384b bVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.mo24247a(m28704c(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.mo24247a(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            bVar.mo24246a(C9389h.m28715a(str));
            bVar.mo24253b(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        bVar.mo24246a((float) parseInt);
        bVar.mo24253b(1);
    }

    /* renamed from: c */
    private static void m28705c(String str, C9384b bVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.mo24257c(m28704c(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.mo24257c(Integer.MIN_VALUE);
        }
        bVar.mo24252b(C9389h.m28715a(str));
    }

    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment m28706d(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -1074341483: goto L_0x0035;
                case 100571: goto L_0x002b;
                case 3317767: goto L_0x0021;
                case 108511772: goto L_0x0017;
                case 109757538: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0074
            if (r0 == r4) goto L_0x0071
            if (r0 == r3) goto L_0x0071
            if (r0 == r2) goto L_0x006e
            if (r0 == r1) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid alignment value: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.m29500d(r0, r6)
            r6 = 0
            return r6
        L_0x006e:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r6
        L_0x0071:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            return r6
        L_0x0074:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p390t.C9385f.m28706d(java.lang.String):android.text.Layout$Alignment");
    }

    /* renamed from: a */
    public boolean mo24258a(C9572w wVar, C9384b bVar, List<C9381d> list) {
        String k = wVar.mo24700k();
        if (k == null) {
            return false;
        }
        Matcher matcher = f21654b.matcher(k);
        if (matcher.matches()) {
            return m28701a(null, matcher, wVar, bVar, this.f21656a, list);
        }
        String k2 = wVar.mo24700k();
        if (k2 == null) {
            return false;
        }
        Matcher matcher2 = f21654b.matcher(k2);
        if (!matcher2.matches()) {
            return false;
        }
        return m28701a(k.trim(), matcher2, wVar, bVar, this.f21656a, list);
    }

    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m28704c(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002a;
                case -1074341483: goto L_0x0020;
                case 100571: goto L_0x0016;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            if (r0 == r4) goto L_0x0057
            if (r0 == r3) goto L_0x0057
            if (r0 == r2) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.m29500d(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0056:
            return r3
        L_0x0057:
            return r4
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p390t.C9385f.m28704c(java.lang.String):int");
    }

    /* renamed from: a */
    static void m28697a(String str, C9384b bVar) {
        String str2 = "WebvttCueParser";
        Matcher matcher = f21655c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    m28702b(group2, bVar);
                } else if ("align".equals(group)) {
                    bVar.mo24249a(m28706d(group2));
                } else if ("position".equals(group)) {
                    m28705c(group2, bVar);
                } else if ("size".equals(group)) {
                    bVar.mo24256c(C9389h.m28715a(group2));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Log.m29500d(str2, sb.toString());
                }
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipping bad cue setting: ");
                sb2.append(matcher.group());
                Log.m29500d(str2, sb2.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m28703b(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 98
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 99
            if (r0 == r1) goto L_0x004c
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x0042
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L_0x0038
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x002e
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x0024
            goto L_0x0060
        L_0x0024:
            java.lang.String r0 = "v"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 5
            goto L_0x0061
        L_0x002e:
            java.lang.String r0 = "u"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 4
            goto L_0x0061
        L_0x0038:
            java.lang.String r0 = "lang"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 3
            goto L_0x0061
        L_0x0042:
            java.lang.String r0 = "i"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r0 = "c"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r0 = "b"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 0
            goto L_0x0061
        L_0x0060:
            r8 = -1
        L_0x0061:
            if (r8 == 0) goto L_0x006e
            if (r8 == r7) goto L_0x006e
            if (r8 == r6) goto L_0x006e
            if (r8 == r5) goto L_0x006e
            if (r8 == r4) goto L_0x006e
            if (r8 == r3) goto L_0x006e
            return r2
        L_0x006e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p390t.C9385f.m28703b(java.lang.String):boolean");
    }

    /* renamed from: a */
    static void m28699a(String str, String str2, C9384b bVar, List<C9381d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m28696a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m28693a(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    String a = m28694a(substring);
                    if (a != null && m28703b(a)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                C9386a aVar = (C9386a) arrayDeque.pop();
                                m28698a(str, aVar, spannableStringBuilder, list, arrayList);
                                if (aVar.f21658a.equals(a)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(C9386a.m28709a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m28698a(str, (C9386a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        m28698a(str, C9386a.m28708a(), spannableStringBuilder, list, arrayList);
        bVar.mo24250a(spannableStringBuilder);
    }

    /* renamed from: a */
    private static boolean m28701a(String str, Matcher matcher, C9572w wVar, C9384b bVar, StringBuilder sb, List<C9381d> list) {
        try {
            bVar.mo24254b(C9389h.m28717b(matcher.group(1)));
            bVar.mo24248a(C9389h.m28717b(matcher.group(2)));
            m28697a(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String k = wVar.mo24700k();
                if (!TextUtils.isEmpty(k)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(k.trim());
                } else {
                    m28699a(str, sb.toString(), bVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            Log.m29500d("WebvttCueParser", sb2.toString());
            return false;
        }
    }

    /* renamed from: a */
    private static int m28693a(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m28696a(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002e
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0079
            if (r0 == r4) goto L_0x0073
            if (r0 == r3) goto L_0x006d
            if (r0 == r2) goto L_0x0067
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = ";'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.m29500d(r6, r5)
            goto L_0x007e
        L_0x0067:
            r5 = 38
            r6.append(r5)
            goto L_0x007e
        L_0x006d:
            r5 = 32
            r6.append(r5)
            goto L_0x007e
        L_0x0073:
            r5 = 62
            r6.append(r5)
            goto L_0x007e
        L_0x0079:
            r5 = 60
            r6.append(r5)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p390t.C9385f.m28696a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009e A[LOOP:0: B:43:0x009c->B:44:0x009e, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m28698a(java.lang.String r8, com.google.android.exoplayer2.p382u0.p390t.C9385f.C9386a r9, android.text.SpannableStringBuilder r10, java.util.List<com.google.android.exoplayer2.p382u0.p390t.C9381d> r11, java.util.List<com.google.android.exoplayer2.p382u0.p390t.C9385f.C9387b> r12) {
        /*
            int r0 = r9.f21659b
            int r1 = r10.length()
            java.lang.String r2 = r9.f21658a
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0067
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L_0x005d
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L_0x0053
            r7 = 98
            if (r3 == r7) goto L_0x0049
            r7 = 99
            if (r3 == r7) goto L_0x003f
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L_0x0035
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x002b
            goto L_0x0071
        L_0x002b:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 5
            goto L_0x0072
        L_0x0035:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 2
            goto L_0x0072
        L_0x003f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 3
            goto L_0x0072
        L_0x0049:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 0
            goto L_0x0072
        L_0x0053:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 4
            goto L_0x0072
        L_0x005d:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 1
            goto L_0x0072
        L_0x0067:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 6
            goto L_0x0072
        L_0x0071:
            r2 = -1
        L_0x0072:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0081;
                case 2: goto L_0x0078;
                case 3: goto L_0x0092;
                case 4: goto L_0x0092;
                case 5: goto L_0x0092;
                case 6: goto L_0x0092;
                default: goto L_0x0077;
            }
        L_0x0077:
            return
        L_0x0078:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r10.setSpan(r2, r0, r1, r3)
            goto L_0x0092
        L_0x0081:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            r10.setSpan(r2, r0, r1, r3)
            goto L_0x0092
        L_0x008a:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
            r10.setSpan(r2, r0, r1, r3)
        L_0x0092:
            r12.clear()
            m28700a(r11, r8, r9, r12)
            int r8 = r12.size()
        L_0x009c:
            if (r4 >= r8) goto L_0x00ac
            java.lang.Object r9 = r12.get(r4)
            com.google.android.exoplayer2.u0.t.f$b r9 = (com.google.android.exoplayer2.p382u0.p390t.C9385f.C9387b) r9
            com.google.android.exoplayer2.u0.t.d r9 = r9.f21662U
            m28695a(r10, r9, r0, r1)
            int r4 = r4 + 1
            goto L_0x009c
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p390t.C9385f.m28698a(java.lang.String, com.google.android.exoplayer2.u0.t.f$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* renamed from: a */
    private static void m28695a(SpannableStringBuilder spannableStringBuilder, C9381d dVar, int i, int i2) {
        if (dVar != null) {
            if (dVar.mo24238f() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(dVar.mo24238f()), i, i2, 33);
            }
            if (dVar.mo24242j()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.mo24243k()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.mo24241i()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.mo24228b()), i, i2, 33);
            }
            if (dVar.mo24240h()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.mo24222a()), i, i2, 33);
            }
            if (dVar.mo24233c() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(dVar.mo24233c()), i, i2, 33);
            }
            if (dVar.mo24239g() != null) {
                spannableStringBuilder.setSpan(new Standard(dVar.mo24239g()), i, i2, 33);
            }
            int e = dVar.mo24237e();
            if (e == 1) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) dVar.mo24235d(), true), i, i2, 33);
            } else if (e == 2) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.mo24235d()), i, i2, 33);
            } else if (e == 3) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.mo24235d() / 100.0f), i, i2, 33);
            }
        }
    }

    /* renamed from: a */
    private static String m28694a(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return Util.m29437b(trim, "[ \\.]")[0];
    }

    /* renamed from: a */
    private static void m28700a(List<C9381d> list, String str, C9386a aVar, List<C9387b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9381d dVar = (C9381d) list.get(i);
            int a = dVar.mo24223a(str, aVar.f21658a, aVar.f21661d, aVar.f21660c);
            if (a > 0) {
                list2.add(new C9387b(a, dVar));
            }
        }
        Collections.sort(list2);
    }
}
