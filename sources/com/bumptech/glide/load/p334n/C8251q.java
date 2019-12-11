package com.bumptech.glide.load.p334n;

import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8111g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.q */
/* compiled from: GlideException */
public final class C8251q extends Exception {

    /* renamed from: Y */
    private static final StackTraceElement[] f17683Y = new StackTraceElement[0];

    /* renamed from: U */
    private C8111g f17684U;

    /* renamed from: V */
    private C8105a f17685V;

    /* renamed from: W */
    private Class<?> f17686W;

    /* renamed from: X */
    private String f17687X;

    /* renamed from: c */
    private final List<Throwable> f17688c;

    /* renamed from: com.bumptech.glide.load.n.q$a */
    /* compiled from: GlideException */
    private static final class C8252a implements Appendable {

        /* renamed from: U */
        private boolean f17689U = true;

        /* renamed from: c */
        private final Appendable f17690c;

        C8252a(Appendable appendable) {
            this.f17690c = appendable;
        }

        /* renamed from: a */
        private CharSequence m23985a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f17689U) {
                this.f17689U = false;
                this.f17690c.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f17689U = z;
            this.f17690c.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m23985a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m23985a(charSequence);
            boolean z = false;
            if (this.f17689U) {
                this.f17689U = false;
                this.f17690c.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f17689U = z;
            this.f17690c.append(a, i, i2);
            return this;
        }
    }

    public C8251q(String str) {
        this(str, Collections.emptyList());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21418a(C8111g gVar, C8105a aVar) {
        mo21419a(gVar, aVar, null);
    }

    /* renamed from: a */
    public void mo21420a(Exception exc) {
    }

    /* renamed from: b */
    public List<Throwable> mo21422b() {
        ArrayList arrayList = new ArrayList();
        m23976a((Throwable) this, (List<Throwable>) arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f17687X);
        String str3 = ", ";
        String str4 = "";
        if (this.f17686W != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f17686W);
            str = sb2.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f17685V != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(this.f17685V);
            str2 = sb3.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f17684U != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.f17684U);
            str4 = sb4.toString();
        }
        sb.append(str4);
        List<Throwable> b = mo21422b();
        if (b.isEmpty()) {
            return sb.toString();
        }
        if (b.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(b.size());
            sb.append(" causes:");
        }
        for (Throwable th : b) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public C8251q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21419a(C8111g gVar, C8105a aVar, Class<?> cls) {
        this.f17684U = gVar;
        this.f17685V = aVar;
        this.f17686W = cls;
    }

    public void printStackTrace(PrintStream printStream) {
        m23974a((Appendable) printStream);
    }

    public C8251q(String str, List<Throwable> list) {
        this.f17687X = str;
        setStackTrace(f17683Y);
        this.f17688c = list;
    }

    /* renamed from: b */
    private static void m23978b(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C8251q) {
                ((C8251q) th).m23974a(appendable);
            } else {
                m23975a(th, appendable);
            }
            i = i2;
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        m23974a((Appendable) printWriter);
    }

    /* renamed from: a */
    public List<Throwable> mo21417a() {
        return this.f17688c;
    }

    /* renamed from: a */
    public void mo21421a(String str) {
        List b = mo21422b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) b.get(i));
            i = i2;
        }
    }

    /* renamed from: a */
    private void m23976a(Throwable th, List<Throwable> list) {
        if (th instanceof C8251q) {
            for (Throwable a : ((C8251q) th).mo21417a()) {
                m23976a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    private void m23974a(Appendable appendable) {
        m23975a((Throwable) this, appendable);
        m23977a(mo21417a(), (Appendable) new C8252a(appendable));
    }

    /* renamed from: a */
    private static void m23975a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    private static void m23977a(List<Throwable> list, Appendable appendable) {
        try {
            m23978b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
