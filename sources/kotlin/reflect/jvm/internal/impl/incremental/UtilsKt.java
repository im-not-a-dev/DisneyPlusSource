package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* compiled from: utils.kt */
public final class UtilsKt {
    public static final void record(LookupTracker lookupTracker, LookupLocation lookupLocation, ClassDescriptor classDescriptor, Name name) {
        if (lookupTracker != DO_NOTHING.INSTANCE) {
            LocationInfo location = lookupLocation.getLocation();
            if (location != null) {
                Position position = lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION();
                String filePath = location.getFilePath();
                String asString = DescriptorUtils.getFqName(classDescriptor).asString();
                Intrinsics.checkReturnedValueIsNotNull((Object) asString, "DescriptorUtils.getFqName(scopeOwner).asString()");
                ScopeKind scopeKind = ScopeKind.CLASSIFIER;
                String asString2 = name.asString();
                Intrinsics.checkReturnedValueIsNotNull((Object) asString2, "name.asString()");
                lookupTracker.record(filePath, position, asString, scopeKind, asString2);
            }
        }
    }

    public static final void recordPackageLookup(LookupTracker lookupTracker, LookupLocation lookupLocation, String str, String str2) {
        if (lookupTracker != DO_NOTHING.INSTANCE) {
            LocationInfo location = lookupLocation.getLocation();
            if (location != null) {
                lookupTracker.record(location.getFilePath(), lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION(), str, ScopeKind.PACKAGE, str2);
            }
        }
    }

    public static final void record(LookupTracker lookupTracker, LookupLocation lookupLocation, PackageFragmentDescriptor packageFragmentDescriptor, Name name) {
        String asString = packageFragmentDescriptor.getFqName().asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "scopeOwner.fqName.asString()");
        String asString2 = name.asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString2, "name.asString()");
        recordPackageLookup(lookupTracker, lookupLocation, asString, asString2);
    }
}
