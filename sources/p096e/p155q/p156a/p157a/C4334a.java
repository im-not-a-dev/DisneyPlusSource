package p096e.p155q.p156a.p157a;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p096e.p155q.p156a.p157a.C4336b.C4337a;

/* renamed from: e.q.a.a.a */
/* compiled from: BasePreviewProgram */
public abstract class C4334a extends C4336b {

    /* renamed from: c */
    public static final String[] f10784c = mo15234e();

    /* renamed from: e.q.a.a.a$a */
    /* compiled from: BasePreviewProgram */
    public static abstract class C4335a<T extends C4335a> extends C4337a<T> {

        /* renamed from: b */
        private static final SimpleDateFormat f10785b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        static {
            f10785b.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        }

        /* renamed from: b */
        public T mo15142b(boolean z) {
            this.f10788a.put("browsable", Integer.valueOf(z ? 1 : 0));
            return this;
        }

        /* renamed from: c */
        public T mo15143c(Uri uri) {
            String str;
            ContentValues contentValues = this.f10788a;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            contentValues.put("intent_uri", str);
            return this;
        }

        /* renamed from: d */
        public T mo15146d(boolean z) {
            this.f10788a.put("transient", Integer.valueOf(z ? 1 : 0));
            return this;
        }

        /* renamed from: e */
        public T mo15147e(Uri uri) {
            String str;
            ContentValues contentValues = this.f10788a;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            contentValues.put("preview_audio_uri", str);
            return this;
        }

        /* renamed from: f */
        public T mo15150f(Uri uri) {
            String str;
            ContentValues contentValues = this.f10788a;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            contentValues.put("preview_video_uri", str);
            return this;
        }

        /* renamed from: g */
        public T mo15151g(int i) {
            this.f10788a.put("duration_millis", Integer.valueOf(i));
            return this;
        }

        /* renamed from: h */
        public T mo15153h(int i) {
            this.f10788a.put("interaction_type", Integer.valueOf(i));
            return this;
        }

        /* renamed from: i */
        public T mo15156i(int i) {
            this.f10788a.put("item_count", Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public T mo15158j(int i) {
            this.f10788a.put("last_playback_position_millis", Integer.valueOf(i));
            return this;
        }

        /* renamed from: k */
        public T mo15161k(String str) {
            this.f10788a.put("internal_provider_id", str);
            return this;
        }

        /* renamed from: l */
        public T mo15162l(int i) {
            this.f10788a.put("poster_thumbnail_aspect_ratio", Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public T mo15165m(String str) {
            this.f10788a.put("offer_price", str);
            return this;
        }

        /* renamed from: n */
        public T mo15166n(int i) {
            this.f10788a.put("type", Integer.valueOf(i));
            return this;
        }

        /* renamed from: o */
        public T mo15168o(String str) {
            this.f10788a.put("starting_price", str);
            return this;
        }

        /* renamed from: d */
        public T mo15145d(Uri uri) {
            String str;
            ContentValues contentValues = this.f10788a;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            contentValues.put("logo_uri", str);
            return this;
        }

        /* renamed from: g */
        public T mo15152g(long j) {
            this.f10788a.put("interaction_count", Long.valueOf(j));
            return this;
        }

        /* renamed from: h */
        public T mo15155h(String str) {
            this.f10788a.put("author", str);
            return this;
        }

        /* renamed from: i */
        public T mo15157i(String str) {
            this.f10788a.put("content_id", str);
            return this;
        }

        /* renamed from: j */
        public T mo15159j(String str) {
            this.f10788a.put("genre", str);
            return this;
        }

        /* renamed from: k */
        public T mo15160k(int i) {
            this.f10788a.put("poster_art_aspect_ratio", Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public T mo15163l(String str) {
            this.f10788a.put("logo_content_description", str);
            return this;
        }

        /* renamed from: m */
        public T mo15164m(int i) {
            this.f10788a.put("tv_series_item_type", Integer.valueOf(i));
            return this;
        }

        /* renamed from: n */
        public T mo15167n(String str) {
            this.f10788a.put("release_date", str);
            return this;
        }

        /* renamed from: h */
        public T mo15154h(long j) {
            this.f10788a.put("start_time_utc_millis", Long.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public T mo15144c(boolean z) {
            this.f10788a.put("live", Integer.valueOf(z ? 1 : 0));
            return this;
        }

        /* renamed from: f */
        public T mo15148f(int i) {
            this.f10788a.put("availability", Integer.valueOf(i));
            return this;
        }

        /* renamed from: f */
        public T mo15149f(long j) {
            this.f10788a.put("end_time_utc_millis", Long.valueOf(j));
            return this;
        }
    }

    C4334a(C4335a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static String[] mo15234e() {
        String[] strArr = {"internal_provider_id", "preview_video_uri", "last_playback_position_millis", "duration_millis", "intent_uri", "transient", "type", "poster_art_aspect_ratio", "poster_thumbnail_aspect_ratio", "logo_uri", "availability", "starting_price", "offer_price", "release_date", "item_count", "live", "interaction_type", "interaction_count", "author", "browsable", "content_id", "logo_content_description", "genre", "start_time_utc_millis", "end_time_utc_millis", "preview_audio_uri", "tv_series_item_type"};
        return (String[]) C4338c.m14968a(C4336b.f10786b, strArr);
    }

    /* renamed from: a */
    public ContentValues mo15139a(boolean z) {
        ContentValues b = super.mo15170b();
        if (VERSION.SDK_INT < 26) {
            b.remove("internal_provider_id");
            b.remove("preview_video_uri");
            b.remove("last_playback_position_millis");
            b.remove("duration_millis");
            b.remove("intent_uri");
            b.remove("transient");
            b.remove("type");
            b.remove("poster_art_aspect_ratio");
            b.remove("poster_thumbnail_aspect_ratio");
            b.remove("logo_uri");
            b.remove("availability");
            b.remove("starting_price");
            b.remove("offer_price");
            b.remove("release_date");
            b.remove("item_count");
            b.remove("live");
            b.remove("interaction_count");
            b.remove("author");
            b.remove("content_id");
            b.remove("logo_content_description");
            b.remove("genre");
            b.remove("start_time_utc_millis");
            b.remove("end_time_utc_millis");
            b.remove("preview_audio_uri");
            b.remove("tv_series_item_type");
        }
        if (VERSION.SDK_INT < 26 || !z) {
            b.remove("browsable");
        }
        return b;
    }

    /* renamed from: c */
    public String mo15140c() {
        return this.f10787a.getAsString("content_id");
    }

    /* renamed from: d */
    public String mo15141d() {
        return this.f10787a.getAsString("internal_provider_id");
    }

    /* renamed from: a */
    static void m14906a(Cursor cursor, C4335a aVar) {
        C4336b.m14938a(cursor, aVar);
        if (VERSION.SDK_INT >= 26) {
            int columnIndex = cursor.getColumnIndex("internal_provider_id");
            if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
                aVar.mo15161k(cursor.getString(columnIndex));
            }
            int columnIndex2 = cursor.getColumnIndex("preview_video_uri");
            if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
                aVar.mo15150f(Uri.parse(cursor.getString(columnIndex2)));
            }
            int columnIndex3 = cursor.getColumnIndex("last_playback_position_millis");
            if (columnIndex3 >= 0 && !cursor.isNull(columnIndex3)) {
                aVar.mo15158j(cursor.getInt(columnIndex3));
            }
            int columnIndex4 = cursor.getColumnIndex("duration_millis");
            if (columnIndex4 >= 0 && !cursor.isNull(columnIndex4)) {
                aVar.mo15151g(cursor.getInt(columnIndex4));
            }
            int columnIndex5 = cursor.getColumnIndex("intent_uri");
            if (columnIndex5 >= 0 && !cursor.isNull(columnIndex5)) {
                aVar.mo15143c(Uri.parse(cursor.getString(columnIndex5)));
            }
            int columnIndex6 = cursor.getColumnIndex("transient");
            boolean z = false;
            if (columnIndex6 >= 0 && !cursor.isNull(columnIndex6)) {
                aVar.mo15146d(cursor.getInt(columnIndex6) == 1);
            }
            int columnIndex7 = cursor.getColumnIndex("type");
            if (columnIndex7 >= 0 && !cursor.isNull(columnIndex7)) {
                aVar.mo15166n(cursor.getInt(columnIndex7));
            }
            int columnIndex8 = cursor.getColumnIndex("poster_art_aspect_ratio");
            if (columnIndex8 >= 0 && !cursor.isNull(columnIndex8)) {
                aVar.mo15160k(cursor.getInt(columnIndex8));
            }
            int columnIndex9 = cursor.getColumnIndex("poster_thumbnail_aspect_ratio");
            if (columnIndex9 >= 0 && !cursor.isNull(columnIndex9)) {
                aVar.mo15162l(cursor.getInt(columnIndex9));
            }
            int columnIndex10 = cursor.getColumnIndex("logo_uri");
            if (columnIndex10 >= 0 && !cursor.isNull(columnIndex10)) {
                aVar.mo15145d(Uri.parse(cursor.getString(columnIndex10)));
            }
            int columnIndex11 = cursor.getColumnIndex("availability");
            if (columnIndex11 >= 0 && !cursor.isNull(columnIndex11)) {
                aVar.mo15148f(cursor.getInt(columnIndex11));
            }
            int columnIndex12 = cursor.getColumnIndex("starting_price");
            if (columnIndex12 >= 0 && !cursor.isNull(columnIndex12)) {
                aVar.mo15168o(cursor.getString(columnIndex12));
            }
            int columnIndex13 = cursor.getColumnIndex("offer_price");
            if (columnIndex13 >= 0 && !cursor.isNull(columnIndex13)) {
                aVar.mo15165m(cursor.getString(columnIndex13));
            }
            int columnIndex14 = cursor.getColumnIndex("release_date");
            if (columnIndex14 >= 0 && !cursor.isNull(columnIndex14)) {
                aVar.mo15167n(cursor.getString(columnIndex14));
            }
            int columnIndex15 = cursor.getColumnIndex("item_count");
            if (columnIndex15 >= 0 && !cursor.isNull(columnIndex15)) {
                aVar.mo15156i(cursor.getInt(columnIndex15));
            }
            int columnIndex16 = cursor.getColumnIndex("live");
            if (columnIndex16 >= 0 && !cursor.isNull(columnIndex16)) {
                aVar.mo15144c(cursor.getInt(columnIndex16) == 1);
            }
            int columnIndex17 = cursor.getColumnIndex("interaction_type");
            if (columnIndex17 >= 0 && !cursor.isNull(columnIndex17)) {
                aVar.mo15153h(cursor.getInt(columnIndex17));
            }
            int columnIndex18 = cursor.getColumnIndex("interaction_count");
            if (columnIndex18 >= 0 && !cursor.isNull(columnIndex18)) {
                aVar.mo15152g((long) cursor.getInt(columnIndex18));
            }
            int columnIndex19 = cursor.getColumnIndex("author");
            if (columnIndex19 >= 0 && !cursor.isNull(columnIndex19)) {
                aVar.mo15155h(cursor.getString(columnIndex19));
            }
            int columnIndex20 = cursor.getColumnIndex("browsable");
            if (columnIndex20 >= 0 && !cursor.isNull(columnIndex20)) {
                if (cursor.getInt(columnIndex20) == 1) {
                    z = true;
                }
                aVar.mo15142b(z);
            }
            int columnIndex21 = cursor.getColumnIndex("content_id");
            if (columnIndex21 >= 0 && !cursor.isNull(columnIndex21)) {
                aVar.mo15157i(cursor.getString(columnIndex21));
            }
            int columnIndex22 = cursor.getColumnIndex("logo_content_description");
            if (columnIndex22 >= 0 && !cursor.isNull(columnIndex22)) {
                aVar.mo15163l(cursor.getString(columnIndex22));
            }
            int columnIndex23 = cursor.getColumnIndex("genre");
            if (columnIndex23 >= 0 && !cursor.isNull(columnIndex23)) {
                aVar.mo15159j(cursor.getString(columnIndex23));
            }
            int columnIndex24 = cursor.getColumnIndex("start_time_utc_millis");
            if (columnIndex24 >= 0 && !cursor.isNull(columnIndex24)) {
                aVar.mo15154h(cursor.getLong(columnIndex24));
            }
            int columnIndex25 = cursor.getColumnIndex("end_time_utc_millis");
            if (columnIndex25 >= 0 && !cursor.isNull(columnIndex25)) {
                aVar.mo15149f(cursor.getLong(columnIndex25));
            }
            int columnIndex26 = cursor.getColumnIndex("preview_audio_uri");
            if (columnIndex26 >= 0 && !cursor.isNull(columnIndex26)) {
                aVar.mo15147e(Uri.parse(cursor.getString(columnIndex26)));
            }
            int columnIndex27 = cursor.getColumnIndex("tv_series_item_type");
            if (columnIndex27 >= 0 && !cursor.isNull(columnIndex27)) {
                aVar.mo15164m(cursor.getInt(columnIndex27));
            }
        }
    }
}
