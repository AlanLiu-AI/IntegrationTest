
package com.aquarius.DataAcquisition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocationPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocationTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="UtcOffset" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ExtendedAttributes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDTO", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", propOrder = {
    "identifier",
    "latitude",
    "locationName",
    "locationPath",
    "locationTypeName",
    "longitude",
    "utcOffset",
    "extendedAttributes",
    "locationId"
})
public class LocationDTO {

    @XmlElement(name = "Identifier", required = true, nillable = true)
    protected String identifier;
    @XmlElement(name = "Latitude", required = true, type = Float.class, nillable = true)
    protected Float latitude;
    @XmlElement(name = "LocationName", required = true, nillable = true)
    protected String locationName;
    @XmlElement(name = "LocationPath", required = true, nillable = true)
    protected String locationPath;
    @XmlElement(name = "LocationTypeName", required = true, nillable = true)
    protected String locationTypeName;
    @XmlElement(name = "Longitude", required = true, type = Float.class, nillable = true)
    protected Float longitude;
    @XmlElement(name = "UtcOffset")
    protected float utcOffset;
    @XmlElementRef(name = "ExtendedAttributes", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> extendedAttributes;
    @XmlElement(name = "LocationId", required = true, type = Long.class, nillable = true)
    protected Long locationId;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLatitude(Float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the locationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationPath() {
        return locationPath;
    }

    /**
     * Sets the value of the locationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationPath(String value) {
        this.locationPath = value;
    }

    /**
     * Gets the value of the locationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTypeName() {
        return locationTypeName;
    }

    /**
     * Sets the value of the locationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTypeName(String value) {
        this.locationTypeName = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     */
    public float getUtcOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     */
    public void setUtcOffset(float value) {
        this.utcOffset = value;
    }

    /**
     * Gets the value of the extendedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Sets the value of the extendedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setExtendedAttributes(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.extendedAttributes = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
    }

}
