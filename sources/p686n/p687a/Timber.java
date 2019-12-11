package p686n.p687a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n.a.a */
/* compiled from: Timber */
public final class Timber {

    /* renamed from: a */
    private static final C14102b[] f31122a = new C14102b[0];

    /* renamed from: b */
    private static final List<C14102b> f31123b = new ArrayList();

    /* renamed from: c */
    static volatile C14102b[] f31124c = f31122a;

    /* renamed from: d */
    private static final C14102b f31125d = new C14101a();

    /* renamed from: n.a.a$a */
    /* compiled from: Timber */
    static class C14101a extends C14102b {
        C14101a() {
        }

        /* renamed from: a */
        public void mo35666a(String str, Object... objArr) {
            for (C14102b a : Timber.f31124c) {
                a.mo35666a(str, objArr);
            }
        }

        /* renamed from: b */
        public void mo35670b(Throwable th) {
            for (C14102b b : Timber.f31124c) {
                b.mo35670b(th);
            }
        }

        /* renamed from: c */
        public void mo35672c(Throwable th, String str, Object... objArr) {
            for (C14102b c : Timber.f31124c) {
                c.mo35672c(th, str, objArr);
            }
        }

        /* renamed from: d */
        public void mo35673d(String str, Object... objArr) {
            for (C14102b d : Timber.f31124c) {
                d.mo35673d(str, objArr);
            }
        }

        /* renamed from: e */
        public void mo35674e(String str, Object... objArr) {
            for (C14102b e : Timber.f31124c) {
                e.mo35674e(str, objArr);
            }
        }

        /* renamed from: f */
        public void mo35675f(String str, Object... objArr) {
            for (C14102b f : Timber.f31124c) {
                f.mo35675f(str, objArr);
            }
        }

        /* renamed from: a */
        public void mo35668a(Throwable th, String str, Object... objArr) {
            for (C14102b a : Timber.f31124c) {
                a.mo35668a(th, str, objArr);
            }
        }

        /* renamed from: b */
        public void mo35669b(String str, Object... objArr) {
            for (C14102b b : Timber.f31124c) {
                b.mo35669b(str, objArr);
            }
        }

        /* renamed from: a */
        public void mo35667a(Throwable th) {
            for (C14102b a : Timber.f31124c) {
                a.mo35667a(th);
            }
        }

        /* renamed from: b */
        public void mo35671b(Throwable th, String str, Object... objArr) {
            for (C14102b b : Timber.f31124c) {
                b.mo35671b(th, str, objArr);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11723a(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    /* renamed from: n.a.a$b */
    /* compiled from: Timber */
    public static abstract class C14102b {

        /* renamed from: a */
        final ThreadLocal<String> f31126a = new ThreadLocal<>();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo35676a() {
            String str = (String) this.f31126a.get();
            if (str != null) {
                this.f31126a.remove();
            }
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11723a(int i, String str, String str2, Throwable th);

        /* access modifiers changed from: protected */
        @Deprecated
        /* renamed from: a */
        public boolean mo35677a(int i) {
            return true;
        }

        /* renamed from: b */
        public void mo35670b(Throwable th) {
            m44544a(5, th, (String) null, new Object[0]);
        }

        /* renamed from: c */
        public void mo35672c(Throwable th, String str, Object... objArr) {
            m44544a(5, th, str, objArr);
        }

        /* renamed from: d */
        public void mo35673d(String str, Object... objArr) {
            m44544a(4, (Throwable) null, str, objArr);
        }

        /* renamed from: e */
        public void mo35674e(String str, Object... objArr) {
            m44544a(2, (Throwable) null, str, objArr);
        }

        /* renamed from: f */
        public void mo35675f(String str, Object... objArr) {
            m44544a(5, (Throwable) null, str, objArr);
        }

        /* renamed from: b */
        public void mo35669b(String str, Object... objArr) {
            m44544a(6, (Throwable) null, str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo35679c(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* renamed from: c */
        private String m44545c(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        /* renamed from: a */
        public void mo35666a(String str, Object... objArr) {
            m44544a(3, (Throwable) null, str, objArr);
        }

        /* renamed from: b */
        public void mo35671b(Throwable th, String str, Object... objArr) {
            m44544a(6, th, str, objArr);
        }

        /* renamed from: a */
        public void mo35668a(Throwable th, String str, Object... objArr) {
            m44544a(3, th, str, objArr);
        }

        /* renamed from: a */
        public void mo35667a(Throwable th) {
            m44544a(6, th, (String) null, new Object[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo35678a(String str, int i) {
            return mo35677a(i);
        }

        /* renamed from: a */
        private void m44544a(int i, Throwable th, String str, Object... objArr) {
            String a = mo35676a();
            if (mo35678a(a, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = mo35679c(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("\n");
                        sb.append(m44545c(th));
                        str = sb.toString();
                    }
                } else if (th != null) {
                    str = m44545c(th);
                } else {
                    return;
                }
                mo11723a(i, a, str, th);
            }
        }
    }

    private Timber() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static void m44522a(String str, Object... objArr) {
        f31125d.mo35666a(str, objArr);
    }

    /* renamed from: b */
    public static void m44527b(Throwable th) {
        f31125d.mo35670b(th);
    }

    /* renamed from: c */
    public static void m44529c(String str, Object... objArr) {
        f31125d.mo35673d(str, objArr);
    }

    /* renamed from: d */
    public static void m44531d(String str, Object... objArr) {
        f31125d.mo35674e(str, objArr);
    }

    /* renamed from: e */
    public static void m44532e(String str, Object... objArr) {
        f31125d.mo35675f(str, objArr);
    }

    /* renamed from: a */
    public static void m44524a(Throwable th, String str, Object... objArr) {
        f31125d.mo35668a(th, str, objArr);
    }

    /* renamed from: b */
    public static void m44526b(String str, Object... objArr) {
        f31125d.mo35669b(str, objArr);
    }

    /* renamed from: c */
    public static void m44530c(Throwable th, String str, Object... objArr) {
        f31125d.mo35672c(th, str, objArr);
    }

    /* renamed from: a */
    public static void m44523a(Throwable th) {
        f31125d.mo35667a(th);
    }

    /* renamed from: b */
    public static void m44528b(Throwable th, String str, Object... objArr) {
        f31125d.mo35671b(th, str, objArr);
    }

    /* renamed from: a */
    public static C14102b m44521a(String str) {
        for (C14102b bVar : f31124c) {
            bVar.f31126a.set(str);
        }
        return f31125d;
    }

    /* renamed from: a */
    public static void m44525a(C14102b bVar) {
        if (bVar == null) {
            throw new NullPointerException("tree == null");
        } else if (bVar != f31125d) {
            synchronized (f31123b) {
                f31123b.add(bVar);
                f31124c = (C14102b[]) f31123b.toArray(new C14102b[f31123b.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }
}
