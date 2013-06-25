
package com.aquarius.DataAcquisition;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aquarius.DataAcquisition package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTimeSeriesIDIdentifier_QNAME = new QName("http://tempuri.org/", "identifier");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _LocationDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "LocationDTO");
    private final static QName _ArrayOfLocationDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "ArrayOfLocationDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _TimeSeriesDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "TimeSeriesDescription");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AppendResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "AppendResult");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _FieldVisitMeasurement_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "FieldVisitMeasurement");
    private final static QName _FieldVisitResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "FieldVisitResult");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _FieldVisit_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "FieldVisit");
    private final static QName _ArrayOfFieldVisit_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "ArrayOfFieldVisit");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfTimeSeriesDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "ArrayOfTimeSeriesDescription");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfKeyValueOfstringanyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringanyType");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfFieldVisitResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "ArrayOfFieldVisitResult");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfFieldVisitMeasurement_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "ArrayOfFieldVisitMeasurement");
    private final static QName _GetTimeSeriesListParameterType_QNAME = new QName("http://tempuri.org/", "parameterType");
    private final static QName _GetAuthTokenEncodedPassword_QNAME = new QName("http://tempuri.org/", "encodedPassword");
    private final static QName _GetAuthTokenUser_QNAME = new QName("http://tempuri.org/", "user");
    private final static QName _UndoAppendAppendToken_QNAME = new QName("http://tempuri.org/", "appendToken");
    private final static QName _GetAllLocationsResponseGetAllLocationsResult_QNAME = new QName("http://tempuri.org/", "GetAllLocationsResult");
    private final static QName _GetFieldVisitsByLocationChangedSinceResponseGetFieldVisitsByLocationChangedSinceResult_QNAME = new QName("http://tempuri.org/", "GetFieldVisitsByLocationChangedSinceResult");
    private final static QName _GetFieldVisitsByLocationAndDateResponseGetFieldVisitsByLocationAndDateResult_QNAME = new QName("http://tempuri.org/", "GetFieldVisitsByLocationAndDateResult");
    private final static QName _GetAuthTokenResponseGetAuthTokenResult_QNAME = new QName("http://tempuri.org/", "GetAuthTokenResult");
    private final static QName _LocationDTOExtendedAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "ExtendedAttributes");
    private final static QName _SaveFieldVisitFv_QNAME = new QName("http://tempuri.org/", "fv");
    private final static QName _CreateTimeSeries2Description_QNAME = new QName("http://tempuri.org/", "description");
    private final static QName _CreateTimeSeries2Parameter_QNAME = new QName("http://tempuri.org/", "parameter");
    private final static QName _CreateTimeSeries2Unit_QNAME = new QName("http://tempuri.org/", "unit");
    private final static QName _CreateTimeSeries2Comments_QNAME = new QName("http://tempuri.org/", "comments");
    private final static QName _CreateTimeSeries2Label_QNAME = new QName("http://tempuri.org/", "label");
    private final static QName _AppendTimeSeriesFromBytesCsvbytes_QNAME = new QName("http://tempuri.org/", "csvbytes");
    private final static QName _AppendTimeSeriesFromBytesComment_QNAME = new QName("http://tempuri.org/", "comment");
    private final static QName _AppendTimeSeriesFromBytesUserName_QNAME = new QName("http://tempuri.org/", "userName");
    private final static QName _TimeSeriesDescriptionUnits_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "Units");
    private final static QName _TimeSeriesDescriptionParameterType_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "ParameterType");
    private final static QName _TimeSeriesDescriptionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService", "Identifier");
    private final static QName _CreateLocationLocation_QNAME = new QName("http://tempuri.org/", "location");
    private final static QName _GetTimeSeriesID2ParentLabel_QNAME = new QName("http://tempuri.org/", "parentLabel");
    private final static QName _GetTimeSeriesListResponseGetTimeSeriesListResult_QNAME = new QName("http://tempuri.org/", "GetTimeSeriesListResult");
    private final static QName _GetFieldVisitsByLocationResponseGetFieldVisitsByLocationResult_QNAME = new QName("http://tempuri.org/", "GetFieldVisitsByLocationResult");
    private final static QName _GetLocationIdLocationIdentifier_QNAME = new QName("http://tempuri.org/", "locationIdentifier");
    private final static QName _GetTimeSeriesViewName_QNAME = new QName("http://tempuri.org/", "viewName");
    private final static QName _GetFieldVisitsByLocationChangedSinceChangedSince_QNAME = new QName("http://tempuri.org/", "changedSince");
    private final static QName _AppendTimeSeriesFromBytes2ResponseAppendTimeSeriesFromBytes2Result_QNAME = new QName("http://tempuri.org/", "AppendTimeSeriesFromBytes2Result");
    private final static QName _GetLocationResponseGetLocationResult_QNAME = new QName("http://tempuri.org/", "GetLocationResult");
    private final static QName _SaveFieldVisitResponseSaveFieldVisitResult_QNAME = new QName("http://tempuri.org/", "SaveFieldVisitResult");
    private final static QName _GetTimeSeriesResponseGetTimeSeriesResult_QNAME = new QName("http://tempuri.org/", "GetTimeSeriesResult");
    private final static QName _FieldVisitMeasurementDisplayId_QNAME = new QName("http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", "DisplayId");
    private final static QName _AppendAndMergeFilePath_QNAME = new QName("http://tempuri.org/", "filePath");
    private final static QName _AppendAndMergeParameterMap_QNAME = new QName("http://tempuri.org/", "parameterMap");
    private final static QName _AppendAndMergeConfigName_QNAME = new QName("http://tempuri.org/", "configName");
    private final static QName _AppendAndMergeSiteName_QNAME = new QName("http://tempuri.org/", "SiteName");
    private final static QName _GetTimeSeriesListForLocationResponseGetTimeSeriesListForLocationResult_QNAME = new QName("http://tempuri.org/", "GetTimeSeriesListForLocationResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aquarius.DataAcquisition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringanyType }
     * 
     */
    public ArrayOfKeyValueOfstringanyType createArrayOfKeyValueOfstringanyType() {
        return new ArrayOfKeyValueOfstringanyType();
    }

    /**
     * Create an instance of {@link GetAuthTokenResponse }
     * 
     */
    public GetAuthTokenResponse createGetAuthTokenResponse() {
        return new GetAuthTokenResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesID2Response }
     * 
     */
    public GetTimeSeriesID2Response createGetTimeSeriesID2Response() {
        return new GetTimeSeriesID2Response();
    }

    /**
     * Create an instance of {@link KeepConnectionAlive }
     * 
     */
    public KeepConnectionAlive createKeepConnectionAlive() {
        return new KeepConnectionAlive();
    }

    /**
     * Create an instance of {@link GetFieldVisitsByLocationChangedSinceResponse }
     * 
     */
    public GetFieldVisitsByLocationChangedSinceResponse createGetFieldVisitsByLocationChangedSinceResponse() {
        return new GetFieldVisitsByLocationChangedSinceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFieldVisit }
     * 
     */
    public ArrayOfFieldVisit createArrayOfFieldVisit() {
        return new ArrayOfFieldVisit();
    }

    /**
     * Create an instance of {@link AppendAndMergeResponse }
     * 
     */
    public AppendAndMergeResponse createAppendAndMergeResponse() {
        return new AppendAndMergeResponse();
    }

    /**
     * Create an instance of {@link GetFieldVisitsByLocation }
     * 
     */
    public GetFieldVisitsByLocation createGetFieldVisitsByLocation() {
        return new GetFieldVisitsByLocation();
    }

    /**
     * Create an instance of {@link ModifyLocationResponse }
     * 
     */
    public ModifyLocationResponse createModifyLocationResponse() {
        return new ModifyLocationResponse();
    }

    /**
     * Create an instance of {@link IsConnectionValidResponse }
     * 
     */
    public IsConnectionValidResponse createIsConnectionValidResponse() {
        return new IsConnectionValidResponse();
    }

    /**
     * Create an instance of {@link CreateLocationResponse }
     * 
     */
    public CreateLocationResponse createCreateLocationResponse() {
        return new CreateLocationResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesIDResponse }
     * 
     */
    public GetTimeSeriesIDResponse createGetTimeSeriesIDResponse() {
        return new GetTimeSeriesIDResponse();
    }

    /**
     * Create an instance of {@link GetAllLocations }
     * 
     */
    public GetAllLocations createGetAllLocations() {
        return new GetAllLocations();
    }

    /**
     * Create an instance of {@link GetLocationIdResponse }
     * 
     */
    public GetLocationIdResponse createGetLocationIdResponse() {
        return new GetLocationIdResponse();
    }

    /**
     * Create an instance of {@link CreateTimeSeries2 }
     * 
     */
    public CreateTimeSeries2 createCreateTimeSeries2() {
        return new CreateTimeSeries2();
    }

    /**
     * Create an instance of {@link GetFieldVisitsByLocationAndDateResponse }
     * 
     */
    public GetFieldVisitsByLocationAndDateResponse createGetFieldVisitsByLocationAndDateResponse() {
        return new GetFieldVisitsByLocationAndDateResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesID }
     * 
     */
    public GetTimeSeriesID createGetTimeSeriesID() {
        return new GetTimeSeriesID();
    }

    /**
     * Create an instance of {@link AppendAndMerge }
     * 
     */
    public AppendAndMerge createAppendAndMerge() {
        return new AppendAndMerge();
    }

    /**
     * Create an instance of {@link GetTimeSeriesID2 }
     * 
     */
    public GetTimeSeriesID2 createGetTimeSeriesID2() {
        return new GetTimeSeriesID2();
    }

    /**
     * Create an instance of {@link CreateTimeSeries }
     * 
     */
    public CreateTimeSeries createCreateTimeSeries() {
        return new CreateTimeSeries();
    }

    /**
     * Create an instance of {@link ModifyLocation }
     * 
     */
    public ModifyLocation createModifyLocation() {
        return new ModifyLocation();
    }

    /**
     * Create an instance of {@link LocationDTO }
     * 
     */
    public LocationDTO createLocationDTO() {
        return new LocationDTO();
    }

    /**
     * Create an instance of {@link DeleteTimeSeries }
     * 
     */
    public DeleteTimeSeries createDeleteTimeSeries() {
        return new DeleteTimeSeries();
    }

    /**
     * Create an instance of {@link DeleteTimeSeriesResponse }
     * 
     */
    public DeleteTimeSeriesResponse createDeleteTimeSeriesResponse() {
        return new DeleteTimeSeriesResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesList }
     * 
     */
    public GetTimeSeriesList createGetTimeSeriesList() {
        return new GetTimeSeriesList();
    }

    /**
     * Create an instance of {@link GetTimeSeriesListForLocation }
     * 
     */
    public GetTimeSeriesListForLocation createGetTimeSeriesListForLocation() {
        return new GetTimeSeriesListForLocation();
    }

    /**
     * Create an instance of {@link UndoAppend }
     * 
     */
    public UndoAppend createUndoAppend() {
        return new UndoAppend();
    }

    /**
     * Create an instance of {@link CreateTimeSeries2Response }
     * 
     */
    public CreateTimeSeries2Response createCreateTimeSeries2Response() {
        return new CreateTimeSeries2Response();
    }

    /**
     * Create an instance of {@link GetTimeSeries }
     * 
     */
    public GetTimeSeries createGetTimeSeries() {
        return new GetTimeSeries();
    }

    /**
     * Create an instance of {@link AppendTimeSeriesFromBytes2Response }
     * 
     */
    public AppendTimeSeriesFromBytes2Response createAppendTimeSeriesFromBytes2Response() {
        return new AppendTimeSeriesFromBytes2Response();
    }

    /**
     * Create an instance of {@link AppendResult }
     * 
     */
    public AppendResult createAppendResult() {
        return new AppendResult();
    }

    /**
     * Create an instance of {@link GetFieldVisitsByLocationResponse }
     * 
     */
    public GetFieldVisitsByLocationResponse createGetFieldVisitsByLocationResponse() {
        return new GetFieldVisitsByLocationResponse();
    }

    /**
     * Create an instance of {@link IsConnectionValid }
     * 
     */
    public IsConnectionValid createIsConnectionValid() {
        return new IsConnectionValid();
    }

    /**
     * Create an instance of {@link SaveFieldVisitResponse }
     * 
     */
    public SaveFieldVisitResponse createSaveFieldVisitResponse() {
        return new SaveFieldVisitResponse();
    }

    /**
     * Create an instance of {@link FieldVisit }
     * 
     */
    public FieldVisit createFieldVisit() {
        return new FieldVisit();
    }

    /**
     * Create an instance of {@link GetLocation }
     * 
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link CreateLocation }
     * 
     */
    public CreateLocation createCreateLocation() {
        return new CreateLocation();
    }

    /**
     * Create an instance of {@link AppendTimeSeriesFromBytesResponse }
     * 
     */
    public AppendTimeSeriesFromBytesResponse createAppendTimeSeriesFromBytesResponse() {
        return new AppendTimeSeriesFromBytesResponse();
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link AppendTimeSeriesFromBytes2 }
     * 
     */
    public AppendTimeSeriesFromBytes2 createAppendTimeSeriesFromBytes2() {
        return new AppendTimeSeriesFromBytes2();
    }

    /**
     * Create an instance of {@link DeleteTimeSeriesPointsByTimeRangeResponse }
     * 
     */
    public DeleteTimeSeriesPointsByTimeRangeResponse createDeleteTimeSeriesPointsByTimeRangeResponse() {
        return new DeleteTimeSeriesPointsByTimeRangeResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesResponse }
     * 
     */
    public GetTimeSeriesResponse createGetTimeSeriesResponse() {
        return new GetTimeSeriesResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesListResponse }
     * 
     */
    public GetTimeSeriesListResponse createGetTimeSeriesListResponse() {
        return new GetTimeSeriesListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTimeSeriesDescription }
     * 
     */
    public ArrayOfTimeSeriesDescription createArrayOfTimeSeriesDescription() {
        return new ArrayOfTimeSeriesDescription();
    }

    /**
     * Create an instance of {@link AppendTimeSeriesFromBytes }
     * 
     */
    public AppendTimeSeriesFromBytes createAppendTimeSeriesFromBytes() {
        return new AppendTimeSeriesFromBytes();
    }

    /**
     * Create an instance of {@link GetAuthToken }
     * 
     */
    public GetAuthToken createGetAuthToken() {
        return new GetAuthToken();
    }

    /**
     * Create an instance of {@link GetLocationId }
     * 
     */
    public GetLocationId createGetLocationId() {
        return new GetLocationId();
    }

    /**
     * Create an instance of {@link CreateTimeSeriesResponse }
     * 
     */
    public CreateTimeSeriesResponse createCreateTimeSeriesResponse() {
        return new CreateTimeSeriesResponse();
    }

    /**
     * Create an instance of {@link GetAllLocationsResponse }
     * 
     */
    public GetAllLocationsResponse createGetAllLocationsResponse() {
        return new GetAllLocationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLocationDTO }
     * 
     */
    public ArrayOfLocationDTO createArrayOfLocationDTO() {
        return new ArrayOfLocationDTO();
    }

    /**
     * Create an instance of {@link UndoAppendResponse }
     * 
     */
    public UndoAppendResponse createUndoAppendResponse() {
        return new UndoAppendResponse();
    }

    /**
     * Create an instance of {@link DeleteTimeSeriesPointsByTimeRange }
     * 
     */
    public DeleteTimeSeriesPointsByTimeRange createDeleteTimeSeriesPointsByTimeRange() {
        return new DeleteTimeSeriesPointsByTimeRange();
    }

    /**
     * Create an instance of {@link GetFieldVisitsByLocationAndDate }
     * 
     */
    public GetFieldVisitsByLocationAndDate createGetFieldVisitsByLocationAndDate() {
        return new GetFieldVisitsByLocationAndDate();
    }

    /**
     * Create an instance of {@link GetFieldVisitsByLocationChangedSince }
     * 
     */
    public GetFieldVisitsByLocationChangedSince createGetFieldVisitsByLocationChangedSince() {
        return new GetFieldVisitsByLocationChangedSince();
    }

    /**
     * Create an instance of {@link KeepConnectionAliveResponse }
     * 
     */
    public KeepConnectionAliveResponse createKeepConnectionAliveResponse() {
        return new KeepConnectionAliveResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesListForLocationResponse }
     * 
     */
    public GetTimeSeriesListForLocationResponse createGetTimeSeriesListForLocationResponse() {
        return new GetTimeSeriesListForLocationResponse();
    }

    /**
     * Create an instance of {@link SaveFieldVisit }
     * 
     */
    public SaveFieldVisit createSaveFieldVisit() {
        return new SaveFieldVisit();
    }

    /**
     * Create an instance of {@link TimeSeriesDescription }
     * 
     */
    public TimeSeriesDescription createTimeSeriesDescription() {
        return new TimeSeriesDescription();
    }

    /**
     * Create an instance of {@link ArrayOfFieldVisitMeasurement }
     * 
     */
    public ArrayOfFieldVisitMeasurement createArrayOfFieldVisitMeasurement() {
        return new ArrayOfFieldVisitMeasurement();
    }

    /**
     * Create an instance of {@link ArrayOfFieldVisitResult }
     * 
     */
    public ArrayOfFieldVisitResult createArrayOfFieldVisitResult() {
        return new ArrayOfFieldVisitResult();
    }

    /**
     * Create an instance of {@link FieldVisitResult }
     * 
     */
    public FieldVisitResult createFieldVisitResult() {
        return new FieldVisitResult();
    }

    /**
     * Create an instance of {@link FieldVisitMeasurement }
     * 
     */
    public FieldVisitMeasurement createFieldVisitMeasurement() {
        return new FieldVisitMeasurement();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringanyType.KeyValueOfstringanyType }
     * 
     */
    public ArrayOfKeyValueOfstringanyType.KeyValueOfstringanyType createArrayOfKeyValueOfstringanyTypeKeyValueOfstringanyType() {
        return new ArrayOfKeyValueOfstringanyType.KeyValueOfstringanyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = GetTimeSeriesID.class)
    public JAXBElement<String> createGetTimeSeriesIDIdentifier(String value) {
        return new JAXBElement<String>(_GetTimeSeriesIDIdentifier_QNAME, String.class, GetTimeSeriesID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "LocationDTO")
    public JAXBElement<LocationDTO> createLocationDTO(LocationDTO value) {
        return new JAXBElement<LocationDTO>(_LocationDTO_QNAME, LocationDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "ArrayOfLocationDTO")
    public JAXBElement<ArrayOfLocationDTO> createArrayOfLocationDTO(ArrayOfLocationDTO value) {
        return new JAXBElement<ArrayOfLocationDTO>(_ArrayOfLocationDTO_QNAME, ArrayOfLocationDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "TimeSeriesDescription")
    public JAXBElement<TimeSeriesDescription> createTimeSeriesDescription(TimeSeriesDescription value) {
        return new JAXBElement<TimeSeriesDescription>(_TimeSeriesDescription_QNAME, TimeSeriesDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppendResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "AppendResult")
    public JAXBElement<AppendResult> createAppendResult(AppendResult value) {
        return new JAXBElement<AppendResult>(_AppendResult_QNAME, AppendResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldVisitMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "FieldVisitMeasurement")
    public JAXBElement<FieldVisitMeasurement> createFieldVisitMeasurement(FieldVisitMeasurement value) {
        return new JAXBElement<FieldVisitMeasurement>(_FieldVisitMeasurement_QNAME, FieldVisitMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldVisitResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "FieldVisitResult")
    public JAXBElement<FieldVisitResult> createFieldVisitResult(FieldVisitResult value) {
        return new JAXBElement<FieldVisitResult>(_FieldVisitResult_QNAME, FieldVisitResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "FieldVisit")
    public JAXBElement<FieldVisit> createFieldVisit(FieldVisit value) {
        return new JAXBElement<FieldVisit>(_FieldVisit_QNAME, FieldVisit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "ArrayOfFieldVisit")
    public JAXBElement<ArrayOfFieldVisit> createArrayOfFieldVisit(ArrayOfFieldVisit value) {
        return new JAXBElement<ArrayOfFieldVisit>(_ArrayOfFieldVisit_QNAME, ArrayOfFieldVisit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeSeriesDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "ArrayOfTimeSeriesDescription")
    public JAXBElement<ArrayOfTimeSeriesDescription> createArrayOfTimeSeriesDescription(ArrayOfTimeSeriesDescription value) {
        return new JAXBElement<ArrayOfTimeSeriesDescription>(_ArrayOfTimeSeriesDescription_QNAME, ArrayOfTimeSeriesDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringanyType")
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createArrayOfKeyValueOfstringanyType(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_ArrayOfKeyValueOfstringanyType_QNAME, ArrayOfKeyValueOfstringanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldVisitResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "ArrayOfFieldVisitResult")
    public JAXBElement<ArrayOfFieldVisitResult> createArrayOfFieldVisitResult(ArrayOfFieldVisitResult value) {
        return new JAXBElement<ArrayOfFieldVisitResult>(_ArrayOfFieldVisitResult_QNAME, ArrayOfFieldVisitResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldVisitMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "ArrayOfFieldVisitMeasurement")
    public JAXBElement<ArrayOfFieldVisitMeasurement> createArrayOfFieldVisitMeasurement(ArrayOfFieldVisitMeasurement value) {
        return new JAXBElement<ArrayOfFieldVisitMeasurement>(_ArrayOfFieldVisitMeasurement_QNAME, ArrayOfFieldVisitMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameterType", scope = GetTimeSeriesList.class)
    public JAXBElement<String> createGetTimeSeriesListParameterType(String value) {
        return new JAXBElement<String>(_GetTimeSeriesListParameterType_QNAME, String.class, GetTimeSeriesList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "encodedPassword", scope = GetAuthToken.class)
    public JAXBElement<String> createGetAuthTokenEncodedPassword(String value) {
        return new JAXBElement<String>(_GetAuthTokenEncodedPassword_QNAME, String.class, GetAuthToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetAuthToken.class)
    public JAXBElement<String> createGetAuthTokenUser(String value) {
        return new JAXBElement<String>(_GetAuthTokenUser_QNAME, String.class, GetAuthToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = UndoAppend.class)
    public JAXBElement<String> createUndoAppendIdentifier(String value) {
        return new JAXBElement<String>(_GetTimeSeriesIDIdentifier_QNAME, String.class, UndoAppend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "appendToken", scope = UndoAppend.class)
    public JAXBElement<String> createUndoAppendAppendToken(String value) {
        return new JAXBElement<String>(_UndoAppendAppendToken_QNAME, String.class, UndoAppend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllLocationsResult", scope = GetAllLocationsResponse.class)
    public JAXBElement<ArrayOfLocationDTO> createGetAllLocationsResponseGetAllLocationsResult(ArrayOfLocationDTO value) {
        return new JAXBElement<ArrayOfLocationDTO>(_GetAllLocationsResponseGetAllLocationsResult_QNAME, ArrayOfLocationDTO.class, GetAllLocationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFieldVisitsByLocationChangedSinceResult", scope = GetFieldVisitsByLocationChangedSinceResponse.class)
    public JAXBElement<ArrayOfFieldVisit> createGetFieldVisitsByLocationChangedSinceResponseGetFieldVisitsByLocationChangedSinceResult(ArrayOfFieldVisit value) {
        return new JAXBElement<ArrayOfFieldVisit>(_GetFieldVisitsByLocationChangedSinceResponseGetFieldVisitsByLocationChangedSinceResult_QNAME, ArrayOfFieldVisit.class, GetFieldVisitsByLocationChangedSinceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFieldVisitsByLocationAndDateResult", scope = GetFieldVisitsByLocationAndDateResponse.class)
    public JAXBElement<ArrayOfFieldVisit> createGetFieldVisitsByLocationAndDateResponseGetFieldVisitsByLocationAndDateResult(ArrayOfFieldVisit value) {
        return new JAXBElement<ArrayOfFieldVisit>(_GetFieldVisitsByLocationAndDateResponseGetFieldVisitsByLocationAndDateResult_QNAME, ArrayOfFieldVisit.class, GetFieldVisitsByLocationAndDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAuthTokenResult", scope = GetAuthTokenResponse.class)
    public JAXBElement<String> createGetAuthTokenResponseGetAuthTokenResult(String value) {
        return new JAXBElement<String>(_GetAuthTokenResponseGetAuthTokenResult_QNAME, String.class, GetAuthTokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "ExtendedAttributes", scope = LocationDTO.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createLocationDTOExtendedAttributes(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_LocationDTOExtendedAttributes_QNAME, ArrayOfKeyValueOfstringanyType.class, LocationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fv", scope = SaveFieldVisit.class)
    public JAXBElement<FieldVisit> createSaveFieldVisitFv(FieldVisit value) {
        return new JAXBElement<FieldVisit>(_SaveFieldVisitFv_QNAME, FieldVisit.class, SaveFieldVisit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = CreateTimeSeries.class)
    public JAXBElement<String> createCreateTimeSeriesIdentifier(String value) {
        return new JAXBElement<String>(_GetTimeSeriesIDIdentifier_QNAME, String.class, CreateTimeSeries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "description", scope = CreateTimeSeries2 .class)
    public JAXBElement<String> createCreateTimeSeries2Description(String value) {
        return new JAXBElement<String>(_CreateTimeSeries2Description_QNAME, String.class, CreateTimeSeries2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameter", scope = CreateTimeSeries2 .class)
    public JAXBElement<String> createCreateTimeSeries2Parameter(String value) {
        return new JAXBElement<String>(_CreateTimeSeries2Parameter_QNAME, String.class, CreateTimeSeries2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "unit", scope = CreateTimeSeries2 .class)
    public JAXBElement<String> createCreateTimeSeries2Unit(String value) {
        return new JAXBElement<String>(_CreateTimeSeries2Unit_QNAME, String.class, CreateTimeSeries2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comments", scope = CreateTimeSeries2 .class)
    public JAXBElement<String> createCreateTimeSeries2Comments(String value) {
        return new JAXBElement<String>(_CreateTimeSeries2Comments_QNAME, String.class, CreateTimeSeries2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "label", scope = CreateTimeSeries2 .class)
    public JAXBElement<String> createCreateTimeSeries2Label(String value) {
        return new JAXBElement<String>(_CreateTimeSeries2Label_QNAME, String.class, CreateTimeSeries2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "csvbytes", scope = AppendTimeSeriesFromBytes.class)
    public JAXBElement<byte[]> createAppendTimeSeriesFromBytesCsvbytes(byte[] value) {
        return new JAXBElement<byte[]>(_AppendTimeSeriesFromBytesCsvbytes_QNAME, byte[].class, AppendTimeSeriesFromBytes.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comment", scope = AppendTimeSeriesFromBytes.class)
    public JAXBElement<String> createAppendTimeSeriesFromBytesComment(String value) {
        return new JAXBElement<String>(_AppendTimeSeriesFromBytesComment_QNAME, String.class, AppendTimeSeriesFromBytes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = AppendTimeSeriesFromBytes.class)
    public JAXBElement<String> createAppendTimeSeriesFromBytesUserName(String value) {
        return new JAXBElement<String>(_AppendTimeSeriesFromBytesUserName_QNAME, String.class, AppendTimeSeriesFromBytes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "Units", scope = TimeSeriesDescription.class)
    public JAXBElement<String> createTimeSeriesDescriptionUnits(String value) {
        return new JAXBElement<String>(_TimeSeriesDescriptionUnits_QNAME, String.class, TimeSeriesDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "ParameterType", scope = TimeSeriesDescription.class)
    public JAXBElement<String> createTimeSeriesDescriptionParameterType(String value) {
        return new JAXBElement<String>(_TimeSeriesDescriptionParameterType_QNAME, String.class, TimeSeriesDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService", name = "Identifier", scope = TimeSeriesDescription.class)
    public JAXBElement<String> createTimeSeriesDescriptionIdentifier(String value) {
        return new JAXBElement<String>(_TimeSeriesDescriptionIdentifier_QNAME, String.class, TimeSeriesDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "location", scope = CreateLocation.class)
    public JAXBElement<LocationDTO> createCreateLocationLocation(LocationDTO value) {
        return new JAXBElement<LocationDTO>(_CreateLocationLocation_QNAME, LocationDTO.class, CreateLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parentLabel", scope = GetTimeSeriesID2 .class)
    public JAXBElement<String> createGetTimeSeriesID2ParentLabel(String value) {
        return new JAXBElement<String>(_GetTimeSeriesID2ParentLabel_QNAME, String.class, GetTimeSeriesID2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = GetTimeSeriesID2 .class)
    public JAXBElement<String> createGetTimeSeriesID2Identifier(String value) {
        return new JAXBElement<String>(_GetTimeSeriesIDIdentifier_QNAME, String.class, GetTimeSeriesID2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameterType", scope = GetTimeSeriesID2 .class)
    public JAXBElement<String> createGetTimeSeriesID2ParameterType(String value) {
        return new JAXBElement<String>(_GetTimeSeriesListParameterType_QNAME, String.class, GetTimeSeriesID2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeSeriesDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimeSeriesListResult", scope = GetTimeSeriesListResponse.class)
    public JAXBElement<ArrayOfTimeSeriesDescription> createGetTimeSeriesListResponseGetTimeSeriesListResult(ArrayOfTimeSeriesDescription value) {
        return new JAXBElement<ArrayOfTimeSeriesDescription>(_GetTimeSeriesListResponseGetTimeSeriesListResult_QNAME, ArrayOfTimeSeriesDescription.class, GetTimeSeriesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFieldVisitsByLocationResult", scope = GetFieldVisitsByLocationResponse.class)
    public JAXBElement<ArrayOfFieldVisit> createGetFieldVisitsByLocationResponseGetFieldVisitsByLocationResult(ArrayOfFieldVisit value) {
        return new JAXBElement<ArrayOfFieldVisit>(_GetFieldVisitsByLocationResponseGetFieldVisitsByLocationResult_QNAME, ArrayOfFieldVisit.class, GetFieldVisitsByLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "locationIdentifier", scope = GetLocationId.class)
    public JAXBElement<String> createGetLocationIdLocationIdentifier(String value) {
        return new JAXBElement<String>(_GetLocationIdLocationIdentifier_QNAME, String.class, GetLocationId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "viewName", scope = GetTimeSeries.class)
    public JAXBElement<String> createGetTimeSeriesViewName(String value) {
        return new JAXBElement<String>(_GetTimeSeriesViewName_QNAME, String.class, GetTimeSeries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "changedSince", scope = GetFieldVisitsByLocationChangedSince.class)
    public JAXBElement<String> createGetFieldVisitsByLocationChangedSinceChangedSince(String value) {
        return new JAXBElement<String>(_GetFieldVisitsByLocationChangedSinceChangedSince_QNAME, String.class, GetFieldVisitsByLocationChangedSince.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppendResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AppendTimeSeriesFromBytes2Result", scope = AppendTimeSeriesFromBytes2Response.class)
    public JAXBElement<AppendResult> createAppendTimeSeriesFromBytes2ResponseAppendTimeSeriesFromBytes2Result(AppendResult value) {
        return new JAXBElement<AppendResult>(_AppendTimeSeriesFromBytes2ResponseAppendTimeSeriesFromBytes2Result_QNAME, AppendResult.class, AppendTimeSeriesFromBytes2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLocationResult", scope = GetLocationResponse.class)
    public JAXBElement<LocationDTO> createGetLocationResponseGetLocationResult(LocationDTO value) {
        return new JAXBElement<LocationDTO>(_GetLocationResponseGetLocationResult_QNAME, LocationDTO.class, GetLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SaveFieldVisitResult", scope = SaveFieldVisitResponse.class)
    public JAXBElement<FieldVisit> createSaveFieldVisitResponseSaveFieldVisitResult(FieldVisit value) {
        return new JAXBElement<FieldVisit>(_SaveFieldVisitResponseSaveFieldVisitResult_QNAME, FieldVisit.class, SaveFieldVisitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimeSeriesResult", scope = GetTimeSeriesResponse.class)
    public JAXBElement<String> createGetTimeSeriesResponseGetTimeSeriesResult(String value) {
        return new JAXBElement<String>(_GetTimeSeriesResponseGetTimeSeriesResult_QNAME, String.class, GetTimeSeriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", name = "DisplayId", scope = FieldVisitMeasurement.class)
    public JAXBElement<String> createFieldVisitMeasurementDisplayId(String value) {
        return new JAXBElement<String>(_FieldVisitMeasurementDisplayId_QNAME, String.class, FieldVisitMeasurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "location", scope = ModifyLocation.class)
    public JAXBElement<LocationDTO> createModifyLocationLocation(LocationDTO value) {
        return new JAXBElement<LocationDTO>(_CreateLocationLocation_QNAME, LocationDTO.class, ModifyLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filePath", scope = AppendAndMerge.class)
    public JAXBElement<String> createAppendAndMergeFilePath(String value) {
        return new JAXBElement<String>(_AppendAndMergeFilePath_QNAME, String.class, AppendAndMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameterMap", scope = AppendAndMerge.class)
    public JAXBElement<String> createAppendAndMergeParameterMap(String value) {
        return new JAXBElement<String>(_AppendAndMergeParameterMap_QNAME, String.class, AppendAndMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configName", scope = AppendAndMerge.class)
    public JAXBElement<String> createAppendAndMergeConfigName(String value) {
        return new JAXBElement<String>(_AppendAndMergeConfigName_QNAME, String.class, AppendAndMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comment", scope = AppendAndMerge.class)
    public JAXBElement<String> createAppendAndMergeComment(String value) {
        return new JAXBElement<String>(_AppendTimeSeriesFromBytesComment_QNAME, String.class, AppendAndMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SiteName", scope = AppendAndMerge.class)
    public JAXBElement<String> createAppendAndMergeSiteName(String value) {
        return new JAXBElement<String>(_AppendAndMergeSiteName_QNAME, String.class, AppendAndMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeSeriesDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimeSeriesListForLocationResult", scope = GetTimeSeriesListForLocationResponse.class)
    public JAXBElement<ArrayOfTimeSeriesDescription> createGetTimeSeriesListForLocationResponseGetTimeSeriesListForLocationResult(ArrayOfTimeSeriesDescription value) {
        return new JAXBElement<ArrayOfTimeSeriesDescription>(_GetTimeSeriesListForLocationResponseGetTimeSeriesListForLocationResult_QNAME, ArrayOfTimeSeriesDescription.class, GetTimeSeriesListForLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "csvbytes", scope = AppendTimeSeriesFromBytes2 .class)
    public JAXBElement<byte[]> createAppendTimeSeriesFromBytes2Csvbytes(byte[] value) {
        return new JAXBElement<byte[]>(_AppendTimeSeriesFromBytesCsvbytes_QNAME, byte[].class, AppendTimeSeriesFromBytes2 .class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = AppendTimeSeriesFromBytes2 .class)
    public JAXBElement<String> createAppendTimeSeriesFromBytes2UserName(String value) {
        return new JAXBElement<String>(_AppendTimeSeriesFromBytesUserName_QNAME, String.class, AppendTimeSeriesFromBytes2 .class, value);
    }

}
