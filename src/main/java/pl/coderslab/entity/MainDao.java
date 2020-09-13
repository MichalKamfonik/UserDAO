package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        //System.out.println("-----------test create---------------");
        //testCreate();
        System.out.println("-----------test read 1---------------");
        User user = testRead(1);
        System.out.println("-----------test read 2---------------");
        testRead(2);
        System.out.println("-----------test update 1---------------");
        testUpdate(user);
        System.out.println("-----------test read 1---------------");
        testRead(1);
        //System.out.println("-----------test delete 1---------------");
        //testDelete(1);
        System.out.println("-----------test find all---------------");
        testFindAll();
        System.out.println("-----------test delete all---------------");
        testDeleteAll();
    }

    private  static void testDeleteAll(){
        UserDao userDao = new UserDao();
        userDao.deleteAll();
    }

    private static void testFindAll() {
        UserDao userDao = new UserDao();
        User[] all = userDao.findAll();
        for (User u : all) {
            printUser(u);
        }
    }

    private static void testDelete(int id) {
        UserDao userDao = new UserDao();
        userDao.delete(id);
    }

    private static void testCreate(){
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("arek");
        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
        user.setPassword("pass");
        userDao.create(user);
    }

    private static User testRead(int id){
        UserDao userDao = new UserDao();
        User userToUpdate = userDao.read(id);
        if(userToUpdate != null) {
            printUser(userToUpdate);
            return userToUpdate;
        } else {
            System.out.println("No such user");
            return null;
        }
    }

    private static void printUser(User user) {
        System.out.println(
                user.getId() + " " +
                        user.getUserName() + " " +
                        user.getEmail() + " " +
                        user.getPassword());
    }

    private static void testUpdate(User user){
        UserDao userDao = new UserDao();
        user.setUserName("Arkadiusz");
        user.setEmail("arek@coderslab.pl");
        user.setPassword("superPassword");
        userDao.update(user);
    }
}
