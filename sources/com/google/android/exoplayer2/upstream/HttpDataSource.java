package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HttpDataSource extends DataSource {

    public interface Factory extends C9435a {
        /* renamed from: a */
        HttpDataSource mo24448a();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$a */
    public static abstract class C9436a implements Factory {

        /* renamed from: a */
        private final C9440e f21946a = new C9440e();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract HttpDataSource mo23262a(C9440e eVar);

        /* renamed from: a */
        public final HttpDataSource m28951a() {
            return mo23262a(this.f21946a);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$b */
    public static class C9437b extends IOException {

        /* renamed from: c */
        public final DataSpec f21947c;

        public C9437b(DataSpec dataSpec, int i) {
            this.f21947c = dataSpec;
        }

        public C9437b(String str, DataSpec dataSpec, int i) {
            super(str);
            this.f21947c = dataSpec;
        }

        public C9437b(IOException iOException, DataSpec dataSpec, int i) {
            super(iOException);
            this.f21947c = dataSpec;
        }

        public C9437b(String str, IOException iOException, DataSpec dataSpec, int i) {
            super(str, iOException);
            this.f21947c = dataSpec;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$c */
    public static final class C9438c extends C9437b {
        public C9438c(String str, DataSpec dataSpec) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(str);
            super(sb.toString(), dataSpec, 1);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$d */
    public static final class C9439d extends C9437b {

        /* renamed from: U */
        public final int f21948U;

        public C9439d(int i, String str, Map<String, List<String>> map, DataSpec dataSpec) {
            StringBuilder sb = new StringBuilder();
            sb.append("Response code: ");
            sb.append(i);
            super(sb.toString(), dataSpec, 1);
            this.f21948U = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$e */
    public static final class C9440e {

        /* renamed from: a */
        private final Map<String, String> f21949a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f21950b;

        /* renamed from: a */
        public synchronized Map<String, String> mo24454a() {
            if (this.f21950b == null) {
                this.f21950b = Collections.unmodifiableMap(new HashMap(this.f21949a));
            }
            return this.f21950b;
        }
    }

    static {
        C9487d dVar = C9487d.f22087a;
    }
}
