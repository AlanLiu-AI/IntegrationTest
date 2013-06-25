
package com.aquarius.Publish;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatingCurveFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingCurveFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangedSince" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingCurveFilter", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService.Dto", propOrder = {
    "changedSince",
    "locationIdentifier"
})
public class RatingCurveFilter {

    @XmlElement(name = "ChangedSince", required = true, nillable = true)
    protected String changedSince;
    @XmlElement(name = "LocationIdentifier", required = true, nillable = true)
    protected String locationIdentifier;

    /**
     * Gets the value of the changedSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedSince() {
        return changedSince;
    }

    /**
     * Sets the value of the changedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedSince(String value) {
        this.changedSince = value;
    }

    /**
     * Gets the value of the locationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Sets the value of the locationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIdentifier(String value) {
        this.locationIdentifier = value;
    }

}
