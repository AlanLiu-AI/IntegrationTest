
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
 *         &lt;element name="GetLocationResult" type="{http://schemas.datacontract.org/2004/07/AquariusDataService}LocationDTO" minOccurs="0"/>
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
    "getLocationResult"
})
@XmlRootElement(name = "GetLocationResponse")
public class GetLocationResponse {

    @XmlElementRef(name = "GetLocationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationDTO> getLocationResult;

    /**
     * Gets the value of the getLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationDTO }{@code >}
     *     
     */
    public JAXBElement<LocationDTO> getGetLocationResult() {
        return getLocationResult;
    }

    /**
     * Sets the value of the getLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationDTO }{@code >}
     *     
     */
    public void setGetLocationResult(JAXBElement<LocationDTO> value) {
        this.getLocationResult = value;
    }

}
