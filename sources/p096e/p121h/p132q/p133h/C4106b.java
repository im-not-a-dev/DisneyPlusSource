package p096e.p121h.p132q.p133h;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p096e.p121h.p134r.C4113e;

/* renamed from: e.h.q.h.b */
/* compiled from: LinkifyCompat */
public final class C4106b {

    /* renamed from: a */
    private static final Comparator<C4108b> f10372a = new C4107a();

    /* renamed from: e.h.q.h.b$a */
    /* compiled from: LinkifyCompat */
    static class C4107a implements Comparator<C4108b> {
        C4107a() {
        }

        /* renamed from: a */
        public int compare(C4108b bVar, C4108b bVar2) {
            int i = bVar.f10375c;
            int i2 = bVar2.f10375c;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = bVar.f10376d;
            int i4 = bVar2.f10376d;
            if (i3 < i4) {
                return 1;
            }
            if (i3 > i4) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: e.h.q.h.b$b */
    /* compiled from: LinkifyCompat */
    private static class C4108b {

        /* renamed from: a */
        URLSpan f10373a;

        /* renamed from: b */
        String f10374b;

        /* renamed from: c */
        int f10375c;

        /* renamed from: d */
        int f10376d;

        C4108b() {
        }
    }

    /* renamed from: a */
    public static boolean m14080a(Spannable spannable, int i) {
        if (m14079a()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            m14078a(arrayList, spannable, C4113e.f10387g, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            m14078a(arrayList, spannable, C4113e.f10388h, new String[]{"mailto:"}, null, null);
        }
        if ((i & 8) != 0) {
            m14077a(arrayList, spannable);
        }
        m14081b(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4108b bVar = (C4108b) it.next();
            if (bVar.f10373a == null) {
                m14076a(bVar.f10374b, bVar.f10375c, bVar.f10376d, spannable);
            }
        }
        return true;
    }

    /* renamed from: b */
    private static void m14081b(ArrayList<C4108b> arrayList, Spannable spannable) {
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            C4108b bVar = new C4108b();
            bVar.f10373a = uRLSpanArr[i2];
            bVar.f10375c = spannable.getSpanStart(uRLSpanArr[i2]);
            bVar.f10376d = spannable.getSpanEnd(uRLSpanArr[i2]);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f10372a);
        int size = arrayList.size();
        while (i < size - 1) {
            C4108b bVar2 = (C4108b) arrayList.get(i);
            int i3 = i + 1;
            C4108b bVar3 = (C4108b) arrayList.get(i3);
            int i4 = bVar2.f10375c;
            int i5 = bVar3.f10375c;
            if (i4 <= i5) {
                int i6 = bVar2.f10376d;
                if (i6 > i5) {
                    int i7 = bVar3.f10376d;
                    int i8 = (i7 > i6 && i6 - i4 <= i7 - i5) ? i6 - i4 < i7 - i5 ? i : -1 : i3;
                    if (i8 != -1) {
                        URLSpan uRLSpan = ((C4108b) arrayList.get(i8)).f10373a;
                        if (uRLSpan != null) {
                            spannable.removeSpan(uRLSpan);
                        }
                        arrayList.remove(i8);
                        size--;
                    }
                }
            }
            i = i3;
        }
    }

    /* renamed from: a */
    private static boolean m14079a() {
        return VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    private static String m14075a(String str, String[] strArr, Matcher matcher, TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int i = 0;
        while (true) {
            z = true;
            if (i >= strArr.length) {
                z = false;
                break;
            }
            if (str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr[i]);
                    sb.append(str.substring(strArr[i].length()));
                    str = sb.toString();
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strArr[0]);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    private static void m14078a(ArrayList<C4108b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, MatchFilter matchFilter, TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                C4108b bVar = new C4108b();
                bVar.f10374b = m14075a(matcher.group(0), strArr, matcher, transformFilter);
                bVar.f10375c = start;
                bVar.f10376d = end;
                arrayList.add(bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m14076a(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:14:0x0005, LOOP_START, PHI: r0 r6 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x0005] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m14077a(java.util.ArrayList<p096e.p121h.p132q.p133h.C4106b.C4108b> r5, android.text.Spannable r6) {
        /*
            java.lang.String r6 = r6.toString()
            r0 = 0
        L_0x0005:
            java.lang.String r1 = m14074a(r6)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r1 == 0) goto L_0x0043
            int r2 = r6.indexOf(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r2 >= 0) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            e.h.q.h.b$b r3 = new e.h.q.h.b$b     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r1.length()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.f10375c = r2     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r0 = r0 + r4
            r3.f10376d = r0     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r6 = r6.substring(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0005 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.append(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.f10374b = r1     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r5.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            goto L_0x0005
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p132q.p133h.C4106b.m14077a(java.util.ArrayList, android.text.Spannable):void");
    }

    /* renamed from: a */
    private static String m14074a(String str) {
        if (VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return C4104a.m14069b(str);
    }
}
