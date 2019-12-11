package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p135s.C4124b;

/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.d */
/* compiled from: SaveButtonActionProvider.kt */
public final class C5667d extends C4124b {

    /* renamed from: c */
    public View f13301c;

    /* renamed from: d */
    public TextView f13302d;

    /* renamed from: e */
    public View f13303e;

    public C5667d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo17490a(boolean z) {
        TextView textView = this.f13302d;
        if (textView != null) {
            int i = 4;
            textView.setVisibility(z ? 4 : 0);
            View view = this.f13303e;
            if (view != null) {
                if (!(!z)) {
                    i = 0;
                }
                view.setVisibility(i);
                View view2 = this.f13301c;
                if (view2 != null) {
                    view2.setEnabled(!z);
                } else {
                    C12880j.m40227c("root");
                    throw null;
                }
            } else {
                C12880j.m40227c("progress");
                throw null;
            }
        } else {
            C12880j.m40227c("label");
            throw null;
        }
    }

    /* renamed from: d */
    public View mo958d() {
        View inflate = LayoutInflater.from(mo14688a()).inflate(C3840j.action_provider_save_button, null, false);
        C12880j.m40222a((Object) inflate, "LayoutInflater.from(cont…save_button, null, false)");
        this.f13301c = inflate;
        View view = this.f13301c;
        String str = "root";
        if (view != null) {
            View findViewById = view.findViewById(C3838h.label);
            C12880j.m40222a((Object) findViewById, "root.findViewById(R.id.label)");
            this.f13302d = (TextView) findViewById;
            View view2 = this.f13301c;
            if (view2 != null) {
                View findViewById2 = view2.findViewById(C3838h.progress);
                C12880j.m40222a((Object) findViewById2, "root.findViewById(R.id.progress)");
                this.f13303e = findViewById2;
                View view3 = this.f13301c;
                if (view3 != null) {
                    return view3;
                }
                C12880j.m40227c(str);
                throw null;
            }
            C12880j.m40227c(str);
            throw null;
        }
        C12880j.m40227c(str);
        throw null;
    }
}
