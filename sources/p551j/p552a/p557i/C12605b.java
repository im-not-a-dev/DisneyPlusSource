package p551j.p552a.p557i;

import java.io.InputStream;

/* renamed from: j.a.i.b */
/* compiled from: ContextClassLoaderResourceLoader */
public class C12605b implements C12608e {
    /* renamed from: a */
    public InputStream mo30919a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassLoader.getSystemClassLoader();
        }
        return contextClassLoader.getResourceAsStream(str);
    }
}
