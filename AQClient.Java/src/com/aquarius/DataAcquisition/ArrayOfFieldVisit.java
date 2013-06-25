
package com.aquarius.DataAcquisition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFieldVisit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFieldVisit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldVisit" type="{http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto}FieldVisit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFieldVisit", namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", propOrder = {
    "fieldVisit"
})
public class ArrayOfFieldVisit {

    @XmlElement(name = "FieldVisit", nillable = true)
    protected List<FieldVisit> fieldVisit;

    /**
     * Gets the value of the fieldVisit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldVisit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldVisit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldVisit }
     * 
     * 
     */
    public List<FieldVisit> getFieldVisit() {
        if (fieldVisit == null) {
            fieldVisit = new ArrayList<FieldVisit>();
        }
        return this.fieldVisit;
    }

}
