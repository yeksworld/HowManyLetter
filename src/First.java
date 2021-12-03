
import java.util.HashMap;
import java.util.Scanner;

    public class First {

        public static void main(String[] args) {
            String test="I would like to tell a beautiful woman before the mirrors her beauty";
            HashMap<Object, Object> hmap = new HashMap<Object, Object>();

            for (int i = 0; i < test.length(); i++) {
                if(!hmap.containsKey(test.charAt(i)))
                {
                    hmap.put(test.charAt(i),1);
                }
                else
                {
                    int count= (int)hmap.get(test.charAt(i));
                    hmap.put(test.charAt(i),count+1);
                }
            }
            System.out.println(test);
            System.out.println(hmap);
        }

    }