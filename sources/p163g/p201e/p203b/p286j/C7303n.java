package p163g.p201e.p203b.p286j;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: g.e.b.j.n */
/* compiled from: DispatchingDeepLinkHandler.kt */
public final class C7303n implements C7290d {

    /* renamed from: a */
    private final Set<C7290d> f16056a;

    public C7303n(Set<? extends C7290d> set) {
        this.f16056a = set;
    }

    /* renamed from: a */
    private final <T> T m21940a(List<? extends T> list, String str) {
        if (list.size() <= 1) {
            return C13199w.m40591g((List) list);
        }
        throw new IllegalStateException(str);
    }

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        Set<C7290d> set = this.f16056a;
        ArrayList arrayList = new ArrayList();
        for (C7290d createDeepLinkedFragment : set) {
            Fragment createDeepLinkedFragment2 = createDeepLinkedFragment.createDeepLinkedFragment(httpUrl);
            if (createDeepLinkedFragment2 != null) {
                arrayList.add(createDeepLinkedFragment2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiple DeepLinkedFragmentFactories handle ");
        sb.append(httpUrl);
        return (Fragment) m21940a(arrayList, sb.toString());
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        Set<C7290d> set = this.f16056a;
        ArrayList arrayList = new ArrayList();
        for (C7290d createDeepLinkedFragmentStack : set) {
            List createDeepLinkedFragmentStack2 = createDeepLinkedFragmentStack.createDeepLinkedFragmentStack(httpUrl);
            if (createDeepLinkedFragmentStack2 != null) {
                arrayList.add(createDeepLinkedFragmentStack2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiple DeepLinkedFragmentFactories handle ");
        sb.append(httpUrl);
        return (List) m21940a(arrayList, sb.toString());
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        Set<C7290d> set = this.f16056a;
        ArrayList arrayList = new ArrayList();
        for (C7290d createDeepLinkedIntent : set) {
            Intent createDeepLinkedIntent2 = createDeepLinkedIntent.createDeepLinkedIntent(httpUrl);
            if (createDeepLinkedIntent2 != null) {
                arrayList.add(createDeepLinkedIntent2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiple DeepLinkedFragmentFactories handle ");
        sb.append(httpUrl);
        return (Intent) m21940a(arrayList, sb.toString());
    }
}
