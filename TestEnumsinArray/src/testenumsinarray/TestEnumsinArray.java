package testenumsinarray;

import java.util.ArrayList;

/**
 *
 * @author Camilla
 */
public class TestEnumsinArray {

    public static void main(String[] args) {
        
        ArrayList<TestEnum> ArrayEnumList;
        ArrayEnumList = new ArrayList<>();
        ArrayEnumList.add(TestEnum.FEST);
        ArrayEnumList.add(TestEnum.LOL);
        ArrayEnumList.add(TestEnum.TEST);

        for (TestEnum value : ArrayEnumList) {
            System.out.println(value);
            
            //test om værdi på given plads er lig med Enum Fest
            //udskrivning bør give true og derefter false 2 gange
            // da 0 = FEST, 1 = LOL og 2 = TEST
            if (value == TestEnum.FEST) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }

    public enum TestEnum {
        HEST, FEST, TEST, GÆST, LOL
    }

}
