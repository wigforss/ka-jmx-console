//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.24 at 05:35:32 PM CEST 
//


package org.kasource.jmx.core.model.dashboard;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attributeValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://kasource.org/schema/ka-jmx}attribute" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributeValue", propOrder = {
    "attribute",
    "jsFunction"
})
public class AttributeValue {
    protected String jsFunction;
    protected Attribute attribute;
    @XmlAttribute
    protected String label;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute
    protected boolean subscribe = true;
    @XmlAttribute
    protected ValueType type = ValueType.TEXT;
    @XmlAttribute
    protected boolean visible = true;
    
    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link Attribute }
     *     
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribute }
     *     
     */
    public void setAttribute(Attribute value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the subscribe
     */
    public boolean isSubscribe() {
        return subscribe;
    }

    /**
     * @param subscribe the subscribe to set
     */
    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * @return the jsFunction
     */
    public String getJsFunction() {
        return jsFunction;
    }

    /**
     * @param jsFunction the jsFunction to set
     */
    public void setJsFunction(String jsFunction) {   
        this.jsFunction = jsFunction;        
    }

    /**
     * @return the type
     */
    public ValueType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ValueType type) {
        this.type = type;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
