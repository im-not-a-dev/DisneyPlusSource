package p161f.p162a;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.appboy.p033s.C1557c;

/* renamed from: f.a.j0 */
public class C4477j0 {

    /* renamed from: c */
    private static final String f11110c = C1557c.m7461a(C4477j0.class);

    /* renamed from: a */
    private final Context f11111a;

    /* renamed from: b */
    private final C4628y0 f11112b;

    public C4477j0(Context context, C4628y0 y0Var) {
        this.f11111a = context;
        this.f11112b = y0Var;
    }

    /* renamed from: b */
    private static boolean m15498b() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Exception unused) {
            C1557c.m7469c(f11110c, "com.amazon.device.messaging.ADM not found");
            return false;
        }
    }

    /* renamed from: a */
    public void mo15632a() {
        if (this.f11112b.mo15916a() != null) {
            C1557c.m7469c(f11110c, "The device is already registered with the ADM server and is eligible to receive ADM messages.");
            String str = f11110c;
            StringBuilder sb = new StringBuilder();
            sb.append("ADM registration id: ");
            sb.append(this.f11112b.mo15916a());
            C1557c.m7469c(str, sb.toString());
            C4628y0 y0Var = this.f11112b;
            y0Var.mo15917a(y0Var.mo15916a());
            return;
        }
        ADM adm = new ADM(this.f11111a);
        if (adm.isSupported()) {
            C1557c.m7469c(f11110c, "Registering with ADM server...");
            adm.startRegister();
        }
    }

    /* renamed from: b */
    private static boolean m15499b(Context context) {
        try {
            ADMManifest.checkManifestAuthoredProperly(context);
            return true;
        } catch (Exception e) {
            C1557c.m7469c(f11110c, "Manifest not authored properly to support ADM.");
            C1557c.m7472d(f11110c, "ADM manifest exception: ", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15497a(Context context) {
        return m15498b() && m15499b(context);
    }
}
