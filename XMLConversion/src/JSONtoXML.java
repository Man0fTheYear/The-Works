import org.json.JSONObject;
import org.json.XML;

public class JSONtoXML {
    public static void main(String[] args) {

        String jsonStr = "{\"menu\": {\n" +
                "  \"id\": \"file\",\n" +
                "  \"value\": \"File\",\n" +
                "  \"popup\": {\n" +
                "    \"menuitem\": [\n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";

        JSONObject json = new JSONObject(jsonStr);

        System.out.println(XML.toString(json));
    }

}
