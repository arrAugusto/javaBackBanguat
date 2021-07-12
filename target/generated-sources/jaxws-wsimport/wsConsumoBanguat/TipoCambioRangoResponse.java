
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
 *         &lt;element name="TipoCambioRangoResult" type="{http://www.banguat.gob.gt/variables/ws/}DataVariable" minOccurs="0"/>
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
    "tipoCambioRangoResult"
})
@XmlRootElement(name = "TipoCambioRangoResponse")
public class TipoCambioRangoResponse {

    @XmlElement(name = "TipoCambioRangoResult")
    protected DataVariable tipoCambioRangoResult;

    /**
     * Obtiene el valor de la propiedad tipoCambioRangoResult.
     * 
     * @return
     *     possible object is
     *     {@link DataVariable }
     *     
     */
    public DataVariable getTipoCambioRangoResult() {
        return tipoCambioRangoResult;
    }

    /**
     * Define el valor de la propiedad tipoCambioRangoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DataVariable }
     *     
     */
    public void setTipoCambioRangoResult(DataVariable value) {
        this.tipoCambioRangoResult = value;
    }

}
