package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0715i.C0717b;
import androidx.viewpager.widget.C1008a;

/* renamed from: androidx.fragment.app.m */
/* compiled from: FragmentPagerAdapter */
public abstract class C0561m extends C1008a {

    /* renamed from: b */
    private final C0538i f2423b;

    /* renamed from: c */
    private final int f2424c;

    /* renamed from: d */
    private C0564o f2425d;

    /* renamed from: e */
    private Fragment f2426e;

    @Deprecated
    public C0561m(C0538i iVar) {
        this(iVar, 0);
    }

    /* renamed from: a */
    public Object mo3294a(ViewGroup viewGroup, int i) {
        if (this.f2425d == null) {
            this.f2425d = this.f2423b.mo3147a();
        }
        long d = mo3303d(i);
        Fragment a = this.f2423b.mo3146a(m3060a(viewGroup.getId(), d));
        if (a != null) {
            this.f2425d.mo3313a(a);
        } else {
            a = mo3302c(i);
            this.f2425d.mo3312a(viewGroup.getId(), a, m3060a(viewGroup.getId(), d));
        }
        if (a != this.f2426e) {
            a.setMenuVisibility(false);
            if (this.f2424c == 1) {
                this.f2425d.mo3032a(a, C0717b.STARTED);
            } else {
                a.setUserVisibleHint(false);
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo3295a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public Parcelable mo3299b() {
        return null;
    }

    /* renamed from: b */
    public void mo3300b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    public abstract Fragment mo3302c(int i);

    /* renamed from: d */
    public long mo3303d(int i) {
        return (long) i;
    }

    public C0561m(C0538i iVar, int i) {
        this.f2425d = null;
        this.f2426e = null;
        this.f2423b = iVar;
        this.f2424c = i;
    }

    /* renamed from: b */
    public void mo3301b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2426e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f2424c == 1) {
                    if (this.f2425d == null) {
                        this.f2425d = this.f2423b.mo3147a();
                    }
                    this.f2425d.mo3032a(this.f2426e, C0717b.STARTED);
                } else {
                    this.f2426e.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f2424c == 1) {
                if (this.f2425d == null) {
                    this.f2425d = this.f2423b.mo3147a();
                }
                this.f2425d.mo3032a(fragment, C0717b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f2426e = fragment;
        }
    }

    /* renamed from: a */
    public void mo3297a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2425d == null) {
            this.f2425d = this.f2423b.mo3147a();
        }
        this.f2425d.mo3043b(fragment);
        if (fragment == this.f2426e) {
            this.f2426e = null;
        }
    }

    /* renamed from: a */
    public void mo3296a(ViewGroup viewGroup) {
        C0564o oVar = this.f2425d;
        if (oVar != null) {
            oVar.mo3049d();
            this.f2425d = null;
        }
    }

    /* renamed from: a */
    public boolean mo3298a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: a */
    private static String m3060a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
