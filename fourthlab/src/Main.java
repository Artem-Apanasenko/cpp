public class Main {
    public static void main(String[] args) {
        System.out.println("=== Робота з книгою ===");
        Book book = new Book("Пригоди");
        book.makeContract();
        book.setAuthor("Іван Петренко");
        book.setGenre("Пригодницький роман");
        book.setPages(250);
        book.openEdition();
        book.editEdition();
        book.typesetEdition();
        book.payForEdition();
        book.sendToPrint();
        book.closeEdition();

        System.out.println("\n=== Робота з журналом ===");
        Magazine magazine = new Magazine("Наука і життя");
        magazine.makeContract();
        magazine.setPeriodicity("Щомісячний");
        magazine.openEdition();
        magazine.editEdition();
        magazine.cancelEdition();
        magazine.restoreEdition();
        magazine.payForEdition();
        magazine.sendToPrint();
        magazine.closeEdition();

        System.out.println("\n=== Робота з навчальним посібником ===");
        StudyGuide guide = new StudyGuide("Програмування на Java");
        guide.makeContract();
        guide.addSection("Основи Java");
        guide.addSection("Об'єктно-орієнтоване програмування");
        guide.addSection("Інтерфейси та абстрактні класи");
        guide.openEdition();
        guide.listSections();
        guide.editEdition();
        guide.payForEdition();
        guide.sendToPrint();
        guide.closeEdition();
    }
}