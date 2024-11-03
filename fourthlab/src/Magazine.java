public class Magazine implements PoligraphEdition {
    private String title;
    private String periodicity;
    private boolean isOpen;
    private boolean isPaid;

    public Magazine(String title) {
        this.title = title;
        this.isOpen = false;
        this.isPaid = false;
    }

    @Override
    public void makeContract() {
        System.out.println("Оформлено договір на друк журналу '" + title + "'");
    }

    @Override
    public void openEdition() {
        isOpen = true;
        System.out.println("Журнал '" + title + "' відкрито для редагування");
    }

    @Override
    public void editEdition() {
        if (isOpen) {
            System.out.println("Редагування журналу '" + title + "'");
        } else {
            System.out.println("Спочатку відкрийте журнал для редагування");
        }
    }

    @Override
    public void typesetEdition() {
        if (isOpen) {
            System.out.println("Виконується верстка журналу '" + title + "'");
        } else {
            System.out.println("Спочатку відкрийте журнал для верстки");
        }
    }

    @Override
    public void sendToPrint() {
        if (isPaid) {
            System.out.println("Журнал '" + title + "' відправлено на друк");
        } else {
            System.out.println("Спочатку необхідно оплатити друк");
        }
    }

    @Override
    public void cancelEdition() {
        System.out.println("Відмінено друк журналу '" + title + "'");
        isOpen = false;
    }

    @Override
    public void payForEdition() {
        isPaid = true;
        System.out.println("Оплачено друк журналу '" + title + "'");
    }

    @Override
    public void restoreEdition() {
        isOpen = true;
        System.out.println("Відновлено роботу над журналом '" + title + "'");
    }

    @Override
    public void closeEdition() {
        isOpen = false;
        System.out.println("Закрито роботу над журналом '" + title + "'");
    }

    // Спеціалізований метод для Журналу
    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        System.out.println("Встановлено періодичність виходу журналу: " + periodicity);
    }
}