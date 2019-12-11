package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;
import p096e.p121h.p135s.C4187x;
import p096e.p140j.p142b.C4215c;
import p096e.p140j.p142b.C4215c.C4218c;

public class SwipeDismissBehavior<V extends View> extends C0443c<V> {

    /* renamed from: a */
    C4215c f24153a;

    /* renamed from: b */
    C10277b f24154b;

    /* renamed from: c */
    private boolean f24155c;

    /* renamed from: d */
    private float f24156d = 0.0f;

    /* renamed from: e */
    private boolean f24157e;

    /* renamed from: f */
    int f24158f = 2;

    /* renamed from: g */
    float f24159g = 0.5f;

    /* renamed from: h */
    float f24160h = 0.0f;

    /* renamed from: i */
    float f24161i = 0.5f;

    /* renamed from: j */
    private final C4218c f24162j = new C10276a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C10276a extends C4218c {

        /* renamed from: a */
        private int f24163a;

        /* renamed from: b */
        private int f24164b = -1;

        C10276a() {
        }

        /* renamed from: a */
        public void mo14906a(View view, int i) {
            this.f24164b = i;
            this.f24163a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: b */
        public boolean mo14912b(View view, int i) {
            return this.f24164b == -1 && SwipeDismissBehavior.this.mo26387a(view);
        }

        /* renamed from: c */
        public void mo14913c(int i) {
            C10277b bVar = SwipeDismissBehavior.this.f24154b;
            if (bVar != null) {
                bVar.mo26389a(i);
            }
        }

        /* renamed from: b */
        public int mo14909b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo14905a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f24164b = -1;
            int width = view.getWidth();
            if (m32148a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f24163a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f24163a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f24153a.mo14898c(i, view.getTop())) {
                C4187x.m14363a(view, (Runnable) new C10278c(view, z));
            } else if (z) {
                C10277b bVar = SwipeDismissBehavior.this.f24154b;
                if (bVar != null) {
                    bVar.mo26390a(view);
                }
            }
        }

        /* renamed from: a */
        private boolean m32148a(View view, float f) {
            boolean z = false;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                boolean z2 = C4187x.m14399n(view) == 1;
                int i2 = SwipeDismissBehavior.this.f24158f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    return z2 ? z : z;
                    z = true;
                }
                if (i2 == 1) {
                    if (z2) {
                    }
                    z = true;
                }
                return z;
            }
            if (Math.abs(view.getLeft() - this.f24163a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f24159g)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public int mo14902a(View view) {
            return view.getWidth();
        }

        /* renamed from: a */
        public int mo14903a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = C4187x.m14399n(view) == 1;
            int i5 = SwipeDismissBehavior.this.f24158f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f24163a - view.getWidth();
                    i4 = view.getWidth() + this.f24163a;
                } else if (z) {
                    i3 = this.f24163a;
                    width = view.getWidth();
                } else {
                    i3 = this.f24163a - view.getWidth();
                    i4 = this.f24163a;
                }
                return SwipeDismissBehavior.m32139a(i3, i, i4);
            } else if (z) {
                i3 = this.f24163a - view.getWidth();
                i4 = this.f24163a;
                return SwipeDismissBehavior.m32139a(i3, i, i4);
            } else {
                i3 = this.f24163a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m32139a(i3, i, i4);
        }

        /* renamed from: a */
        public void mo14907a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f24163a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f24160h);
            float width2 = ((float) this.f24163a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f24161i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m32138a(0.0f, 1.0f - SwipeDismissBehavior.m32141b(width, width2, f), 1.0f));
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C10277b {
        /* renamed from: a */
        void mo26389a(int i);

        /* renamed from: a */
        void mo26390a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    private class C10278c implements Runnable {

        /* renamed from: U */
        private final boolean f24166U;

        /* renamed from: c */
        private final View f24168c;

        C10278c(View view, boolean z) {
            this.f24168c = view;
            this.f24166U = z;
        }

        public void run() {
            C4215c cVar = SwipeDismissBehavior.this.f24153a;
            if (cVar != null && cVar.mo14891a(true)) {
                C4187x.m14363a(this.f24168c, (Runnable) this);
            } else if (this.f24166U) {
                C10277b bVar = SwipeDismissBehavior.this.f24154b;
                if (bVar != null) {
                    bVar.mo26390a(this.f24168c);
                }
            }
        }
    }

    /* renamed from: b */
    static float m32141b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void mo26386a(int i) {
        this.f24158f = i;
    }

    /* renamed from: a */
    public boolean mo26387a(View view) {
        return true;
    }

    /* renamed from: b */
    public void mo26388b(float f) {
        this.f24160h = m32138a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void mo26385a(float f) {
        this.f24161i = m32138a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public boolean mo2535b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C4215c cVar = this.f24153a;
        if (cVar == null) {
            return false;
        }
        cVar.mo14887a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f24155c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f24155c = coordinatorLayout.mo2473a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f24155c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f24155c = false;
        }
        if (!z) {
            return false;
        }
        m32140a((ViewGroup) coordinatorLayout);
        return this.f24153a.mo14895b(motionEvent);
    }

    /* renamed from: a */
    private void m32140a(ViewGroup viewGroup) {
        C4215c cVar;
        if (this.f24153a == null) {
            if (this.f24157e) {
                cVar = C4215c.m14521a(viewGroup, this.f24156d, this.f24162j);
            } else {
                cVar = C4215c.m14522a(viewGroup, this.f24162j);
            }
            this.f24153a = cVar;
        }
    }

    /* renamed from: a */
    static float m32138a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m32139a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
