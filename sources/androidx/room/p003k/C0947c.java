package androidx.room.p003k;

/* renamed from: androidx.room.k.c */
/* compiled from: StringUtil */
public class C0947c {
    /* renamed from: a */
    public static StringBuilder m5159a() {
        return new StringBuilder();
    }

    /* renamed from: a */
    public static void m5160a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
