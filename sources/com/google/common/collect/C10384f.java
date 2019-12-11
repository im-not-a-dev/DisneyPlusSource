package com.google.common.collect;

/* renamed from: com.google.common.collect.f */
/* compiled from: Hashing */
final class C10384f {
    /* renamed from: a */
    static int m32853a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: a */
    static int m32854a(Object obj) {
        return m32853a(obj == null ? 0 : obj.hashCode());
    }
}
