package p096e.p155q.p156a.p157a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.tv.TvContract;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileNotFoundException;

/* renamed from: e.q.a.a.d */
/* compiled from: PreviewChannel */
public class C4339d {

    /* renamed from: a */
    ContentValues f10789a;

    /* renamed from: b */
    private volatile Bitmap f10790b;

    /* renamed from: c */
    private Uri f10791c;

    /* renamed from: d */
    private boolean f10792d;

    /* renamed from: e */
    private volatile boolean f10793e;

    /* renamed from: e.q.a.a.d$a */
    /* compiled from: PreviewChannel */
    public static final class C4340a {

        /* renamed from: a */
        ContentValues f10794a = new ContentValues();

        /* renamed from: b */
        Bitmap f10795b;

        /* renamed from: c */
        Uri f10796c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C4340a mo15207a(long j) {
            this.f10794a.put("_id", Long.valueOf(j));
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C4340a mo15216b(String str) {
            this.f10794a.put("package_name", str);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C4340a mo15218c(String str) {
            this.f10794a.put("type", str);
            return this;
        }

        /* renamed from: d */
        public C4340a mo15219d(long j) {
            this.f10794a.put("internal_provider_flag3", Long.valueOf(j));
            return this;
        }

        /* renamed from: e */
        public C4340a mo15220e(long j) {
            this.f10794a.put("internal_provider_flag4", Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public C4340a mo15210a(CharSequence charSequence) {
            this.f10794a.put("description", charSequence.toString());
            return this;
        }

        /* renamed from: b */
        public C4340a mo15215b(CharSequence charSequence) {
            this.f10794a.put("display_name", charSequence.toString());
            return this;
        }

        /* renamed from: c */
        public C4340a mo15217c(long j) {
            this.f10794a.put("internal_provider_flag2", Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public C4340a mo15209a(Uri uri) {
            String str;
            ContentValues contentValues = this.f10794a;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            contentValues.put("app_link_intent_uri", str);
            return this;
        }

        /* renamed from: b */
        public C4340a mo15214b(long j) {
            this.f10794a.put("internal_provider_flag1", Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public C4340a mo15211a(String str) {
            this.f10794a.put("internal_provider_id", str);
            return this;
        }

        /* renamed from: a */
        public C4340a mo15212a(byte[] bArr) {
            this.f10794a.put("internal_provider_data", bArr);
            return this;
        }

        /* renamed from: a */
        public C4340a mo15208a(Bitmap bitmap) {
            this.f10795b = bitmap;
            this.f10796c = null;
            return this;
        }

        /* renamed from: a */
        public C4339d mo15213a() {
            mo15218c("TYPE_PREVIEW");
            if (TextUtils.isEmpty(this.f10794a.getAsString("display_name"))) {
                throw new IllegalStateException("Need channel name. Use method setDisplayName(String) to set it.");
            } else if (!TextUtils.isEmpty(this.f10794a.getAsString("app_link_intent_uri"))) {
                return new C4339d(this);
            } else {
                throw new IllegalStateException("Need app link intent uri for channel. Use method setAppLinkIntent or setAppLinkIntentUri to set it.");
            }
        }
    }

    /* renamed from: e.q.a.a.d$b */
    /* compiled from: PreviewChannel */
    public static class C4341b {

        /* renamed from: a */
        public static final String[] f10797a = {"_id", "package_name", "type", "display_name", "description", "app_link_intent_uri", "internal_provider_id", "internal_provider_data", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
    }

    C4339d(C4340a aVar) {
        this.f10789a = aVar.f10794a;
        this.f10790b = aVar.f10795b;
        this.f10791c = aVar.f10796c;
        this.f10792d = (this.f10790b == null && this.f10791c == null) ? false : true;
    }

    /* renamed from: a */
    public static C4339d m14969a(Cursor cursor) {
        C4340a aVar = new C4340a();
        aVar.mo15207a((long) cursor.getInt(0));
        aVar.mo15216b(cursor.getString(1));
        aVar.mo15218c(cursor.getString(2));
        aVar.mo15215b((CharSequence) cursor.getString(3));
        aVar.mo15210a((CharSequence) cursor.getString(4));
        aVar.mo15209a(Uri.parse(cursor.getString(5)));
        aVar.mo15211a(cursor.getString(6));
        aVar.mo15212a(cursor.getBlob(7));
        aVar.mo15214b(cursor.getLong(8));
        aVar.mo15217c(cursor.getLong(9));
        aVar.mo15219d(cursor.getLong(10));
        aVar.mo15220e(cursor.getLong(11));
        return aVar.mo15213a();
    }

    /* renamed from: b */
    public String mo15200b() {
        return this.f10789a.getAsString("internal_provider_id");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Uri mo15201c() {
        return this.f10791c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo15202d() {
        return this.f10792d;
    }

    /* renamed from: e */
    public ContentValues mo15203e() {
        return new ContentValues(this.f10789a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4339d)) {
            return false;
        }
        return this.f10789a.equals(((C4339d) obj).f10789a);
    }

    public int hashCode() {
        return this.f10789a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Channel{");
        sb.append(this.f10789a.toString());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public long mo15198a() {
        Long asLong = this.f10789a.getAsLong("_id");
        if (asLong == null) {
            return -1;
        }
        return asLong.longValue();
    }

    /* renamed from: a */
    public Bitmap mo15199a(Context context) {
        if (!this.f10793e && this.f10790b == null) {
            try {
                this.f10790b = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(TvContract.buildChannelLogoUri(mo15198a())));
            } catch (SQLiteException | FileNotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Logo for preview channel (ID:");
                sb.append(mo15198a());
                sb.append(") not found.");
                Log.e("PreviewChannel", sb.toString(), e);
            }
            this.f10793e = true;
        }
        return this.f10790b;
    }
}
