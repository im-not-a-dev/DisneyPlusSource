package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* compiled from: propertiesConventionUtil.kt */
public final class PropertiesConventionUtilKt {
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(Name name) {
        String asString = name.asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "name.asString()");
        if (JvmAbi.isGetterName(asString)) {
            return C13185o.m40517b((Object) propertyNameByGetMethodName(name));
        }
        if (JvmAbi.isSetterName(asString)) {
            return propertyNamesBySetMethodName(name);
        }
        return BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    public static final Name propertyNameByGetMethodName(Name name) {
        Name propertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(name, "get", false, null, 12, null);
        if (propertyNameFromAccessorMethodName$default != null) {
            return propertyNameFromAccessorMethodName$default;
        }
        return propertyNameFromAccessorMethodName$default(name, "is", false, null, 8, null);
    }

    public static final Name propertyNameBySetMethodName(Name name, boolean z) {
        return propertyNameFromAccessorMethodName$default(name, "set", false, z ? "is" : null, 4, null);
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z, String str2) {
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "methodName.identifier");
        if (!C12832w.m40123b(identifier, str, false, 2, null) || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt && 'z' >= charAt) {
            return null;
        }
        if (str2 != null) {
            if (!C13147x.f29590a || z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(C12833x.m40137a(identifier, (CharSequence) str));
                return Name.identifier(sb.toString());
            }
            throw new AssertionError("Assertion failed");
        } else if (!z) {
            return name;
        } else {
            String decapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(C12833x.m40137a(identifier, (CharSequence) str), true);
            if (!Name.isValidIdentifier(decapitalizeSmartForCompiler)) {
                return null;
            }
            return Name.identifier(decapitalizeSmartForCompiler);
        }
    }

    static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z, str2);
    }

    public static final List<Name> propertyNamesBySetMethodName(Name name) {
        return C13185o.m40522d(propertyNameBySetMethodName(name, false), propertyNameBySetMethodName(name, true));
    }
}
