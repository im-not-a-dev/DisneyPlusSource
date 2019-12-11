package p163g.p449j.p450a.p451a.p457d.p464g;

import android.net.Uri;

/* renamed from: g.j.a.a.d.g.s1 */
public final class C11298s1 {
    /* renamed from: a */
    public static Uri m36065a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        String str2 = "content://com.google.android.gms.phenotype/";
        return Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
