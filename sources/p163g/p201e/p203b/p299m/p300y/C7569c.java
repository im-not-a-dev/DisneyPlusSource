package p163g.p201e.p203b.p299m.p300y;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: g.e.b.m.y.c */
/* compiled from: FlashViewElements.kt */
public final class C7569c {

    /* renamed from: a */
    private final ImageView f16565a;

    /* renamed from: b */
    private final TextView f16566b;

    /* renamed from: c */
    private final View f16567c;

    /* renamed from: d */
    private final View f16568d;

    /* renamed from: e */
    private final View f16569e;

    public C7569c(ImageView imageView, TextView textView, View view, View view2, View view3) {
        this.f16565a = imageView;
        this.f16566b = textView;
        this.f16567c = view;
        this.f16568d = view2;
        this.f16569e = view3;
    }

    /* renamed from: a */
    public final View mo20498a() {
        return this.f16569e;
    }

    /* renamed from: b */
    public final View mo20499b() {
        return this.f16567c;
    }

    /* renamed from: c */
    public final ImageView mo20500c() {
        return this.f16565a;
    }

    /* renamed from: d */
    public final TextView mo20501d() {
        return this.f16566b;
    }

    /* renamed from: e */
    public final View mo20502e() {
        return this.f16568d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f16569e, (java.lang.Object) r3.f16569e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p163g.p201e.p203b.p299m.p300y.C7569c
            if (r0 == 0) goto L_0x003b
            g.e.b.m.y.c r3 = (p163g.p201e.p203b.p299m.p300y.C7569c) r3
            android.widget.ImageView r0 = r2.f16565a
            android.widget.ImageView r1 = r3.f16565a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            android.widget.TextView r0 = r2.f16566b
            android.widget.TextView r1 = r3.f16566b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            android.view.View r0 = r2.f16567c
            android.view.View r1 = r3.f16567c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            android.view.View r0 = r2.f16568d
            android.view.View r1 = r3.f16568d
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            android.view.View r0 = r2.f16569e
            android.view.View r3 = r3.f16569e
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p299m.p300y.C7569c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ImageView imageView = this.f16565a;
        int i = 0;
        int hashCode = (imageView != null ? imageView.hashCode() : 0) * 31;
        TextView textView = this.f16566b;
        int hashCode2 = (hashCode + (textView != null ? textView.hashCode() : 0)) * 31;
        View view = this.f16567c;
        int hashCode3 = (hashCode2 + (view != null ? view.hashCode() : 0)) * 31;
        View view2 = this.f16568d;
        int hashCode4 = (hashCode3 + (view2 != null ? view2.hashCode() : 0)) * 31;
        View view3 = this.f16569e;
        if (view3 != null) {
            i = view3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FlashViewElements(messageIcon=");
        sb.append(this.f16565a);
        sb.append(", messageText=");
        sb.append(this.f16566b);
        sb.append(", leftCapBackground=");
        sb.append(this.f16567c);
        sb.append(", rightCapBackground=");
        sb.append(this.f16568d);
        sb.append(", interCapBackground=");
        sb.append(this.f16569e);
        sb.append(")");
        return sb.toString();
    }
}
