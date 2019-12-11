package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c) {
        super(Character.valueOf(c));
    }

    private final String getPrintablePart(char c) {
        switch (c) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            default:
                return isPrintableUnicode(c) ? String.valueOf(c) : "?";
        }
    }

    private final boolean isPrintableUnicode(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    public String toString() {
        Object[] objArr = {Integer.valueOf(((Character) getValue()).charValue()), getPrintablePart(((Character) getValue()).charValue())};
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkReturnedValueIsNotNull((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType charType = moduleDescriptor.getBuiltIns().getCharType();
        Intrinsics.checkReturnedValueIsNotNull((Object) charType, "module.builtIns.charType");
        return charType;
    }
}
