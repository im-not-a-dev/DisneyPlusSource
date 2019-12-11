package p161f.p162a;

import com.appboy.p033s.C1557c;
import org.json.JSONException;

/* renamed from: f.a.a */
public class C4379a implements C4413c1 {

    /* renamed from: a */
    private static final String f10906a = C1557c.m7461a(C4379a.class);

    /* renamed from: a */
    public C4432e1 mo15389a(String str) {
        try {
            return C4548p1.m15786d(str);
        } catch (JSONException e) {
            String str2 = f10906a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create Content Cards impression event for card: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    public C4432e1 mo15390b(String str) {
        try {
            return C4548p1.m15788e(str);
        } catch (JSONException e) {
            String str2 = f10906a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create Content Cards control impression event for card: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: c */
    public C4432e1 mo15391c(String str) {
        try {
            return C4548p1.m15790g(str);
        } catch (JSONException e) {
            String str2 = f10906a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create Content Cards dismissed event for card: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: e */
    public C4548p1 mo15392d(String str) {
        try {
            return C4548p1.m15789f(str);
        } catch (JSONException e) {
            String str2 = f10906a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create Content Cards click event for card: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return null;
        }
    }
}
