package p551j.p552a.p557i.p559g;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;
import p551j.p552a.p557i.C12608e;

/* renamed from: j.a.i.g.g */
/* compiled from: ResourceLoaderConfigurationProvider */
public class C12622g implements C12615b {

    /* renamed from: a */
    private final Properties f29261a;

    public C12622g(C12608e eVar, String str, Charset charset) throws IOException {
        this.f29261a = m39624a(eVar, str, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        r1.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        throw r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Properties m39624a(p551j.p552a.p557i.C12608e r1, java.lang.String r2, java.nio.charset.Charset r3) throws java.io.IOException {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.InputStream r1 = r1.mo30919a(r2)
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r1, r3)
            java.util.Properties r1 = new java.util.Properties     // Catch:{ all -> 0x001c }
            r1.<init>()     // Catch:{ all -> 0x001c }
            r1.load(r2)     // Catch:{ all -> 0x001c }
            r2.close()
            return r1
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            r1.addSuppressed(r2)
        L_0x0027:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p557i.p559g.C12622g.m39624a(j.a.i.e, java.lang.String, java.nio.charset.Charset):java.util.Properties");
    }

    /* renamed from: a */
    public String mo30922a(String str) {
        Properties properties = this.f29261a;
        if (properties == null) {
            return null;
        }
        return properties.getProperty(str);
    }
}
