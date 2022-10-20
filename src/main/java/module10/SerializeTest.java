package module10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class SerializeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        OutputStream fos = new FileOutputStream("registerUser.bin");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
        UserRegisterDto userRegisterDto = new UserRegisterDto();
        userRegisterDto.setEmail("user@gmail.com");
        userRegisterDto.setUsername("new_user_super");
//        oos.writeObject(userRegisterDto);

//        InputStream fis = new FileInputStream("registerUser.bin");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        UserRegisterDto registerDto = (UserRegisterDto) ois.readObject();
//        System.out.println("registerDto = " + registerDto);

        UserRegisterDto userRegisterDto1 = new UserRegisterDto();
        userRegisterDto1.setEmail("user1@gmail.com");
        userRegisterDto1.setUsername("new_user_super1");

        UserRegisterDto [] userArray = {
                userRegisterDto, userRegisterDto1
        };
        
        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String s = gson.toJson(userArray);
//        System.out.println(s);
//        OutputStream fos  = new FileOutputStream("user.json");
//        fos.write(s.getBytes());


//        Writer fw = new FileWriter("user.json");
//        gson.toJson(userArray, fw);
//        fw.flush();
//        fw.close();


//        Gson gson = new Gson();
//        String json = gson.toJson(userRegisterDto);
//        UserRegisterDto res = gson.fromJson(json, UserRegisterDto.class);
//        System.out.println("res = " + res);

//        Gson gson = new Gson();
//        Reader fr = new FileReader("user.json");
//        UserRegisterDto res = gson.fromJson(fr, UserRegisterDto.class);
//        System.out.println("res = " + res);
    }
}
