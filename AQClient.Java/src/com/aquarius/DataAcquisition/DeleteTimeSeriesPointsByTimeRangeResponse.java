
package com.aquarius.DataAcquisition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="DeleteTimeSeriesPointsByTimeRangeResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "deleteTimeSeriesPointsByTimeRangeResult"
})
@XmlRootElement(name = "DeleteTimeSeriesPointsByTimeRangeResponse")
public class DeleteTimeSeriesPointsByTimeRangeResponse {

    @XmlElement(name = "DeleteTimeSeriesPointsByTimeRangeResult")
    protected Integer deleteTimeSeriesPointsByTimeRangeResult;

    /**
     * Gets the value of the deleteTimeSeriesPointsByTimeRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeleteTimeSeriesPointsByTimeRangeResult() {
        return deleteTimeSeriesPointsByTimeRangeResult;
    }

    /**
     * Sets the value of the deleteTimeSeriesPointsByTimeRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeleteTimeSeriesPointsByTimeRangeResult(Integer value) {
        this.deleteTimeSeriesPointsByTimeRangeResult = value;
    }

}
