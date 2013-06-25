
package com.aquarius.DataAcquisition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AppendTimeSeriesFromBytes2Result" type="{http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto}AppendResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appendTimeSeriesFromBytes2Result"
})
@XmlRootElement(name = "AppendTimeSeriesFromBytes2Response")
public class AppendTimeSeriesFromBytes2Response {

    @XmlElementRef(name = "AppendTimeSeriesFromBytes2Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AppendResult> appendTimeSeriesFromBytes2Result;

    /**
     * Gets the value of the appendTimeSeriesFromBytes2Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppendResult }{@code >}
     *     
     */
    public JAXBElement<AppendResult> getAppendTimeSeriesFromBytes2Result() {
        return appendTimeSeriesFromBytes2Result;
    }

    /**
     * Sets the value of the appendTimeSeriesFromBytes2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppendResult }{@code >}
     *     
     */
    public void setAppendTimeSeriesFromBytes2Result(JAXBElement<AppendResult> value) {
        this.appendTimeSeriesFromBytes2Result = value;
    }

}
