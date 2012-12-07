package org.phw.eop.api.internal.parser;

import org.phw.eop.api.EopParser;
import org.phw.eop.api.internal.parser.file.FileParser;
import org.phw.eop.api.internal.parser.json.ObjectJsonParser;
import org.phw.eop.api.internal.parser.xml.ObjectXmlParser;
import org.phw.eop.api.internal.util.Strings;

public class ParserFactory {

    public static EopParser createParser(String contentType, Class respClass, boolean isDownloadFile) {
        if (isDownloadFile) {
            return new FileParser(respClass);
        }
        if (Strings.isEmpty(contentType)) {
            return new ObjectJsonParser(respClass);
        }
        if (contentType.contains("text/xml")) {
            return new ObjectXmlParser(respClass);
        }
        return new ObjectJsonParser(respClass);
    }
}
