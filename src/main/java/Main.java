import com.google.gson.Gson;
import model.Address;
import model.Restaurant;
import model.Staff;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //serializedJson();
        deserializedJson();
    }

    public static void serializedJson(){
        //System.out.println("Hello!");
        //Address address = new Address("Home", "4th Street", "Bengaluru", "Karnataka");
        /*Staff staff1 = new Staff("Manager", "Jagan", "30",
                new Address("Home", "Main Street", "Bengaluru", "Karnataka"));
        Staff staff2 = new Staff("Waiter", "Mohan", "25",
                new Address("Home", "Side Street", "Bengaluru", "Karnataka"));
        Staff[] allStaff = new Staff[]{staff1, staff2};*/
//        Restaurant restaurant = new Restaurant("Imperio",
//                new Address("Office", "4th Street", "Bengaluru", "Karnataka"),
//                new Staff[]{
//                        new Staff("Manager", "Jagan", "30",
//                                new Address("Home", "Main Street", "Bengaluru", "Karnataka")),
//                        new Staff("Waiter", "Mohan", "25",
//                                new Address("Home", "Side Street", "Bengaluru", "Karnataka"))
//                });
        List<Restaurant> restaurantList = new ArrayList<Restaurant>(){
            {
                add(new Restaurant("Imperio",
                        new Address("Office", "4th Street", "Bengaluru", "Karnataka"),
                        new Staff[]{
                                new Staff("Manager", "Jagan", "30",
                                        new Address("Home", "Main Street", "Bengaluru", "Karnataka")),
                                new Staff("Waiter", "Mohan", "25",
                                        new Address("Home", "Side Street", "Bengaluru", "Karnataka"))
                        }));
                add(new Restaurant("Sip N Bite",
                        new Address("Office", "West Street", "Bengaluru", "Karnataka"),
                        new Staff[]{
                                new Staff("Manager", "Madan", "40",
                                        new Address("Home", "East Street", "Bengaluru", "Karnataka")),
                                new Staff("Waiter", "Malvia", "29",
                                        new Address("Home", "Point Street", "Bengaluru", "Karnataka"))
                        }));
            }
        };
        Gson gson = new Gson();
        String json = gson.toJson(restaurantList);
    }

    public static void deserializedJson(){
        String address = "[{\"name\":\"Imperio\",\"address\":{\"type\":\"Office\",\"addLine\":\"4thStreet\",\"city\":\"Bengaluru\",\"state\":\"Karnataka\"},\"staff\":[{\"designation\":\"Manager\",\"name\":\"Jagan\",\"age\":\"30\",\"address\":{\"type\":\"Home\",\"addLine\":\"MainStreet\",\"city\":\"Bengaluru\",\"state\":\"Karnataka\"}},{\"designation\":\"Waiter\",\"name\":\"Mohan\",\"age\":\"25\",\"address\":{\"type\":\"Home\",\"addLine\":\"SideStreet\",\"city\":\"Bengaluru\",\"state\":\"Karnataka\"}}]},{\"name\":\"SipNBite\",\"address\":{\"type\":\"Office\",\"addLine\":\"WestStreet\",\"city\":\"Bengaluru\",\"state\":\"Karnataka\"},\"staff\":[{\"designation\":\"Manager\",\"name\":\"Madan\",\"age\":\"40\",\"address\":{\"type\":\"Home\",\"addLine\":\"EastStreet\",\"city\":\"Bengaluru\",\"state\":\"Karnataka\"}},{\"designation\":\"Waiter\",\"name\":\"Malvia\",\"age\":\"29\",\"address\":{\"type\":\"Home\",\"addLine\":\"PointStreet\",\"city\":\"Bengaluru\",\"state\":\"Karnataka\"}}]}]";
        Gson gson = new Gson();
        Type type = new TypeToken<List<Restaurant>>(){}.getType();
        List<Restaurant> json = gson.fromJson(address, type);

        for (Restaurant restaurant : json){
            if(restaurant.getName().equals("SipNBite")){
                for(Staff staff : restaurant.getStaff()){
                    if(staff.getName().equals("Madan")){
                        staff.setDesignation("Senior Manager");
                        break;
                    }
                }
            }
        }

        String json2 = gson.toJson(json);
    }
}
