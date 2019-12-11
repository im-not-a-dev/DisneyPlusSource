package p163g.p201e.p203b.p315s;

import android.os.Handler;
import com.bamtechmedia.dominguez.collections.C3333i;
import com.bamtechmedia.dominguez.collections.C3333i.C3335b;
import com.bamtechmedia.dominguez.collections.C3454q;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.bamtechmedia.dominguez.core.content.sets.ReferenceSet;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p311p.C7649a;
import p163g.p201e.p203b.p311p.C7651b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0017\u0018B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/landing/LandingPageViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/landing/LandingPageViewModel$State;", "Lcom/bamtechmedia/dominguez/filter/FilterDialogHost;", "collectionViewModel", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "router", "Lcom/bamtechmedia/dominguez/landing/LandingTypePickerRouter;", "debounceHandler", "Landroid/os/Handler;", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;Lcom/bamtechmedia/dominguez/landing/LandingTypePickerRouter;Landroid/os/Handler;)V", "debounceRunnable", "Ljava/lang/Runnable;", "onCleared", "", "onCollectionLoaded", "collection", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "onFilterClicked", "onFilterSelected", "filter", "Lcom/bamtechmedia/dominguez/filter/Filter;", "updateFilter", "Companion", "State", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.s.m */
/* compiled from: LandingPageViewModel.kt */
public final class C7762m extends C5741g<C7764b> implements C7651b {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C3454q f16830U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C7771p f16831V;

    /* renamed from: W */
    private final Handler f16832W;

    /* renamed from: c */
    private Runnable f16833c;

    /* renamed from: g.e.b.s.m$a */
    /* compiled from: LandingPageViewModel.kt */
    public static final class C7763a {
        private C7763a() {
        }

        public /* synthetic */ C7763a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.s.m$b */
    /* compiled from: LandingPageViewModel.kt */
    public static final class C7764b {

        /* renamed from: a */
        private final List<C3778h> f16834a;

        /* renamed from: b */
        private final C3778h f16835b;

        public C7764b() {
            this(null, null, 3, null);
        }

        public C7764b(List<? extends C3778h> list, C3778h hVar) {
            this.f16834a = list;
            this.f16835b = hVar;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.sets.h>, for r1v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ p163g.p201e.p203b.p315s.C7762m.C7764b m22839a(p163g.p201e.p203b.p315s.C7762m.C7764b r0, java.util.List<com.bamtechmedia.dominguez.core.content.sets.C3778h> r1, com.bamtechmedia.dominguez.core.content.sets.C3778h r2, int r3, java.lang.Object r4) {
            /*
                r4 = r3 & 1
                if (r4 == 0) goto L_0x0006
                java.util.List<com.bamtechmedia.dominguez.core.content.sets.h> r1 = r0.f16834a
            L_0x0006:
                r3 = r3 & 2
                if (r3 == 0) goto L_0x000c
                com.bamtechmedia.dominguez.core.content.sets.h r2 = r0.f16835b
            L_0x000c:
                g.e.b.s.m$b r0 = r0.mo20669a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p315s.C7762m.C7764b.m22839a(g.e.b.s.m$b, java.util.List, com.bamtechmedia.dominguez.core.content.sets.h, int, java.lang.Object):g.e.b.s.m$b");
        }

        /* renamed from: a */
        public final C3778h mo20668a() {
            return this.f16835b;
        }

        /* renamed from: a */
        public final C7764b mo20669a(List<? extends C3778h> list, C3778h hVar) {
            return new C7764b(list, hVar);
        }

        /* renamed from: b */
        public final List<C3778h> mo20670b() {
            return this.f16834a;
        }

        /* renamed from: c */
        public final List<C7649a> mo20671c() {
            List<C3778h> list = this.f16834a;
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
            for (C3778h hVar : list) {
                String e = hVar.mo13608e();
                String g = hVar.mo13611g();
                ContentSetType b = hVar.mo13604b();
                String e2 = hVar.mo13608e();
                C3778h hVar2 = this.f16835b;
                C7649a aVar = new C7649a(e, g, b, Intrinsics.areEqual((Object) e2, (Object) hVar2 != null ? hVar2.mo13608e() : null), false, 16, null);
                arrayList.add(aVar);
            }
            return arrayList;
        }

        /* renamed from: d */
        public final boolean mo20672d() {
            return this.f16835b instanceof ReferenceSet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f16835b, (java.lang.Object) r3.f16835b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p163g.p201e.p203b.p315s.C7762m.C7764b
                if (r0 == 0) goto L_0x001d
                g.e.b.s.m$b r3 = (p163g.p201e.p203b.p315s.C7762m.C7764b) r3
                java.util.List<com.bamtechmedia.dominguez.core.content.sets.h> r0 = r2.f16834a
                java.util.List<com.bamtechmedia.dominguez.core.content.sets.h> r1 = r3.f16834a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.core.content.sets.h r0 = r2.f16835b
                com.bamtechmedia.dominguez.core.content.sets.h r3 = r3.f16835b
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p315s.C7762m.C7764b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<C3778h> list = this.f16834a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            C3778h hVar = this.f16835b;
            if (hVar != null) {
                i = hVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(allSets=");
            sb.append(this.f16834a);
            sb.append(", activeSet=");
            sb.append(this.f16835b);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7764b(List list, C3778h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 2) != 0) {
                hVar = null;
            }
            this(list, hVar);
        }
    }

    /* renamed from: g.e.b.s.m$c */
    /* compiled from: LandingPageViewModel.kt */
    static final class C7765c extends C12881k implements Function1<C7764b, C7764b> {

        /* renamed from: U */
        final /* synthetic */ C3658a f16836U;

        /* renamed from: c */
        final /* synthetic */ C7762m f16837c;

        C7765c(C7762m mVar, C3658a aVar) {
            this.f16837c = mVar;
            this.f16836U = aVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
            if (r3 != null) goto L_0x005c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p163g.p201e.p203b.p315s.C7762m.C7764b invoke(p163g.p201e.p203b.p315s.C7762m.C7764b r7) {
            /*
                r6 = this;
                com.bamtechmedia.dominguez.core.content.collections.a r0 = r6.f16836U
                java.util.List r0 = r0.mo13343O()
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.p590y.C13187p.m40525a(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x0015:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0029
                java.lang.Object r2 = r0.next()
                com.bamtechmedia.dominguez.core.content.containers.Container r2 = (com.bamtechmedia.dominguez.core.content.containers.Container) r2
                com.bamtechmedia.dominguez.core.content.sets.h r2 = r2.mo13400a()
                r1.add(r2)
                goto L_0x0015
            L_0x0029:
                com.bamtechmedia.dominguez.core.content.sets.h r0 = r7.mo20668a()
                if (r0 == 0) goto L_0x0055
                java.util.Iterator r2 = r1.iterator()
            L_0x0033:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x004f
                java.lang.Object r3 = r2.next()
                r4 = r3
                com.bamtechmedia.dominguez.core.content.sets.h r4 = (com.bamtechmedia.dominguez.core.content.sets.C3778h) r4
                java.lang.String r4 = r4.mo13608e()
                java.lang.String r5 = r0.mo13608e()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                if (r4 == 0) goto L_0x0033
                goto L_0x0050
            L_0x004f:
                r3 = 0
            L_0x0050:
                com.bamtechmedia.dominguez.core.content.sets.h r3 = (com.bamtechmedia.dominguez.core.content.sets.C3778h) r3
                if (r3 == 0) goto L_0x0055
                goto L_0x005c
            L_0x0055:
                java.lang.Object r0 = kotlin.p590y.C13199w.m40589f(r1)
                r3 = r0
                com.bamtechmedia.dominguez.core.content.sets.h r3 = (com.bamtechmedia.dominguez.core.content.sets.C3778h) r3
            L_0x005c:
                g.e.b.s.m$b r7 = r7.mo20669a(r1, r3)
                g.e.b.s.m r0 = r6.f16837c
                com.bamtechmedia.dominguez.collections.q r0 = r0.f16830U
                com.bamtechmedia.dominguez.core.content.sets.h r1 = r7.mo20668a()
                if (r1 == 0) goto L_0x0079
                java.lang.String r1 = r1.mo13608e()
                com.bamtechmedia.dominguez.collections.i$b r2 = new com.bamtechmedia.dominguez.collections.i$b
                r2.<init>(r1)
                r0.mo12647a(r2)
                return r7
            L_0x0079:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p315s.C7762m.C7765c.invoke(g.e.b.s.m$b):g.e.b.s.m$b");
        }
    }

    /* renamed from: g.e.b.s.m$d */
    /* compiled from: LandingPageViewModel.kt */
    static final class C7766d extends C12881k implements Function1<C7764b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7762m f16838c;

        C7766d(C7762m mVar) {
            this.f16838c = mVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20677a(C7764b bVar) {
            this.f16838c.f16831V.mo20652a(bVar.mo20671c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20677a((C7764b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.s.m$e */
    /* compiled from: LandingPageViewModel.kt */
    static final class C7767e implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C7649a f16839U;

        /* renamed from: c */
        final /* synthetic */ C7762m f16840c;

        C7767e(C7762m mVar, C7649a aVar) {
            this.f16840c = mVar;
            this.f16839U = aVar;
        }

        public final void run() {
            this.f16840c.m22835b(this.f16839U);
        }
    }

    /* renamed from: g.e.b.s.m$f */
    /* compiled from: LandingPageViewModel.kt */
    static final class C7768f extends C12881k implements Function1<C7764b, C7764b> {

        /* renamed from: U */
        final /* synthetic */ C7649a f16841U;

        /* renamed from: c */
        final /* synthetic */ C7762m f16842c;

        C7768f(C7762m mVar, C7649a aVar) {
            this.f16842c = mVar;
            this.f16841U = aVar;
            super(1);
        }

        /* renamed from: a */
        public final C7764b invoke(C7764b bVar) {
            for (C3778h hVar : bVar.mo20670b()) {
                if (Intrinsics.areEqual((Object) hVar.mo13608e(), (Object) this.f16841U.mo20570X())) {
                    if (hVar instanceof ReferenceSet) {
                        this.f16842c.f16830U.mo12479a(hVar);
                    }
                    return C7764b.m22839a(bVar, null, hVar, 1, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static {
        new C7763a(null);
    }

    public C7762m(C3454q qVar, C7771p pVar, Handler handler) {
        super(null, 1, null);
        this.f16830U = qVar;
        this.f16831V = pVar;
        this.f16832W = handler;
        createState(new C7764b(null, null, 3, null));
    }

    public void onCleared() {
        this.f16832W.removeCallbacks(this.f16833c);
    }

    /* renamed from: y */
    public final void mo20667y() {
        withState(new C7766d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22835b(C7649a aVar) {
        this.f16830U.mo12647a((C3333i) new C3335b(aVar.mo20570X()));
        updateState(new C7768f(this, aVar));
    }

    /* renamed from: a */
    public final void mo20665a(C3658a aVar) {
        updateState(new C7765c(this, aVar));
    }

    /* renamed from: a */
    public void mo20666a(C7649a aVar) {
        this.f16832W.removeCallbacks(this.f16833c);
        this.f16833c = new C7767e(this, aVar);
        this.f16832W.postDelayed(this.f16833c, 300);
    }
}
