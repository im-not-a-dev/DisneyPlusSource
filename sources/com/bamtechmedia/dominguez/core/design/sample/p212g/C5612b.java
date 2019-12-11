package com.bamtechmedia.dominguez.core.design.sample.p212g;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.design.sample.C5603a;
import com.bamtechmedia.dominguez.core.design.sample.C5604b;
import com.bamtechmedia.dominguez.core.design.sample.C5605c;
import com.bamtechmedia.dominguez.core.design.sample.C5606d;
import com.bamtechmedia.dominguez.core.design.sample.p211f.C5609b;
import java.util.HashMap;

/* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.b */
/* compiled from: LanguagesFragment.kt */
public final class C5612b extends Fragment implements C5609b {

    /* renamed from: c */
    private HashMap f13186c;

    /* renamed from: b */
    private final void m18432b(int i) {
        ((TextView) _$_findCachedViewById(C5603a.txt_avenir_roman)).setText(i);
        ((TextView) _$_findCachedViewById(C5603a.txt_avenir_heavy)).setText(i);
        ((TextView) _$_findCachedViewById(C5603a.txt_avenir_black)).setText(i);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f13186c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f13186c == null) {
            this.f13186c = new HashMap();
        }
        View view = (View) this.f13186c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13186c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public String getTitle() {
        return "Languages test page";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5605c.menu_language_select, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5604b.layout_languages, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        int itemId = menuItem.getItemId();
        if (itemId == C5603a.japanese) {
            i = C5606d.test_text_japanese;
        } else if (itemId == C5603a.chinese_traditional) {
            i = C5606d.test_text_chinese_traditional;
        } else if (itemId == C5603a.chinese_simplified) {
            i = C5606d.test_text_chinese_simplified;
        } else if (itemId == C5603a.arabic) {
            i = C5606d.test_text_arabic;
        } else if (itemId == C5603a.russian) {
            i = C5606d.test_text_russian;
        } else if (itemId == C5603a.yiddish) {
            i = C5606d.test_text_yiddish;
        } else if (itemId == C5603a.hebrew) {
            i = C5606d.test_text_hebrew;
        } else if (itemId == C5603a.thai) {
            i = C5606d.test_text_thai;
        } else if (itemId == C5603a.telugu) {
            i = C5606d.test_text_telugu;
        } else if (itemId == C5603a.tamil) {
            i = C5606d.test_text_tamil;
        } else if (itemId == C5603a.burmese) {
            i = C5606d.test_text_burmese;
        } else if (itemId == C5603a.hindi) {
            i = C5606d.test_text_hindi;
        } else {
            i = C5606d.test_text_english;
        }
        m18432b(i);
        return true;
    }
}
