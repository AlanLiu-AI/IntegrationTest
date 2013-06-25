
package com.aquarius.DataAcquisition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFieldVisitResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFieldVisitResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldVisitResult" type="{http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto}FieldVisitResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFieldVisitResult", namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", propOrder = {
    "fieldVisitResult"
})
public class ArrayOfFieldVisitResult {

    @XmlElement(name = "FieldVisitResult", nillable = true)
    protected List<FieldVisitResult> fieldVisitResult;

    /**
     * Gets the value of the fieldVisitResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldVisitResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldVisitResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldVisitResult }
     * 
     * 
     */
    public List<FieldVisitResult> getFieldVisitResult() {
        if (fieldVisitResult == null) {
            fieldVisitResult = new ArrayList<FieldVisitResult>();
        }
        return this.fieldVisitResult;
    }

}
