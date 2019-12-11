package p096e.p155q.p156a.p157a;

import android.content.ContentValues;
import android.database.Cursor;
import android.media.tv.TvContentRating;
import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: e.q.a.a.b */
/* compiled from: BaseProgram */
public abstract class C4336b {

    /* renamed from: b */
    public static final String[] f10786b = mo15140c();

    /* renamed from: a */
    protected ContentValues f10787a;

    /* renamed from: e.q.a.a.b$a */
    /* compiled from: BaseProgram */
    public static abstract class C4337a<T extends C4337a> {

        /* renamed from: a */
        protected ContentValues f10788a = new ContentValues();

        /* renamed from: a */
        public T mo15173a(long j) {
            this.f10788a.put("_id", Long.valueOf(j));
            return this;
        }

        /* renamed from: b */
        public T mo15184b(String str) {
            this.f10788a.put("episode_title", str);
            return this;
        }

        /* renamed from: c */
        public T mo15187c(int i) {
            mo15185b(String.valueOf(i), i);
            return this;
        }

        /* renamed from: d */
        public T mo15192d(String str) {
            this.f10788a.put("package_name", str);
            return this;
        }

        /* renamed from: e */
        public T mo15193e(int i) {
            this.f10788a.put("video_width", Integer.valueOf(i));
            return this;
        }

        /* renamed from: f */
        public T mo15196f(String str) {
            this.f10788a.put("season_title", str);
            return this;
        }

        /* renamed from: g */
        public T mo15197g(String str) {
            this.f10788a.put("title", str);
            return this;
        }

        /* renamed from: a */
        public T mo15172a(int i) {
            mo15176a(String.valueOf(i), i);
            return this;
        }

        /* renamed from: b */
        public T mo15185b(String str, int i) {
            if (VERSION.SDK_INT >= 24) {
                this.f10788a.put("season_display_number", str);
            } else {
                this.f10788a.put("season_number", Integer.valueOf(i));
            }
            return this;
        }

        /* renamed from: c */
        public T mo15189c(String str) {
            this.f10788a.put("long_description", str);
            return this;
        }

        /* renamed from: d */
        public T mo15190d(int i) {
            this.f10788a.put("video_height", Integer.valueOf(i));
            return this;
        }

        /* renamed from: e */
        public T mo15194e(long j) {
            this.f10788a.put("internal_provider_flag4", Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public T mo15176a(String str, int i) {
            if (VERSION.SDK_INT >= 24) {
                this.f10788a.put("episode_display_number", str);
            } else {
                this.f10788a.put("episode_number", Integer.valueOf(i));
            }
            return this;
        }

        /* renamed from: c */
        public T mo15188c(long j) {
            this.f10788a.put("internal_provider_flag2", Long.valueOf(j));
            return this;
        }

        /* renamed from: d */
        public T mo15191d(long j) {
            this.f10788a.put("internal_provider_flag3", Long.valueOf(j));
            return this;
        }

        /* renamed from: e */
        public T mo15195e(String str) {
            this.f10788a.put("review_rating", str);
            return this;
        }

        /* renamed from: b */
        public T mo15183b(Uri uri) {
            String str;
            ContentValues contentValues = this.f10788a;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            contentValues.put("thumbnail_uri", str);
            return this;
        }

        /* renamed from: a */
        public T mo15175a(String str) {
            this.f10788a.put("short_description", str);
            return this;
        }

        /* renamed from: a */
        public T mo15179a(TvContentRating[] tvContentRatingArr) {
            this.f10788a.put("content_rating", C4353i.m15016a(tvContentRatingArr));
            return this;
        }

        /* renamed from: b */
        public T mo15186b(String[] strArr) {
            this.f10788a.put("canonical_genre", C4352h.m15013a(strArr));
            return this;
        }

        /* renamed from: b */
        public T mo15182b(long j) {
            this.f10788a.put("internal_provider_flag1", Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public T mo15174a(Uri uri) {
            String str;
            ContentValues contentValues = this.f10788a;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            contentValues.put("poster_art_uri", str);
            return this;
        }

        /* renamed from: b */
        public T mo15181b(int i) {
            this.f10788a.put("review_rating_style", Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public T mo15178a(byte[] bArr) {
            this.f10788a.put("internal_provider_data", bArr);
            return this;
        }

        /* renamed from: a */
        public T mo15180a(String[] strArr) {
            this.f10788a.put("audio_language", C4353i.m15017a(strArr));
            return this;
        }

        /* renamed from: a */
        public T mo15177a(boolean z) {
            this.f10788a.put("searchable", Integer.valueOf(z ? 1 : 0));
            return this;
        }
    }

    C4336b(C4337a aVar) {
        this.f10787a = aVar.f10788a;
    }

    /* renamed from: c */
    private static String[] mo15140c() {
        String[] strArr = new String[16];
        strArr[0] = "_id";
        strArr[1] = "package_name";
        strArr[2] = "title";
        strArr[3] = "episode_title";
        strArr[4] = VERSION.SDK_INT >= 24 ? "season_display_number" : "season_number";
        strArr[5] = VERSION.SDK_INT >= 24 ? "episode_display_number" : "episode_number";
        strArr[6] = "short_description";
        strArr[7] = "long_description";
        strArr[8] = "poster_art_uri";
        strArr[9] = "thumbnail_uri";
        strArr[10] = "audio_language";
        strArr[11] = "canonical_genre";
        strArr[12] = "content_rating";
        strArr[13] = "video_width";
        strArr[14] = "video_height";
        strArr[15] = "internal_provider_data";
        String[] strArr2 = {"searchable", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
        String[] strArr3 = {"season_title"};
        String[] strArr4 = {"review_rating", "review_rating_style"};
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return (String[]) C4338c.m14968a(strArr, strArr2, strArr3, strArr4);
        } else if (i >= 24) {
            return (String[]) C4338c.m14968a(strArr, strArr2, strArr3);
        } else {
            if (i >= 23) {
                strArr = (String[]) C4338c.m14968a(strArr, strArr2);
            }
            return strArr;
        }
    }

    /* renamed from: a */
    public long mo15169a() {
        Long asLong = this.f10787a.getAsLong("_id");
        if (asLong == null) {
            return -1;
        }
        return asLong.longValue();
    }

    /* renamed from: b */
    public ContentValues mo15170b() {
        ContentValues contentValues = new ContentValues(this.f10787a);
        if (VERSION.SDK_INT < 23) {
            contentValues.remove("searchable");
            contentValues.remove("internal_provider_flag1");
            contentValues.remove("internal_provider_flag2");
            contentValues.remove("internal_provider_flag3");
            contentValues.remove("internal_provider_flag4");
        }
        if (VERSION.SDK_INT < 24) {
            contentValues.remove("season_title");
        }
        if (VERSION.SDK_INT < 26) {
            contentValues.remove("review_rating_style");
            contentValues.remove("review_rating");
        }
        return contentValues;
    }

    public int hashCode() {
        return this.f10787a.hashCode();
    }

    /* renamed from: a */
    static void m14938a(Cursor cursor, C4337a aVar) {
        int columnIndex = cursor.getColumnIndex("_id");
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            aVar.mo15173a(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("package_name");
        if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
            aVar.mo15192d(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("title");
        if (columnIndex3 >= 0 && !cursor.isNull(columnIndex3)) {
            aVar.mo15197g(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("episode_title");
        if (columnIndex4 >= 0 && !cursor.isNull(columnIndex4)) {
            aVar.mo15184b(cursor.getString(columnIndex4));
        }
        if (VERSION.SDK_INT >= 24) {
            int columnIndex5 = cursor.getColumnIndex("season_display_number");
            if (columnIndex5 >= 0 && !cursor.isNull(columnIndex5)) {
                aVar.mo15185b(cursor.getString(columnIndex5), -1);
            }
        } else {
            int columnIndex6 = cursor.getColumnIndex("season_number");
            if (columnIndex6 >= 0 && !cursor.isNull(columnIndex6)) {
                aVar.mo15187c(cursor.getInt(columnIndex6));
            }
        }
        if (VERSION.SDK_INT >= 24) {
            int columnIndex7 = cursor.getColumnIndex("episode_display_number");
            if (columnIndex7 >= 0 && !cursor.isNull(columnIndex7)) {
                aVar.mo15176a(cursor.getString(columnIndex7), -1);
            }
        } else {
            int columnIndex8 = cursor.getColumnIndex("episode_number");
            if (columnIndex8 >= 0 && !cursor.isNull(columnIndex8)) {
                aVar.mo15172a(cursor.getInt(columnIndex8));
            }
        }
        int columnIndex9 = cursor.getColumnIndex("short_description");
        if (columnIndex9 >= 0 && !cursor.isNull(columnIndex9)) {
            aVar.mo15175a(cursor.getString(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex("long_description");
        if (columnIndex10 >= 0 && !cursor.isNull(columnIndex10)) {
            aVar.mo15189c(cursor.getString(columnIndex10));
        }
        int columnIndex11 = cursor.getColumnIndex("poster_art_uri");
        if (columnIndex11 >= 0 && !cursor.isNull(columnIndex11)) {
            aVar.mo15174a(Uri.parse(cursor.getString(columnIndex11)));
        }
        int columnIndex12 = cursor.getColumnIndex("thumbnail_uri");
        if (columnIndex12 >= 0 && !cursor.isNull(columnIndex12)) {
            aVar.mo15183b(Uri.parse(cursor.getString(columnIndex12)));
        }
        int columnIndex13 = cursor.getColumnIndex("audio_language");
        if (columnIndex13 >= 0 && !cursor.isNull(columnIndex13)) {
            aVar.mo15180a(C4353i.m15018a(cursor.getString(columnIndex13)));
        }
        int columnIndex14 = cursor.getColumnIndex("canonical_genre");
        if (columnIndex14 >= 0 && !cursor.isNull(columnIndex14)) {
            aVar.mo15186b(C4352h.m15014a(cursor.getString(columnIndex14)));
        }
        int columnIndex15 = cursor.getColumnIndex("content_rating");
        if (columnIndex15 >= 0 && !cursor.isNull(columnIndex15)) {
            aVar.mo15179a(C4353i.m15019b(cursor.getString(columnIndex15)));
        }
        int columnIndex16 = cursor.getColumnIndex("video_width");
        if (columnIndex16 >= 0 && !cursor.isNull(columnIndex16)) {
            aVar.mo15193e((int) cursor.getLong(columnIndex16));
        }
        int columnIndex17 = cursor.getColumnIndex("video_height");
        if (columnIndex17 >= 0 && !cursor.isNull(columnIndex17)) {
            aVar.mo15190d((int) cursor.getLong(columnIndex17));
        }
        int columnIndex18 = cursor.getColumnIndex("internal_provider_data");
        if (columnIndex18 >= 0 && !cursor.isNull(columnIndex18)) {
            aVar.mo15178a(cursor.getBlob(columnIndex18));
        }
        if (VERSION.SDK_INT >= 23) {
            int columnIndex19 = cursor.getColumnIndex("searchable");
            if (columnIndex19 >= 0 && !cursor.isNull(columnIndex19)) {
                boolean z = true;
                if (cursor.getInt(columnIndex19) != 1) {
                    z = false;
                }
                aVar.mo15177a(z);
            }
            int columnIndex20 = cursor.getColumnIndex("internal_provider_flag1");
            if (columnIndex20 >= 0 && !cursor.isNull(columnIndex20)) {
                aVar.mo15182b(cursor.getLong(columnIndex20));
            }
            int columnIndex21 = cursor.getColumnIndex("internal_provider_flag2");
            if (columnIndex21 >= 0 && !cursor.isNull(columnIndex21)) {
                aVar.mo15188c(cursor.getLong(columnIndex21));
            }
            int columnIndex22 = cursor.getColumnIndex("internal_provider_flag3");
            if (columnIndex22 >= 0 && !cursor.isNull(columnIndex22)) {
                aVar.mo15191d(cursor.getLong(columnIndex22));
            }
            int columnIndex23 = cursor.getColumnIndex("internal_provider_flag4");
            if (columnIndex23 >= 0 && !cursor.isNull(columnIndex23)) {
                aVar.mo15194e(cursor.getLong(columnIndex23));
            }
        }
        if (VERSION.SDK_INT >= 24) {
            int columnIndex24 = cursor.getColumnIndex("season_title");
            if (columnIndex24 >= 0 && !cursor.isNull(columnIndex24)) {
                aVar.mo15196f(cursor.getString(columnIndex24));
            }
        }
        if (VERSION.SDK_INT >= 26) {
            int columnIndex25 = cursor.getColumnIndex("review_rating_style");
            if (columnIndex25 >= 0 && !cursor.isNull(columnIndex25)) {
                aVar.mo15181b(cursor.getInt(columnIndex25));
            }
            int columnIndex26 = cursor.getColumnIndex("review_rating");
            if (columnIndex26 >= 0 && !cursor.isNull(columnIndex26)) {
                aVar.mo15195e(cursor.getString(columnIndex26));
            }
        }
    }
}
