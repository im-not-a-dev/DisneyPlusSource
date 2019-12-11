package p163g.p201e.p203b.p312q;

import android.view.View;
import com.bamtechmedia.dominguez.core.p215k.C5758a;
import com.disney.disneyplus.R;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010J&\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/GlobalNavDpadHelper;", "", "focusDirectionMapper", "Lcom/bamtechmedia/dominguez/core/focus/FocusDirectionMapper;", "(Lcom/bamtechmedia/dominguez/core/focus/FocusDirectionMapper;)V", "previousFocusView", "Landroid/view/View;", "previousFocusView$annotations", "()V", "getPreviousFocusView$tv_prodGoogleRelease", "()Landroid/view/View;", "setPreviousFocusView$tv_prodGoogleRelease", "(Landroid/view/View;)V", "consumeKeyEvent", "", "focusDirection", "", "currentFocus", "expandNavAction", "Lkotlin/Function0;", "", "consumeKeyEventFocusSearchOutsideMenu", "consumeKeyEventLeftInsideMenu", "consumeKeyEventRightInsideMenu", "isSupported", "keyCode", "onDirectionalPadEvent", "rootView", "shouldExpandNavForFocusDirection", "Companion", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.f */
/* compiled from: GlobalNavDpadHelper.kt */
public final class C7684f {

    /* renamed from: c */
    private static final int[] f16728c = {20, 19, 21, 22};

    /* renamed from: a */
    private View f16729a;

    /* renamed from: b */
    private final C5758a f16730b;

    /* renamed from: g.e.b.q.f$a */
    /* compiled from: GlobalNavDpadHelper.kt */
    public static final class C7685a {
        private C7685a() {
        }

        public /* synthetic */ C7685a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7685a(null);
    }

    public C7684f(C5758a aVar) {
        this.f16730b = aVar;
    }

    /* renamed from: b */
    private final boolean m22699b(int i, View view) {
        return C7712v.m22751a(view) && i == 17;
    }

    /* renamed from: c */
    private final boolean m22700c(int i, View view) {
        return C7712v.m22751a(view) && i == 66;
    }

    /* renamed from: d */
    private final boolean m22701d(int i, View view) {
        View focusSearch = view.focusSearch(i);
        if (!C7712v.m22751a(view)) {
            if (i == 17 && C12880j.m40224a(view.getTag(R.id.focusHelperExpandNavOnFocusSearchLeft), (Object) Boolean.valueOf(true))) {
                return true;
            }
            if (i == 17 && focusSearch == null) {
                return true;
            }
            if (!C7712v.m22751a(view) && focusSearch != null && C7712v.m22751a(focusSearch)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo20599a(View view, int i, Function0<C13145v> function0) {
        if (view != null) {
            View findFocus = view.findFocus();
            if (findFocus != null) {
                return m22698a(this.f16730b.mo17642d(i), findFocus, function0);
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m22698a(int i, View view, Function0<C13145v> function0) {
        if (m22701d(i, view)) {
            this.f16729a = view;
            function0.invoke();
            return true;
        } else if (m22699b(i, view)) {
            return true;
        } else {
            if (!m22700c(i, view)) {
                return m22697a(i, view);
            }
            View view2 = this.f16729a;
            if (view2 == null) {
                return false;
            }
            boolean requestFocus = view2.requestFocus();
            this.f16729a = null;
            return requestFocus;
        }
    }

    /* renamed from: a */
    private final boolean m22697a(int i, View view) {
        if (this.f16730b.mo17641c(i) && C7712v.m22751a(view)) {
            View focusSearch = view.focusSearch(i);
            if (focusSearch != null && !C7712v.m22751a(focusSearch)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo20598a(int i) {
        return C13174k.m40380a(f16728c, i);
    }
}
