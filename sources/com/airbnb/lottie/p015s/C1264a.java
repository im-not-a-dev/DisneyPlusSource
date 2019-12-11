package com.airbnb.lottie.p015s;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C1179a;
import com.airbnb.lottie.p016t.C1275i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.s.a */
/* compiled from: FontAssetManager */
public class C1264a {

    /* renamed from: a */
    private final C1275i<String> f4738a = new C1275i<>();

    /* renamed from: b */
    private final Map<C1275i<String>, Typeface> f4739b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f4740c = new HashMap();

    /* renamed from: d */
    private final AssetManager f4741d;

    /* renamed from: e */
    private C1179a f4742e;

    /* renamed from: f */
    private String f4743f = ".ttf";

    public C1264a(Callback callback, C1179a aVar) {
        this.f4742e = aVar;
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f4741d = null;
            return;
        }
        this.f4741d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public void mo6191a(C1179a aVar) {
        this.f4742e = aVar;
    }

    /* renamed from: a */
    public Typeface mo6190a(String str, String str2) {
        this.f4738a.mo6219a(str, str2);
        Typeface typeface = (Typeface) this.f4739b.get(this.f4738a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = m6331a(m6332a(str), str2);
        this.f4739b.put(this.f4738a, a);
        return a;
    }

    /* renamed from: a */
    private Typeface m6332a(String str) {
        Typeface typeface = (Typeface) this.f4740c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C1179a aVar = this.f4742e;
        if (aVar != null) {
            aVar.mo6023a(str);
            throw null;
        } else if (aVar != null) {
            aVar.mo6024b(str);
            throw null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("fonts/");
            sb.append(str);
            sb.append(this.f4743f);
            Typeface createFromAsset = Typeface.createFromAsset(this.f4741d, sb.toString());
            this.f4740c.put(str, createFromAsset);
            return createFromAsset;
        }
    }

    /* renamed from: a */
    private Typeface m6331a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}
