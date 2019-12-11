package p096e.p155q.p156a.p157a;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build.VERSION;
import p096e.p155q.p156a.p157a.C4334a.C4335a;

/* renamed from: e.q.a.a.f */
/* compiled from: PreviewProgram */
public final class C4343f extends C4334a {

    /* renamed from: e.q.a.a.f$a */
    /* compiled from: PreviewProgram */
    public static final class C4344a extends C4335a<C4344a> {
        /* renamed from: a */
        public C4343f mo15231a() {
            return new C4343f(this);
        }

        /* renamed from: i */
        public C4344a mo15232i(long j) {
            this.f10788a.put("channel_id", Long.valueOf(j));
            return this;
        }

        /* renamed from: o */
        public C4344a mo15233o(int i) {
            this.f10788a.put("weight", Integer.valueOf(i));
            return this;
        }
    }

    static {
        m15001e();
    }

    C4343f(C4344a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static String[] m15001e() {
        String[] strArr = {"channel_id", "weight"};
        return (String[]) C4338c.m14968a(C4334a.f10784c, strArr);
    }

    /* renamed from: a */
    public ContentValues mo15139a(boolean z) {
        ContentValues a = super.mo15139a(z);
        if (VERSION.SDK_INT < 26) {
            a.remove("channel_id");
            a.remove("weight");
        }
        return a;
    }

    /* renamed from: b */
    public ContentValues mo15170b() {
        return mo15139a(false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4343f)) {
            return false;
        }
        return this.f10787a.equals(((C4343f) obj).f10787a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreviewProgram{");
        sb.append(this.f10787a.toString());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static C4343f m15000a(Cursor cursor) {
        C4344a aVar = new C4344a();
        C4334a.m14906a(cursor, aVar);
        int columnIndex = cursor.getColumnIndex("channel_id");
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            aVar.mo15232i(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("weight");
        if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
            aVar.mo15233o(cursor.getInt(columnIndex2));
        }
        return aVar.mo15231a();
    }
}
