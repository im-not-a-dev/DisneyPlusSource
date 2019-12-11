package p161f.p162a;

import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import com.facebook.stetho.server.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f.a.d2 */
public class C4423d2 {
    /* renamed from: a */
    public Map<String, String> mo15494a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put(HttpHeaders.CONTENT_TYPE, DefaultLegalApi.MIME_TYPE_JSON);
        return hashMap;
    }
}
