package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8107c;

/* renamed from: com.bumptech.glide.load.n.j */
/* compiled from: DiskCacheStrategy */
public abstract class C8227j {

    /* renamed from: a */
    public static final C8227j f17607a = new C8229b();

    /* renamed from: b */
    public static final C8227j f17608b = new C8230c();

    /* renamed from: c */
    public static final C8227j f17609c = new C8231d();

    /* renamed from: d */
    public static final C8227j f17610d = new C8232e();

    /* renamed from: com.bumptech.glide.load.n.j$a */
    /* compiled from: DiskCacheStrategy */
    class C8228a extends C8227j {
        C8228a() {
        }

        /* renamed from: a */
        public boolean mo21368a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo21369a(C8105a aVar) {
            return aVar == C8105a.REMOTE;
        }

        /* renamed from: b */
        public boolean mo21371b() {
            return true;
        }

        /* renamed from: a */
        public boolean mo21370a(boolean z, C8105a aVar, C8107c cVar) {
            return (aVar == C8105a.RESOURCE_DISK_CACHE || aVar == C8105a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$b */
    /* compiled from: DiskCacheStrategy */
    class C8229b extends C8227j {
        C8229b() {
        }

        /* renamed from: a */
        public boolean mo21368a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo21369a(C8105a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo21370a(boolean z, C8105a aVar, C8107c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo21371b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$c */
    /* compiled from: DiskCacheStrategy */
    class C8230c extends C8227j {
        C8230c() {
        }

        /* renamed from: a */
        public boolean mo21368a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo21369a(C8105a aVar) {
            return (aVar == C8105a.DATA_DISK_CACHE || aVar == C8105a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: a */
        public boolean mo21370a(boolean z, C8105a aVar, C8107c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo21371b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$d */
    /* compiled from: DiskCacheStrategy */
    class C8231d extends C8227j {
        C8231d() {
        }

        /* renamed from: a */
        public boolean mo21368a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo21369a(C8105a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo21370a(boolean z, C8105a aVar, C8107c cVar) {
            return (aVar == C8105a.RESOURCE_DISK_CACHE || aVar == C8105a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: b */
        public boolean mo21371b() {
            return true;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$e */
    /* compiled from: DiskCacheStrategy */
    class C8232e extends C8227j {
        C8232e() {
        }

        /* renamed from: a */
        public boolean mo21368a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo21369a(C8105a aVar) {
            return aVar == C8105a.REMOTE;
        }

        /* renamed from: b */
        public boolean mo21371b() {
            return true;
        }

        /* renamed from: a */
        public boolean mo21370a(boolean z, C8105a aVar, C8107c cVar) {
            return ((z && aVar == C8105a.DATA_DISK_CACHE) || aVar == C8105a.LOCAL) && cVar == C8107c.TRANSFORMED;
        }
    }

    static {
        new C8228a();
    }

    /* renamed from: a */
    public abstract boolean mo21368a();

    /* renamed from: a */
    public abstract boolean mo21369a(C8105a aVar);

    /* renamed from: a */
    public abstract boolean mo21370a(boolean z, C8105a aVar, C8107c cVar);

    /* renamed from: b */
    public abstract boolean mo21371b();
}
