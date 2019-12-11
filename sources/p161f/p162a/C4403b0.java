package p161f.p162a;

import com.appboy.p033s.C1557c;
import org.json.JSONException;

/* renamed from: f.a.b0 */
public class C4403b0 implements C4413c1 {

    /* renamed from: a */
    private static final String f10966a = C1557c.m7461a(C4403b0.class);

    /* renamed from: a */
    public C4432e1 mo15389a(String str) {
        try {
            return C4548p1.m15778b(str);
        } catch (JSONException e) {
            String str2 = f10966a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create feed card impression event for card: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    public C4432e1 mo15390b(String str) {
        String str2 = f10966a;
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create card control event for Feed card. Returning null. Card id: ");
        sb.append(str);
        C1557c.m7473e(str2, sb.toString());
        return null;
    }

    /* renamed from: c */
    public C4432e1 mo15391c(String str) {
        String str2 = f10966a;
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create card dismissed event for Feed card. Returning null. Card id: ");
        sb.append(str);
        C1557c.m7473e(str2, sb.toString());
        return null;
    }

    /* renamed from: d */
    public C4432e1 mo15392d(String str) {
        try {
            return C4548p1.m15782c(str);
        } catch (JSONException e) {
            String str2 = f10966a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create feed card click event for card: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return null;
        }
    }
}
