package p096e.p138i.p139a;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: e.i.a.b */
/* compiled from: CursorFilter */
class C4201b extends Filter {

    /* renamed from: a */
    C4202a f10510a;

    /* renamed from: e.i.a.b$a */
    /* compiled from: CursorFilter */
    interface C4202a {
        /* renamed from: a */
        Cursor mo14841a();

        /* renamed from: a */
        Cursor mo1803a(CharSequence charSequence);

        /* renamed from: a */
        void mo1806a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo1809b(Cursor cursor);
    }

    C4201b(C4202a aVar) {
        this.f10510a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f10510a.mo1809b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f10510a.mo1803a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f10510a.mo14841a();
        Object obj = filterResults.values;
        if (obj != null && obj != a) {
            this.f10510a.mo1806a((Cursor) obj);
        }
    }
}
