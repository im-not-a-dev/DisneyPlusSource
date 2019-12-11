package p551j.p552a.p557i;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.i.c */
/* compiled from: FileResourceLoader */
public class C12606c implements C12608e {

    /* renamed from: a */
    private static final C13459b f29244a = C13460c.m41415a(C12606c.class);

    /* renamed from: a */
    public InputStream mo30919a(String str) {
        File file = new File(str);
        if (!file.isFile() || !file.canRead()) {
            f29244a.mo34722a("The configuration file {} (which resolves to absolute path {}) doesn't exist, is not a file or is not readable.", file, file.getAbsolutePath());
        } else {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
                f29244a.mo34729c("Configuration file {} could not be found even though we just checked it can be read...", (Object) str);
            }
        }
        return null;
    }
}
