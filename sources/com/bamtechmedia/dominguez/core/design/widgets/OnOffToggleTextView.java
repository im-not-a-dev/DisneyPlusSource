package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.Checkable;
import androidx.appcompat.widget.C0293w;
import com.bamtechmedia.dominguez.core.p088i.C3841k;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/OnOffToggleTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checked", "", "changeText", "", "isChecked", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "setChecked", "toggle", "OutState", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OnOffToggleTextView.kt */
public final class OnOffToggleTextView extends C0293w implements Checkable {

    /* renamed from: a0 */
    private boolean f13261a0;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/OnOffToggleTextView$OutState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "booleanState", "", "getBooleanState", "()Z", "setBooleanState", "(Z)V", "writeToParcel", "", "out", "flags", "", "Companion", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView$a */
    /* compiled from: OnOffToggleTextView.kt */
    public static final class C5648a extends BaseSavedState {
        public static final Creator<C5648a> CREATOR = new C5649a();

        /* renamed from: c */
        private boolean f13262c;

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView$a$a */
        /* compiled from: OnOffToggleTextView.kt */
        public static final class C5649a implements Creator<C5648a> {
            C5649a() {
            }

            public C5648a createFromParcel(Parcel parcel) {
                return new C5648a(parcel, null);
            }

            public C5648a[] newArray(int i) {
                return new C5648a[i];
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView$a$b */
        /* compiled from: OnOffToggleTextView.kt */
        public static final class C5650b {
            private C5650b() {
            }

            public /* synthetic */ C5650b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C5650b(null);
        }

        public /* synthetic */ C5648a(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* renamed from: X */
        public final boolean mo17454X() {
            return this.f13262c;
        }

        /* renamed from: a */
        public final void mo17455a(boolean z) {
            this.f13262c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13262c ? 1 : 0);
        }

        public C5648a(Parcelable parcelable) {
            super(parcelable);
        }

        private C5648a(Parcel parcel) {
            super(parcel);
            this.f13262c = parcel.readInt() != 0;
        }
    }

    public OnOffToggleTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public OnOffToggleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OnOffToggleTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: d */
    private final void m18492d() {
        if (isChecked()) {
            setText(C5880u.m18936a(C3841k.toggle_on));
        } else {
            setText(C5880u.m18936a(C3841k.toggle_off));
        }
    }

    public boolean isChecked() {
        return this.f13261a0;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C5648a aVar = (C5648a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setChecked(aVar.mo17454X());
    }

    public Parcelable onSaveInstanceState() {
        C5648a aVar = new C5648a(super.onSaveInstanceState());
        aVar.mo17455a(this.f13261a0);
        return aVar;
    }

    public void setChecked(boolean z) {
        if (this.f13261a0 != z) {
            this.f13261a0 = z;
            m18492d();
        }
    }

    public void toggle() {
        setChecked(!this.f13261a0);
        m18492d();
    }

    public OnOffToggleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18492d();
    }
}
