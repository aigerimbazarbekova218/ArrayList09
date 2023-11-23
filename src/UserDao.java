import java.util.List;

public class UserDao {
    private List<User>users;

    public UserDao(List<User> users) {
        this.users = users;
    }

    public UserDao() {
    }

    public List<User> getUsers() {
        return users;

    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public void addUsers(User user){
        users.add(user);
    }
    public void getById(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                System.out.println(users.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
