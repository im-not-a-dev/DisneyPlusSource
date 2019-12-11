package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: RenderingUtils.kt */
public final class RenderingUtilsKt {
    public static final String render(Name name) {
        String str = "asString()";
        if (shouldBeEscaped(name)) {
            StringBuilder sb = new StringBuilder();
            String asString = name.asString();
            Intrinsics.checkReturnedValueIsNotNull((Object) asString, str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf('`'));
            sb2.append(asString);
            sb.append(sb2.toString());
            sb.append('`');
            return sb.toString();
        }
        String asString2 = name.asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString2, str);
        return asString2;
    }

    public static final String renderFqName(List<Name> list) {
        StringBuilder sb = new StringBuilder();
        for (Name name : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render(name));
        }
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r5 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean shouldBeEscaped(kotlin.reflect.jvm.internal.impl.name.Name r5) {
        /*
            boolean r0 = r5.isSpecial()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r5 = r5.asString()
            java.lang.String r0 = "asString()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r0)
            java.util.Set<java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated.KEYWORDS
            boolean r0 = r0.contains(r5)
            r2 = 1
            if (r0 != 0) goto L_0x003c
            r0 = 0
        L_0x001b:
            int r3 = r5.length()
            if (r0 >= r3) goto L_0x0039
            char r3 = r5.charAt(r0)
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 != 0) goto L_0x0031
            r4 = 95
            if (r3 == r4) goto L_0x0031
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            if (r3 == 0) goto L_0x0036
            r5 = 1
            goto L_0x003a
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x001b
        L_0x0039:
            r5 = 0
        L_0x003a:
            if (r5 == 0) goto L_0x003d
        L_0x003c:
            r1 = 1
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.shouldBeEscaped(kotlin.reflect.jvm.internal.impl.name.Name):boolean");
    }

    public static final String render(FqNameUnsafe fqNameUnsafe) {
        List pathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkReturnedValueIsNotNull((Object) pathSegments, "pathSegments()");
        return renderFqName(pathSegments);
    }
}
