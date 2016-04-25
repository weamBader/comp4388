package ed.bzu.webservice.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class TestParsingWithJSON {

    private static JSONTokener jsonOut;

    public StringBuilder main(int id) throws JSONException, IOException {

        StringBuilder resultingJSON = new StringBuilder();

        File f = new File("\\Users\\Weam\\Desktop\\uni\\web service\\COMP4382-master\\features.json");

        String jsonString = readFile(f.getPath());

        jsonOut = new JSONTokener(jsonString);
        JSONObject output = new JSONObject(jsonOut);

        JSONObject docs1 = output.getJSONObject("feature1");
        JSONObject docs2 = output.getJSONObject("feature2");
        JSONObject docs3 = output.getJSONObject("feature3");

        int id1 = docs1.getInt("id");
        int id2 = docs2.getInt("id");
        int id3 = docs3.getInt("id");

        String email1 = docs1.getString("email");
        String email2 = docs2.getString("email");
        String email3 = docs3.getString("email");

        String password1 = docs1.getString("password");
        String password2 = docs2.getString("password");
        String password3 = docs3.getString("password");

        resultingJSON.append(id1+" ");
        resultingJSON.append(email1 + " ");
        resultingJSON.append(password1 + "\n");

        resultingJSON.append(id2+" ");
        resultingJSON.append(email2 + "  ");
        resultingJSON.append(password2 + "\n");

        resultingJSON.append(id3+" ");
        resultingJSON.append(email3 + "  ");
        resultingJSON.append(password3 + "\n");

        return resultingJSON;

    }

    private static String readFile(String file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        return stringBuilder.toString();
    }

}
