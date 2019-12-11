package kotlin.reflect.jvm.internal.impl.name;

import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;

/* compiled from: FqNamesUtil.kt */
public final class FqNamesUtilKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[State.values().length];

        static {
            $EnumSwitchMapping$0[State.BEGINNING.ordinal()] = 1;
            $EnumSwitchMapping$0[State.AFTER_DOT.ordinal()] = 2;
            $EnumSwitchMapping$0[State.MIDDLE.ordinal()] = 3;
        }
    }

    public static final boolean isSubpackageOf(FqName fqName, FqName fqName2) {
        if (C12880j.m40224a((Object) fqName, (Object) fqName2) || fqName2.isRoot()) {
            return true;
        }
        String asString = fqName.asString();
        C12880j.m40222a((Object) asString, "this.asString()");
        String asString2 = fqName2.asString();
        C12880j.m40222a((Object) asString2, "packageName.asString()");
        return isSubpackageOf(asString, asString2);
    }

    public static final boolean isValidJavaFqName(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        State state2 = state;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                state2 = State.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                state2 = State.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (state2 != State.AFTER_DOT) {
            z = true;
        }
        return z;
    }

    public static final FqName tail(FqName fqName, FqName fqName2) {
        if (!isSubpackageOf(fqName, fqName2) || fqName2.isRoot()) {
            return fqName;
        }
        if (C12880j.m40224a((Object) fqName, (Object) fqName2)) {
            FqName fqName3 = FqName.ROOT;
            C12880j.m40222a((Object) fqName3, "FqName.ROOT");
            return fqName3;
        }
        String asString = fqName.asString();
        C12880j.m40222a((Object) asString, "asString()");
        int length = fqName2.asString().length() + 1;
        if (asString != null) {
            String substring = asString.substring(length);
            C12880j.m40222a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new FqName(substring);
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    private static final boolean isSubpackageOf(String str, String str2) {
        return C12832w.m40123b(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }
}
