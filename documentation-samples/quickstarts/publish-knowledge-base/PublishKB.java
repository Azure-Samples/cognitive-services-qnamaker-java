// httpclient-4.5.3.jar
// httpcore-4.4.6.jar
// commons-logging-1.2.jar

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.StringEntity;

// 1. Replace variable values with your own
// 2. Compile with: javac -cp "lib/*" PublishKB.java
// 3. Execute with: java -cp ".;lib/*" PublishKB

public class GetAnswer {

    public static void main(String[] args) 
    {

        try
        {
            String knowledge_base_id = "YOUR-KNOWLEDGE-BASE-ID";
            String resource_key = "YOUR-RESOURCE-KEY";

            String host = String.Format("https://westus.api.cognitive.microsoft.com/qnamaker/v4.0/knowledgebases/%s", knowledge_base_id);

            // Create http client
            HttpClient httpclient = HttpClients.createDefault();

            HttpPost request = new HttpPost(host);

            // set authorization
            request.setHeader("Ocp-Apim-Subscription-Key",resource_key);

            // Send request to Azure service, get response
            HttpResponse response = httpclient.execute(request);

            HttpEntity entityResponse = response.getEntity();

            if (entityResponse != null) 
            {
                System.out.println("response back!");
                System.out.println(EntityUtils.toString(entityResponse));
            }
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}