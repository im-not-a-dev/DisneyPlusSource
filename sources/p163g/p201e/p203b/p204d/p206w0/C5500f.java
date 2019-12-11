package p163g.p201e.p203b.p204d.p206w0;

import android.widget.TextView;
import com.bamtech.sdk4.subscription.Subscription;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p204d.C5411n0;
import p163g.p201e.p203b.p204d.C5413o0;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: g.e.b.d.w0.f */
/* compiled from: SubscriptionTvItem.kt */
public final class C5500f extends C11866a {

    /* renamed from: U */
    private final C3572r0 f13038U;

    /* renamed from: c */
    private final List<Subscription> f13039c;

    public C5500f(List<Subscription> list, C3572r0 r0Var) {
        this.f13039c = list;
        this.f13038U = r0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13038U, (java.lang.Object) r3.f13038U) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p163g.p201e.p203b.p204d.p206w0.C5500f
            if (r0 == 0) goto L_0x001d
            g.e.b.d.w0.f r3 = (p163g.p201e.p203b.p204d.p206w0.C5500f) r3
            java.util.List<com.bamtech.sdk4.subscription.Subscription> r0 = r2.f13039c
            java.util.List<com.bamtech.sdk4.subscription.Subscription> r1 = r3.f13039c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.config.r0 r0 = r2.f13038U
            com.bamtechmedia.dominguez.config.r0 r3 = r3.f13038U
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p206w0.C5500f.equals(java.lang.Object):boolean");
    }

    public long getId() {
        return (long) getLayout();
    }

    public int getLayout() {
        return C5413o0.account_setting_subscription_tv_item;
    }

    public int hashCode() {
        List<Subscription> list = this.f13039c;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C3572r0 r0Var = this.f13038U;
        if (r0Var != null) {
            i = r0Var.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscriptionTvItem(subscriptions=");
        sb.append(this.f13039c);
        sb.append(", dictionary=");
        sb.append(this.f13038U);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        Object obj;
        Iterator it = this.f13039c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Subscription) obj).isActive()) {
                break;
            }
        }
        Subscription subscription = (Subscription) obj;
        if (subscription != null) {
            TextView textView = (TextView) bVar.mo20994a().findViewById(C5411n0.subscription_title);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "viewHolder.subscription_title");
            textView.setText(C3573a.m12037b(this.f13038U, C5499e.m18288b(subscription), null, 2, null));
            TextView textView2 = (TextView) bVar.mo20994a().findViewById(C5411n0.subscription_copy);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "viewHolder.subscription_copy");
            textView2.setText(C3573a.m12037b(this.f13038U, C5499e.m18286a(subscription), null, 2, null));
        }
    }
}
