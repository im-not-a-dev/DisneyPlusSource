package kotlin.p590y;

/* renamed from: kotlin.y.h */
/* compiled from: ArraysJVM.kt */
class C13167h {
    /* renamed from: a */
    public static final void m40329a(int i, int i2) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("toIndex (");
            sb.append(i);
            sb.append(") is greater than size (");
            sb.append(i2);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }
}
