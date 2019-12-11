package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.p588j0.C12815k;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalSignature;
import kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck;

/* compiled from: modifierChecks.kt */
public final class Checks {
    private final Function1<FunctionDescriptor, String> additionalCheck;
    private final Check[] checks;
    private final Name name;
    private final Collection<Name> nameList;
    private final C12815k regex;

    private Checks(Name name2, C12815k kVar, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.name = name2;
        this.regex = kVar;
        this.nameList = collection;
        this.additionalCheck = function1;
        this.checks = checkArr;
    }

    public final CheckResult checkAll(FunctionDescriptor functionDescriptor) {
        for (Check invoke : this.checks) {
            String invoke2 = invoke.invoke(functionDescriptor);
            if (invoke2 != null) {
                return new IllegalSignature(invoke2);
            }
        }
        String str = (String) this.additionalCheck.invoke(functionDescriptor);
        if (str != null) {
            return new IllegalSignature(str);
        }
        return SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(FunctionDescriptor functionDescriptor) {
        if (this.name != null && (!C12880j.m40224a((Object) functionDescriptor.getName(), (Object) this.name))) {
            return false;
        }
        if (this.regex != null) {
            String asString = functionDescriptor.getName().asString();
            C12880j.m40222a((Object) asString, "functionDescriptor.name.asString()");
            if (!this.regex.mo31141c(asString)) {
                return false;
            }
        }
        Collection<Name> collection = this.nameList;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name2, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            function1 = C131322.INSTANCE;
        }
        this(name2, checkArr, function1);
    }

    public Checks(Name name2, Check[] checkArr, Function1<? super FunctionDescriptor, String> function1) {
        this(name2, (C12815k) null, null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
    }

    public /* synthetic */ Checks(C12815k kVar, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            function1 = C131333.INSTANCE;
        }
        this(kVar, checkArr, function1);
    }

    public Checks(C12815k kVar, Check[] checkArr, Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, kVar, null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            function1 = C131344.INSTANCE;
        }
        this(collection, checkArr, function1);
    }

    public Checks(Collection<Name> collection, Check[] checkArr, Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, (C12815k) null, collection, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
    }
}
