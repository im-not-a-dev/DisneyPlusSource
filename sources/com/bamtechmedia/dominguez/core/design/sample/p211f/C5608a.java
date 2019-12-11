package com.bamtechmedia.dominguez.core.design.sample.p211f;

import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0561m;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.design.sample.C5604b;
import com.bamtechmedia.dominguez.core.design.sample.C5606d;
import com.bamtechmedia.dominguez.core.design.sample.C5607e;
import com.bamtechmedia.dominguez.core.design.sample.p212g.C5610a;
import com.bamtechmedia.dominguez.core.design.sample.p212g.C5610a.C5611a;
import com.bamtechmedia.dominguez.core.design.sample.p212g.C5612b;
import com.bamtechmedia.dominguez.core.design.sample.p212g.C5613c;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: com.bamtechmedia.dominguez.core.design.sample.f.a */
/* compiled from: FragmentAdapter.kt */
public final class C5608a extends C0561m {

    /* renamed from: f */
    private final List<Fragment> f13180f = C13185o.m40520c(C5611a.m18430a(C5610a.f13181X, C5604b.layout_welcome, C5606d.app_name, 0, 4, null), C5611a.m18430a(C5610a.f13181X, C5604b.layout_color_pallet, C5606d.title_styleguide_colors, 0, 4, null), C5611a.m18430a(C5610a.f13181X, C5604b.layout_anakin_color_pallet, C5606d.title_styleguide_colors, 0, 4, null), C5611a.m18430a(C5610a.f13181X, C5604b.layout_button_design, C5606d.title_styleguide_buttons, 0, 4, null), C5610a.f13181X.mo17354a(C5604b.layout_button_design, C5606d.title_styleguide_buttons, C5607e.AppTheme_Vader), new C5613c(), new C5612b());

    public C5608a(C0538i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public int mo5565a() {
        return this.f13180f.size();
    }

    /* renamed from: c */
    public Fragment mo3302c(int i) {
        return (Fragment) this.f13180f.get(i);
    }

    /* renamed from: e */
    public final String mo17351e(int i) {
        Object obj = this.f13180f.get(i);
        if (obj != null) {
            return ((C5609b) obj).getTitle();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.design.sample.adapter.TitleProvider");
    }
}
