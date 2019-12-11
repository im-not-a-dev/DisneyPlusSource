package com.bamtechmedia.dominguez.legal;

import android.content.Context;
import com.bamtechmedia.dominguez.legal.api.LegalApi;

public abstract class FeatureLegalModule {
    static LegalFragmentFactory legalFragmentFactory() {
        return LegalCenterFragment.Companion;
    }

    static LegalApiConfig provideLegalApiConfig(Context context) {
        String string = context.getString(C6117R.string.ONE_ID_CLIENT_ID);
        return new LegalApiConfig(context.getString(C6117R.string.legal_center_api_host, new Object[]{string}), context.getString(C6117R.string.create_nrt_api_host, new Object[]{string}));
    }

    /* access modifiers changed from: 0000 */
    public abstract LegalApi bindLegalApi(DefaultLegalApi defaultLegalApi);
}
