package com.bamtech.sdk4.media;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.p588j0.C12801c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, mo31007d2 = {"generateCachedMediaId", "", "hashString", "type", "extension-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: CacheIdGenerator.kt */
public final class CacheIdGeneratorKt {
    public static final String generateCachedMediaId(String str) {
        return hashString(str, "SHA-1");
    }

    private static final String hashString(String str, String str2) {
        MessageDigest instance = MessageDigest.getInstance(str2);
        Charset charset = C12801c.f29474a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C12880j.m40222a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] digest = instance.digest(bytes);
            StringBuilder sb = new StringBuilder(digest.length * 2);
            C12880j.m40222a((Object) digest, "bytes");
            for (byte b : digest) {
                String str3 = "0123456789ABCDEF";
                sb.append(str3.charAt((b >> 4) & 15));
                sb.append(str3.charAt(b & 15));
            }
            String sb2 = sb.toString();
            C12880j.m40222a((Object) sb2, "result.toString()");
            return sb2;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }
}
