package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C12880j;

/* compiled from: numbers.kt */
public final class NumberWithRadix {
    private final String number;
    private final int radix;

    public NumberWithRadix(String str, int i) {
        this.number = str;
        this.radix = i;
    }

    public final String component1() {
        return this.number;
    }

    public final int component2() {
        return this.radix;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NumberWithRadix) {
                NumberWithRadix numberWithRadix = (NumberWithRadix) obj;
                if (C12880j.m40224a((Object) this.number, (Object) numberWithRadix.number)) {
                    if (this.radix == numberWithRadix.radix) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.number;
        return ((str != null ? str.hashCode() : 0) * 31) + this.radix;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberWithRadix(number=");
        sb.append(this.number);
        sb.append(", radix=");
        sb.append(this.radix);
        sb.append(")");
        return sb.toString();
    }
}
