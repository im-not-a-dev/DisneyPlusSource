package com.bamtechmedia.dominguez.playback.p254tv.web;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C0715i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.disney.disneyplus.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p412c.C10647a;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0015\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvView;", "()V", "presenter", "Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvPresenter;)V", "getUrlArg", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setPageTitle", "title", "", "setPageTitle$tv_prodGoogleRelease", "showLoading", "show", "", "showWebContent", "rawHtml", "showWebContentUrl", "url", "Companion", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.web.b */
/* compiled from: WebContentTvFragment.kt */
public final class C6591b extends C11890i implements C6596f {

    /* renamed from: U */
    public WebContentTvPresenter f14889U;

    /* renamed from: V */
    private HashMap f14890V;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.web.b$a */
    /* compiled from: WebContentTvFragment.kt */
    public static final class C6592a {
        private C6592a() {
        }

        public /* synthetic */ C6592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6592a(null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f14890V;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f14890V == null) {
            this.f14890V = new HashMap();
        }
        View view = (View) this.f14890V.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f14890V.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo19238a(boolean z) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C10647a.loadingIndicator);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "loadingIndicator");
        progressBar.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public final void mo19239b(int i) {
        TextView textView = (TextView) _$_findCachedViewById(C10647a.titleView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "titleView");
        textView.setText(C5880u.m18936a(i));
    }

    /* renamed from: c */
    public void mo19240c(String str) {
        TextView textView = (TextView) _$_findCachedViewById(C10647a.content);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "content");
        textView.setText(str);
    }

    /* renamed from: d */
    public void mo19241d(String str) {
        TextView textView = (TextView) _$_findCachedViewById(C10647a.tempUrlDisplay);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "tempUrlDisplay");
        textView.setText(str);
    }

    /* renamed from: o */
    public final String mo19242o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("WEB_PAGE_URL");
        }
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_web_content, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0715i lifecycle = getLifecycle();
        WebContentTvPresenter webContentTvPresenter = this.f14889U;
        if (webContentTvPresenter != null) {
            lifecycle.mo4134a(webContentTvPresenter);
            Bundle arguments = getArguments();
            if (arguments != null) {
                mo19239b(arguments.getInt("WEB_PAGE_TITLE"));
                return;
            }
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }
}
