package com.bamtechmedia.dominguez.detail.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5902d;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5903e;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.C7315i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/KidsBookmarkButton;", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressBar", "Landroid/widget/ProgressBar;", "progressBarId", "progressTextView", "Landroid/widget/TextView;", "progressTextViewId", "onAttachedToWindow", "", "setChildViewProperties", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KidsBookmarkButton.kt */
public final class KidsBookmarkButton extends C5897a {

    /* renamed from: s0 */
    private ProgressBar f13683s0;

    /* renamed from: t0 */
    private TextView f13684t0;

    /* renamed from: u0 */
    private int f13685u0;

    /* renamed from: v0 */
    private int f13686v0;

    public KidsBookmarkButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public KidsBookmarkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ KidsBookmarkButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    public void mo2144c() {
        ProgressBar progressBar = this.f13683s0;
        if (progressBar != null) {
            C4127b0.m14131b(progressBar, getButtonState() instanceof C5902d);
        }
        TextView textView = this.f13684t0;
        if (textView != null) {
            C4127b0.m14131b(textView, getButtonState() instanceof C5902d);
        }
        ProgressBar progressBar2 = this.f13683s0;
        String str = null;
        if (progressBar2 != null) {
            C5898a buttonState = getButtonState();
            if (!(buttonState instanceof C5902d)) {
                buttonState = null;
            }
            C5902d dVar = (C5902d) buttonState;
            progressBar2.setProgress(dVar != null ? dVar.mo17804a() : 0);
        }
        TextView textView2 = this.f13684t0;
        if (textView2 != null) {
            C5898a buttonState2 = getButtonState();
            if (!(buttonState2 instanceof C5902d)) {
                buttonState2 = null;
            }
            C5902d dVar2 = (C5902d) buttonState2;
            if (dVar2 != null) {
                str = dVar2.mo17805b();
            }
            textView2.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        String str = "null cannot be cast to non-null type android.view.View";
        if (parent != null) {
            this.f13683s0 = (ProgressBar) ((View) parent).findViewById(this.f13685u0);
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                this.f13684t0 = (TextView) ((View) parent2).findViewById(this.f13686v0);
                setState(getButtonState());
                return;
            }
            throw new C13142s(str);
        }
        throw new C13142s(str);
    }

    public KidsBookmarkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, C7312f.bookmark_kids_layout, this);
        int[] iArr = C7315i.KidsBookmarkButton;
        C12880j.m40222a((Object) iArr, "R.styleable.KidsBookmarkButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f13685u0 = obtainStyledAttributes.getResourceId(C7315i.KidsBookmarkButton_bookmarkProgressBar, 0);
        this.f13686v0 = obtainStyledAttributes.getResourceId(C7315i.KidsBookmarkButton_bookmarkProgressTextView, 0);
        obtainStyledAttributes.recycle();
        setState(C5903e.f13694a);
    }
}
