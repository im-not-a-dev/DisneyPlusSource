package com.bamtechmedia.dominguez.detail.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5899a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5900b;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5901c;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5902d;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5903e;
import java.util.HashMap;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;
import p163g.p201e.p203b.p287k.C7307a;
import p163g.p201e.p203b.p287k.C7309c;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.C7313g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/DefaultBookmarkButton;", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cornerRadius", "", "currentLabel", "", "getCurrentLabel", "()Ljava/lang/String;", "progressBarHeight", "getBookmarkIcon", "setChildViewProperties", "", "startBookmarkScaleAnimation", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultBookmarkButton.kt */
public final class DefaultBookmarkButton extends C5897a {

    /* renamed from: s0 */
    private final float f13675s0;

    /* renamed from: t0 */
    private float f13676t0;

    /* renamed from: u0 */
    private HashMap f13677u0;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton$a */
    /* compiled from: DefaultBookmarkButton.kt */
    static final class C5894a implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ DefaultBookmarkButton f13678c;

        C5894a(DefaultBookmarkButton defaultBookmarkButton) {
            this.f13678c = defaultBookmarkButton;
        }

        public final void onFocusChange(View view, boolean z) {
            TextView textView = (TextView) this.f13678c.mo2145c(C7310d.bookMarkText);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "bookMarkText");
            textView.setSelected(z);
            ImageView imageView = (ImageView) this.f13678c.mo2145c(C7310d.bookMarkIcon);
            Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "bookMarkIcon");
            imageView.setSelected(z);
            CardView cardView = (CardView) this.f13678c.mo2145c(C7310d.bookMarkCardViewContainer);
            Intrinsics.checkReturnedValueIsNotNull((Object) cardView, "bookMarkCardViewContainer");
            cardView.setSelected(z);
            ProgressBar progressBar = (ProgressBar) this.f13678c.mo2145c(C7310d.bookMarkProgressBar);
            Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "bookMarkProgressBar");
            progressBar.setSelected(z);
            this.f13678c.m18968d();
        }
    }

    public DefaultBookmarkButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public DefaultBookmarkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DefaultBookmarkButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m18968d() {
        CardView cardView = (CardView) mo2145c(C7310d.bookMarkCardViewContainer);
        Intrinsics.checkReturnedValueIsNotNull((Object) cardView, "bookMarkCardViewContainer");
        C3800a.m12829a(cardView, 0.0f, 0.0f, !isFocused() ? 1.1f : 1.0f, isFocused() ? 1.1f : 1.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 0, null, null, null, null, 258035, null);
    }

    private final int getBookmarkIcon() {
        if (Intrinsics.areEqual((Object) getButtonState(), (Object) C5901c.f13691a)) {
            return C7309c.ic_icon_details_restart_white;
        }
        return C7309c.ic_icon_details_play_white;
    }

    private final String getCurrentLabel() {
        int i;
        C5898a buttonState = getButtonState();
        if (Intrinsics.areEqual((Object) buttonState, (Object) C5899a.f13688a)) {
            i = C7313g.btn_play;
        } else if (buttonState instanceof C5900b) {
            C5898a buttonState2 = getButtonState();
            if (buttonState2 != null) {
                i = ((C5900b) buttonState2).mo17799a();
            } else {
                throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.detail.common.BookmarkButton.State.PlayPromo");
            }
        } else if (buttonState instanceof C5901c) {
            i = C7313g.btn_details_restart;
        } else {
            i = C7313g.btn_resume;
        }
        return C5880u.m18936a(i);
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13677u0 == null) {
            this.f13677u0 = new HashMap();
        }
        View view = (View) this.f13677u0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13677u0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public void mo2144c() {
        ((ImageView) mo2145c(C7310d.bookMarkIcon)).setImageDrawable(C4025a.m13798c(getContext(), getBookmarkIcon()));
        TextView textView = (TextView) mo2145c(C7310d.bookMarkText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "bookMarkText");
        textView.setText(getCurrentLabel());
        if (getButtonState() instanceof C5902d) {
            ProgressBar progressBar = (ProgressBar) mo2145c(C7310d.bookMarkProgressBar);
            String str = "bookMarkProgressBar";
            Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, str);
            LayoutParams layoutParams = progressBar.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                float f = this.f13676t0;
                float f2 = f - this.f13675s0;
                float sqrt = f - ((float) Math.sqrt((double) ((f * f) - (f2 * f2))));
                layoutParams2.setMarginStart(C12737d.m39876b(sqrt));
                layoutParams2.setMarginEnd(C12737d.m39876b(sqrt));
                ProgressBar progressBar2 = (ProgressBar) mo2145c(C7310d.bookMarkProgressBar);
                Intrinsics.checkReturnedValueIsNotNull((Object) progressBar2, str);
                progressBar2.setLayoutParams(layoutParams2);
                ProgressBar progressBar3 = (ProgressBar) mo2145c(C7310d.bookMarkProgressBar);
                Intrinsics.checkReturnedValueIsNotNull((Object) progressBar3, str);
                progressBar3.setVisibility(0);
                ProgressBar progressBar4 = (ProgressBar) mo2145c(C7310d.bookMarkProgressBar);
                Intrinsics.checkReturnedValueIsNotNull((Object) progressBar4, str);
                C5898a buttonState = getButtonState();
                if (buttonState != null) {
                    progressBar4.setProgress(((C5902d) buttonState).mo17804a());
                    return;
                }
                throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.detail.common.BookmarkButton.State.Resume");
            }
            throw new C13142s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public DefaultBookmarkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13675s0 = C5837i.m18837b(context, C7307a.playButtonProgressBarHeight);
        this.f13676t0 = C5837i.m18837b(context, C7307a.playButtonCornerRadius);
        ViewGroup.inflate(context, C7312f.bookmark_layout, this);
        setState(C5903e.f13694a);
        if (C5837i.m18843e(context)) {
            setOnFocusChangeListener(new C5894a(this));
        }
    }
}
