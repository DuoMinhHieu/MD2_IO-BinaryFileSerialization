package storage;
import model.User;
import java.util.List;

public interface iReadWriteFile {
    <User> void writeFile(List<User>user);
    List<User> readFile();

    void writeFile(java.awt.List userList);
}
