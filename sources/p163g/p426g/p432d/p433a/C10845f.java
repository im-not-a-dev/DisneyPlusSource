package p163g.p426g.p432d.p433a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import p163g.p426g.p427a.p429j.C10827a;
import p163g.p426g.p427a.p429j.C10833g;

/* renamed from: g.g.d.a.f */
/* compiled from: AndroidStorageInterface */
public class C10845f implements C10833g {

    /* renamed from: a */
    private Context f25633a = null;

    public C10845f(Context context) {
        this.f25633a = context;
    }

    /* renamed from: a */
    public void mo27909a(String str, String str2, String str3, C10827a aVar) {
        Editor edit = this.f25633a.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        if (edit.commit()) {
            aVar.mo27892a(true, str3);
        } else {
            aVar.mo27892a(false, "Failed to write data");
        }
    }

    /* renamed from: a */
    public void mo27908a(String str, String str2, C10827a aVar) {
        try {
            aVar.mo27892a(true, this.f25633a.getSharedPreferences(str, 0).getString(str2, null));
        } catch (Exception e) {
            aVar.mo27892a(false, e.toString());
        }
    }
}
