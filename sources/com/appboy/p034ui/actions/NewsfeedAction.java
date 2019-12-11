package com.appboy.p034ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.p025o.C1497e;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.activities.AppboyFeedActivity;

/* renamed from: com.appboy.ui.actions.NewsfeedAction */
public class NewsfeedAction implements IAction {
    private final Bundle mExtras;

    public NewsfeedAction(Bundle bundle, C1497e eVar) {
        this.mExtras = bundle;
    }

    public void execute(Context context) {
        try {
            Intent intent = new Intent(context, AppboyFeedActivity.class);
            if (this.mExtras != null) {
                intent.putExtras(this.mExtras);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            C1557c.m7470c("ContentValues", "AppboyFeedActivity was not opened successfully.", e);
        }
    }
}
