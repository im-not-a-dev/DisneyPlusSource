package p163g.p201e.p203b.p316t.p317u;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.disney.disneyplus.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p512h.p513c.p514k.C11888g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/options/help/HelpTvFragment;", "Ldagger/android/support/DaggerDialogFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.t.u.c */
/* compiled from: HelpTvFragment.kt */
public final class C7807c extends C11888g {

    /* renamed from: c */
    private HashMap f16899c;

    /* renamed from: g.e.b.t.u.c$a */
    /* compiled from: HelpTvFragment.kt */
    public static final class C7808a {
        private C7808a() {
        }

        public /* synthetic */ C7808a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7808a(null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16899c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        setStyle(2, 2132017164);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_help_tv, viewGroup, false);
        C12880j.m40222a((Object) inflate, "inflater.inflate(R.layou…elp_tv, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
