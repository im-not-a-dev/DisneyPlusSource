package com.facebook.stetho.common.android;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.C0530c;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;

final class FragmentCompatSupportLib extends FragmentCompat<Fragment, C0530c, C0538i, C0532d> {
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
    private static final FragmentAccessorSupportLib sFragmentAccessor = new FragmentAccessorSupportLib();
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();
    private static final FragmentManagerAccessorViaReflection<C0538i, Fragment> sFragmentManagerAccessor = new FragmentManagerAccessorViaReflection<>();

    private static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<C0530c, Fragment, C0538i> {
        private DialogFragmentAccessorSupportLib() {
            super();
        }

        public Dialog getDialog(C0530c cVar) {
            return cVar.getDialog();
        }
    }

    private static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, C0538i> {
        private FragmentAccessorSupportLib() {
        }

        public C0538i getChildFragmentManager(Fragment fragment) {
            return fragment.getChildFragmentManager();
        }

        public C0538i getFragmentManager(Fragment fragment) {
            return fragment.getFragmentManager();
        }

        public int getId(Fragment fragment) {
            return fragment.getId();
        }

        public Resources getResources(Fragment fragment) {
            return fragment.getResources();
        }

        public String getTag(Fragment fragment) {
            return fragment.getTag();
        }

        public View getView(Fragment fragment) {
            return fragment.getView();
        }
    }

    private static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<C0532d, C0538i> {
        private FragmentActivityAccessorSupportLib() {
        }

        public C0538i getFragmentManager(C0532d dVar) {
            return dVar.getSupportFragmentManager();
        }
    }

    FragmentCompatSupportLib() {
    }

    public FragmentManagerAccessor<C0538i, Fragment> forFragmentManager() {
        return sFragmentManagerAccessor;
    }

    public Class<C0530c> getDialogFragmentClass() {
        return C0530c.class;
    }

    public Class<C0532d> getFragmentActivityClass() {
        return C0532d.class;
    }

    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }

    public DialogFragmentAccessorSupportLib forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    public FragmentAccessorSupportLib forFragment() {
        return sFragmentAccessor;
    }

    public FragmentActivityAccessorSupportLib forFragmentActivity() {
        return sFragmentActivityAccessor;
    }
}
