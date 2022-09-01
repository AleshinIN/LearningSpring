package springcourse.alishev.lk8;

import springcourse.alishev.lk4.Music;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Инициализация бина: " + this.getClass());
    }

    public void doMyDestroy() {
        System.out.println("Закрытие бина: " + this.getClass());
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}