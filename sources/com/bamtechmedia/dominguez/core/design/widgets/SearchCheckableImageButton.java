package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bamtechmedia.dominguez.core.p088i.C3836f;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p097a.p098k.p099a.C3868a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/SearchCheckableImageButton;", "Lcom/bamtechmedia/dominguez/core/design/widgets/CheckableImageButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oneToTwo", "Landroid/graphics/drawable/Drawable;", "getOneToTwo", "()Landroid/graphics/drawable/Drawable;", "twoToOne", "getTwoToOne", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CheckableImageButton.kt */
public final class SearchCheckableImageButton extends C5659a {

    /* renamed from: W */
    private final Drawable f13279W;

    /* renamed from: a0 */
    private final Drawable f13280a0;

    public SearchCheckableImageButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchCheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SearchCheckableImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public Drawable getOneToTwo() {
        return this.f13279W;
    }

    public Drawable getTwoToOne() {
        return this.f13280a0;
    }

    public SearchCheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable c = C3868a.m12946c(context, C3836f.search_to_back);
        if (c != null) {
            C12880j.m40222a((Object) c, "AppCompatResources.getDr…rawable.search_to_back)!!");
            this.f13279W = c;
            Drawable c2 = C3868a.m12946c(context, C3836f.back_to_search);
            if (c2 != null) {
                C12880j.m40222a((Object) c2, "AppCompatResources.getDr…rawable.back_to_search)!!");
                this.f13280a0 = c2;
                setImageDrawable(getTwoToOne());
                return;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }
}
