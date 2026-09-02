package ENUM;

public class mainEnum {
      public static void main(String[] args) {
          EnumTest  tkb = new EnumTest(Enum.Monday,  "Toán Lý Hoá");
          EnumTest tkb1 = new EnumTest(Enum.Tuesday, "Văn Sử Địa");
          EnumTest tkb2 = new EnumTest(Enum.Wednesday, "Lý Hoá Sinh");
          System.out.println(tkb.toString());
          System.out.println(tkb1.toString());
          System.out.println(tkb2.toString());

      }
}
