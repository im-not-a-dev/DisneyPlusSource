package p096e.p121h.p130o;

import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.C13142s;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.h.o.a */
/* compiled from: Bundle.kt */
public final class C4064a {
    /* renamed from: a */
    public static final Bundle m13969a(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.mo31013a();
            Object b = pair.mo31014b();
            if (b == null) {
                bundle.putString(str, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str, (short[]) b);
            } else {
                String str2 = " for key \"";
                if (b instanceof Object[]) {
                    Class componentType = b.getClass().getComponentType();
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        if (b != null) {
                            bundle.putParcelableArray(str, (Parcelable[]) b);
                        } else {
                            throw new C13142s("null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                        }
                    } else if (String.class.isAssignableFrom(componentType)) {
                        if (b != null) {
                            bundle.putStringArray(str, (String[]) b);
                        } else {
                            throw new C13142s("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                        }
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        if (b != null) {
                            bundle.putCharSequenceArray(str, (CharSequence[]) b);
                        } else {
                            throw new C13142s("null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                        }
                    } else if (Serializable.class.isAssignableFrom(componentType)) {
                        bundle.putSerializable(str, (Serializable) b);
                    } else {
                        Intrinsics.checkReturnedValueIsNotNull((Object) componentType, "componentType");
                        String canonicalName = componentType.getCanonicalName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Illegal value array type ");
                        sb.append(canonicalName);
                        sb.append(str2);
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (b instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) b);
                } else if (VERSION.SDK_INT >= 18 && (b instanceof Binder)) {
                    bundle.putBinder(str, (IBinder) b);
                } else if (VERSION.SDK_INT >= 21 && (b instanceof Size)) {
                    bundle.putSize(str, (Size) b);
                } else if (VERSION.SDK_INT < 21 || !(b instanceof SizeF)) {
                    String canonicalName2 = b.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Illegal value type ");
                    sb2.append(canonicalName2);
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                } else {
                    bundle.putSizeF(str, (SizeF) b);
                }
            }
        }
        return bundle;
    }
}
