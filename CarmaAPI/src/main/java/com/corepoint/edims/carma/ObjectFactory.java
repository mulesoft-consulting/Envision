
package com.corepoint.edims.carma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.corepoint.edims.carma package. 
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

    private final static QName _CarmaRecord_QNAME = new QName("http://carma.edims.corepoint.com", "carmaRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.corepoint.edims.carma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiagnosisType }
     * 
     */
    public DiagnosisType createDiagnosisType() {
        return new DiagnosisType();
    }

    /**
     * Create an instance of {@link CarmaRecordType }
     * 
     */
    public CarmaRecordType createCarmaRecordType() {
        return new CarmaRecordType();
    }

    /**
     * Create an instance of {@link ZsegType }
     * 
     */
    public ZsegType createZsegType() {
        return new ZsegType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link RerralInfoType }
     * 
     */
    public RerralInfoType createRerralInfoType() {
        return new RerralInfoType();
    }

    /**
     * Create an instance of {@link HospitalType }
     * 
     */
    public HospitalType createHospitalType() {
        return new HospitalType();
    }

    /**
     * Create an instance of {@link PatientInfoType }
     * 
     */
    public PatientInfoType createPatientInfoType() {
        return new PatientInfoType();
    }

    /**
     * Create an instance of {@link InsuranceType }
     * 
     */
    public InsuranceType createInsuranceType() {
        return new InsuranceType();
    }

    /**
     * Create an instance of {@link AppointmentType }
     * 
     */
    public AppointmentType createAppointmentType() {
        return new AppointmentType();
    }

    /**
     * Create an instance of {@link DischargeType }
     * 
     */
    public DischargeType createDischargeType() {
        return new DischargeType();
    }

    /**
     * Create an instance of {@link DiagnosisType.ICDs }
     * 
     */
    public DiagnosisType.ICDs createDiagnosisTypeICDs() {
        return new DiagnosisType.ICDs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarmaRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carma.edims.corepoint.com", name = "carmaRecord")
    public JAXBElement<CarmaRecordType> createCarmaRecord(CarmaRecordType value) {
        return new JAXBElement<CarmaRecordType>(_CarmaRecord_QNAME, CarmaRecordType.class, null, value);
    }

}
