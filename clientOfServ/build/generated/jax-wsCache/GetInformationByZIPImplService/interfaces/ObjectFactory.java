
package interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the interfaces package. 
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

    private final static QName _Exception_QNAME = new QName("http://interfaces/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link CityStatus }
     * 
     */
    public CityStatus createCityStatus() {
        return new CityStatus();
    }

    /**
     * Create an instance of {@link CityForecast }
     * 
     */
    public CityForecast createCityForecast() {
        return new CityForecast();
    }

    /**
     * Create an instance of {@link CityWeather }
     * 
     */
    public CityWeather createCityWeather() {
        return new CityWeather();
    }

    /**
     * Create an instance of {@link WeatherInformation }
     * 
     */
    public WeatherInformation createWeatherInformation() {
        return new WeatherInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
