package com.airbnb.lottie.p015s;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C1180b;
import com.airbnb.lottie.C1207g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.s.b */
/* compiled from: ImageAssetManager */
public class C1265b {

    /* renamed from: e */
    private static final Object f4744e = new Object();

    /* renamed from: a */
    private final Context f4745a;

    /* renamed from: b */
    private String f4746b;

    /* renamed from: c */
    private C1180b f4747c;

    /* renamed from: d */
    private final Map<String, C1207g> f4748d;

    public C1265b(Callback callback, String str, C1180b bVar, Map<String, C1207g> map) {
        this.f4746b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f4746b;
            if (str2.charAt(str2.length() - 1) != '/') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f4746b);
                sb.append('/');
                this.f4746b = sb.toString();
            }
        }
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f4748d = new HashMap();
            this.f4745a = null;
            return;
        }
        this.f4745a = ((View) callback).getContext();
        this.f4748d = map;
        mo6193a(bVar);
    }

    /* renamed from: a */
    public void mo6193a(C1180b bVar) {
        this.f4747c = bVar;
    }

    /* renamed from: a */
    public Bitmap mo6192a(String str) {
        C1207g gVar = (C1207g) this.f4748d.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a = gVar.mo6119a();
        if (a != null) {
            return a;
        }
        C1180b bVar = this.f4747c;
        if (bVar != null) {
            Bitmap a2 = bVar.mo6025a(gVar);
            if (a2 != null) {
                m6335a(str, a2);
            }
            return a2;
        }
        String b = gVar.mo6121b();
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        String str2 = "LOTTIE";
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f4746b)) {
                    AssetManager assets = this.f4745a.getAssets();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f4746b);
                    sb.append(b);
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(sb.toString()), null, options);
                    m6335a(str, decodeStream);
                    return decodeStream;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e) {
                Log.w(str2, "Unable to open asset.", e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                m6335a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                Log.w(str2, "data URL did not have correct base64 format.", e2);
                return null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo6194a(Context context) {
        return (context == null && this.f4745a == null) || this.f4745a.equals(context);
    }

    /* renamed from: a */
    private Bitmap m6335a(String str, Bitmap bitmap) {
        synchronized (f4744e) {
            ((C1207g) this.f4748d.get(str)).mo6120a(bitmap);
        }
        return bitmap;
    }
}
