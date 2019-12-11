package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.C9908u;
import p163g.p449j.p482b.C11512c;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class FirebaseInitProvider extends ContentProvider {
    /* renamed from: a */
    private static void m33216a(ProviderInfo providerInfo) {
        C9908u.m30854a(providerInfo, (Object) "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        m33216a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        String str = "FirebaseInitProvider";
        if (C11512c.m37117a(getContext()) == null) {
            Log.i(str, "FirebaseApp initialization unsuccessful");
        } else {
            Log.i(str, "FirebaseApp initialization successful");
        }
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
