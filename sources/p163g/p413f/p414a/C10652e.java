package p163g.p413f.p414a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.C8106b;
import com.bumptech.glide.load.C8108d;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.C8117k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p332m.C8124e.C8125a;
import com.bumptech.glide.load.p332m.C8135k.C8136a;
import com.bumptech.glide.load.p334n.C8233k;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p334n.p336b0.C8191h;
import com.bumptech.glide.load.p334n.p338d0.C8211a;
import com.bumptech.glide.load.p339o.C8264a.C8266b;
import com.bumptech.glide.load.p339o.C8264a.C8267c;
import com.bumptech.glide.load.p339o.C8268b.C8269a;
import com.bumptech.glide.load.p339o.C8268b.C8273d;
import com.bumptech.glide.load.p339o.C8275c;
import com.bumptech.glide.load.p339o.C8276d.C8278b;
import com.bumptech.glide.load.p339o.C8279e.C8282c;
import com.bumptech.glide.load.p339o.C8284f.C8286b;
import com.bumptech.glide.load.p339o.C8284f.C8290e;
import com.bumptech.glide.load.p339o.C8292g;
import com.bumptech.glide.load.p339o.C8299k.C8300a;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8318s.C8319a;
import com.bumptech.glide.load.p339o.C8318s.C8320b;
import com.bumptech.glide.load.p339o.C8318s.C8321c;
import com.bumptech.glide.load.p339o.C8318s.C8322d;
import com.bumptech.glide.load.p339o.C8323t;
import com.bumptech.glide.load.p339o.C8324u.C8325a;
import com.bumptech.glide.load.p339o.C8324u.C8326b;
import com.bumptech.glide.load.p339o.C8324u.C8327c;
import com.bumptech.glide.load.p339o.C8328v.C8329a;
import com.bumptech.glide.load.p339o.C8331w.C8332a;
import com.bumptech.glide.load.p339o.C8331w.C8333b;
import com.bumptech.glide.load.p339o.C8331w.C8335d;
import com.bumptech.glide.load.p339o.C8336x.C8337a;
import com.bumptech.glide.load.p339o.p340y.C8338a.C8339a;
import com.bumptech.glide.load.p339o.p340y.C8340b.C8341a;
import com.bumptech.glide.load.p339o.p340y.C8342c.C8343a;
import com.bumptech.glide.load.p339o.p340y.C8344d.C8345a;
import com.bumptech.glide.load.p339o.p340y.C8346e.C8347a;
import com.bumptech.glide.load.p341p.p342c.C8350a;
import com.bumptech.glide.load.p341p.p342c.C8351b;
import com.bumptech.glide.load.p341p.p342c.C8352c;
import com.bumptech.glide.load.p341p.p342c.C8355f;
import com.bumptech.glide.load.p341p.p342c.C8358i;
import com.bumptech.glide.load.p341p.p342c.C8371k;
import com.bumptech.glide.load.p341p.p342c.C8377n;
import com.bumptech.glide.load.p341p.p342c.C8383s;
import com.bumptech.glide.load.p341p.p342c.C8384t;
import com.bumptech.glide.load.p341p.p342c.C8388v;
import com.bumptech.glide.load.p341p.p342c.C8390w;
import com.bumptech.glide.load.p341p.p343d.C8397a.C8398a;
import com.bumptech.glide.load.p341p.p344e.C8404e;
import com.bumptech.glide.load.p341p.p344e.C8405f;
import com.bumptech.glide.load.p341p.p345f.C8406a;
import com.bumptech.glide.load.p341p.p346g.C8408a;
import com.bumptech.glide.load.p341p.p346g.C8412c;
import com.bumptech.glide.load.p341p.p346g.C8414d;
import com.bumptech.glide.load.p341p.p346g.C8422h;
import com.bumptech.glide.load.p341p.p346g.C8424j;
import com.bumptech.glide.load.p341p.p347h.C8425a;
import com.bumptech.glide.load.p341p.p347h.C8426b;
import com.bumptech.glide.load.p341p.p347h.C8427c;
import com.bumptech.glide.load.p341p.p347h.C8428d;
import com.bumptech.glide.load.p341p.p347h.C8429e;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p163g.p413f.p414a.p416q.C10680a;
import p163g.p413f.p414a.p417r.C10690d;
import p163g.p413f.p414a.p417r.C10700l;
import p163g.p413f.p414a.p418s.C10710c;
import p163g.p413f.p414a.p418s.C10712e;
import p163g.p413f.p414a.p420u.C10730g;
import p163g.p413f.p414a.p420u.C10731h;
import p163g.p413f.p414a.p420u.p421l.C10744f;
import p163g.p413f.p414a.p420u.p421l.C10747i;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.e */
/* compiled from: Glide */
public class C10652e implements ComponentCallbacks2 {

    /* renamed from: b0 */
    private static volatile C10652e f25120b0;

    /* renamed from: c0 */
    private static volatile boolean f25121c0;

    /* renamed from: U */
    private final C8191h f25122U;

    /* renamed from: V */
    private final C10654g f25123V;

    /* renamed from: W */
    private final C10659l f25124W;

    /* renamed from: X */
    private final C8154b f25125X;

    /* renamed from: Y */
    private final C10700l f25126Y;

    /* renamed from: Z */
    private final C10690d f25127Z;

    /* renamed from: a0 */
    private final List<C10667n> f25128a0 = new ArrayList();

    /* renamed from: c */
    private final C8159e f25129c;

    C10652e(Context context, C8233k kVar, C8191h hVar, C8159e eVar, C8154b bVar, C10700l lVar, C10690d dVar, int i, C10731h hVar2, Map<Class<?>, C10670o<?, ?>> map, List<C10730g<Object>> list, boolean z) {
        Context context2 = context;
        C8191h hVar3 = hVar;
        C8159e eVar2 = eVar;
        C8154b bVar2 = bVar;
        Class<C10680a> cls = C10680a.class;
        Class<byte[]> cls2 = byte[].class;
        C10655h hVar4 = C10655h.NORMAL;
        this.f25129c = eVar2;
        this.f25125X = bVar2;
        this.f25122U = hVar3;
        this.f25126Y = lVar;
        this.f25127Z = dVar;
        new C8211a(hVar3, eVar2, (C8106b) hVar2.mo27698h().mo21162a(C8371k.f17853f));
        Resources resources = context.getResources();
        this.f25124W = new C10659l();
        this.f25124W.mo27545a((ImageHeaderParser) new C8358i());
        if (VERSION.SDK_INT >= 27) {
            this.f25124W.mo27545a((ImageHeaderParser) new C8377n());
        }
        List a = this.f25124W.mo27554a();
        C8371k kVar2 = new C8371k(a, resources.getDisplayMetrics(), eVar2, bVar2);
        C8408a aVar = new C8408a(context2, a, eVar2, bVar2);
        C8116j b = C8390w.m24398b(eVar);
        C8355f fVar = new C8355f(kVar2);
        C8384t tVar = new C8384t(kVar2, bVar2);
        C8404e eVar3 = new C8404e(context2);
        C8321c cVar = new C8321c(resources);
        C8322d dVar2 = new C8322d(resources);
        C8320b bVar3 = new C8320b(resources);
        Class<byte[]> cls3 = cls2;
        C8319a aVar2 = new C8319a(resources);
        C8352c cVar2 = new C8352c(bVar2);
        C8319a aVar3 = aVar2;
        C8425a aVar4 = new C8425a();
        C8428d dVar3 = new C8428d();
        ContentResolver contentResolver = context.getContentResolver();
        C10659l lVar2 = this.f25124W;
        C8322d dVar4 = dVar2;
        lVar2.mo27547a(ByteBuffer.class, (C8108d<Data>) new C8275c<Data>());
        lVar2.mo27547a(InputStream.class, (C8108d<Data>) new C8323t<Data>(bVar2));
        C8320b bVar4 = bVar3;
        String str = "Bitmap";
        lVar2.mo27552a(str, ByteBuffer.class, Bitmap.class, fVar);
        lVar2.mo27552a(str, InputStream.class, Bitmap.class, tVar);
        lVar2.mo27552a(str, ParcelFileDescriptor.class, Bitmap.class, b);
        C8321c cVar3 = cVar;
        lVar2.mo27552a(str, AssetFileDescriptor.class, Bitmap.class, C8390w.m24396a(eVar));
        lVar2.mo27550a(Bitmap.class, Bitmap.class, (C8308o<Model, Data>) C8329a.m24195b());
        lVar2.mo27552a(str, Bitmap.class, Bitmap.class, new C8388v());
        lVar2.mo27548a(Bitmap.class, (C8117k<TResource>) cVar2);
        C8350a aVar5 = new C8350a(resources, fVar);
        String str2 = "BitmapDrawable";
        lVar2.mo27552a(str2, ByteBuffer.class, BitmapDrawable.class, aVar5);
        lVar2.mo27552a(str2, InputStream.class, BitmapDrawable.class, new C8350a(resources, tVar));
        lVar2.mo27552a(str2, ParcelFileDescriptor.class, BitmapDrawable.class, new C8350a(resources, b));
        lVar2.mo27548a(BitmapDrawable.class, (C8117k<TResource>) new C8351b<TResource>(eVar2, cVar2));
        C8424j jVar = new C8424j(a, aVar, bVar2);
        String str3 = "Gif";
        lVar2.mo27552a(str3, InputStream.class, C8412c.class, jVar);
        lVar2.mo27552a(str3, ByteBuffer.class, C8412c.class, aVar);
        lVar2.mo27548a(C8412c.class, (C8117k<TResource>) new C8414d<TResource>());
        lVar2.mo27550a(cls, cls, (C8308o<Model, Data>) C8329a.m24195b());
        lVar2.mo27552a(str, cls, Bitmap.class, new C8422h(eVar2));
        lVar2.mo27549a(Uri.class, Drawable.class, (C8116j<Data, TResource>) eVar3);
        lVar2.mo27549a(Uri.class, Bitmap.class, (C8116j<Data, TResource>) new C8383s<Data,TResource>(eVar3, eVar2));
        lVar2.mo27546a((C8125a<?>) new C8398a<Object>());
        lVar2.mo27550a(File.class, ByteBuffer.class, (C8308o<Model, Data>) new C8278b<Model,Data>());
        lVar2.mo27550a(File.class, InputStream.class, (C8308o<Model, Data>) new C8290e<Model,Data>());
        lVar2.mo27549a(File.class, File.class, (C8116j<Data, TResource>) new C8406a<Data,TResource>());
        lVar2.mo27550a(File.class, ParcelFileDescriptor.class, (C8308o<Model, Data>) new C8286b<Model,Data>());
        lVar2.mo27550a(File.class, File.class, (C8308o<Model, Data>) C8329a.m24195b());
        lVar2.mo27546a((C8125a<?>) new C8136a<Object>(bVar2));
        C8321c cVar4 = cVar3;
        lVar2.mo27550a(Integer.TYPE, InputStream.class, (C8308o<Model, Data>) cVar4);
        C8320b bVar5 = bVar4;
        lVar2.mo27550a(Integer.TYPE, ParcelFileDescriptor.class, (C8308o<Model, Data>) bVar5);
        lVar2.mo27550a(Integer.class, InputStream.class, (C8308o<Model, Data>) cVar4);
        lVar2.mo27550a(Integer.class, ParcelFileDescriptor.class, (C8308o<Model, Data>) bVar5);
        C8322d dVar5 = dVar4;
        lVar2.mo27550a(Integer.class, Uri.class, (C8308o<Model, Data>) dVar5);
        C8319a aVar6 = aVar3;
        lVar2.mo27550a(Integer.TYPE, AssetFileDescriptor.class, (C8308o<Model, Data>) aVar6);
        lVar2.mo27550a(Integer.class, AssetFileDescriptor.class, (C8308o<Model, Data>) aVar6);
        lVar2.mo27550a(Integer.TYPE, Uri.class, (C8308o<Model, Data>) dVar5);
        lVar2.mo27550a(String.class, InputStream.class, (C8308o<Model, Data>) new C8282c<Model,Data>());
        lVar2.mo27550a(Uri.class, InputStream.class, (C8308o<Model, Data>) new C8282c<Model,Data>());
        lVar2.mo27550a(String.class, InputStream.class, (C8308o<Model, Data>) new C8327c<Model,Data>());
        lVar2.mo27550a(String.class, ParcelFileDescriptor.class, (C8308o<Model, Data>) new C8326b<Model,Data>());
        lVar2.mo27550a(String.class, AssetFileDescriptor.class, (C8308o<Model, Data>) new C8325a<Model,Data>());
        lVar2.mo27550a(Uri.class, InputStream.class, (C8308o<Model, Data>) new C8341a<Model,Data>());
        lVar2.mo27550a(Uri.class, InputStream.class, (C8308o<Model, Data>) new C8267c<Model,Data>(context.getAssets()));
        lVar2.mo27550a(Uri.class, ParcelFileDescriptor.class, (C8308o<Model, Data>) new C8266b<Model,Data>(context.getAssets()));
        Context context3 = context;
        lVar2.mo27550a(Uri.class, InputStream.class, (C8308o<Model, Data>) new C8343a<Model,Data>(context3));
        lVar2.mo27550a(Uri.class, InputStream.class, (C8308o<Model, Data>) new C8345a<Model,Data>(context3));
        ContentResolver contentResolver2 = contentResolver;
        lVar2.mo27550a(Uri.class, InputStream.class, (C8308o<Model, Data>) new C8335d<Model,Data>(contentResolver2));
        lVar2.mo27550a(Uri.class, ParcelFileDescriptor.class, (C8308o<Model, Data>) new C8333b<Model,Data>(contentResolver2));
        lVar2.mo27550a(Uri.class, AssetFileDescriptor.class, (C8308o<Model, Data>) new C8332a<Model,Data>(contentResolver2));
        lVar2.mo27550a(Uri.class, InputStream.class, (C8308o<Model, Data>) new C8337a<Model,Data>());
        lVar2.mo27550a(URL.class, InputStream.class, (C8308o<Model, Data>) new C8347a<Model,Data>());
        lVar2.mo27550a(Uri.class, File.class, (C8308o<Model, Data>) new C8300a<Model,Data>(context3));
        lVar2.mo27550a(C8292g.class, InputStream.class, (C8308o<Model, Data>) new C8339a<Model,Data>());
        Class<byte[]> cls4 = cls3;
        lVar2.mo27550a(cls4, ByteBuffer.class, (C8308o<Model, Data>) new C8269a<Model,Data>());
        lVar2.mo27550a(cls4, InputStream.class, (C8308o<Model, Data>) new C8273d<Model,Data>());
        lVar2.mo27550a(Uri.class, Uri.class, (C8308o<Model, Data>) C8329a.m24195b());
        lVar2.mo27550a(Drawable.class, Drawable.class, (C8308o<Model, Data>) C8329a.m24195b());
        lVar2.mo27549a(Drawable.class, Drawable.class, (C8116j<Data, TResource>) new C8405f<Data,TResource>());
        lVar2.mo27551a(Bitmap.class, BitmapDrawable.class, (C8429e<TResource, Transcode>) new C8426b<TResource,Transcode>(resources));
        C8425a aVar7 = aVar4;
        lVar2.mo27551a(Bitmap.class, cls4, (C8429e<TResource, Transcode>) aVar7);
        C8428d dVar6 = dVar3;
        lVar2.mo27551a(Drawable.class, cls4, (C8429e<TResource, Transcode>) new C8427c<TResource,Transcode>(eVar2, aVar7, dVar6));
        lVar2.mo27551a(C8412c.class, cls4, (C8429e<TResource, Transcode>) dVar6);
        C10654g gVar = new C10654g(context, bVar, this.f25124W, new C10744f(), hVar2, map, list, kVar, z, i);
        this.f25123V = gVar;
    }

    /* renamed from: a */
    private static void m33415a(Context context) {
        if (!f25121c0) {
            f25121c0 = true;
            m33420d(context);
            f25121c0 = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: b */
    public static C10652e m33418b(Context context) {
        if (f25120b0 == null) {
            synchronized (C10652e.class) {
                if (f25120b0 == null) {
                    m33415a(context);
                }
            }
        }
        return f25120b0;
    }

    /* renamed from: d */
    private static void m33420d(Context context) {
        m33416a(context, new C10653f());
    }

    /* renamed from: i */
    private static C10648a m33422i() {
        try {
            return (C10648a) Class.forName("g.f.a.b").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            String str = "Glide";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (InstantiationException e) {
            m33417a((Exception) e);
            throw null;
        } catch (IllegalAccessException e2) {
            m33417a((Exception) e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m33417a((Exception) e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m33417a((Exception) e4);
            throw null;
        }
    }

    /* renamed from: c */
    public C8159e mo27523c() {
        return this.f25129c;
    }

    /* renamed from: e */
    public Context mo27525e() {
        return this.f25123V.getBaseContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C10654g mo27526f() {
        return this.f25123V;
    }

    /* renamed from: g */
    public C10659l mo27527g() {
        return this.f25124W;
    }

    /* renamed from: h */
    public C10700l mo27528h() {
        return this.f25126Y;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo27517a();
    }

    public void onTrimMemory(int i) {
        mo27518a(i);
    }

    /* renamed from: c */
    private static C10700l m33419c(Context context) {
        C10774j.m34013a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m33418b(context).mo27528h();
    }

    /* renamed from: e */
    public static C10667n m33421e(Context context) {
        return m33419c(context).mo27643a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C10690d mo27524d() {
        return this.f25127Z;
    }

    /* renamed from: a */
    private static void m33416a(Context context, C10653f fVar) {
        Context applicationContext = context.getApplicationContext();
        C10648a i = m33422i();
        List<C10710c> emptyList = Collections.emptyList();
        if (i == null || i.mo27515a()) {
            emptyList = new C10712e(applicationContext).mo27667a();
        }
        String str = "Glide";
        if (i != null && !i.mo27512b().isEmpty()) {
            Set b = i.mo27512b();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                C10710c cVar = (C10710c) it.next();
                if (b.contains(cVar.getClass())) {
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(cVar);
                        Log.d(str, sb.toString());
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(str, 3)) {
            for (C10710c cVar2 : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(cVar2.getClass());
                Log.d(str, sb2.toString());
            }
        }
        fVar.mo27533a(i != null ? i.mo27513c() : null);
        for (C10710c a : emptyList) {
            a.mo21139a(applicationContext, fVar);
        }
        if (i != null) {
            i.mo27514a(applicationContext, fVar);
        }
        C10652e a2 = fVar.mo27532a(applicationContext);
        for (C10710c a3 : emptyList) {
            a3.mo21138a(applicationContext, a2, a2.f25124W);
        }
        if (i != null) {
            i.mo19914a(applicationContext, a2, a2.f25124W);
        }
        applicationContext.registerComponentCallbacks(a2);
        f25120b0 = a2;
    }

    /* renamed from: b */
    public C8154b mo27521b() {
        return this.f25125X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27522b(C10667n nVar) {
        synchronized (this.f25128a0) {
            if (this.f25128a0.contains(nVar)) {
                this.f25128a0.remove(nVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: a */
    private static void m33417a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: a */
    public void mo27517a() {
        C10775k.m34031b();
        this.f25122U.mo21286a();
        this.f25129c.mo21242a();
        this.f25125X.mo21221a();
    }

    /* renamed from: a */
    public void mo27518a(int i) {
        C10775k.m34031b();
        this.f25122U.mo21281a(i);
        this.f25129c.mo21243a(i);
        this.f25125X.mo21222a(i);
    }

    /* renamed from: a */
    public static C10667n m33414a(View view) {
        return m33419c(view.getContext()).mo27644a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo27520a(C10747i<?> iVar) {
        synchronized (this.f25128a0) {
            for (C10667n b : this.f25128a0) {
                if (b.mo27571b(iVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27519a(C10667n nVar) {
        synchronized (this.f25128a0) {
            if (!this.f25128a0.contains(nVar)) {
                this.f25128a0.add(nVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }
}
