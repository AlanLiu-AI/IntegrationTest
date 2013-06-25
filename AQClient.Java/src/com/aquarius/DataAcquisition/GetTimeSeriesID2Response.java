
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
 *         &lt;element name="GetTimeSeriesID2Result" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "getTimeSeriesID2Result"
})
@XmlRootElement(name = "GetTimeSeriesID2Response")
public class GetTimeSeriesID2Response {

    @XmlElement(name = "GetTimeSeriesID2Result")
    protected Long getTimeSeriesID2Result;

    /**
     * Gets the value of the getTimeSeriesID2Result property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGetTimeSeriesID2Result() {
        return getTimeSeriesID2Result;
    }

    /**
     * Sets the value of the getTimeSeriesID2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGetTimeSeriesID2Result(Long value) {
        this.getTimeSeriesID2Result = value;
    }

}
