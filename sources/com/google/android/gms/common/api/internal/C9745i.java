package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.i */
public final class C9745i<L> {

    /* renamed from: com.google.android.gms.common.api.internal.i$a */
    public static final class C9746a<L> {

        /* renamed from: a */
        private final L f22843a;

        /* renamed from: b */
        private final String f22844b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9746a)) {
                return false;
            }
            C9746a aVar = (C9746a) obj;
            return this.f22843a == aVar.f22843a && this.f22844b.equals(aVar.f22844b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f22843a) * 31) + this.f22844b.hashCode();
        }
    }

    /* renamed from: a */
    public final void mo25185a() {
    }
}
