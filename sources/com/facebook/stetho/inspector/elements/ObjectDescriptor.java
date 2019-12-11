package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;

public final class ObjectDescriptor extends Descriptor<Object> {
    public void getAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
    }

    public void getChildren(Object obj, Accumulator<Object> accumulator) {
    }

    public void getComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    public String getLocalName(Object obj) {
        return getNodeName(obj);
    }

    public String getNodeName(Object obj) {
        return obj.getClass().getName();
    }

    public NodeType getNodeType(Object obj) {
        return NodeType.ELEMENT_NODE;
    }

    public String getNodeValue(Object obj) {
        return null;
    }

    public void getStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    public void getStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
    }

    public void hook(Object obj) {
    }

    public void setAttributesAsText(Object obj, String str) {
    }

    public void setStyle(Object obj, String str, String str2, String str3) {
    }

    public void unhook(Object obj) {
    }
}
