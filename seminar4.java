import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// Написать приложение для ввода ФИО, возраст и пол пользователей. Данные хранить в разных списках. 
// Сортировать пользователей по возрасту. Не вывести в порядке возрастания возрастов а именно сортировать!)
public class seminar4 {
    public static void main(String[] args) {
        ArrayList<String> listFname = new ArrayList<>();
        listFname.add("Танина");
        listFname.add("Сергеев");
        listFname.add("Володина");
        listFname.add("Андреев");
        listFname.add("Ленина");
        listFname.add("Симонов");
        ArrayList<String> listLname = new ArrayList<>();
        listLname.add("Ольга");
        listLname.add("Семен");
        listLname.add("Светлана");
        listLname.add("Тихон");
        listLname.add("Ирина");
        listLname.add("Андрей");
        ArrayList<String> listTname = new ArrayList<>();
        listTname.add("Сергеевна");
        listTname.add("Олегович");
        listTname.add("Семеновна");
        listTname.add("Владимирович");
        listTname.add("Ивановна");
        listTname.add("Михайлович");
        ArrayList<Integer> listAge = new ArrayList<>();
        listAge.add(22);
        listAge.add(55);
        listAge.add(33);
        listAge.add(44);
        listAge.add(66);
        listAge.add(11);
        ArrayList<String> listSex = new ArrayList<>();
        listSex.add("Ж");
        listSex.add("M");
        listSex.add("Ж");
        listSex.add("M");
        listSex.add("Ж");
        listSex.add("M");
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(0);
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        

        
        int cnt = listAge.size()-1;
        while (cnt > -1) {
            int maxAge = listAge.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (maxAge < listAge.get(linkedlist.get(i))){
                    maxAge = listAge.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);

            cnt--;
        }

        int count = linkedlist.size();

        ArrayList<String> listFnameSort = new ArrayList<>(count);
        ArrayList<String> listLnameSort = new ArrayList<>(count);
        ArrayList<String> listTnameSort = new ArrayList<>(count);
        ArrayList<Integer> listAgeSort = new ArrayList<>(count);
        ArrayList<String> listSexSort = new ArrayList<>(count);
        

        for (int i : linkedlist){
        listFnameSort.add(listFname.get(i));
        listLnameSort.add(listLname.get(i));
        listTnameSort.add(listTname.get(i));
        listAgeSort.add(listAge.get(i));
        listSexSort.add(listSex.get(i));
    }

    for (int i = 0; i < 5; i++){
    System.out.println(listFnameSort.get(i)+listLnameSort.get(i)+listTnameSort.get(i)+listAgeSort.get(i)+listSexSort.get(i));
    }
    System.out.println(listFnameSort);
    System.out.println(listLnameSort);
    System.out.println(listTnameSort);
    System.out.println(listAgeSort);
    System.out.println(listSexSort);
        
    }
    
}
