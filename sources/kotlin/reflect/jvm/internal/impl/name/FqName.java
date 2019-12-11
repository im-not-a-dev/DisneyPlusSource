package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;

public final class FqName {
    public static final FqName ROOT = new FqName("");
    private final FqNameUnsafe fqName;
    private transient FqName parent;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "shortName";
        String str3 = "kotlin/reflect/jvm/internal/impl/name/FqName";
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = str3;
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = str2;
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = str3;
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public FqName(String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        this.fqName = new FqNameUnsafe(str, this);
    }

    public static FqName topLevel(Name name) {
        if (name == null) {
            $$$reportNull$$$0(13);
        }
        return new FqName(FqNameUnsafe.topLevel(name));
    }

    public String asString() {
        String asString = this.fqName.asString();
        if (asString == null) {
            $$$reportNull$$$0(4);
        }
        return asString;
    }

    public FqName child(Name name) {
        if (name == null) {
            $$$reportNull$$$0(8);
        }
        return new FqName(this.fqName.child(name), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FqName)) {
            return false;
        }
        return this.fqName.equals(((FqName) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public boolean isRoot() {
        return this.fqName.isRoot();
    }

    public FqName parent() {
        FqName fqName2 = this.parent;
        if (fqName2 != null) {
            if (fqName2 == null) {
                $$$reportNull$$$0(6);
            }
            return fqName2;
        } else if (!isRoot()) {
            this.parent = new FqName(this.fqName.parent());
            FqName fqName3 = this.parent;
            if (fqName3 == null) {
                $$$reportNull$$$0(7);
            }
            return fqName3;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public List<Name> pathSegments() {
        List<Name> pathSegments = this.fqName.pathSegments();
        if (pathSegments == null) {
            $$$reportNull$$$0(11);
        }
        return pathSegments;
    }

    public Name shortName() {
        Name shortName = this.fqName.shortName();
        if (shortName == null) {
            $$$reportNull$$$0(9);
        }
        return shortName;
    }

    public Name shortNameOrSpecial() {
        Name shortNameOrSpecial = this.fqName.shortNameOrSpecial();
        if (shortNameOrSpecial == null) {
            $$$reportNull$$$0(10);
        }
        return shortNameOrSpecial;
    }

    public boolean startsWith(Name name) {
        if (name == null) {
            $$$reportNull$$$0(12);
        }
        return this.fqName.startsWith(name);
    }

    public String toString() {
        return this.fqName.toString();
    }

    public FqNameUnsafe toUnsafe() {
        FqNameUnsafe fqNameUnsafe = this.fqName;
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(5);
        }
        return fqNameUnsafe;
    }

    public FqName(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(2);
        }
        this.fqName = fqNameUnsafe;
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName2) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(3);
        }
        this.fqName = fqNameUnsafe;
        this.parent = fqName2;
    }
}
