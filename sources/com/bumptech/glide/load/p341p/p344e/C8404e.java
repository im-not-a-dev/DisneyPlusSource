package com.bumptech.glide.load.p341p.p344e;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p334n.C8258v;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.e.e */
/* compiled from: ResourceDrawableDecoder */
public class C8404e implements C8116j<Uri, Drawable> {

    /* renamed from: a */
    private final Context f17904a;

    public C8404e(Context context) {
        this.f17904a = context.getApplicationContext();
    }

    /* renamed from: b */
    private int m24433b(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m24430a(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m24431a(uri);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized Uri format: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo21166a(Uri uri, C8115i iVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* renamed from: a */
    public C8258v<Drawable> mo21165a(Uri uri, int i, int i2, C8115i iVar) {
        Context a = m24432a(uri, uri.getAuthority());
        return C8403d.m24427a(C8400a.m24419a(this.f17904a, a, m24433b(a, uri)));
    }

    /* renamed from: a */
    private Context m24432a(Uri uri, String str) {
        if (str.equals(this.f17904a.getPackageName())) {
            return this.f17904a;
        }
        try {
            return this.f17904a.createPackageContext(str, 0);
        } catch (NameNotFoundException e) {
            if (str.contains(this.f17904a.getPackageName())) {
                return this.f17904a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private int m24430a(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        String str = (String) pathSegments.get(0);
        String str2 = (String) pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, uri.getAuthority());
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to find resource id for: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private int m24431a(Uri uri) {
        try {
            return Integer.parseInt((String) uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized Uri format: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
