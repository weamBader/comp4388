package ed.bzu.webservice.json;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class TestParsingWithJSON1 {

    private static JSONTokener jsonOut;

    public void main(int id) throws JSONException, IOException {

        StringBuilder resultingJSON = new StringBuilder();

        File f = new File("\\Users\\Weam\\Desktop\\uni\\web service\\COMP4382-master\\template.json");

        String jsonString = readFile(f.getPath());

        jsonOut = new JSONTokener(jsonString);
        JSONObject output = new JSONObject(jsonOut);
        
        JSONObject docs1 = output.getJSONObject("template1");
        JSONObject docs2 = output.getJSONObject("template2");
        JSONObject docs3 = output.getJSONObject("template3");

        int id1 = docs1.getInt("id");
        int id2 = docs2.getInt("id");
        int id3 = docs3.getInt("id");
        
        String name1 = docs1.getString("name");
        String name2 = docs2.getString("name");
        String name3 = docs3.getString("name");

        String time1 = docs1.getString("time");
        String time2 = docs2.getString("time");
        String time3 = docs3.getString("time");
        
        resultingJSON.append(id1+"  ");
        resultingJSON.append(name1+"  ");
        resultingJSON.append(time1+"\n");  
        
        resultingJSON.append(id2+"  ");
        resultingJSON.append(name2+"  ");
        resultingJSON.append(time2+"\n");
        
        resultingJSON.append(id3+"  ");
        resultingJSON.append(name3+"  ");
        resultingJSON.append(time3+"\n");
        
        System.out.print(resultingJSON.toString());

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
