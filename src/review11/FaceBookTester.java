package review11;

public class FaceBookTester {
    public static void main(String[] args) {
        FaceBookUser faceBookUser=
                new FaceBookUser("Hamid",
                        "Bromand",
                        "Hamid123",
                        "pass123");

        faceBookUser.setUserName("HamidJan");

        System.out.println(faceBookUser);
    }
}