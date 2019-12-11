package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;

/* compiled from: KotlinClassHeader.kt */
public final class KotlinClassHeader {
    private final JvmBytecodeBinaryVersion bytecodeVersion;
    private final String[] data;
    private final int extraInt;
    private final String extraString;
    private final String[] incompatibleData;
    private final Kind kind;
    private final JvmMetadataVersion metadataVersion;
    private final String packageName;
    private final String[] strings;

    /* compiled from: KotlinClassHeader.kt */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public static final Map<Integer, Kind> entryById = null;

        /* renamed from: id */
        private final int f29567id;

        /* compiled from: KotlinClassHeader.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind != null ? kind : Kind.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            int i;
            Companion = new Companion(null);
            Kind[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(values.length), 16));
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.f29567id), kind);
            }
            entryById = linkedHashMap;
        }

        private Kind(int i) {
            this.f29567id = i;
        }

        public static final Kind getById(int i) {
            return Companion.getById(i);
        }
    }

    public KotlinClassHeader(Kind kind2, JvmMetadataVersion jvmMetadataVersion, JvmBytecodeBinaryVersion jvmBytecodeBinaryVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        this.kind = kind2;
        this.metadataVersion = jvmMetadataVersion;
        this.bytecodeVersion = jvmBytecodeBinaryVersion;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i;
        this.packageName = str2;
    }

    public final String[] getData() {
        return this.data;
    }

    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final JvmMetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    public final String getMultifileClassName() {
        String str = this.extraString;
        if (this.kind == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> getMultifilePartNames() {
        String[] strArr = this.data;
        List<String> list = null;
        if (!(this.kind == Kind.MULTIFILE_CLASS)) {
            strArr = null;
        }
        if (strArr != null) {
            list = C13171j.m40336a((Object[]) strArr);
        }
        return list != null ? list : C13185o.m40513a();
    }

    public final String[] getStrings() {
        return this.strings;
    }

    public final boolean isPreRelease() {
        return (this.extraInt & 2) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.kind);
        sb.append(" version=");
        sb.append(this.metadataVersion);
        return sb.toString();
    }
}
