package p096e.p121h.p132q;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: e.h.q.b */
/* compiled from: HtmlCompat */
public final class C4090b {
    /* renamed from: a */
    public static Spanned m14039a(String str, int i) {
        if (VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
