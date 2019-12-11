package p161f.p162a;

import android.net.Uri;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.b2 */
public final class C4405b2 extends C4638z1 {

    /* renamed from: j0 */
    private static final String f10968j0 = C1557c.m7461a(C4405b2.class);

    /* renamed from: g0 */
    private final long f10969g0;

    /* renamed from: h0 */
    private final long f10970h0;

    /* renamed from: i0 */
    private final String f10971i0;

    public C4405b2(String str, long j, long j2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("content_cards/sync");
        super(Uri.parse(sb.toString()), null);
        this.f10969g0 = j;
        this.f10970h0 = j2;
        this.f10971i0 = str2;
    }

    /* renamed from: a */
    public void mo15458a(C4419d dVar, C4596u1 u1Var) {
        C1557c.m7458a(f10968j0, "ContentCardsSyncRequest executed successfully.");
    }

    /* renamed from: b */
    public C4601u6 mo15460b() {
        return C4601u6.POST;
    }

    /* renamed from: g */
    public boolean mo15461g() {
        return false;
    }

    /* renamed from: i */
    public JSONObject mo15462i() {
        JSONObject i = super.mo15462i();
        if (i == null) {
            return null;
        }
        try {
            i.put("last_full_sync_at", this.f10970h0);
            i.put("last_card_updated_at", this.f10969g0);
            if (!C1563i.m7490d(this.f10971i0)) {
                i.put("user_id", this.f10971i0);
            }
            return i;
        } catch (JSONException e) {
            C1557c.m7474e(f10968j0, "Experienced JSONException while creating Content Cards request. Returning null.", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo15459a(Map<String, String> map) {
        super.mo15459a(map);
        String str = "true";
        map.put("X-Braze-DataRequest", str);
        map.put("X-Braze-ContentCardsRequest", str);
    }
}
