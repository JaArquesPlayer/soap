package edu.ucam.soap;

import edu.ucam.soap.generated.Calculator;
import edu.ucam.soap.generated.CalculatorSoap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.namespace.QName;
import java.net.URL;

@RestController
public class Controller {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "Calculator");

    @GetMapping(value = "/sumar")
    public String sumar(){
        URL wsdlURL = Calculator.WSDL_LOCATION;

        Calculator ss = new Calculator(wsdlURL, SERVICE_NAME);
        CalculatorSoap port = ss.getCalculatorSoap();

        System.out.println("Invoking add...");
        int _add_intA = 12;
        int _add_intB = 21;
        int _add__return = port.add(_add_intA, _add_intB);
        System.out.println("add.result=" + _add__return);
        return "add.result=" + _add__return;
    }
}
