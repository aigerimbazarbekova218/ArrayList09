import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(5);
        integers.add(6);
        integers.add(5);
        System.out.println(integers.get(0));
        integers.set(0,7);
        System.out.println(integers.get(0));
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());//true je false kaitarat
        integers.remove(1);
        System.out.println(integers.get(1));


        User user1=new User(1,"Aigerim",25);
        User user2=new User(2, "Aidana",22 );
        User user3=new User(4,"Zulya",21);

      UserDao userDao = new UserDao(new ArrayList<>());
      userDao.addUsers(user1);
      userDao.addUsers(user2);
      userDao.getById(2);

    }
}