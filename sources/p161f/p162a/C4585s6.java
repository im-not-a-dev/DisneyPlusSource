package p161f.p162a;

import com.appboy.p030r.C1535e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f.a.s6 */
public enum C4585s6 implements C1535e<String> {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE("p"),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_NOTIFICATION_TRACKING("pc"),
    PUSH_NOTIFICATION_ACTION_TRACKING("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("add"),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    INAPP_MESSAGE_DISPLAY_FAILURE("sfe"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    TEST_TYPE("tt"),
    PUSH_DELIVERY("pd"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar");
    

    /* renamed from: z0 */
    private static final Map<String, C4585s6> f11431z0 = null;

    /* renamed from: c */
    private final String f11432c;

    static {
        int i;
        C4585s6[] values;
        HashMap hashMap = new HashMap();
        for (C4585s6 s6Var : values()) {
            hashMap.put(s6Var.f11432c, s6Var);
        }
        f11431z0 = new HashMap(hashMap);
    }

    private C4585s6(String str) {
        this.f11432c = str;
    }

    /* renamed from: a */
    public static C4585s6 m15912a(String str) {
        if (f11431z0.containsKey(str)) {
            return (C4585s6) f11431z0.get(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown String Value: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public String mo6750b() {
        return this.f11432c;
    }
}
