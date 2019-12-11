package com.bumptech.glide.load.p334n.p337c0;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.n.c0.b */
/* compiled from: RuntimeCompat */
final class C8208b {

    /* renamed from: com.bumptech.glide.load.n.c0.b$a */
    /* compiled from: RuntimeCompat */
    class C8209a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f17525a;

        C8209a(Pattern pattern) {
            this.f17525a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f17525a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m23820a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return VERSION.SDK_INT < 17 ? Math.max(m23821b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m23821b() {
        File[] fileArr;
        String str = "GlideRuntimeCompat";
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C8209a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
