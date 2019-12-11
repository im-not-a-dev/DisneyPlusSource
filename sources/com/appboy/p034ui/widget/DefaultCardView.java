package com.appboy.p034ui.widget;

import android.content.Context;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.feed.view.BaseFeedCardView;

/* renamed from: com.appboy.ui.widget.DefaultCardView */
public class DefaultCardView extends BaseFeedCardView<C1547c> {
    private static final String TAG = C1557c.m7461a(DefaultCardView.class);

    public DefaultCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_default_card;
    }

    public void onSetCard(C1547c cVar) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("onSetCard called for blank view with: ");
        sb.append(cVar.toString());
        C1557c.m7473e(str, sb.toString());
    }

    public DefaultCardView(Context context, C1547c cVar) {
        super(context);
        if (cVar != null) {
            setCard(cVar);
        }
    }
}
