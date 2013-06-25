
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
 *         &lt;element name="GetFieldVisitsByLocationAndDateResult" type="{http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto}ArrayOfFieldVisit" minOccurs="0"/>
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
    "getFieldVisitsByLocationAndDateResult"
})
@XmlRootElement(name = "GetFieldVisitsByLocationAndDateResponse")
public class GetFieldVisitsByLocationAndDateResponse {

    @XmlElementRef(name = "GetFieldVisitsByLocationAndDateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFieldVisit> getFieldVisitsByLocationAndDateResult;

    /**
     * Gets the value of the getFieldVisitsByLocationAndDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldVisit }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFieldVisit> getGetFieldVisitsByLocationAndDateResult() {
        return getFieldVisitsByLocationAndDateResult;
    }

    /**
     * Sets the value of the getFieldVisitsByLocationAndDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldVisit }{@code >}
     *     
     */
    public void setGetFieldVisitsByLocationAndDateResult(JAXBElement<ArrayOfFieldVisit> value) {
        this.getFieldVisitsByLocationAndDateResult = value;
    }

}
