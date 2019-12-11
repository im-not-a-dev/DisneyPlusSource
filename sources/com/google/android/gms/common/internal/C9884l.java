package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.api.C9678a.C9689f;

/* renamed from: com.google.android.gms.common.internal.l */
public class C9884l {

    /* renamed from: a */
    private final SparseIntArray f23155a = new SparseIntArray();

    /* renamed from: b */
    private C9826e f23156b;

    public C9884l(C9826e eVar) {
        C9908u.m30853a(eVar);
        this.f23156b = eVar;
    }

    /* renamed from: a */
    public int mo25405a(Context context, C9689f fVar) {
        C9908u.m30853a(context);
        C9908u.m30853a(fVar);
        if (!fVar.mo25033h()) {
            return 0;
        }
        int i = fVar.mo24962i();
        int i2 = this.f23155a.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f23155a.size()) {
                break;
            }
            int keyAt = this.f23155a.keyAt(i3);
            if (keyAt > i && this.f23155a.get(keyAt) == 0) {
                i2 = 0;
                break;
            }
            i3++;
        }
        if (i2 == -1) {
            i2 = this.f23156b.mo24977a(context, i);
        }
        this.f23155a.put(i, i2);
        return i2;
    }

    /* renamed from: a */
    public void mo25406a() {
        this.f23155a.clear();
    }
}
