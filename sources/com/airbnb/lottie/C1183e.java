package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import com.airbnb.lottie.p016t.C1273g;
import com.airbnb.lottie.p020u.C1332c;
import com.airbnb.lottie.p021v.C1363t;
import com.airbnb.lottie.p022w.C1375f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.e */
/* compiled from: LottieCompositionFactory */
public class C1183e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, C1212l<C1182d>> f4458a = new HashMap();

    /* renamed from: com.airbnb.lottie.e$a */
    /* compiled from: LottieCompositionFactory */
    static class C1184a implements C1208h<C1182d> {

        /* renamed from: a */
        final /* synthetic */ String f4459a;

        C1184a(String str) {
            this.f4459a = str;
        }

        /* renamed from: a */
        public void mo6018a(C1182d dVar) {
            if (this.f4459a != null) {
                C1273g.m6362a().mo6217a(this.f4459a, dVar);
            }
            C1183e.f4458a.remove(this.f4459a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$b */
    /* compiled from: LottieCompositionFactory */
    static class C1185b implements C1208h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f4460a;

        C1185b(String str) {
            this.f4460a = str;
        }

        /* renamed from: a */
        public void mo6018a(Throwable th) {
            C1183e.f4458a.remove(this.f4460a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$c */
    /* compiled from: LottieCompositionFactory */
    static class C1186c implements Callable<C1211k<C1182d>> {

        /* renamed from: U */
        final /* synthetic */ String f4461U;

        /* renamed from: c */
        final /* synthetic */ Context f4462c;

        C1186c(Context context, String str) {
            this.f4462c = context;
            this.f4461U = str;
        }

        public C1211k<C1182d> call() {
            return C1332c.m6600a(this.f4462c, this.f4461U);
        }
    }

    /* renamed from: com.airbnb.lottie.e$d */
    /* compiled from: LottieCompositionFactory */
    static class C1187d implements Callable<C1211k<C1182d>> {

        /* renamed from: U */
        final /* synthetic */ String f4463U;

        /* renamed from: c */
        final /* synthetic */ Context f4464c;

        C1187d(Context context, String str) {
            this.f4464c = context;
            this.f4463U = str;
        }

        public C1211k<C1182d> call() {
            return C1183e.m6069b(this.f4464c, this.f4463U);
        }
    }

    /* renamed from: com.airbnb.lottie.e$e */
    /* compiled from: LottieCompositionFactory */
    static class C1188e implements Callable<C1211k<C1182d>> {

        /* renamed from: U */
        final /* synthetic */ int f4465U;

        /* renamed from: c */
        final /* synthetic */ Context f4466c;

        C1188e(Context context, int i) {
            this.f4466c = context;
            this.f4465U = i;
        }

        public C1211k<C1182d> call() {
            return C1183e.m6068b(this.f4466c, this.f4465U);
        }
    }

    /* renamed from: com.airbnb.lottie.e$f */
    /* compiled from: LottieCompositionFactory */
    static class C1189f implements Callable<C1211k<C1182d>> {

        /* renamed from: U */
        final /* synthetic */ String f4467U;

        /* renamed from: c */
        final /* synthetic */ JsonReader f4468c;

        C1189f(JsonReader jsonReader, String str) {
            this.f4468c = jsonReader;
            this.f4467U = str;
        }

        public C1211k<C1182d> call() {
            return C1183e.m6070b(this.f4468c, this.f4467U);
        }
    }

    /* renamed from: com.airbnb.lottie.e$g */
    /* compiled from: LottieCompositionFactory */
    static class C1190g implements Callable<C1211k<C1182d>> {

        /* renamed from: c */
        final /* synthetic */ C1182d f4469c;

        C1190g(C1182d dVar) {
            this.f4469c = dVar;
        }

        public C1211k<C1182d> call() {
            return new C1211k<>(this.f4469c);
        }
    }

    /* renamed from: b */
    public static C1211k<C1182d> m6069b(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("asset_");
            sb.append(str);
            String sb2 = sb.toString();
            if (str.endsWith(".zip")) {
                return m6061a(new ZipInputStream(context.getAssets().open(str)), sb2);
            }
            return m6059a(context.getAssets().open(str), sb2);
        } catch (IOException e) {
            return new C1211k<>((Throwable) e);
        }
    }

    /* renamed from: c */
    public static C1212l<C1182d> m6072c(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("url_");
        sb.append(str);
        return m6065a(sb.toString(), (Callable<C1211k<C1182d>>) new C1186c<C1211k<C1182d>>(context, str));
    }

    /* renamed from: a */
    public static C1212l<C1182d> m6063a(Context context, String str) {
        return m6065a(str, (Callable<C1211k<C1182d>>) new C1187d<C1211k<C1182d>>(context.getApplicationContext(), str));
    }

    /* renamed from: a */
    public static C1212l<C1182d> m6062a(Context context, int i) {
        return m6065a(m6066a(i), (Callable<C1211k<C1182d>>) new C1188e<C1211k<C1182d>>(context.getApplicationContext(), i));
    }

    /* renamed from: a */
    private static String m6066a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public static C1211k<C1182d> m6068b(Context context, int i) {
        try {
            return m6059a(context.getResources().openRawResource(i), m6066a(i));
        } catch (NotFoundException e) {
            return new C1211k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C1211k<C1182d> m6059a(InputStream inputStream, String str) {
        return m6060a(inputStream, str, true);
    }

    /* renamed from: a */
    private static C1211k<C1182d> m6060a(InputStream inputStream, String str, boolean z) {
        try {
            return m6070b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C1375f.m6738a((Closeable) inputStream);
            }
        }
    }

    /* renamed from: b */
    public static C1211k<C1182d> m6070b(JsonReader jsonReader, String str) {
        return m6058a(jsonReader, str, true);
    }

    /* renamed from: b */
    private static C1211k<C1182d> m6071b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1182d dVar = null;
            while (nextEntry != null) {
                if (nextEntry.getName().contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = (C1182d) m6058a(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).mo6125b();
                } else if (nextEntry.getName().contains(".png")) {
                    String[] split = nextEntry.getName().split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new C1211k<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Entry entry : hashMap.entrySet()) {
                C1207g a = m6057a(dVar, (String) entry.getKey());
                if (a != null) {
                    a.mo6120a((Bitmap) entry.getValue());
                }
            }
            for (Entry entry2 : dVar.mo6041h().entrySet()) {
                if (((C1207g) entry2.getValue()).mo6119a() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("There is no image for ");
                    sb.append(((C1207g) entry2.getValue()).mo6121b());
                    return new C1211k<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            C1273g.m6362a().mo6217a(str, dVar);
            return new C1211k<>(dVar);
        } catch (IOException e) {
            return new C1211k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C1212l<C1182d> m6064a(JsonReader jsonReader, String str) {
        return m6065a(str, (Callable<C1211k<C1182d>>) new C1189f<C1211k<C1182d>>(jsonReader, str));
    }

    /* renamed from: a */
    private static C1211k<C1182d> m6058a(JsonReader jsonReader, String str, boolean z) {
        try {
            C1182d a = C1363t.m6674a(jsonReader);
            C1273g.m6362a().mo6217a(str, a);
            C1211k<C1182d> kVar = new C1211k<>(a);
            if (z) {
                C1375f.m6738a((Closeable) jsonReader);
            }
            return kVar;
        } catch (Exception e) {
            C1211k<C1182d> kVar2 = new C1211k<>((Throwable) e);
            if (z) {
                C1375f.m6738a((Closeable) jsonReader);
            }
            return kVar2;
        } catch (Throwable th) {
            if (z) {
                C1375f.m6738a((Closeable) jsonReader);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static C1211k<C1182d> m6061a(ZipInputStream zipInputStream, String str) {
        try {
            return m6071b(zipInputStream, str);
        } finally {
            C1375f.m6738a((Closeable) zipInputStream);
        }
    }

    /* renamed from: a */
    private static C1207g m6057a(C1182d dVar, String str) {
        for (C1207g gVar : dVar.mo6041h().values()) {
            if (gVar.mo6121b().equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C1212l<C1182d> m6065a(String str, Callable<C1211k<C1182d>> callable) {
        C1182d a = str == null ? null : C1273g.m6362a().mo6216a(str);
        if (a != null) {
            return new C1212l<>(new C1190g(a));
        }
        if (str != null && f4458a.containsKey(str)) {
            return (C1212l) f4458a.get(str);
        }
        C1212l<C1182d> lVar = new C1212l<>(callable);
        lVar.mo6129b(new C1184a(str));
        lVar.mo6128a((C1208h<Throwable>) new C1185b<Throwable>(str));
        f4458a.put(str, lVar);
        return lVar;
    }
}
