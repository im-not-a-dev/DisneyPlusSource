package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public class SmartList<E> extends AbstractList<E> implements RandomAccess {
    /* access modifiers changed from: private */
    public Object myElem;
    private int mySize;

    private static class EmptyIterator<T> implements Iterator<T> {
        private static final EmptyIterator INSTANCE = new EmptyIterator();

        private EmptyIterator() {
        }

        public static <T> EmptyIterator<T> getInstance() {
            return INSTANCE;
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    private class SingletonIterator extends SingletonIteratorBase<E> {
        private final int myInitialModCount;

        public SingletonIterator() {
            super();
            this.myInitialModCount = SmartList.this.modCount;
        }

        /* access modifiers changed from: protected */
        public void checkCoModification() {
            if (SmartList.this.modCount != this.myInitialModCount) {
                StringBuilder sb = new StringBuilder();
                sb.append("ModCount: ");
                sb.append(SmartList.this.modCount);
                sb.append("; expected: ");
                sb.append(this.myInitialModCount);
                throw new ConcurrentModificationException(sb.toString());
            }
        }

        /* access modifiers changed from: protected */
        public E getElement() {
            return SmartList.this.myElem;
        }

        public void remove() {
            checkCoModification();
            SmartList.this.clear();
        }
    }

    private static abstract class SingletonIteratorBase<T> implements Iterator<T> {
        private boolean myVisited;

        private SingletonIteratorBase() {
        }

        /* access modifiers changed from: protected */
        public abstract void checkCoModification();

        /* access modifiers changed from: protected */
        public abstract T getElement();

        public final boolean hasNext() {
            return !this.myVisited;
        }

        public final T next() {
            if (!this.myVisited) {
                this.myVisited = true;
                checkCoModification();
                return getElement();
            }
            throw new NoSuchElementException();
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = str2;
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        String str3 = "toArray";
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean add(E e) {
        Object[] objArr;
        int i = this.mySize;
        if (i == 0) {
            this.myElem = e;
        } else if (i == 1) {
            this.myElem = new Object[]{this.myElem, e};
        } else {
            Object[] objArr2 = (Object[]) this.myElem;
            int length = objArr2.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 >= i3) {
                    i3 = i2;
                }
                objArr = new Object[i3];
                this.myElem = objArr;
                System.arraycopy(objArr2, 0, objArr, 0, length);
            } else {
                objArr = objArr2;
            }
            objArr[this.mySize] = e;
        }
        this.mySize++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.myElem = null;
        this.mySize = 0;
        this.modCount++;
    }

    public E get(int i) {
        if (i >= 0) {
            int i2 = this.mySize;
            if (i < i2) {
                if (i2 == 1) {
                    return this.myElem;
                }
                return ((Object[]) this.myElem)[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.mySize);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public Iterator<E> iterator() {
        int i = this.mySize;
        if (i == 0) {
            EmptyIterator instance = EmptyIterator.getInstance();
            if (instance == null) {
                $$$reportNull$$$0(2);
            }
            return instance;
        } else if (i == 1) {
            return new SingletonIterator();
        } else {
            Iterator<E> it = super.iterator();
            if (it == null) {
                $$$reportNull$$$0(3);
            }
            return it;
        }
    }

    public E remove(int i) {
        E e;
        if (i >= 0) {
            int i2 = this.mySize;
            if (i < i2) {
                if (i2 == 1) {
                    e = this.myElem;
                    this.myElem = null;
                } else {
                    E[] eArr = (Object[]) this.myElem;
                    E e2 = eArr[i];
                    if (i2 == 2) {
                        this.myElem = eArr[1 - i];
                    } else {
                        int i3 = (i2 - i) - 1;
                        if (i3 > 0) {
                            System.arraycopy(eArr, i + 1, eArr, i, i3);
                        }
                        eArr[this.mySize - 1] = null;
                    }
                    e = e2;
                }
                this.mySize--;
                this.modCount++;
                return e;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.mySize);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public E set(int i, E e) {
        if (i >= 0) {
            int i2 = this.mySize;
            if (i < i2) {
                if (i2 == 1) {
                    E e2 = this.myElem;
                    this.myElem = e;
                    return e2;
                }
                Object[] objArr = (Object[]) this.myElem;
                Object obj = objArr[i];
                objArr[i] = e;
                return obj;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.mySize);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int size() {
        return this.mySize;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr == null) {
            $$$reportNull$$$0(4);
        }
        int length = tArr.length;
        int i = this.mySize;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.myElem;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                tArr2[0] = this.myElem;
                if (tArr2 == null) {
                    $$$reportNull$$$0(5);
                }
                return tArr2;
            }
        } else if (length < i) {
            T[] copyOf = Arrays.copyOf((Object[]) this.myElem, i, tArr.getClass());
            if (copyOf == null) {
                $$$reportNull$$$0(6);
            }
            return copyOf;
        } else if (i != 0) {
            System.arraycopy(this.myElem, 0, tArr, 0, i);
        }
        int i2 = this.mySize;
        if (length > i2) {
            tArr[i2] = null;
        }
        if (tArr == null) {
            $$$reportNull$$$0(7);
        }
        return tArr;
    }

    public void add(int i, E e) {
        if (i >= 0) {
            int i2 = this.mySize;
            if (i <= i2) {
                if (i2 == 0) {
                    this.myElem = e;
                } else if (i2 == 1 && i == 0) {
                    this.myElem = new Object[]{e, this.myElem};
                } else {
                    int i3 = this.mySize;
                    Object[] objArr = new Object[(i3 + 1)];
                    if (i3 == 1) {
                        objArr[0] = this.myElem;
                    } else {
                        Object[] objArr2 = (Object[]) this.myElem;
                        System.arraycopy(objArr2, 0, objArr, 0, i);
                        System.arraycopy(objArr2, i, objArr, i + 1, this.mySize - i);
                    }
                    objArr[i] = e;
                    this.myElem = objArr;
                }
                this.mySize++;
                this.modCount++;
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.mySize);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
