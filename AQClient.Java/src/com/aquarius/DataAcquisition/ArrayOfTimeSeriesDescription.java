
package com.aquarius.DataAcquisition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimeSeriesDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimeSeriesDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeSeriesDescription" type="{http://schemas.datacontract.org/2004/07/AquariusDataService}TimeSeriesDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimeSeriesDescription", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", propOrder = {
    "timeSeriesDescription"
})
public class ArrayOfTimeSeriesDescription {

    @XmlElement(name = "TimeSeriesDescription", nillable = true)
    protected List<TimeSeriesDescription> timeSeriesDescription;

    /**
     * Gets the value of the timeSeriesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeriesDescription }
     * 
     * 
     */
    public List<TimeSeriesDescription> getTimeSeriesDescription() {
        if (timeSeriesDescription == null) {
            timeSeriesDescription = new ArrayList<TimeSeriesDescription>();
        }
        return this.timeSeriesDescription;
    }

}
