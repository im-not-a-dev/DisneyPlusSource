package com.facebook.stetho.common.android;

import android.app.Activity;
import android.os.Build.VERSION;
import com.facebook.stetho.common.ReflectionUtil;
import java.lang.reflect.Field;
import java.util.List;

public abstract class FragmentCompat<FRAGMENT, DIALOG_FRAGMENT, FRAGMENT_MANAGER, FRAGMENT_ACTIVITY extends Activity> {
    private static FragmentCompat sFrameworkInstance;
    private static final boolean sHasSupportFragment = (ReflectionUtil.tryGetClassForName("androidx.fragment.app.Fragment") != null);
    private static FragmentCompat sSupportInstance;

    static class FragmentManagerAccessorViaReflection<FRAGMENT_MANAGER, FRAGMENT> implements FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> {
        private Field mFieldMAdded;

        FragmentManagerAccessorViaReflection() {
        }

        public List<FRAGMENT> getAddedFragments(FRAGMENT_MANAGER fragment_manager) {
            if (this.mFieldMAdded == null) {
                Field tryGetDeclaredField = ReflectionUtil.tryGetDeclaredField(fragment_manager.getClass(), "mAdded");
                if (tryGetDeclaredField != null) {
                    tryGetDeclaredField.setAccessible(true);
                    this.mFieldMAdded = tryGetDeclaredField;
                }
            }
            Field field = this.mFieldMAdded;
            if (field != null) {
                return (List) ReflectionUtil.getFieldValue(field, fragment_manager);
            }
            return null;
        }
    }

    FragmentCompat() {
    }

    public static FragmentCompat getFrameworkInstance() {
        if (sFrameworkInstance == null && VERSION.SDK_INT >= 11) {
            sFrameworkInstance = new FragmentCompatFramework();
        }
        return sFrameworkInstance;
    }

    public static FragmentCompat getSupportLibInstance() {
        if (sSupportInstance == null && sHasSupportFragment) {
            sSupportInstance = new FragmentCompatSupportLib();
        }
        return sSupportInstance;
    }

    public abstract DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> forDialogFragment();

    public abstract FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> forFragment();

    public abstract FragmentActivityAccessor<FRAGMENT_ACTIVITY, FRAGMENT_MANAGER> forFragmentActivity();

    public abstract FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> forFragmentManager();

    public abstract Class<DIALOG_FRAGMENT> getDialogFragmentClass();

    public abstract Class<FRAGMENT_ACTIVITY> getFragmentActivityClass();

    public abstract Class<FRAGMENT> getFragmentClass();
}
