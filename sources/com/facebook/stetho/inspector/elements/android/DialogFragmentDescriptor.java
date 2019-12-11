package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.common.android.DialogFragmentAccessor;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.ChainedDescriptor;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.Descriptor.Host;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;

final class DialogFragmentDescriptor extends Descriptor<Object> implements ChainedDescriptor<Object>, HighlightableDescriptor<Object> {
    private final DialogFragmentAccessor mAccessor;
    private Descriptor<? super Object> mSuper;

    private DialogFragmentDescriptor(FragmentCompat fragmentCompat) {
        this.mAccessor = fragmentCompat.forDialogFragment();
    }

    private static void maybeRegister(DescriptorMap descriptorMap, FragmentCompat fragmentCompat) {
        if (fragmentCompat != null) {
            Class dialogFragmentClass = fragmentCompat.getDialogFragmentClass();
            LogUtil.m24840d("Adding support for %s", dialogFragmentClass);
            descriptorMap.registerDescriptor(dialogFragmentClass, (Descriptor) new DialogFragmentDescriptor(fragmentCompat));
        }
    }

    public static DescriptorMap register(DescriptorMap descriptorMap) {
        maybeRegister(descriptorMap, FragmentCompat.getSupportLibInstance());
        maybeRegister(descriptorMap, FragmentCompat.getFrameworkInstance());
        return descriptorMap;
    }

    public void getAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
        this.mSuper.getAttributes(obj, attributeAccumulator);
    }

    public void getChildren(Object obj, Accumulator<Object> accumulator) {
        accumulator.store(this.mAccessor.getDialog(obj));
    }

    public void getComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    public Object getElementToHighlightAtPosition(Object obj, int i, int i2, Rect rect) {
        Object obj2;
        HighlightableDescriptor highlightableDescriptor;
        Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            obj2 = this.mAccessor.getDialog(obj);
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(obj2);
        } else {
            obj2 = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getElementToHighlightAtPosition(obj2, i, i2, rect);
    }

    public String getLocalName(Object obj) {
        return this.mSuper.getLocalName(obj);
    }

    public String getNodeName(Object obj) {
        return this.mSuper.getNodeName(obj);
    }

    public NodeType getNodeType(Object obj) {
        return this.mSuper.getNodeType(obj);
    }

    public String getNodeValue(Object obj) {
        return this.mSuper.getNodeValue(obj);
    }

    public void getStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    public void getStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
    }

    public View getViewAndBoundsForHighlighting(Object obj, Rect rect) {
        Object obj2;
        HighlightableDescriptor highlightableDescriptor;
        Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            obj2 = this.mAccessor.getDialog(obj);
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(obj2);
        } else {
            obj2 = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getViewAndBoundsForHighlighting(obj2, rect);
    }

    public void hook(Object obj) {
        this.mSuper.hook(obj);
    }

    public void setAttributesAsText(Object obj, String str) {
        this.mSuper.setAttributesAsText(obj, str);
    }

    public void setStyle(Object obj, String str, String str2, String str3) {
    }

    public void setSuper(Descriptor<? super Object> descriptor) {
        Util.throwIfNull(descriptor);
        Descriptor<? super Object> descriptor2 = this.mSuper;
        if (descriptor == descriptor2) {
            return;
        }
        if (descriptor2 == null) {
            this.mSuper = descriptor;
            return;
        }
        throw new IllegalStateException();
    }

    public void unhook(Object obj) {
        this.mSuper.unhook(obj);
    }
}
