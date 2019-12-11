package com.bumptech.glide.load.p341p.p346g;

import android.util.Log;
import com.bumptech.glide.load.C8107c;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8117k;
import com.bumptech.glide.load.p334n.C8258v;
import java.io.File;
import java.io.IOException;
import p163g.p413f.p414a.p424w.C10761a;

/* renamed from: com.bumptech.glide.load.p.g.d */
/* compiled from: GifDrawableEncoder */
public class C8414d implements C8117k<C8412c> {
    /* renamed from: a */
    public C8107c mo21167a(C8115i iVar) {
        return C8107c.SOURCE;
    }

    /* renamed from: a */
    public boolean mo21151a(C8258v<C8412c> vVar, File file, C8115i iVar) {
        try {
            C10761a.m33984a(((C8412c) vVar.get()).mo21597b(), file);
            return true;
        } catch (IOException e) {
            String str = "GifEncoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
