package com.appboy.p029q;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.LruCache;
import android.widget.ImageView;
import com.appboy.C1481i;
import com.appboy.C1485m;
import com.appboy.p025o.C1492a;
import com.appboy.p033s.C1555b;
import com.appboy.p033s.C1557c;
import java.io.File;
import p161f.p162a.C4431e0;

/* renamed from: com.appboy.q.a */
public class C1527a implements C1481i {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f5567f = C1557c.m7461a(C1527a.class);

    /* renamed from: a */
    private LruCache<String, Bitmap> f5568a = new C1528a(this, C1555b.m7446a());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4431e0 f5569b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f5570c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5571d = true;

    /* renamed from: e */
    private boolean f5572e = false;

    /* renamed from: com.appboy.q.a$a */
    class C1528a extends LruCache<String, Bitmap> {
        C1528a(C1527a aVar, int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.appboy.q.a$b */
    class C1529b extends AsyncTask<File, Void, Void> {
        private C1529b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(File... fileArr) {
            synchronized (C1527a.this.f5570c) {
                File file = fileArr[0];
                try {
                    C1557c.m7458a(C1527a.f5567f, "Initializing disk cache");
                    C1527a aVar = C1527a.this;
                    C4431e0 e0Var = new C4431e0(file, 1, 1, 52428800);
                    aVar.f5569b = e0Var;
                } catch (Exception e) {
                    C1557c.m7470c(C1527a.f5567f, "Caught exception creating new disk cache. Unable to create new disk cache", e);
                }
                C1527a.this.f5571d = false;
                C1527a.this.f5570c.notifyAll();
            }
            return null;
        }

        /* synthetic */ C1529b(C1527a aVar, C1528a aVar2) {
            this();
        }
    }

    /* renamed from: com.appboy.q.a$c */
    class C1530c extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        private final ImageView f5574a;

        /* renamed from: b */
        private final Context f5575b;

        /* renamed from: c */
        private final C1492a f5576c;

        /* renamed from: d */
        private final String f5577d;

        /* synthetic */ C1530c(C1527a aVar, Context context, ImageView imageView, C1492a aVar2, String str, C1528a aVar3) {
            this(context, imageView, aVar2, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            TrafficStats.setThreadStatsTag(1337);
            return C1527a.this.mo6659a(this.f5575b, this.f5577d, this.f5576c);
        }

        private C1530c(Context context, ImageView imageView, C1492a aVar, String str) {
            this.f5574a = imageView;
            this.f5575b = context;
            this.f5576c = aVar;
            this.f5577d = str;
            imageView.setTag(C1485m.com_appboy_image_lru_cache_image_url_key, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            ImageView imageView = this.f5574a;
            if (imageView != null && ((String) imageView.getTag(C1485m.com_appboy_image_lru_cache_image_url_key)).equals(this.f5577d)) {
                this.f5574a.setImageBitmap(bitmap);
                if (this.f5576c == C1492a.BASE_CARD_VIEW) {
                    C1555b.m7456a(bitmap, this.f5574a);
                }
            }
        }
    }

    public C1527a(Context context) {
        File a = m7240a(context, "appboy.imageloader.lru.cache");
        new C1529b(this, null).execute(new File[]{a});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Bitmap mo6771b(String str) {
        return (Bitmap) this.f5568a.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo6772c(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5570c
            monitor-enter(r0)
            boolean r1 = r3.f5571d     // Catch:{ all -> 0x0020 }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000a:
            f.a.e0 r1 = r3.f5569b     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001e
            f.a.e0 r1 = r3.f5569b     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.mo15516b(r4)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001e
            f.a.e0 r1 = r3.f5569b     // Catch:{ all -> 0x0020 }
            android.graphics.Bitmap r4 = r1.mo15514a(r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r4
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.p029q.C1527a.mo6772c(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: b */
    private void m7244b(String str, Bitmap bitmap) {
        this.f5568a.put(str, bitmap);
    }

    /* renamed from: a */
    public void mo6660a(Context context, String str, ImageView imageView, C1492a aVar) {
        try {
            C1530c cVar = new C1530c(this, context, imageView, aVar, str, null);
            cVar.execute(new Void[0]);
        } catch (Throwable th) {
            String str2 = f5567f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to render url into view. Url: ");
            sb.append(str);
            C1557c.m7470c(str2, sb.toString(), th);
        }
    }

    /* renamed from: a */
    public Bitmap mo6659a(Context context, String str, C1492a aVar) {
        try {
            Bitmap a = mo6769a(str);
            if (a != null) {
                return a;
            }
            if (this.f5572e) {
                C1557c.m7458a(f5567f, "Cache is currently in offline mode. Not downloading bitmap.");
                return null;
            }
            Bitmap a2 = mo6768a(context, Uri.parse(str), aVar);
            if (a2 != null) {
                mo6770a(str, a2);
            }
            return a2;
        } catch (Throwable th) {
            String str2 = f5567f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to get bitmap from url. Url: ");
            sb.append(str);
            C1557c.m7470c(str2, sb.toString(), th);
            return null;
        }
    }

    /* renamed from: a */
    public void mo6661a(boolean z) {
        String str = f5567f;
        StringBuilder sb = new StringBuilder();
        sb.append("Appboy image loader outbound network requests are now ");
        sb.append(z ? "disabled" : "enabled");
        C1557c.m7469c(str, sb.toString());
        this.f5572e = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo6768a(Context context, Uri uri, C1492a aVar) {
        return C1555b.m7450a(context, uri, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo6769a(String str) {
        Bitmap bitmap = (Bitmap) this.f5568a.get(str);
        if (bitmap != null) {
            String str2 = f5567f;
            StringBuilder sb = new StringBuilder();
            sb.append("Got bitmap from mem cache for key ");
            sb.append(str);
            C1557c.m7471d(str2, sb.toString());
            return bitmap;
        }
        Bitmap c = mo6772c(str);
        if (c != null) {
            String str3 = f5567f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got bitmap from disk cache for key ");
            sb2.append(str);
            C1557c.m7471d(str3, sb2.toString());
            m7244b(str, c);
            return c;
        }
        String str4 = f5567f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No cache hit for bitmap: ");
        sb3.append(str);
        C1557c.m7458a(str4, sb3.toString());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6770a(String str, Bitmap bitmap) {
        if (mo6771b(str) == null) {
            String str2 = f5567f;
            StringBuilder sb = new StringBuilder();
            sb.append("Adding bitmap to mem cache for key ");
            sb.append(str);
            C1557c.m7458a(str2, sb.toString());
            this.f5568a.put(str, bitmap);
        }
        synchronized (this.f5570c) {
            if (this.f5569b != null && !this.f5569b.mo15516b(str)) {
                String str3 = f5567f;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Adding bitmap to disk cache for key ");
                sb2.append(str);
                C1557c.m7458a(str3, sb2.toString());
                this.f5569b.mo15515a(str, bitmap);
            }
        }
    }

    /* renamed from: a */
    static File m7240a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        sb.append(File.separator);
        sb.append(str);
        return new File(sb.toString());
    }
}
