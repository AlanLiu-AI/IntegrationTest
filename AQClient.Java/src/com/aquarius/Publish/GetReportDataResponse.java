
package com.aquarius.Publish;

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
 *         &lt;element name="GetReportDataResult" type="{http://schemas.microsoft.com/Message}StreamBody"/>
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
    "getReportDataResult"
})
@XmlRootElement(name = "GetReportDataResponse")
public class GetReportDataResponse {

    @XmlElement(name = "GetReportDataResult", required = true)
    protected byte[] getReportDataResult;

    /**
     * Gets the value of the getReportDataResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetReportDataResult() {
        return getReportDataResult;
    }

    /**
     * Sets the value of the getReportDataResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetReportDataResult(byte[] value) {
        this.getReportDataResult = value;
    }

}
