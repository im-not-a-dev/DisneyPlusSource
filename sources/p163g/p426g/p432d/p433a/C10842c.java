package p163g.p426g.p432d.p433a;

import android.util.Log;
import p163g.p426g.p427a.C10817h.C10818a;
import p163g.p426g.p427a.p429j.C10831e;

/* renamed from: g.g.d.a.c */
/* compiled from: AndroidLoggingInterface */
public class C10842c implements C10831e {
    /* renamed from: a */
    public void mo27898a(String str, C10818a aVar) {
        String str2 = "CONVIVA";
        if (aVar == C10818a.DEBUG) {
            Log.d(str2, str);
        } else if (aVar == C10818a.ERROR) {
            Log.e(str2, str);
        } else if (aVar == C10818a.INFO) {
            Log.i(str2, str);
        } else if (aVar == C10818a.WARNING) {
            Log.w(str2, str);
        }
    }
}
