package com.appboy.p027p;

import com.appboy.p025o.C1493b;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.appboy.p.b */
public final class C1517b {

    /* renamed from: e */
    private static final String f5553e = C1557c.m7461a(C1517b.class);

    /* renamed from: a */
    private final List<C1547c> f5554a;

    /* renamed from: b */
    private final String f5555b;

    /* renamed from: c */
    private final boolean f5556c;

    /* renamed from: d */
    private final long f5557d;

    public C1517b(List<C1547c> list, String str, boolean z, long j) {
        this.f5555b = str;
        this.f5556c = z;
        if (list != null) {
            this.f5554a = list;
            this.f5557d = j;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public boolean mo6758a() {
        return this.f5556c;
    }

    /* renamed from: b */
    public List<C1547c> mo6760b(EnumSet<C1493b> enumSet) {
        if (enumSet == null) {
            try {
                C1557c.m7469c(f5553e, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
                enumSet = C1493b.m7139a();
            } catch (Exception e) {
                String str = f5553e;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get cards with categories[");
                sb.append(enumSet);
                sb.append("]. Ignoring.");
                C1557c.m7474e(str, sb.toString(), e);
                return null;
            }
        }
        if (enumSet.isEmpty()) {
            C1557c.m7473e(f5553e, "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (C1547c cVar : this.f5554a) {
            if (cVar.mo6875a(enumSet) && !cVar.mo6871Q()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public int mo6761c(EnumSet<C1493b> enumSet) {
        if (enumSet == null) {
            C1557c.m7473e(f5553e, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
            return mo6761c(C1493b.m7139a());
        }
        int i = 0;
        if (enumSet.isEmpty()) {
            C1557c.m7473e(f5553e, "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        for (C1547c cVar : this.f5554a) {
            if (cVar.mo6875a(enumSet) && !cVar.mo6870P() && !cVar.mo6871Q()) {
                i++;
            }
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedUpdatedEvent{");
        sb.append("mFeedCards=");
        sb.append(this.f5554a);
        sb.append(", mUserId='");
        sb.append(this.f5555b);
        sb.append('\'');
        sb.append(", mFromOfflineStorage=");
        sb.append(this.f5556c);
        sb.append(", mTimestamp=");
        sb.append(this.f5557d);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public int mo6757a(EnumSet<C1493b> enumSet) {
        if (enumSet == null) {
            C1557c.m7469c(f5553e, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return this.f5554a.size();
        } else if (!enumSet.isEmpty()) {
            return mo6760b(enumSet).size();
        } else {
            C1557c.m7473e(f5553e, "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
    }

    /* renamed from: b */
    public long mo6759b() {
        return this.f5557d;
    }
}
