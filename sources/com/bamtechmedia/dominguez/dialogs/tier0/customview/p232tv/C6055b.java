package com.bamtechmedia.dominguez.dialogs.tier0.customview.p232tv;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p163g.p201e.p203b.p299m.C7559q;
import p163g.p201e.p203b.p299m.p300y.C7569c;

/* renamed from: com.bamtechmedia.dominguez.dialogs.tier0.customview.tv.b */
/* compiled from: Tier0TvViewAnimationCoordinator.kt */
public final class C6055b {

    /* renamed from: a */
    private final Context f13946a;

    public C6055b(Context context) {
        this.f13946a = context;
    }

    /* renamed from: a */
    public final void mo18310a(C7569c cVar) {
        m19406a(cVar.mo20501d());
        m19404a(cVar.mo20499b(), cVar.mo20498a());
        m19405a(cVar.mo20500c(), cVar.mo20502e());
    }

    /* renamed from: a */
    private final void m19406a(TextView textView) {
        textView.setTranslationX((float) this.f13946a.getResources().getDimensionPixelSize(C7559q.message_text_initial_offset));
    }

    /* renamed from: a */
    private final void m19404a(View view, View view2) {
        view.setTranslationX((float) view2.getWidth());
    }

    /* renamed from: a */
    private final void m19405a(ImageView imageView, View view) {
        imageView.setTranslationX((float) (view.getLeft() - (imageView.getLeft() + ((imageView.getRight() - imageView.getLeft()) / 2))));
    }
}
