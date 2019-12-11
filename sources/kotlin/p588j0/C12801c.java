package kotlin.p588j0;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.j0.c */
/* compiled from: Charsets.kt */
public final class C12801c {

    /* renamed from: a */
    public static final Charset f29474a;

    static {
        new C12801c();
        Charset forName = Charset.forName(Utf8Charset.NAME);
        Intrinsics.checkReturnedValueIsNotNull((Object) forName, "Charset.forName(\"UTF-8\")");
        f29474a = forName;
        Intrinsics.checkReturnedValueIsNotNull((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        Intrinsics.checkReturnedValueIsNotNull((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        Intrinsics.checkReturnedValueIsNotNull((Object) Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        Intrinsics.checkReturnedValueIsNotNull((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        Intrinsics.checkReturnedValueIsNotNull((Object) Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }

    private C12801c() {
    }
}
