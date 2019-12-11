package p163g.p441i.p442a.p443a;

import com.facebook.stetho.common.Utf8Charset;

/* renamed from: g.i.a.a.c */
/* compiled from: JsonEncoding */
public enum C10899c {
    UTF8(Utf8Charset.NAME, false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);
    

    /* renamed from: c */
    private final String f25843c;

    private C10899c(String str, boolean z, int i) {
        this.f25843c = str;
    }

    /* renamed from: a */
    public String mo28023a() {
        return this.f25843c;
    }
}
