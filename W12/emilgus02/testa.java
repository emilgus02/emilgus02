package emilgus02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class testa {

	public static void main(String[] args) {
        
        ArrayList<String> otherList = new ArrayList<>();
        
        Collection<? extends String> namesList = (Collection<? extends String>) Arrays.asList();
         
        otherList.addAll(namesList);    
         
        System.out.println(otherList);

	}

}
