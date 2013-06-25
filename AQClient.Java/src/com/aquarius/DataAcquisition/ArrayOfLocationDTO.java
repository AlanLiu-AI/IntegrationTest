
package com.aquarius.DataAcquisition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLocationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLocationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationDTO" type="{http://schemas.datacontract.org/2004/07/AquariusDataService}LocationDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationDTO", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", propOrder = {
    "locationDTO"
})
public class ArrayOfLocationDTO {

    @XmlElement(name = "LocationDTO", nillable = true)
    protected List<LocationDTO> locationDTO;

    /**
     * Gets the value of the locationDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDTO }
     * 
     * 
     */
    public List<LocationDTO> getLocationDTO() {
        if (locationDTO == null) {
            locationDTO = new ArrayList<LocationDTO>();
        }
        return this.locationDTO;
    }

}
