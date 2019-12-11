package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.C13145v;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

public class OverridingUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final OverridingUtil DEFAULT = new OverridingUtil(new TypeConstructorEquality() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                $$$reportNull$$$0(0);
            }
            if (typeConstructor2 == null) {
                $$$reportNull$$$0(1);
            }
            return typeConstructor.equals(typeConstructor2);
        }
    });
    private static final List<ExternalOverridabilityCondition> EXTERNAL_CONDITIONS;
    /* access modifiers changed from: private */
    public final TypeConstructorEquality equalityAxioms;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$9 */
    static /* synthetic */ class C130999 {
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$descriptors$Modality = new int[Modality.values().length];

        /* renamed from: $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result */
        static final /* synthetic */ int[] f29572x42e2f52f = new int[Result.values().length];

        /* renamed from: $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result */
        static final /* synthetic */ int[] f29573xb0ae9f3b = new int[Result.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jetbrains$kotlin$descriptors$Modality = r0
                r0 = 1
                int[] r1 = $SwitchMap$org$jetbrains$kotlin$descriptors$Modality     // Catch:{ NoSuchFieldError -> 0x0014 }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$org$jetbrains$kotlin$descriptors$Modality     // Catch:{ NoSuchFieldError -> 0x001f }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$org$jetbrains$kotlin$descriptors$Modality     // Catch:{ NoSuchFieldError -> 0x002a }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = $SwitchMap$org$jetbrains$kotlin$descriptors$Modality     // Catch:{ NoSuchFieldError -> 0x0035 }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f29573xb0ae9f3b = r4
                int[] r4 = f29573xb0ae9f3b     // Catch:{ NoSuchFieldError -> 0x0048 }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r4 = f29573xb0ae9f3b     // Catch:{ NoSuchFieldError -> 0x0052 }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r4 = f29573xb0ae9f3b     // Catch:{ NoSuchFieldError -> 0x005c }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result[] r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f29572x42e2f52f = r4
                int[] r4 = f29572x42e2f52f     // Catch:{ NoSuchFieldError -> 0x006f }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f29572x42e2f52f     // Catch:{ NoSuchFieldError -> 0x0079 }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.CONFLICT     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f29572x42e2f52f     // Catch:{ NoSuchFieldError -> 0x0083 }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f29572x42e2f52f     // Catch:{ NoSuchFieldError -> 0x008d }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C130999.<clinit>():void");
        }
    }

    public static class OverrideCompatibilityInfo {
        private static final OverrideCompatibilityInfo SUCCESS = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        private final String debugMessage;
        private final Result overridable;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void $$$reportNull$$$0(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = 2
                goto L_0x001c
            L_0x001b:
                r5 = 3
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.$$$reportNull$$$0(int):void");
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                $$$reportNull$$$0(3);
            }
            if (str == null) {
                $$$reportNull$$$0(4);
            }
            this.overridable = result;
            this.debugMessage = str;
        }

        public static OverrideCompatibilityInfo conflict(String str) {
            if (str == null) {
                $$$reportNull$$$0(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public static OverrideCompatibilityInfo incompatible(String str) {
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public static OverrideCompatibilityInfo success() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = SUCCESS;
            if (overrideCompatibilityInfo == null) {
                $$$reportNull$$$0(0);
            }
            return overrideCompatibilityInfo;
        }

        public Result getResult() {
            Result result = this.overridable;
            if (result == null) {
                $$$reportNull$$$0(5);
            }
            return result;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 5 || i3 == 9 || i3 == 14 || i3 == 87 || i3 == 90 || i3 == 95 || i3 == 37 || i3 == 38)) {
            switch (i3) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i3) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            switch (i3) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    break;
                                default:
                                    switch (i3) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 5 || i3 == 9 || i3 == 14 || i3 == 87 || i3 == 90 || i3 == 95 || i3 == 37 || i3 == 38)) {
            switch (i3) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i3) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            switch (i3) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    break;
                                default:
                                    switch (i3) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
        switch (i3) {
            case 1:
            case 2:
                objArr[0] = "candidateSet";
                break;
            case 3:
                objArr[0] = "transformFirst";
                break;
            case 4:
            case 5:
            case 9:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 37:
            case 38:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 82:
            case 83:
            case 84:
            case 87:
            case 90:
            case 95:
                objArr[0] = str2;
                break;
            case 6:
                objArr[0] = "f";
                break;
            case 7:
                objArr[0] = "g";
                break;
            case 8:
            case 10:
                objArr[0] = "descriptor";
                break;
            case 11:
                objArr[0] = "result";
                break;
            case 12:
            case 15:
            case 23:
            case 33:
                objArr[0] = "superDescriptor";
                break;
            case 13:
            case 16:
            case 24:
            case 34:
                objArr[0] = "subDescriptor";
                break;
            case 35:
                objArr[0] = "firstParameters";
                break;
            case 36:
                objArr[0] = "secondParameters";
                break;
            case 39:
                objArr[0] = "typeInSuper";
                break;
            case 40:
                objArr[0] = "typeInSub";
                break;
            case 41:
            case 44:
                objArr[0] = "typeChecker";
                break;
            case 42:
                objArr[0] = "superTypeParameter";
                break;
            case 43:
                objArr[0] = "subTypeParameter";
                break;
            case 45:
                objArr[0] = "name";
                break;
            case 46:
                objArr[0] = "membersFromSupertypes";
                break;
            case 47:
                objArr[0] = "membersFromCurrent";
                break;
            case 48:
            case 54:
            case 57:
            case 78:
            case 81:
            case 88:
                objArr[0] = "current";
                break;
            case 49:
            case 55:
            case 59:
            case 79:
            case 98:
                objArr[0] = "strategy";
                break;
            case 50:
                objArr[0] = "overriding";
                break;
            case 51:
                objArr[0] = "fromSuper";
                break;
            case 52:
                objArr[0] = "fromCurrent";
                break;
            case 53:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 56:
            case 58:
                objArr[0] = "notOverridden";
                break;
            case 60:
            case 62:
            case 66:
                objArr[0] = "a";
                break;
            case 61:
            case 63:
            case 68:
                objArr[0] = "b";
                break;
            case 64:
                objArr[0] = "candidate";
                break;
            case 65:
            case 80:
            case 85:
            case 101:
                objArr[0] = "descriptors";
                break;
            case 67:
                objArr[0] = "aReturnType";
                break;
            case 69:
                objArr[0] = "bReturnType";
                break;
            case 70:
            case 77:
                objArr[0] = "overridables";
                break;
            case 71:
            case 93:
                objArr[0] = "descriptorByHandle";
                break;
            case 86:
                objArr[0] = "classModality";
                break;
            case 89:
                objArr[0] = "toFilter";
                break;
            case 91:
            case 96:
                objArr[0] = "overrider";
                break;
            case 92:
            case 97:
                objArr[0] = "extractFrom";
                break;
            case 94:
                objArr[0] = "onConflict";
                break;
            case 99:
            case 100:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        String str3 = "getOverriddenDeclarations";
        String str4 = "filterOverrides";
        if (i3 == 4 || i3 == 5) {
            objArr[1] = str4;
        } else if (i3 != 9) {
            if (i3 != 14) {
                if (i3 == 87) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 90) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 95) {
                    if (i3 != 37 && i3 != 38) {
                        switch (i3) {
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (i3) {
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 72:
                                            case 73:
                                            case 74:
                                            case 75:
                                            case 76:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = str2;
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeChecker";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = str3;
        }
        switch (i3) {
            case 1:
                objArr[2] = "filterOutOverridden";
                break;
            case 2:
            case 3:
                objArr[2] = str4;
                break;
            case 4:
            case 5:
            case 9:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 37:
            case 38:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 82:
            case 83:
            case 84:
            case 87:
            case 90:
            case 95:
                break;
            case 6:
            case 7:
                objArr[2] = "overrides";
                break;
            case 8:
                objArr[2] = str3;
                break;
            case 10:
            case 11:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 12:
            case 13:
            case 15:
            case 16:
                objArr[2] = "isOverridableBy";
                break;
            case 23:
            case 24:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 33:
            case 34:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 35:
            case 36:
                objArr[2] = "createTypeChecker";
                break;
            case 39:
            case 40:
            case 41:
                objArr[2] = "areTypesEquivalent";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 50:
            case 51:
                objArr[2] = "isVisibleForOverride";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 56:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 57:
            case 58:
            case 59:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 60:
            case 61:
                objArr[2] = "isMoreSpecific";
                break;
            case 62:
            case 63:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 64:
            case 65:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 66:
            case 67:
            case 68:
            case 69:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 70:
            case 71:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 77:
            case 78:
            case 79:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 80:
            case 81:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 85:
            case 86:
                objArr[2] = "getMinimalModality";
                break;
            case 88:
            case 89:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 99:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 100:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 101:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 5 || i3 == 9 || i3 == 14 || i3 == 87 || i3 == 90 || i3 == 95 || i3 == 37 || i3 == 38)) {
            switch (i3) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i3) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            switch (i3) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    break;
                                default:
                                    switch (i3) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    static {
        Class<ExternalOverridabilityCondition> cls = ExternalOverridabilityCondition.class;
        EXTERNAL_CONDITIONS = C13199w.m40606q(ServiceLoader.load(cls, cls.getClassLoader()));
    }

    private OverridingUtil(TypeConstructorEquality typeConstructorEquality) {
        this.equalityAxioms = typeConstructorEquality;
    }

    private static boolean allHasSameContainingDeclaration(Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(56);
        }
        if (collection.size() < 2) {
            return true;
        }
        final DeclarationDescriptor containingDeclaration = ((CallableMemberDescriptor) collection.iterator().next()).getContainingDeclaration();
        return C13199w.m40569b((Iterable) collection, (Function1) new Function1<CallableMemberDescriptor, Boolean>() {
            public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return Boolean.valueOf(callableMemberDescriptor.getContainingDeclaration() == containingDeclaration);
            }
        });
    }

    private static boolean areTypeParametersEquivalent(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, KotlinTypeChecker kotlinTypeChecker) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(42);
        }
        if (typeParameterDescriptor2 == null) {
            $$$reportNull$$$0(43);
        }
        if (kotlinTypeChecker == null) {
            $$$reportNull$$$0(44);
        }
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (KotlinType kotlinType : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (areTypesEquivalent(kotlinType, (KotlinType) listIterator.next(), kotlinTypeChecker)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static boolean areTypesEquivalent(KotlinType kotlinType, KotlinType kotlinType2, KotlinTypeChecker kotlinTypeChecker) {
        if (kotlinType == null) {
            $$$reportNull$$$0(39);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(40);
        }
        if (kotlinTypeChecker == null) {
            $$$reportNull$$$0(41);
        }
        if ((KotlinTypeKt.isError(kotlinType) && KotlinTypeKt.isError(kotlinType2)) || kotlinTypeChecker.equalTypes(kotlinType, kotlinType2)) {
            return true;
        }
        return false;
    }

    private static OverrideCompatibilityInfo checkReceiverAndParameterCount(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z = true;
        boolean z2 = callableDescriptor.getExtensionReceiverParameter() == null;
        if (callableDescriptor2.getExtensionReceiverParameter() != null) {
            z = false;
        }
        if (z2 != z) {
            return OverrideCompatibilityInfo.incompatible("Receiver presence mismatch");
        }
        if (callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size()) {
            return OverrideCompatibilityInfo.incompatible("Value parameter number mismatch");
        }
        return null;
    }

    private static void collectOverriddenDeclarations(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(10);
        }
        if (set == null) {
            $$$reportNull$$$0(11);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
        } else if (!callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            for (CallableMemberDescriptor collectOverriddenDeclarations : callableMemberDescriptor.getOverriddenDescriptors()) {
                collectOverriddenDeclarations(collectOverriddenDeclarations, set);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No overridden descriptors found for (fake override) ");
            sb.append(callableMemberDescriptor);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static List<KotlinType> compiledValueParameters(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        for (ValueParameterDescriptor type : callableDescriptor.getValueParameters()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    private static Visibility computeVisibilityToInherit(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(100);
        }
        Collection<CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Visibility findMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (findMaxVisibility == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() != Kind.FAKE_OVERRIDE) {
            return findMaxVisibility.normalize();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : overriddenDescriptors) {
            if (callableMemberDescriptor2.getModality() != Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(findMaxVisibility)) {
                return null;
            }
        }
        return findMaxVisibility;
    }

    private static void createAndBindFakeOverride(Collection<CallableMemberDescriptor> collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (collection == null) {
            $$$reportNull$$$0(77);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(78);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(79);
        }
        Collection<CallableMemberDescriptor> filterVisibleFakeOverrides = filterVisibleFakeOverrides(classDescriptor, collection);
        boolean isEmpty = filterVisibleFakeOverrides.isEmpty();
        if (!isEmpty) {
            collection = filterVisibleFakeOverrides;
        }
        CallableMemberDescriptor copy = ((CallableMemberDescriptor) selectMostSpecificMember(collection, new Function1<CallableMemberDescriptor, CallableDescriptor>() {
            public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        })).copy(classDescriptor, determineModalityForFakeOverride(collection, classDescriptor), isEmpty ? Visibilities.INVISIBLE_FAKE : Visibilities.INHERITED, Kind.FAKE_OVERRIDE, false);
        overridingStrategy.setOverriddenDescriptors(copy, collection);
        overridingStrategy.addFakeOverride(copy);
    }

    private static void createAndBindFakeOverrides(ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection, OverridingStrategy overridingStrategy) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(57);
        }
        if (collection == null) {
            $$$reportNull$$$0(58);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(59);
        }
        if (allHasSameContainingDeclaration(collection)) {
            for (CallableMemberDescriptor singleton : collection) {
                createAndBindFakeOverride(Collections.singleton(singleton), classDescriptor, overridingStrategy);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            createAndBindFakeOverride(extractMembersOverridableInBothWays(VisibilityUtilKt.findMemberWithMaxVisibility(linkedList), linkedList, overridingStrategy), classDescriptor, overridingStrategy);
        }
    }

    private KotlinTypeChecker createTypeChecker(List<TypeParameterDescriptor> list, List<TypeParameterDescriptor> list2) {
        if (list == null) {
            $$$reportNull$$$0(35);
        }
        if (list2 == null) {
            $$$reportNull$$$0(36);
        }
        if (list.isEmpty()) {
            KotlinTypeChecker withAxioms = KotlinTypeCheckerImpl.withAxioms(this.equalityAxioms);
            if (withAxioms == null) {
                $$$reportNull$$$0(37);
            }
            return withAxioms;
        }
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((TypeParameterDescriptor) list.get(i)).getTypeConstructor(), ((TypeParameterDescriptor) list2.get(i)).getTypeConstructor());
        }
        KotlinTypeChecker withAxioms2 = KotlinTypeCheckerImpl.withAxioms(new TypeConstructorEquality() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "a";
                } else {
                    objArr[0] = "b";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
                objArr[2] = "equals";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                boolean z = false;
                if (typeConstructor == null) {
                    $$$reportNull$$$0(0);
                }
                if (typeConstructor2 == null) {
                    $$$reportNull$$$0(1);
                }
                if (OverridingUtil.this.equalityAxioms.equals(typeConstructor, typeConstructor2)) {
                    return true;
                }
                TypeConstructor typeConstructor3 = (TypeConstructor) hashMap.get(typeConstructor);
                TypeConstructor typeConstructor4 = (TypeConstructor) hashMap.get(typeConstructor2);
                if ((typeConstructor3 != null && typeConstructor3.equals(typeConstructor2)) || (typeConstructor4 != null && typeConstructor4.equals(typeConstructor))) {
                    z = true;
                }
                return z;
            }
        });
        if (withAxioms2 == null) {
            $$$reportNull$$$0(38);
        }
        return withAxioms2;
    }

    public static OverridingUtil createWithEqualityAxioms(TypeConstructorEquality typeConstructorEquality) {
        if (typeConstructorEquality == null) {
            $$$reportNull$$$0(0);
        }
        return new OverridingUtil(typeConstructorEquality);
    }

    private static Modality determineModalityForFakeOverride(Collection<CallableMemberDescriptor> collection, ClassDescriptor classDescriptor) {
        if (collection == null) {
            $$$reportNull$$$0(80);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(81);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i = C130999.$SwitchMap$org$jetbrains$kotlin$descriptors$Modality[callableMemberDescriptor.getModality().ordinal()];
            if (i == 1) {
                Modality modality = Modality.FINAL;
                if (modality == null) {
                    $$$reportNull$$$0(82);
                }
                return modality;
            } else if (i == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Member cannot have SEALED modality: ");
                sb.append(callableMemberDescriptor);
                throw new IllegalStateException(sb.toString());
            } else if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (!(!classDescriptor.isExpect() || classDescriptor.getModality() == Modality.ABSTRACT || classDescriptor.getModality() == Modality.SEALED)) {
            z = true;
        }
        if (z2 && !z3) {
            Modality modality2 = Modality.OPEN;
            if (modality2 == null) {
                $$$reportNull$$$0(83);
            }
            return modality2;
        } else if (z2 || !z3) {
            HashSet hashSet = new HashSet();
            for (CallableMemberDescriptor overriddenDeclarations : collection) {
                hashSet.addAll(getOverriddenDeclarations(overriddenDeclarations));
            }
            return getMinimalModality(filterOutOverridden(hashSet), z, classDescriptor.getModality());
        } else {
            Modality modality3 = z ? classDescriptor.getModality() : Modality.ABSTRACT;
            if (modality3 == null) {
                $$$reportNull$$$0(84);
            }
            return modality3;
        }
    }

    private static Collection<CallableMemberDescriptor> extractAndBindOverridesForMember(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(52);
        }
        if (collection == null) {
            $$$reportNull$$$0(53);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(54);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(55);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        SmartSet create = SmartSet.create();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Result result = DEFAULT.isOverridableBy(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).getResult();
            boolean isVisibleForOverride = isVisibleForOverride(callableMemberDescriptor, callableMemberDescriptor2);
            int i = C130999.f29573xb0ae9f3b[result.ordinal()];
            if (i == 1) {
                if (isVisibleForOverride) {
                    create.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i == 2) {
                if (isVisibleForOverride) {
                    overridingStrategy.overrideConflict(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        overridingStrategy.setOverriddenDescriptors(callableMemberDescriptor, create);
        return arrayList;
    }

    public static <H> Collection<H> extractMembersOverridableInBothWays(H h, Collection<H> collection, Function1<H, CallableDescriptor> function1, Function1<H, C13145v> function12) {
        if (h == null) {
            $$$reportNull$$$0(91);
        }
        if (collection == null) {
            $$$reportNull$$$0(92);
        }
        if (function1 == null) {
            $$$reportNull$$$0(93);
        }
        if (function12 == null) {
            $$$reportNull$$$0(94);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(h);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                Result bothWaysOverridability = getBothWaysOverridability(callableDescriptor, callableDescriptor2);
                if (bothWaysOverridability == Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == Result.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static <D extends CallableDescriptor> Set<D> filterOutOverridden(Set<D> set) {
        if (set == null) {
            $$$reportNull$$$0(1);
        }
        return filterOverrides(set, new Function2<D, D, Pair<CallableDescriptor, CallableDescriptor>>() {
            public Pair<CallableDescriptor, CallableDescriptor> invoke(D d, D d2) {
                return new Pair<>(d, d2);
            }
        });
    }

    public static <D> Set<D> filterOverrides(Set<D> set, Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> function2) {
        if (set == null) {
            $$$reportNull$$$0(2);
        }
        if (function2 == null) {
            $$$reportNull$$$0(3);
        }
        if (set.size() <= 1) {
            if (set == null) {
                $$$reportNull$$$0(4);
            }
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : set) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(next);
                    break;
                }
                Pair pair = (Pair) function2.invoke(next, it.next());
                CallableDescriptor callableDescriptor = (CallableDescriptor) pair.mo31013a();
                CallableDescriptor callableDescriptor2 = (CallableDescriptor) pair.mo31014b();
                if (overrides(callableDescriptor, callableDescriptor2)) {
                    it.remove();
                } else if (overrides(callableDescriptor2, callableDescriptor)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    private static Collection<CallableMemberDescriptor> filterVisibleFakeOverrides(final ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(88);
        }
        if (collection == null) {
            $$$reportNull$$$0(89);
        }
        List c = C13199w.m40573c((Iterable) collection, (Function1) new Function1<CallableMemberDescriptor, Boolean>() {
            public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return Boolean.valueOf(!Visibilities.isPrivate(callableMemberDescriptor.getVisibility()) && Visibilities.isVisibleIgnoringReceiver(callableMemberDescriptor, classDescriptor));
            }
        });
        if (c == null) {
            $$$reportNull$$$0(90);
        }
        return c;
    }

    public static Visibility findMaxVisibility(Collection<? extends CallableMemberDescriptor> collection) {
        Visibility visibility;
        if (collection == null) {
            $$$reportNull$$$0(101);
        }
        if (collection.isEmpty()) {
            return Visibilities.DEFAULT_VISIBILITY;
        }
        Iterator it = collection.iterator();
        loop0:
        while (true) {
            visibility = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Visibility visibility2 = ((CallableMemberDescriptor) it.next()).getVisibility();
                if (visibility != null) {
                    Integer compare = Visibilities.compare(visibility2, visibility);
                    if (compare != null) {
                        if (compare.intValue() <= 0) {
                        }
                    }
                }
                visibility = visibility2;
            }
        }
        if (visibility == null) {
            return null;
        }
        for (CallableMemberDescriptor visibility3 : collection) {
            Integer compare2 = Visibilities.compare(visibility, visibility3.getVisibility());
            if (compare2 != null) {
                if (compare2.intValue() < 0) {
                }
            }
            return null;
        }
        return visibility;
    }

    public static void generateOverridesInFunctionGroup(Name name, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (name == null) {
            $$$reportNull$$$0(45);
        }
        if (collection == null) {
            $$$reportNull$$$0(46);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(47);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(48);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(49);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor extractAndBindOverridesForMember : collection2) {
            linkedHashSet.removeAll(extractAndBindOverridesForMember(extractAndBindOverridesForMember, collection, classDescriptor, overridingStrategy));
        }
        createAndBindFakeOverrides(classDescriptor, linkedHashSet, overridingStrategy);
    }

    public static OverrideCompatibilityInfo getBasicOverridabilityProblem(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(33);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(34);
        }
        boolean z = callableDescriptor instanceof FunctionDescriptor;
        if (!z || (callableDescriptor2 instanceof FunctionDescriptor)) {
            boolean z2 = callableDescriptor instanceof PropertyDescriptor;
            if (!z2 || (callableDescriptor2 instanceof PropertyDescriptor)) {
                if (!z && !z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("This type of CallableDescriptor cannot be checked for overridability: ");
                    sb.append(callableDescriptor);
                    throw new IllegalArgumentException(sb.toString());
                } else if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
                    return OverrideCompatibilityInfo.incompatible("Name mismatch");
                } else {
                    OverrideCompatibilityInfo checkReceiverAndParameterCount = checkReceiverAndParameterCount(callableDescriptor, callableDescriptor2);
                    if (checkReceiverAndParameterCount != null) {
                        return checkReceiverAndParameterCount;
                    }
                    return null;
                }
            }
        }
        return OverrideCompatibilityInfo.incompatible("Member kind mismatch");
    }

    public static Result getBothWaysOverridability(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        Result result = DEFAULT.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        Result result2 = DEFAULT.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        Result result3 = Result.OVERRIDABLE;
        if (result == result3 && result2 == result3) {
            return result3;
        }
        Result result4 = Result.CONFLICT;
        return (result == result4 || result2 == result4) ? Result.CONFLICT : Result.INCOMPATIBLE;
    }

    private static Modality getMinimalModality(Collection<CallableMemberDescriptor> collection, boolean z, Modality modality) {
        if (collection == null) {
            $$$reportNull$$$0(85);
        }
        if (modality == null) {
            $$$reportNull$$$0(86);
        }
        Modality modality2 = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Modality modality3 = (!z || callableMemberDescriptor.getModality() != Modality.ABSTRACT) ? callableMemberDescriptor.getModality() : modality;
            if (modality3.compareTo(modality2) < 0) {
                modality2 = modality3;
            }
        }
        if (modality2 == null) {
            $$$reportNull$$$0(87);
        }
        return modality2;
    }

    public static Set<CallableMemberDescriptor> getOverriddenDeclarations(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(8);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        collectOverriddenDeclarations(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    private static boolean isAccessorMoreSpecific(PropertyAccessorDescriptor propertyAccessorDescriptor, PropertyAccessorDescriptor propertyAccessorDescriptor2) {
        if (propertyAccessorDescriptor == null || propertyAccessorDescriptor2 == null) {
            return true;
        }
        return isVisibilityMoreSpecific(propertyAccessorDescriptor, propertyAccessorDescriptor2);
    }

    public static boolean isMoreSpecific(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(60);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(61);
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        boolean z = false;
        if (!isVisibilityMoreSpecific(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        if (callableDescriptor instanceof FunctionDescriptor) {
            return isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2);
        }
        if (callableDescriptor instanceof PropertyDescriptor) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
            PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
            if (!isAccessorMoreSpecific(propertyDescriptor.getSetter(), propertyDescriptor2.getSetter())) {
                return false;
            }
            if (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) {
                return DEFAULT.createTypeChecker(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters()).equalTypes(returnType, returnType2);
            }
            if ((propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2)) {
                z = true;
            }
            return z;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected callable: ");
        sb.append(callableDescriptor.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    private static boolean isMoreSpecificThenAllOf(CallableDescriptor callableDescriptor, Collection<CallableDescriptor> collection) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(64);
        }
        if (collection == null) {
            $$$reportNull$$$0(65);
        }
        for (CallableDescriptor isMoreSpecific : collection) {
            if (!isMoreSpecific(callableDescriptor, isMoreSpecific)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isReturnTypeMoreSpecific(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(66);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(67);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(68);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(69);
        }
        return DEFAULT.createTypeChecker(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters()).isSubtypeOf(kotlinType, kotlinType2);
    }

    private static boolean isVisibilityMoreSpecific(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(62);
        }
        if (declarationDescriptorWithVisibility2 == null) {
            $$$reportNull$$$0(63);
        }
        Integer compare = Visibilities.compare(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        return compare == null || compare.intValue() >= 0;
    }

    public static boolean isVisibleForOverride(MemberDescriptor memberDescriptor, MemberDescriptor memberDescriptor2) {
        if (memberDescriptor == null) {
            $$$reportNull$$$0(50);
        }
        if (memberDescriptor2 == null) {
            $$$reportNull$$$0(51);
        }
        return !Visibilities.isPrivate(memberDescriptor2.getVisibility()) && Visibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor);
    }

    public static <D extends CallableDescriptor> boolean overrides(D d, D d2) {
        if (d == null) {
            $$$reportNull$$$0(6);
        }
        if (d2 == null) {
            $$$reportNull$$$0(7);
        }
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d.getOriginal(), d2.getOriginal())) {
            return true;
        }
        CallableDescriptor original = d2.getOriginal();
        for (CallableDescriptor areEquivalent : DescriptorUtils.getAllOverriddenDescriptors(d)) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, areEquivalent)) {
                return true;
            }
        }
        return false;
    }

    public static void resolveUnknownVisibilityForMember(CallableMemberDescriptor callableMemberDescriptor, Function1<CallableMemberDescriptor, C13145v> function1) {
        Visibility visibility;
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(99);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == Visibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() == Visibilities.INHERITED) {
            Visibility computeVisibilityToInherit = computeVisibilityToInherit(callableMemberDescriptor);
            if (computeVisibilityToInherit == null) {
                if (function1 != null) {
                    function1.invoke(callableMemberDescriptor);
                }
                visibility = Visibilities.PUBLIC;
            } else {
                visibility = computeVisibilityToInherit;
            }
            if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
                ((PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(visibility);
                for (PropertyAccessorDescriptor resolveUnknownVisibilityForMember : ((PropertyDescriptor) callableMemberDescriptor).getAccessors()) {
                    resolveUnknownVisibilityForMember(resolveUnknownVisibilityForMember, computeVisibilityToInherit == null ? null : function1);
                }
            } else if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
                ((FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(visibility);
            } else {
                PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
                propertyAccessorDescriptorImpl.setVisibility(visibility);
                if (visibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
                    propertyAccessorDescriptorImpl.setDefault(false);
                }
            }
        }
    }

    public static <H> H selectMostSpecificMember(Collection<H> collection, Function1<H, CallableDescriptor> function1) {
        if (collection == null) {
            $$$reportNull$$$0(70);
        }
        if (function1 == null) {
            $$$reportNull$$$0(71);
        }
        if (collection.size() == 1) {
            H f = C13199w.m40588f((Iterable) collection);
            if (f == null) {
                $$$reportNull$$$0(72);
            }
            return f;
        }
        ArrayList arrayList = new ArrayList(2);
        List d = C13199w.m40582d((Iterable) collection, (Function1) function1);
        H f2 = C13199w.m40588f((Iterable) collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(f2);
        for (H next : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(next);
            if (isMoreSpecificThenAllOf(callableDescriptor2, d)) {
                arrayList.add(next);
            }
            if (isMoreSpecific(callableDescriptor2, callableDescriptor) && !isMoreSpecific(callableDescriptor, callableDescriptor2)) {
                f2 = next;
            }
        }
        if (arrayList.isEmpty()) {
            if (f2 == null) {
                $$$reportNull$$$0(73);
            }
            return f2;
        } else if (arrayList.size() == 1) {
            H f3 = C13199w.m40588f((Iterable) arrayList);
            if (f3 == null) {
                $$$reportNull$$$0(74);
            }
            return f3;
        } else {
            H h = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                H next2 = it.next();
                if (!FlexibleTypesKt.isFlexible(((CallableDescriptor) function1.invoke(next2)).getReturnType())) {
                    h = next2;
                    break;
                }
            }
            if (h != null) {
                if (h == null) {
                    $$$reportNull$$$0(75);
                }
                return h;
            }
            H f4 = C13199w.m40588f((Iterable) arrayList);
            if (f4 == null) {
                $$$reportNull$$$0(76);
            }
            return f4;
        }
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(12);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(13);
        }
        OverrideCompatibilityInfo isOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (isOverridableBy == null) {
            $$$reportNull$$$0(14);
        }
        return isOverridableBy;
    }

    public OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(23);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(24);
        }
        OverrideCompatibilityInfo basicOverridabilityProblem = getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
        if (basicOverridabilityProblem != null) {
            if (basicOverridabilityProblem == null) {
                $$$reportNull$$$0(25);
            }
            return basicOverridabilityProblem;
        }
        List compiledValueParameters = compiledValueParameters(callableDescriptor);
        List compiledValueParameters2 = compiledValueParameters(callableDescriptor2);
        List typeParameters = callableDescriptor.getTypeParameters();
        List typeParameters2 = callableDescriptor2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (true) {
                String str = "Type parameter number mismatch";
                if (i >= compiledValueParameters.size()) {
                    OverrideCompatibilityInfo conflict = OverrideCompatibilityInfo.conflict(str);
                    if (conflict == null) {
                        $$$reportNull$$$0(27);
                    }
                    return conflict;
                } else if (!KotlinTypeChecker.DEFAULT.equalTypes((KotlinType) compiledValueParameters.get(i), (KotlinType) compiledValueParameters2.get(i))) {
                    OverrideCompatibilityInfo incompatible = OverrideCompatibilityInfo.incompatible(str);
                    if (incompatible == null) {
                        $$$reportNull$$$0(26);
                    }
                    return incompatible;
                } else {
                    i++;
                }
            }
        } else {
            KotlinTypeChecker createTypeChecker = createTypeChecker(typeParameters, typeParameters2);
            for (int i2 = 0; i2 < typeParameters.size(); i2++) {
                if (!areTypeParametersEquivalent((TypeParameterDescriptor) typeParameters.get(i2), (TypeParameterDescriptor) typeParameters2.get(i2), createTypeChecker)) {
                    OverrideCompatibilityInfo incompatible2 = OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
                    if (incompatible2 == null) {
                        $$$reportNull$$$0(28);
                    }
                    return incompatible2;
                }
            }
            for (int i3 = 0; i3 < compiledValueParameters.size(); i3++) {
                if (!areTypesEquivalent((KotlinType) compiledValueParameters.get(i3), (KotlinType) compiledValueParameters2.get(i3), createTypeChecker)) {
                    OverrideCompatibilityInfo incompatible3 = OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                    if (incompatible3 == null) {
                        $$$reportNull$$$0(29);
                    }
                    return incompatible3;
                }
            }
            if (!(callableDescriptor instanceof FunctionDescriptor) || !(callableDescriptor2 instanceof FunctionDescriptor) || ((FunctionDescriptor) callableDescriptor).isSuspend() == ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
                if (z) {
                    KotlinType returnType = callableDescriptor.getReturnType();
                    KotlinType returnType2 = callableDescriptor2.getReturnType();
                    if (!(returnType == null || returnType2 == null)) {
                        if (KotlinTypeKt.isError(returnType2) && KotlinTypeKt.isError(returnType)) {
                            i = 1;
                        }
                        if (i == 0 && !createTypeChecker.isSubtypeOf(returnType2, returnType)) {
                            OverrideCompatibilityInfo conflict2 = OverrideCompatibilityInfo.conflict("Return type mismatch");
                            if (conflict2 == null) {
                                $$$reportNull$$$0(31);
                            }
                            return conflict2;
                        }
                    }
                }
                OverrideCompatibilityInfo success = OverrideCompatibilityInfo.success();
                if (success == null) {
                    $$$reportNull$$$0(32);
                }
                return success;
            }
            OverrideCompatibilityInfo conflict3 = OverrideCompatibilityInfo.conflict("Incompatible suspendability");
            if (conflict3 == null) {
                $$$reportNull$$$0(30);
            }
            return conflict3;
        }
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(15);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(16);
        }
        OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z);
        boolean z2 = isOverridableByWithoutExternalConditions.getResult() == Result.OVERRIDABLE;
        Iterator it = EXTERNAL_CONDITIONS.iterator();
        while (true) {
            String str = "External condition";
            String str2 = "External condition failed";
            if (it.hasNext()) {
                ExternalOverridabilityCondition externalOverridabilityCondition = (ExternalOverridabilityCondition) it.next();
                if (externalOverridabilityCondition.getContract() != Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.getContract() != Contract.SUCCESS_ONLY)) {
                    int i = C130999.f29572x42e2f52f[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                    if (i == 1) {
                        z2 = true;
                    } else if (i == 2) {
                        OverrideCompatibilityInfo conflict = OverrideCompatibilityInfo.conflict(str2);
                        if (conflict == null) {
                            $$$reportNull$$$0(17);
                        }
                        return conflict;
                    } else if (i == 3) {
                        OverrideCompatibilityInfo incompatible = OverrideCompatibilityInfo.incompatible(str);
                        if (incompatible == null) {
                            $$$reportNull$$$0(18);
                        }
                        return incompatible;
                    }
                }
            } else if (!z2) {
                if (isOverridableByWithoutExternalConditions == null) {
                    $$$reportNull$$$0(19);
                }
                return isOverridableByWithoutExternalConditions;
            } else {
                for (ExternalOverridabilityCondition externalOverridabilityCondition2 : EXTERNAL_CONDITIONS) {
                    if (externalOverridabilityCondition2.getContract() == Contract.CONFLICTS_ONLY) {
                        int i2 = C130999.f29572x42e2f52f[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                        if (i2 == 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Contract violation in ");
                            sb.append(externalOverridabilityCondition2.getClass().getName());
                            sb.append(" condition. It's not supposed to end with success");
                            throw new IllegalStateException(sb.toString());
                        } else if (i2 == 2) {
                            OverrideCompatibilityInfo conflict2 = OverrideCompatibilityInfo.conflict(str2);
                            if (conflict2 == null) {
                                $$$reportNull$$$0(20);
                            }
                            return conflict2;
                        } else if (i2 == 3) {
                            OverrideCompatibilityInfo incompatible2 = OverrideCompatibilityInfo.incompatible(str);
                            if (incompatible2 == null) {
                                $$$reportNull$$$0(21);
                            }
                            return incompatible2;
                        }
                    }
                }
                OverrideCompatibilityInfo success = OverrideCompatibilityInfo.success();
                if (success == null) {
                    $$$reportNull$$$0(22);
                }
                return success;
            }
        }
    }

    private static Collection<CallableMemberDescriptor> extractMembersOverridableInBothWays(final CallableMemberDescriptor callableMemberDescriptor, Queue<CallableMemberDescriptor> queue, final OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(96);
        }
        if (queue == null) {
            $$$reportNull$$$0(97);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(98);
        }
        return extractMembersOverridableInBothWays(callableMemberDescriptor, queue, new Function1<CallableMemberDescriptor, CallableDescriptor>() {
            public CallableDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        }, new Function1<CallableMemberDescriptor, C13145v>() {
            public C13145v invoke(CallableMemberDescriptor callableMemberDescriptor) {
                overridingStrategy.inheritanceConflict(callableMemberDescriptor, callableMemberDescriptor);
                return C13145v.f29587a;
            }
        });
    }
}
