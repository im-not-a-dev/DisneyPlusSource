package p096e.p154p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p096e.p154p.C4309m.C4315f;

/* renamed from: e.p.i0 */
/* compiled from: Visibility */
public abstract class C4299i0 extends C4309m {

    /* renamed from: D0 */
    private static final String[] f10688D0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: C0 */
    private int f10689C0 = 3;

    /* renamed from: e.p.i0$a */
    /* compiled from: Visibility */
    class C4300a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C4329w f10690a;

        /* renamed from: b */
        final /* synthetic */ View f10691b;

        C4300a(C4299i0 i0Var, C4329w wVar, View view) {
            this.f10690a = wVar;
            this.f10691b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10690a.mo15137b(this.f10691b);
        }
    }

    /* renamed from: e.p.i0$b */
    /* compiled from: Visibility */
    private static class C4301b extends AnimatorListenerAdapter implements C4315f, C4262a {

        /* renamed from: a */
        private final View f10692a;

        /* renamed from: b */
        private final int f10693b;

        /* renamed from: c */
        private final ViewGroup f10694c;

        /* renamed from: d */
        private final boolean f10695d;

        /* renamed from: e */
        private boolean f10696e;

        /* renamed from: f */
        boolean f10697f = false;

        C4301b(View view, int i, boolean z) {
            this.f10692a = view;
            this.f10693b = i;
            this.f10694c = (ViewGroup) view.getParent();
            this.f10695d = z;
            m14777a(true);
        }

        /* renamed from: a */
        private void m14776a() {
            if (!this.f10697f) {
                C4283d0.m14704a(this.f10692a, this.f10693b);
                ViewGroup viewGroup = this.f10694c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m14777a(false);
        }

        /* renamed from: a */
        public void mo15054a(C4309m mVar) {
        }

        /* renamed from: b */
        public void mo15037b(C4309m mVar) {
            m14777a(false);
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            m14776a();
            mVar.mo15099b((C4315f) this);
        }

        /* renamed from: d */
        public void mo15039d(C4309m mVar) {
            m14777a(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f10697f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m14776a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f10697f) {
                C4283d0.m14704a(this.f10692a, this.f10693b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f10697f) {
                C4283d0.m14704a(this.f10692a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private void m14777a(boolean z) {
            if (this.f10695d && this.f10696e != z) {
                ViewGroup viewGroup = this.f10694c;
                if (viewGroup != null) {
                    this.f10696e = z;
                    C4330x.m14901a(viewGroup, z);
                }
            }
        }
    }

    /* renamed from: e.p.i0$c */
    /* compiled from: Visibility */
    private static class C4302c {

        /* renamed from: a */
        boolean f10698a;

        /* renamed from: b */
        boolean f10699b;

        /* renamed from: c */
        int f10700c;

        /* renamed from: d */
        int f10701d;

        /* renamed from: e */
        ViewGroup f10702e;

        /* renamed from: f */
        ViewGroup f10703f;

        C4302c() {
        }
    }

    /* renamed from: b */
    private C4302c m14764b(C4325s sVar, C4325s sVar2) {
        C4302c cVar = new C4302c();
        cVar.f10698a = false;
        cVar.f10699b = false;
        String str = "android:visibility:parent";
        String str2 = "android:visibility:visibility";
        if (sVar == null || !sVar.f10769a.containsKey(str2)) {
            cVar.f10700c = -1;
            cVar.f10702e = null;
        } else {
            cVar.f10700c = ((Integer) sVar.f10769a.get(str2)).intValue();
            cVar.f10702e = (ViewGroup) sVar.f10769a.get(str);
        }
        if (sVar2 == null || !sVar2.f10769a.containsKey(str2)) {
            cVar.f10701d = -1;
            cVar.f10703f = null;
        } else {
            cVar.f10701d = ((Integer) sVar2.f10769a.get(str2)).intValue();
            cVar.f10703f = (ViewGroup) sVar2.f10769a.get(str);
        }
        if (sVar == null || sVar2 == null) {
            if (sVar == null && cVar.f10701d == 0) {
                cVar.f10699b = true;
                cVar.f10698a = true;
            } else if (sVar2 == null && cVar.f10700c == 0) {
                cVar.f10699b = false;
                cVar.f10698a = true;
            }
        } else if (cVar.f10700c == cVar.f10701d && cVar.f10702e == cVar.f10703f) {
            return cVar;
        } else {
            int i = cVar.f10700c;
            int i2 = cVar.f10701d;
            if (i != i2) {
                if (i == 0) {
                    cVar.f10699b = false;
                    cVar.f10698a = true;
                } else if (i2 == 0) {
                    cVar.f10699b = true;
                    cVar.f10698a = true;
                }
            } else if (cVar.f10703f == null) {
                cVar.f10699b = false;
                cVar.f10698a = true;
            } else if (cVar.f10702e == null) {
                cVar.f10699b = true;
                cVar.f10698a = true;
            }
        }
        return cVar;
    }

    /* renamed from: d */
    private void m14765d(C4325s sVar) {
        String str = "android:visibility:visibility";
        sVar.f10769a.put(str, Integer.valueOf(sVar.f10770b.getVisibility()));
        sVar.f10769a.put("android:visibility:parent", sVar.f10770b.getParent());
        int[] iArr = new int[2];
        sVar.f10770b.getLocationOnScreen(iArr);
        sVar.f10769a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public abstract Animator mo15042a(ViewGroup viewGroup, View view, C4325s sVar, C4325s sVar2);

    /* renamed from: a */
    public void mo15067a(int i) {
        if ((i & -4) == 0) {
            this.f10689C0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: b */
    public abstract Animator mo15043b(ViewGroup viewGroup, View view, C4325s sVar, C4325s sVar2);

    /* renamed from: c */
    public void mo15008c(C4325s sVar) {
        m14765d(sVar);
    }

    /* renamed from: m */
    public String[] mo15009m() {
        return f10688D0;
    }

    /* renamed from: a */
    public void mo15007a(C4325s sVar) {
        m14765d(sVar);
    }

    /* renamed from: a */
    public Animator mo15006a(ViewGroup viewGroup, C4325s sVar, C4325s sVar2) {
        C4302c b = m14764b(sVar, sVar2);
        if (!b.f10698a || (b.f10702e == null && b.f10703f == null)) {
            return null;
        }
        if (b.f10699b) {
            return mo15066a(viewGroup, sVar, b.f10700c, sVar2, b.f10701d);
        }
        return mo15069b(viewGroup, sVar, b.f10700c, sVar2, b.f10701d);
    }

    /* renamed from: a */
    public Animator mo15066a(ViewGroup viewGroup, C4325s sVar, int i, C4325s sVar2, int i2) {
        if ((this.f10689C0 & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f10770b.getParent();
            if (m14764b(mo15086a(view, false), mo15100b(view, false)).f10698a) {
                return null;
            }
        }
        return mo15042a(viewGroup, sVar2.f10770b, sVar, sVar2);
    }

    /* renamed from: a */
    public boolean mo15068a(C4325s sVar, C4325s sVar2) {
        boolean z = false;
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (!(sVar == null || sVar2 == null)) {
            String str = "android:visibility:visibility";
            if (sVar2.f10769a.containsKey(str) != sVar.f10769a.containsKey(str)) {
                return false;
            }
        }
        C4302c b = m14764b(sVar, sVar2);
        if (b.f10698a && (b.f10700c == 0 || b.f10701d == 0)) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r6.f10733o0 != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo15069b(android.view.ViewGroup r7, p096e.p154p.C4325s r8, int r9, p096e.p154p.C4325s r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.f10689C0
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f10770b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f10770b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0037
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0027
        L_0x0024:
            r9 = r1
            goto L_0x0084
        L_0x0027:
            boolean r2 = r6.f10733o0
            if (r2 == 0) goto L_0x002c
            goto L_0x0044
        L_0x002c:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.view.View r9 = p096e.p154p.C4324r.m14890a(r7, r9, r2)
            goto L_0x003a
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r9 = r2
        L_0x003a:
            r2 = r1
            goto L_0x0084
        L_0x003c:
            if (r9 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0045
        L_0x0044:
            goto L_0x003a
        L_0x0045:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            e.p.s r4 = r6.mo15100b(r2, r3)
            e.p.s r5 = r6.mo15086a(r2, r3)
            e.p.i0$c r4 = r6.m14764b(r4, r5)
            boolean r4 = r4.f10698a
            if (r4 != 0) goto L_0x0068
            android.view.View r9 = p096e.p154p.C4324r.m14890a(r7, r9, r2)
            goto L_0x003a
        L_0x0068:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0080
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x0080
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x0080
            boolean r2 = r6.f10733o0
            if (r2 == 0) goto L_0x0080
            goto L_0x003a
        L_0x0080:
            r9 = r1
            goto L_0x003a
        L_0x0082:
            r9 = r1
            r2 = r9
        L_0x0084:
            r4 = 0
            if (r9 == 0) goto L_0x00cc
            if (r8 == 0) goto L_0x00cc
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f10769a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            e.p.w r11 = p096e.p154p.C4330x.m14900a(r7)
            r11.mo15136a(r9)
            android.animation.Animator r7 = r6.mo15043b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00c3
            r11.mo15137b(r9)
            goto L_0x00cb
        L_0x00c3:
            e.p.i0$a r8 = new e.p.i0$a
            r8.<init>(r6, r11, r9)
            r7.addListener(r8)
        L_0x00cb:
            return r7
        L_0x00cc:
            if (r2 == 0) goto L_0x00ee
            int r9 = r2.getVisibility()
            p096e.p154p.C4283d0.m14704a(r2, r4)
            android.animation.Animator r7 = r6.mo15043b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00ea
            e.p.i0$b r8 = new e.p.i0$b
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            p096e.p154p.C4261a.m14654a(r7, r8)
            r6.mo15085a(r8)
            goto L_0x00ed
        L_0x00ea:
            p096e.p154p.C4283d0.m14704a(r2, r9)
        L_0x00ed:
            return r7
        L_0x00ee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p154p.C4299i0.mo15069b(android.view.ViewGroup, e.p.s, int, e.p.s, int):android.animation.Animator");
    }
}
