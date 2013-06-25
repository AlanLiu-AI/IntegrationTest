
package com.aquarius.DataAcquisition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FieldVisitResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldVisitResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrectedResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Correction" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MeasurementID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ObservedResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ParameterID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PercentUncertainty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QualityCodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ResultType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UnitID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldVisitResult", namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", propOrder = {
    "correctedResult",
    "correction",
    "endTime",
    "measurementID",
    "observedResult",
    "parameterID",
    "percentUncertainty",
    "qualifier",
    "qualityCodeID",
    "remarks",
    "resultDetails",
    "resultID",
    "resultType",
    "startTime",
    "unitID"
})
public class FieldVisitResult {

    @XmlElement(name = "CorrectedResult", required = true, type = Double.class, nillable = true)
    protected Double correctedResult;
    @XmlElement(name = "Correction", required = true, type = Double.class, nillable = true)
    protected Double correction;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "MeasurementID")
    protected long measurementID;
    @XmlElement(name = "ObservedResult")
    protected double observedResult;
    @XmlElement(name = "ParameterID", required = true, nillable = true)
    protected String parameterID;
    @XmlElement(name = "PercentUncertainty", required = true, type = Double.class, nillable = true)
    protected Double percentUncertainty;
    @XmlElement(name = "Qualifier", required = true, nillable = true)
    protected String qualifier;
    @XmlElement(name = "QualityCodeID", required = true, type = Long.class, nillable = true)
    protected Long qualityCodeID;
    @XmlElement(name = "Remarks", required = true, nillable = true)
    protected String remarks;
    @XmlElement(name = "ResultDetails", required = true, nillable = true)
    protected String resultDetails;
    @XmlElement(name = "ResultID")
    protected long resultID;
    @XmlElement(name = "ResultType", required = true, type = Integer.class, nillable = true)
    protected Integer resultType;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "UnitID", required = true, nillable = true)
    protected String unitID;

    /**
     * Gets the value of the correctedResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrectedResult() {
        return correctedResult;
    }

    /**
     * Sets the value of the correctedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrectedResult(Double value) {
        this.correctedResult = value;
    }

    /**
     * Gets the value of the correction property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrection() {
        return correction;
    }

    /**
     * Sets the value of the correction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrection(Double value) {
        this.correction = value;
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
     * Gets the value of the measurementID property.
     * 
     */
    public long getMeasurementID() {
        return measurementID;
    }

    /**
     * Sets the value of the measurementID property.
     * 
     */
    public void setMeasurementID(long value) {
        this.measurementID = value;
    }

    /**
     * Gets the value of the observedResult property.
     * 
     */
    public double getObservedResult() {
        return observedResult;
    }

    /**
     * Sets the value of the observedResult property.
     * 
     */
    public void setObservedResult(double value) {
        this.observedResult = value;
    }

    /**
     * Gets the value of the parameterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterID() {
        return parameterID;
    }

    /**
     * Sets the value of the parameterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterID(String value) {
        this.parameterID = value;
    }

    /**
     * Gets the value of the percentUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentUncertainty() {
        return percentUncertainty;
    }

    /**
     * Sets the value of the percentUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentUncertainty(Double value) {
        this.percentUncertainty = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the qualityCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQualityCodeID() {
        return qualityCodeID;
    }

    /**
     * Sets the value of the qualityCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQualityCodeID(Long value) {
        this.qualityCodeID = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the resultDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDetails() {
        return resultDetails;
    }

    /**
     * Sets the value of the resultDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDetails(String value) {
        this.resultDetails = value;
    }

    /**
     * Gets the value of the resultID property.
     * 
     */
    public long getResultID() {
        return resultID;
    }

    /**
     * Sets the value of the resultID property.
     * 
     */
    public void setResultID(long value) {
        this.resultID = value;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultType(Integer value) {
        this.resultType = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the unitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitID() {
        return unitID;
    }

    /**
     * Sets the value of the unitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitID(String value) {
        this.unitID = value;
    }

}
