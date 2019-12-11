package com.bamtech.sdk4.internal.media.offline;

import kotlin.C12898l;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DRMKeyMode;", "", "(Ljava/lang/String;I)V", "toDrmSessionMode", "", "Query", "Obtain", "Renew", "Release", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DRMKeyMode.kt */
public enum DRMKeyMode {
    Query,
    Obtain,
    Renew,
    Release;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            $EnumSwitchMapping$0 = new int[DRMKeyMode.values().length];
            $EnumSwitchMapping$0[DRMKeyMode.Renew.ordinal()] = 1;
            $EnumSwitchMapping$0[DRMKeyMode.Obtain.ordinal()] = 2;
            $EnumSwitchMapping$0[DRMKeyMode.Release.ordinal()] = 3;
            $EnumSwitchMapping$0[DRMKeyMode.Query.ordinal()] = 4;
        }
    }

    public final int toDrmSessionMode() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 1;
        }
        throw new C12898l();
    }
}
