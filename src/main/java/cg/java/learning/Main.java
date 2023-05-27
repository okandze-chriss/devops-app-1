package cg.java.learning;
import cg.java.learning.classes.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
    public static  final Logger LOGGER = Logger.getGlobal();
    /**
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
     // b = c++; incrementation after affectation ==> Post-incrementation
     // b = ++c;  incrementation before affectation ==> Pre-incrementation

     int note  = 12;
     note -= 2; ==> note = note - 2;
     note *= 2; ==> note = note * 2;
     note += 2; ==> note = note + 2;
     note /= 2; ==> note = note / 2;
     note %= 2; ==> note = note % 2;
     */

    public static void main(String[] args){
       /* LOGGER.log(Level.INFO, "Variables in java ");
        int note = 12;
        String result = String.valueOf(note);
        LOGGER.info(result);*/

        List<Role> tabRoles = new ArrayList<>();
        tabRoles.add(new Role(1L, "User"));
        tabRoles.add(new Role(2L, "Admin"));

        String [] formRoles = {"User", "Admin"};

        isRoles(tabRoles, formRoles);


    }


    public static boolean isRoles(List<Role> entityRoles, String [] formRoles){
        List<String> roleNames = new ArrayList<>();
        for(Role role : entityRoles){
            roleNames.add(role.getName());
        }

        List<String> valideList = new ArrayList<>(
                Arrays.asList(
                "User",
                "Admin"
                ));

        if(new HashSet<>(roleNames).containsAll(Arrays.asList(formRoles)) && List.of(formRoles).equals(valideList)){
            LOGGER.info("Oui ça existe belle et  bien !!!");
        }else {
            LOGGER.info("non ça n'existe pas !!!");
        }

        return true;
    }
}