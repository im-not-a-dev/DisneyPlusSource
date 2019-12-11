package p161f.p162a;

import android.content.Context;
import com.appboy.C1440a;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: f.a.t0 */
public class C4587t0 {

    /* renamed from: b */
    private static final String f11434b = C1557c.m7461a(C4587t0.class);

    /* renamed from: c */
    private static final String[] f11435c = {"com.google.firebase.iid.FirebaseInstanceId"};

    /* renamed from: a */
    private final Context f11436a;

    public C4587t0(Context context) {
        this.f11436a = context;
    }

    /* renamed from: b */
    private static String m15917b(String str) {
        String str2 = f11434b;
        StringBuilder sb = new StringBuilder();
        sb.append("Registering for Firebase Cloud Messaging token using sender id: ");
        sb.append(str);
        C1557c.m7471d(str2, sb.toString());
        try {
            String token = FirebaseInstanceId.getInstance().getToken(str, "FCM");
            String str3 = f11434b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Obtained Firebase Cloud Messaging token: ");
            sb2.append(token);
            C1557c.m7471d(str3, sb2.toString());
            return token;
        } catch (Exception e) {
            String str4 = f11434b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to register for Firebase Cloud Messaging using sender ID: ");
            sb3.append(str);
            C1557c.m7470c(str4, sb3.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo15833a(String str) {
        String b = m15917b(str);
        if (!C1563i.m7491e(b)) {
            C1440a.m6921c(this.f11436a).mo6582d(b);
        } else {
            C1557c.m7473e(f11434b, "Obtained an empty or null Firebase Cloud Messaging registration token. Not registering token.");
        }
    }

    /* renamed from: a */
    public static boolean m15916a(Context context, C1489b bVar) {
        String[] strArr;
        if (C1563i.m7491e(bVar.mo6716i())) {
            C1557c.m7473e(f11434b, "Firebase Cloud Messaging requires a non-null and non-empty sender ID.");
            return false;
        } else if (!C4522n3.m15656b(context)) {
            C1557c.m7473e(f11434b, "Firebase Cloud Messaging requires the Google Play Store to be installed.");
            return false;
        } else {
            try {
                ClassLoader classLoader = C4587t0.class.getClassLoader();
                for (String str : f11435c) {
                    if (Class.forName(str, false, classLoader) == null) {
                        String str2 = f11434b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Automatic registration for Firebase Cloud Messaging requires the following class to be present: ");
                        sb.append(str);
                        C1557c.m7473e(str2, sb.toString());
                        return false;
                    }
                }
                return true;
            } catch (Exception e) {
                C1557c.m7470c(f11434b, "Caught error while checking for required classes for Firebase Cloud Messaging.", e);
                return false;
            }
        }
    }
}
