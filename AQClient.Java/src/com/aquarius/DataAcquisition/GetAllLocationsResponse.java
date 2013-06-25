
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
 *         &lt;element name="GetAllLocationsResult" type="{http://schemas.datacontract.org/2004/07/AquariusDataService}ArrayOfLocationDTO" minOccurs="0"/>
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
    "getAllLocationsResult"
})
@XmlRootElement(name = "GetAllLocationsResponse")
public class GetAllLocationsResponse {

    @XmlElementRef(name = "GetAllLocationsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationDTO> getAllLocationsResult;

    /**
     * Gets the value of the getAllLocationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLocationDTO> getGetAllLocationsResult() {
        return getAllLocationsResult;
    }

    /**
     * Sets the value of the getAllLocationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationDTO }{@code >}
     *     
     */
    public void setGetAllLocationsResult(JAXBElement<ArrayOfLocationDTO> value) {
        this.getAllLocationsResult = value;
    }

}
