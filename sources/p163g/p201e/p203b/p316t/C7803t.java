package p163g.p201e.p203b.p316t;

import android.widget.TextView;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import kotlin.C12907r;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p202a.C5365h;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: g.e.b.t.t */
/* compiled from: VersionViewItem.kt */
public final class C7803t extends C11866a {

    /* renamed from: U */
    private final int f16896U;

    /* renamed from: c */
    private final String f16897c;

    public C7803t(String str, int i) {
        this.f16897c = str;
        this.f16896U = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7803t) {
                C7803t tVar = (C7803t) obj;
                if (Intrinsics.areEqual((Object) this.f16897c, (Object) tVar.f16897c)) {
                    if (this.f16896U == tVar.f16896U) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getLayout() {
        return C5364g.options_version_item;
    }

    public int hashCode() {
        String str = this.f16897c;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f16896U;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return eVar instanceof C7803t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VersionViewItem(versionName=");
        sb.append(this.f16897c);
        sb.append(", versionCode=");
        sb.append(this.f16896U);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        TextView textView = (TextView) bVar.mo20994a().findViewById(C5363f.title);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "viewHolder.title");
        int i2 = C5365h.app_version_number;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16897c);
        sb.append(" (");
        sb.append(this.f16896U);
        sb.append(')');
        textView.setText(C5880u.m18937a(i2, C13170i0.m40332a(C12907r.m40244a("app_version_number_build_number", sb.toString()))));
    }
}
