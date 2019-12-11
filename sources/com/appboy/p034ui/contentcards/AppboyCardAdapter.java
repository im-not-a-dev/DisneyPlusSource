package com.appboy.p034ui.contentcards;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0856f;
import androidx.recyclerview.widget.C0856f.C0858b;
import androidx.recyclerview.widget.C0856f.C0859c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.appboy.p034ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.appboy.p034ui.contentcards.view.ContentCardViewHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.appboy.ui.contentcards.AppboyCardAdapter */
public class AppboyCardAdapter extends C0797g<ContentCardViewHolder> implements ItemTouchHelperAdapter {
    private static final String TAG = C1557c.m7461a(AppboyCardAdapter.class);
    private List<C1547c> mCardData;
    private final IContentCardsViewBindingHandler mContentCardsViewBindingHandler;
    private final Context mContext;
    private final Handler mHandler;
    private Set<String> mImpressedCardIds = new HashSet();
    private final LinearLayoutManager mLayoutManager;

    /* renamed from: com.appboy.ui.contentcards.AppboyCardAdapter$CardListDiffCallback */
    private class CardListDiffCallback extends C0858b {
        private final List<C1547c> mNewCards;
        private final List<C1547c> mOldCards;

        CardListDiffCallback(AppboyCardAdapter appboyCardAdapter, List<C1547c> list, List<C1547c> list2) {
            this.mOldCards = list;
            this.mNewCards = list2;
        }

        private boolean doItemsShareIds(int i, int i2) {
            return ((C1547c) this.mOldCards.get(i)).mo6866K().equals(((C1547c) this.mNewCards.get(i2)).mo6866K());
        }

        public boolean areContentsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        public boolean areItemsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        public int getNewListSize() {
            return this.mNewCards.size();
        }

        public int getOldListSize() {
            return this.mOldCards.size();
        }
    }

    public AppboyCardAdapter(Context context, LinearLayoutManager linearLayoutManager, List<C1547c> list, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.mContext = context;
        this.mCardData = list;
        this.mHandler = new Handler();
        this.mLayoutManager = linearLayoutManager;
        this.mContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        setHasStableIds(true);
    }

    public List<String> getImpressedCardIds() {
        return new ArrayList(this.mImpressedCardIds);
    }

    public int getItemCount() {
        return this.mCardData.size();
    }

    public long getItemId(int i) {
        return (long) ((C1547c) this.mCardData.get(i)).mo6866K().hashCode();
    }

    public int getItemViewType(int i) {
        return this.mContentCardsViewBindingHandler.getItemViewType(this.mContext, this.mCardData, i);
    }

    /* access modifiers changed from: 0000 */
    public boolean isAdapterPositionOnScreen(int i) {
        return Math.min(this.mLayoutManager.mo4319I(), this.mLayoutManager.mo4318H()) <= i && Math.max(this.mLayoutManager.mo4321K(), this.mLayoutManager.mo4320J()) >= i;
    }

    public boolean isControlCardAtPosition(int i) {
        if (i < 0 || i >= this.mCardData.size()) {
            return false;
        }
        return ((C1547c) this.mCardData.get(i)).mo6880m();
    }

    public boolean isItemDismissable(int i) {
        if (this.mCardData.isEmpty()) {
            return false;
        }
        return ((C1547c) this.mCardData.get(i)).mo6867L();
    }

    /* access modifiers changed from: 0000 */
    public void logImpression(C1547c cVar) {
        if (!this.mImpressedCardIds.contains(cVar.mo6866K())) {
            cVar.mo6883z();
            this.mImpressedCardIds.add(cVar.mo6866K());
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Logged impression for card ");
            sb.append(cVar.mo6866K());
            C1557c.m7471d(str, sb.toString());
        } else {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Already counted impression for card ");
            sb2.append(cVar.mo6866K());
            C1557c.m7471d(str2, sb2.toString());
        }
        if (!cVar.mo6870P()) {
            cVar.mo6878f(true);
        }
    }

    public void markOnScreenCardsAsRead() {
        if (this.mCardData.isEmpty()) {
            C1557c.m7458a(TAG, "Card list is empty. Not marking on-screen cards as read.");
            return;
        }
        final int I = this.mLayoutManager.mo4319I();
        final int K = this.mLayoutManager.mo4321K();
        if (I < 0 || K < 0) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ");
            sb.append(I);
            sb.append(" . Last visible: ");
            sb.append(K);
            C1557c.m7458a(str, sb.toString());
            return;
        }
        for (int i = I; i <= K; i++) {
            ((C1547c) this.mCardData.get(i)).mo6876d(true);
        }
        this.mHandler.post(new Runnable() {
            public void run() {
                int i = K;
                int i2 = I;
                AppboyCardAdapter.this.notifyItemRangeChanged(i2, (i - i2) + 1);
            }
        });
    }

    public void onItemDismiss(int i) {
        C1547c cVar = (C1547c) this.mCardData.remove(i);
        cVar.mo6877e(true);
        notifyItemRemoved(i);
        AppboyContentCardsManager.getInstance().getContentCardsActionListener().onContentCardDismissed(this.mContext, cVar);
    }

    public synchronized void replaceCards(List<C1547c> list) {
        C0859c a = C0856f.m4801a(new CardListDiffCallback(this, this.mCardData, list));
        this.mCardData.clear();
        this.mCardData.addAll(list);
        a.mo5012a((C0797g) this);
    }

    public void setImpressedCardIds(List<String> list) {
        this.mImpressedCardIds = new HashSet(list);
    }

    public void onBindViewHolder(ContentCardViewHolder contentCardViewHolder, int i) {
        this.mContentCardsViewBindingHandler.onBindViewHolder(this.mContext, this.mCardData, contentCardViewHolder, i);
    }

    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.mContentCardsViewBindingHandler.onCreateViewHolder(this.mContext, this.mCardData, viewGroup, i);
    }

    public void onViewAttachedToWindow(ContentCardViewHolder contentCardViewHolder) {
        super.onViewAttachedToWindow(contentCardViewHolder);
        if (!this.mCardData.isEmpty()) {
            int adapterPosition = contentCardViewHolder.getAdapterPosition();
            if (adapterPosition == -1 || !isAdapterPositionOnScreen(adapterPosition)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("The card at position ");
                sb.append(adapterPosition);
                sb.append(" isn't on screen or does not have a valid adapter position. Not logging impression.");
                C1557c.m7471d(str, sb.toString());
                return;
            }
            logImpression((C1547c) this.mCardData.get(adapterPosition));
        }
    }

    public void onViewDetachedFromWindow(ContentCardViewHolder contentCardViewHolder) {
        super.onViewDetachedFromWindow(contentCardViewHolder);
        if (!this.mCardData.isEmpty()) {
            final int adapterPosition = contentCardViewHolder.getAdapterPosition();
            if (adapterPosition == -1 || !isAdapterPositionOnScreen(adapterPosition)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("The card at position ");
                sb.append(adapterPosition);
                sb.append(" isn't on screen or does not have a valid adapter position. Not marking as read.");
                C1557c.m7471d(str, sb.toString());
                return;
            }
            ((C1547c) this.mCardData.get(adapterPosition)).mo6876d(true);
            this.mHandler.post(new Runnable() {
                public void run() {
                    AppboyCardAdapter.this.notifyItemChanged(adapterPosition);
                }
            });
        }
    }
}
