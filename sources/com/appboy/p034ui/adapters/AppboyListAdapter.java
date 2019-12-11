package com.appboy.p034ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.appboy.p030r.p031o.C1545a;
import com.appboy.p030r.p031o.C1546b;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p030r.p031o.C1549e;
import com.appboy.p030r.p031o.C1550f;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.feed.view.BaseFeedCardView;
import com.appboy.p034ui.widget.BannerImageCardView;
import com.appboy.p034ui.widget.CaptionedImageCardView;
import com.appboy.p034ui.widget.DefaultCardView;
import com.appboy.p034ui.widget.ShortNewsCardView;
import com.appboy.p034ui.widget.TextAnnouncementCardView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.appboy.ui.adapters.AppboyListAdapter */
public class AppboyListAdapter extends ArrayAdapter<C1547c> {
    private static final String TAG = C1557c.m7461a(AppboyListAdapter.class);
    private final Set<String> mCardIdImpressions = new HashSet();
    private final Context mContext;

    public AppboyListAdapter(Context context, int i, List<C1547c> list) {
        super(context, i, list);
        this.mContext = context;
    }

    private void logCardImpression(C1547c cVar) {
        String K = cVar.mo6866K();
        if (!this.mCardIdImpressions.contains(K)) {
            this.mCardIdImpressions.add(K);
            cVar.mo6883z();
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Logged impression for card ");
            sb.append(K);
            C1557c.m7471d(str, sb.toString());
        } else {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Already counted impression for card ");
            sb2.append(K);
            C1557c.m7471d(str2, sb2.toString());
        }
        if (!cVar.mo6870P()) {
            cVar.mo6878f(true);
        }
    }

    public void batchSetCardsToRead(int i, int i2) {
        if (getCount() == 0) {
            C1557c.m7458a(TAG, "mAdapter is empty in setting some cards to viewed.");
            return;
        }
        int max = Math.max(0, i);
        int min = Math.min(getCount(), i2);
        while (true) {
            if (max >= min) {
                break;
            }
            C1547c cVar = (C1547c) getItem(max);
            if (cVar == null) {
                C1557c.m7458a(TAG, "Card was null in setting some cards to viewed.");
                break;
            }
            if (!cVar.mo6872R()) {
                cVar.mo6876d(true);
            }
            max++;
        }
    }

    public int getItemViewType(int i) {
        C1547c cVar = (C1547c) getItem(i);
        if (cVar instanceof C1545a) {
            return 1;
        }
        if (cVar instanceof C1546b) {
            return 2;
        }
        if (cVar instanceof C1549e) {
            return 3;
        }
        return cVar instanceof C1550f ? 4 : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseFeedCardView baseFeedCardView;
        C1547c cVar = (C1547c) getItem(i);
        if (view != null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Reusing convertView for rendering of item ");
            sb.append(i);
            C1557c.m7471d(str, sb.toString());
            baseFeedCardView = (BaseFeedCardView) view;
        } else if (cVar instanceof C1545a) {
            baseFeedCardView = new BannerImageCardView(this.mContext);
        } else if (cVar instanceof C1546b) {
            baseFeedCardView = new CaptionedImageCardView(this.mContext);
        } else if (cVar instanceof C1549e) {
            baseFeedCardView = new ShortNewsCardView(this.mContext);
        } else if (cVar instanceof C1550f) {
            baseFeedCardView = new TextAnnouncementCardView(this.mContext);
        } else {
            baseFeedCardView = new DefaultCardView(this.mContext);
        }
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Using view of type: ");
        sb2.append(baseFeedCardView.getClass().getName());
        sb2.append(" for card at position ");
        sb2.append(i);
        sb2.append(": ");
        sb2.append(cVar.toString());
        C1557c.m7471d(str2, sb2.toString());
        baseFeedCardView.setCard(cVar);
        logCardImpression(cVar);
        return baseFeedCardView;
    }

    public int getViewTypeCount() {
        return 5;
    }

    public synchronized void replaceFeed(List<C1547c> list) {
        int i = 0;
        setNotifyOnChange(false);
        if (list == null) {
            clear();
            notifyDataSetChanged();
            return;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Replacing existing feed of ");
        sb.append(getCount());
        sb.append(" cards with new feed containing ");
        sb.append(list.size());
        sb.append(" cards.");
        C1557c.m7458a(str, sb.toString());
        int size = list.size();
        int i2 = 0;
        while (i < getCount()) {
            C1547c cVar = (C1547c) getItem(i);
            C1547c cVar2 = null;
            if (i2 < size) {
                cVar2 = (C1547c) list.get(i2);
            }
            if (cVar2 == null || !cVar2.mo6874a(cVar)) {
                remove(cVar);
            } else {
                i++;
                i2++;
            }
        }
        super.addAll(list.subList(i2, size));
        notifyDataSetChanged();
    }

    public void resetCardImpressionTracker() {
        this.mCardIdImpressions.clear();
    }

    public synchronized void add(C1547c cVar) {
        super.add(cVar);
    }
}
