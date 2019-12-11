package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p163g.p500m.p501a.C11725h.C11732g;
import p163g.p500m.p501a.p502z.C11781a;

/* renamed from: g.m.a.v */
/* compiled from: Moshi */
public final class C11760v {

    /* renamed from: d */
    static final List<C11732g> f27382d = new ArrayList(5);

    /* renamed from: a */
    private final List<C11732g> f27383a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ThreadLocal<C11764c> f27384b = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<Object, C11725h<?>> f27385c = new LinkedHashMap();

    /* renamed from: g.m.a.v$a */
    /* compiled from: Moshi */
    public static final class C11761a {

        /* renamed from: a */
        final List<C11732g> f27386a = new ArrayList();

        /* renamed from: g.m.a.v$a$a */
        /* compiled from: Moshi */
        class C11762a implements C11732g {

            /* renamed from: a */
            final /* synthetic */ Type f27387a;

            /* renamed from: b */
            final /* synthetic */ C11725h f27388b;

            C11762a(C11761a aVar, Type type, C11725h hVar) {
                this.f27387a = type;
                this.f27388b = hVar;
            }

            /* renamed from: a */
            public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
                if (!set.isEmpty() || !C11781a.m37918a(this.f27387a, type)) {
                    return null;
                }
                return this.f27388b;
            }
        }

        /* renamed from: a */
        public <T> C11761a mo29872a(Type type, C11725h<T> hVar) {
            if (type == null) {
                throw new IllegalArgumentException("type == null");
            } else if (hVar != null) {
                mo29870a((C11732g) new C11762a(this, type, hVar));
                return this;
            } else {
                throw new IllegalArgumentException("jsonAdapter == null");
            }
        }

        /* renamed from: a */
        public C11761a mo29870a(C11732g gVar) {
            if (gVar != null) {
                this.f27386a.add(gVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: a */
        public C11761a mo29871a(Object obj) {
            if (obj != null) {
                mo29870a((C11732g) C11702a.m37666a(obj));
                return this;
            }
            throw new IllegalArgumentException("adapter == null");
        }

        /* renamed from: a */
        public C11760v mo29873a() {
            return new C11760v(this);
        }
    }

    /* renamed from: g.m.a.v$b */
    /* compiled from: Moshi */
    static final class C11763b<T> extends C11725h<T> {

        /* renamed from: a */
        final Type f27389a;

        /* renamed from: b */
        final String f27390b;

        /* renamed from: c */
        final Object f27391c;

        /* renamed from: d */
        C11725h<T> f27392d;

        C11763b(Type type, String str, Object obj) {
            this.f27389a = type;
            this.f27390b = str;
            this.f27391c = obj;
        }

        public T fromJson(C11737m mVar) throws IOException {
            C11725h<T> hVar = this.f27392d;
            if (hVar != null) {
                return hVar.fromJson(mVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public void toJson(C11747s sVar, T t) throws IOException {
            C11725h<T> hVar = this.f27392d;
            if (hVar != null) {
                hVar.toJson(sVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C11725h<T> hVar = this.f27392d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    /* renamed from: g.m.a.v$c */
    /* compiled from: Moshi */
    final class C11764c {

        /* renamed from: a */
        final List<C11763b<?>> f27393a = new ArrayList();

        /* renamed from: b */
        final Deque<C11763b<?>> f27394b = new ArrayDeque();

        /* renamed from: c */
        boolean f27395c;

        C11764c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <T> C11725h<T> mo29875a(Type type, String str, Object obj) {
            int size = this.f27393a.size();
            for (int i = 0; i < size; i++) {
                C11763b bVar = (C11763b) this.f27393a.get(i);
                if (bVar.f27391c.equals(obj)) {
                    this.f27394b.add(bVar);
                    C11725h<T> hVar = bVar.f27392d;
                    if (hVar == 0) {
                        hVar = bVar;
                    }
                    return hVar;
                }
            }
            C11763b bVar2 = new C11763b(type, str, obj);
            this.f27393a.add(bVar2);
            this.f27394b.add(bVar2);
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <T> void mo29877a(C11725h<T> hVar) {
            ((C11763b) this.f27394b.getLast()).f27392d = hVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29878a(boolean z) {
            this.f27394b.removeLast();
            if (this.f27394b.isEmpty()) {
                C11760v.this.f27384b.remove();
                if (z) {
                    synchronized (C11760v.this.f27385c) {
                        int size = this.f27393a.size();
                        for (int i = 0; i < size; i++) {
                            C11763b bVar = (C11763b) this.f27393a.get(i);
                            C11725h<T> hVar = (C11725h) C11760v.this.f27385c.put(bVar.f27391c, bVar.f27392d);
                            if (hVar != null) {
                                bVar.f27392d = hVar;
                                C11760v.this.f27385c.put(bVar.f27391c, hVar);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public IllegalArgumentException mo29876a(IllegalArgumentException illegalArgumentException) {
            if (this.f27395c) {
                return illegalArgumentException;
            }
            this.f27395c = true;
            if (this.f27394b.size() == 1 && ((C11763b) this.f27394b.getFirst()).f27390b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator descendingIterator = this.f27394b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C11763b bVar = (C11763b) descendingIterator.next();
                sb.append("\nfor ");
                sb.append(bVar.f27389a);
                if (bVar.f27390b != null) {
                    sb.append(' ');
                    sb.append(bVar.f27390b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }
    }

    static {
        f27382d.add(C11765w.f27397a);
        f27382d.add(C11719e.f27290b);
        f27382d.add(C11758u.f27379c);
        f27382d.add(C11709b.f27270c);
        f27382d.add(C11716d.f27283d);
    }

    C11760v(C11761a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f27386a.size() + f27382d.size());
        arrayList.addAll(aVar.f27386a);
        arrayList.addAll(f27382d);
        this.f27383a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    private Object m37865b(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    /* renamed from: a */
    public <T> C11725h<T> mo29867a(Type type) {
        return mo29868a(type, C11781a.f27418a);
    }

    /* renamed from: a */
    public <T> C11725h<T> mo29866a(Class<T> cls) {
        return mo29868a(cls, C11781a.f27418a);
    }

    /* renamed from: a */
    public <T> C11725h<T> mo29868a(Type type, Set<? extends Annotation> set) {
        return mo29869a(type, set, (String) null);
    }

    /* JADX INFO: used method not loaded: g.m.a.z.a.a(java.lang.reflect.Type, java.util.Set):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r1 = (p163g.p500m.p501a.C11760v.C11764c) r4.f27384b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r1 = new p163g.p500m.p501a.C11760v.C11764c(r4);
        r4.f27384b.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r7 = r1.mo29875a(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r7 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r1.mo29878a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = r4.f27383a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r2 >= r7) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r3 = ((p163g.p500m.p501a.C11725h.C11732g) r4.f27383a.get(r2)).mo11720a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r3 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r1.mo29877a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r1.mo29878a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("No JsonAdapter for ");
        r2.append(p163g.p500m.p501a.p502z.C11781a.m37911a(r5, (java.util.Set) r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        throw new java.lang.IllegalArgumentException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        throw r1.mo29876a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r1.mo29878a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p163g.p500m.p501a.C11725h<T> mo29869a(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, java.lang.String r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x008f
            if (r6 == 0) goto L_0x0087
            java.lang.reflect.Type r5 = p163g.p500m.p501a.p502z.C11781a.m37912a(r5)
            java.lang.Object r0 = r4.m37865b(r5, r6)
            java.util.Map<java.lang.Object, g.m.a.h<?>> r1 = r4.f27385c
            monitor-enter(r1)
            java.util.Map<java.lang.Object, g.m.a.h<?>> r2 = r4.f27385c     // Catch:{ all -> 0x0084 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0084 }
            g.m.a.h r2 = (p163g.p500m.p501a.C11725h) r2     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x001b
            monitor-exit(r1)     // Catch:{ all -> 0x0084 }
            return r2
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x0084 }
            java.lang.ThreadLocal<g.m.a.v$c> r1 = r4.f27384b
            java.lang.Object r1 = r1.get()
            g.m.a.v$c r1 = (p163g.p500m.p501a.C11760v.C11764c) r1
            if (r1 != 0) goto L_0x0030
            g.m.a.v$c r1 = new g.m.a.v$c
            r1.<init>()
            java.lang.ThreadLocal<g.m.a.v$c> r2 = r4.f27384b
            r2.set(r1)
        L_0x0030:
            g.m.a.h r7 = r1.mo29875a(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x003b
            r1.mo29878a(r0)
            return r7
        L_0x003b:
            java.util.List<g.m.a.h$g> r7 = r4.f27383a     // Catch:{ IllegalArgumentException -> 0x007a }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x007a }
            r2 = 0
        L_0x0042:
            if (r2 >= r7) goto L_0x005d
            java.util.List<g.m.a.h$g> r3 = r4.f27383a     // Catch:{ IllegalArgumentException -> 0x007a }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x007a }
            g.m.a.h$g r3 = (p163g.p500m.p501a.C11725h.C11732g) r3     // Catch:{ IllegalArgumentException -> 0x007a }
            g.m.a.h r3 = r3.mo11720a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x007a }
            if (r3 != 0) goto L_0x0055
            int r2 = r2 + 1
            goto L_0x0042
        L_0x0055:
            r1.mo29877a(r3)     // Catch:{ IllegalArgumentException -> 0x007a }
            r5 = 1
            r1.mo29878a(r5)
            return r3
        L_0x005d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x007a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x007a }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x007a }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x007a }
            java.lang.String r5 = p163g.p500m.p501a.p502z.C11781a.m37911a(r5, r6)     // Catch:{ IllegalArgumentException -> 0x007a }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x007a }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x007a }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x007a }
            throw r7     // Catch:{ IllegalArgumentException -> 0x007a }
        L_0x0078:
            r5 = move-exception
            goto L_0x0080
        L_0x007a:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.mo29876a(r5)     // Catch:{ all -> 0x0078 }
            throw r5     // Catch:{ all -> 0x0078 }
        L_0x0080:
            r1.mo29878a(r0)
            throw r5
        L_0x0084:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0084 }
            throw r5
        L_0x0087:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotations == null"
            r5.<init>(r6)
            throw r5
        L_0x008f:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "type == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11760v.mo29869a(java.lang.reflect.Type, java.util.Set, java.lang.String):g.m.a.h");
    }

    /* renamed from: a */
    public <T> C11725h<T> mo29865a(C11732g gVar, Type type, Set<? extends Annotation> set) {
        if (set != null) {
            Type a = C11781a.m37912a(type);
            int indexOf = this.f27383a.indexOf(gVar);
            if (indexOf != -1) {
                int size = this.f27383a.size();
                for (int i = indexOf + 1; i < size; i++) {
                    C11725h<T> a2 = ((C11732g) this.f27383a.get(i)).mo11720a(a, set, this);
                    if (a2 != null) {
                        return a2;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("No next JsonAdapter for ");
                sb.append(C11781a.m37911a(a, set));
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip past unknown factory ");
            sb2.append(gVar);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new NullPointerException("annotations == null");
    }
}
