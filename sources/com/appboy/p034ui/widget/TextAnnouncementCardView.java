package com.appboy.p034ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.appboy.p030r.p031o.C1550f;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.actions.IAction;
import com.appboy.p034ui.feed.view.BaseFeedCardView;

/* renamed from: com.appboy.ui.widget.TextAnnouncementCardView */
public class TextAnnouncementCardView extends BaseFeedCardView<C1550f> {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(TextAnnouncementCardView.class);
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_text_announcement_card;
    }

    public TextAnnouncementCardView(Context context, C1550f fVar) {
        super(context);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_text_announcement_card_domain);
        if (fVar != null) {
            setCard(fVar);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1550f fVar) {
        this.mTitle.setText(fVar.mo6890U());
        this.mDescription.setText(fVar.mo6888S());
        setOptionalTextView(this.mDomain, fVar.mo6889T());
        this.mCardAction = BaseCardView.getUriActionForCard(fVar);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                TextAnnouncementCardView textAnnouncementCardView = TextAnnouncementCardView.this;
                textAnnouncementCardView.handleCardClick(textAnnouncementCardView.mContext, fVar, textAnnouncementCardView.mCardAction, TextAnnouncementCardView.TAG);
            }
        });
    }
}
