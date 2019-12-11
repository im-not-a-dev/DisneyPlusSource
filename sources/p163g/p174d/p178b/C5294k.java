package p163g.p174d.p178b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p686n.p687a.C14100a;

/* renamed from: g.d.b.k */
/* compiled from: PlaybackRates */
public class C5294k {

    /* renamed from: a */
    List<Integer> f12677a;

    /* renamed from: b */
    private int[] f12678b;

    public C5294k(int... iArr) {
        this.f12678b = iArr;
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(1));
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
            hashSet.add(Integer.valueOf(-i));
        }
        hashSet.remove(Integer.valueOf(-1));
        this.f12677a = new ArrayList(hashSet);
        Collections.sort(this.f12677a);
    }

    /* renamed from: a */
    public int mo16887a(int i, boolean z) {
        if (this.f12677a.size() == 1) {
            return 1;
        }
        int indexOf = this.f12677a.indexOf(Integer.valueOf(i));
        int i2 = -1;
        if (indexOf == -1) {
            C14100a.m44532e("Unable to find current playback rate speed in array", new Object[0]);
            return 1;
        }
        if (z) {
            i2 = 1;
        }
        int i3 = indexOf + i2;
        if (i3 < 0 || this.f12677a.size() <= i3) {
            i3 = this.f12677a.indexOf(Integer.valueOf(1)) + i2;
        }
        return ((Integer) this.f12677a.get(i3)).intValue();
    }

    /* renamed from: a */
    public int[] mo16888a() {
        return this.f12678b;
    }
}
