package com.appboy.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import androidx.core.app.C0478i.C0481b;
import androidx.core.app.C0478i.C0482c;
import androidx.core.app.C0478i.C0483d;
import androidx.core.app.C0478i.C0484e;
import androidx.core.app.C0478i.C0485f;
import com.appboy.C1440a;
import com.appboy.p024n.C1489b;
import com.appboy.p025o.C1492a;
import com.appboy.p033s.C1555b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1560f;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.push.p028e.C1526a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appboy.push.c */
/* compiled from: AppboyNotificationStyleFactory */
public class C1524c {

    /* renamed from: a */
    private static final String f5562a = C1557c.m7461a(C1524c.class);

    /* renamed from: b */
    private static final Integer[] f5563b = {Integer.valueOf(R$id.com_appboy_story_text_view), Integer.valueOf(R$id.com_appboy_story_text_view_container), Integer.valueOf(R$id.com_appboy_story_text_view_small), Integer.valueOf(R$id.com_appboy_story_text_view_small_container), Integer.valueOf(R$id.com_appboy_story_image_view), Integer.valueOf(R$id.com_appboy_story_relative_layout)};

    /* renamed from: c */
    private static final Map<String, Integer> f5564c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("start", Integer.valueOf(8388611));
        hashMap.put("center", Integer.valueOf(17));
        hashMap.put("end", Integer.valueOf(8388613));
        f5564c = hashMap;
    }

    /* renamed from: a */
    public static C0485f m7184a(Context context, Bundle bundle, Bundle bundle2, C0483d dVar) {
        C0485f fVar;
        if (bundle.containsKey("ab_c")) {
            C1557c.m7458a(f5562a, "Rendering push notification with DecoratedCustomViewStyle (Story)");
            fVar = m7183a(context, bundle, dVar);
        } else if (bundle2 == null || !bundle2.containsKey("appboy_image_url")) {
            fVar = null;
        } else {
            C1557c.m7458a(f5562a, "Rendering push notification with BigPictureStyle");
            fVar = m7181a(context, bundle, bundle2);
        }
        if (fVar != null) {
            return fVar;
        }
        C1557c.m7458a(f5562a, "Rendering push notification with BigTextStyle");
        return m7182a(new C1489b(context), bundle);
    }

    /* renamed from: b */
    static int m7188b(Bundle bundle) {
        String str = "appboy_story_index";
        if (!bundle.containsKey(str)) {
            return 0;
        }
        return bundle.getInt(str);
    }

    /* renamed from: a */
    public static C0482c m7182a(C1489b bVar, Bundle bundle) {
        String str = null;
        if (bundle == null) {
            return null;
        }
        C0482c cVar = new C0482c();
        cVar.mo2641a(C1526a.m7238a(bVar, bundle.getString("a")));
        String str2 = "ab_bs";
        String string = bundle.containsKey(str2) ? bundle.getString(str2) : null;
        String str3 = "ab_bt";
        if (bundle.containsKey(str3)) {
            str = bundle.getString(str3);
        }
        if (string != null) {
            cVar.mo2643c(C1526a.m7238a(bVar, string));
        }
        if (str != null) {
            cVar.mo2642b(C1526a.m7238a(bVar, str));
        }
        return cVar;
    }

    /* renamed from: a */
    public static C0484e m7183a(Context context, Bundle bundle, C0483d dVar) {
        C0484e eVar = new C0484e();
        int a = m7178a(bundle);
        int b = m7188b(bundle);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.com_appboy_notification_story_one_image);
        if (!m7187a(remoteViews, context, bundle, b)) {
            C1557c.m7473e(f5562a, "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.");
            return null;
        }
        remoteViews.setOnClickPendingIntent(R$id.com_appboy_story_button_previous, m7179a(context, bundle, ((b - 1) + a) % a));
        remoteViews.setOnClickPendingIntent(R$id.com_appboy_story_button_next, m7179a(context, bundle, (b + 1) % a));
        dVar.mo2652a(remoteViews);
        dVar.mo2667c(true);
        return eVar;
    }

    /* renamed from: a */
    public static C0481b m7181a(Context context, Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            String str = "appboy_image_url";
            if (bundle2.containsKey(str)) {
                String string = bundle2.getString(str);
                if (C1563i.m7490d(string)) {
                    return null;
                }
                Bitmap a = C1555b.m7450a(context, Uri.parse(string), C1492a.NOTIFICATION_EXPANDED_IMAGE);
                if (a == null) {
                    return null;
                }
                try {
                    if (a.getWidth() > a.getHeight()) {
                        DisplayMetrics a2 = C1555b.m7455a(context);
                        int a3 = C1555b.m7447a(a2.densityDpi, 192);
                        int i = a3 * 2;
                        if (i > a2.widthPixels) {
                            i = a2.widthPixels;
                        }
                        try {
                            a = Bitmap.createScaledBitmap(a, i, a3, true);
                        } catch (Exception e) {
                            C1557c.m7470c(f5562a, "Failed to scale image bitmap, using original.", e);
                        }
                    }
                    if (a == null) {
                        C1557c.m7469c(f5562a, "Bitmap download failed for push notification. No image will be included with the notification.");
                        return null;
                    }
                    C0481b bVar = new C0481b();
                    bVar.mo2639b(a);
                    m7185a(new C1489b(context), bVar, bundle);
                    return bVar;
                } catch (Exception e2) {
                    C1557c.m7470c(f5562a, "Failed to create Big Picture Style.", e2);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static PendingIntent m7180a(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent("com.appboy.action.APPBOY_STORY_CLICKED").setClass(context, AppboyNotificationRoutingActivity.class);
        intent.putExtra("appboy_action_uri", str);
        intent.putExtra("appboy_action_use_webview", str2);
        intent.putExtra("appboy_story_page_id", str3);
        intent.putExtra("appboy_campaign_id", str4);
        return PendingIntent.getActivity(context, C1560f.m7479a(), intent, 1073741824);
    }

    /* renamed from: a */
    private static PendingIntent m7179a(Context context, Bundle bundle, int i) {
        Intent intent = new Intent("com.appboy.action.STORY_TRAVERSE").setClass(context, C1525d.m7210b());
        if (bundle != null) {
            bundle.putInt("appboy_story_index", i);
            intent.putExtras(bundle);
        }
        return PendingIntent.getBroadcast(context, C1560f.m7479a(), intent, 1073741824);
    }

    /* renamed from: a */
    static int m7178a(Bundle bundle) {
        int i = 0;
        while (m7186a(bundle, i)) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    static boolean m7186a(Bundle bundle, int i) {
        return C1522a.m7170a(i, bundle, "ab_c*_i", (String) null) != null;
    }

    /* renamed from: a */
    private static boolean m7187a(RemoteViews remoteViews, Context context, Bundle bundle, int i) {
        C1489b bVar = new C1489b(context);
        String string = bundle.getString("cid");
        String a = C1522a.m7169a(i, bundle, "ab_c*_t");
        String str = "setGravity";
        String str2 = "center";
        String str3 = "setVisibility";
        if (!C1563i.m7490d(a)) {
            remoteViews.setTextViewText(f5563b[0].intValue(), C1526a.m7238a(bVar, a));
            remoteViews.setInt(f5563b[1].intValue(), str, ((Integer) f5564c.get(C1522a.m7170a(i, bundle, "ab_c*_t_j", str2))).intValue());
        } else {
            remoteViews.setInt(f5563b[1].intValue(), str3, 8);
        }
        String a2 = C1522a.m7169a(i, bundle, "ab_c*_st");
        if (!C1563i.m7490d(a2)) {
            remoteViews.setTextViewText(f5563b[2].intValue(), C1526a.m7238a(bVar, a2));
            remoteViews.setInt(f5563b[3].intValue(), str, ((Integer) f5564c.get(C1522a.m7170a(i, bundle, "ab_c*_st_j", str2))).intValue());
        } else {
            remoteViews.setInt(f5563b[3].intValue(), str3, 8);
        }
        Bitmap a3 = C1440a.m6921c(context).mo6578c().mo6659a(context, C1522a.m7169a(i, bundle, "ab_c*_i"), C1492a.NOTIFICATION_ONE_IMAGE_STORY);
        if (a3 == null) {
            return false;
        }
        remoteViews.setImageViewBitmap(f5563b[4].intValue(), a3);
        remoteViews.setOnClickPendingIntent(f5563b[5].intValue(), m7180a(context, C1522a.m7169a(i, bundle, "ab_c*_uri"), C1522a.m7169a(i, bundle, "ab_c*_use_webview"), C1522a.m7170a(i, bundle, "ab_c*_id", ""), string));
        return true;
    }

    /* renamed from: a */
    static void m7185a(C1489b bVar, C0481b bVar2, Bundle bundle) {
        String str = "ab_bs";
        String str2 = null;
        String string = bundle.containsKey(str) ? bundle.getString(str) : null;
        String str3 = "ab_bt";
        if (bundle.containsKey(str3)) {
            str2 = bundle.getString(str3);
        }
        if (string != null) {
            bVar2.mo2640b(C1526a.m7238a(bVar, string));
        }
        if (str2 != null) {
            bVar2.mo2637a(C1526a.m7238a(bVar, str2));
        }
        if (bundle.getString("s") == null && string == null) {
            bVar2.mo2640b(C1526a.m7238a(bVar, bundle.getString("a")));
        }
    }
}
