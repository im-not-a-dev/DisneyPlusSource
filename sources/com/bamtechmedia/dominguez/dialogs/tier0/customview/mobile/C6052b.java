package com.bamtechmedia.dominguez.dialogs.tier0.customview.mobile;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p163g.p201e.p203b.p299m.C7559q;
import p163g.p201e.p203b.p299m.p300y.C7569c;

/* renamed from: com.bamtechmedia.dominguez.dialogs.tier0.customview.mobile.b */
/* compiled from: Tier0ViewAnimationCoordinator.kt */
public final class C6052b {

    /* renamed from: a */
    private final Context f13941a;

    public C6052b(Context context) {
        this.f13941a = context;
    }

    /* renamed from: b */
    private final void m19395b(View view, int i) {
        view.setTranslationX((float) (i - view.getLeft()));
    }

    /* renamed from: a */
    public final void mo18307a(C7569c cVar, int i) {
        int left = cVar.mo20500c().getLeft() + ((cVar.mo20500c().getRight() - cVar.mo20500c().getLeft()) / 2);
        m19394a(cVar.mo20501d());
        m19392a(cVar.mo20499b(), i);
        m19395b(cVar.mo20502e(), i);
        m19393a(cVar.mo20500c(), i, left);
    }

    /* renamed from: a */
    private final void m19394a(TextView textView) {
        textView.setTranslationX((float) (textView.getLeft() - (textView.getLeft() + this.f13941a.getResources().getDimensionPixelSize(C7559q.message_text_initial_offset))));
    }

    /* renamed from: a */
    private final void m19392a(View view, int i) {
        view.setTranslationX((float) (i - view.getRight()));
    }

    /* renamed from: a */
    private final void m19393a(ImageView imageView, int i, int i2) {
        imageView.setTranslationX((float) (i - i2));
    }
}
