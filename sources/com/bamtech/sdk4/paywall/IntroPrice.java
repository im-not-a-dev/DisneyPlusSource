package com.bamtech.sdk4.paywall;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/paywall/IntroPrice;", "", "length", "", "price", "", "unit", "Lcom/bamtech/sdk4/paywall/TimeUnit;", "(IDLcom/bamtech/sdk4/paywall/TimeUnit;)V", "getLength", "()I", "getPrice", "()D", "getUnit", "()Lcom/bamtech/sdk4/paywall/TimeUnit;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IntroPrice.kt */
public final class IntroPrice {
    private final int length;
    private final double price;
    private final TimeUnit unit;

    public IntroPrice(int i, double d, TimeUnit timeUnit) {
        this.length = i;
        this.price = d;
        this.unit = timeUnit;
    }

    public static /* synthetic */ IntroPrice copy$default(IntroPrice introPrice, int i, double d, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = introPrice.length;
        }
        if ((i2 & 2) != 0) {
            d = introPrice.price;
        }
        if ((i2 & 4) != 0) {
            timeUnit = introPrice.unit;
        }
        return introPrice.copy(i, d, timeUnit);
    }

    public final int component1() {
        return this.length;
    }

    public final double component2() {
        return this.price;
    }

    public final TimeUnit component3() {
        return this.unit;
    }

    public final IntroPrice copy(int i, double d, TimeUnit timeUnit) {
        return new IntroPrice(i, d, timeUnit);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IntroPrice) {
                IntroPrice introPrice = (IntroPrice) obj;
                if (!(this.length == introPrice.length) || Double.compare(this.price, introPrice.price) != 0 || !Intrinsics.areEqual((Object) this.unit, (Object) introPrice.unit)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getLength() {
        return this.length;
    }

    public final double getPrice() {
        return this.price;
    }

    public final TimeUnit getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int i = this.length * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.price);
        int i2 = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        TimeUnit timeUnit = this.unit;
        return i2 + (timeUnit != null ? timeUnit.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntroPrice(length=");
        sb.append(this.length);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", unit=");
        sb.append(this.unit);
        sb.append(")");
        return sb.toString();
    }
}
