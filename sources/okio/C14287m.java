package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: okio.m */
/* compiled from: Okio.kt */
public final class C14287m {
    /* renamed from: a */
    public static final BufferedSource m45716a(C14302x xVar) {
        return new C14293r(xVar);
    }

    /* renamed from: b */
    public static final C14300v m45726b(File file) throws FileNotFoundException {
        return m45721a(file, false, 1, null);
    }

    /* renamed from: b */
    public static final C14302x m45727b(Socket socket) throws IOException {
        C14301w wVar = new C14301w(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkReturnedValueIsNotNull((Object) inputStream, "getInputStream()");
        return wVar.mo36403a((C14302x) new C14286l(inputStream, wVar));
    }

    /* renamed from: c */
    public static final C14302x m45728c(File file) throws FileNotFoundException {
        return m45724a((InputStream) new FileInputStream(file));
    }

    /* renamed from: a */
    public static final C14280f m45717a(C14300v vVar) {
        return new C14292q(vVar);
    }

    /* renamed from: a */
    public static final C14300v m45722a(OutputStream outputStream) {
        return new C14290o(outputStream, new C14303y());
    }

    /* renamed from: a */
    public static final C14302x m45724a(InputStream inputStream) {
        return new C14286l(inputStream, new C14303y());
    }

    /* renamed from: a */
    public static final C14300v m45718a() {
        return new C14279e();
    }

    /* renamed from: a */
    public static final C14300v m45723a(Socket socket) throws IOException {
        C14301w wVar = new C14301w(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkReturnedValueIsNotNull((Object) outputStream, "getOutputStream()");
        return wVar.mo36402a((C14300v) new C14290o(outputStream, wVar));
    }

    /* renamed from: a */
    public static final C14300v m45720a(File file, boolean z) throws FileNotFoundException {
        return m45722a((OutputStream) new FileOutputStream(file, z));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C14300v m45721a(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return m45720a(file, z);
    }

    /* renamed from: a */
    public static final C14300v m45719a(File file) throws FileNotFoundException {
        return m45722a((OutputStream) new FileOutputStream(file, true));
    }

    /* renamed from: a */
    public static final boolean m45725a(AssertionError assertionError) {
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C12833x.m40154a((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false;
    }
}
