/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.johnzon;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JohnzonDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        JohnzonDataFormat dataformat = (JohnzonDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "objectmapper":
        case "objectMapper": dataformat.setObjectMapper(property(camelContext, org.apache.johnzon.mapper.Mapper.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
