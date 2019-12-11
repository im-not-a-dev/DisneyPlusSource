package p096e.p138i.p139a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: e.i.a.a */
/* compiled from: CursorAdapter */
public abstract class C4198a extends BaseAdapter implements Filterable, C4202a {

    /* renamed from: U */
    protected boolean f10500U;

    /* renamed from: V */
    protected Cursor f10501V;

    /* renamed from: W */
    protected Context f10502W;

    /* renamed from: X */
    protected int f10503X;

    /* renamed from: Y */
    protected C4199a f10504Y;

    /* renamed from: Z */
    protected DataSetObserver f10505Z;

    /* renamed from: a0 */
    protected C4201b f10506a0;

    /* renamed from: c */
    protected boolean f10507c;

    /* renamed from: e.i.a.a$a */
    /* compiled from: CursorAdapter */
    private class C4199a extends ContentObserver {
        C4199a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C4198a.this.mo14844b();
        }
    }

    /* renamed from: e.i.a.a$b */
    /* compiled from: CursorAdapter */
    private class C4200b extends DataSetObserver {
        C4200b() {
        }

        public void onChanged() {
            C4198a aVar = C4198a.this;
            aVar.f10507c = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C4198a aVar = C4198a.this;
            aVar.f10507c = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C4198a(Context context, Cursor cursor, boolean z) {
        mo14843a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public abstract View mo14842a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14843a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f10500U = true;
        } else {
            this.f10500U = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f10501V = cursor;
        this.f10507c = z;
        this.f10502W = context;
        this.f10503X = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f10504Y = new C4199a();
            this.f10505Z = new C4200b();
        } else {
            this.f10504Y = null;
            this.f10505Z = null;
        }
        if (z) {
            C4199a aVar = this.f10504Y;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10505Z;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo1807a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract View mo1808b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: b */
    public abstract CharSequence mo1809b(Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14844b() {
        if (this.f10500U) {
            Cursor cursor = this.f10501V;
            if (cursor != null && !cursor.isClosed()) {
                this.f10507c = this.f10501V.requery();
            }
        }
    }

    /* renamed from: c */
    public Cursor mo14845c(Cursor cursor) {
        Cursor cursor2 = this.f10501V;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C4199a aVar = this.f10504Y;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10505Z;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f10501V = cursor;
        if (cursor != null) {
            C4199a aVar2 = this.f10504Y;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f10505Z;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f10503X = cursor.getColumnIndexOrThrow("_id");
            this.f10507c = true;
            notifyDataSetChanged();
        } else {
            this.f10503X = -1;
            this.f10507c = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public int getCount() {
        if (this.f10507c) {
            Cursor cursor = this.f10501V;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10507c) {
            return null;
        }
        this.f10501V.moveToPosition(i);
        if (view == null) {
            view = mo14842a(this.f10502W, this.f10501V, viewGroup);
        }
        mo1807a(view, this.f10502W, this.f10501V);
        return view;
    }

    public Filter getFilter() {
        if (this.f10506a0 == null) {
            this.f10506a0 = new C4201b(this);
        }
        return this.f10506a0;
    }

    public Object getItem(int i) {
        if (this.f10507c) {
            Cursor cursor = this.f10501V;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.f10501V;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.f10507c) {
            Cursor cursor = this.f10501V;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.f10501V.getLong(this.f10503X);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10507c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f10501V.moveToPosition(i)) {
            if (view == null) {
                view = mo1808b(this.f10502W, this.f10501V, viewGroup);
            }
            mo1807a(view, this.f10502W, this.f10501V);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public Cursor mo14841a() {
        return this.f10501V;
    }

    /* renamed from: a */
    public void mo1806a(Cursor cursor) {
        Cursor c = mo14845c(cursor);
        if (c != null) {
            c.close();
        }
    }
}
