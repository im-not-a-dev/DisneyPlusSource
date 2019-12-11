package p096e.p140j.p142b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: e.j.b.b */
/* compiled from: FocusStrategy */
class C4211b {

    /* renamed from: e.j.b.b$a */
    /* compiled from: FocusStrategy */
    public interface C4212a<T> {
        /* renamed from: a */
        void mo14879a(T t, Rect rect);
    }

    /* renamed from: e.j.b.b$b */
    /* compiled from: FocusStrategy */
    public interface C4213b<T, V> {
        /* renamed from: a */
        int mo14881a(T t);

        /* renamed from: a */
        V mo14883a(T t, int i);
    }

    /* renamed from: e.j.b.b$c */
    /* compiled from: FocusStrategy */
    private static class C4214c<T> implements Comparator<T> {

        /* renamed from: U */
        private final Rect f10530U = new Rect();

        /* renamed from: V */
        private final boolean f10531V;

        /* renamed from: W */
        private final C4212a<T> f10532W;

        /* renamed from: c */
        private final Rect f10533c = new Rect();

        C4214c(boolean z, C4212a<T> aVar) {
            this.f10531V = z;
            this.f10532W = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f10533c;
            Rect rect2 = this.f10530U;
            this.f10532W.mo14879a(t, rect);
            this.f10532W.mo14879a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = -1;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                if (this.f10531V) {
                    i3 = 1;
                }
                return i3;
            } else if (i4 > i5) {
                if (!this.f10531V) {
                    i3 = 1;
                }
                return i3;
            } else {
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                int i8 = rect.right;
                int i9 = rect2.right;
                if (i8 < i9) {
                    if (this.f10531V) {
                        i3 = 1;
                    }
                    return i3;
                } else if (i8 <= i9) {
                    return 0;
                } else {
                    if (!this.f10531V) {
                        i3 = 1;
                    }
                    return i3;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m14499a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: a */
    public static <L, T> T m14500a(L l, C4213b<L, T> bVar, C4212a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a = bVar.mo14881a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo14883a(l, i2));
        }
        Collections.sort(arrayList, new C4214c(z, aVar));
        if (i == 1) {
            return m14506b(t, arrayList, z2);
        }
        if (i == 2) {
            return m14502a(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: b */
    private static <T> T m14506b(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: c */
    private static int m14509c(int i, Rect rect, Rect rect2) {
        return Math.max(0, m14510d(i, rect, rect2));
    }

    /* renamed from: d */
    private static int m14510d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: e */
    private static int m14511e(int i, Rect rect, Rect rect2) {
        return Math.max(1, m14512f(i, rect, rect2));
    }

    /* renamed from: f */
    private static int m14512f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: g */
    private static int m14513g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* renamed from: b */
    private static boolean m14508b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z = false;
        if (!m14505a(rect, rect2, i)) {
            return false;
        }
        if (!m14505a(rect, rect3, i) || m14504a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m14504a(i, rect, rect3, rect2)) {
            return false;
        }
        if (m14499a(m14509c(i, rect, rect2), m14513g(i, rect, rect2)) < m14499a(m14509c(i, rect, rect3), m14513g(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static <T> T m14502a(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    public static <L, T> T m14501a(L l, C4213b<L, T> bVar, C4212a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int a = bVar.mo14881a(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < a; i2++) {
            T a2 = bVar.mo14883a(l, i2);
            if (a2 != t) {
                aVar.mo14879a(a2, rect3);
                if (m14508b(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    /* renamed from: b */
    private static boolean m14507b(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i == 17) {
            if (rect.left < rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if (rect.top < rect2.bottom) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if (rect.right > rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m14504a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a = m14503a(i, rect, rect2);
        if (m14503a(i, rect, rect3) || !a) {
            return false;
        }
        boolean z = true;
        if (!m14507b(i, rect, rect3)) {
            return true;
        }
        if (!(i == 17 || i == 66 || m14509c(i, rect, rect2) < m14511e(i, rect, rect3))) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m14505a(Rect rect, Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 <= i3 && rect.left < i3) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 <= i5 && rect.top < i5) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 >= i7 && rect.right > i7) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m14503a(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }
}
