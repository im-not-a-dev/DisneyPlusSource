package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* compiled from: BuiltInsBinaryVersion.kt */
public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    /* compiled from: BuiltInsBinaryVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public final BuiltInsBinaryVersion readFrom(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C12757d dVar = new C12757d(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) dVar, 10));
            Iterator it = dVar.iterator();
            while (it.hasNext()) {
                ((C13162e0) it).mo31079b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] b = C13199w.m40570b(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(b, b.length));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BuiltInsBinaryVersion(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
    }

    public boolean isCompatible() {
        return isCompatibleTo(INSTANCE);
    }
}
