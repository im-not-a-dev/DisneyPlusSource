package com.appboy.p033s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
import java.util.Random;

/* renamed from: com.appboy.s.f */
public final class C1560f {

    /* renamed from: a */
    private static final String f5710a = String.format("%s.%s", new Object[]{"Appboy v3.2.2 .", C1560f.class.getName()});

    /* renamed from: b */
    private static final Random f5711b = new Random();

    /* renamed from: a */
    public static int m7479a() {
        return f5711b.nextInt();
    }

    /* renamed from: a */
    public static void m7480a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null) {
            String str = f5710a;
            StringBuilder sb = new StringBuilder();
            sb.append("No components found for the following intent: ");
            sb.append(intent.getAction());
            C1557c.m7458a(str, sb.toString());
            return;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            context.sendBroadcast(intent2);
        }
    }
}
