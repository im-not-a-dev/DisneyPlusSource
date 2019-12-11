package p096e.p121h.p134r;

import android.util.Log;
import java.io.Writer;

/* renamed from: e.h.r.b */
/* compiled from: LogWriter */
public class C4110b extends Writer {

    /* renamed from: U */
    private StringBuilder f10377U = new StringBuilder(128);

    /* renamed from: c */
    private final String f10378c;

    public C4110b(String str) {
        this.f10378c = str;
    }

    /* renamed from: a */
    private void m14084a() {
        if (this.f10377U.length() > 0) {
            Log.d(this.f10378c, this.f10377U.toString());
            StringBuilder sb = this.f10377U;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m14084a();
    }

    public void flush() {
        m14084a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m14084a();
            } else {
                this.f10377U.append(c);
            }
        }
    }
}
