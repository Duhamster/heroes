public class King extends Unit {
    private static String[] phrases = {
        "Я король в моём королевстве, даже если это — королевство помойных ям",
        "На нудистском пляже трудно понять, кто король, а кто просто голый.",
        "Завтракай, как король! Обедай, как король! Ужинай, как король! И помни, ты не жирный. Ты король!",
        "В стране дураков, умный королём не станет.",
        "Короли знают о делах своих министров не больше, чем рогоносцы о делах своих жен.",
        "Гусь тоже думал, что купается, пока вода не закипела...",
        "Десять раз стрелял. Всё мимо. Тигр умер от смеха.",
            "Создайте ещё более понятный интерфейс, и мир создаст ещё более тупого юзера.",
            "Я шизоид"
    };

    Writter writter;

    public King(String name, Point p, Guard guard) {
        super(name, p);
        this.guard = guard;
    }

    Guard guard;

    public King(String name) {
        super(name);
    }

    public void setWritter(Writter writter) {
        this.writter = writter;
    }

    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    public void saySomething() {
        int randomIndex = (int)Math.floor(Math.random() * phrases.length);
        String text = String.format("%s: %s", getName(), phrases[randomIndex]);
        System.out.println(text);
        if (writter != null) {
            writter.write();
        }
    }

    public void callSecurity() {
        if(guard == null) {
            System.out.println(String.format("%s: Эх..., как жаль, что у меня нет охраны!", getName()));
        }
        else{
            guard.follow(this);
        }
    }
}
