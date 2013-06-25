
package com.aquarius.DataAcquisition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeSeriesDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AqDataID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Aqtimeseriestype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TotalSamples" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesDescription", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", propOrder = {
    "aqDataID",
    "aqtimeseriestype",
    "endTime",
    "endValue",
    "label",
    "lastModified",
    "totalSamples",
    "identifier",
    "parameterType",
    "units"
})
public class TimeSeriesDescription {

    @XmlElement(name = "AqDataID")
    protected long aqDataID;
    @XmlElement(name = "Aqtimeseriestype", required = true, nillable = true)
    protected String aqtimeseriestype;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "EndValue")
    protected double endValue;
    @XmlElement(name = "Label", required = true, nillable = true)
    protected String label;
    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "TotalSamples")
    protected long totalSamples;
    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "ParameterType", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parameterType;
    @XmlElementRef(name = "Units", namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> units;

    /**
     * Gets the value of the aqDataID property.
     * 
     */
    public long getAqDataID() {
        return aqDataID;
    }

    /**
     * Sets the value of the aqDataID property.
     * 
     */
    public void setAqDataID(long value) {
        this.aqDataID = value;
    }

    /**
     * Gets the value of the aqtimeseriestype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAqtimeseriestype() {
        return aqtimeseriestype;
    }

    /**
     * Sets the value of the aqtimeseriestype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAqtimeseriestype(String value) {
        this.aqtimeseriestype = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the endValue property.
     * 
     */
    public double getEndValue() {
        return endValue;
    }

    /**
     * Sets the value of the endValue property.
     * 
     */
    public void setEndValue(double value) {
        this.endValue = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the totalSamples property.
     * 
     */
    public long getTotalSamples() {
        return totalSamples;
    }

    /**
     * Sets the value of the totalSamples property.
     * 
     */
    public void setTotalSamples(long value) {
        this.totalSamples = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameterType(JAXBElement<String> value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnits(JAXBElement<String> value) {
        this.units = value;
    }

}
