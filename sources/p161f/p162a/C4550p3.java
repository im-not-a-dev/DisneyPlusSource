package p161f.p162a;

import android.net.Uri;
import com.appboy.p033s.C1557c;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* renamed from: f.a.p3 */
public final class C4550p3 {

    /* renamed from: a */
    private static final String f11333a = C1557c.m7461a(C4550p3.class);

    /* renamed from: a */
    public static URI m15815a(Uri uri) {
        try {
            return new URI(uri.toString());
        } catch (URISyntaxException unused) {
            String str = f11333a;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create URI from uri [");
            sb.append(uri.toString());
            sb.append("]");
            C1557c.m7465b(str, sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static URL m15816a(URI uri) {
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            String str = f11333a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to parse URI [");
            sb.append(e.getMessage());
            sb.append("]");
            C1557c.m7470c(str, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m15814a(Object... objArr) {
        long j = 1;
        for (Object hashCode : objArr) {
            int hashCode2 = hashCode.hashCode();
            j *= hashCode2 == 0 ? 1 : (long) hashCode2;
        }
        return Long.toHexString(j);
    }
}
