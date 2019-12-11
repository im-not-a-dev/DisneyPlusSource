package com.bamtechmedia.dominguez.profiles.p268x1.p270h;

import android.os.Handler;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p590y.C13180m;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u001a\u001b\u001cB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel$State;", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;", "tempProfile", "Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "profileNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "requestCode", "", "languageFallbackLogic", "Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "handler", "Landroid/os/Handler;", "(Lcom/bamtechmedia/dominguez/profiles/TempProfile;Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;ILcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;Landroid/os/Handler;)V", "currentSelection", "isInitialSelection", "", "languageCode", "", "onCleared", "", "onPositionSelected", "position", "persistRow", "returnToPriorFragment", "Companion", "LanguageAction", "State", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.c */
/* compiled from: ChooseLanguageViewModel.kt */
public final class C6952c extends C5741g<C6957c> implements C6960e {

    /* renamed from: U */
    private final C6780r1 f15460U;

    /* renamed from: V */
    private final C6671h0 f15461V;

    /* renamed from: W */
    private final int f15462W;

    /* renamed from: X */
    private C6913e f15463X;

    /* renamed from: Y */
    private final Handler f15464Y;

    /* renamed from: c */
    private int f15465c = -1;

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.c$a */
    /* compiled from: ChooseLanguageViewModel.kt */
    public static final class C6953a {
        private C6953a() {
        }

        public /* synthetic */ C6953a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel$LanguageAction;", "", "()V", "Populate", "Update", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel$LanguageAction$Populate;", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel$LanguageAction$Update;", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.c$b */
    /* compiled from: ChooseLanguageViewModel.kt */
    public static abstract class C6954b {

        /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.c$b$a */
        /* compiled from: ChooseLanguageViewModel.kt */
        public static final class C6955a extends C6954b {

            /* renamed from: a */
            private final List<Pair<String, Boolean>> f15466a;

            public C6955a(List<Pair<String, Boolean>> list) {
                super(null);
                this.f15466a = list;
            }

            /* renamed from: a */
            public final List<Pair<String, Boolean>> mo19702a() {
                return this.f15466a;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.c$b$b */
        /* compiled from: ChooseLanguageViewModel.kt */
        public static final class C6956b extends C6954b {

            /* renamed from: a */
            private final int f15467a;

            public C6956b(int i) {
                super(null);
                this.f15467a = i;
            }

            /* renamed from: a */
            public final int mo19703a() {
                return this.f15467a;
            }
        }

        private C6954b() {
        }

        public /* synthetic */ C6954b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.c$c */
    /* compiled from: ChooseLanguageViewModel.kt */
    public static final class C6957c {

        /* renamed from: a */
        private final C6954b f15468a;

        public C6957c(C6954b bVar) {
            this.f15468a = bVar;
        }

        /* renamed from: a */
        public final C6954b mo19704a() {
            return this.f15468a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f15468a, (java.lang.Object) ((com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6957c) r2).f15468a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6957c
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.profiles.x1.h.c$c r2 = (com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6957c) r2
                com.bamtechmedia.dominguez.profiles.x1.h.c$b r0 = r1.f15468a
                com.bamtechmedia.dominguez.profiles.x1.h.c$b r2 = r2.f15468a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6957c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C6954b bVar = this.f15468a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(action=");
            sb.append(this.f15468a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.c$d */
    /* compiled from: Handler.kt */
    public static final class C6958d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C6952c f15469c;

        public C6958d(C6952c cVar) {
            this.f15469c = cVar;
        }

        public final void run() {
            this.f15469c.m21210y();
        }
    }

    static {
        new C6953a(null);
    }

    public C6952c(C6780r1 r1Var, C6671h0 h0Var, int i, C6913e eVar, Handler handler) {
        super(null, 1, null);
        this.f15460U = r1Var;
        this.f15461V = h0Var;
        this.f15462W = i;
        this.f15463X = eVar;
        this.f15464Y = handler;
        int i2 = -1;
        Iterator it = this.f15463X.mo19679d().iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (m21209b((String) ((Pair) it.next()).mo31016d())) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        this.f15465c = i2;
        List d = this.f15463X.mo19679d();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) d, 10));
        int i4 = 0;
        for (Object next : d) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                arrayList.add(new Pair(((Pair) next).mo31015c(), Boolean.valueOf(i4 == this.f15465c)));
                i4 = i5;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        createState(new C6957c(new C6955a(arrayList)));
    }

    /* renamed from: b */
    private final boolean m21209b(String str) {
        return Intrinsics.areEqual((Object) str, (Object) this.f15460U.mo19352P().mo19792X());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m21210y() {
        C6780r1 r1Var;
        if (this.f15465c != -1) {
            r1Var = this.f15460U.mo19514a((String) ((Pair) this.f15463X.mo19679d().get(this.f15465c)).mo31016d());
        } else {
            r1Var = this.f15460U;
        }
        if (2000 == this.f15462W) {
            this.f15461V.mo19394a(r1Var);
        } else {
            this.f15461V.mo19400b(r1Var);
        }
    }

    public void onCleared() {
        super.onCleared();
        this.f15464Y.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public void mo19701a(int i, boolean z) {
        createState(new C6957c(new C6956b(this.f15465c)));
        this.f15465c = i;
        this.f15464Y.postDelayed(new C6958d(this), z ? 300 : 0);
    }
}
