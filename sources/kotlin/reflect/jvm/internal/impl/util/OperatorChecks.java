package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.Equals;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks extends AbstractModifierChecks {
    public static final OperatorChecks INSTANCE = new OperatorChecks();
    private static final List<Checks> checks;

    static {
        Checks checks2 = new Checks(OperatorNameConventions.GET, new Check[]{MemberOrExtension.INSTANCE, new AtLeast(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name = OperatorNameConventions.SET;
        Check[] checkArr = {MemberOrExtension.INSTANCE, new AtLeast(2)};
        Checks checks3 = new Checks(OperatorNameConventions.GET_VALUE, new Check[]{MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new AtLeast(2), IsKPropertyCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks4 = new Checks(OperatorNameConventions.SET_VALUE, new Check[]{MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new AtLeast(3), IsKPropertyCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(OperatorNameConventions.PROVIDE_DELEGATE, new Check[]{MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new Equals(2), IsKPropertyCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(OperatorNameConventions.INVOKE, new Check[]{MemberOrExtension.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks7 = new Checks(OperatorNameConventions.CONTAINS, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, ReturnsBoolean.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks8 = new Checks(OperatorNameConventions.ITERATOR, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks9 = new Checks(OperatorNameConventions.NEXT, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks10 = new Checks(OperatorNameConventions.HAS_NEXT, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE, ReturnsBoolean.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks11 = new Checks(OperatorNameConventions.RANGE_TO, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name2 = OperatorNameConventions.EQUALS;
        Check[] checkArr2 = {Member.INSTANCE};
        Checks checks12 = new Checks(OperatorNameConventions.COMPARE_TO, new Check[]{MemberOrExtension.INSTANCE, ReturnsInt.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks13 = new Checks((Collection) OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks14 = new Checks((Collection) OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        List c = C13185o.m40520c(OperatorNameConventions.INC, OperatorNameConventions.DEC);
        Check[] checkArr3 = {MemberOrExtension.INSTANCE};
        Checks checks15 = new Checks((Collection) OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{MemberOrExtension.INSTANCE, ReturnsUnit.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks16 = new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null);
        checks = C13185o.m40520c(checks2, new Checks(name, checkArr, (Function1<? super FunctionDescriptor, String>) OperatorChecks$checks$1.INSTANCE), checks3, checks4, checks5, checks6, checks7, checks8, checks9, checks10, checks11, new Checks(name2, checkArr2, (Function1<? super FunctionDescriptor, String>) OperatorChecks$checks$2.INSTANCE), checks12, checks13, checks14, new Checks((Collection<Name>) c, checkArr3, (Function1<? super FunctionDescriptor, String>) OperatorChecks$checks$3.INSTANCE), checks15, checks16);
    }

    private OperatorChecks() {
    }

    public List<Checks> getChecks$descriptors() {
        return checks;
    }
}
