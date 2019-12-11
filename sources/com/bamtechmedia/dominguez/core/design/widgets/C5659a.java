package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/CheckableImageButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checked", "", "oneToTwo", "Landroid/graphics/drawable/Drawable;", "getOneToTwo", "()Landroid/graphics/drawable/Drawable;", "twoToOne", "getTwoToOne", "isChecked", "onRestoreInstanceState", "", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "setChecked", "toggle", "transformIcon", "Companion", "OutState", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.a */
/* compiled from: CheckableImageButton.kt */
public abstract class C5659a extends AppCompatImageView implements Checkable {

    /* renamed from: V */
    private boolean f13295V;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.a$a */
    /* compiled from: CheckableImageButton.kt */
    public static final class C5660a {
        private C5660a() {
        }

        public /* synthetic */ C5660a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/CheckableImageButton$OutState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "booleanState", "", "getBooleanState", "()Z", "setBooleanState", "(Z)V", "writeToParcel", "", "out", "flags", "", "Companion", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.a$b */
    /* compiled from: CheckableImageButton.kt */
    public static final class C5661b extends BaseSavedState {
        public static final Creator<C5661b> CREATOR = new C5662a();

        /* renamed from: c */
        private boolean f13296c;

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.a$b$a */
        /* compiled from: CheckableImageButton.kt */
        public static final class C5662a implements Creator<C5661b> {
            C5662a() {
            }

            public C5661b createFromParcel(Parcel parcel) {
                return new C5661b(parcel, null);
            }

            public C5661b[] newArray(int i) {
                return new C5661b[i];
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.a$b$b */
        /* compiled from: CheckableImageButton.kt */
        public static final class C5663b {
            private C5663b() {
            }

            public /* synthetic */ C5663b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C5663b(null);
        }

        public /* synthetic */ C5661b(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* renamed from: X */
        public final boolean mo17480X() {
            return this.f13296c;
        }

        /* renamed from: a */
        public final void mo17481a(boolean z) {
            this.f13296c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13296c ? 1 : 0);
        }

        public C5661b(Parcelable parcelable) {
            super(parcelable);
        }

        private C5661b(Parcel parcel) {
            super(parcel);
            this.f13296c = parcel.readInt() != 0;
        }
    }

    static {
        new C5660a(null);
    }

    public C5659a(Context context) {
        this(context, null, 0, 6, null);
    }

    public C5659a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ C5659a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m18513a() {
        Drawable oneToTwo = isChecked() ? getOneToTwo() : getTwoToOne();
        setImageDrawable(oneToTwo);
        if (!(oneToTwo instanceof Animatable)) {
            oneToTwo = null;
        }
        Animatable animatable = (Animatable) oneToTwo;
        if (animatable != null) {
            animatable.start();
        }
    }

    public abstract Drawable getOneToTwo();

    public abstract Drawable getTwoToOne();

    public boolean isChecked() {
        return this.f13295V;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C5661b bVar = (C5661b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.mo17480X());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C5661b bVar = new C5661b(super.onSaveInstanceState());
        bVar.mo17481a(this.f13295V);
        return bVar;
    }

    public void setChecked(boolean z) {
        if (this.f13295V != z) {
            this.f13295V = z;
            m18513a();
        }
    }

    public void toggle() {
        setChecked(!this.f13295V);
        m18513a();
    }

    public C5659a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843379}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            setContentDescription(C5880u.m18936a(resourceId));
        }
        obtainStyledAttributes.recycle();
    }
}
