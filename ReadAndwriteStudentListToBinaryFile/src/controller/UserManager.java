package controller;
import model.User;
import storage.ReadWriteFileExcel;
import storage.iReadWriteFile;
import storage.ReadWriteFile;

import java.awt.*;

public class UserManager {
    private static iReadWriteFile readWriteFile = (iReadWriteFile) new ReadWriteFileExcel();
    private static List userList = (List) readWriteFile.readFile();
    public static void addNewUser(User user){
        userList.add(user.toString());
        readWriteFile.writeFile(userList);
    }
}
