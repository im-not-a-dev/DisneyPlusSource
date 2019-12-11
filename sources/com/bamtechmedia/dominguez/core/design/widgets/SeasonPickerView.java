package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/SeasonPickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "isNew", "()Z", "setNew", "(Z)V", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SeasonPickerView.kt */
public final class SeasonPickerView extends ConstraintLayout {

    /* renamed from: r0 */
    private String f13281r0;

    /* renamed from: s0 */
    private boolean f13282s0;

    /* renamed from: t0 */
    private HashMap f13283t0;

    public SeasonPickerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SeasonPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SeasonPickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13283t0 == null) {
            this.f13283t0 = new HashMap();
        }
        View view = (View) this.f13283t0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13283t0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getText() {
        return this.f13281r0;
    }

    public final void setNew(boolean z) {
        this.f13282s0 = z;
        TextView textView = (TextView) mo2145c(C3838h.seasonPickerBadge);
        C12880j.m40222a((Object) textView, "seasonPickerBadge");
        textView.setVisibility(this.f13282s0 ? 0 : 8);
    }

    public final void setText(String str) {
        TextView textView = (TextView) mo2145c(C3838h.seasonPickerText);
        C12880j.m40222a((Object) textView, "seasonPickerText");
        textView.setText(str);
        this.f13281r0 = str;
    }

    public SeasonPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13281r0 = "";
        ViewGroup.inflate(context, C3840j.series_season_picker, this);
    }
}
