package com.appboy.p034ui.actions;

import android.net.Uri;
import android.os.Bundle;
import com.appboy.p025o.C1497e;
import com.appboy.p033s.C1563i;

/* renamed from: com.appboy.ui.actions.ActionFactory */
public class ActionFactory {
    public static UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z, C1497e eVar) {
        if (uri != null) {
            return new UriAction(uri, bundle, z, eVar);
        }
        return null;
    }

    public static UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z, C1497e eVar) {
        if (!C1563i.m7490d(str)) {
            return createUriActionFromUri(Uri.parse(str), bundle, z, eVar);
        }
        return null;
    }
}
