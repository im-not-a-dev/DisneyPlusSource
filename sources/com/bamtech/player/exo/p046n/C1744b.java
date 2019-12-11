package com.bamtech.player.exo.p046n;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.source.hls.C9170n;
import com.google.android.exoplayer2.source.hls.C9170n.C9172b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bamtech.player.exo.n.b */
/* compiled from: FormatExt.kt */
public final class C1744b {
    /* renamed from: a */
    public static final List<String> m8091a(Format format) {
        C9170n c = m8093c(format);
        if (c != null) {
            List<C9172b> list = c.f20682V;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C9172b bVar : list) {
                    String str = bVar.f20685V;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final String m8092b(Format format) {
        C9170n c = m8093c(format);
        if (c != null) {
            return c.f20683c;
        }
        return null;
    }

    /* renamed from: c */
    public static final C9170n m8093c(Format format) {
        Metadata metadata = format.f18347Z;
        if (metadata != null) {
            int X = metadata.mo22862X();
            for (int i = 0; i < X; i++) {
                C8737b a = metadata.mo22863a(i);
                if (!(a instanceof C9170n)) {
                    a = null;
                }
                C9170n nVar = (C9170n) a;
                if (nVar != null) {
                    return nVar;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m8094d(Format format) {
        return (format.f18343V & 2) != 0;
    }
}
