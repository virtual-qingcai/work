package people.management.client;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.apache.cxf.jaxrs.client.*;
import people.management.web.data.*;
public class Test {
 private static String webServiceUrl = "http://localhost:8080/people.management.web/api/peoples";
 private static String agePredictionUrl = "https://age-prediction.p.rapidapi.com/"; 
 private static String apiKey = "ce29177fc8msh21571b40ebdf7a9p160914jsna39882ebc4c6"; // 用你的实际API密钥替换
 
 public static void main(String[] args) {
 People alice = new People("Alice", 15.0f, add("Alice", 15.0f));
 People bob = new People("Bob", 13.0f, add("Bob", 13.0f));
 get(bob.getId());
 delete(bob.getId());
 predictAge("Norma");
 }
 private static Integer add(String name, Float grade) {
 System.out.print("Adding " + name + "... ");
 WebClient c = WebClient.create(webServiceUrl);
 People s = new People(name, grade);

 Response r = c.post(s);
 if(r.getStatus() == 400) {
 System.out.println("Oops!");
 return null;
 }
 String uri = r.getHeaderString("Content-Location");
 System.out.println("OK.");
 return Integer.parseInt(uri.substring(uri.lastIndexOf('/') + 1));
 }
 
 private static Boolean delete(Integer id) {
 System.out.print("Deleting " + id + "... ");
 WebClient c = WebClient.create(webServiceUrl).path(id);
 int status = c.delete().getStatus();
 if(status == 200) {
 System.out.println("OK.");
 return true;
 }
 System.out.println("Oops!");
 return false;
 }
 private static People get(Integer id) {
 System.out.print("Getting " + id + "... ");
 WebClient c = WebClient.create(webServiceUrl).path(id);
 People s = null;
 try {
 s = c.get(People.class);
 System.out.println(s.toString());
 } catch(NotFoundException e) {
 System.out.println("Oops!");
 }
 return s;
 }
 private static void predictAge(String name) {
     System.out.println("Predicting age for " + name + "... ");
     WebClient client = WebClient.create(agePredictionUrl);
     client.header("X-RapidAPI-Key", apiKey);
     client.header("X-RapidAPI-Host", "age-prediction.p.rapidapi.com");
     client.query("name", name);

     try {
         Response response = client.get();
         if (response.getStatus() == 200) {
             String result = response.readEntity(String.class);
             System.out.println("Predicted age: " + result);
         } else {
             System.out.println("Error: " + response.getStatus());
         }
     } catch (Exception e) {
         System.out.println("Oops! " + e.getMessage());
     }
 }
}
 
 
 
