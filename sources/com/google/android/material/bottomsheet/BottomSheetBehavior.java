package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p096e.p121h.p128m.C4062a;
import p096e.p121h.p135s.C4187x;
import p096e.p140j.p141a.C4204a;
import p096e.p140j.p142b.C4215c;
import p096e.p140j.p142b.C4215c.C4218c;
import p163g.p449j.p450a.p468b.C11460d;
import p163g.p449j.p450a.p468b.C11467k;

public class BottomSheetBehavior<V extends View> extends C0443c<V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f24189a = true;

    /* renamed from: b */
    private float f24190b;

    /* renamed from: c */
    private int f24191c;

    /* renamed from: d */
    private boolean f24192d;

    /* renamed from: e */
    private int f24193e;

    /* renamed from: f */
    private int f24194f;

    /* renamed from: g */
    int f24195g;

    /* renamed from: h */
    int f24196h;

    /* renamed from: i */
    int f24197i;

    /* renamed from: j */
    boolean f24198j;

    /* renamed from: k */
    private boolean f24199k;

    /* renamed from: l */
    int f24200l = 4;

    /* renamed from: m */
    C4215c f24201m;

    /* renamed from: n */
    private boolean f24202n;

    /* renamed from: o */
    private int f24203o;

    /* renamed from: p */
    private boolean f24204p;

    /* renamed from: q */
    int f24205q;

    /* renamed from: r */
    WeakReference<V> f24206r;

    /* renamed from: s */
    WeakReference<View> f24207s;

    /* renamed from: t */
    private C10286b f24208t;

    /* renamed from: u */
    private VelocityTracker f24209u;

    /* renamed from: v */
    int f24210v;

    /* renamed from: w */
    private int f24211w;

    /* renamed from: x */
    boolean f24212x;

    /* renamed from: y */
    private Map<View, Integer> f24213y;

    /* renamed from: z */
    private final C4218c f24214z = new C10285a();

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C10285a extends C4218c {
        C10285a() {
        }

        /* renamed from: a */
        public void mo14907a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo26426a(i2);
        }

        /* renamed from: b */
        public boolean mo14912b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f24200l;
            boolean z = true;
            if (i2 == 1 || bottomSheetBehavior.f24212x) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f24210v == i) {
                View view2 = (View) bottomSheetBehavior.f24207s.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference = BottomSheetBehavior.this.f24206r;
            if (weakReference == null || weakReference.get() != view) {
                z = false;
            }
            return z;
        }

        /* renamed from: c */
        public void mo14913c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo26431c(1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo14905a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0028
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f24189a
                if (r9 == 0) goto L_0x0018
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f24195g
            L_0x0015:
                r2 = 3
                goto L_0x00c7
            L_0x0018:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f24196h
                if (r9 <= r10) goto L_0x0026
                r9 = r10
            L_0x0023:
                r2 = 6
                goto L_0x00c7
            L_0x0026:
                r9 = 0
                goto L_0x0015
            L_0x0028:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r5.f24198j
                if (r6 == 0) goto L_0x0051
                boolean r5 = r5.mo26428a(r8, r10)
                if (r5 == 0) goto L_0x0051
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.f24197i
                if (r5 > r6) goto L_0x004a
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0051
            L_0x004a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f24205q
                r2 = 5
                goto L_0x00c7
            L_0x0051:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0067
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f24197i
                goto L_0x00c7
            L_0x0067:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f24189a
                if (r10 == 0) goto L_0x0094
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f24195g
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f24197i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008e
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f24195g
                r9 = r0
                goto L_0x0015
            L_0x008e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f24197i
            L_0x0092:
                r9 = r0
                goto L_0x00c7
            L_0x0094:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r10.f24196h
                if (r9 >= r1) goto L_0x00aa
                int r10 = r10.f24197i
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00a5
                goto L_0x0026
            L_0x00a5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f24196h
                goto L_0x00bf
            L_0x00aa:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f24197i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c2
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f24196h
            L_0x00bf:
                r9 = r0
                goto L_0x0023
            L_0x00c2:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f24197i
                goto L_0x0092
            L_0x00c7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                e.j.b.c r10 = r10.f24201m
                int r0 = r8.getLeft()
                boolean r9 = r10.mo14898c(r0, r9)
                if (r9 == 0) goto L_0x00e6
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10 = 2
                r9.mo26431c(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$d r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                p096e.p121h.p135s.C4187x.m14363a(r8, r9)
                goto L_0x00eb
            L_0x00e6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8.mo26431c(r2)
            L_0x00eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C10285a.mo14905a(android.view.View, float, float):void");
        }

        /* renamed from: b */
        public int mo14909b(View view, int i, int i2) {
            int b = BottomSheetBehavior.this.m32203c();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C4062a.m13967a(i, b, bottomSheetBehavior.f24198j ? bottomSheetBehavior.f24205q : bottomSheetBehavior.f24197i);
        }

        /* renamed from: b */
        public int mo14908b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f24198j) {
                return bottomSheetBehavior.f24205q;
            }
            return bottomSheetBehavior.f24197i;
        }

        /* renamed from: a */
        public int mo14903a(View view, int i, int i2) {
            return view.getLeft();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public static abstract class C10286b {
        /* renamed from: a */
        public abstract void mo26433a(View view, float f);

        /* renamed from: a */
        public abstract void mo26434a(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    protected static class C10287c extends C4204a {
        public static final Creator<C10287c> CREATOR = new C10288a();

        /* renamed from: V */
        final int f24216V;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c$a */
        static class C10288a implements ClassLoaderCreator<C10287c> {
            C10288a() {
            }

            public C10287c[] newArray(int i) {
                return new C10287c[i];
            }

            public C10287c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C10287c(parcel, classLoader);
            }

            public C10287c createFromParcel(Parcel parcel) {
                return new C10287c(parcel, (ClassLoader) null);
            }
        }

        public C10287c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24216V = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24216V);
        }

        public C10287c(Parcelable parcelable, int i) {
            super(parcelable);
            this.f24216V = i;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    private class C10289d implements Runnable {

        /* renamed from: U */
        private final int f24217U;

        /* renamed from: c */
        private final View f24219c;

        C10289d(View view, int i) {
            this.f24219c = view;
            this.f24217U = i;
        }

        public void run() {
            C4215c cVar = BottomSheetBehavior.this.f24201m;
            if (cVar == null || !cVar.mo14891a(true)) {
                BottomSheetBehavior.this.mo26431c(this.f24217U);
            } else {
                C4187x.m14363a(this.f24219c, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: e */
    private void m32206e() {
        this.f24210v = -1;
        VelocityTracker velocityTracker = this.f24209u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24209u = null;
        }
    }

    /* renamed from: c */
    public void mo26432c(boolean z) {
        this.f24199k = z;
    }

    /* renamed from: d */
    public Parcelable mo2541d(CoordinatorLayout coordinatorLayout, V v) {
        return new C10287c(super.mo2541d(coordinatorLayout, v), this.f24200l);
    }

    /* renamed from: d */
    private float m32204d() {
        VelocityTracker velocityTracker = this.f24209u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f24190b);
        return this.f24209u.getYVelocity(this.f24210v);
    }

    /* renamed from: a */
    public void mo2517a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C10287c cVar = (C10287c) parcelable;
        super.mo2517a(coordinatorLayout, v, cVar.mo14857X());
        int i = cVar.f24216V;
        if (i == 1 || i == 2) {
            this.f24200l = 4;
        } else {
            this.f24200l = i;
        }
    }

    /* renamed from: b */
    public boolean mo2535b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f24200l == 1 && actionMasked == 0) {
            return true;
        }
        C4215c cVar = this.f24201m;
        if (cVar != null) {
            cVar.mo14887a(motionEvent);
        }
        if (actionMasked == 0) {
            m32206e();
        }
        if (this.f24209u == null) {
            this.f24209u = VelocityTracker.obtain();
        }
        this.f24209u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f24202n && Math.abs(((float) this.f24211w) - motionEvent.getY()) > ((float) this.f24201m.mo14892b())) {
            this.f24201m.mo14888a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f24202n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo26431c(int i) {
        if (this.f24200l != i) {
            this.f24200l = i;
            if (i == 6 || i == 3) {
                m32205d(true);
            } else if (i == 5 || i == 4) {
                m32205d(false);
            }
            View view = (View) this.f24206r.get();
            if (view != null) {
                C10286b bVar = this.f24208t;
                if (bVar != null) {
                    bVar.mo26434a(view, i);
                }
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C11467k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null) {
            int i = peekValue.data;
            if (i == -1) {
                mo26429b(i);
                mo26430b(obtainStyledAttributes.getBoolean(C11467k.BottomSheetBehavior_Layout_behavior_hideable, false));
                mo26427a(obtainStyledAttributes.getBoolean(C11467k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
                mo26432c(obtainStyledAttributes.getBoolean(C11467k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
                obtainStyledAttributes.recycle();
                this.f24190b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            }
        }
        mo26429b(obtainStyledAttributes.getDimensionPixelSize(C11467k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        mo26430b(obtainStyledAttributes.getBoolean(C11467k.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo26427a(obtainStyledAttributes.getBoolean(C11467k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo26432c(obtainStyledAttributes.getBoolean(C11467k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f24190b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: d */
    private void m32205d(boolean z) {
        WeakReference<V> weakReference = this.f24206r;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f24213y == null) {
                        this.f24213y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f24206r.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f24213y;
                            if (map != null && map.containsKey(childAt)) {
                                C4187x.m14390g(childAt, ((Integer) this.f24213y.get(childAt)).intValue());
                            }
                        } else {
                            if (VERSION.SDK_INT >= 16) {
                                this.f24213y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C4187x.m14390g(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.f24213y = null;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo2526a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C4187x.m14396k(coordinatorLayout) && !C4187x.m14396k(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo2480c((View) v, i);
        this.f24205q = coordinatorLayout.getHeight();
        if (this.f24192d) {
            if (this.f24193e == 0) {
                this.f24193e = coordinatorLayout.getResources().getDimensionPixelSize(C11460d.design_bottom_sheet_peek_height_min);
            }
            this.f24194f = Math.max(this.f24193e, this.f24205q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f24194f = this.f24191c;
        }
        this.f24195g = Math.max(0, this.f24205q - v.getHeight());
        this.f24196h = this.f24205q / 2;
        m32202b();
        int i2 = this.f24200l;
        if (i2 == 3) {
            C4187x.m14386e((View) v, m32203c());
        } else if (i2 == 6) {
            C4187x.m14386e((View) v, this.f24196h);
        } else if (!this.f24198j || i2 != 5) {
            int i3 = this.f24200l;
            if (i3 == 4) {
                C4187x.m14386e((View) v, this.f24197i);
            } else if (i3 == 1 || i3 == 2) {
                C4187x.m14386e((View) v, top - v.getTop());
            }
        } else {
            C4187x.m14386e((View) v, this.f24205q);
        }
        if (this.f24201m == null) {
            this.f24201m = C4215c.m14522a((ViewGroup) coordinatorLayout, this.f24214z);
        }
        this.f24206r = new WeakReference<>(v);
        this.f24207s = new WeakReference<>(mo26425a((View) v));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m32203c() {
        if (this.f24189a) {
            return this.f24195g;
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo2538b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f24203o = 0;
        this.f24204p = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26429b(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f24192d
            if (r4 != 0) goto L_0x0015
            r3.f24192d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f24192d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f24191c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f24192d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f24191c = r1
            int r1 = r3.f24205q
            int r1 = r1 - r4
            r3.f24197i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f24200l
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f24206r
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo26429b(int):void");
    }

    /* renamed from: b */
    public void mo26430b(boolean z) {
        this.f24198j = z;
    }

    /* renamed from: b */
    private void m32202b() {
        if (this.f24189a) {
            this.f24197i = Math.max(this.f24205q - this.f24194f, this.f24195g);
        } else {
            this.f24197i = this.f24205q - this.f24194f;
        }
    }

    /* renamed from: a */
    public boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            this.f24202n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m32206e();
        }
        if (this.f24209u == null) {
            this.f24209u = VelocityTracker.obtain();
        }
        this.f24209u.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f24211w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f24207s;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && coordinatorLayout.mo2473a(view2, x, this.f24211w)) {
                this.f24210v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f24212x = true;
            }
            this.f24202n = this.f24210v == -1 && !coordinatorLayout.mo2473a((View) v, x, this.f24211w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f24212x = false;
            this.f24210v = -1;
            if (this.f24202n) {
                this.f24202n = false;
                return false;
            }
        }
        if (!this.f24202n) {
            C4215c cVar = this.f24201m;
            if (cVar != null && cVar.mo14895b(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.f24207s;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.f24202n && this.f24200l != 1 && !coordinatorLayout.mo2473a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f24201m != null && Math.abs(((float) this.f24211w) - motionEvent.getY()) > ((float) this.f24201m.mo14892b())) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo2522a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == ((View) this.f24207s.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < m32203c()) {
                    iArr[1] = top - m32203c();
                    C4187x.m14386e((View) v, -iArr[1]);
                    mo26431c(3);
                } else {
                    iArr[1] = i2;
                    C4187x.m14386e((View) v, -i2);
                    mo26431c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f24197i;
                if (i4 <= i5 || this.f24198j) {
                    iArr[1] = i2;
                    C4187x.m14386e((View) v, -i2);
                    mo26431c(1);
                } else {
                    iArr[1] = top - i5;
                    C4187x.m14386e((View) v, -iArr[1]);
                    mo26431c(4);
                }
            }
            mo26426a(v.getTop());
            this.f24203o = i2;
            this.f24204p = true;
        }
    }

    /* renamed from: a */
    public void mo2518a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == m32203c()) {
            mo26431c(3);
            return;
        }
        if (view == this.f24207s.get() && this.f24204p) {
            if (this.f24203o > 0) {
                i2 = m32203c();
            } else if (!this.f24198j || !mo26428a(v, m32204d())) {
                if (this.f24203o == 0) {
                    int top = v.getTop();
                    if (!this.f24189a) {
                        int i5 = this.f24196h;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f24197i)) {
                                i2 = 0;
                            } else {
                                i2 = this.f24196h;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f24197i)) {
                            i2 = this.f24196h;
                        } else {
                            i3 = this.f24197i;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f24195g) < Math.abs(top - this.f24197i)) {
                        i2 = this.f24195g;
                    } else {
                        i3 = this.f24197i;
                    }
                } else {
                    i3 = this.f24197i;
                }
                i4 = 4;
            } else {
                i2 = this.f24205q;
                i4 = 5;
            }
            if (this.f24201m.mo14897b((View) v, v.getLeft(), i2)) {
                mo26431c(2);
                C4187x.m14363a((View) v, (Runnable) new C10289d(v, i4));
            } else {
                mo26431c(i4);
            }
            this.f24204p = false;
        }
    }

    /* renamed from: a */
    public boolean mo2532a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f24207s.get() && (this.f24200l != 3 || super.mo2532a(coordinatorLayout, v, view, f, f2));
    }

    /* renamed from: a */
    public void mo26427a(boolean z) {
        if (this.f24189a != z) {
            this.f24189a = z;
            if (this.f24206r != null) {
                m32202b();
            }
            mo26431c((!this.f24189a || this.f24200l != 6) ? this.f24200l : 3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26428a(View view, float f) {
        boolean z = true;
        if (this.f24199k) {
            return true;
        }
        if (view.getTop() < this.f24197i) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f24197i)) / ((float) this.f24191c) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo26425a(View view) {
        if (C4187x.m14341F(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = mo26425a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26426a(int i) {
        View view = (View) this.f24206r.get();
        if (view != null) {
            C10286b bVar = this.f24208t;
            if (bVar != null) {
                int i2 = this.f24197i;
                if (i > i2) {
                    bVar.mo26433a(view, ((float) (i2 - i)) / ((float) (this.f24205q - i2)));
                } else {
                    bVar.mo26433a(view, ((float) (i2 - i)) / ((float) (i2 - m32203c())));
                }
            }
        }
    }
}
