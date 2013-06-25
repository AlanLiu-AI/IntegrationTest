
package com.aquarius.DataAcquisition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFieldVisitMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFieldVisitMeasurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldVisitMeasurement" type="{http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto}FieldVisitMeasurement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFieldVisitMeasurement", namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", propOrder = {
    "fieldVisitMeasurement"
})
public class ArrayOfFieldVisitMeasurement {

    @XmlElement(name = "FieldVisitMeasurement", nillable = true)
    protected List<FieldVisitMeasurement> fieldVisitMeasurement;

    /**
     * Gets the value of the fieldVisitMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldVisitMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldVisitMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldVisitMeasurement }
     * 
     * 
     */
    public List<FieldVisitMeasurement> getFieldVisitMeasurement() {
        if (fieldVisitMeasurement == null) {
            fieldVisitMeasurement = new ArrayList<FieldVisitMeasurement>();
        }
        return this.fieldVisitMeasurement;
    }

}
