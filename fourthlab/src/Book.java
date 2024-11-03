public class Book implements PoligraphEdition {
    private String author;
    private String genre;
    private int pages;
    private String title;
    private boolean isOpen;
    private boolean isPaid;

    public Book(String title) {
        this.title = title;
        this.isOpen = false;
        this.isPaid = false;
    }

    @Override
    public void makeContract() {
        System.out.println("Оформлено договір на друк книги '" + title + "'");
    }

    @Override
    public void openEdition() {
        isOpen = true;
        System.out.println("Книгу '" + title + "' відкрито для редагування");
    }

    @Override
    public void editEdition() {
        if (isOpen) {
            System.out.println("Редагування книги '" + title + "'");
        } else {
            System.out.println("Спочатку відкрийте книгу для редагування");
        }
    }

    @Override
    public void typesetEdition() {
        if (isOpen) {
            System.out.println("Виконується верстка книги '" + title + "'");
        } else {
            System.out.println("Спочатку відкрийте книгу для верстки");
        }
    }

    @Override
    public void sendToPrint() {
        if (isPaid) {
            System.out.println("Книгу '" + title + "' відправлено на друк");
        } else {
            System.out.println("Спочатку необхідно оплатити друк");
        }
    }

    @Override
    public void cancelEdition() {
        System.out.println("Відмінено друк книги '" + title + "'");
        isOpen = false;
    }

    @Override
    public void payForEdition() {
        isPaid = true;
        System.out.println("Оплачено друк книги '" + title + "'");
    }

    @Override
    public void restoreEdition() {
        isOpen = true;
        System.out.println("Відновлено роботу над книгою '" + title + "'");
    }

    @Override
    public void closeEdition() {
        isOpen = false;
        System.out.println("Закрито роботу над книгою '" + title + "'");
    }

    public void setAuthor(String author) {
        this.author = author;
        System.out.println("Встановлено автора книги: " + author);
    }

    public void setGenre(String genre) {
        this.genre = genre;
        System.out.println("Встановлено жанр книги: " + genre);
    }

    public void setPages(int pages) {
        this.pages = pages;
        System.out.println("Встановлено кількість сторінок: " + pages);
    }
}