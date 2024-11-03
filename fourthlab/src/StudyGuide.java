import java.util.ArrayList;
import java.util.List;

public class StudyGuide implements PoligraphEdition {
    private String title;
    private boolean isOpen;
    private boolean isPaid;
    private List<String> sections;

    public StudyGuide(String title) {
        this.title = title;
        this.isOpen = false;
        this.isPaid = false;
        this.sections = new ArrayList<>();
    }

    @Override
    public void makeContract() {
        System.out.println("Оформлено договір на друк навчального посібника '" + title + "'");
    }

    @Override
    public void openEdition() {
        isOpen = true;
        System.out.println("Навчальний посібник '" + title + "' відкрито для редагування");
    }

    @Override
    public void editEdition() {
        if (isOpen) {
            System.out.println("Редагування навчального посібника '" + title + "'");
        } else {
            System.out.println("Спочатку відкрийте посібник для редагування");
        }
    }

    @Override
    public void typesetEdition() {
        if (isOpen) {
            System.out.println("Виконується верстка навчального посібника '" + title + "'");
        } else {
            System.out.println("Спочатку відкрийте посібник для верстки");
        }
    }

    @Override
    public void sendToPrint() {
        if (isPaid) {
            System.out.println("Навчальний посібник '" + title + "' відправлено на друк");
        } else {
            System.out.println("Спочатку необхідно оплатити друк");
        }
    }

    @Override
    public void cancelEdition() {
        System.out.println("Відмінено друк навчального посібника '" + title + "'");
        isOpen = false;
    }

    @Override
    public void payForEdition() {
        isPaid = true;
        System.out.println("Оплачено друк навчального посібника '" + title + "'");
    }

    @Override
    public void restoreEdition() {
        isOpen = true;
        System.out.println("Відновлено роботу над навчальним посібником '" + title + "'");
    }

    @Override
    public void closeEdition() {
        isOpen = false;
        System.out.println("Закрито роботу над навчальним посібником '" + title + "'");
    }

    public void addSection(String section) {
        sections.add(section);
        System.out.println("Додано новий розділ до посібника: " + section);
    }

    public void listSections() {
        System.out.println("Розділи посібника:");
        for (int i = 0; i < sections.size(); i++) {
            System.out.println((i + 1) + ". " + sections.get(i));
        }
    }
}