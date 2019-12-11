package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.C12679a;
import kotlin.C12898l;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* compiled from: VersionRequirement.kt */
public final class VersionRequirement {
    public static final Companion Companion = new Companion(null);
    private final Integer errorCode;
    private final VersionKind kind;
    private final C12679a level;
    private final String message;
    private final Version version;

    /* compiled from: VersionRequirement.kt */
    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Level.values().length];

            static {
                $EnumSwitchMapping$0[Level.WARNING.ordinal()] = 1;
                $EnumSwitchMapping$0[Level.ERROR.ordinal()] = 2;
                $EnumSwitchMapping$0[Level.HIDDEN.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        public final List<VersionRequirement> create(MessageLite messageLite, NameResolver nameResolver, VersionRequirementTable versionRequirementTable) {
            List<Integer> list;
            if (messageLite instanceof Class) {
                list = ((Class) messageLite).getVersionRequirementList();
            } else if (messageLite instanceof Constructor) {
                list = ((Constructor) messageLite).getVersionRequirementList();
            } else if (messageLite instanceof Function) {
                list = ((Function) messageLite).getVersionRequirementList();
            } else if (messageLite instanceof Property) {
                list = ((Property) messageLite).getVersionRequirementList();
            } else if (messageLite instanceof TypeAlias) {
                list = ((TypeAlias) messageLite).getVersionRequirementList();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected declaration: ");
                sb.append(messageLite.getClass());
                throw new IllegalStateException(sb.toString());
            }
            C12880j.m40222a((Object) list, "ids");
            ArrayList arrayList = new ArrayList();
            for (Integer num : list) {
                Companion companion = VersionRequirement.Companion;
                C12880j.m40222a((Object) num, "id");
                VersionRequirement create = companion.create(num.intValue(), nameResolver, versionRequirementTable);
                if (create != null) {
                    arrayList.add(create);
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VersionRequirement create(int i, NameResolver nameResolver, VersionRequirementTable versionRequirementTable) {
            C12679a aVar;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = versionRequirementTable.get(i);
            String str = null;
            if (versionRequirement == null) {
                return null;
            }
            Version decode = Version.Companion.decode(versionRequirement.hasVersion() ? Integer.valueOf(versionRequirement.getVersion()) : null, versionRequirement.hasVersionFull() ? Integer.valueOf(versionRequirement.getVersionFull()) : null);
            Level level = versionRequirement.getLevel();
            if (level != null) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
                if (i2 == 1) {
                    aVar = C12679a.WARNING;
                } else if (i2 == 2) {
                    aVar = C12679a.ERROR;
                } else if (i2 == 3) {
                    aVar = C12679a.HIDDEN;
                } else {
                    throw new C12898l();
                }
                C12679a aVar2 = aVar;
                Integer valueOf = versionRequirement.hasErrorCode() ? Integer.valueOf(versionRequirement.getErrorCode()) : null;
                if (versionRequirement.hasMessage()) {
                    str = nameResolver.getString(versionRequirement.getMessage());
                }
                String str2 = str;
                VersionKind versionKind = versionRequirement.getVersionKind();
                C12880j.m40222a((Object) versionKind, "info.versionKind");
                VersionRequirement versionRequirement2 = new VersionRequirement(decode, versionKind, aVar2, valueOf, str2);
                return versionRequirement2;
            }
            C12880j.m40220a();
            throw null;
        }
    }

    /* compiled from: VersionRequirement.kt */
    public static final class Version {
        public static final Companion Companion = new Companion(null);
        public static final Version INFINITY = new Version(256, 256, 256);
        private final int major;
        private final int minor;
        private final int patch;

        /* compiled from: VersionRequirement.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Version decode(Integer num, Integer num2) {
                if (num2 != null) {
                    return new Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return Version.INFINITY;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Version(int i, int i2, int i3) {
            this.major = i;
            this.minor = i2;
            this.patch = i3;
        }

        public final String asString() {
            int i;
            StringBuilder sb;
            if (this.patch == 0) {
                sb = new StringBuilder();
                sb.append(this.major);
                sb.append('.');
                i = this.minor;
            } else {
                sb = new StringBuilder();
                sb.append(this.major);
                sb.append('.');
                sb.append(this.minor);
                sb.append('.');
                i = this.patch;
            }
            sb.append(i);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Version) {
                    Version version = (Version) obj;
                    if (this.major == version.major) {
                        if (this.minor == version.minor) {
                            if (this.patch == version.patch) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.major * 31) + this.minor) * 31) + this.patch;
        }

        public String toString() {
            return asString();
        }

        public /* synthetic */ Version(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            this(i, i2, i3);
        }
    }

    public VersionRequirement(Version version2, VersionKind versionKind, C12679a aVar, Integer num, String str) {
        this.version = version2;
        this.kind = versionKind;
        this.level = aVar;
        this.errorCode = num;
        this.message = str;
    }

    public final VersionKind getKind() {
        return this.kind;
    }

    public final Version getVersion() {
        return this.version;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("since ");
        sb.append(this.version);
        sb.append(' ');
        sb.append(this.level);
        String str2 = "";
        if (this.errorCode != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" error ");
            sb2.append(this.errorCode);
            str = sb2.toString();
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.message != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(this.message);
            str2 = sb3.toString();
        }
        sb.append(str2);
        return sb.toString();
    }
}
