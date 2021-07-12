
package wsConsumoBanguat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariablesResult" type="{http://www.banguat.gob.gt/variables/ws/}InfoVariable" minOccurs="0"/>
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
    "variablesResult"
})
@XmlRootElement(name = "VariablesResponse")
public class VariablesResponse {

    @XmlElement(name = "VariablesResult")
    protected InfoVariable variablesResult;

    /**
     * Obtiene el valor de la propiedad variablesResult.
     * 
     * @return
     *     possible object is
     *     {@link InfoVariable }
     *     
     */
    public InfoVariable getVariablesResult() {
        return variablesResult;
    }

    /**
     * Define el valor de la propiedad variablesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoVariable }
     *     
     */
    public void setVariablesResult(InfoVariable value) {
        this.variablesResult = value;
    }

}
