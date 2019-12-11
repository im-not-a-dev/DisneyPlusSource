package com.appboy.p025o;

import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p161f.p162a.C4569r3;

/* renamed from: com.appboy.o.c */
public enum C1494c {
    ID(r1, r1),
    VIEWED("viewed", "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS("extras", "e"),
    OPEN_URI_IN_WEBVIEW("use_webview", "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", null),
    UPDATED("updated", null),
    DISMISSED(null, "d"),
    REMOVED(null, "r"),
    PINNED(null, "p"),
    DISMISSIBLE(null, "db"),
    READ(null, "read"),
    CLICKED(null, "cl"),
    BANNER_IMAGE_IMAGE(r6, r5),
    BANNER_IMAGE_URL(r8, r7),
    BANNER_IMAGE_DOMAIN(r9, null),
    BANNER_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE(r6, r5),
    CAPTIONED_IMAGE_TITLE(r10, r4),
    CAPTIONED_IMAGE_DESCRIPTION(r12, r11),
    CAPTIONED_IMAGE_URL(r8, r7),
    CAPTIONED_IMAGE_DOMAIN(r9, r13),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE(r10, r4),
    TEXT_ANNOUNCEMENT_DESCRIPTION(r12, r11),
    TEXT_ANNOUNCEMENT_URL(r8, r7),
    TEXT_ANNOUNCEMENT_DOMAIN(r9, r13),
    SHORT_NEWS_IMAGE(r6, r5),
    SHORT_NEWS_TITLE(r10, r4),
    SHORT_NEWS_DESCRIPTION(r12, r11),
    SHORT_NEWS_URL(r8, r7),
    SHORT_NEWS_DOMAIN(r9, r13);
    
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public static final String f5417D0 = null;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public static final Map<String, C1496d> f5418E0 = null;

    /* renamed from: U */
    private String f5451U;

    /* renamed from: c */
    private String f5452c;

    /* renamed from: com.appboy.o.c$a */
    public static class C1495a {

        /* renamed from: a */
        private final boolean f5453a;

        public C1495a(boolean z) {
            this.f5453a = z;
        }

        /* renamed from: a */
        public String mo6747a(C1494c cVar) {
            return this.f5453a ? cVar.mo6744a() : cVar.mo6745b();
        }

        /* renamed from: a */
        public C1496d mo6746a(JSONObject jSONObject) {
            String optString = jSONObject.optString(mo6747a(C1494c.TYPE), null);
            if (!C1563i.m7491e(optString) && this.f5453a && optString.equals("short_news") && C1563i.m7491e(C4569r3.m15869a(jSONObject, mo6747a(C1494c.SHORT_NEWS_IMAGE)))) {
                C1557c.m7471d(C1494c.f5417D0, "Short News card doesn't contain image url, parsing type as Text Announcement");
                optString = "text_announcement";
            }
            if (C1494c.f5418E0.containsKey(optString)) {
                return (C1496d) C1494c.f5418E0.get(optString);
            }
            return C1496d.DEFAULT;
        }
    }

    static {
        f5417D0 = C1557c.m7461a(C1494c.class);
        f5418E0 = new HashMap();
        f5418E0.put("banner_image", C1496d.BANNER);
        f5418E0.put("captioned_image", C1496d.CAPTIONED_IMAGE);
        f5418E0.put("text_announcement", C1496d.TEXT_ANNOUNCEMENT);
        f5418E0.put("short_news", C1496d.SHORT_NEWS);
        f5418E0.put("control", C1496d.CONTROL);
    }

    private C1494c(String str, String str2) {
        this.f5452c = str;
        this.f5451U = str2;
    }

    /* renamed from: a */
    public String mo6744a() {
        return this.f5451U;
    }

    /* renamed from: b */
    public String mo6745b() {
        return this.f5452c;
    }
}
