package com.bamtechmedia.dominguez.about.p052r.p053i;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.bamtechmedia.dominguez.about.C2283n;
import com.bamtechmedia.dominguez.about.C2284o;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0016\u001a\u00020\tHÂ\u0003J\t\u0010\u0017\u001a\u00020\tHÂ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\fHÂ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/core/AboutTogglePreferenceItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "titleResId", "", "preferences", "Landroid/content/SharedPreferences;", "preferenceKey", "", "defaultValue", "", "checked", "callbackOnChanged", "Lkotlin/Function0;", "", "(ILandroid/content/SharedPreferences;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "bind", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "getLayout", "hashCode", "toString", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.i.d */
/* compiled from: AboutTogglePreferenceItem.kt */
public final class C2328d extends C11866a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final SharedPreferences f6489U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final String f6490V;

    /* renamed from: W */
    private final boolean f6491W;

    /* renamed from: X */
    private final boolean f6492X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final Function0<C13145v> f6493Y;

    /* renamed from: c */
    private final int f6494c;

    /* renamed from: com.bamtechmedia.dominguez.about.r.i.d$a */
    /* compiled from: AboutTogglePreferenceItem.kt */
    static final class C2329a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C2329a f6495c = new C2329a();

        C2329a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.r.i.d$b */
    /* compiled from: AboutTogglePreferenceItem.kt */
    static final class C2330b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2328d f6496a;

        C2330b(C2328d dVar) {
            this.f6496a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Editor edit = this.f6496a.f6489U.edit();
            Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
            edit.putBoolean(this.f6496a.f6490V, z);
            edit.apply();
            this.f6496a.f6493Y.invoke();
        }
    }

    public /* synthetic */ C2328d(int i, SharedPreferences sharedPreferences, String str, boolean z, boolean z2, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 16) != 0) {
            z2 = sharedPreferences.getBoolean(str, z);
        }
        boolean z3 = z2;
        if ((i2 & 32) != 0) {
            function0 = C2329a.f6495c;
        }
        this(i, sharedPreferences, str, z, z3, function0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2328d) {
                C2328d dVar = (C2328d) obj;
                if ((this.f6494c == dVar.f6494c) && Intrinsics.areEqual((Object) this.f6489U, (Object) dVar.f6489U) && Intrinsics.areEqual((Object) this.f6490V, (Object) dVar.f6490V)) {
                    if (this.f6491W == dVar.f6491W) {
                        if (!(this.f6492X == dVar.f6492X) || !Intrinsics.areEqual((Object) this.f6493Y, (Object) dVar.f6493Y)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getLayout() {
        return C2284o.item_about_toggle_preference;
    }

    public int hashCode() {
        int i = this.f6494c * 31;
        SharedPreferences sharedPreferences = this.f6489U;
        int i2 = 0;
        int hashCode = (i + (sharedPreferences != null ? sharedPreferences.hashCode() : 0)) * 31;
        String str = this.f6490V;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f6491W;
        if (z) {
            z = true;
        }
        int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f6492X;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Function0<C13145v> function0 = this.f6493Y;
        if (function0 != null) {
            i2 = function0.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AboutTogglePreferenceItem(titleResId=");
        sb.append(this.f6494c);
        sb.append(", preferences=");
        sb.append(this.f6489U);
        sb.append(", preferenceKey=");
        sb.append(this.f6490V);
        sb.append(", defaultValue=");
        sb.append(this.f6491W);
        sb.append(", checked=");
        sb.append(this.f6492X);
        sb.append(", callbackOnChanged=");
        sb.append(this.f6493Y);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        SwitchCompat switchCompat = (SwitchCompat) bVar.mo20994a().findViewById(C2283n.about_item_toggle);
        switchCompat.setText(this.f6494c);
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(this.f6492X);
        switchCompat.setOnCheckedChangeListener(new C2330b(this));
    }

    public C2328d(int i, SharedPreferences sharedPreferences, String str, boolean z, boolean z2, Function0<C13145v> function0) {
        super((long) i);
        this.f6494c = i;
        this.f6489U = sharedPreferences;
        this.f6490V = str;
        this.f6491W = z;
        this.f6492X = z2;
        this.f6493Y = function0;
    }
}
