package p161f.p162a;

import android.net.Uri;
import java.util.Map;

/* renamed from: f.a.l2 */
public abstract class C4500l2 implements C4471i2 {

    /* renamed from: U */
    public final Uri f11163U;

    /* renamed from: c */
    private Map<String, String> f11164c;

    protected C4500l2(Uri uri, Map<String, String> map) {
        this.f11164c = map;
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append(mo15670j());
        this.f11163U = Uri.parse(sb.toString());
    }

    /* renamed from: j */
    public String mo15670j() {
        Map<String, String> map = this.f11164c;
        if (map == null || map.size() == 0) {
            return "";
        }
        String str = "?";
        for (String str2 : this.f11164c.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append("=");
            sb.append((String) this.f11164c.get(str2));
            sb.append("&");
            str = sb.toString();
        }
        return str.substring(0, str.length() - 1);
    }
}
