package com.appboy.p034ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.p033s.C1557c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appboy.ui.support.UriUtils */
public class UriUtils {
    private static final String TAG = C1557c.m7461a(UriUtils.class);

    public static Intent getMainActivityIntent(Context context, Bundle bundle) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.setFlags(872415232);
        if (bundle != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    public static Map<String, String> getQueryParameters(Uri uri) {
        if (uri.isOpaque()) {
            C1557c.m7458a(TAG, "URI is not hierarchical. There are no query parameters to parse.");
            return Collections.emptyMap();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            if (indexOf > i) {
                hashMap.put(Uri.decode(encodedQuery.substring(i, indexOf2)), Uri.decode(encodedQuery.substring(indexOf2 + 1, indexOf)));
            }
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableMap(hashMap);
    }

    public static boolean isActivityRegisteredInManifest(Context context, String str) {
        boolean z = false;
        try {
            if (context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0) != null) {
                z = true;
            }
            return z;
        } catch (NameNotFoundException e) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find activity info for class with name: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }
}
