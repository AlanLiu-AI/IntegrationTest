
package com.aquarius.DataAcquisition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppendResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppendResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppendToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumPointsAppended" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TsIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendResult", namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", propOrder = {
    "appendToken",
    "numPointsAppended",
    "tsIdentifier"
})
public class AppendResult {

    @XmlElement(name = "AppendToken", required = true, nillable = true)
    protected String appendToken;
    @XmlElement(name = "NumPointsAppended")
    protected int numPointsAppended;
    @XmlElement(name = "TsIdentifier", required = true, nillable = true)
    protected String tsIdentifier;

    /**
     * Gets the value of the appendToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendToken() {
        return appendToken;
    }

    /**
     * Sets the value of the appendToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendToken(String value) {
        this.appendToken = value;
    }

    /**
     * Gets the value of the numPointsAppended property.
     * 
     */
    public int getNumPointsAppended() {
        return numPointsAppended;
    }

    /**
     * Sets the value of the numPointsAppended property.
     * 
     */
    public void setNumPointsAppended(int value) {
        this.numPointsAppended = value;
    }

    /**
     * Gets the value of the tsIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsIdentifier() {
        return tsIdentifier;
    }

    /**
     * Sets the value of the tsIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsIdentifier(String value) {
        this.tsIdentifier = value;
    }

}
