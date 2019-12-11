package com.bamtechmedia.dominguez.core.design.sample;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0076a;
import androidx.appcompat.app.C0083d;
import androidx.fragment.app.C0538i;
import androidx.viewpager.widget.C1008a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C1002j;
import com.bamtechmedia.dominguez.core.design.sample.p211f.C5608a;
import java.util.HashMap;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/sample/DesignSampleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPageScrollStateChanged", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "sample_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DesignSampleActivity.kt */
public final class DesignSampleActivity extends C0083d implements C1002j {

    /* renamed from: V */
    private HashMap f13173V;

    /* renamed from: a */
    public void mo5553a(int i) {
    }

    /* renamed from: a */
    public void mo5554a(int i, float f, int i2) {
    }

    /* renamed from: b */
    public void mo5555b(int i) {
        C0076a g = mo444g();
        if (g != null) {
            ViewPager viewPager = (ViewPager) mo17350d(C5603a.viewPager);
            C12880j.m40222a((Object) viewPager, "viewPager");
            C1008a adapter = viewPager.getAdapter();
            if (adapter != null) {
                g.mo392a((CharSequence) ((C5608a) adapter).mo17351e(i));
                return;
            }
            throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.design.sample.adapter.FragmentAdapter");
        }
    }

    /* renamed from: d */
    public View mo17350d(int i) {
        if (this.f13173V == null) {
            this.f13173V = new HashMap();
        }
        View view = (View) this.f13173V.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13173V.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5604b.activity_design_sample);
        ViewPager viewPager = (ViewPager) mo17350d(C5603a.viewPager);
        C12880j.m40222a((Object) viewPager, "viewPager");
        C0538i supportFragmentManager = getSupportFragmentManager();
        C12880j.m40222a((Object) supportFragmentManager, "supportFragmentManager");
        viewPager.setAdapter(new C5608a(supportFragmentManager));
        ((ViewPager) mo17350d(C5603a.viewPager)).mo5496a((C1002j) this);
    }
}
