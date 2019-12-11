package com.google.android.exoplayer2.metadata.p358i;

import com.google.android.exoplayer2.metadata.C8739b;
import com.google.android.exoplayer2.metadata.C8742d;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.metadata.i.a */
/* compiled from: IcyDecoder */
public final class C8752a implements C8739b {

    /* renamed from: a */
    private static final Pattern f18588a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public Metadata mo22875a(C8742d dVar) {
        ByteBuffer byteBuffer = dVar.f19023V;
        return mo22898a(C9554k0.m29400a(byteBuffer.array(), 0, byteBuffer.limit()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Metadata mo22898a(String str) {
        Matcher matcher = f18588a.matcher(str);
        String str2 = null;
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String k = C9554k0.m29457k(matcher.group(1));
            String group = matcher.group(2);
            char c = 65535;
            int hashCode = k.hashCode();
            if (hashCode != -315603473) {
                if (hashCode == 1646559960 && k.equals("streamtitle")) {
                    c = 0;
                }
            } else if (k.equals("streamurl")) {
                c = 1;
            }
            if (c == 0) {
                str2 = group;
            } else if (c != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized ICY tag: ");
                sb.append(str2);
                C9563q.m29500d("IcyDecoder", sb.toString());
            } else {
                str3 = group;
            }
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new Metadata(new C8755c(str2, str3));
    }
}
