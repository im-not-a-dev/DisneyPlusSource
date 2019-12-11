package p096e.p155q.p156a.p157a;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build.VERSION;
import p096e.p155q.p156a.p157a.C4334a.C4335a;

/* renamed from: e.q.a.a.j */
/* compiled from: WatchNextProgram */
public final class C4354j extends C4334a {

    /* renamed from: e.q.a.a.j$a */
    /* compiled from: WatchNextProgram */
    public static final class C4355a extends C4335a<C4355a> {
        /* renamed from: a */
        public C4354j mo15237a() {
            return new C4354j(this);
        }

        /* renamed from: i */
        public C4355a mo15238i(long j) {
            this.f10788a.put("last_engagement_time_utc_millis", Long.valueOf(j));
            return this;
        }

        /* renamed from: o */
        public C4355a mo15239o(int i) {
            this.f10788a.put("watch_next_type", Integer.valueOf(i));
            return this;
        }
    }

    static {
        m15021f();
    }

    C4354j(C4355a aVar) {
        super(aVar);
    }

    /* renamed from: f */
    private static String[] m15021f() {
        String[] strArr = {"watch_next_type", "last_engagement_time_utc_millis"};
        return (String[]) C4338c.m14968a(C4334a.f10784c, strArr);
    }

    /* renamed from: a */
    public ContentValues mo15139a(boolean z) {
        ContentValues a = super.mo15139a(z);
        if (VERSION.SDK_INT < 26) {
            a.remove("watch_next_type");
            a.remove("last_engagement_time_utc_millis");
        }
        return a;
    }

    /* renamed from: b */
    public ContentValues mo15170b() {
        return mo15139a(false);
    }

    /* renamed from: e */
    public int mo15234e() {
        Integer asInteger = this.f10787a.getAsInteger("watch_next_type");
        if (asInteger == null) {
            return -1;
        }
        return asInteger.intValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4354j)) {
            return false;
        }
        return this.f10787a.equals(((C4354j) obj).f10787a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WatchNextProgram{");
        sb.append(this.f10787a.toString());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static C4354j m15020a(Cursor cursor) {
        C4355a aVar = new C4355a();
        C4334a.m14906a(cursor, aVar);
        int columnIndex = cursor.getColumnIndex("watch_next_type");
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            aVar.mo15239o(cursor.getInt(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("last_engagement_time_utc_millis");
        if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
            aVar.mo15238i(cursor.getLong(columnIndex2));
        }
        return aVar.mo15237a();
    }
}
