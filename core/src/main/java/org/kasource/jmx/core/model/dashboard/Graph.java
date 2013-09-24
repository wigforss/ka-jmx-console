//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.24 at 05:35:32 PM CEST 
//


package org.kasource.jmx.core.model.dashboard;





import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kasource.jmx.core.dashboard.DashboardWidget;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://kasource.org/schema/ka-jmx}dataSeries" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataSeries"
})
@XmlRootElement(name = "graph")
public class Graph implements DashboardWidget {
    
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(required = true)
    protected List<AttributeValue> dataSeries;
    @XmlAttribute
    protected String title;
    @XmlAttribute
    protected String yAxisLabel;
    @XmlAttribute
    protected int samples = 30;
    @XmlAttribute
    protected int decimals = 2;
    
    /**
     * Gets the value of the dataSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeValue }
     * 
     * 
     */
    public List<AttributeValue> getDataSeries() {
        if (dataSeries == null) {
            dataSeries = new ArrayList<AttributeValue>();
        }
        return this.dataSeries;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * @param dataSeries the dataSeries to set
     */
    public void setDataSeries(List<AttributeValue> dataSeries) {
        this.dataSeries = dataSeries;
    }
    
    
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }
    
    

    /**
     * Gets the value of the samples property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSamples() {  
        return samples;   
    }

    /**
     * Sets the value of the samples property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSamples(int value) {
        this.samples = value;
    }
    

    /**
     * @return the yAxisLabel
     */
    public String getyAxisLabel() {
        return yAxisLabel;
    }

    /**
     * @param yAxisLabel the yAxisLabel to set
     */
    public void setyAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
    }

    @Override
    public String getType() {
       return "graph";
    }

    /**
     * @return the decimals
     */
    public int getDecimals() {
        return decimals;
    }

    /**
     * @param decimals the decimals to set
     */
    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }

   

}
