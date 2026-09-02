package ENUM;

public class EnumTest {
    private  Enum thu;
    private String cacMonHoc;
    public EnumTest(Enum thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }
    public Enum getThu() {
        return thu;
    }
    public void setThu(Enum thu) {
        this.thu = thu;
    }
    public String getCacMonHoc() {
        return cacMonHoc;
    }
    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "Thời khoa biểu [Thu = " + thu + ", cacMonHoc = " + cacMonHoc + "]";
    }
}
