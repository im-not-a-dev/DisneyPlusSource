package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.work.d */
/* compiled from: ContentUriTriggers */
public final class C1029d {

    /* renamed from: a */
    private final Set<C1030a> f4060a = new HashSet();

    /* renamed from: androidx.work.d$a */
    /* compiled from: ContentUriTriggers */
    public static final class C1030a {

        /* renamed from: a */
        private final Uri f4061a;

        /* renamed from: b */
        private final boolean f4062b;

        C1030a(Uri uri, boolean z) {
            this.f4061a = uri;
            this.f4062b = z;
        }

        /* renamed from: a */
        public Uri mo5693a() {
            return this.f4061a;
        }

        /* renamed from: b */
        public boolean mo5694b() {
            return this.f4062b;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1030a.class != obj.getClass()) {
                return false;
            }
            C1030a aVar = (C1030a) obj;
            if (this.f4062b != aVar.f4062b || !this.f4061a.equals(aVar.f4061a)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f4061a.hashCode() * 31) + (this.f4062b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo5689a(Uri uri, boolean z) {
        this.f4060a.add(new C1030a(uri, z));
    }

    /* renamed from: b */
    public int mo5690b() {
        return this.f4060a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1029d.class != obj.getClass()) {
            return false;
        }
        return this.f4060a.equals(((C1029d) obj).f4060a);
    }

    public int hashCode() {
        return this.f4060a.hashCode();
    }

    /* renamed from: a */
    public Set<C1030a> mo5688a() {
        return this.f4060a;
    }
}
