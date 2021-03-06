
package com.huawei.esdk.demo.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealplayParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealplayParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streamType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="protocolType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="directFirst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="multiCast" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealplayParam", propOrder = {
    "streamType",
    "protocolType",
    "directFirst",
    "multiCast",
    "reserve"
})
public class RealplayParam {

    protected int streamType;
    protected int protocolType;
    protected int directFirst;
    protected int multiCast;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the streamType property.
     * 
     */
    public int getStreamType() {
        return streamType;
    }

    /**
     * Sets the value of the streamType property.
     * 
     */
    public void setStreamType(int value) {
        this.streamType = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     */
    public int getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     */
    public void setProtocolType(int value) {
        this.protocolType = value;
    }

    /**
     * Gets the value of the directFirst property.
     * 
     */
    public int getDirectFirst() {
        return directFirst;
    }

    /**
     * Sets the value of the directFirst property.
     * 
     */
    public void setDirectFirst(int value) {
        this.directFirst = value;
    }

    /**
     * Gets the value of the multiCast property.
     * 
     */
    public int getMultiCast() {
        return multiCast;
    }

    /**
     * Sets the value of the multiCast property.
     * 
     */
    public void setMultiCast(int value) {
        this.multiCast = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

}
