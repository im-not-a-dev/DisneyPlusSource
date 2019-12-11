package com.appboy.push.p028e;

import android.os.Build.VERSION;
import android.text.Html;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;

/* renamed from: com.appboy.push.e.a */
/* compiled from: HtmlUtils */
public class C1526a {

    /* renamed from: a */
    private static final String f5566a = C1557c.m7461a(C1526a.class);

    /* renamed from: a */
    public static CharSequence m7238a(C1489b bVar, String str) {
        if (C1563i.m7490d(str)) {
            C1557c.m7458a(f5566a, "Cannot create html spanned text on null or empty text. Returning blank string.");
            return str;
        } else if (!bVar.mo6722o()) {
            return str;
        } else {
            if (VERSION.SDK_INT >= 24) {
                return Html.fromHtml(str, 0);
            }
            return Html.fromHtml(str);
        }
    }
}
