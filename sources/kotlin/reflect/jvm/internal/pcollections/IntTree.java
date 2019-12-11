package kotlin.reflect.jvm.internal.pcollections;

final class IntTree<V> {
    static final IntTree<Object> EMPTYNODE = new IntTree<>();
    private final long key;
    private final IntTree<V> left;
    private final IntTree<V> right;
    private final int size;
    private final V value;

    private IntTree() {
        this.size = 0;
        this.key = 0;
        this.value = null;
        this.left = null;
        this.right = null;
    }

    private long minKey() {
        IntTree<V> intTree = this.left;
        if (intTree.size == 0) {
            return this.key;
        }
        return intTree.minKey() + this.key;
    }

    private IntTree<V> rebalanced(IntTree<V> intTree, IntTree<V> intTree2) {
        if (intTree == this.left && intTree2 == this.right) {
            return this;
        }
        return rebalanced(this.key, this.value, intTree, intTree2);
    }

    private IntTree<V> withKey(long j) {
        if (this.size == 0 || j == this.key) {
            return this;
        }
        IntTree intTree = new IntTree(j, this.value, this.left, this.right);
        return intTree;
    }

    /* access modifiers changed from: 0000 */
    public V get(long j) {
        if (this.size == 0) {
            return null;
        }
        long j2 = this.key;
        if (j < j2) {
            return this.left.get(j - j2);
        }
        if (j > j2) {
            return this.right.get(j - j2);
        }
        return this.value;
    }

    /* access modifiers changed from: 0000 */
    public IntTree<V> minus(long j) {
        if (this.size == 0) {
            return this;
        }
        long j2 = this.key;
        if (j < j2) {
            return rebalanced(this.left.minus(j - j2), this.right);
        }
        if (j > j2) {
            return rebalanced(this.left, this.right.minus(j - j2));
        }
        IntTree<V> intTree = this.left;
        if (intTree.size == 0) {
            IntTree<V> intTree2 = this.right;
            return intTree2.withKey(intTree2.key + j2);
        }
        IntTree<V> intTree3 = this.right;
        if (intTree3.size == 0) {
            return intTree.withKey(intTree.key + j2);
        }
        long minKey = intTree3.minKey();
        long j3 = this.key;
        long j4 = minKey + j3;
        Object obj = this.right.get(j4 - j3);
        IntTree minus = this.right.minus(j4 - this.key);
        IntTree withKey = minus.withKey((minus.key + this.key) - j4);
        IntTree<V> intTree4 = this.left;
        return rebalanced(j4, obj, intTree4.withKey((intTree4.key + this.key) - j4), withKey);
    }

    /* access modifiers changed from: 0000 */
    public IntTree<V> plus(long j, V v) {
        if (this.size == 0) {
            IntTree intTree = new IntTree(j, v, this, this);
            return intTree;
        }
        long j2 = this.key;
        if (j < j2) {
            return rebalanced(this.left.plus(j - j2, v), this.right);
        }
        if (j > j2) {
            return rebalanced(this.left, this.right.plus(j - j2, v));
        }
        if (v == this.value) {
            return this;
        }
        IntTree intTree2 = new IntTree(j, v, this.left, this.right);
        return intTree2;
    }

    private static <V> IntTree<V> rebalanced(long j, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        IntTree<V> intTree3 = intTree;
        IntTree<V> intTree4 = intTree2;
        int i = intTree3.size;
        int i2 = intTree4.size;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                IntTree<V> intTree5 = intTree3.left;
                IntTree<V> intTree6 = intTree3.right;
                if (intTree6.size < intTree5.size * 2) {
                    long j2 = intTree3.key;
                    long j3 = j2 + j;
                    V v2 = intTree3.value;
                    IntTree intTree7 = new IntTree(-j2, v, intTree6.withKey(intTree6.key + j2), intTree2);
                    IntTree intTree8 = new IntTree(j3, v2, intTree5, intTree7);
                    return intTree8;
                }
                IntTree<V> intTree9 = intTree6.left;
                IntTree<V> intTree10 = intTree6.right;
                long j4 = intTree6.key;
                long j5 = intTree3.key + j4 + j;
                V v3 = intTree6.value;
                long j6 = -j4;
                V v4 = v3;
                IntTree intTree11 = new IntTree(j6, intTree3.value, intTree5, intTree9.withKey(intTree9.key + j4));
                long j7 = intTree3.key;
                long j8 = -j7;
                long j9 = intTree6.key;
                V v5 = v4;
                IntTree intTree12 = new IntTree(j8 - j9, v, intTree10.withKey(intTree10.key + j9 + j7), intTree2);
                IntTree intTree13 = new IntTree(j5, v5, intTree11, intTree12);
                return intTree13;
            }
            IntTree<V> intTree14 = intTree2;
            if (i2 >= i * 5) {
                IntTree<V> intTree15 = intTree14.left;
                IntTree<V> intTree16 = intTree14.right;
                if (intTree15.size < intTree16.size * 2) {
                    long j10 = intTree14.key;
                    long j11 = j10 + j;
                    V v6 = intTree14.value;
                    IntTree intTree17 = new IntTree(-j10, v, intTree, intTree15.withKey(intTree15.key + j10));
                    IntTree intTree18 = new IntTree(j11, v6, intTree17, intTree16);
                    return intTree18;
                }
                IntTree<V> intTree19 = intTree15.left;
                IntTree<V> intTree20 = intTree15.right;
                long j12 = intTree15.key;
                long j13 = intTree14.key;
                long j14 = j12 + j13 + j;
                V v7 = intTree15.value;
                long j15 = j14;
                IntTree intTree21 = new IntTree((-j13) - j12, v, intTree, intTree19.withKey(intTree19.key + j12 + j13));
                long j16 = intTree15.key;
                IntTree intTree22 = new IntTree(-j16, intTree14.value, intTree20.withKey(intTree20.key + j16), intTree16);
                IntTree intTree23 = new IntTree(j15, v7, intTree21, intTree22);
                return intTree23;
            }
        }
        IntTree intTree24 = new IntTree(j, v, intTree, intTree2);
        return intTree24;
    }

    private IntTree(long j, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        this.key = j;
        this.value = v;
        this.left = intTree;
        this.right = intTree2;
        this.size = intTree.size + 1 + intTree2.size;
    }
}
