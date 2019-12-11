package com.appboy.services;

import android.content.Context;
import com.appboy.C1475c;
import com.appboy.p033s.C1557c;

public class AppboyLocationService {

    /* renamed from: a */
    private static final String f5717a = C1557c.m7461a(AppboyLocationService.class);

    public static void requestInitialization(Context context) {
        C1557c.m7458a(f5717a, "Location permissions were granted. Requesting geofence and location initialization.");
        C1475c.m6990a(context);
        C1475c.m6995b(context);
    }
}
