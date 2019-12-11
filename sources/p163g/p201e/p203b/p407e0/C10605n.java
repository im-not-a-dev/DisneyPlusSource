package p163g.p201e.p203b.p407e0;

import android.view.View;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import kotlin.jvm.internal.C12880j;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: g.e.b.e0.n */
/* compiled from: WatchlistTVHeaderItem.kt */
public final class C10605n extends C11866a {

    /* renamed from: c */
    private final int f25046c;

    public C10605n(int i) {
        this.f25046c = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10605n) {
                if (this.f25046c == ((C10605n) obj).f25046c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int getLayout() {
        return C10590c.watchlist_header_item;
    }

    public int hashCode() {
        return this.f25046c;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return eVar instanceof C10605n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WatchlistTVHeaderItem(resId=");
        sb.append(this.f25046c);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        View view = bVar.itemView;
        C12880j.m40222a((Object) view, "viewHolder.itemView");
        TextView textView = (TextView) view.findViewById(C10589b.watchlistHeaderTextView);
        C12880j.m40222a((Object) textView, "viewHolder.itemView.watchlistHeaderTextView");
        textView.setText(C5880u.m18936a(this.f25046c));
    }
}
