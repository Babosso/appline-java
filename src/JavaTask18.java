import java.io.*;

class JavaTask18 {
  public static void main(String[] args) {
    String s = null;
    int counter = 0;
    try {
      BufferedReader br = new BufferedReader(new FileReader("test.txt"));
      while (true) {
        s = br.readLine();
        if (s == null) {
          break;
        }
        counter++;
        System.out.println(s);
      }
      System.out.println(counter + " строк прочитано");
    }
    catch (IOException exc) {
      System.out.println("Ошибка ввода-вывода: " + exc);
    }


    if (counter >0){
      String str = null;
      Reader reader = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(reader);
      System.out.println("Введите " + counter + " строк для записи в файл.");
      try {
        FileWriter fw = new FileWriter("test.txt");
        do {
          System.out.print("^");
          str = br.readLine();
          str = str + "\r\n";
          fw.write(str);
          counter--;
        }
        while (counter != 0);
        fw.close();
      } catch (IOException exc) {
        System.out.println("Ошибка ввода-вывода: " + exc);
      }
    }
    else {
      System.out.println("Исходный файл пустой");
    }
  }
}
