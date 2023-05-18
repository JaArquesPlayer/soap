
package edu.ucam.soap.generated;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2023-05-18T09:04:21.676+02:00
 * Generated source version: 3.4.3
 *
 */
public final class CalculatorSoap_CalculatorSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "Calculator");

    private CalculatorSoap_CalculatorSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Calculator.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        Calculator ss = new Calculator(wsdlURL, SERVICE_NAME);
        CalculatorSoap port = ss.getCalculatorSoap12();

        {
        System.out.println("Invoking subtract...");
        int _subtract_intA = 0;
        int _subtract_intB = 0;
        int _subtract__return = port.subtract(_subtract_intA, _subtract_intB);
        System.out.println("subtract.result=" + _subtract__return);


        }
        {
        System.out.println("Invoking divide...");
        int _divide_intA = 0;
        int _divide_intB = 0;
        int _divide__return = port.divide(_divide_intA, _divide_intB);
        System.out.println("divide.result=" + _divide__return);


        }
        {
        System.out.println("Invoking add...");
        int _add_intA = 0;
        int _add_intB = 0;
        int _add__return = port.add(_add_intA, _add_intB);
        System.out.println("add.result=" + _add__return);


        }
        {
        System.out.println("Invoking multiply...");
        int _multiply_intA = 0;
        int _multiply_intB = 0;
        int _multiply__return = port.multiply(_multiply_intA, _multiply_intB);
        System.out.println("multiply.result=" + _multiply__return);


        }

        System.exit(0);
    }

}
