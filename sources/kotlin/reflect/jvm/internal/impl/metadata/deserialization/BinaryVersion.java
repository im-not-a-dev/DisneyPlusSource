package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12880j;

/* compiled from: BinaryVersion.kt */
public abstract class BinaryVersion {
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;
    private final int[] numbers;
    private final int patch;
    private final List<Integer> rest;

    /* compiled from: BinaryVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BinaryVersion(int... iArr) {
        this.numbers = iArr;
        Integer b = C13174k.m40383b(this.numbers, 0);
        int i = -1;
        this.major = b != null ? b.intValue() : -1;
        Integer b2 = C13174k.m40383b(this.numbers, 1);
        this.minor = b2 != null ? b2.intValue() : -1;
        Integer b3 = C13174k.m40383b(this.numbers, 2);
        if (b3 != null) {
            i = b3.intValue();
        }
        this.patch = i;
        int[] iArr2 = this.numbers;
        this.rest = iArr2.length > 3 ? C13199w.m40606q(C13171j.m40335a(iArr2).subList(3, this.numbers.length)) : C13185o.m40513a();
    }

    public boolean equals(Object obj) {
        if (obj != null && C12880j.m40224a((Object) getClass(), (Object) obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && C12880j.m40224a((Object) this.rest, (Object) binaryVersion.rest)) {
                return true;
            }
        }
        return false;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i = this.major;
        int i2 = i + (i * 31) + this.minor;
        int i3 = i2 + (i2 * 31) + this.patch;
        return i3 + (i3 * 31) + this.rest.hashCode();
    }

    public final boolean isAtLeast(BinaryVersion binaryVersion) {
        return isAtLeast(binaryVersion.major, binaryVersion.minor, binaryVersion.patch);
    }

    /* access modifiers changed from: protected */
    public final boolean isCompatibleTo(BinaryVersion binaryVersion) {
        int i = this.major;
        if (i == 0) {
            if (binaryVersion.major == 0 && this.minor == binaryVersion.minor) {
                return true;
            }
        } else if (i == binaryVersion.major && this.minor <= binaryVersion.minor) {
            return true;
        }
        return false;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int i2 = array[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : C13199w.m40559a(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        boolean z = true;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        if (this.patch < i3) {
            z = false;
        }
        return z;
    }
}
