package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p024n.C1486a;
import com.appboy.p033s.C1557c;
import java.util.EnumSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: f.a.j6 */
public class C4484j6 {

    /* renamed from: b */
    private static final String f11121b = C1557c.m7461a(C4484j6.class);

    /* renamed from: a */
    private final SharedPreferences f11122a;

    public C4484j6(Context context) {
        this.f11122a = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
    }

    /* renamed from: a */
    public void mo15644a(C1486a aVar) {
        String str = f11121b;
        StringBuilder sb = new StringBuilder();
        sb.append("Setting Braze Override configuration with config: ");
        sb.append(aVar);
        C1557c.m7469c(str, sb.toString());
        Editor edit = this.f11122a.edit();
        m15518a(edit, "com_appboy_api_key", aVar.mo6671b());
        m15518a(edit, "com_appboy_server_target", aVar.mo6666B());
        mo15643a(edit, "com_appboy_sdk_flavor", (Enum) aVar.mo6665A());
        m15516a(edit, "com_appboy_newsfeed_unread_visual_indicator_on", aVar.mo6687r());
        m15518a(edit, "com_appboy_custom_endpoint", aVar.mo6674e());
        m15518a(edit, "com_appboy_push_small_notification_icon", aVar.mo6668D());
        m15518a(edit, "com_appboy_push_large_notification_icon", aVar.mo6692v());
        m15517a(edit, "com_appboy_session_timeout", aVar.mo6667C());
        m15517a(edit, "com_appboy_default_notification_accent_color", aVar.mo6675f());
        m15517a(edit, "com_appboy_trigger_action_minimum_time_interval_seconds", aVar.mo6669E());
        m15516a(edit, "com_appboy_push_adm_messaging_registration_enabled", aVar.mo6670a());
        m15516a(edit, "com_appboy_handle_push_deep_links_automatically", aVar.mo6684o());
        m15516a(edit, "com_appboy_notifications_enabled_tracking_on", aVar.mo6694x());
        m15516a(edit, "com_appboy_disable_location_collection", aVar.mo6680k());
        m15517a(edit, "com_appboy_data_flush_interval_bad_network", aVar.mo6672c());
        m15517a(edit, "com_appboy_data_flush_interval_good_network", aVar.mo6682m());
        m15517a(edit, "com_appboy_data_flush_interval_great_network", aVar.mo6683n());
        m15518a(edit, "com_appboy_default_notification_channel_name", aVar.mo6677h());
        m15518a(edit, "com_appboy_default_notification_channel_description", aVar.mo6676g());
        m15516a(edit, "com_appboy_push_deep_link_back_stack_activity_enabled", aVar.mo6696z());
        m15518a(edit, "com_appboy_push_deep_link_back_stack_activity_class_name", aVar.mo6695y());
        m15516a(edit, "com_appboy_session_start_based_timeout_enabled", aVar.mo6691u());
        m15516a(edit, "com_appboy_firebase_cloud_messaging_registration_enabled", aVar.mo6685p());
        m15518a(edit, "com_appboy_firebase_cloud_messaging_sender_id", aVar.mo6681l());
        m15516a(edit, "com_appboy_content_cards_unread_visual_indicator_enabled", aVar.mo6673d());
        m15516a(edit, "com_appboy_device_object_whitelisting_enabled", aVar.mo6679j());
        m15516a(edit, "com_appboy_device_in_app_message_accessibility_exclusive_mode_enabled", aVar.mo6686q());
        m15516a(edit, "com_appboy_push_wake_screen_for_notification_enabled", aVar.mo6689t());
        m15516a(edit, "com_appboy_push_notification_html_rendering_enabled", aVar.mo6688s());
        if (aVar.mo6693w() != null) {
            m15518a(edit, "com_appboy_locale_api_key_map", new JSONArray(aVar.mo6693w()).toString());
        }
        EnumSet i = aVar.mo6678i();
        if (i != null) {
            m15519a(edit, "com_appboy_device_object_whitelist", C4480j3.m15507a(i));
        }
        edit.apply();
    }

    /* renamed from: a */
    public void mo15642a() {
        C1557c.m7458a(f11121b, "Clearing Braze Override configuration cache");
        Editor edit = this.f11122a.edit();
        edit.clear();
        edit.apply();
    }

    /* renamed from: a */
    public String mo15640a(String str, String str2) {
        return this.f11122a.getString(str, str2);
    }

    /* renamed from: a */
    public int mo15639a(String str, int i) {
        return this.f11122a.getInt(str, i);
    }

    /* renamed from: a */
    public boolean mo15646a(String str, boolean z) {
        return this.f11122a.getBoolean(str, z);
    }

    /* renamed from: a */
    public Set<String> mo15641a(String str, Set<String> set) {
        return this.f11122a.getStringSet(str, set);
    }

    /* renamed from: a */
    public boolean mo15645a(String str) {
        return this.f11122a.contains(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15643a(Editor editor, String str, Enum enumR) {
        if (enumR != null) {
            m15518a(editor, str, enumR.toString());
        }
    }

    /* renamed from: a */
    private static void m15517a(Editor editor, String str, Integer num) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        }
    }

    /* renamed from: a */
    private static void m15518a(Editor editor, String str, String str2) {
        if (str2 != null) {
            editor.putString(str, str2);
        }
    }

    /* renamed from: a */
    private static void m15516a(Editor editor, String str, Boolean bool) {
        if (bool != null) {
            editor.putBoolean(str, bool.booleanValue());
        }
    }

    /* renamed from: a */
    private static void m15519a(Editor editor, String str, Set<String> set) {
        if (set != null) {
            editor.putStringSet(str, set);
        }
    }
}
