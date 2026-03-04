public class LibraryInterfaceDemo {
    public static void main() throws Exception {
        System.out.println(" - - - - - - - - Child - - - - - - - - ");
        LibraryUser kid1 = new KidUser(10, "Kids");
        LibraryUser kid2 = new KidUser(18, "Fiction");
        kid1.registerAccount();
        kid2.registerAccount();
        kid1.requestBook();
        kid2.requestBook();
        System.out.println(" - - - - - - - - Adult - - - - - - - - ");
        LibraryUser adult1 = new KidUser(5, "Kids");
        LibraryUser adult2 = new KidUser(18, "Fiction");
        adult1.registerAccount();
        adult2.registerAccount();
        adult1.requestBook();
        adult2.requestBook();
    }
}
