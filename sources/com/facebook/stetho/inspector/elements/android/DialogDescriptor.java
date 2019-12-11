package com.facebook.stetho.inspector.elements.android;

import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.Descriptor.Host;

final class DialogDescriptor extends AbstractChainedDescriptor<Dialog> implements HighlightableDescriptor<Dialog> {
    DialogDescriptor() {
    }

    public Object getElementToHighlightAtPosition(Dialog dialog, int i, int i2, Rect rect) {
        Object obj;
        HighlightableDescriptor highlightableDescriptor;
        Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            obj = dialog.getWindow();
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(obj);
        } else {
            obj = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getElementToHighlightAtPosition(obj, i, i2, rect);
    }

    public View getViewAndBoundsForHighlighting(Dialog dialog, Rect rect) {
        Object obj;
        HighlightableDescriptor highlightableDescriptor;
        Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            obj = dialog.getWindow();
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(obj);
        } else {
            obj = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getViewAndBoundsForHighlighting(obj, rect);
    }

    /* access modifiers changed from: protected */
    public void onGetChildren(Dialog dialog, Accumulator<Object> accumulator) {
        Window window = dialog.getWindow();
        if (window != null) {
            accumulator.store(window);
        }
    }
}
